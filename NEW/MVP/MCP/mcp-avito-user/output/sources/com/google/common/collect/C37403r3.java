package com.google.common.collect;

import java.io.Serializable;

/* compiled from: NullsFirstOrdering.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37403r3<T> extends AbstractC37429w3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37429w3<? super T> f359986b;

    public C37403r3(AbstractC37429w3<? super T> abstractC37429w3) {
        this.f359986b = abstractC37429w3;
    }

    @Override // java.util.Comparator
    public final int compare(@I41.a T t12, @I41.a T t13) {
        if (t12 == t13) {
            return 0;
        }
        if (t12 == null) {
            return -1;
        }
        if (t13 == null) {
            return 1;
        }
        return this.f359986b.compare(t12, t13);
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37403r3) {
            return this.f359986b.equals(((C37403r3) obj).f359986b);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends T> AbstractC37429w3<S> f() {
        return this.f359986b.f();
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends T> AbstractC37429w3<S> h() {
        return this.f359986b.h().f();
    }

    public final int hashCode() {
        return this.f359986b.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.f359986b + ".nullsFirst()";
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends T> AbstractC37429w3<S> e() {
        return this;
    }
}
