package com.fasterxml.jackson.databind.type;

/* compiled from: CollectionLikeType.java */
/* loaded from: classes4.dex */
public class d extends l {
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342455k;

    public d(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr, com.fasterxml.jackson.databind.h hVar2, Object obj, Object obj2, boolean z12) {
        super(cls, mVar, hVar, hVarArr, hVar2.f341931c, obj, obj2, z12);
        this.f342455k = hVar2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return new d(cls, mVar, hVar, hVarArr, this.f342455k, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        if (this.f342455k == hVar) {
            return this;
        }
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h P(com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.h hVar2;
        com.fasterxml.jackson.databind.h hVarP;
        com.fasterxml.jackson.databind.h hVarP2 = super.P(hVar);
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        return (hVarN == null || (hVarP = (hVar2 = this.f342455k).P(hVarN)) == hVar2) ? hVarP2 : hVarP2.L(hVarP);
    }

    @Override // com.fasterxml.jackson.databind.type.l
    public final String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341930b.getName());
        com.fasterxml.jackson.databind.h hVar = this.f342455k;
        if (hVar != null && U(1)) {
            sb2.append('<');
            sb2.append(hVar.g());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public d N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342455k.R(obj);
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public d O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342455k.S(iVar);
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public d Q() {
        if (this.f341934f) {
            return this;
        }
        com.fasterxml.jackson.databind.h hVarQ = this.f342455k.Q();
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVarQ, this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public d R(Object obj) {
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public d S(Object obj) {
        return new d(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342455k, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f341930b == dVar.f341930b && this.f342455k.equals(dVar.f342455k);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h n() {
        return this.f342455k;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder o(StringBuilder sb2) {
        l.T(this.f341930b, sb2, true);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder p(StringBuilder sb2) {
        l.T(this.f341930b, sb2, false);
        sb2.append('<');
        this.f342455k.p(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[collection-like type; class ");
        androidx.compose.ui.graphics.colorspace.e.u(this.f341930b, sb2, ", contains ");
        sb2.append(this.f342455k);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean w() {
        return super.w() || this.f342455k.w();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean z() {
        return true;
    }
}
