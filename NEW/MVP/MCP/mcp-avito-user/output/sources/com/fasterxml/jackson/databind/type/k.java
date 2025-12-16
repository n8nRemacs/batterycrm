package com.fasterxml.jackson.databind.type;

/* compiled from: SimpleType.java */
/* loaded from: classes4.dex */
public class k extends l {
    private static final long serialVersionUID = 1;

    public k() {
        throw null;
    }

    public k(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        super(cls, mVar, hVar, hVarArr, 0, null, null, false);
    }

    public static k W(Class<?> cls) {
        return new k(cls, null, null, null, 0, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h N(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.type.l
    public String V() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f341930b.getName());
        m mVar = this.f342466i;
        int length = mVar.f342471c.length;
        if (length > 0 && U(length)) {
            sb2.append('<');
            for (int i12 = 0; i12 < length; i12++) {
                com.fasterxml.jackson.databind.h hVarD = mVar.d(i12);
                if (i12 > 0) {
                    sb2.append(',');
                }
                sb2.append(hVarD.g());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public k O(com.fasterxml.jackson.databind.i iVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public k Q() {
        return this.f341934f ? this : new k(this.f341930b, this.f342466i, this.f342464g, this.f342465h, 0, this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public k R(Object obj) {
        return this.f341933e == obj ? this : new k(this.f341930b, this.f342466i, this.f342464g, this.f342465h, 0, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public k S(Object obj) {
        return obj == this.f341932d ? this : new k(this.f341930b, this.f342466i, this.f342464g, this.f342465h, 0, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f341930b != this.f341930b) {
            return false;
        }
        return this.f342466i.equals(kVar.f342466i);
    }

    @Override // com.fasterxml.jackson.databind.h
    public StringBuilder o(StringBuilder sb2) {
        l.T(this.f341930b, sb2, true);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public StringBuilder p(StringBuilder sb2) {
        l.T(this.f341930b, sb2, false);
        m mVar = this.f342466i;
        int length = mVar.f342471c.length;
        if (length > 0) {
            sb2.append('<');
            for (int i12 = 0; i12 < length; i12++) {
                sb2 = mVar.d(i12).p(sb2);
            }
            sb2.append('>');
        }
        sb2.append(';');
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(40, "[simple type, class ");
        sbQ.append(V());
        sbQ.append(']');
        return sbQ.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    public boolean u() {
        return this instanceof i;
    }

    public k(Class<?> cls) {
        this(cls, m.f342469h, null, null);
    }
}
