package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.annotation.H;
import java.lang.reflect.Method;

/* compiled from: PropertyBasedObjectIdGenerator.java */
/* loaded from: classes4.dex */
public class j extends H.d {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.d f342288c;

    public j(com.fasterxml.jackson.databind.ser.d dVar, Class cls) {
        super(cls);
        this.f342288c = dVar;
    }

    @Override // com.fasterxml.jackson.annotation.H.a, com.fasterxml.jackson.annotation.G
    public final boolean a(G<?> g12) {
        if (g12.getClass() != getClass()) {
            return false;
        }
        j jVar = (j) g12;
        return jVar.d() == this.f340905b && jVar.f342288c == this.f342288c;
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final G<Object> b(Class<?> cls) {
        return cls == this.f340905b ? this : new j(this.f342288c, cls);
    }

    @Override // com.fasterxml.jackson.annotation.G
    public final Object c(Object obj) {
        com.fasterxml.jackson.databind.ser.d dVar = this.f342288c;
        try {
            Method method = dVar.f342244k;
            return method == null ? dVar.f342245l.get(obj) : method.invoke(obj, null);
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception e13) {
            throw new IllegalStateException("Problem accessing property '" + dVar.f342237d.f341186b + "': " + e13.getMessage(), e13);
        }
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
