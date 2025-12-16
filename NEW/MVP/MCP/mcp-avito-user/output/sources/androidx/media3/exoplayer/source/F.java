package androidx.media3.exoplayer.source;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes.dex */
final class F implements InterfaceC23174z, InterfaceC23174z.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC23174z[] f49489b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<P, Integer> f49490c;

    /* renamed from: d, reason: collision with root package name */
    public final C23160k f49491d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<InterfaceC23174z> f49492e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<androidx.media3.common.Q, androidx.media3.common.Q> f49493f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public InterfaceC23174z.a f49494g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public Y f49495h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC23174z[] f49496i;

    /* renamed from: j, reason: collision with root package name */
    public Q f49497j;

    /* compiled from: MergingMediaPeriod.java */
    public static final class a implements androidx.media3.exoplayer.trackselection.k {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.trackselection.k f49498a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.Q f49499b;

        public a(androidx.media3.exoplayer.trackselection.k kVar, androidx.media3.common.Q q12) {
            this.f49498a = kVar;
            this.f49499b = q12;
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void N() {
            this.f49498a.N();
        }

        @Override // androidx.media3.exoplayer.trackselection.o
        public final int b(int i12) {
            return this.f49498a.b(i12);
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final C23108t c() {
            return this.f49498a.c();
        }

        @Override // androidx.media3.exoplayer.trackselection.o
        public final C23108t d(int i12) {
            return this.f49498a.d(i12);
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void e(float f12) {
            this.f49498a.e(f12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49498a.equals(aVar.f49498a) && this.f49499b.equals(aVar.f49499b);
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void f(boolean z12) {
            this.f49498a.f(z12);
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void g() {
            this.f49498a.g();
        }

        @Override // androidx.media3.exoplayer.trackselection.o
        public final int h(int i12) {
            return this.f49498a.h(i12);
        }

        public final int hashCode() {
            return this.f49498a.hashCode() + ((this.f49499b.hashCode() + 527) * 31);
        }

        @Override // androidx.media3.exoplayer.trackselection.o
        public final androidx.media3.common.Q i() {
            return this.f49499b;
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void j() {
            this.f49498a.j();
        }

        @Override // androidx.media3.exoplayer.trackselection.k
        public final void k() {
            this.f49498a.k();
        }

        @Override // androidx.media3.exoplayer.trackselection.o
        public final int length() {
            return this.f49498a.length();
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    public static final class b implements InterfaceC23174z, InterfaceC23174z.a {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC23174z f49500b;

        /* renamed from: c, reason: collision with root package name */
        public final long f49501c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC23174z.a f49502d;

        public b(InterfaceC23174z interfaceC23174z, long j12) {
            this.f49500b = interfaceC23174z;
            this.f49501c = j12;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean continueLoading(long j12) {
            return this.f49500b.continueLoading(j12 - this.f49501c);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
            P[] pArr2 = new P[pArr.length];
            int i12 = 0;
            while (true) {
                P p12 = null;
                if (i12 >= pArr.length) {
                    break;
                }
                c cVar = (c) pArr[i12];
                if (cVar != null) {
                    p12 = cVar.f49503b;
                }
                pArr2[i12] = p12;
                i12++;
            }
            long j13 = this.f49501c;
            long jD2 = this.f49500b.d(kVarArr, zArr, pArr2, zArr2, j12 - j13);
            for (int i13 = 0; i13 < pArr.length; i13++) {
                P p13 = pArr2[i13];
                if (p13 == null) {
                    pArr[i13] = null;
                } else {
                    P p14 = pArr[i13];
                    if (p14 == null || ((c) p14).f49503b != p13) {
                        pArr[i13] = new c(p13, j13);
                    }
                }
            }
            return jD2 + j13;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void discardBuffer(long j12, boolean z12) {
            this.f49500b.discardBuffer(j12 - this.f49501c, z12);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
        public final void e(InterfaceC23174z interfaceC23174z) {
            InterfaceC23174z.a aVar = this.f49502d;
            aVar.getClass();
            aVar.e(this);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void f(InterfaceC23174z.a aVar, long j12) {
            this.f49502d = aVar;
            this.f49500b.f(this, j12 - this.f49501c);
        }

        @Override // androidx.media3.exoplayer.source.Q.a
        public final void g(Q q12) {
            InterfaceC23174z.a aVar = this.f49502d;
            aVar.getClass();
            aVar.g(this);
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getBufferedPositionUs() {
            long bufferedPositionUs = this.f49500b.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f49501c + bufferedPositionUs;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f49500b.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f49501c + nextLoadPositionUs;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final Y getTrackGroups() {
            return this.f49500b.getTrackGroups();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long i(long j12, g0 g0Var) {
            long j13 = this.f49501c;
            return this.f49500b.i(j12 - j13, g0Var) + j13;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean isLoading() {
            return this.f49500b.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void maybeThrowPrepareError() {
            this.f49500b.maybeThrowPrepareError();
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long readDiscontinuity() {
            long discontinuity = this.f49500b.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f49501c + discontinuity;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final void reevaluateBuffer(long j12) {
            this.f49500b.reevaluateBuffer(j12 - this.f49501c);
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long seekToUs(long j12) {
            long j13 = this.f49501c;
            return this.f49500b.seekToUs(j12 - j13) + j13;
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    public static final class c implements P {

        /* renamed from: b, reason: collision with root package name */
        public final P f49503b;

        /* renamed from: c, reason: collision with root package name */
        public final long f49504c;

        public c(P p12, long j12) {
            this.f49503b = p12;
            this.f49504c = j12;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            return this.f49503b.b(j12 - this.f49504c);
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() {
            this.f49503b.c();
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            int iE2 = this.f49503b.e(f12, decoderInputBuffer, i12);
            if (iE2 == -4) {
                decoderInputBuffer.f48325f = Math.max(0L, decoderInputBuffer.f48325f + this.f49504c);
            }
            return iE2;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            return this.f49503b.n();
        }
    }

    public F(C23160k c23160k, long[] jArr, InterfaceC23174z... interfaceC23174zArr) {
        this.f49491d = c23160k;
        this.f49489b = interfaceC23174zArr;
        c23160k.getClass();
        this.f49497j = new C23155f(new Q[0]);
        this.f49490c = new IdentityHashMap<>();
        this.f49496i = new InterfaceC23174z[0];
        for (int i12 = 0; i12 < interfaceC23174zArr.length; i12++) {
            long j12 = jArr[i12];
            if (j12 != 0) {
                this.f49489b[i12] = new b(interfaceC23174zArr[i12], j12);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        ArrayList<InterfaceC23174z> arrayList = this.f49492e;
        if (arrayList.isEmpty()) {
            return this.f49497j.continueLoading(j12);
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).continueLoading(j12);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
        IdentityHashMap<P, Integer> identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int length = kVarArr.length;
            identityHashMap = this.f49490c;
            if (i13 >= length) {
                break;
            }
            P p12 = pArr[i13];
            Integer num = p12 == null ? null : identityHashMap.get(p12);
            iArr[i13] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.k kVar = kVarArr[i13];
            if (kVar != null) {
                String str = kVar.i().f47440c;
                iArr2[i13] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i13] = -1;
            }
            i13++;
        }
        identityHashMap.clear();
        int length2 = kVarArr.length;
        P[] pArr2 = new P[length2];
        P[] pArr3 = new P[kVarArr.length];
        androidx.media3.exoplayer.trackselection.k[] kVarArr2 = new androidx.media3.exoplayer.trackselection.k[kVarArr.length];
        InterfaceC23174z[] interfaceC23174zArr = this.f49489b;
        ArrayList arrayList2 = new ArrayList(interfaceC23174zArr.length);
        long j13 = j12;
        int i14 = 0;
        while (i14 < interfaceC23174zArr.length) {
            int i15 = i12;
            while (i15 < kVarArr.length) {
                pArr3[i15] = iArr[i15] == i14 ? pArr[i15] : null;
                if (iArr2[i15] == i14) {
                    androidx.media3.exoplayer.trackselection.k kVar2 = kVarArr[i15];
                    kVar2.getClass();
                    arrayList = arrayList2;
                    androidx.media3.common.Q q12 = this.f49493f.get(kVar2.i());
                    q12.getClass();
                    kVarArr2[i15] = new a(kVar2, q12);
                } else {
                    arrayList = arrayList2;
                    kVarArr2[i15] = null;
                }
                i15++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i16 = i14;
            InterfaceC23174z[] interfaceC23174zArr2 = interfaceC23174zArr;
            androidx.media3.exoplayer.trackselection.k[] kVarArr3 = kVarArr2;
            long jD2 = interfaceC23174zArr[i14].d(kVarArr2, zArr, pArr3, zArr2, j13);
            if (i16 == 0) {
                j13 = jD2;
            } else if (jD2 != j13) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z12 = false;
            for (int i17 = 0; i17 < kVarArr.length; i17++) {
                if (iArr2[i17] == i16) {
                    P p13 = pArr3[i17];
                    p13.getClass();
                    pArr2[i17] = pArr3[i17];
                    identityHashMap.put(p13, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr[i17] == i16) {
                    C23110a.g(pArr3[i17] == null);
                }
            }
            if (z12) {
                arrayList3.add(interfaceC23174zArr2[i16]);
            }
            i14 = i16 + 1;
            arrayList2 = arrayList3;
            interfaceC23174zArr = interfaceC23174zArr2;
            kVarArr2 = kVarArr3;
            i12 = 0;
        }
        int i18 = i12;
        System.arraycopy(pArr2, i18, pArr, i18, length2);
        InterfaceC23174z[] interfaceC23174zArr3 = (InterfaceC23174z[]) arrayList2.toArray(new InterfaceC23174z[i18]);
        this.f49496i = interfaceC23174zArr3;
        this.f49491d.getClass();
        this.f49497j = new C23155f(interfaceC23174zArr3);
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void discardBuffer(long j12, boolean z12) {
        for (InterfaceC23174z interfaceC23174z : this.f49496i) {
            interfaceC23174z.discardBuffer(j12, z12);
        }
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
    public final void e(InterfaceC23174z interfaceC23174z) {
        ArrayList<InterfaceC23174z> arrayList = this.f49492e;
        arrayList.remove(interfaceC23174z);
        if (arrayList.isEmpty()) {
            InterfaceC23174z[] interfaceC23174zArr = this.f49489b;
            int i12 = 0;
            for (InterfaceC23174z interfaceC23174z2 : interfaceC23174zArr) {
                i12 += interfaceC23174z2.getTrackGroups().f49708b;
            }
            androidx.media3.common.Q[] qArr = new androidx.media3.common.Q[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < interfaceC23174zArr.length; i14++) {
                Y trackGroups = interfaceC23174zArr[i14].getTrackGroups();
                int i15 = trackGroups.f49708b;
                int i16 = 0;
                while (i16 < i15) {
                    androidx.media3.common.Q qA2 = trackGroups.a(i16);
                    androidx.media3.common.Q qA3 = qA2.a(i14 + ":" + qA2.f47440c);
                    this.f49493f.put(qA3, qA2);
                    qArr[i13] = qA3;
                    i16++;
                    i13++;
                }
            }
            this.f49495h = new Y(qArr);
            InterfaceC23174z.a aVar = this.f49494g;
            aVar.getClass();
            aVar.e(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void f(InterfaceC23174z.a aVar, long j12) {
        this.f49494g = aVar;
        ArrayList<InterfaceC23174z> arrayList = this.f49492e;
        InterfaceC23174z[] interfaceC23174zArr = this.f49489b;
        Collections.addAll(arrayList, interfaceC23174zArr);
        for (InterfaceC23174z interfaceC23174z : interfaceC23174zArr) {
            interfaceC23174z.f(this, j12);
        }
    }

    @Override // androidx.media3.exoplayer.source.Q.a
    public final void g(Q q12) {
        InterfaceC23174z.a aVar = this.f49494g;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        return this.f49497j.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        return this.f49497j.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final Y getTrackGroups() {
        Y y12 = this.f49495h;
        y12.getClass();
        return y12;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long i(long j12, g0 g0Var) {
        InterfaceC23174z[] interfaceC23174zArr = this.f49496i;
        return (interfaceC23174zArr.length > 0 ? interfaceC23174zArr[0] : this.f49489b[0]).i(j12, g0Var);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        return this.f49497j.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void maybeThrowPrepareError() {
        for (InterfaceC23174z interfaceC23174z : this.f49489b) {
            interfaceC23174z.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long readDiscontinuity() {
        long j12 = -9223372036854775807L;
        for (InterfaceC23174z interfaceC23174z : this.f49496i) {
            long discontinuity = interfaceC23174z.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j12 != -9223372036854775807L && interfaceC23174z.seekToUs(j12) != j12) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j12 == -9223372036854775807L) {
                for (InterfaceC23174z interfaceC23174z2 : this.f49496i) {
                    if (interfaceC23174z2 == interfaceC23174z) {
                        break;
                    }
                    if (interfaceC23174z2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j12 = discontinuity;
            } else if (discontinuity != j12) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
        this.f49497j.reevaluateBuffer(j12);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long seekToUs(long j12) {
        long jSeekToUs = this.f49496i[0].seekToUs(j12);
        int i12 = 1;
        while (true) {
            InterfaceC23174z[] interfaceC23174zArr = this.f49496i;
            if (i12 >= interfaceC23174zArr.length) {
                return jSeekToUs;
            }
            if (interfaceC23174zArr[i12].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i12++;
        }
    }
}
