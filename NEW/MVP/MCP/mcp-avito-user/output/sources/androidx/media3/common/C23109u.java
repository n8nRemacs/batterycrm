package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.H;
import com.google.common.collect.AbstractC37401r1;
import java.util.List;

/* compiled from: ForwardingPlayer.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23109u implements H {

    /* renamed from: a, reason: collision with root package name */
    public final H f47862a;

    /* compiled from: ForwardingPlayer.java */
    /* renamed from: androidx.media3.common.u$a */
    public static final class a implements H.g {

        /* renamed from: b, reason: collision with root package name */
        public final C23109u f47863b;

        /* renamed from: c, reason: collision with root package name */
        public final H.g f47864c;

        public a(C23109u c23109u, H.g gVar) {
            this.f47863b = c23109u;
            this.f47864c = gVar;
        }

        @Override // androidx.media3.common.H.g
        public final void C(H.f fVar) {
            this.f47864c.C(fVar);
        }

        @Override // androidx.media3.common.H.g
        public final void D(C23091e c23091e) {
            this.f47864c.D(c23091e);
        }

        @Override // androidx.media3.common.H.g
        public final void E(B b12) {
            this.f47864c.E(b12);
        }

        @Override // androidx.media3.common.H.g
        public final void a(androidx.media3.common.text.b bVar) {
            this.f47864c.a(bVar);
        }

        @Override // androidx.media3.common.H.g
        public final void b(X x12) {
            this.f47864c.b(x12);
        }

        @Override // androidx.media3.common.H.g
        public final void d(Metadata metadata) {
            this.f47864c.d(metadata);
        }

        @Override // androidx.media3.common.H.g
        public final void e(B b12) {
            this.f47864c.e(b12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f47863b.equals(aVar.f47863b)) {
                return this.f47864c.equals(aVar.f47864c);
            }
            return false;
        }

        @Override // androidx.media3.common.H.g
        public final void g(PlaybackException playbackException) {
            this.f47864c.g(playbackException);
        }

        public final int hashCode() {
            return this.f47864c.hashCode() + (this.f47863b.hashCode() * 31);
        }

        @Override // androidx.media3.common.H.g
        public final void i(long j12) {
            this.f47864c.i(j12);
        }

        @Override // androidx.media3.common.H.g
        public final void j(V v12) {
            this.f47864c.j(v12);
        }

        @Override // androidx.media3.common.H.g
        public final void k(C23104o c23104o) {
            this.f47864c.k(c23104o);
        }

        @Override // androidx.media3.common.H.g
        public final void m(G g12) {
            this.f47864c.m(g12);
        }

        @Override // androidx.media3.common.H.g
        public final void onCues(List<androidx.media3.common.text.a> list) {
            this.f47864c.onCues(list);
        }

        @Override // androidx.media3.common.H.g
        public final void onDeviceVolumeChanged(int i12, boolean z12) {
            this.f47864c.onDeviceVolumeChanged(i12, z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onIsLoadingChanged(boolean z12) {
            this.f47864c.onIsLoadingChanged(z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onIsPlayingChanged(boolean z12) {
            this.f47864c.onIsPlayingChanged(z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onLoadingChanged(boolean z12) {
            this.f47864c.onIsLoadingChanged(z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            this.f47864c.onPlayWhenReadyChanged(z12, i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackStateChanged(int i12) {
            this.f47864c.onPlaybackStateChanged(i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackSuppressionReasonChanged(int i12) {
            this.f47864c.onPlaybackSuppressionReasonChanged(i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onPlayerStateChanged(boolean z12, int i12) {
            this.f47864c.onPlayerStateChanged(z12, i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onPositionDiscontinuity(int i12) {
            this.f47864c.onPositionDiscontinuity(i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onRenderedFirstFrame() {
            this.f47864c.onRenderedFirstFrame();
        }

        @Override // androidx.media3.common.H.g
        public final void onRepeatModeChanged(int i12) {
            this.f47864c.onRepeatModeChanged(i12);
        }

        @Override // androidx.media3.common.H.g
        public final void onShuffleModeEnabledChanged(boolean z12) {
            this.f47864c.onShuffleModeEnabledChanged(z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            this.f47864c.onSkipSilenceEnabledChanged(z12);
        }

        @Override // androidx.media3.common.H.g
        public final void onSurfaceSizeChanged(int i12, int i13) {
            this.f47864c.onSurfaceSizeChanged(i12, i13);
        }

        @Override // androidx.media3.common.H.g
        public final void onVolumeChanged(float f12) {
            this.f47864c.onVolumeChanged(f12);
        }

        @Override // androidx.media3.common.H.g
        public final void p(@j.P PlaybackException playbackException) {
            this.f47864c.p(playbackException);
        }

        @Override // androidx.media3.common.H.g
        public final void q(long j12) {
            this.f47864c.q(j12);
        }

        @Override // androidx.media3.common.H.g
        public final void s(H.c cVar) {
            this.f47864c.s(cVar);
        }

        @Override // androidx.media3.common.H.g
        public final void t(int i12, H.k kVar, H.k kVar2) {
            this.f47864c.t(i12, kVar, kVar2);
        }

        @Override // androidx.media3.common.H.g
        public final void v(P p12, int i12) {
            this.f47864c.v(p12, i12);
        }

        @Override // androidx.media3.common.H.g
        public final void w(int i12, @j.P z zVar) {
            this.f47864c.w(i12, zVar);
        }

        @Override // androidx.media3.common.H.g
        public final void y(long j12) {
            this.f47864c.y(j12);
        }

        @Override // androidx.media3.common.H.g
        public final void z(U u12) {
            this.f47864c.z(u12);
        }
    }

    public C23109u(H h12) {
        this.f47862a = h12;
    }

    @Override // androidx.media3.common.H
    public boolean A() {
        return this.f47862a.A();
    }

    @Override // androidx.media3.common.H
    @j.P
    public z B() {
        return this.f47862a.B();
    }

    @Override // androidx.media3.common.H
    public int C() {
        return this.f47862a.C();
    }

    @Override // androidx.media3.common.H
    public void D() {
        this.f47862a.D();
    }

    @Override // androidx.media3.common.H
    public void E(H.g gVar) {
        this.f47862a.E(new a(this, gVar));
    }

    @Override // androidx.media3.common.H
    public void F(H.g gVar) {
        this.f47862a.F(new a(this, gVar));
    }

    @Override // androidx.media3.common.H
    public final Looper G() {
        return this.f47862a.G();
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public void H(int i12) {
        this.f47862a.H(i12);
    }

    @Override // androidx.media3.common.H
    public void I(@j.P Surface surface) {
        this.f47862a.I(surface);
    }

    @Override // androidx.media3.common.H
    public void K(B b12) {
        this.f47862a.K(b12);
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public void L(boolean z12) {
        this.f47862a.L(z12);
    }

    @Override // androidx.media3.common.H
    public void M(List<z> list, int i12, long j12) {
        this.f47862a.M(list, i12, j12);
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public void N() {
        this.f47862a.N();
    }

    @Override // androidx.media3.common.H
    public void O(int i12, int i13, List<z> list) {
        this.f47862a.O(i12, i13, list);
    }

    @Override // androidx.media3.common.H
    public void P(int i12) {
        this.f47862a.P(i12);
    }

    @Override // androidx.media3.common.H
    public C23091e Q() {
        return this.f47862a.Q();
    }

    @Override // androidx.media3.common.H
    public void R(int i12, int i13) {
        this.f47862a.R(i12, i13);
    }

    @Override // androidx.media3.common.H
    public void S(z zVar) {
        ((AbstractC23093g) this.f47862a).S(zVar);
    }

    @Override // androidx.media3.common.H
    public void T(int i12, List<z> list) {
        this.f47862a.T(i12, list);
    }

    @Override // androidx.media3.common.H
    public long U() {
        return this.f47862a.U();
    }

    @Override // androidx.media3.common.H
    public void V(z zVar, long j12) {
        this.f47862a.V(zVar, j12);
    }

    @Override // androidx.media3.common.H
    public void W(int i12, int i13, int i14) {
        this.f47862a.W(i12, i13, i14);
    }

    public void Y(List<z> list) {
        ((AbstractC23093g) this.f47862a).T(Integer.MAX_VALUE, list);
    }

    public void Z() {
        ((AbstractC23093g) this.f47862a).t(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.common.H
    @j.P
    public PlaybackException a() {
        return this.f47862a.a();
    }

    public int a0() {
        return ((AbstractC23093g) this.f47862a).getCurrentTimeline().w();
    }

    @Override // androidx.media3.common.H
    public long b() {
        return this.f47862a.b();
    }

    public void b0(int i12, int i13) {
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        if (i12 != i13) {
            abstractC23093g.W(i12, i12 + 1, i13);
        }
    }

    @Override // androidx.media3.common.H
    public void c(List list) {
        this.f47862a.c(list);
    }

    public void c0(int i12) {
        ((AbstractC23093g) this.f47862a).t(i12, i12 + 1);
    }

    @Override // androidx.media3.common.H
    public void d(G g12) {
        this.f47862a.d(g12);
    }

    public void d0(int i12, z zVar) {
        ((AbstractC23093g) this.f47862a).O(i12, i12 + 1, AbstractC37401r1.E(zVar));
    }

    @Override // androidx.media3.common.H
    public X e() {
        return this.f47862a.e();
    }

    public void e0() {
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        long currentPosition = abstractC23093g.getCurrentPosition() + (-abstractC23093g.q());
        long duration = abstractC23093g.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), false);
    }

    public void f0() {
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        long currentPosition = abstractC23093g.getCurrentPosition() + abstractC23093g.j();
        long duration = abstractC23093g.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), false);
    }

    @Override // androidx.media3.common.H
    public U g() {
        return this.f47862a.g();
    }

    public void g0(int i12, long j12) {
        ((AbstractC23093g) this.f47862a).a0(i12, j12, false);
    }

    @Override // androidx.media3.common.H
    public long getContentPosition() {
        return this.f47862a.getContentPosition();
    }

    @Override // androidx.media3.common.H
    public int getCurrentAdGroupIndex() {
        return this.f47862a.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.H
    public int getCurrentAdIndexInAdGroup() {
        return this.f47862a.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.H
    public int getCurrentMediaItemIndex() {
        return this.f47862a.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.H
    public int getCurrentPeriodIndex() {
        return this.f47862a.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.H
    public long getCurrentPosition() {
        return this.f47862a.getCurrentPosition();
    }

    @Override // androidx.media3.common.H
    public P getCurrentTimeline() {
        return this.f47862a.getCurrentTimeline();
    }

    @Override // androidx.media3.common.H
    public V getCurrentTracks() {
        return this.f47862a.getCurrentTracks();
    }

    @Override // androidx.media3.common.H
    public C23104o getDeviceInfo() {
        return this.f47862a.getDeviceInfo();
    }

    @Override // androidx.media3.common.H
    public long getDuration() {
        return this.f47862a.getDuration();
    }

    @Override // androidx.media3.common.H
    public boolean getPlayWhenReady() {
        return this.f47862a.getPlayWhenReady();
    }

    @Override // androidx.media3.common.H
    public G getPlaybackParameters() {
        return this.f47862a.getPlaybackParameters();
    }

    @Override // androidx.media3.common.H
    public int getPlaybackState() {
        return this.f47862a.getPlaybackState();
    }

    @Override // androidx.media3.common.H
    public int getPlaybackSuppressionReason() {
        return this.f47862a.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.H
    public int getRepeatMode() {
        return this.f47862a.getRepeatMode();
    }

    @Override // androidx.media3.common.H
    public long getTotalBufferedDuration() {
        return this.f47862a.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.H
    public float getVolume() {
        return this.f47862a.getVolume();
    }

    @Override // androidx.media3.common.H
    public void h(boolean z12) {
        this.f47862a.h(z12);
    }

    public void h0(int i12) {
        ((AbstractC23093g) this.f47862a).a0(i12, -9223372036854775807L, false);
    }

    @Override // androidx.media3.common.H
    public long i() {
        return this.f47862a.i();
    }

    public void i0() {
        int iM2;
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        if (abstractC23093g.getCurrentTimeline().x() || abstractC23093g.isPlayingAd()) {
            return;
        }
        if (!abstractC23093g.Y()) {
            if (abstractC23093g.isCurrentMediaItemLive() && abstractC23093g.isCurrentMediaItemDynamic()) {
                abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), -9223372036854775807L, false);
                return;
            }
            return;
        }
        P currentTimeline = abstractC23093g.getCurrentTimeline();
        if (currentTimeline.x()) {
            iM2 = -1;
        } else {
            int currentMediaItemIndex = abstractC23093g.getCurrentMediaItemIndex();
            int repeatMode = abstractC23093g.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iM2 = currentTimeline.m(currentMediaItemIndex, repeatMode, abstractC23093g.o());
        }
        if (iM2 == -1) {
            return;
        }
        if (iM2 == abstractC23093g.getCurrentMediaItemIndex()) {
            abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            abstractC23093g.a0(iM2, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.common.H
    public boolean isCurrentMediaItemDynamic() {
        return this.f47862a.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.H
    public boolean isCurrentMediaItemLive() {
        return this.f47862a.isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.H
    public boolean isCurrentMediaItemSeekable() {
        return this.f47862a.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.H
    public boolean isLoading() {
        return this.f47862a.isLoading();
    }

    @Override // androidx.media3.common.H
    public boolean isPlayingAd() {
        return this.f47862a.isPlayingAd();
    }

    @Override // androidx.media3.common.H
    public long j() {
        return this.f47862a.j();
    }

    public void j0() {
        int iM2;
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        P currentTimeline = abstractC23093g.getCurrentTimeline();
        if (currentTimeline.x()) {
            iM2 = -1;
        } else {
            int currentMediaItemIndex = abstractC23093g.getCurrentMediaItemIndex();
            int repeatMode = abstractC23093g.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iM2 = currentTimeline.m(currentMediaItemIndex, repeatMode, abstractC23093g.o());
        }
        if (iM2 == -1) {
            return;
        }
        if (iM2 == abstractC23093g.getCurrentMediaItemIndex()) {
            abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            abstractC23093g.a0(iM2, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.common.H
    public boolean k() {
        return this.f47862a.k();
    }

    public void k0() {
        AbstractC23093g abstractC23093g = (AbstractC23093g) this.f47862a;
        if (abstractC23093g.getCurrentTimeline().x() || abstractC23093g.isPlayingAd()) {
            return;
        }
        boolean Z12 = abstractC23093g.Z();
        if (abstractC23093g.isCurrentMediaItemLive() && !abstractC23093g.isCurrentMediaItemSeekable()) {
            if (Z12) {
                abstractC23093g.b0(7);
            }
        } else if (!Z12 || abstractC23093g.getCurrentPosition() > abstractC23093g.b()) {
            abstractC23093g.a0(abstractC23093g.getCurrentMediaItemIndex(), 0L, false);
        } else {
            abstractC23093g.b0(7);
        }
    }

    @Override // androidx.media3.common.H
    public long l() {
        return this.f47862a.l();
    }

    public void l0() {
        ((AbstractC23093g) this.f47862a).b0(6);
    }

    @Override // androidx.media3.common.H
    public androidx.media3.common.text.b m() {
        return this.f47862a.m();
    }

    @Override // androidx.media3.common.H
    public H.c n() {
        return this.f47862a.n();
    }

    @Override // androidx.media3.common.H
    public boolean o() {
        return this.f47862a.o();
    }

    @Override // androidx.media3.common.H
    public B p() {
        return this.f47862a.p();
    }

    @Override // androidx.media3.common.H
    public void pause() {
        this.f47862a.pause();
    }

    @Override // androidx.media3.common.H
    public void play() {
        this.f47862a.play();
    }

    @Override // androidx.media3.common.H
    public void prepare() {
        this.f47862a.prepare();
    }

    @Override // androidx.media3.common.H
    public long q() {
        return this.f47862a.q();
    }

    @Override // androidx.media3.common.H
    public void r(int i12, boolean z12) {
        this.f47862a.r(i12, z12);
    }

    @Override // androidx.media3.common.H
    public void release() {
        this.f47862a.release();
    }

    @Override // androidx.media3.common.H
    public void s(int i12) {
        this.f47862a.s(i12);
    }

    @Override // androidx.media3.common.H
    public void seekTo(long j12) {
        this.f47862a.seekTo(j12);
    }

    @Override // androidx.media3.common.H
    public void setPlayWhenReady(boolean z12) {
        this.f47862a.setPlayWhenReady(z12);
    }

    @Override // androidx.media3.common.H
    public void setPlaybackSpeed(float f12) {
        this.f47862a.setPlaybackSpeed(f12);
    }

    @Override // androidx.media3.common.H
    public void setRepeatMode(int i12) {
        this.f47862a.setRepeatMode(i12);
    }

    @Override // androidx.media3.common.H
    public void setVolume(float f12) {
        this.f47862a.setVolume(f12);
    }

    @Override // androidx.media3.common.H
    public void stop() {
        this.f47862a.stop();
    }

    @Override // androidx.media3.common.H
    public void t(int i12, int i13) {
        this.f47862a.t(i12, i13);
    }

    @Override // androidx.media3.common.H
    public boolean u(int i12) {
        return ((AbstractC23093g) this.f47862a).u(i12);
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public void v() {
        this.f47862a.v();
    }

    @Override // androidx.media3.common.H
    public int w() {
        return this.f47862a.w();
    }

    @Override // androidx.media3.common.H
    public long x() {
        return this.f47862a.x();
    }

    @Override // androidx.media3.common.H
    public B y() {
        return this.f47862a.y();
    }

    @Override // androidx.media3.common.H
    public void z(U u12) {
        this.f47862a.z(u12);
    }
}
