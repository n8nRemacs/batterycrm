package com.fasterxml.jackson.databind.type;

/* compiled from: MapLikeType.java */
/* loaded from: classes4.dex */
public class f extends l {
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342456k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342457l;

    public f(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr, com.fasterxml.jackson.databind.h hVar2, com.fasterxml.jackson.databind.h hVar3, Object obj, Object obj2, boolean z12) {
        super(cls, mVar, hVar, hVarArr, hVar2.f341931c ^ hVar3.f341931c, obj, obj2, z12);
        this.f342456k = hVar2;
        this.f342457l = hVar3;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean G() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return new f(cls, mVar, hVar, hVarArr, this.f342456k, this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        if (this.f342457l == hVar) {
            return this;
        }
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVar, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h P(com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.h hVar2;
        com.fasterxml.jackson.databind.h hVarP;
        com.fasterxml.jackson.databind.h hVar3;
        com.fasterxml.jackson.databind.h hVarP2;
        com.fasterxml.jackson.databind.h hVarP3 = super.P(hVar);
        com.fasterxml.jackson.databind.h hVarR = hVar.r();
        if ((hVarP3 instanceof f) && hVarR != null && (hVarP2 = (hVar3 = this.f342456k).P(hVarR)) != hVar3) {
            hVarP3 = ((f) hVarP3).Y(hVarP2);
        }
        com.fasterxml.jackson.databind.h hVarN = hVar.n();
        return (hVarN == null || (hVarP = (hVar2 = this.f342457l).P(hVarN)) == hVar2) ? hVarP3 : hVarP3.L(hVarP);
    }

    @Override // com.fasterxml.jackson.databind.type.l
    public final String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341930b.getName());
        com.fasterxml.jackson.databind.h hVar = this.f342456k;
        if (hVar != null && U(2)) {
            sb2.append('<');
            sb2.append(hVar.g());
            sb2.append(',');
            sb2.append(this.f342457l.g());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public f N(Object obj) {
        com.fasterxml.jackson.databind.h hVarR = this.f342457l.R(obj);
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarR, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public f O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVarS = this.f342457l.S(iVar);
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarS, this.f341932d, this.f341933e, this.f341934f);
    }

    public f Y(com.fasterxml.jackson.databind.h hVar) {
        if (hVar == this.f342456k) {
            return this;
        }
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar, this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    public f Z(com.fasterxml.jackson.databind.m mVar) {
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k.S(mVar), this.f342457l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public f Q() {
        if (this.f341934f) {
            return this;
        }
        com.fasterxml.jackson.databind.h hVarQ = this.f342457l.Q();
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, hVarQ, this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public f R(Object obj) {
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public f S(Object obj) {
        return new f(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342456k, this.f342457l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f341930b == fVar.f341930b && this.f342456k.equals(fVar.f342456k) && this.f342457l.equals(fVar.f342457l);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h n() {
        return this.f342457l;
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
        this.f342456k.p(sb2);
        this.f342457l.p(sb2);
        sb2.append(">;");
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h r() {
        return this.f342456k;
    }

    @Override // com.fasterxml.jackson.databind.h
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.f341930b.getName(), this.f342456k, this.f342457l);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean w() {
        return super.w() || this.f342457l.w() || this.f342456k.w();
    }
}
