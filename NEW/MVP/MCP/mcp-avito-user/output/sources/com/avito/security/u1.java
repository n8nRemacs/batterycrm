package com.avito.security;

/* loaded from: classes5.dex */
public class u1 {
    public String a(c1 c1Var) {
        return a((t0) c1Var);
    }

    public String a(t0 t0Var) {
        String string = t0Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
