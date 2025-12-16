package com.google.common.base;

import com.google.common.collect.AbstractC37431x0;

/* compiled from: Present.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
final class P<T> extends H<T> {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final T f358976b;

    public P(T t12) {
        this.f358976b = t12;
    }

    @Override // com.google.common.base.H
    public final T b() {
        return this.f358976b;
    }

    @Override // com.google.common.base.H
    public final boolean c() {
        return true;
    }

    @Override // com.google.common.base.H
    public final Object e(AbstractC37431x0 abstractC37431x0) {
        return this.f358976b;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj instanceof P) {
            return this.f358976b.equals(((P) obj).f358976b);
        }
        return false;
    }

    @Override // com.google.common.base.H
    public final T f() {
        return this.f358976b;
    }

    public final int hashCode() {
        return this.f358976b.hashCode() + 1502476572;
    }

    public final String toString() {
        return androidx.appcompat.app.r.o(this.f358976b, ")", new StringBuilder("Optional.of("));
    }
}
