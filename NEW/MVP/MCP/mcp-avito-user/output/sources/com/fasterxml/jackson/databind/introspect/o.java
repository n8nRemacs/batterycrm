package com.fasterxml.jackson.databind.introspect;

/* compiled from: AnnotatedWithParams.java */
/* loaded from: classes4.dex */
public abstract class o extends AbstractC36471j {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final r[] f342069d;

    public o(J j12, r rVar, r[] rVarArr) {
        super(j12, rVar);
        this.f342069d = rVarArr;
    }

    public abstract Object p();

    public abstract Object q(Object[] objArr);

    public abstract Object r(Object obj);

    public final n s(int i12) {
        com.fasterxml.jackson.databind.h hVarU = u(i12);
        r[] rVarArr = this.f342069d;
        return new n(this, hVarU, this.f342052b, (rVarArr == null || i12 < 0 || i12 >= rVarArr.length) ? null : rVarArr[i12], i12);
    }

    public abstract int t();

    public abstract com.fasterxml.jackson.databind.h u(int i12);

    public abstract Class<?> v(int i12);
}
