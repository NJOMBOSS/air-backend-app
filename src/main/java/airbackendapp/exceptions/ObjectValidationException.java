package tech.fonke.airbackendapp.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Getter
public class ObjectValidationException extends RuntimeException{

    //  Ensemble des violations de validation.
    private final Set<String> violations;

    //  Source des violations de validation.
    private final String violationSource;
}
