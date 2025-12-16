package androidx.media3.exoplayer.source.ads;

import android.util.Pair;
import androidx.media3.common.P;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.z;
import androidx.media3.datasource.B;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23150a;
import androidx.media3.exoplayer.source.AbstractC23166q;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.source.C23171w;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.InterfaceC23174z;
import androidx.media3.exoplayer.source.P;
import androidx.media3.exoplayer.source.Q;
import androidx.media3.exoplayer.source.Y;
import androidx.media3.exoplayer.trackselection.k;
import java.io.IOException;

/* compiled from: ServerSideAdInsertionMediaSource.java */
@J
/* loaded from: classes.dex */
public final class b extends AbstractC23150a implements A.c, D, f {

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public interface a {
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    /* renamed from: androidx.media3.exoplayer.source.ads.b$b, reason: collision with other inner class name */
    public static final class C1835b implements InterfaceC23174z {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC23174z.a f49731b;

        /* renamed from: c, reason: collision with root package name */
        public boolean[] f49732c;

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean continueLoading(long j12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long d(k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12) {
            if (this.f49732c.length == 0) {
                this.f49732c = new boolean[pArr.length];
            }
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void discardBuffer(long j12, boolean z12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void f(InterfaceC23174z.a aVar, long j12) {
            this.f49731b = aVar;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getBufferedPositionUs() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final long getNextLoadPositionUs() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final Y getTrackGroups() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long i(long j12, g0 g0Var) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final boolean isLoading() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final void maybeThrowPrepareError() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long readDiscontinuity() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q
        public final void reevaluateBuffer(long j12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.InterfaceC23174z
        public final long seekToUs(long j12) {
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class c implements P {
        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class d extends AbstractC23166q {
        public d() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            super.n(i12, bVar, true);
            Object obj = bVar.f47380c;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC23166q, androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            super.u(i12, dVar, j12);
            n(dVar.f47421p, new P.b(), true);
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class e implements InterfaceC23174z.a {
        @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
        public final void e(InterfaceC23174z interfaceC23174z) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.Q.a
        public final void g(Q q12) {
        }
    }

    @j.P
    public static void D(@j.P A.b bVar) {
        if (bVar == null) {
            return;
        }
        new Pair(Long.valueOf(bVar.f47215d), bVar.f47212a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void A(int i12, @j.P A.b bVar, int i13) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void B(int i12, @j.P A.b bVar, Exception exc) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void C() {
        synchronized (this) {
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final InterfaceC23174z e(A.b bVar, androidx.media3.exoplayer.upstream.b bVar2, long j12) {
        new Pair(Long.valueOf(bVar.f47215d), bVar.f47212a);
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void f(int i12, @j.P A.b bVar) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final z getMediaItem() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void h(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void k(InterfaceC23174z interfaceC23174z) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void l(int i12, @j.P A.b bVar) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A.c
    public final void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void maybeThrowSourceInfoRefreshError() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void n(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void o(int i12, @j.P A.b bVar) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void r(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w, IOException iOException, boolean z12) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void t() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void u(int i12, @j.P A.b bVar, C23171w c23171w) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void v() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void x(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        D(bVar);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC23150a
    public final void y(@j.P B b12) {
        M.n(null);
        synchronized (this) {
        }
        throw null;
    }
}
