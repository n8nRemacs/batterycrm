package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.C44856c;
import org.joda.time.C44874p;
import org.joda.time.K;

/* compiled from: AbstractInstant.java */
/* loaded from: classes7.dex */
public abstract class c implements K {
    @Override // org.joda.time.K
    public C44874p P5() {
        return new C44874p(getMillis());
    }

    public C44856c a() {
        return new C44856c(getMillis(), y().o());
    }

    @Override // java.lang.Comparable
    public final int compareTo(K k12) {
        K k13 = k12;
        if (this == k13) {
            return 0;
        }
        long millis = k13.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k12 = (K) obj;
        return getMillis() == k12.getMillis() && org.joda.time.field.j.a(y(), k12.y());
    }

    public final int hashCode() {
        return y().hashCode() + ((int) (getMillis() ^ (getMillis() >>> 32)));
    }

    @ToString
    public String toString() {
        return org.joda.time.format.j.e().c(this);
    }
}
