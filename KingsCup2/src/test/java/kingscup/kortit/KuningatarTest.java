
package kingscup.kortit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;
import static kingscup.logiikka.Sukupuoli.MIES;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eamiller
 */
public class KuningatarTest {
    ByteArrayOutputStream tulosvirta;
    HashMap<String, Pelaaja> pelaajaHash;
    Pelaaja evan;
    
    public KuningatarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tulosvirta = new ByteArrayOutputStream();
        System.setOut(new PrintStream(tulosvirta));
        pelaajaHash = new HashMap<>();
        
        evan = new Pelaaja("Evan", MIES);
        pelaajaHash.put(evan.getNimi(), evan);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void oikeastaHenkilostaQM(){
        String syote = muodosta("Evan");
        Kuningatar kuningatar = new Kuningatar(new Scanner(syote), pelaajaHash);
        kuningatar.suorita();
        assertEquals(kuningatar.getQuestionMaster(), evan);
    }
    
    @Test
    public void kysyyUudestaanJosAnnetaanVaaraNimi(){
        String syote = muodosta("kik","Evan");
        Kortti kuningatar = new Kuningatar(new Scanner(syote), pelaajaHash);
        kuningatar.suorita();
        assertTrue(tulosvirta.toString().contains("?"));
    }

    private String muodosta(String... lines) {
        String linesWithEnter = "";
        for (String line : lines) {
            linesWithEnter += line + "\n";
        }
        return linesWithEnter;
    }
}
