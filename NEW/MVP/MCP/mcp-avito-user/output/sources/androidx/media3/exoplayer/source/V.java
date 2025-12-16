package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C23108t;
import androidx.media3.datasource.j;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes.dex */
final class V implements InterfaceC23174z, Loader.b<c> {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.datasource.o f49669b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f49670c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final androidx.media3.datasource.B f49671d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49672e;

    /* renamed from: f, reason: collision with root package name */
    public final D.a f49673f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f49674g;

    /* renamed from: i, reason: collision with root package name */
    public final long f49676i;

    /* renamed from: k, reason: collision with root package name */
    public final C23108t f49678k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f49679l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f49680m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f49681n;

    /* renamed from: o, reason: collision with root package name */
    public int f49682o;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<b> f49675h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    public final Loader f49677j = new Loader("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    public final class b implements P {

        /* renamed from: b, reason: collision with root package name */
        public int f49683b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f49684c;

        public b(a aVar) {
        }

        public final void a() {
            if (this.f49684c) {
                return;
            }
            V v12 = V.this;
            v12.f49673f.a(new C23171w(1, androidx.media3.common.D.f(v12.f49678k.f47757m), v12.f49678k, 0, androidx.media3.common.util.M.Q(0L), -9223372036854775807L));
            this.f49684c = true;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            a();
            if (j12 <= 0 || this.f49683b == 2) {
                return 0;
            }
            this.f49683b = 2;
            return 1;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() throws IOException {
            V v12 = V.this;
            if (v12.f49679l) {
                return;
            }
            v12.f49677j.c(BeduinInputModel.MIN_TEXT_VERSION);
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            a();
            V v12 = V.this;
            boolean z12 = v12.f49680m;
            if (z12 && v12.f49681n == null) {
                this.f49683b = 2;
            }
            int i13 = this.f49683b;
            if (i13 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i12 & 2) != 0 || i13 == 0) {
                f12.f48506b = v12.f49678k;
                this.f49683b = 1;
                return -5;
            }
            if (!z12) {
                return -3;
            }
            v12.f49681n.getClass();
            decoderInputBuffer.e(1);
            decoderInputBuffer.f48325f = 0L;
            if ((i12 & 4) == 0) {
                decoderInputBuffer.j(v12.f49682o);
                decoderInputBuffer.f48323d.put(v12.f49681n, 0, v12.f49682o);
            }
            if ((i12 & 1) == 0) {
                this.f49683b = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            return V.this.f49680m;
        }
    }

    public V(androidx.media3.datasource.o oVar, j.a aVar, @j.P androidx.media3.datasource.B b12, C23108t c23108t, long j12, androidx.media3.exoplayer.upstream.l lVar, D.a aVar2, boolean z12) {
        this.f49669b = oVar;
        this.f49670c = aVar;
        this.f49671d = b12;
        this.f49678k = c23108t;
        this.f49676i = j12;
        this.f49672e = lVar;
        this.f49673f = aVar2;
        this.f49679l = z12;
        this.f49674g = new Y(new androidx.media3.common.Q("", c23108t));
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        if (this.f49680m) {
            return false;
        }
        Loader loader = this.f49677j;
        if (loader.b() || loader.f50049c != null) {
            return false;
        }
        androidx.media3.datasource.j jVarA = this.f49670c.a();
        androidx.media3.datasource.B b12 = this.f49671d;
        if (b12 != null) {
            jVarA.j(b12);
        }
        androidx.media3.datasource.o oVar = this.f49669b;
        c cVar = new c(jVarA, oVar);
        loader.e(cVar, this, this.f49672e.a(1));
        C23167s c23167s = new C23167s(cVar.f49686a, oVar);
        this.f49673f.e(c23167s, new C23171w(1, -1, this.f49678k, 0, androidx.media3.common.util.M.Q(0L), androidx.media3.common.util.M.Q(this.f49676i)));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
        for (int i12 = 0; i12 < kVarArr.length; i12++) {
            P p12 = pArr[i12];
            ArrayList<b> arrayList = this.f49675h;
            if (p12 != null && (kVarArr[i12] == null || !zArr[i12])) {
                arrayList.remove(p12);
                pArr[i12] = null;
            }
            if (pArr[i12] == null && kVarArr[i12] != null) {
                b bVar = new b(null);
                arrayList.add(bVar);
                pArr[i12] = bVar;
                zArr2[i12] = true;
            }
        }
        return j12;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void f(InterfaceC23174z.a aVar, long j12) {
        aVar.e(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j12, long j13) {
        c cVar = (c) eVar;
        this.f49682o = (int) cVar.f49688c.f48319b;
        byte[] bArr = cVar.f49689d;
        bArr.getClass();
        this.f49681n = bArr;
        this.f49680m = true;
        androidx.media3.datasource.z zVar = cVar.f49688c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(cVar.f49686a, zVar.f48321d);
        this.f49672e.getClass();
        this.f49673f.c(c23167s, new C23171w(1, -1, this.f49678k, 0, androidx.media3.common.util.M.Q(0L), androidx.media3.common.util.M.Q(this.f49676i)));
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        return this.f49680m ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        return (this.f49680m || this.f49677j.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final Y getTrackGroups() {
        return this.f49674g;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c h(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        Loader.c cVar;
        c cVar2 = (c) eVar;
        androidx.media3.datasource.z zVar = cVar2.f49688c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(cVar2.f49686a, zVar.f48321d);
        long j14 = this.f49676i;
        androidx.media3.common.util.M.Q(j14);
        l.d dVar = new l.d(iOException, i12);
        androidx.media3.exoplayer.upstream.l lVar = this.f49672e;
        long jB2 = lVar.b(dVar);
        boolean z12 = jB2 == -9223372036854775807L || i12 >= lVar.a(1);
        if (this.f49679l && z12) {
            androidx.media3.common.util.s.h("Loading failed, treating as end-of-stream.", iOException);
            this.f49680m = true;
            cVar = Loader.f50045d;
        } else if (jB2 != -9223372036854775807L) {
            Loader.c cVar3 = Loader.f50045d;
            cVar = new Loader.c(0, jB2, null);
        } else {
            cVar = Loader.f50046e;
        }
        int i13 = cVar.f50050a;
        this.f49673f.d(c23167s, new C23171w(1, -1, this.f49678k, 0, androidx.media3.common.util.M.Q(0L), androidx.media3.common.util.M.Q(j14)), iOException, !(i13 == 0 || i13 == 1));
        return cVar;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        return this.f49677j.b();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13, boolean z12) {
        c cVar = (c) eVar;
        androidx.media3.datasource.z zVar = cVar.f49688c;
        Uri uri = zVar.f48320c;
        C23167s c23167s = new C23167s(cVar.f49686a, zVar.f48321d);
        this.f49672e.getClass();
        this.f49673f.b(c23167s, new C23171w(1, -1, null, 0, androidx.media3.common.util.M.Q(0L), androidx.media3.common.util.M.Q(this.f49676i)));
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long seekToUs(long j12) {
        int i12 = 0;
        while (true) {
            ArrayList<b> arrayList = this.f49675h;
            if (i12 >= arrayList.size()) {
                return j12;
            }
            b bVar = arrayList.get(i12);
            if (bVar.f49683b == 2) {
                bVar.f49683b = 1;
            }
            i12++;
        }
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    public static final class c implements Loader.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f49686a = C23167s.f49826b.getAndIncrement();

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.datasource.o f49687b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.datasource.z f49688c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public byte[] f49689d;

        public c(androidx.media3.datasource.j jVar, androidx.media3.datasource.o oVar) {
            this.f49687b = oVar;
            this.f49688c = new androidx.media3.datasource.z(jVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void load() {
            androidx.media3.datasource.z zVar = this.f49688c;
            zVar.f48319b = 0L;
            try {
                zVar.e(this.f49687b);
                int i12 = 0;
                while (i12 != -1) {
                    int i13 = (int) zVar.f48319b;
                    byte[] bArr = this.f49689d;
                    if (bArr == null) {
                        this.f49689d = new byte[1024];
                    } else if (i13 == bArr.length) {
                        this.f49689d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f49689d;
                    i12 = zVar.read(bArr2, i13, bArr2.length - i13);
                }
                androidx.media3.datasource.n.a(zVar);
            } catch (Throwable th2) {
                androidx.media3.datasource.n.a(zVar);
                throw th2;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void a() {
        }
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void discardBuffer(long j12, boolean z12) {
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long i(long j12, g0 g0Var) {
        return j12;
    }
}
