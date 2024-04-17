package ch.emf.atelierpo.wrk;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class Worker {

    /**
     * Vérifie si une plaque d'immatriculation de voiture suisse est
     * valide en fonction du canton et du numéro de plaque fournis.
     * Les seuls caractères autorisés sont les caractères alphabétiques de A à Z
     * (MAJUSCULE) pour le canton et
     * des chiffres pour le numéro de plaque.
     * 
     * Pour que le canton soit valide, il doit contenir au moins un des ces cas :
     * "AG, AI, AR, BE, BL, BS, FR, GE, GL, GR, JU, LU, NE, NW, OW, SG, SH, SO, SZ,
     * TG, TI, UR, VD, VS, ZG, ZH"
     * 
     * Comportement souhaité :
     * 
     * canton numeroPlaque résultat souhaité
     * "FR"     "12"        true
     * "VD2333" "33"        false
     * "Fr"     "12345"     false
     * "HP"     "13333"     false
     * 
     *
     * @param canton       Le canton de la plaque d'immatriculation, représenté par
     *                     une chaîne de caractères ne contenant que des lettres de
     *                     A à Z.
     * @param numeroPlaque Le numéro de plaque d'immatriculation, représenté par une
     *                     chaîne de caractères ne contenant que des chiffres.
     * @return true si la plaque d'immatriculation est valide, false sinon.
     */
    public boolean controlePlaqueImmatriculation(String canton, String numeroPlaque) {
        return false;
    }

}
