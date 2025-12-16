package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import java.util.ArrayList;

/* compiled from: SilenceMediaSource.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class T extends AbstractC23150a {

    /* renamed from: k, reason: collision with root package name */
    public static final C23108t f49650k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f49651l;

    /* renamed from: i, reason: collision with root package name */
    public final long f49652i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.z f49653j;

    /* compiled from: SilenceMediaSource.java */
    public static final class b {
    }

    static {
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = "audio/raw";
        bVar.f47800x = 2;
        bVar.f47801y = 44100;
        bVar.f47802z = 2;
        C23108t c23108tA = bVar.a();
        f49650k = c23108tA;
        z.c cVar = new z.c();
        cVar.f47988a = "SilenceMediaSource";
        cVar.f47989b = Uri.EMPTY;
        cVar.f47990c = c23108tA.f47757m;
        cVar.a();
        int i12 = androidx.media3.common.util.M.f47887a;
        f49651l = new byte[4096];
    }

    public T(long j12, androidx.media3.common.z zVar, a aVar) {
        C23110a.b(j12 >= 0);
        this.f49652i = j12;
        this.f49653j = zVar;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        return new c(this.f49652i);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final androidx.media3.common.z getMediaItem() {
        return this.f49653j;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P androidx.media3.datasource.B b12) {
        z(new U(this.f49652i, true, false, this.f49653j));
    }

    /* compiled from: SilenceMediaSource.java */
    public static final class c implements InterfaceC23174z {

        /* renamed from: d, reason: collision with root package name */
        public static final Y f49654d = new Y(new androidx.media3.common.Q("", T.f49650k));

        /* renamed from: b, reason: collision with root package name */
        public final long f49655b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<P> f49656c = new ArrayList<>();

        public c(long j12) {
            this.f49655b = j12;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean continueLoading(long j12) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
            long jL2 = androidx.media3.common.util.M.l(j12, 0L, this.f49655b);
            for (int i12 = 0; i12 < kVarArr.length; i12++) {
                P p12 = pArr[i12];
                ArrayList<P> arrayList = this.f49656c;
                if (p12 != null && (kVarArr[i12] == null || !zArr[i12])) {
                    arrayList.remove(p12);
                    pArr[i12] = null;
                }
                if (pArr[i12] == null && kVarArr[i12] != null) {
                    d dVar = new d(this.f49655b);
                    dVar.a(jL2);
                    arrayList.add(dVar);
                    pArr[i12] = dVar;
                    zArr2[i12] = true;
                }
            }
            return jL2;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void f(InterfaceC23174z.a aVar, long j12) {
            aVar.e(this);
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final Y getTrackGroups() {
            return f49654d;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long i(long j12, g0 g0Var) {
            return androidx.media3.common.util.M.l(j12, 0L, this.f49655b);
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long seekToUs(long j12) {
            long jL2 = androidx.media3.common.util.M.l(j12, 0L, this.f49655b);
            int i12 = 0;
            while (true) {
                ArrayList<P> arrayList = this.f49656c;
                if (i12 >= arrayList.size()) {
                    return jL2;
                }
                ((d) arrayList.get(i12)).a(jL2);
                i12++;
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
    }

    /* compiled from: SilenceMediaSource.java */
    public static final class d implements P {

        /* renamed from: b, reason: collision with root package name */
        public final long f49657b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f49658c;

        /* renamed from: d, reason: collision with root package name */
        public long f49659d;

        public d(long j12) {
            C23108t c23108t = T.f49650k;
            int i12 = androidx.media3.common.util.M.f47887a;
            this.f49657b = 4 * ((j12 * 44100) / 1000000);
            a(0L);
        }

        public final void a(long j12) {
            C23108t c23108t = T.f49650k;
            int i12 = androidx.media3.common.util.M.f47887a;
            this.f49659d = androidx.media3.common.util.M.l(4 * ((j12 * 44100) / 1000000), 0L, this.f49657b);
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            long j13 = this.f49659d;
            a(j12);
            return (int) ((this.f49659d - j13) / T.f49651l.length);
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            if (!this.f49658c || (i12 & 2) != 0) {
                f12.f48506b = T.f49650k;
                this.f49658c = true;
                return -5;
            }
            long j12 = this.f49659d;
            long j13 = this.f49657b - j12;
            if (j13 == 0) {
                decoderInputBuffer.e(4);
                return -4;
            }
            C23108t c23108t = T.f49650k;
            int i13 = androidx.media3.common.util.M.f47887a;
            decoderInputBuffer.f48325f = ((j12 / 4) * 1000000) / 44100;
            decoderInputBuffer.e(1);
            byte[] bArr = T.f49651l;
            int iMin = (int) Math.min(bArr.length, j13);
            if ((4 & i12) == 0) {
                decoderInputBuffer.j(iMin);
                decoderInputBuffer.f48323d.put(bArr, 0, iMin);
            }
            if ((i12 & 1) == 0) {
                this.f49659d += iMin;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() {
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
    }
}
