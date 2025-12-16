package com.fasterxml.jackson.databind.deser.std;

import androidx.camera.core.Q;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.x;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ContainerDeserializerBase.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36455i<T> extends C<T> implements x.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f341784e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.s f341785f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f341786g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f341787h;

    public AbstractC36455i() {
        throw null;
    }

    public AbstractC36455i(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(hVar);
        this.f341784e = hVar;
        this.f341787h = bool;
        this.f341785f = sVar;
        this.f341786g = com.fasterxml.jackson.databind.deser.impl.q.a(sVar);
    }

    public static void r0(com.fasterxml.jackson.databind.f fVar, Exception exc, Object obj, String str) throws IOException {
        Exception cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        com.fasterxml.jackson.databind.util.g.D(cause);
        if (fVar != null && !fVar.O(DeserializationFeature.WRAP_EXCEPTIONS)) {
            com.fasterxml.jackson.databind.util.g.F(cause);
        }
        if ((cause instanceof IOException) && !(cause instanceof JsonMappingException)) {
            throw ((IOException) cause);
        }
        if (str == null) {
            str = "N/A";
        }
        int i12 = JsonMappingException.f341373e;
        throw JsonMappingException.h(cause, new JsonMappingException.a(obj, str));
    }

    @Override // com.fasterxml.jackson.databind.i
    public final com.fasterxml.jackson.databind.deser.v i(String str) {
        com.fasterxml.jackson.databind.i<Object> iVarQ0 = q0();
        if (iVarQ0 != null) {
            return iVarQ0.i(str);
        }
        throw new IllegalArgumentException(Q.a("Cannot handle managed/back reference '", str, "': type: container deserializer of type ", getClass().getName(), " returned null for 'getContentDeserializer()'"));
    }

    @Override // com.fasterxml.jackson.databind.i
    public AccessPattern k() {
        return AccessPattern.f342526d;
    }

    @Override // com.fasterxml.jackson.databind.i
    public Object l(com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
        com.fasterxml.jackson.databind.deser.x xVarL0 = l0();
        if (xVarL0 == null || !xVarL0.k()) {
            fVar.i(String.format("Cannot create empty instance of %s, no default Creator", m0()));
            throw null;
        }
        try {
            return xVarL0.y(fVar);
        } catch (IOException e12) {
            com.fasterxml.jackson.databind.util.g.C(fVar, e12);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C
    public com.fasterxml.jackson.databind.h m0() {
        return this.f341784e;
    }

    public abstract com.fasterxml.jackson.databind.i<Object> q0();

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    public AbstractC36455i(AbstractC36455i<?> abstractC36455i, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(abstractC36455i.f341784e);
        this.f341784e = abstractC36455i.f341784e;
        this.f341785f = sVar;
        this.f341787h = bool;
        this.f341786g = com.fasterxml.jackson.databind.deser.impl.q.a(sVar);
    }
}
