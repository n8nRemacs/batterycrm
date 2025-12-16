package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;

/* compiled from: CreatorProperty.java */
/* loaded from: classes4.dex */
public class k extends v {
    private static final long serialVersionUID = 1;

    /* renamed from: o, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.introspect.n f341701o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC36434d.a f341702p;

    /* renamed from: q, reason: collision with root package name */
    public v f341703q;

    /* renamed from: r, reason: collision with root package name */
    public final int f341704r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f341705s;

    public k(com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.v vVar2, com.fasterxml.jackson.databind.jsontype.l lVar, InterfaceC36495a interfaceC36495a, com.fasterxml.jackson.databind.introspect.n nVar, int i12, InterfaceC36434d.a aVar, com.fasterxml.jackson.databind.u uVar) {
        super(vVar, hVar, vVar2, lVar, interfaceC36495a, uVar);
        this.f341701o = nVar;
        this.f341704r = i12;
        this.f341702p = aVar;
        this.f341703q = null;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        return this.f341703q.A(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final v B(com.fasterxml.jackson.databind.v vVar) {
        return new k(this, vVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final v C(s sVar) {
        return new k(this, this.f341899g, sVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final v E(com.fasterxml.jackson.databind.i<?> iVar) {
        com.fasterxml.jackson.databind.i<?> iVar2 = this.f341899g;
        if (iVar2 == iVar) {
            return this;
        }
        s sVar = this.f341901i;
        if (iVar2 == sVar) {
            sVar = iVar;
        }
        return new k(this, iVar, sVar);
    }

    public final void F() throws InvalidDefinitionException {
        if (this.f341703q != null) {
            return;
        }
        throw new InvalidDefinitionException(null, "No fallback setter/field defined for creator property " + com.fasterxml.jackson.databind.util.g.z(this.f341896d.f342656b));
    }

    @Override // com.fasterxml.jackson.databind.deser.v, com.fasterxml.jackson.databind.c
    public final AbstractC36471j b() {
        return this.f341701o;
    }

    @Override // com.fasterxml.jackson.databind.introspect.x, com.fasterxml.jackson.databind.c
    public final com.fasterxml.jackson.databind.u getMetadata() {
        v vVar = this.f341703q;
        com.fasterxml.jackson.databind.u uVar = this.f342100b;
        return vVar != null ? uVar.b(vVar.getMetadata().f342519f) : uVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws InvalidDefinitionException {
        F();
        this.f341703q.z(obj, g(jsonParser, fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) throws InvalidDefinitionException {
        F();
        return this.f341703q.A(obj, g(jsonParser, fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) {
        v vVar = this.f341703q;
        if (vVar != null) {
            vVar.l(eVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final int m() {
        return this.f341704r;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final Object o() {
        InterfaceC36434d.a aVar = this.f341702p;
        if (aVar == null) {
            return null;
        }
        return aVar.f340989b;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final String toString() {
        return "[creator property, name " + com.fasterxml.jackson.databind.util.g.z(this.f341896d.f342656b) + "; inject id '" + o() + "']";
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final boolean w() {
        return this.f341705s;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final boolean x() {
        InterfaceC36434d.a aVar = this.f341702p;
        if (aVar != null) {
            Boolean bool = aVar.f340990c;
            if (!(bool == null ? true : bool.booleanValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void y() {
        this.f341705s = true;
    }

    @Override // com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) throws InvalidDefinitionException {
        F();
        this.f341703q.z(obj, obj2);
    }

    public k(k kVar, com.fasterxml.jackson.databind.v vVar) {
        super(kVar, vVar);
        this.f341701o = kVar.f341701o;
        this.f341702p = kVar.f341702p;
        this.f341703q = kVar.f341703q;
        this.f341704r = kVar.f341704r;
        this.f341705s = kVar.f341705s;
    }

    public k(k kVar, com.fasterxml.jackson.databind.i<?> iVar, s sVar) {
        super(kVar, iVar, sVar);
        this.f341701o = kVar.f341701o;
        this.f341702p = kVar.f341702p;
        this.f341703q = kVar.f341703q;
        this.f341704r = kVar.f341704r;
        this.f341705s = kVar.f341705s;
    }
}
