LordOfTheRings
==============
Odbrana sela

Malo selo u podnožju Maglenih planina se nalazi pod stalnim napadom orka koji se kote u vrhovima planina. Međutim, populaciji sela ide u korist to što najbliži prolaz između sela i planina prolazi kroz jako uzak tunel.

Kako bi što bolje isplanirali odbranu, seljani su unajmili IT eksperta (vas) da naprave kompjutersku simulaciju iz koje bi vidjeli koliko orka jedan heroj može vlastoručno pobijedeti.

Ponekad u borbu uleti i pokoji goblin, ali oni su generalno mnogo manja napast od orka.

Poznate informacije

Heroj, orci i eventulani goblin se međusobno napadaju do smrti. Svaki od njih, dakle, može da napada i prima tuđi napad, sve dok su živi. Od seljana znamo sljedeće činjenice:

Orci napadaju snagom 5
Orci nemaju kvalitetan oklop, tako da sav napad primaju u potpunosti
Orci imaju 10 poena životne energije (tj. ako prime jedan udarac snage 10, ili dva udarca snage 5, umiru)
Goblini napadaju snagom 3
Goblini koji se provuku su slabe tjelesne konstrukcije, tako da napad primaju s duplom štetom
Goblini imaju 3 poena životne energije
Seljane interesuje od kolike pomoći bi im bio patuljak koji se ponudio da brani selo: Obrim, sin Agammov.

Obrimova sjekira nanosi 9 poena štete
Obrim ima oklop koji poništava svaka 2 poena napada
Obrim ima 30 poena životne energije
Pošto se borba odvija u uskom tunelu, napad na selo čini mnoštvo duela između Obrima i orka sve dok Obrim ne strada ili nema više orka.

Pravljenje simulatora

Napravite interface GameObject. Ovaj interfejs treba da deklariše tri metode:

boolean isAlive() — ova metoda vraća true ako je objekat još uvijek živ (tj. ako ima pozitivan broj životne energije).
void attack(GameObject other) — klasa koja implementira ovu metodu određuje kojom snagom trenutni objekat napada objekat other tako što na objektu other koji je proslijeđen kao parametar poziva metodu handleAttack.
void handleAttack(int attackStrength) — klasa koja implementira ovu metodu određuje kako napad treba biti "primljen". Naprimjer, orci nemaju oklop tako da se njihova "životna energija" smanjuje za vrijednost attackStrength, dok Obrim ima oklop koji poništava 2 poena jačine napada.
Napravite klasu Dwarf koja implementira interface GameObject i zadovoljava sva pravila iz postavke. Pored toga dodajte i metodu toString() koja ispisuje informacije o objektu (ime i trenutnu životnu energiju).

Napravite klasu Orc koja implementira interface GameObject i zadovoljava sva pravila iz postavke. Pored toga dodajte i metodu toString() koja ispisuje naziv klase i trenutnu životnu energiju.
U prilogu je data klasa Duel koja koristi interface GameObject da simulira duel. Napravite klasu TunnelFight sa static main() metodom koja pravi niz objekata klase Orc i jednog heroja patuljka. Kreirajte duele između heroja i orkova sve dok je patuljak živi ili dok ima dovoljno živih orka u napadu.
Od koliko najviše orka patuljak Obrim može odbraniti selo? (Testirajte program s različitim brojem orka u nizu napadača)
U niz napadača dodajte i jednog Goblina. Pošto imamo samo jednog goblina, implementirajte ga kao anonimnu klasu unutar TunnelFight klase. Da li pristutsvo goblina mijenja ishod borbe?
Napomene

Kada budete dodavali goblina u niz, morate se osigurati da je osnovni tip elemenata niza interface GameObject, a ne klasa Orc.
