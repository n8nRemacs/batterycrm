package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: JulianChronology.java */
/* loaded from: classes7.dex */
public final class A extends g {
    private static final long serialVersionUID = -8731039522547897247L;

    /* renamed from: m0, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, A[]> f420473m0 = new ConcurrentHashMap<>();

    /* renamed from: l0, reason: collision with root package name */
    public static final A f420472l0 = F0(AbstractC44868j.f420911c, 4);

    public static A F0(AbstractC44868j abstractC44868j, int i12) throws ClassNotFoundException {
        A[] aArrPutIfAbsent;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, A[]> concurrentHashMap = f420473m0;
        A[] aArr = concurrentHashMap.get(abstractC44868j);
        if (aArr == null && (aArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, (aArr = new A[7]))) != null) {
            aArr = aArrPutIfAbsent;
        }
        int i13 = i12 - 1;
        try {
            A a12 = aArr[i13];
            if (a12 == null) {
                synchronized (aArr) {
                    try {
                        a12 = aArr[i13];
                        if (a12 == null) {
                            AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
                            A a13 = abstractC44868j == abstractC44868j2 ? new A(null, i12) : new A(E.X(F0(abstractC44868j2, i12), abstractC44868j), i12);
                            aArr[i13] = a13;
                            a12 = a13;
                        }
                    } finally {
                    }
                }
            }
            return a12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(AK.c.g(i12, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i12 = this.f420587O;
        if (i12 == 0) {
            i12 = 4;
        }
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44854a == null ? F0(AbstractC44868j.f420911c, i12) : F0(abstractC44854a.o(), i12);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final boolean D0(int i12) {
        return (i12 & 3) == 0;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420472l0;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        return abstractC44868j == super.o() ? this : F0(abstractC44868j, 4);
    }

    @Override // org.joda.time.chrono.AbstractC44859c, org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        if (this.f420508b == null) {
            super.T(c12206a);
            c12206a.f420537E = new org.joda.time.field.t(this, c12206a.f420537E);
            c12206a.f420534B = new org.joda.time.field.t(this, c12206a.f420534B);
        }
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long V(int i12) {
        int i13;
        int i14 = i12 - 1968;
        if (i14 <= 0) {
            i13 = (i12 - 1965) >> 2;
        } else {
            int i15 = i14 >> 2;
            i13 = !D0(i12) ? i15 + 1 : i15;
        }
        return (((i14 * 365) + i13) * 86400000) - 62035200000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long W() {
        return 31083663600000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long X() {
        return 2629800000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Y() {
        return 31557600000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Z() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long a0(int i12, int i13, int i14) {
        if (i12 <= 0) {
            if (i12 == 0) {
                throw new IllegalFieldValueException(AbstractC44865g.f420885g, Integer.valueOf(i12), null, null);
            }
            i12++;
        }
        return super.a0(i12, i13, i14);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int p0() {
        return 292272992;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int r0() {
        return -292269054;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int s0() {
        return this.f420587O;
    }
}
