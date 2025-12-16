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

/* compiled from: MethodProperty.java */
/* loaded from: classes4.dex */
public final class o extends com.fasterxml.jackson.databind.deser.v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final C36472k f341658o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Method f341659p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f341660q;

    public o(com.fasterxml.jackson.databind.introspect.u uVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a, C36472k c36472k) {
        super(uVar, hVar, lVar, interfaceC36495a);
        this.f341658o = c36472k;
        this.f341659p = c36472k.f342054e;
        this.f341660q = q.a(this.f341901i);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.f341659p.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e12) {
            a(null, e12, obj2);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v B(com.fasterxml.jackson.databind.v vVar) {
        return new o(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v C(com.fasterxml.jackson.databind.deser.s sVar) {
        return new o(this, this.f341899g, sVar);
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
        return new o(this, iVar, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f341658o;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        Object objG;
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        com.fasterxml.jackson.databind.deser.s sVar = this.f341901i;
        boolean z12 = this.f341660q;
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
            this.f341659p.invoke(obj, objG);
        } catch (Exception e12) {
            a(jsonParser, e12, objG);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        Object objG;
        boolean zY2 = jsonParser.Y(JsonToken.VALUE_NULL);
        com.fasterxml.jackson.databind.deser.s sVar = this.f341901i;
        boolean z12 = this.f341660q;
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
            Object objInvoke = this.f341659p.invoke(obj, objG);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e12) {
            a(jsonParser, e12, objG);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) throws SecurityException {
        this.f341658o.g(eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        return new o(this, this.f341658o.f342054e);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) throws IllegalAccessException, JsonMappingException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f341659p.invoke(obj, obj2);
        } catch (Exception e12) {
            a(null, e12, obj2);
            throw null;
        }
    }

    public o(o oVar, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar) {
        super(oVar, iVar, sVar);
        this.f341658o = oVar.f341658o;
        this.f341659p = oVar.f341659p;
        this.f341660q = q.a(sVar);
    }

    public o(o oVar, com.fasterxml.jackson.databind.v vVar) {
        super(oVar, vVar);
        this.f341658o = oVar.f341658o;
        this.f341659p = oVar.f341659p;
        this.f341660q = oVar.f341660q;
    }

    public o(o oVar, Method method) {
        super(oVar);
        this.f341658o = oVar.f341658o;
        this.f341659p = method;
        this.f341660q = oVar.f341660q;
    }
}
