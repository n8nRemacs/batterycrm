package com.google.android.exoplayer2.source.ads;

import android.util.Pair;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.AbstractC36552o;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.M;
import com.google.android.exoplayer2.source.N;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.trackselection.k;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;

/* compiled from: ServerSideAdInsertionMediaSource.java */
/* loaded from: classes6.dex */
public final class d extends AbstractC36538a implements y.c, A, com.google.android.exoplayer2.drm.e {

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public interface a {
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class b implements InterfaceC36559w {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC36559w.a f346198b;

        /* renamed from: c, reason: collision with root package name */
        public boolean[] f346199c;

        @Override // com.google.android.exoplayer2.source.N
        public final boolean continueLoading(long j12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long d(long j12, l0 l0Var) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void discardBuffer(long j12, boolean z12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void e(InterfaceC36559w.a aVar, long j12) {
            this.f346198b = aVar;
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long f(k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
            if (this.f346199c.length == 0) {
                this.f346199c = new boolean[mArr.length];
            }
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getBufferedPositionUs() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getNextLoadPositionUs() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final W getTrackGroups() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final boolean isLoading() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void maybeThrowPrepareError() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long readDiscontinuity() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final void reevaluateBuffer(long j12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long seekToUs(long j12) {
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class c implements M {
        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.ads.d$d, reason: collision with other inner class name */
    public static final class C10594d extends AbstractC36552o {
        public C10594d() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.b f(int i12, s0.b bVar, boolean z12) {
            super.f(i12, bVar, true);
            Object obj = bVar.f345871c;
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36552o, com.google.android.exoplayer2.s0
        public final s0.d m(int i12, s0.d dVar, long j12) {
            super.m(i12, dVar, j12);
            f(dVar.f345894p, new s0.b(), true);
            throw null;
        }
    }

    /* compiled from: ServerSideAdInsertionMediaSource.java */
    public static final class e implements InterfaceC36559w.a {
        @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
        public final void c(InterfaceC36559w interfaceC36559w) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.N.a
        public final void g(N n12) {
        }
    }

    @P
    public static void E(@P y.b bVar) {
        if (bVar == null) {
            return;
        }
        new Pair(Long.valueOf(bVar.f346699d), bVar.f346696a);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void A() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@P com.google.android.exoplayer2.upstream.M m12) {
        U.n(null);
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
        synchronized (this) {
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        new Pair(Long.valueOf(bVar.f346699d), bVar.f346696a);
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void d(int i12, y.b bVar, C36557u c36557u) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void e(int i12, @P y.b bVar, int i13) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void f(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u, IOException iOException, boolean z12) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void g(int i12, @P y.b bVar) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final O getMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void i(int i12, @P y.b bVar, Exception exc) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void k(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void l(int i12, @P y.b bVar) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void m(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void p(int i12, @P y.b bVar) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void q(int i12, @P y.b bVar, C36557u c36557u) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.A
    public final void r(int i12, @P y.b bVar, C36554q c36554q, C36557u c36557u) {
        E(bVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y.c
    public final void v(AbstractC36538a abstractC36538a, s0 s0Var) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void z() {
        throw null;
    }
}
