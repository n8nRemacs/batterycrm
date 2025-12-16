package com.fasterxml.jackson.databind.introspect;

/* compiled from: ObjectIdInfo.java */
/* loaded from: classes4.dex */
public class D {

    /* renamed from: f, reason: collision with root package name */
    public static final D f341939f = new D(com.fasterxml.jackson.databind.v.f342655f, Object.class, null, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f341940a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<? extends com.fasterxml.jackson.annotation.G<?>> f341941b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<? extends com.fasterxml.jackson.annotation.I> f341942c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<?> f341943d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341944e;

    public D() {
        throw null;
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends com.fasterxml.jackson.annotation.I>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends com.fasterxml.jackson.annotation.I>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D(com.fasterxml.jackson.databind.v r1, java.lang.Class<?> r2, java.lang.Class<? extends com.fasterxml.jackson.annotation.G<?>> r3, boolean r4, java.lang.Class r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f341940a = r1
            r0.f341943d = r2
            r0.f341941b = r3
            r0.f341944e = r4
            if (r5 != 0) goto Lf
            java.lang.Class<com.fasterxml.jackson.annotation.J> r5 = com.fasterxml.jackson.annotation.J.class
        Lf:
            r0.f341942c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.D.<init>(com.fasterxml.jackson.databind.v, java.lang.Class, java.lang.Class, boolean, java.lang.Class):void");
    }

    public final String toString() {
        return "ObjectIdInfo: propName=" + this.f341940a + ", scope=" + com.fasterxml.jackson.databind.util.g.A(this.f341943d) + ", generatorType=" + com.fasterxml.jackson.databind.util.g.A(this.f341941b) + ", alwaysAsId=" + this.f341944e;
    }
}
