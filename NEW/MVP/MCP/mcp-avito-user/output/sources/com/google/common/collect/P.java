package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class P<T> extends AbstractC37429w3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<T> f359535b;

    public P(Comparator<T> comparator) {
        comparator.getClass();
        this.f359535b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13) {
        return this.f359535b.compare(t12, t13);
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P) {
            return this.f359535b.equals(((P) obj).f359535b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f359535b.hashCode();
    }

    public final String toString() {
        return this.f359535b.toString();
    }
}
