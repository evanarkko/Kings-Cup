RAKENNEKUVAUS

HUOM. Pelissä käytetään sekä graafista, että tekstuaalista käyttöliittymää.

Peli lähtee käyntiin main-metodin luodessa Peli-olion ja käynnistäessä tämän aloitaPeli()-metodin.
Peli-luokka lisää pelin pelaajat käyttäjän syötteen mukaan ja luo kaikki Kortti-oliot sekä Korttipakan näillä korteilla.
Pelaajat syötetään ennen korttipakan luomista, sillä osan korteista on tiedettävä, ketkä pelaavat. Korttipakka pitää
kirjaa, kuinka monta kutakin korttia on jäljellä. Pienellä modifikoinnilla voi peliin saada pakanlisäys-toiminnon.
Siihen tarkoitukseen on Korttipakka-luokassa metodi.

   Lopuksi Peli luo Pelilaudan. Pelilauta luo Korttinapit ja Pelaajanapit, mitkä näkyvät Pelilaudan
käyttöliittymänäkymässä. Varsinainen peli on nyt käynnissä. Pelaajanapin painaminen avaa tämän pelaajan 
tuntevan Pelaajaikkunan (GUI), joka kertoo pelaajan tiedot ja tarjoaa Juo-toiminnallisuuden kyseiselle pelaajalle.
Korttinapin painaminen avaa kortin toiminnallisuuden tekstuaaliseen käyttöliittymään.
Usein toiminnallisuus vaatii käyttäjältä jotakin syötettä ennen kuin on mahdollista jatkaa peliä.
