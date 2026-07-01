package org.rodrigolunus.generalshoppe.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private static final long serialVersionUID = 1L;

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String message, long timestamp) {
        super(status, message, timestamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String mensagem) {
        errors.add(new FieldMessage(fieldName, mensagem));
    }
}
