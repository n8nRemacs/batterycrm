package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44856c;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: CopticChronology.java */
/* loaded from: classes7.dex */
public final class n extends f {

    /* renamed from: h0, reason: collision with root package name */
    public static final AbstractC44864f f420606h0 = new i("AM");

    /* renamed from: i0, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, n[]> f420607i0 = new ConcurrentHashMap<>();

    /* renamed from: j0, reason: collision with root package name */
    public static final n f420608j0 = F0(AbstractC44868j.f420911c, 4);
    private static final long serialVersionUID = -5972804258688333942L;

    public static n F0(AbstractC44868j abstractC44868j, int i12) throws ClassNotFoundException {
        n nVar;
        n[] nVarArrPutIfAbsent;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, n[]> concurrentHashMap = f420607i0;
        n[] nVarArr = concurrentHashMap.get(abstractC44868j);
        if (nVarArr == null && (nVarArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, (nVarArr = new n[7]))) != null) {
            nVarArr = nVarArrPutIfAbsent;
        }
        int i13 = i12 - 1;
        try {
            n nVar2 = nVarArr[i13];
            if (nVar2 == null) {
                synchronized (nVarArr) {
                    try {
                        nVar2 = nVarArr[i13];
                        if (nVar2 == null) {
                            AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
                            if (abstractC44868j == abstractC44868j2) {
                                n nVar3 = new n(null, i12);
                                nVar = new n(C.Y(nVar3, new C44856c(nVar3), null), i12);
                            } else {
                                nVar = new n(E.X(F0(abstractC44868j2, i12), abstractC44868j), i12);
                            }
                            nVarArr[i13] = nVar;
                            nVar2 = nVar;
                        }
                    } finally {
                    }
                }
            }
            return nVar2;
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
    public final boolean C0(long j12) {
        return this.f420496B.c(j12) == 6 && this.f420501G.z(j12);
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420608j0;
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
            c12206a.f420541I = f420606h0;
            h hVar = new h(this, 13);
            c12206a.f420536D = hVar;
            c12206a.f420550i = hVar.f420702d;
        }
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long V(int i12) {
        int i13;
        int i14 = i12 - 1687;
        if (i14 <= 0) {
            i13 = (i12 - 1684) >> 2;
        } else {
            int i15 = i14 >> 2;
            i13 = !D0(i12) ? i15 + 1 : i15;
        }
        return (((i14 * 365) + i13) * 86400000) + 21859200000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long W() {
        return 26607895200000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int p0() {
        return 292272708;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int r0() {
        return -292269337;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int s0() {
        return this.f420587O;
    }
}
