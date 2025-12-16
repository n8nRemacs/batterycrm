package com.fasterxml.jackson.databind.type;

import java.util.Objects;

/* compiled from: ReferenceType.java */
/* loaded from: classes4.dex */
public class i extends k {
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342460k;

    /* renamed from: l, reason: collision with root package name */
    public final i f342461l;

    public i(Class cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr, com.fasterxml.jackson.databind.h hVar2, i iVar, Object obj, Object obj2, boolean z12) {
        super(cls, mVar, hVar, hVarArr, Objects.hashCode(hVar2), obj, obj2, z12);
        this.f342460k = hVar2;
        this.f342461l = iVar == null ? this : iVar;
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return new i(cls, this.f342466i, hVar, hVarArr, this.f342460k, this.f342461l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        if (this.f342460k == hVar) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar, this.f342461l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        com.fasterxml.jackson.databind.h hVar = this.f342460k;
        if (obj == hVar.f341933e) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar.R(obj), this.f342461l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        if (obj == this.f341933e) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342460k, this.f342461l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        if (obj == this.f341932d) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342460k, this.f342461l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.type.l
    public final String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341930b.getName());
        com.fasterxml.jackson.databind.h hVar = this.f342460k;
        if (hVar != null && U(1)) {
            sb2.append('<');
            sb2.append(hVar.g());
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.k
    /* renamed from: Z */
    public final k R(Object obj) {
        if (obj == this.f341933e) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342460k, this.f342461l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k
    /* renamed from: a0 */
    public final k S(Object obj) {
        if (obj == this.f341932d) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342460k, this.f342461l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final i O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVar = this.f342460k;
        if (iVar == hVar.f341932d) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, hVar.S(iVar), this.f342461l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.type.k
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final i Q() {
        if (this.f341934f) {
            return this;
        }
        return new i(this.f341930b, this.f342466i, this.f342464g, this.f342465h, this.f342460k.Q(), this.f342461l, this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.h, qX0.AbstractC47359a
    public final com.fasterxml.jackson.databind.h e() {
        return this.f342460k;
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f341930b != this.f341930b) {
            return false;
        }
        return this.f342460k.equals(iVar.f342460k);
    }

    @Override // qX0.AbstractC47359a
    public final boolean f() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h n() {
        return this.f342460k;
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final StringBuilder o(StringBuilder sb2) {
        l.T(this.f341930b, sb2, true);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final StringBuilder p(StringBuilder sb2) {
        l.T(this.f341930b, sb2, false);
        sb2.append('<');
        StringBuilder sbP = this.f342460k.p(sb2);
        sbP.append(">;");
        return sbP;
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: s */
    public final com.fasterxml.jackson.databind.h e() {
        return this.f342460k;
    }

    @Override // com.fasterxml.jackson.databind.type.k, com.fasterxml.jackson.databind.h
    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(40, "[reference type, class ");
        sbQ.append(V());
        sbQ.append('<');
        sbQ.append(this.f342460k);
        sbQ.append(">]");
        return sbQ.toString();
    }
}
