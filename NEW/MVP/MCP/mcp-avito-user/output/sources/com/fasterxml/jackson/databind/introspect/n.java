package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* compiled from: AnnotatedParameter.java */
/* loaded from: classes4.dex */
public final class n extends AbstractC36471j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final o f342066d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342067e;

    /* renamed from: f, reason: collision with root package name */
    public final int f342068f;

    public n(o oVar, com.fasterxml.jackson.databind.h hVar, J j12, r rVar, int i12) {
        super(j12, rVar);
        this.f342066d = oVar;
        this.f342067e = hVar;
        this.f342068f = i12;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final AnnotatedElement b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f342067e.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(n.class, obj)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f342066d.equals(this.f342066d) && nVar.f342068f == this.f342068f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f342067e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Class<?> h() {
        return this.f342066d.h();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f342066d.hashCode() + this.f342068f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Member k() {
        return this.f342066d.k();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Object l(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(this.f342066d.h().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final AbstractC36463b o(r rVar) {
        if (rVar == this.f342053c) {
            return this;
        }
        o oVar = this.f342066d;
        r[] rVarArr = oVar.f342069d;
        int i12 = this.f342068f;
        rVarArr[i12] = rVar;
        return oVar.s(i12);
    }

    public final int p() {
        return this.f342068f;
    }

    public final o q() {
        return this.f342066d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        return "[parameter #" + this.f342068f + ", annotations: " + this.f342053c + "]";
    }
}
