package airbackendapp.mapper;

import airbackendapp.dto.UtilisateurDTO;
import airbackendapp.models.Utilisateur;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper pour la conversion entre l'entité {@link Utilisateur} et {@link UtilisateurDTO}.
 * Ce mapper utilise MapStruct pour automatiser les conversions entre les objets de domaine et les DTOs.
 */
@Mapper(componentModel = "spring")
public interface UtilisateurMapper {

    /**
     * Convertit une entité Utilisateur en UtilisateurDTO.
     *
     * @param utilisateur l'entité à convertir
     * @return le DTO correspondant à l'entité
     */
    UtilisateurDTO mapUtilisateurDTO(Utilisateur utilisateur);


    /**
     * Convertit un UtilisateurDTO en entité Utilisateur.
     *
     * @param utilisateurDTO le DTO à convertir
     * @return l'entité correspondante au DTO
     */
    Utilisateur mapUtilisateur(UtilisateurDTO utilisateurDTO);


    /**
     * Convertit une liste d'entités Utilisateur en liste de DTOs.
     *
     * @param utilisateurs la liste d'entités à convertir
     * @return la liste des DTOs correspondants
     */
    List<UtilisateurDTO> mapListUtilisateurDTO(List<Utilisateur> utilisateurs);


    /**
     * Convertit une liste de DTOs en liste d'entités Utilisateur.
     *
     * @param utilisateurDTOs la liste de DTOs à convertir
     * @return la liste des entités correspondantes
     */
    List<Utilisateur> mapListUtilisateur(List<UtilisateurDTO> utilisateurDTOs);
}
