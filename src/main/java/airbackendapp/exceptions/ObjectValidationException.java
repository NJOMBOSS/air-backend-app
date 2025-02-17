package airbackendapp.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
public class ObjectValidationException extends RuntimeException {
    //  Ensemble des violations de validation.
    private final Set<String> violations;

    //  Source des violations de validation.
    private final String violationSource;

    public ObjectValidationException(Set<String> violations, String violationSource) {
        super(violationSource);
        this.violations = violations;
        this.violationSource = violationSource;
    }
}