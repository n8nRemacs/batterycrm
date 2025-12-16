package com.fasterxml.jackson.databind.type;

/* compiled from: PlaceholderForType.java */
/* loaded from: classes4.dex */
public class h extends l {
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public final int f342458k;

    /* renamed from: l, reason: collision with root package name */
    public com.fasterxml.jackson.databind.h f342459l;

    public h(int i12) {
        super(Object.class, m.f342469h, n.p(), null, 1, null, null, false);
        this.f342458k = i12;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h O(com.fasterxml.jackson.databind.i iVar) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h Q() {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        W();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.type.l
    public final String V() {
        return toString();
    }

    public final void W() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder o(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this.f342458k + 1);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder p(StringBuilder sb2) {
        o(sb2);
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        o(sb2);
        return sb2.toString();
    }
}
