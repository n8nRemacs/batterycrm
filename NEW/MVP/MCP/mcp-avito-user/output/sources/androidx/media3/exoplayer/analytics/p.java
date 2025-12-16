package androidx.media3.exoplayer.analytics;

import Ba1.B;
import Fc1.G3;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.C23108t;
import androidx.media3.common.G;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.S;
import androidx.media3.common.U;
import androidx.media3.common.V;
import androidx.media3.common.X;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.InterfaceC23123n;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.r;
import androidx.media3.common.z;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.source.C23171w;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.base.F;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.W1;
import j.InterfaceC42153i;
import java.io.IOException;
import java.util.List;

/* compiled from: DefaultAnalyticsCollector.java */
@J
/* loaded from: classes.dex */
public class p implements androidx.media3.exoplayer.analytics.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC23115f f48686b;

    /* renamed from: c, reason: collision with root package name */
    public final P.b f48687c;

    /* renamed from: d, reason: collision with root package name */
    public final P.d f48688d;

    /* renamed from: e, reason: collision with root package name */
    public final a f48689e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray<b.C1823b> f48690f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.media3.common.util.r<b> f48691g;

    /* renamed from: h, reason: collision with root package name */
    public H f48692h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC23123n f48693i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48694j;

    /* compiled from: DefaultAnalyticsCollector.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final P.b f48695a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC37401r1<A.b> f48696b = AbstractC37401r1.C();

        /* renamed from: c, reason: collision with root package name */
        public AbstractC37412t1<A.b, P> f48697c = AbstractC37412t1.n();

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public A.b f48698d;

        /* renamed from: e, reason: collision with root package name */
        public A.b f48699e;

        /* renamed from: f, reason: collision with root package name */
        public A.b f48700f;

        public a(P.b bVar) {
            this.f48695a = bVar;
        }

        @j.P
        public static A.b b(H h12, AbstractC37401r1<A.b> abstractC37401r1, @j.P A.b bVar, P.b bVar2) {
            P currentTimeline = h12.getCurrentTimeline();
            int currentPeriodIndex = h12.getCurrentPeriodIndex();
            Object objT = currentTimeline.x() ? null : currentTimeline.t(currentPeriodIndex);
            int iB2 = (h12.isPlayingAd() || currentTimeline.x()) ? -1 : currentTimeline.n(currentPeriodIndex, bVar2, false).b(M.F(h12.getCurrentPosition()) - bVar2.f47383f);
            for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                A.b bVar3 = abstractC37401r1.get(i12);
                if (c(bVar3, objT, h12.isPlayingAd(), h12.getCurrentAdGroupIndex(), h12.getCurrentAdIndexInAdGroup(), iB2)) {
                    return bVar3;
                }
            }
            if (abstractC37401r1.isEmpty() && bVar != null) {
                if (c(bVar, objT, h12.isPlayingAd(), h12.getCurrentAdGroupIndex(), h12.getCurrentAdIndexInAdGroup(), iB2)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(A.b bVar, @j.P Object obj, boolean z12, int i12, int i13, int i14) {
            if (!bVar.f47212a.equals(obj)) {
                return false;
            }
            int i15 = bVar.f47213b;
            return (z12 && i15 == i12 && bVar.f47214c == i13) || (!z12 && i15 == -1 && bVar.f47216e == i14);
        }

        public final void a(AbstractC37412t1.b<A.b, P> bVar, @j.P A.b bVar2, P p12) {
            if (bVar2 == null) {
                return;
            }
            if (p12.g(bVar2.f47212a) != -1) {
                bVar.c(bVar2, p12);
                return;
            }
            P p13 = this.f48697c.get(bVar2);
            if (p13 != null) {
                bVar.c(bVar2, p13);
            }
        }

        public final void d(P p12) {
            AbstractC37412t1.b<A.b, P> bVarA = AbstractC37412t1.a();
            if (this.f48696b.isEmpty()) {
                a(bVarA, this.f48699e, p12);
                if (!F.a(this.f48700f, this.f48699e)) {
                    a(bVarA, this.f48700f, p12);
                }
                if (!F.a(this.f48698d, this.f48699e) && !F.a(this.f48698d, this.f48700f)) {
                    a(bVarA, this.f48698d, p12);
                }
            } else {
                for (int i12 = 0; i12 < this.f48696b.size(); i12++) {
                    a(bVarA, this.f48696b.get(i12), p12);
                }
                if (!this.f48696b.contains(this.f48698d)) {
                    a(bVarA, this.f48698d, p12);
                }
            }
            this.f48697c = bVarA.b();
        }
    }

    public p(InterfaceC23115f interfaceC23115f) {
        interfaceC23115f.getClass();
        this.f48686b = interfaceC23115f;
        int i12 = M.f47887a;
        Looper looperMyLooper = Looper.myLooper();
        this.f48691g = new androidx.media3.common.util.r<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC23115f, new S(28));
        P.b bVar = new P.b();
        this.f48687c = bVar;
        this.f48688d = new P.d();
        this.f48689e = new a(bVar);
        this.f48690f = new SparseArray<>();
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void A(int i12, @j.P A.b bVar, int i13) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1022, new d(c1823bI, i13, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @InterfaceC42153i
    public final void Ac(s sVar) {
        this.f48691g.a(sVar);
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void B(int i12, @j.P A.b bVar, Exception exc) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1024, new B(5, c1823bI, exc));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void Bc(List<A.b> list, @j.P A.b bVar) {
        H h12 = this.f48692h;
        h12.getClass();
        a aVar = this.f48689e;
        aVar.getClass();
        aVar.f48696b = AbstractC37401r1.v(list);
        if (!list.isEmpty()) {
            aVar.f48699e = list.get(0);
            bVar.getClass();
            aVar.f48700f = bVar;
        }
        if (aVar.f48698d == null) {
            aVar.f48698d = a.b(h12, aVar.f48696b, aVar.f48699e, aVar.f48695a);
        }
        aVar.d(h12.getCurrentTimeline());
    }

    @Override // androidx.media3.common.H.g
    public final void D(C23091e c23091e) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 20, new B(10, c1823bJ, c23091e));
    }

    @Override // androidx.media3.common.H.g
    public final void E(androidx.media3.common.B b12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 15, new m(c1823bF, b12, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void E2(long j12, long j13, String str) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1016, new c(c1823bJ, str, j13, j12, 2));
    }

    public final b.C1823b F() {
        return H(this.f48689e.f48698d);
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void F2(int i12, long j12, long j13) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1011, new j(c1823bJ, i12, j12, j13, 0));
    }

    @v61.m
    public final b.C1823b G(P p12, int i12, @j.P A.b bVar) {
        A.b bVar2 = p12.x() ? null : bVar;
        long jA2 = this.f48686b.a();
        boolean z12 = p12.equals(this.f48692h.getCurrentTimeline()) && i12 == this.f48692h.getCurrentMediaItemIndex();
        long jQ2 = 0;
        if (bVar2 == null || !bVar2.a()) {
            if (z12) {
                jQ2 = this.f48692h.getContentPosition();
            } else if (!p12.x()) {
                jQ2 = M.Q(p12.u(i12, this.f48688d, 0L).f47419n);
            }
        } else if (z12 && this.f48692h.getCurrentAdGroupIndex() == bVar2.f47213b && this.f48692h.getCurrentAdIndexInAdGroup() == bVar2.f47214c) {
            jQ2 = this.f48692h.getCurrentPosition();
        }
        return new b.C1823b(jA2, p12, i12, bVar2, jQ2, this.f48692h.getCurrentTimeline(), this.f48692h.getCurrentMediaItemIndex(), this.f48689e.f48698d, this.f48692h.getCurrentPosition(), this.f48692h.getTotalBufferedDuration());
    }

    public final b.C1823b H(@j.P A.b bVar) {
        this.f48692h.getClass();
        P p12 = bVar == null ? null : this.f48689e.f48697c.get(bVar);
        if (bVar != null && p12 != null) {
            return G(p12, p12.o(bVar.f47212a, this.f48687c).f47381d, bVar);
        }
        int currentMediaItemIndex = this.f48692h.getCurrentMediaItemIndex();
        P currentTimeline = this.f48692h.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.w()) {
            currentTimeline = P.f47368b;
        }
        return G(currentTimeline, currentMediaItemIndex, null);
    }

    public final b.C1823b I(int i12, @j.P A.b bVar) {
        this.f48692h.getClass();
        if (bVar != null) {
            return this.f48689e.f48697c.get(bVar) != null ? H(bVar) : G(P.f47368b, i12, bVar);
        }
        P currentTimeline = this.f48692h.getCurrentTimeline();
        if (i12 >= currentTimeline.w()) {
            currentTimeline = P.f47368b;
        }
        return G(currentTimeline, i12, null);
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void I2(String str) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1019, new c(c1823bJ, str, 1));
    }

    public final b.C1823b J() {
        return H(this.f48689e.f48700f);
    }

    public final void K(b.C1823b c1823b, int i12, r.a<b> aVar) {
        this.f48690f.put(i12, c1823b);
        this.f48691g.f(i12, aVar);
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void L2(String str) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1012, new c(c1823bJ, str, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void R2(int i12, long j12) {
        b.C1823b c1823bH = H(this.f48689e.f48699e);
        K(c1823bH, 1021, new S(i12, j12, c1823bH));
    }

    @Override // androidx.media3.common.H.g
    public final void a(androidx.media3.common.text.b bVar) {
        b.C1823b c1823bF = F();
        K(c1823bF, 27, new S(c1823bF, bVar, 17));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void a2(long j12, Object obj) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 26, new B(c1823bJ, obj, j12));
    }

    @Override // androidx.media3.common.H.g
    public final void b(X x12) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 25, new B(13, c1823bJ, x12));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void b1(Exception exc) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1014, new S(c1823bJ, exc, 16));
    }

    @Override // androidx.media3.exoplayer.upstream.d.a
    public final void c(int i12, long j12, long j13) {
        a aVar = this.f48689e;
        b.C1823b c1823bH = H(aVar.f48696b.isEmpty() ? null : (A.b) W1.d(aVar.f48696b));
        K(c1823bH, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new f(c1823bH, i12, j12, j13, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void d(Metadata metadata) {
        b.C1823b c1823bF = F();
        K(c1823bF, 28, new B(11, c1823bF, metadata));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void d2(long j12, long j13, String str) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1008, new c(c1823bJ, str, j13, j12, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void e(androidx.media3.common.B b12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 14, new S(c1823bF, b12, 18));
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void f(int i12, @j.P A.b bVar) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1023, new e(c1823bI, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void f3(long j12) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1010, new S(c1823bJ, j12, 11, (byte) 0));
    }

    @Override // androidx.media3.common.H.g
    public final void g(PlaybackException playbackException) {
        C c12;
        b.C1823b c1823bF = (!(playbackException instanceof ExoPlaybackException) || (c12 = ((ExoPlaybackException) playbackException).f48503o) == null) ? F() : H(new A.b(c12));
        K(c1823bF, 10, new B(12, c1823bF, playbackException));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void g2(int i12, long j12) {
        b.C1823b c1823bH = H(this.f48689e.f48699e);
        K(c1823bH, 1018, new d(i12, j12, c1823bH));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void g3(Exception exc) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1030, new m(c1823bJ, exc, 2));
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void h(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1002, new S(c1823bI, c23167s, c23171w, 13));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void h3(C23138g c23138g) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1015, new e(c1823bJ, c23138g, 1));
    }

    @Override // androidx.media3.common.H.g
    public final void i(long j12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 17, new S(c1823bF, j12, 23, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void i3(C23108t c23108t, @j.P C23139h c23139h) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1017, new g(c1823bJ, c23108t, c23139h, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void j(V v12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 2, new B(7, c1823bF, v12));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void j3(C23138g c23138g) {
        b.C1823b c1823bH = H(this.f48689e.f48699e);
        K(c1823bH, 1020, new B(9, c1823bH, c23138g));
    }

    @Override // androidx.media3.common.H.g
    public final void k(C23104o c23104o) {
        b.C1823b c1823bF = F();
        K(c1823bF, 29, new S(c1823bF, c23104o, 29));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void k3(C23138g c23138g) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, ErrorCodes.IO_EXCEPTION, new e(c1823bJ, c23138g, 3));
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void l(int i12, @j.P A.b bVar) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1027, new e(c1823bI, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void l2(Exception exc) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1029, new S(c1823bJ, exc, 15));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void l3(C23108t c23108t, @j.P C23139h c23139h) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 1009, new g(c1823bJ, c23108t, c23139h, 1));
    }

    @Override // androidx.media3.common.H.g
    public final void m(G g12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 12, new B(6, c1823bF, g12));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void m3(C23138g c23138g) {
        b.C1823b c1823bH = H(this.f48689e.f48699e);
        K(c1823bH, 1013, new e(c1823bH, c23138g, 0));
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void n(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1001, new S(c1823bI, c23167s, c23171w, 14));
    }

    @Override // androidx.media3.exoplayer.drm.f
    public final void o(int i12, @j.P A.b bVar) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1025, new e(c1823bI, 4));
    }

    @Override // androidx.media3.common.H.g
    public final void onCues(List<androidx.media3.common.text.a> list) {
        b.C1823b c1823bF = F();
        K(c1823bF, 27, new l(c1823bF, list, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void onDeviceVolumeChanged(int i12, boolean z12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 30, new S(c1823bF, i12, z12));
    }

    @Override // androidx.media3.common.H.g
    public final void onIsLoadingChanged(boolean z12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 3, new h(c1823bF, z12, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void onIsPlayingChanged(boolean z12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 7, new h(c1823bF, z12, 1));
    }

    @Override // androidx.media3.common.H.g
    public final void onPlayWhenReadyChanged(boolean z12, int i12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 5, new k(c1823bF, z12, i12, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void onPlaybackStateChanged(int i12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 4, new d(c1823bF, i12, 5));
    }

    @Override // androidx.media3.common.H.g
    public final void onPlaybackSuppressionReasonChanged(int i12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 6, new d(c1823bF, i12, 4));
    }

    @Override // androidx.media3.common.H.g
    public final void onPlayerStateChanged(boolean z12, int i12) {
        b.C1823b c1823bF = F();
        K(c1823bF, -1, new S(c1823bF, z12, i12));
    }

    @Override // androidx.media3.common.H.g
    public final void onRepeatModeChanged(int i12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 8, new d(c1823bF, i12, 6));
    }

    @Override // androidx.media3.common.H.g
    public final void onShuffleModeEnabledChanged(boolean z12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 9, new h(c1823bF, z12, 2));
    }

    @Override // androidx.media3.common.H.g
    public final void onSkipSilenceEnabledChanged(boolean z12) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 23, new h(c1823bJ, z12, 3));
    }

    @Override // androidx.media3.common.H.g
    public final void onSurfaceSizeChanged(int i12, int i13) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 24, new o(c1823bJ, i12, i13, 0));
    }

    @Override // androidx.media3.common.H.g
    public final void onVolumeChanged(float f12) {
        b.C1823b c1823bJ = J();
        K(c1823bJ, 22, new i(f12, 0, c1823bJ));
    }

    @Override // androidx.media3.common.H.g
    public final void p(@j.P PlaybackException playbackException) {
        C c12;
        b.C1823b c1823bF = (!(playbackException instanceof ExoPlaybackException) || (c12 = ((ExoPlaybackException) playbackException).f48503o) == null) ? F() : H(new A.b(c12));
        K(c1823bF, 10, new S(c1823bF, playbackException, 26));
    }

    @Override // androidx.media3.common.H.g
    public final void q(long j12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 18, new S(c1823bF, j12, 20, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void r(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w, IOException iOException, boolean z12) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, ErrorCodes.MALFORMED_URL_EXCEPTION, new FX0.b(c1823bI, c23167s, c23171w, iOException, z12, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @InterfaceC42153i
    public final void release() {
        InterfaceC23123n interfaceC23123n = this.f48693i;
        C23110a.h(interfaceC23123n);
        interfaceC23123n.d(new G3(this, 14));
    }

    @Override // androidx.media3.common.H.g
    public final void s(H.c cVar) {
        b.C1823b c1823bF = F();
        K(c1823bF, 13, new S(c1823bF, cVar, 24));
    }

    @Override // androidx.media3.common.H.g
    public final void t(int i12, H.k kVar, H.k kVar2) {
        if (i12 == 1) {
            this.f48694j = false;
        }
        H h12 = this.f48692h;
        h12.getClass();
        a aVar = this.f48689e;
        aVar.f48698d = a.b(h12, aVar.f48696b, aVar.f48699e, aVar.f48695a);
        b.C1823b c1823bF = F();
        K(c1823bF, 11, new n(i12, c1823bF, 0, kVar, kVar2));
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void u(int i12, @j.P A.b bVar, C23171w c23171w) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, ErrorCodes.PROTOCOL_EXCEPTION, new B(8, c1823bI, c23171w));
    }

    @Override // androidx.media3.common.H.g
    public final void v(P p12, int i12) {
        H h12 = this.f48692h;
        h12.getClass();
        a aVar = this.f48689e;
        aVar.f48698d = a.b(h12, aVar.f48696b, aVar.f48699e, aVar.f48695a);
        aVar.d(h12.getCurrentTimeline());
        b.C1823b c1823bF = F();
        K(c1823bF, 0, new d(c1823bF, i12, 2));
    }

    @Override // androidx.media3.common.H.g
    public final void w(int i12, @j.P z zVar) {
        b.C1823b c1823bF = F();
        K(c1823bF, 1, new d(c1823bF, zVar, i12));
    }

    @Override // androidx.media3.exoplayer.source.D
    public final void x(int i12, @j.P A.b bVar, C23167s c23167s, C23171w c23171w) {
        b.C1823b c1823bI = I(i12, bVar);
        K(c1823bI, 1000, new m(c1823bI, c23167s, c23171w));
    }

    @Override // androidx.media3.common.H.g
    public final void y(long j12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 16, new S(c1823bF, j12, 19, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    public final void yc() {
        if (this.f48694j) {
            return;
        }
        b.C1823b c1823bF = F();
        this.f48694j = true;
        K(c1823bF, -1, new S(c1823bF, 10));
    }

    @Override // androidx.media3.common.H.g
    public final void z(U u12) {
        b.C1823b c1823bF = F();
        K(c1823bF, 19, new S(c1823bF, u12, 21));
    }

    @Override // androidx.media3.exoplayer.analytics.a
    @InterfaceC42153i
    public final void zc(H h12, Looper looper) {
        C23110a.g(this.f48692h == null || this.f48689e.f48696b.isEmpty());
        h12.getClass();
        this.f48692h = h12;
        this.f48693i = this.f48686b.b(looper, null);
        androidx.media3.common.util.r<b> rVar = this.f48691g;
        this.f48691g = new androidx.media3.common.util.r<>(rVar.f47933d, looper, rVar.f47930a, new B(15, this, h12), rVar.f47938i);
    }

    @Override // androidx.media3.common.H.g
    public final void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.H.g
    public final void C(H.f fVar) {
    }

    @Override // androidx.media3.common.H.g
    public final void onLoadingChanged(boolean z12) {
    }

    @Override // androidx.media3.common.H.g
    public final void onPositionDiscontinuity(int i12) {
    }
}
