package com.fasterxml.jackson.databind.type;

/* compiled from: MapType.java */
/* loaded from: classes4.dex */
public final class g extends f {
    private static final long serialVersionUID = 1;

    public g() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return new g(cls, mVar, hVar, hVarArr, this.f342456k, this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        return this.f342457l == hVar ? this : new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVar, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342457l.R(obj);
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342457l.S(iVar);
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    /* renamed from: W */
    public final f N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342457l.R(obj);
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    /* renamed from: X */
    public final f O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342457l.S(iVar);
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    public final f Y(com.fasterxml.jackson.databind.h hVar) {
        if (hVar == this.f342456k) {
            return this;
        }
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar, this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    public final f Z(com.fasterxml.jackson.databind.m mVar) {
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k.S(mVar), this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    /* renamed from: b0 */
    public final f R(Object obj) {
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    /* renamed from: c0 */
    public final f S(Object obj) {
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.f
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final g Q() {
        if (this.f341934f) {
            return this;
        }
        return new g(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k.Q(), this.f342457l.Q(), this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.f, com.fasterxml.jackson.databind.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[map type; class ");
        androidx.compose.ui.graphics.colorspace.e.u(this.f341930b, sb2, ", ");
        sb2.append(this.f342456k);
        sb2.append(" -> ");
        sb2.append(this.f342457l);
        sb2.append("]");
        return sb2.toString();
    }
}
