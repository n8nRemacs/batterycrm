package com.fasterxml.jackson.databind.util;

/* compiled from: Converter.java */
/* loaded from: classes4.dex */
public interface i<IN, OUT> {

    /* compiled from: Converter.java */
    public static abstract class a implements i<Object, Object> {
    }

    com.fasterxml.jackson.databind.h a(com.fasterxml.jackson.databind.type.n nVar);

    com.fasterxml.jackson.databind.h b(com.fasterxml.jackson.databind.type.n nVar);

    OUT convert(IN in2);
}
