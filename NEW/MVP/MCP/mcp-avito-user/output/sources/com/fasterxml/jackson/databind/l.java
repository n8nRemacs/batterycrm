package com.fasterxml.jackson.databind;

import androidx.camera.core.Q;
import com.fasterxml.jackson.core.JsonGenerator;
import uX0.InterfaceC48995d;

/* compiled from: JsonSerializer.java */
/* loaded from: classes4.dex */
public abstract class l<T> implements InterfaceC48995d {

    /* compiled from: JsonSerializer.java */
    public static abstract class a extends l<Object> {
    }

    public Class<T> c() {
        return null;
    }

    public boolean d(A a12, T t12) {
        return t12 == null;
    }

    public boolean e() {
        return this instanceof com.fasterxml.jackson.databind.ser.impl.w;
    }

    public abstract void f(T t12, JsonGenerator jsonGenerator, A a12);

    /* JADX WARN: Multi-variable type inference failed */
    public void g(T t12, JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        Class clsC = c();
        if (clsC == null) {
            clsC = t12.getClass();
        }
        a12.h(clsC, Q.a("Type id handling not implemented for type ", clsC.getName(), " (by serializer of type ", getClass().getName(), ")"));
        throw null;
    }

    public boolean i() {
        return false;
    }

    public l<T> h(com.fasterxml.jackson.databind.util.t tVar) {
        return this;
    }
}
