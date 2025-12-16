package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: CompoundOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class T<T> extends AbstractC37429w3<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super T>[] f359574b;

    /* JADX WARN: Multi-variable type inference failed */
    public T(AbstractC37429w3 abstractC37429w3, Comparator comparator) {
        AbstractC37429w3[] abstractC37429w3Arr = (Comparator<? super T>[]) new Comparator[2];
        abstractC37429w3Arr[0] = abstractC37429w3;
        abstractC37429w3Arr[1] = comparator;
        this.f359574b = abstractC37429w3Arr;
    }

    @Override // java.util.Comparator
    public final int compare(@InterfaceC37434x3 T t12, @InterfaceC37434x3 T t13) {
        int i12 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f359574b;
            if (i12 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i12].compare(t12, t13);
            if (iCompare != 0) {
                return iCompare;
            }
            i12++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            return Arrays.equals(this.f359574b, ((T) obj).f359574b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f359574b);
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f359574b), ")");
    }
}
