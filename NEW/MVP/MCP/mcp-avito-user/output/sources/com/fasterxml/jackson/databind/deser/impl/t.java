package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.z;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;

/* compiled from: ObjectIdReferenceProperty.java */
/* loaded from: classes4.dex */
public class t extends com.fasterxml.jackson.databind.deser.v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v f341672o;

    /* compiled from: ObjectIdReferenceProperty.java */
    public static final class a extends z.a {

        /* renamed from: b, reason: collision with root package name */
        public final t f341673b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f341674c;

        public a(t tVar, UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            super(unresolvedForwardReference);
            this.f341673b = tVar;
            this.f341674c = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.z.a
        public final void a(Object obj, Object obj2) {
            if (obj.equals(this.f341700a.f341520f.f341697b.f340903d)) {
                this.f341673b.z(this.f341674c, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public t(com.fasterxml.jackson.databind.deser.v vVar, com.fasterxml.jackson.databind.introspect.D d12) {
        super(vVar);
        this.f341672o = vVar;
        this.f341903k = d12;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) {
        return this.f341672o.A(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v B(com.fasterxml.jackson.databind.v vVar) {
        return new t(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final com.fasterxml.jackson.databind.deser.v C(com.fasterxml.jackson.databind.deser.s sVar) {
        return new t(this, this.f341899g, sVar);
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
        return new t(this, iVar, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f341672o.b();
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        i(jsonParser, fVar, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        try {
            return this.f341672o.A(obj, g(jsonParser, fVar));
        } catch (UnresolvedForwardReference e12) {
            if (this.f341903k == null && this.f341899g.n() == null) {
                throw new JsonMappingException(jsonParser, "Unresolved forward reference but no identity info", e12);
            }
            Class<?> cls = this.f341897e.f341930b;
            e12.f341520f.a(new a(this, e12, obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) {
        com.fasterxml.jackson.databind.deser.v vVar = this.f341672o;
        if (vVar != null) {
            vVar.l(eVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final int m() {
        return this.f341672o.m();
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) {
        this.f341672o.z(obj, obj2);
    }

    public t(t tVar, com.fasterxml.jackson.databind.i<?> iVar, com.fasterxml.jackson.databind.deser.s sVar) {
        super(tVar, iVar, sVar);
        this.f341672o = tVar.f341672o;
        this.f341903k = tVar.f341903k;
    }

    public t(t tVar, com.fasterxml.jackson.databind.v vVar) {
        super(tVar, vVar);
        this.f341672o = tVar.f341672o;
        this.f341903k = tVar.f341903k;
    }
}
