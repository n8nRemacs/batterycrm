package org.joda.time.chrono;

import androidx.camera.camera2.internal.G;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44856c;
import org.joda.time.chrono.AbstractC44857a;

/* compiled from: IslamicChronology.java */
/* loaded from: classes7.dex */
public final class z extends AbstractC44859c {

    /* renamed from: i0, reason: collision with root package name */
    public static final AbstractC44864f f420654i0 = new i("AH");

    /* renamed from: j0, reason: collision with root package name */
    public static final a f420655j0 = new a(0, 623158436);

    /* renamed from: k0, reason: collision with root package name */
    public static final a f420656k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final a f420657l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final a f420658m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final ConcurrentHashMap<AbstractC44868j, z[]> f420659n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final z f420660o0;
    private static final long serialVersionUID = -3663823829888L;

    /* renamed from: h0, reason: collision with root package name */
    public final a f420661h0;

    /* compiled from: IslamicChronology.java */
    public static class a implements Serializable {
        private static final long serialVersionUID = 26581275372698L;

        /* renamed from: b, reason: collision with root package name */
        public final byte f420662b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420663c;

        public a(int i12, int i13) {
            this.f420662b = (byte) i12;
            this.f420663c = i13;
        }

        private Object readResolve() {
            byte b12 = this.f420662b;
            return b12 != 0 ? b12 != 1 ? b12 != 2 ? b12 != 3 ? this : z.f420658m0 : z.f420657l0 : z.f420656k0 : z.f420655j0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f420662b == ((a) obj).f420662b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f420662b;
        }
    }

    static {
        a aVar = new a(1, 623191204);
        f420656k0 = aVar;
        f420657l0 = new a(2, 690562340);
        f420658m0 = new a(3, 153692453);
        f420659n0 = new ConcurrentHashMap<>();
        f420660o0 = F0(AbstractC44868j.f420911c, aVar);
    }

    public z(AbstractC44857a abstractC44857a, a aVar) {
        super(abstractC44857a, 4);
        this.f420661h0 = aVar;
    }

    public static z F0(AbstractC44868j abstractC44868j, a aVar) throws ClassNotFoundException {
        z zVar;
        z[] zVarArrPutIfAbsent;
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        ConcurrentHashMap<AbstractC44868j, z[]> concurrentHashMap = f420659n0;
        z[] zVarArr = concurrentHashMap.get(abstractC44868j);
        if (zVarArr == null && (zVarArrPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC44868j, (zVarArr = new z[4]))) != null) {
            zVarArr = zVarArrPutIfAbsent;
        }
        z zVar2 = zVarArr[aVar.f420662b];
        if (zVar2 == null) {
            synchronized (zVarArr) {
                try {
                    zVar2 = zVarArr[aVar.f420662b];
                    if (zVar2 == null) {
                        AbstractC44868j abstractC44868j2 = AbstractC44868j.f420911c;
                        if (abstractC44868j == abstractC44868j2) {
                            z zVar3 = new z(null, aVar);
                            zVar = new z(C.Y(zVar3, new C44856c(zVar3), null), aVar);
                        } else {
                            zVar = new z(E.X(F0(abstractC44868j2, aVar), abstractC44868j), aVar);
                        }
                        zVarArr[aVar.f420662b] = zVar;
                        zVar2 = zVar;
                    }
                } finally {
                }
            }
        }
        return zVar2;
    }

    private Object readResolve() {
        AbstractC44854a abstractC44854a = this.f420508b;
        return abstractC44854a == null ? f420660o0 : F0(abstractC44854a.o(), f420656k0);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final boolean D0(int i12) {
        return ((1 << (i12 % 30)) & this.f420661h0.f420663c) > 0;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long E0(int i12, long j12) {
        int iF02 = f0(z0(j12), j12);
        int iQ02 = AbstractC44859c.q0(j12);
        if (iF02 > 354 && !D0(i12)) {
            iF02--;
        }
        return B0(i12, 1, iF02) + iQ02;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a N() {
        return f420660o0;
    }

    @Override // org.joda.time.AbstractC44854a
    public final AbstractC44854a O(AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = AbstractC44868j.e();
        }
        return abstractC44868j == super.o() ? this : F0(abstractC44868j, f420656k0);
    }

    @Override // org.joda.time.chrono.AbstractC44859c, org.joda.time.chrono.AbstractC44857a
    public final void T(AbstractC44857a.C12206a c12206a) {
        if (this.f420508b == null) {
            super.T(c12206a);
            c12206a.f420541I = f420654i0;
            h hVar = new h(this, 12);
            c12206a.f420536D = hVar;
            c12206a.f420550i = hVar.f420702d;
        }
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long V(int i12) {
        if (i12 > 292271022) {
            throw new ArithmeticException(G.e(i12, "Year is too large: ", " > 292271022"));
        }
        if (i12 < -292269337) {
            throw new ArithmeticException(G.e(i12, "Year is too small: ", " < -292269337"));
        }
        long j12 = ((r6 / 30) * 918518400000L) - 42521587200000L;
        int i13 = ((i12 - 1) % 30) + 1;
        for (int i14 = 1; i14 < i13; i14++) {
            j12 += D0(i14) ? 30672000000L : 30585600000L;
        }
        return j12;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long W() {
        return 21260793600000L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long X() {
        return 2551440384L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Y() {
        return 30617280288L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long Z() {
        return 15308640144L;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int d0(long j12) {
        int iF02 = f0(z0(j12), j12) - 1;
        if (iF02 == 354) {
            return 30;
        }
        return ((iF02 % 59) % 30) + 1;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f420661h0.f420662b == ((z) obj).f420661h0.f420662b && super.equals(obj);
        }
        return false;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int g0() {
        return 30;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int h0(int i12) {
        return (i12 == 12 || (i12 + (-1)) % 2 == 0) ? 30 : 29;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int hashCode() {
        return (super.hashCode() * 13) + this.f420661h0.f420662b;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int k0(int i12) {
        return D0(i12) ? 355 : 354;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int l0() {
        return 355;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int m0(int i12, int i13) {
        return ((i13 == 12 && D0(i12)) || (i13 + (-1)) % 2 == 0) ? 30 : 29;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int p0() {
        return 292271022;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int r0() {
        return 1;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int s0() {
        return this.f420587O;
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final int t0(int i12, long j12) {
        int iA02 = (int) ((j12 - A0(i12)) / 86400000);
        if (iA02 == 354) {
            return 12;
        }
        return androidx.compose.ui.graphics.colorspace.e.e(iA02, 2, 59, 1);
    }

    @Override // org.joda.time.chrono.AbstractC44859c
    public final long v0(int i12, int i13) {
        return (i13 - 1) % 2 == 1 ? ((r5 / 2) * 5097600000L) + 2592000000L : (r5 / 2) * 5097600000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r6 = 30585600000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0023, code lost:
    
        if (D0(r0) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        r6 = 30672000000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r6 = 30585600000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r9 < r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        r9 = r9 - r6;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (D0(r0) == false) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:4:0x0025). Please report as a decompilation issue!!! */
    @Override // org.joda.time.chrono.AbstractC44859c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z0(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.D0(r0)
            r2 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            r4 = 30672000000(0x724319400, double:1.5153981489E-313)
            if (r1 == 0) goto L27
        L25:
            r6 = r4
            goto L28
        L27:
            r6 = r2
        L28:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L36
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.D0(r0)
            if (r1 == 0) goto L27
            goto L25
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.z.z0(long):int");
    }
}
