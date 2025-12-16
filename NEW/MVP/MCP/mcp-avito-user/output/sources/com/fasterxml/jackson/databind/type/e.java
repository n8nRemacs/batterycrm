package com.fasterxml.jackson.databind.type;

/* compiled from: CollectionType.java */
/* loaded from: classes4.dex */
public final class e extends d {
    private static final long serialVersionUID = 1;

    public e() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return new e(cls, mVar, hVar, hVarArr, this.f342455k, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        return this.f342455k == hVar ? this : new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342455k.R(obj);
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342455k.S(iVar);
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d
    /* renamed from: W */
    public final d N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342455k.R(obj);
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d
    /* renamed from: X */
    public final d O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342455k.S(iVar);
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d
    /* renamed from: Z */
    public final d R(Object obj) {
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d
    /* renamed from: a0 */
    public final d S(Object obj) {
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final e Q() {
        if (this.f341934f) {
            return this;
        }
        return new e(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k.Q(), this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.type.d, com.fasterxml.jackson.databind.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[collection type; class ");
        androidx.compose.ui.graphics.colorspace.e.u(this.f341930b, sb2, ", contains ");
        sb2.append(this.f342455k);
        sb2.append("]");
        return sb2.toString();
    }
}
