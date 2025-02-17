package airbackendapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UtilisateurDTO {

    private Integer id;

    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    private String email;

    private String motDePasse;

    private String numeroTelephone;

    private String photo;
}
