package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36469h;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import java.lang.reflect.Field;

/* compiled from: FieldProperty.java */
/* loaded from: classes4.dex */
public final class i extends com.fasterxml.jackson.databind.deser.v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final C36469h f341643o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Field f341644p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f341645q;

    public i(com.fasterxml.jackson.databind.introspect.u uVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a, C36469h c36469h) {
        super(uVar, hVar, lVar, interfaceC36495a);
        this.f341643o = c36469h;
        this.f341644p = c36469h.f342042d;
        this.f341645q = q.a(this.f341901i);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        try {
            this.f341644p.set(obj, obj2);
            return obj;
        } catch (Exception e12) {
            a(null, e12, obj2);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v B(com.fasterxml.jackson.databind.v vVar) {
        return new i(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v C(com.fasterxml.jackson.databind.deser.s sVar) {
        return new i(this, this.f341899g, sVar);
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
        return new i(this, iVar, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f341643o;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        Object objG;
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        com.fasterxml.jackson.databind.deser.s sVar = this.f341901i;
        boolean z12 = this.f341645q;
        if (!zY2) {
            com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
            com.fasterxml.jackson.databind.jsontype.l lVar = this.f341900h;
            if (lVar == null) {
                Object objE = iVar.e(jsonParser, fVar);
                if (objE != null) {
                    objG = objE;
                } else if (z12) {
                    return;
                } else {
                    objG = sVar.d(fVar);
                }
            } else {
                objG = iVar.g(jsonParser, fVar, lVar);
            }
        } else if (z12) {
            return;
        } else {
            objG = sVar.d(fVar);
        }
        try {
            this.f341644p.set(obj, objG);
        } catch (Exception e12) {
            a(jsonParser, e12, objG);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        Object objG;
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        com.fasterxml.jackson.databind.deser.s sVar = this.f341901i;
        boolean z12 = this.f341645q;
        if (!zY2) {
            com.fasterxml.jackson.databind.i<Object> iVar = this.f341899g;
            com.fasterxml.jackson.databind.jsontype.l lVar = this.f341900h;
            if (lVar == null) {
                Object objE = iVar.e(jsonParser, fVar);
                if (objE != null) {
                    objG = objE;
                } else {
                    if (z12) {
                        return obj;
                    }
                    objG = sVar.d(fVar);
                }
            } else {
                objG = iVar.g(jsonParser, fVar, lVar);
            }
        } else {
            if (z12) {
                return obj;
            }
            objG = sVar.d(fVar);
        }
        try {
            this.f341644p.set(obj, objG);
            return obj;
        } catch (Exception e12) {
            a(jsonParser, e12, objG);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) throws SecurityException {
        com.fasterxml.jackson.databind.util.g.e(this.f341644p, eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        return new i(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException {
        try {
            this.f341644p.set(obj, obj2);
        } catch (Exception e12) {
            a(null, e12, obj2);
            throw null;
        }
    }

    public i(i iVar, com.fasterxml.jackson.databind.i<?> iVar2, com.fasterxml.jackson.databind.deser.s sVar) {
        super(iVar, iVar2, sVar);
        this.f341643o = iVar.f341643o;
        this.f341644p = iVar.f341644p;
        this.f341645q = q.a(sVar);
    }

    public i(i iVar, com.fasterxml.jackson.databind.v vVar) {
        super(iVar, vVar);
        this.f341643o = iVar.f341643o;
        this.f341644p = iVar.f341644p;
        this.f341645q = iVar.f341645q;
    }

    public i(i iVar) {
        super(iVar);
        C36469h c36469h = iVar.f341643o;
        this.f341643o = c36469h;
        Field field = c36469h.f342042d;
        if (field != null) {
            this.f341644p = field;
            this.f341645q = iVar.f341645q;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }
}
