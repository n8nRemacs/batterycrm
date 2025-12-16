package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36472k;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: SetterlessProperty.java */
/* loaded from: classes4.dex */
public final class A extends com.fasterxml.jackson.databind.deser.v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final C36472k f341589o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f341590p;

    public A(com.fasterxml.jackson.databind.introspect.u uVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a, C36472k c36472k) {
        super(uVar, hVar, lVar, interfaceC36495a);
        this.f341589o = c36472k;
        this.f341590p = c36472k.f342054e;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) {
        z(obj, obj2);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v B(com.fasterxml.jackson.databind.v vVar) {
        return new A(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v C(com.fasterxml.jackson.databind.deser.s sVar) {
        return new A(this, this.f341899g, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v E(com.fasterxml.jackson.databind.i<?> iVar) {
        com.fasterxml.jackson.databind.i<?> iVar2 = this.f341899g;
        if (iVar2 == iVar) {
            return this;
        }
        com.fasterxml.jackson.databind.deser.s sVar = this.f341901i;
        if (iVar2 == sVar) {
            sVar = iVar;
        }
        return new A(this, iVar, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f341589o;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        if (jsonParser.Y(JsonToken.VALUE_NULL)) {
            return;
        }
        com.fasterxml.jackson.databind.jsontype.l lVar = this.f341900h;
        com.fasterxml.jackson.databind.v vVar = this.f341896d;
        if (lVar != null) {
            fVar.i("Problem deserializing 'setterless' property (\"" + vVar.f342656b + "\"): no way to handle typed deser with setterless yet");
            throw null;
        }
        try {
            Object objInvoke = this.f341590p.invoke(obj, null);
            if (objInvoke != null) {
                this.f341899g.f(jsonParser, fVar, objInvoke);
                return;
            }
            fVar.i("Problem deserializing 'setterless' property '" + vVar.f342656b + "': get method returned null");
            throw null;
        } catch (Exception e12) {
            com.fasterxml.jackson.databind.util.g.E(e12);
            com.fasterxml.jackson.databind.util.g.F(e12);
            Throwable thS = com.fasterxml.jackson.databind.util.g.s(e12);
            throw new JsonMappingException(jsonParser, com.fasterxml.jackson.databind.util.g.i(thS), thS);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        h(jsonParser, fVar, obj);
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) throws SecurityException {
        this.f341589o.g(eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) {
        throw new UnsupportedOperationException(AK.c.s(new StringBuilder("Should never call `set()` on setterless property ('"), this.f341896d.f342656b, "')"));
    }

    public A(A a12, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar) {
        super(a12, iVar, sVar);
        this.f341589o = a12.f341589o;
        this.f341590p = a12.f341590p;
    }

    public A(A a12, com.fasterxml.jackson.databind.v vVar) {
        super(a12, vVar);
        this.f341589o = a12.f341589o;
        this.f341590p = a12.f341590p;
    }
}
