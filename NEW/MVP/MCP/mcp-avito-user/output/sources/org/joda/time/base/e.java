package org.joda.time.base;

import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.M;

/* compiled from: AbstractPartial.java */
/* loaded from: classes7.dex */
public abstract class e implements M, Comparable<M> {
    @Override // org.joda.time.M
    public boolean F4(AbstractC44865g abstractC44865g) {
        int size = size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            }
            if (I(i12) == abstractC44865g) {
                break;
            }
            i12++;
        }
        return i12 != -1;
    }

    @Override // org.joda.time.M
    public AbstractC44865g I(int i12) {
        return c(i12, y()).y();
    }

    @Override // org.joda.time.M
    public int I1(AbstractC44865g abstractC44865g) {
        int size = size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            }
            if (I(i12) == abstractC44865g) {
                break;
            }
            i12++;
        }
        if (i12 != -1) {
            return g(i12);
        }
        throw new IllegalArgumentException("Field '" + abstractC44865g + "' is not supported");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(M m12) {
        if (this == m12) {
            return 0;
        }
        if (size() != m12.size()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (I(i12) != m12.I(i12)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        int size2 = size();
        for (int i13 = 0; i13 < size2; i13++) {
            if (g(i13) > m12.g(i13)) {
                return 1;
            }
            if (g(i13) < m12.g(i13)) {
                return -1;
            }
        }
        return 0;
    }

    public final AbstractC44864f b(int i12) {
        return c(i12, y());
    }

    public abstract AbstractC44864f c(int i12, AbstractC44854a abstractC44854a);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m12 = (M) obj;
        if (size() != m12.size()) {
            return false;
        }
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (g(i12) != m12.g(i12) || I(i12) != m12.I(i12)) {
                return false;
            }
        }
        return org.joda.time.field.j.a(y(), m12.y());
    }

    public int hashCode() {
        int size = size();
        int iHashCode = 157;
        for (int i12 = 0; i12 < size; i12++) {
            iHashCode = I(i12).hashCode() + ((g(i12) + (iHashCode * 23)) * 23);
        }
        return y().hashCode() + iHashCode;
    }
}
