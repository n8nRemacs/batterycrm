package com.google.common.base;

import com.google.common.collect.AbstractC37431x0;

/* compiled from: Absent.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37255a<T> extends H<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final C37255a<Object> f358985b = new C37255a<>();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f358985b;
    }

    @Override // com.google.common.base.H
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.H
    public final boolean c() {
        return false;
    }

    public final boolean equals(@I41.a Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.H
    @I41.a
    public final T f() {
        return null;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.H
    public final Object e(AbstractC37431x0 abstractC37431x0) {
        return abstractC37431x0;
    }
}
