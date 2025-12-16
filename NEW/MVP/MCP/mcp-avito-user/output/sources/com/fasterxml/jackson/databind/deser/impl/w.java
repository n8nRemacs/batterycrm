package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.H;

/* compiled from: PropertyBasedObjectIdGenerator.java */
/* loaded from: classes4.dex */
public class w extends H.d {
    private static final long serialVersionUID = 1;

    public w() {
        throw null;
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final G<Object> b(Class<?> cls) {
        return cls == this.f340905b ? this : new w(cls);
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final G.a e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new G.a(getClass(), this.f340905b, obj);
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final G f() {
        return this;
    }
}
