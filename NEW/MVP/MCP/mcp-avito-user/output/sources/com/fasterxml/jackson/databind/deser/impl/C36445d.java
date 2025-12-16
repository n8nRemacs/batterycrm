package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.InterfaceC36434d;
import com.fasterxml.jackson.databind.AnnotationIntrospector;

/* compiled from: CreatorCandidate.java */
/* renamed from: com.fasterxml.jackson.databind.deser.impl.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36445d {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotationIntrospector f341612a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.introspect.o f341613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341614c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f341615d;

    /* compiled from: CreatorCandidate.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.impl.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.introspect.n f341616a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.introspect.u f341617b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC36434d.a f341618c;

        public a(com.fasterxml.jackson.databind.introspect.n nVar, com.fasterxml.jackson.databind.introspect.u uVar, InterfaceC36434d.a aVar) {
            this.f341616a = nVar;
            this.f341617b = uVar;
            this.f341618c = aVar;
        }
    }

    public C36445d(AnnotationIntrospector annotationIntrospector, com.fasterxml.jackson.databind.introspect.o oVar, a[] aVarArr, int i12) {
        this.f341612a = annotationIntrospector;
        this.f341613b = oVar;
        this.f341615d = aVarArr;
        this.f341614c = i12;
    }

    public static C36445d a(AnnotationIntrospector annotationIntrospector, com.fasterxml.jackson.databind.introspect.o oVar, com.fasterxml.jackson.databind.introspect.u[] uVarArr) {
        int iT2 = oVar.t();
        a[] aVarArr = new a[iT2];
        for (int i12 = 0; i12 < iT2; i12++) {
            com.fasterxml.jackson.databind.introspect.n nVarS = oVar.s(i12);
            aVarArr[i12] = new a(nVarS, uVarArr == null ? null : uVarArr[i12], annotationIntrospector.q(nVarS));
        }
        return new C36445d(annotationIntrospector, oVar, aVarArr, iT2);
    }

    public final com.fasterxml.jackson.databind.v b(int i12) {
        String strP = this.f341612a.p(this.f341615d[i12].f341616a);
        if (strP == null || strP.isEmpty()) {
            return null;
        }
        return com.fasterxml.jackson.databind.v.a(strP);
    }

    public final com.fasterxml.jackson.databind.v c(int i12) {
        com.fasterxml.jackson.databind.introspect.u uVar = this.f341615d[i12].f341617b;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public final com.fasterxml.jackson.databind.introspect.u d(int i12) {
        return this.f341615d[i12].f341617b;
    }

    public final String toString() {
        return this.f341613b.toString();
    }
}
