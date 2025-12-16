package com.fasterxml.jackson.databind.util;

/* compiled from: StdConverter.java */
/* loaded from: classes4.dex */
public abstract class A<IN, OUT> implements i<IN, OUT> {
    @Override // com.fasterxml.jackson.databind.util.i
    public final com.fasterxml.jackson.databind.h a(com.fasterxml.jackson.databind.type.n nVar) {
        return c(nVar).h(0);
    }

    @Override // com.fasterxml.jackson.databind.util.i
    public final com.fasterxml.jackson.databind.h b(com.fasterxml.jackson.databind.type.n nVar) {
        return c(nVar).h(1);
    }

    public final com.fasterxml.jackson.databind.h c(com.fasterxml.jackson.databind.type.n nVar) {
        com.fasterxml.jackson.databind.h hVarL = nVar.l(getClass()).l(i.class);
        if (hVarL == null || hVarL.i() < 2) {
            throw new IllegalStateException("Cannot find OUT type parameter for Converter of type ".concat(getClass().getName()));
        }
        return hVarL;
    }
}
