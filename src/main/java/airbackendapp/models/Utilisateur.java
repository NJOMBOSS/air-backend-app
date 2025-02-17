package airbackendapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

    private String nom;

    private String prenom;

    private LocalDate dateNaissance;

    private String email;

    private String motDePasse;

    private String numeroTelephone;

    private String photo;
}
