package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36605v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes6.dex */
final class S implements InterfaceC36559w, Loader.b<c> {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.p f346111b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36583m.a f346112c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final com.google.android.exoplayer2.upstream.M f346113d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.z f346114e;

    /* renamed from: f, reason: collision with root package name */
    public final A.a f346115f;

    /* renamed from: g, reason: collision with root package name */
    public final W f346116g;

    /* renamed from: i, reason: collision with root package name */
    public final long f346118i;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.I f346120k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f346121l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f346122m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f346123n;

    /* renamed from: o, reason: collision with root package name */
    public int f346124o;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f346117h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final Loader f346119j = new Loader("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    public final class b implements M {

        /* renamed from: b, reason: collision with root package name */
        public int f346125b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f346126c;

        public b(a aVar) {
        }

        public final void a() {
            if (this.f346126c) {
                return;
            }
            S s5 = S.this;
            A.a aVar = s5.f346115f;
            aVar.c(new C36557u(1, com.google.android.exoplayer2.util.z.i(s5.f346120k.f343476m), s5.f346120k, 0, null, aVar.b(0L), -9223372036854775807L));
            this.f346126c = true;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            a();
            if (j12 <= 0 || this.f346125b == 2) {
                return 0;
            }
            this.f346125b = 2;
            return 1;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() throws IOException {
            S s5 = S.this;
            if (s5.f346121l) {
                return;
            }
            s5.f346119j.d(BeduinInputModel.MIN_TEXT_VERSION);
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            a();
            S s5 = S.this;
            boolean z12 = s5.f346122m;
            if (z12 && s5.f346123n == null) {
                this.f346125b = 2;
            }
            int i13 = this.f346125b;
            if (i13 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i12 & 2) != 0 || i13 == 0) {
                j12.f343521b = s5.f346120k;
                this.f346125b = 1;
                return -5;
            }
            if (!z12) {
                return -3;
            }
            s5.f346123n.getClass();
            decoderInputBuffer.e(1);
            decoderInputBuffer.f344207f = 0L;
            if ((i12 & 4) == 0) {
                decoderInputBuffer.j(s5.f346124o);
                decoderInputBuffer.f344205d.put(s5.f346123n, 0, s5.f346124o);
            }
            if ((i12 & 1) == 0) {
                this.f346125b = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            return S.this.f346122m;
        }
    }

    public S(com.google.android.exoplayer2.upstream.p pVar, InterfaceC36583m.a aVar, @j.P com.google.android.exoplayer2.upstream.M m12, com.google.android.exoplayer2.I i12, long j12, com.google.android.exoplayer2.upstream.z zVar, A.a aVar2, boolean z12) {
        this.f346111b = pVar;
        this.f346112c = aVar;
        this.f346113d = m12;
        this.f346120k = i12;
        this.f346118i = j12;
        this.f346114e = zVar;
        this.f346115f = aVar2;
        this.f346121l = z12;
        this.f346116g = new W(new V("", i12));
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        if (this.f346122m) {
            return false;
        }
        Loader loader = this.f346119j;
        if (loader.c() || loader.f347764c != null) {
            return false;
        }
        InterfaceC36583m interfaceC36583mA = this.f346112c.a();
        com.google.android.exoplayer2.upstream.M m12 = this.f346113d;
        if (m12 != null) {
            interfaceC36583mA.k(m12);
        }
        com.google.android.exoplayer2.upstream.p pVar = this.f346111b;
        c cVar = new c(interfaceC36583mA, pVar);
        loader.f(cVar, this, this.f346114e.a(1));
        this.f346115f.k(new C36554q(cVar.f346128a, pVar), 1, -1, this.f346120k, 0, null, 0L, this.f346118i);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void e(InterfaceC36559w.a aVar, long j12) {
        aVar.c(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
        for (int i12 = 0; i12 < kVarArr.length; i12++) {
            M m12 = mArr[i12];
            ArrayList<b> arrayList = this.f346117h;
            if (m12 != null && (kVarArr[i12] == null || !zArr[i12])) {
                arrayList.remove(m12);
                mArr[i12] = null;
            }
            if (mArr[i12] == null && kVarArr[i12] != null) {
                b bVar = new b(null);
                arrayList.add(bVar);
                mArr[i12] = bVar;
                zArr2[i12] = true;
            }
        }
        return j12;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        return this.f346122m ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        return (this.f346122m || this.f346119j.c()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        return this.f346116g;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        c cVar = (c) eVar;
        com.google.android.exoplayer2.upstream.J j14 = cVar.f346130c;
        Uri uri = j14.f347753c;
        C36554q c36554q = new C36554q(cVar.f346128a, j14.f347754d);
        this.f346114e.getClass();
        this.f346115f.d(c36554q, 1, -1, null, 0, null, 0L, this.f346118i);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        return this.f346119j.c();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13) {
        c cVar = (c) eVar;
        this.f346124o = (int) cVar.f346130c.f347752b;
        byte[] bArr = cVar.f346131d;
        bArr.getClass();
        this.f346123n = bArr;
        this.f346122m = true;
        com.google.android.exoplayer2.upstream.J j14 = cVar.f346130c;
        Uri uri = j14.f347753c;
        C36554q c36554q = new C36554q(cVar.f346128a, j14.f347754d);
        this.f346114e.getClass();
        this.f346115f.f(c36554q, 1, -1, this.f346120k, 0, null, 0L, this.f346118i);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        Loader.c cVarB;
        c cVar = (c) eVar;
        com.google.android.exoplayer2.upstream.J j14 = cVar.f346130c;
        Uri uri = j14.f347753c;
        C36554q c36554q = new C36554q(cVar.f346128a, j14.f347754d);
        com.google.android.exoplayer2.util.U.R(this.f346118i);
        z.d dVar = new z.d(iOException, i12);
        com.google.android.exoplayer2.upstream.z zVar = this.f346114e;
        long jB2 = zVar.b(dVar);
        boolean z12 = jB2 == -9223372036854775807L || i12 >= zVar.a(1);
        if (this.f346121l && z12) {
            C36605v.a("Loading failed, treating as end-of-stream.", iOException);
            this.f346122m = true;
            cVarB = Loader.f347760e;
        } else {
            cVarB = jB2 != -9223372036854775807L ? Loader.b(jB2, false) : Loader.f347761f;
        }
        Loader.c cVar2 = cVarB;
        int i13 = cVar2.f347765a;
        this.f346115f.h(c36554q, 1, -1, this.f346120k, 0, null, 0L, this.f346118i, iOException, !(i13 == 0 || i13 == 1));
        return cVar2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long seekToUs(long j12) {
        int i12 = 0;
        while (true) {
            ArrayList<b> arrayList = this.f346117h;
            if (i12 >= arrayList.size()) {
                return j12;
            }
            b bVar = arrayList.get(i12);
            if (bVar.f346125b == 2) {
                bVar.f346125b = 1;
            }
            i12++;
        }
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    public static final class c implements Loader.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f346128a = C36554q.f346661b.getAndIncrement();

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.p f346129b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.J f346130c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public byte[] f346131d;

        public c(InterfaceC36583m interfaceC36583m, com.google.android.exoplayer2.upstream.p pVar) {
            this.f346129b = pVar;
            this.f346130c = new com.google.android.exoplayer2.upstream.J(interfaceC36583m);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void load() {
            com.google.android.exoplayer2.upstream.J j12 = this.f346130c;
            j12.f347752b = 0L;
            try {
                j12.e(this.f346129b);
                int i12 = 0;
                while (i12 != -1) {
                    int i13 = (int) j12.f347752b;
                    byte[] bArr = this.f346131d;
                    if (bArr == null) {
                        this.f346131d = new byte[1024];
                    } else if (i13 == bArr.length) {
                        this.f346131d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f346131d;
                    i12 = j12.read(bArr2, i13, bArr2.length - i13);
                }
                com.google.android.exoplayer2.upstream.o.a(j12);
            } catch (Throwable th2) {
                com.google.android.exoplayer2.upstream.o.a(j12);
                throw th2;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public final void a() {
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        return j12;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
    }
}
