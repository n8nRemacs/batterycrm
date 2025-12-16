package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import com.google.common.util.concurrent.C37568u0;
import j.InterfaceC42167x;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import r61.InterfaceC47501c;

/* compiled from: MediaController.java */
@aZ0.f
/* loaded from: classes.dex */
public class J implements androidx.media3.common.H {

    /* renamed from: a, reason: collision with root package name */
    public final P.d f52076a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52077b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC47501c
    public final d f52078c;

    /* renamed from: d, reason: collision with root package name */
    public final c f52079d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f52080e;

    /* renamed from: f, reason: collision with root package name */
    public final long f52081f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52082g;

    /* renamed from: h, reason: collision with root package name */
    public final L f52083h;

    /* compiled from: MediaController.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f52084a;

        /* renamed from: b, reason: collision with root package name */
        public final P1 f52085b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f52086c;

        /* renamed from: d, reason: collision with root package name */
        public c f52087d;

        /* renamed from: e, reason: collision with root package name */
        public Looper f52088e;

        /* renamed from: f, reason: collision with root package name */
        public C23210c f52089f;

        /* compiled from: MediaController.java */
        /* renamed from: androidx.media3.session.J$a$a, reason: collision with other inner class name */
        public class C1865a implements c {
        }

        public a(Context context, P1 p12) {
            context.getClass();
            this.f52084a = context;
            p12.getClass();
            this.f52085b = p12;
            this.f52086c = Bundle.EMPTY;
            this.f52087d = new C1865a();
            int i12 = androidx.media3.common.util.M.f47887a;
            Looper looperMyLooper = Looper.myLooper();
            this.f52088e = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        }

        public final com.google.common.util.concurrent.D0<J> a() {
            L l12 = new L(this.f52088e);
            if (this.f52085b.f52238b.f() && this.f52089f == null) {
                this.f52089f = new C23210c(new U1());
            }
            c cVar = this.f52087d;
            Looper looper = this.f52088e;
            C23210c c23210c = this.f52089f;
            androidx.media3.common.util.M.I(new Handler(this.f52088e), new I(l12, new J(this.f52084a, this.f52085b, this.f52086c, cVar, looper, l12, c23210c), 0));
            return l12;
        }
    }

    /* compiled from: MediaController.java */
    public interface b {
    }

    /* compiled from: MediaController.java */
    public interface d {
        boolean A();

        com.google.common.util.concurrent.D0<O1> B(K1 k12, Bundle bundle);

        int C();

        void D();

        void E(H.g gVar);

        void F(H.g gVar);

        void H(int i12);

        void I(@j.P Surface surface);

        void K(androidx.media3.common.B b12);

        void L(boolean z12);

        void M(List<androidx.media3.common.z> list, int i12, long j12);

        void N();

        void O(int i12, int i13, List<androidx.media3.common.z> list);

        void P(int i12);

        C23091e Q();

        void R(int i12, int i13);

        void S(androidx.media3.common.z zVar);

        void T(int i12, List<androidx.media3.common.z> list);

        long U();

        void V(androidx.media3.common.z zVar, long j12);

        void W(int i12, int i13, int i14);

        @j.P
        PlaybackException a();

        long b();

        void c(List list);

        void connect();

        void d(androidx.media3.common.G g12);

        androidx.media3.common.X e();

        void f(androidx.media3.common.z zVar);

        androidx.media3.common.U g();

        long getContentPosition();

        int getCurrentAdGroupIndex();

        int getCurrentAdIndexInAdGroup();

        int getCurrentMediaItemIndex();

        int getCurrentPeriodIndex();

        long getCurrentPosition();

        androidx.media3.common.P getCurrentTimeline();

        androidx.media3.common.V getCurrentTracks();

        C23104o getDeviceInfo();

        long getDuration();

        boolean getPlayWhenReady();

        androidx.media3.common.G getPlaybackParameters();

        int getPlaybackState();

        int getPlaybackSuppressionReason();

        int getRepeatMode();

        long getTotalBufferedDuration();

        float getVolume();

        void h(boolean z12);

        long i();

        boolean isConnected();

        boolean isLoading();

        boolean isPlayingAd();

        long j();

        boolean k();

        long l();

        androidx.media3.common.text.b m();

        H.c n();

        boolean o();

        androidx.media3.common.B p();

        void pause();

        void play();

        void prepare();

        long q();

        void r(int i12, boolean z12);

        void release();

        void s(int i12);

        void seekTo(long j12);

        void setPlayWhenReady(boolean z12);

        void setPlaybackSpeed(float f12);

        void setRepeatMode(int i12);

        void setVolume(float f12);

        void stop();

        void t(int i12, int i13);

        L1 u();

        void v();

        int w();

        long x();

        androidx.media3.common.B y();

        void z(androidx.media3.common.U u12);
    }

    public J(Context context, P1 p12, Bundle bundle, c cVar, Looper looper, L l12, @j.P C23210c c23210c) {
        d c23229i0;
        C23110a.e(context, "context must not be null");
        C23110a.e(p12, "token must not be null");
        this.f52076a = new P.d();
        this.f52081f = -9223372036854775807L;
        this.f52079d = cVar;
        this.f52080e = new Handler(looper);
        this.f52083h = l12;
        if (p12.f52238b.f()) {
            c23210c.getClass();
            c23229i0 = new MediaControllerImplLegacy(context, this, p12, looper, c23210c);
        } else {
            c23229i0 = new C23229i0(context, this, p12, bundle, looper);
        }
        this.f52078c = c23229i0;
        c23229i0.connect();
    }

    public static void Z(com.google.common.util.concurrent.D0 d02) {
        if (d02.cancel(true)) {
            return;
        }
        try {
            ((J) C37568u0.b(d02)).release();
        } catch (CancellationException | ExecutionException e12) {
            androidx.media3.common.util.s.h("MediaController future failed (so we couldn't release it)", e12);
        }
    }

    @Override // androidx.media3.common.H
    public final boolean A() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.A();
        }
        return false;
    }

    @Override // androidx.media3.common.H
    @j.P
    public final androidx.media3.common.z B() {
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        if (currentTimeline.x()) {
            return null;
        }
        return currentTimeline.u(getCurrentMediaItemIndex(), this.f52076a, 0L).f47409d;
    }

    @Override // androidx.media3.common.H
    @j.F
    public final int C() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.C();
        }
        return 0;
    }

    @Override // androidx.media3.common.H
    public final void D() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.D();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void E(H.g gVar) {
        c0();
        C23110a.e(gVar, "listener must not be null");
        this.f52078c.E(gVar);
    }

    @Override // androidx.media3.common.H
    public final void F(H.g gVar) {
        C23110a.e(gVar, "listener must not be null");
        this.f52078c.F(gVar);
    }

    @Override // androidx.media3.common.H
    public final Looper G() {
        return this.f52080e.getLooper();
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void H(@j.F int i12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.H(i12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void I(@j.P Surface surface) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.I(surface);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void K(androidx.media3.common.B b12) {
        c0();
        C23110a.e(b12, "playlistMetadata must not be null");
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.K(b12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void L(boolean z12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.L(z12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void M(List<androidx.media3.common.z> list, int i12, long j12) {
        c0();
        C23110a.e(list, "mediaItems must not be null");
        for (int i13 = 0; i13 < list.size(); i13++) {
            C23110a.a("items must not contain null, index=" + i13, list.get(i13) != null);
        }
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.M(list, i12, j12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void N() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.N();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void O(int i12, int i13, List<androidx.media3.common.z> list) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.O(i12, i13, list);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void P(int i12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.P(i12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final C23091e Q() {
        c0();
        d dVar = this.f52078c;
        return !dVar.isConnected() ? C23091e.f47644h : dVar.Q();
    }

    @Override // androidx.media3.common.H
    public final void R(@j.F int i12, int i13) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.R(i12, i13);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void S(androidx.media3.common.z zVar) {
        c0();
        C23110a.e(zVar, "mediaItems must not be null");
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.S(zVar);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void T(int i12, List<androidx.media3.common.z> list) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.T(i12, list);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final long U() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.U();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final void V(androidx.media3.common.z zVar, long j12) {
        c0();
        C23110a.e(zVar, "mediaItems must not be null");
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.V(zVar, j12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void W(int i12, int i13, int i14) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.W(i12, i13, i14);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    public final void Y() {
        C23110a.g(Looper.myLooper() == this.f52080e.getLooper());
        C23110a.g(!this.f52082g);
        this.f52082g = true;
        L l12 = this.f52083h;
        l12.f52121k = true;
        T t12 = l12.f52120j;
        if (t12 != 0) {
            l12.n(t12);
        }
    }

    @Override // androidx.media3.common.H
    @j.P
    public final PlaybackException a() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.a();
        }
        return null;
    }

    public final void a0(Runnable runnable) {
        androidx.media3.common.util.M.I(this.f52080e, runnable);
    }

    @Override // androidx.media3.common.H
    public final long b() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.b();
        }
        return 0L;
    }

    public final com.google.common.util.concurrent.D0<O1> b0(K1 k12, Bundle bundle) {
        c0();
        C23110a.a("command must be a custom command", k12.f52115b == 0);
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.B(k12, bundle) : C37568u0.d(new O1(-100));
    }

    @Override // androidx.media3.common.H
    public final void c(List list) {
        c0();
        C23110a.e(list, "mediaItems must not be null");
        for (int i12 = 0; i12 < list.size(); i12++) {
            C23110a.a("items must not contain null, index=" + i12, list.get(i12) != null);
        }
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.c(list);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    public final void c0() {
        C23110a.f("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f52080e.getLooper());
    }

    @Override // androidx.media3.common.H
    public final void d(androidx.media3.common.G g12) {
        c0();
        C23110a.e(g12, "playbackParameters must not be null");
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.d(g12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.X e() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.e() : androidx.media3.common.X.f47549f;
    }

    @Override // androidx.media3.common.H
    public final void f(androidx.media3.common.z zVar) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.f(zVar);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.U g() {
        c0();
        d dVar = this.f52078c;
        return !dVar.isConnected() ? androidx.media3.common.U.f47456B : dVar.g();
    }

    @Override // androidx.media3.common.H
    public final long getContentPosition() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getContentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdGroupIndex() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getCurrentAdGroupIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdIndexInAdGroup() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getCurrentAdIndexInAdGroup();
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentMediaItemIndex() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getCurrentMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentPeriodIndex() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getCurrentPeriodIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.H
    public final long getCurrentPosition() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.P getCurrentTimeline() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.getCurrentTimeline() : androidx.media3.common.P.f47368b;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.V getCurrentTracks() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.getCurrentTracks() : androidx.media3.common.V.f47535c;
    }

    @Override // androidx.media3.common.H
    public final C23104o getDeviceInfo() {
        c0();
        d dVar = this.f52078c;
        return !dVar.isConnected() ? C23104o.f47686f : dVar.getDeviceInfo();
    }

    @Override // androidx.media3.common.H
    public final long getDuration() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.common.H
    public final boolean getPlayWhenReady() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() && dVar.getPlayWhenReady();
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.G getPlaybackParameters() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.getPlaybackParameters() : androidx.media3.common.G.f47232e;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackState() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getPlaybackState();
        }
        return 1;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackSuppressionReason() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getPlaybackSuppressionReason();
        }
        return 0;
    }

    @Override // androidx.media3.common.H
    public final int getRepeatMode() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getRepeatMode();
        }
        return 0;
    }

    @Override // androidx.media3.common.H
    public final long getTotalBufferedDuration() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getTotalBufferedDuration();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    @InterfaceC42167x
    public final float getVolume() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.getVolume();
        }
        return 1.0f;
    }

    @Override // androidx.media3.common.H
    public final void h(boolean z12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.h(z12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final long i() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.i();
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemDynamic() {
        c0();
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f52076a, 0L).f47415j;
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemLive() {
        c0();
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f52076a, 0L).a();
    }

    @Override // androidx.media3.common.H
    public final boolean isCurrentMediaItemSeekable() {
        c0();
        androidx.media3.common.P currentTimeline = getCurrentTimeline();
        return !currentTimeline.x() && currentTimeline.u(getCurrentMediaItemIndex(), this.f52076a, 0L).f47414i;
    }

    @Override // androidx.media3.common.H
    public final boolean isLoading() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() && dVar.isLoading();
    }

    @Override // androidx.media3.common.H
    public final boolean isPlayingAd() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() && dVar.isPlayingAd();
    }

    @Override // androidx.media3.common.H
    public final long j() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.j();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final boolean k() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() && dVar.k();
    }

    @Override // androidx.media3.common.H
    public final long l() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.l();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.text.b m() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.m() : androidx.media3.common.text.b.f47856d;
    }

    @Override // androidx.media3.common.H
    public final H.c n() {
        c0();
        d dVar = this.f52078c;
        return !dVar.isConnected() ? H.c.f47239c : dVar.n();
    }

    @Override // androidx.media3.common.H
    public final boolean o() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() && dVar.o();
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.B p() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.p() : androidx.media3.common.B.f47110J;
    }

    @Override // androidx.media3.common.H
    public final void pause() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.pause();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void play() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.play();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void prepare() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.prepare();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final long q() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.q();
        }
        return 0L;
    }

    @Override // androidx.media3.common.H
    public final void r(int i12, boolean z12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.r(i12, z12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void release() {
        c0();
        if (this.f52077b) {
            return;
        }
        this.f52077b = true;
        Handler handler = this.f52080e;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f52078c.release();
        } catch (Exception e12) {
            androidx.media3.common.util.s.a("Exception while releasing impl", e12);
            androidx.media3.common.util.s.b();
        }
        if (this.f52082g) {
            C23110a.g(Looper.myLooper() == handler.getLooper());
            this.f52079d.f();
        } else {
            this.f52082g = true;
            L l12 = this.f52083h;
            l12.getClass();
            l12.o(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // androidx.media3.common.H
    public final void s(int i12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.s(i12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void seekTo(long j12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.seekTo(j12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void setPlayWhenReady(boolean z12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.setPlayWhenReady(z12);
        }
    }

    @Override // androidx.media3.common.H
    public final void setPlaybackSpeed(float f12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.setPlaybackSpeed(f12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void setRepeatMode(int i12) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.setRepeatMode(i12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void setVolume(@InterfaceC42167x float f12) {
        c0();
        C23110a.a("volume must be between 0 and 1", f12 >= 0.0f && f12 <= 1.0f);
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.setVolume(f12);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void stop() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.stop();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final void t(int i12, int i13) {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.t(i12, i13);
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    public final boolean u(int i12) {
        return n().a(i12);
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void v() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            dVar.v();
        } else {
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.common.H
    @j.F
    public final int w() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.w();
        }
        return 0;
    }

    @Override // androidx.media3.common.H
    public final long x() {
        c0();
        d dVar = this.f52078c;
        if (dVar.isConnected()) {
            return dVar.x();
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.B y() {
        c0();
        d dVar = this.f52078c;
        return dVar.isConnected() ? dVar.y() : androidx.media3.common.B.f47110J;
    }

    @Override // androidx.media3.common.H
    public final void z(androidx.media3.common.U u12) {
        c0();
        d dVar = this.f52078c;
        if (!dVar.isConnected()) {
            androidx.media3.common.util.s.g();
        }
        dVar.z(u12);
    }

    /* compiled from: MediaController.java */
    public interface c {
        static com.google.common.util.concurrent.D0 h() {
            return C37568u0.d(new O1(-6));
        }

        default com.google.common.util.concurrent.D0 c(List list) {
            return C37568u0.d(new O1(-6));
        }

        default void f() {
        }
    }
}
