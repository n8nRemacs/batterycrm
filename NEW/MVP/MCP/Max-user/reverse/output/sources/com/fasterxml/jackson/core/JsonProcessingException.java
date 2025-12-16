package com.fasterxml.jackson.core;

import defpackage.fx7;

/* loaded from: classes.dex */
public class JsonProcessingException extends JacksonException {
    public final fx7 a;

    public JsonProcessingException(String str, fx7 fx7Var, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = fx7Var;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        fx7 fx7Var = this.a;
        if (fx7Var == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (fx7Var != null) {
            sb.append("\n at ");
            sb.append(fx7Var.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
