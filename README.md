# Enkriptimi dhe Dekriptimi me Beaufort Cipher dhe Diagonal Transposition Cipher - SDH25

Ky projekt lejon përdoruesit të enkriptojnë dhe dekriptojnë mesazhe duke përdorur:
- **Beaufort Cipher**, një cipher simetrik i bazuar në cipher-in Vigenère, dhe
- **Diagonal Transposition Cipher**, një cipher transpozicioni kolonash që riorganizon shkronjat në një model të caktuar.

## Karakteristikat

- **Beaufort CiPher**:
  - Enkripton dhe dekripton mesazhe duke përdorur një çelës.
  - Karakteret jo-shkronja (si hapësirat dhe pikat) mbeten të pandryshuara.

- **Diagonal Transposition Cipher-i**:
   - Enkriptimi bëhet duke shkruar mesazhin në një matricë dhe duke lexuar diagonalisht nga majtas-lart në djathtas-poshtë.
   - Dekriptimi bëhet duke rikrijuar matricën nga teksti i enkriptuar dhe lexuar përsëri rresht pas rreshti dhe kolonë pas kolone.



## Si ta përdorni

1. Klononi repository-n ose kopjoni files Java në projektin tuaj.
2. Kompiloni files dhe ekzekutoni klasën `Main` për të përdorur aplikacionin.
3. Përdorni opsionet në menu për të enkriptuar dhe dekriptuar mesazhe sipas cipher-it që dëshironi.

## Beaufort Cipher

## ENKRIPTIMI

  Përdorimi

1. Jepni mesazhin që dëshironi të enkriptoni.
2. Jepni çelësin (fjalën kyçe).
3. Programi kthen tekstin e enkriptuar.

  Si funksionon

- Teksti i qartë konvertohet në shkronja të mëdha.
- Nëse çelësi është më i shkurtër se mesazhi, ai **ripërsëritet automatikisht**.
- Aplikohet formula:
                    C = (K - P) mod 26
- ku:
  - `C` = shkronja e koduar  
  - `K` = shkronja e çelësit  
  - `P` = shkronja e mesazhit fillestarë
  
## DEKRIPTIMI

  Përdorimi

1. Jepni tekstin e enkriptuar.
2. Jepni të njëjtin çelës që është përdorur gjatë enkriptimit.
3. Programi kthen mesazhin origjinal.

  Si funksionon

- Çelësi ripërsëritet për të përputhur gjatësinë e mesazhit.
- Aplikohet e njëjta formulë për të kthyer tekstin në gjendjen fillestare:
                    P = (K - C) mod 26
- Teksti i dekoduar përbën mesazhin origjinal.

Rezultati për enkriptim:

![image](https://github.com/user-attachments/assets/f19caa79-44c5-45d2-bf72-18ad402eab3c)

Rezultati per dekriptim:

![image](https://github.com/user-attachments/assets/1ed986e8-c776-4365-9089-4c9620dce92b)

  
# Diagonal Transposition Cipher

## ENKRIPTIMI 

 Përdorimi

1. Shkruani mesazhin që dëshironi të enkriptoni.  
2. Jepni numrin e kolonave për matricën e enkriptimit.  
3. Programi do të kthejë tekstin e enkriptuar.  

 Si Funksionon

- Teksti i qartë konvertohet në shkronja të mëdha dhe krijohet një matricë karakteresh me numrin e specifikuar të kolonave. Nëse matrica nuk mbushet plotësisht, ajo mbushet me karakterin ‘X’.  
- Teksti i enkriptuar formohet duke lexuar karakteret nga matrica në mënyrë diagonale, duke filluar nga këndi sipërmajtas dhe lëvizur drejt këndit poshtëdjathtas.

## DEKRIPTIMI

 Përdorimi

1. Shkruani mesazhin e enkriptuar që dëshironi të dekriptoni.  
2. Jepni numrin e kolonave për matricën e enkriptimit (i njëjti numër që është përdorur gjatë enkriptimit).  
3. Programi do të kthejë tekstin e dekriptuar (mesazhin origjinal të qartë).  

 Si Funksionon

- Teksti i enkriptuar vendoset përsëri në matricë duke e mbushur atë sipas të njëjtit model transpozicioni diagonal që u përdor gjatë enkriptimit.  
- Pasi matrica mbushet, karakteret lexohen rresht pas rreshti për të rindërtuar mesazhin origjinal.  
- Çdo karakter mbushës ‘X’ i shtuar gjatë enkriptimit hiqet nga fundi i mesazhit për të zbuluar tekstin origjinal të qartë.

Rezultati për enkriptim:

![image](https://github.com/user-attachments/assets/812080e0-7bc9-42d8-bc9a-2f83b4800d17)

Rezultati per dekriptim:

![image](https://github.com/user-attachments/assets/6f6bef7a-0752-4c6f-9cbc-766b2cebb52c)

