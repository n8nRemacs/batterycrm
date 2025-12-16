package com.fasterxml.jackson.databind.type;

/* compiled from: ResolvedRecursiveType.java */
/* loaded from: classes4.dex */
public class j extends l {
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public com.fasterxml.jackson.databind.h f342462k;

    public j() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.l, com.fasterxml.jackson.databind.h
    public final m m() {
        com.fasterxml.jackson.databind.h hVar = this.f342462k;
        return hVar != null ? hVar.m() : this.f342466i;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder o(StringBuilder sb2) {
        com.fasterxml.jackson.databind.h hVar = this.f342462k;
        return hVar != null ? hVar.o(sb2) : sb2;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder p(StringBuilder sb2) {
        com.fasterxml.jackson.databind.h hVar = this.f342462k;
        if (hVar != null) {
            return hVar.o(sb2);
        }
        sb2.append("?");
        return sb2;
    }

    @Override // com.fasterxml.jackson.databind.type.l, com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h t() {
        com.fasterxml.jackson.databind.h hVar = this.f342462k;
        return hVar != null ? hVar.t() : this.f342464g;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(40, "[recursive type; ");
        com.fasterxml.jackson.databind.h hVar = this.f342462k;
        if (hVar == null) {
            sbQ.append("UNRESOLVED");
        } else {
            sbQ.append(hVar.f341930b.getName());
        }
        return sbQ.toString();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h Q() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h O(com.fasterxml.jackson.databind.i iVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        return this;
    }
}
