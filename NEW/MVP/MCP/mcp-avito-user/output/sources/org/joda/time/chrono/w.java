package org.joda.time.chrono;

import com.adjust.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44868j;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: GregorianChronology.java */
/* loaded from: classes7.dex */
public final class w extends g {
    private static final long serialVersionUID = -861407383323710522L;

    /* renamed from: m0, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, w[]> f420649m0 = new ConcurrentHashMap<>();

    /* renamed from: l0, reason: collision with root package name */
    public static final w f420648l0 = F0(AbstractC44868j.f420911c, 4);

    public static w F0(AbstractC44868j abstractC44868j, int i12) throws ClassNotFoundException {
        w[] wVarArrPutIfAbsent;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, w[]> concurrentHashMap = f420649m0;
        w[] wVarArr = concurrentHashMap.get(abstractC44868j);
        if (wVarArr == null && (wVarArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, (wVarArr = new w[7]))) != null) {
            wVarArr = wVarArrPutIfAbsent;
        }
        int i13 = i12 - 1;
        try {
            w wVar = wVarArr[i13];
            if (wVar == null) {
                synchronized (wVarArr) {
                    try {
                        wVar = wVarArr[i13];
                        if (wVar == null) {
                            AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
                            w wVar2 = abstractC44868j == abstractC44868j2 ? new w(null, i12) : new w(E.X(F0(abstractC44868j2, i12), abstractC44868j), i12);
                            wVarArr[i13] = wVar2;
                            wVar = wVar2;
                        }
                    } finally {
                    }
                }
            }
            return wVar;
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
        return (i12 & 3) == 0 && (i12 % 100 != 0 || i12 % Constants.MINIMAL_ERROR_STATUS_CODE == 0);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420648l0;
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
        }
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long V(int i12) {
        int i13;
        int i14 = i12 / 100;
        if (i12 < 0) {
            i13 = ((((i12 + 3) >> 2) - i14) + ((i14 + 3) >> 2)) - 1;
        } else {
            i13 = ((i12 >> 2) - i14) + (i14 >> 2);
            if (D0(i12)) {
                i13--;
            }
        }
        return ((i12 * 365) + (i13 - 719527)) * 86400000;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long W() {
        return 31083597720000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long X() {
        return 2629746000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Y() {
        return 31556952000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Z() {
        return 15778476000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int p0() {
        return 292278993;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int r0() {
        return -292275054;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int s0() {
        return this.f420587O;
    }
}
