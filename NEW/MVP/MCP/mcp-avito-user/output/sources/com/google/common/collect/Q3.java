package com.google.common.collect;

import java.io.Serializable;

/* compiled from: ReverseOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class Q3<T> extends AbstractC37429w3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37429w3<? super T> f359567b;

    public Q3(AbstractC37429w3<? super T> abstractC37429w3) {
        abstractC37429w3.getClass();
        this.f359567b = abstractC37429w3;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <E extends T> E c(@InterfaceC37434x3 E e12, @InterfaceC37434x3 E e13) {
        throw null;
    }

    @Override // java.util.Comparator
    public final int compare(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13) {
        return this.f359567b.compare(t13, t12);
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q3) {
            return this.f359567b.equals(((Q3) obj).f359567b);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends T> AbstractC37429w3<S> h() {
        return this.f359567b;
    }

    public final int hashCode() {
        return -this.f359567b.hashCode();
    }

    public final String toString() {
        return this.f359567b + ".reverse()";
    }
}
