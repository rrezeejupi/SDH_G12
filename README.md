# Enkriptimi dhe Dekriptimi me Beaufort Cipher dhe Diagonal Transposition Cipher - SDH25

Ky projekt implementon dy teknika klasike të enkriptimit:
1. Beaufort Cipher
2. Diagonal Transposition Cipher

Ofron funksionalitete për enkriptimin dhe dekriptimin për secilin cipher.

## Përshkrimi

Ky projekt lejon përdoruesit të enkriptojnë dhe dekriptojnë mesazhe duke përdorur:
- **Beaufort Cipher**, një cipher simetrik i bazuar në cipher-in Vigenère, dhe
- **Diagonal Transposition Cipher**, një cipher transpozicioni kolonash që riorganizon shkronjat në një model të caktuar.

## Karakteristikat

- **Beaufort Cioher**:
  - Enkripton dhe dekripton mesazhe duke përdorur një çelës.
  - Karakteret jo-shkronja (si hapësirat dhe pikat) mbeten të pandryshuara.

- **Diagonal Transposition Cipher-i**:


## Si ta përdorni

1. Klononi repository-n ose kopjoni files Java në projektin tuaj.
2. Kompiloni files dhe ekzekutoni klasën `Main` për të përdorur aplikacionin.
3. Përdorni opsionet në menu për të enkriptuar dhe dekriptuar mesazhe sipas cipher-it që dëshironi.

### Cipher-i Beaufort

Formula kryesore që përdoret është:

**C = K - P mod 26**,  
ku **C** është shkronja e koduar, **K** është shkronja e çelësit, dhe **P** është shkronja e mesazhit fillestar.

Çdo shkronjë e mesazhit është enkriptuar duke përdorur shkronjën përkatëse të çelësit, duke krijuar një tekst të koduar (ciphertext). Ky proces mund të kthehet prapa përmes dekriptimit duke përdorur të njëjtin çelës.

Në këtë mënyrë, mesazhet janë të sigurta dhe mund të dekriptohen vetëm nga ata që kanë çelësin e saktë.
