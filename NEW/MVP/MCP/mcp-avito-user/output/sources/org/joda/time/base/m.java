package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.AbstractC44872n;
import org.joda.time.D;
import org.joda.time.N;

/* compiled from: BaseSingleFieldPeriod.java */
/* loaded from: classes7.dex */
public abstract class m implements N, Comparable<m>, Serializable {
    private static final long serialVersionUID = 9386874258972L;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f420469b;

    public m(int i12) {
        this.f420469b = i12;
    }

    @Override // org.joda.time.N
    public final AbstractC44872n I(int i12) {
        if (i12 == 0) {
            return b();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i12));
    }

    @Override // org.joda.time.N
    public abstract D a();

    public abstract AbstractC44872n b();

    @Override // java.lang.Comparable
    public final int compareTo(m mVar) {
        m mVar2 = mVar;
        if (mVar2.getClass() == getClass()) {
            int i12 = mVar2.f420469b;
            int i13 = this.f420469b;
            if (i13 > i12) {
                return 1;
            }
            return i13 < i12 ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + mVar2.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n12 = (N) obj;
        return n12.a() == a() && n12.g(0) == this.f420469b;
    }

    @Override // org.joda.time.N
    public final int g(int i12) {
        if (i12 == 0) {
            return this.f420469b;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i12));
    }

    public final int hashCode() {
        return b().hashCode() + ((459 + this.f420469b) * 27);
    }

    @Override // org.joda.time.N
    public final int size() {
        return 1;
    }
}
