package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;

/* compiled from: ObjectIdValueProperty.java */
/* loaded from: classes4.dex */
public final class u extends com.fasterxml.jackson.databind.deser.v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final s f341675o;

    public u(s sVar, com.fasterxml.jackson.databind.u uVar) {
        super(sVar.f341667c, sVar.f341666b, uVar, sVar.f341670f);
        this.f341675o = sVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) {
        com.fasterxml.jackson.databind.deser.v vVar = this.f341675o.f341671g;
        if (vVar != null) {
            return vVar.A(obj, obj2);
        }
        throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v B(com.fasterxml.jackson.databind.v vVar) {
        return new u(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v C(com.fasterxml.jackson.databind.deser.s sVar) {
        return new u(this, this.f341899g, sVar);
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
        return new u(this, iVar, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        i(jsonParser, fVar, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        if (jsonParser.Y(JsonToken.VALUE_NULL)) {
            return null;
        }
        Object objE = this.f341899g.e(jsonParser, fVar);
        s sVar = this.f341675o;
        fVar.t(objE, sVar.f341668d, sVar.f341669e).b(obj);
        com.fasterxml.jackson.databind.deser.v vVar = sVar.f341671g;
        return vVar != null ? vVar.A(obj, objE) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) {
        A(obj, obj2);
    }

    public u(u uVar, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar) {
        super(uVar, iVar, sVar);
        this.f341675o = uVar.f341675o;
    }

    public u(u uVar, com.fasterxml.jackson.databind.v vVar) {
        super(uVar, vVar);
        this.f341675o = uVar.f341675o;
    }
}
