package androidx.media3.session;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media3.common.AbstractC23093g;
import androidx.media3.common.C23089c;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.C23109u;
import androidx.media3.common.H;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import com.google.common.collect.AbstractC37401r1;
import java.util.List;

/* compiled from: PlayerWrapper.java */
/* loaded from: classes.dex */
class G1 extends C23109u {

    /* renamed from: b, reason: collision with root package name */
    public int f52049b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public String f52050c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public Bundle f52051d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC37401r1<C23213d> f52052e;

    /* compiled from: PlayerWrapper.java */
    public static final class a extends androidx.media3.common.P {

        /* renamed from: l, reason: collision with root package name */
        public static final Object f52053l = new Object();

        /* renamed from: g, reason: collision with root package name */
        @j.P
        public final androidx.media3.common.z f52054g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f52055h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f52056i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public final z.g f52057j;

        /* renamed from: k, reason: collision with root package name */
        public final long f52058k;

        public a(G1 g12) {
            this.f52054g = g12.B();
            this.f52055h = g12.isCurrentMediaItemSeekable();
            this.f52056i = g12.isCurrentMediaItemDynamic();
            this.f52057j = g12.isCurrentMediaItemLive() ? z.g.f48044g : null;
            this.f52058k = androidx.media3.common.util.M.F(g12.i());
        }

        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            return f52053l.equals(obj) ? 0 : -1;
        }

        @Override // androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            Object obj = f52053l;
            bVar.getClass();
            bVar.p(obj, obj, 0, this.f52058k, 0L, C23089c.f47615g, false);
            return bVar;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            return 1;
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            return f52053l;
        }

        @Override // androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            dVar.b(f52053l, this.f52054g, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f52055h, this.f52056i, this.f52057j, 0L, this.f52058k, 0, 0, 0L);
            return dVar;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            return 1;
        }
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean A() {
        u0();
        return super.A();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @j.P
    public final androidx.media3.common.z B() {
        u0();
        return this.f47862a.B();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int C() {
        u0();
        return this.f47862a.C();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void D() {
        u0();
        super.D();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void E(H.g gVar) {
        u0();
        super.E(gVar);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void F(H.g gVar) {
        u0();
        super.F(gVar);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @Deprecated
    public final void H(int i12) {
        u0();
        super.H(i12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void I(@j.P Surface surface) {
        u0();
        super.I(surface);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void K(androidx.media3.common.B b12) {
        u0();
        super.K(b12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @Deprecated
    public final void L(boolean z12) {
        u0();
        super.L(z12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void M(List<androidx.media3.common.z> list, int i12, long j12) {
        u0();
        super.M(list, i12, j12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @Deprecated
    public final void N() {
        u0();
        super.N();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void O(int i12, int i13, List<androidx.media3.common.z> list) {
        u0();
        super.O(i12, i13, list);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void P(int i12) {
        u0();
        super.P(i12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final C23091e Q() {
        u0();
        return this.f47862a.Q();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void R(int i12, int i13) {
        u0();
        super.R(i12, i13);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void S(androidx.media3.common.z zVar) {
        u0();
        super.S(zVar);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void T(int i12, List<androidx.media3.common.z> list) {
        u0();
        super.T(i12, list);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long U() {
        u0();
        return super.U();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void V(androidx.media3.common.z zVar, long j12) {
        u0();
        super.V(zVar, j12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void W(int i12, int i13, int i14) {
        u0();
        super.W(i12, i13, i14);
    }

    @Override // androidx.media3.common.C23109u
    public final void Y(List<androidx.media3.common.z> list) {
        u0();
        super.Y(list);
    }

    @Override // androidx.media3.common.C23109u
    public final void Z() {
        u0();
        super.Z();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @j.P
    public final PlaybackException a() {
        u0();
        return super.a();
    }

    @Override // androidx.media3.common.C23109u
    public final int a0() {
        u0();
        return super.a0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long b() {
        u0();
        return super.b();
    }

    @Override // androidx.media3.common.C23109u
    public final void b0(int i12, int i13) {
        u0();
        super.b0(i12, i13);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void c(List list) {
        u0();
        super.c(list);
    }

    @Override // androidx.media3.common.C23109u
    public final void c0(int i12) {
        u0();
        super.c0(i12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void d(androidx.media3.common.G g12) {
        u0();
        super.d(g12);
    }

    @Override // androidx.media3.common.C23109u
    public final void d0(int i12, androidx.media3.common.z zVar) {
        u0();
        super.d0(i12, zVar);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.X e() {
        u0();
        return super.e();
    }

    @Override // androidx.media3.common.C23109u
    public final void e0() {
        u0();
        super.e0();
    }

    @Override // androidx.media3.common.C23109u
    public final void f0() {
        u0();
        super.f0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.U g() {
        u0();
        return super.g();
    }

    @Override // androidx.media3.common.C23109u
    public final void g0(int i12, long j12) {
        u0();
        super.g0(i12, j12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long getContentPosition() {
        u0();
        return super.getContentPosition();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getCurrentAdGroupIndex() {
        u0();
        return super.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getCurrentAdIndexInAdGroup() {
        u0();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getCurrentMediaItemIndex() {
        u0();
        return super.getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getCurrentPeriodIndex() {
        u0();
        return super.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long getCurrentPosition() {
        u0();
        return super.getCurrentPosition();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.P getCurrentTimeline() {
        u0();
        return super.getCurrentTimeline();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.V getCurrentTracks() {
        u0();
        return super.getCurrentTracks();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final C23104o getDeviceInfo() {
        u0();
        return this.f47862a.getDeviceInfo();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long getDuration() {
        u0();
        return super.getDuration();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean getPlayWhenReady() {
        u0();
        return super.getPlayWhenReady();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.G getPlaybackParameters() {
        u0();
        return super.getPlaybackParameters();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getPlaybackState() {
        u0();
        return super.getPlaybackState();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getPlaybackSuppressionReason() {
        u0();
        return super.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int getRepeatMode() {
        u0();
        return super.getRepeatMode();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long getTotalBufferedDuration() {
        u0();
        return super.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final float getVolume() {
        u0();
        return super.getVolume();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void h(boolean z12) {
        u0();
        super.h(z12);
    }

    @Override // androidx.media3.common.C23109u
    public final void h0(int i12) {
        u0();
        super.h0(i12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long i() {
        u0();
        return this.f47862a.i();
    }

    @Override // androidx.media3.common.C23109u
    public final void i0() {
        u0();
        super.i0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean isCurrentMediaItemDynamic() {
        u0();
        return this.f47862a.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean isCurrentMediaItemLive() {
        u0();
        return this.f47862a.isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean isCurrentMediaItemSeekable() {
        u0();
        return this.f47862a.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean isLoading() {
        u0();
        return this.f47862a.isLoading();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean isPlayingAd() {
        u0();
        return super.isPlayingAd();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long j() {
        u0();
        return super.j();
    }

    @Override // androidx.media3.common.C23109u
    public final void j0() {
        u0();
        super.j0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean k() {
        u0();
        return this.f47862a.k();
    }

    @Override // androidx.media3.common.C23109u
    public final void k0() {
        u0();
        super.k0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long l() {
        u0();
        return this.f47862a.l();
    }

    @Override // androidx.media3.common.C23109u
    public final void l0() {
        u0();
        super.l0();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.text.b m() {
        u0();
        return super.m();
    }

    public final PlaybackStateCompat m0() {
        long j12;
        if (this.f52049b != -1) {
            PlaybackStateCompat.Builder bufferedPosition = new PlaybackStateCompat.Builder().setState(7, -1L, 0.0f, SystemClock.elapsedRealtime()).setActions(0L).setBufferedPosition(0L);
            int i12 = this.f52049b;
            String str = this.f52050c;
            C23110a.d(str);
            PlaybackStateCompat.Builder errorMessage = bufferedPosition.setErrorMessage(i12, str);
            Bundle bundle = this.f52051d;
            C23110a.d(bundle);
            return errorMessage.setExtras(bundle).build();
        }
        PlaybackException playbackExceptionA = a();
        int iS2 = C1.s(playbackExceptionA, getPlaybackState(), getPlayWhenReady());
        H.c cVarN = n();
        long j13 = 128;
        for (int i13 = 0; i13 < cVarN.g(); i13++) {
            int iB2 = cVarN.f47242b.b(i13);
            if (iB2 == 1) {
                j12 = 518;
            } else if (iB2 == 2) {
                j12 = 16384;
            } else if (iB2 == 3) {
                j12 = 1;
            } else if (iB2 != 31) {
                switch (iB2) {
                    case 5:
                        j12 = 256;
                        break;
                    case 6:
                    case 7:
                        j12 = 16;
                        break;
                    case 8:
                    case 9:
                        j12 = 32;
                        break;
                    case 10:
                        j12 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                        break;
                    case 11:
                        j12 = 8;
                        break;
                    case 12:
                        j12 = 64;
                        break;
                    case 13:
                        j12 = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                        break;
                    case 14:
                        j12 = 2621440;
                        break;
                    case 15:
                        j12 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    default:
                        j12 = 0;
                        break;
                }
            } else {
                j12 = 240640;
            }
            j13 |= j12;
        }
        long jT2 = u(17) ? C1.t(getCurrentMediaItemIndex()) : -1L;
        float f12 = getPlaybackParameters().f47236b;
        float f13 = k() ? f12 : 0.0f;
        Bundle bundle2 = new Bundle();
        bundle2.putFloat("EXO_SPEED", f12);
        androidx.media3.common.z zVarQ0 = q0();
        if (zVarQ0 != null) {
            String str2 = zVarQ0.f47978b;
            if (!"".equals(str2)) {
                bundle2.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        boolean zU2 = u(16);
        PlaybackStateCompat.Builder extras = new PlaybackStateCompat.Builder().setState(iS2, zU2 ? getCurrentPosition() : -1L, f13, SystemClock.elapsedRealtime()).setActions(j13).setActiveQueueItemId(jT2).setBufferedPosition(zU2 ? U() : 0L).setExtras(bundle2);
        for (int i14 = 0; i14 < this.f52052e.size(); i14++) {
            C23213d c23213d = this.f52052e.get(i14);
            K1 k12 = c23213d.f52423b;
            if (k12 != null && k12.f52115b == 0) {
                extras.addCustomAction(new PlaybackStateCompat.CustomAction.Builder(k12.f52116c, c23213d.f52426e, c23213d.f52425d).setExtras(k12.f52117d).build());
            }
        }
        if (playbackExceptionA != null) {
            String message = playbackExceptionA.getMessage();
            int i15 = androidx.media3.common.util.M.f47887a;
            extras.setErrorMessage(0, message);
        }
        return extras.build();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final H.c n() {
        u0();
        return super.n();
    }

    public final D1 n0() {
        return new D1(a(), 0, p0(), o0(), o0(), 0, getPlaybackParameters(), getRepeatMode(), o(), e(), r0(), 0, u(18) ? y() : androidx.media3.common.B.f47110J, u(22) ? getVolume() : 0.0f, u(21) ? Q() : C23091e.f47644h, u(28) ? m() : androidx.media3.common.text.b.f47856d, getDeviceInfo(), u(23) ? w() : 0, t0(), getPlayWhenReady(), 1, getPlaybackSuppressionReason(), getPlaybackState(), k(), isLoading(), s0(), q(), j(), b(), u(30) ? getCurrentTracks() : androidx.media3.common.V.f47535c, g());
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean o() {
        u0();
        return super.o();
    }

    public final H.k o0() {
        boolean zU2 = u(16);
        boolean zU3 = u(17);
        return new H.k(null, zU3 ? getCurrentMediaItemIndex() : 0, zU2 ? B() : null, null, zU3 ? getCurrentPeriodIndex() : 0, zU2 ? getCurrentPosition() : 0L, zU2 ? getContentPosition() : 0L, zU2 ? getCurrentAdGroupIndex() : -1, zU2 ? getCurrentAdIndexInAdGroup() : -1);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.B p() {
        u0();
        return this.f47862a.p();
    }

    public final N1 p0() {
        boolean zU2 = u(16);
        return new N1(o0(), zU2 && isPlayingAd(), SystemClock.elapsedRealtime(), zU2 ? getDuration() : -9223372036854775807L, zU2 ? U() : 0L, zU2 ? C() : 0, zU2 ? getTotalBufferedDuration() : 0L, zU2 ? x() : -9223372036854775807L, zU2 ? i() : -9223372036854775807L, zU2 ? l() : 0L);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void pause() {
        u0();
        super.pause();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void play() {
        u0();
        super.play();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void prepare() {
        u0();
        super.prepare();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long q() {
        u0();
        return super.q();
    }

    @j.P
    public final androidx.media3.common.z q0() {
        if (u(16)) {
            return B();
        }
        return null;
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void r(int i12, boolean z12) {
        u0();
        super.r(i12, z12);
    }

    public final androidx.media3.common.P r0() {
        return u(17) ? getCurrentTimeline() : u(16) ? new a(this) : androidx.media3.common.P.f47368b;
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void release() {
        u0();
        super.release();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void s(int i12) {
        u0();
        super.s(i12);
    }

    public final androidx.media3.common.B s0() {
        return u(18) ? p() : androidx.media3.common.B.f47110J;
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void seekTo(long j12) {
        u0();
        super.seekTo(j12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void setPlayWhenReady(boolean z12) {
        u0();
        super.setPlayWhenReady(z12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void setPlaybackSpeed(float f12) {
        u0();
        super.setPlaybackSpeed(f12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void setRepeatMode(int i12) {
        u0();
        super.setRepeatMode(i12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void setVolume(float f12) {
        u0();
        super.setVolume(f12);
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void stop() {
        u0();
        super.stop();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void t(int i12, int i13) {
        u0();
        super.t(i12, i13);
    }

    public final boolean t0() {
        return u(23) && A();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final boolean u(int i12) {
        u0();
        return ((AbstractC23093g) this.f47862a).u(i12);
    }

    public final void u0() {
        C23110a.g(Looper.myLooper() == this.f47862a.G());
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    @Deprecated
    public final void v() {
        u0();
        super.v();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final int w() {
        u0();
        return this.f47862a.w();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final long x() {
        u0();
        return this.f47862a.x();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final androidx.media3.common.B y() {
        u0();
        return this.f47862a.y();
    }

    @Override // androidx.media3.common.C23109u, androidx.media3.common.H
    public final void z(androidx.media3.common.U u12) {
        u0();
        super.z(u12);
    }
}
