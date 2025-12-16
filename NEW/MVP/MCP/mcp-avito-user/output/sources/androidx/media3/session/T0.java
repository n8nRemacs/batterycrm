package androidx.media3.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.os.C22782j;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.AbstractServiceC23212c1;
import androidx.media3.session.C23206a1;
import androidx.media3.session.D1;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import j.InterfaceC42167x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: MediaSessionImpl.java */
/* loaded from: classes.dex */
class T0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f52286w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f52287a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Uri f52288b;

    /* renamed from: c, reason: collision with root package name */
    public final a f52289c;

    /* renamed from: d, reason: collision with root package name */
    public final O0.d f52290d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.messenger.service.media_session.a f52291e;

    /* renamed from: f, reason: collision with root package name */
    public final A1 f52292f;

    /* renamed from: g, reason: collision with root package name */
    public final C23206a1 f52293g;

    /* renamed from: h, reason: collision with root package name */
    public final String f52294h;

    /* renamed from: i, reason: collision with root package name */
    public final P1 f52295i;

    /* renamed from: j, reason: collision with root package name */
    public final O0 f52296j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f52297k;

    /* renamed from: l, reason: collision with root package name */
    public final C23210c f52298l;

    /* renamed from: m, reason: collision with root package name */
    public final RunnableC23216e f52299m;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f52300n;

    /* renamed from: o, reason: collision with root package name */
    public D1 f52301o;

    /* renamed from: p, reason: collision with root package name */
    public G1 f52302p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public b f52303q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public AbstractServiceC23212c1.d f52304r;

    /* renamed from: s, reason: collision with root package name */
    @j.B
    @j.P
    public ServiceC23218e1 f52305s;

    /* renamed from: t, reason: collision with root package name */
    @j.B
    public boolean f52306t;

    /* renamed from: u, reason: collision with root package name */
    public final long f52307u;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC37401r1<C23213d> f52308v;

    /* compiled from: MediaSessionImpl.java */
    public class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f52309a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f52310b;

        public a(Looper looper) {
            super(looper);
            this.f52309a = true;
            this.f52310b = true;
        }

        public final void a(boolean z12, boolean z13) {
            boolean z14 = false;
            this.f52309a = this.f52309a && z12;
            if (this.f52310b && z13) {
                z14 = true;
            }
            this.f52310b = z14;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            O0.g gVar;
            int i12;
            AbstractC37401r1<O0.g> abstractC37401r1;
            int iA2;
            if (message.what != 1) {
                throw new IllegalStateException("Invalid message what=" + message.what);
            }
            T0 t02 = T0.this;
            D1 d12 = t02.f52301o;
            androidx.media3.common.P pR02 = t02.f52302p.r0();
            N1 n1P0 = t02.f52302p.p0();
            int i13 = t02.f52301o.f51985l;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52014j = pR02;
            aVarB.f52007c = n1P0;
            aVarB.f52015k = i13;
            D1 d1A = aVarB.a();
            t02.f52301o = d1A;
            boolean z12 = this.f52309a;
            boolean z13 = this.f52310b;
            A1 a12 = t02.f52292f;
            D1 d1G4 = a12.g4(d1A);
            C23225h<IBinder> c23225h = a12.f51918q;
            AbstractC37401r1<O0.g> abstractC37401r1D = c23225h.d();
            int i14 = 0;
            while (i14 < abstractC37401r1D.size()) {
                O0.g gVar2 = abstractC37401r1D.get(i14);
                try {
                    J1 j1F = c23225h.f(gVar2);
                    if (j1F != null) {
                        iA2 = j1F.a();
                    } else if (!t02.e(gVar2)) {
                        break;
                    } else {
                        iA2 = 0;
                    }
                    H.c cVarC = C1.C(c23225h.c(gVar2), t02.f52302p.n());
                    O0.f fVar = gVar2.f52222d;
                    C23110a.h(fVar);
                    gVar = gVar2;
                    i12 = i14;
                    abstractC37401r1 = abstractC37401r1D;
                    try {
                        fVar.b(iA2, d1G4, cVarC, z12, z13, gVar2.f52220b);
                    } catch (DeadObjectException unused) {
                        a12.f51918q.k(gVar);
                        i14 = i12 + 1;
                        abstractC37401r1D = abstractC37401r1;
                    } catch (RemoteException e12) {
                        e = e12;
                        androidx.media3.common.util.s.h("Exception in " + gVar.toString(), e);
                        i14 = i12 + 1;
                        abstractC37401r1D = abstractC37401r1;
                    }
                } catch (DeadObjectException unused2) {
                    gVar = gVar2;
                    i12 = i14;
                    abstractC37401r1 = abstractC37401r1D;
                } catch (RemoteException e13) {
                    e = e13;
                    gVar = gVar2;
                    i12 = i14;
                    abstractC37401r1 = abstractC37401r1D;
                }
                i14 = i12 + 1;
                abstractC37401r1D = abstractC37401r1;
            }
            this.f52309a = true;
            this.f52310b = true;
        }
    }

    /* compiled from: MediaSessionImpl.java */
    public static class b implements H.g {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<T0> f52312b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakReference<G1> f52313c;

        public b(T0 t02, G1 g12) {
            this.f52312b = new WeakReference<>(t02);
            this.f52313c = new WeakReference<>(g12);
        }

        @Override // androidx.media3.common.H.g
        public final void D(C23091e c23091e) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52019o = c23091e;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                C23206a1 c23206a1 = C23206a1.this;
                if (c23206a1.f52357b.f52302p.getDeviceInfo().f47692b == 0) {
                    c23206a1.f52362g.setPlaybackToLocal(C1.z(c23091e));
                }
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void E(androidx.media3.common.B b12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52017m = b12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.k(b12);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void a(androidx.media3.common.text.b bVar) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1.a aVar = new D1.a(t0C.f52301o);
            aVar.f52020p = bVar;
            t0C.f52301o = aVar.a();
            t0C.f52289c.a(true, true);
        }

        @Override // androidx.media3.common.H.g
        public final void b(androidx.media3.common.X x12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52016l = x12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.getClass();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @j.P
        public final T0 c() {
            return this.f52312b.get();
        }

        @Override // androidx.media3.common.H.g
        public final void e(androidx.media3.common.B b12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52030z = b12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.o();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void g(PlaybackException playbackException) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52005a = playbackException;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void i(long j12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52001B = j12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.getClass();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void j(androidx.media3.common.V v12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            t0C.f52301o = t0C.f52301o.a(v12);
            t0C.f52289c.a(true, false);
            t0C.c(new C23228i(v12, 7));
        }

        @Override // androidx.media3.common.H.g
        public final void k(C23104o c23104o) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52021q = c23104o;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.h();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void m(androidx.media3.common.G g12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            t0C.f52301o = t0C.f52301o.j(g12);
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onDeviceVolumeChanged(int i12, boolean z12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            t0C.f52301o = t0C.f52301o.b(i12, z12);
            t0C.f52289c.a(true, true);
            try {
                androidx.media.J j12 = C23206a1.this.f52366k;
                if (j12 != null) {
                    if (z12) {
                        i12 = 0;
                    }
                    j12.d(i12);
                }
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onIsLoadingChanged(boolean z12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52027w = z12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.getClass();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
            t0C.l();
        }

        @Override // androidx.media3.common.H.g
        public final void onIsPlayingChanged(boolean z12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52026v = z12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
            t0C.l();
        }

        @Override // androidx.media3.common.H.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            t0C.f52301o = d12.g(i12, d12.f51998y, z12);
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackStateChanged(int i12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            G1 g12 = this.f52313c.get();
            if (g12 == null) {
                return;
            }
            t0C.f52301o = t0C.f52301o.l(i12, g12.a());
            t0C.f52289c.a(true, true);
            try {
                C23206a1.d dVar = t0C.f52293g.f52359d;
                g12.a();
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onPlaybackSuppressionReasonChanged(int i12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            t0C.f52301o = d12.g(d12.f51995v, i12, d12.f51994u);
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onRenderedFirstFrame() {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            t0C.c(new C23228i(8));
        }

        @Override // androidx.media3.common.H.g
        public final void onRepeatModeChanged(int i12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52012h = i12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.l(i12);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onShuffleModeEnabledChanged(boolean z12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52013i = z12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.m(z12);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void onVolumeChanged(@InterfaceC42167x float f12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52018n = f12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.getClass();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void q(long j12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52002C = j12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
        }

        @Override // androidx.media3.common.H.g
        public final void s(H.c cVar) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            t0C.d(cVar);
        }

        @Override // androidx.media3.common.H.g
        public final void t(int i12, H.k kVar, H.k kVar2) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52008d = kVar;
            aVarB.f52009e = kVar2;
            aVarB.f52010f = i12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                T0 t02 = C23206a1.this.f52357b;
                t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void v(androidx.media3.common.P p12, int i12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            G1 g12 = this.f52313c.get();
            if (g12 == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            N1 n1P0 = g12.p0();
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52014j = p12;
            aVarB.f52007c = n1P0;
            aVarB.f52015k = i12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(false, true);
            try {
                t0C.f52293g.f52359d.n(p12);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void w(int i12, @j.P androidx.media3.common.z zVar) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i13 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52006b = i12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.i(zVar);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void y(long j12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            D1 d12 = t0C.f52301o;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52000A = j12;
            t0C.f52301o = aVarB.a();
            t0C.f52289c.a(true, true);
            try {
                t0C.f52293g.f52359d.getClass();
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }

        @Override // androidx.media3.common.H.g
        public final void z(androidx.media3.common.U u12) {
            T0 t0C = c();
            if (t0C == null) {
                return;
            }
            int i12 = T0.f52286w;
            t0C.m();
            if (this.f52313c.get() == null) {
                return;
            }
            t0C.f52301o = t0C.f52301o.o(u12);
            t0C.f52289c.a(true, true);
            t0C.c(new C23228i(u12, 6));
        }
    }

    /* compiled from: MediaSessionImpl.java */
    public interface c {
        void b(O0.f fVar, int i12);
    }

    static {
        new O1(1);
    }

    public T0(O0 o02, com.avito.android.messenger.service.media_session.a aVar, String str, androidx.media3.common.H h12, AbstractC37401r1 abstractC37401r1, O0.d dVar, Bundle bundle, C23210c c23210c) {
        this.f52291e = aVar;
        this.f52296j = o02;
        A1 a12 = new A1(this);
        this.f52292f = a12;
        this.f52308v = abstractC37401r1;
        this.f52300n = new Handler(Looper.getMainLooper());
        Handler handler = new Handler(h12.G());
        this.f52297k = handler;
        this.f52290d = dVar;
        this.f52298l = c23210c;
        this.f52301o = D1.f51936G;
        this.f52289c = new a(h12.G());
        this.f52294h = str;
        Uri uriBuild = new Uri.Builder().scheme(T0.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f52288b = uriBuild;
        this.f52295i = new P1(Process.myUid(), 1001001300, 2, aVar.getPackageName(), a12, bundle);
        this.f52293g = new C23206a1(this, uriBuild, handler);
        G1 g12 = new G1(h12);
        g12.f52049b = -1;
        AbstractC37401r1.C();
        this.f52302p = g12;
        g12.f52052e = abstractC37401r1;
        androidx.media3.common.util.M.I(handler, new RunnableC23253q0(6, this, g12));
        this.f52307u = 3000L;
        this.f52299m = new RunnableC23216e(this, 2);
        androidx.media3.common.util.M.I(handler, new RunnableC23216e(this, 3));
    }

    public ServiceC23218e1 a(MediaSessionCompat.Token token) {
        ServiceC23218e1 serviceC23218e1 = new ServiceC23218e1(this);
        serviceC23218e1.m(token);
        return serviceC23218e1;
    }

    public final void b(O0.g gVar, c cVar) {
        int iA2;
        A1 a12 = this.f52292f;
        try {
            J1 j1F = a12.f51918q.f(gVar);
            if (j1F != null) {
                iA2 = j1F.a();
            } else if (!e(gVar)) {
                return;
            } else {
                iA2 = 0;
            }
            O0.f fVar = gVar.f52222d;
            if (fVar != null) {
                cVar.b(fVar, iA2);
            }
        } catch (DeadObjectException unused) {
            a12.f51918q.k(gVar);
        } catch (RemoteException e12) {
            androidx.media3.common.util.s.h("Exception in " + gVar.toString(), e12);
        }
    }

    public void c(c cVar) {
        AbstractC37401r1<O0.g> abstractC37401r1D = this.f52292f.f51918q.d();
        for (int i12 = 0; i12 < abstractC37401r1D.size(); i12++) {
            b(abstractC37401r1D.get(i12), cVar);
        }
        try {
            cVar.b(this.f52293g.f52359d, 0);
        } catch (RemoteException e12) {
            androidx.media3.common.util.s.d("Exception in using media1 API", e12);
        }
    }

    public final void d(H.c cVar) {
        this.f52289c.a(false, false);
        c(new C23258s0(cVar));
        try {
            C23206a1.d dVar = this.f52293g.f52359d;
            C23104o c23104o = this.f52301o.f51991r;
            dVar.h();
        } catch (RemoteException e12) {
            androidx.media3.common.util.s.d("Exception in using media1 API", e12);
        }
    }

    public boolean e(O0.g gVar) {
        return this.f52292f.f51918q.g(gVar) || this.f52293g.f52356a.g(gVar);
    }

    public final boolean f() {
        boolean z12;
        synchronized (this.f52287a) {
            z12 = this.f52306t;
        }
        return z12;
    }

    public final com.google.common.util.concurrent.D0<O1> g(O0.g gVar, K1 k12, Bundle bundle) {
        return this.f52290d.c(this.f52296j, gVar, k12, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        int i12;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
            this.f52300n.post(new RunnableC23253q0(8, this, e1Var));
            try {
                return ((Boolean) e1Var.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e12) {
                throw new IllegalStateException(e12);
            }
        }
        AbstractServiceC23212c1.d dVar = this.f52304r;
        if (dVar == null || (i12 = androidx.media3.common.util.M.f47887a) < 31 || i12 >= 33) {
            return true;
        }
        int i13 = AbstractServiceC23212c1.f52402j;
        AbstractServiceC23212c1 abstractServiceC23212c1 = AbstractServiceC23212c1.this;
        if (abstractServiceC23212c1.c().f52141k) {
            return true;
        }
        return abstractServiceC23212c1.f(this.f52296j, true);
    }

    public final com.google.common.util.concurrent.D0<O0.i> i(O0.g gVar, List<androidx.media3.common.z> list, int i12, long j12) {
        return this.f52290d.a(this.f52296j, gVar, list, i12, j12);
    }

    public final void j(androidx.media3.common.H h12) {
        m();
        this.f52290d.getClass();
        com.google.common.util.concurrent.D0 d0C = C37568u0.c(new UnsupportedOperationException());
        C37568u0.a(d0C, new S0(h12), d0C.isDone() ? com.google.common.util.concurrent.Q0.a() : C22782j.a(this.f52297k));
    }

    public final void k() {
        synchronized (this.f52287a) {
            try {
                if (this.f52306t) {
                    return;
                }
                this.f52306t = true;
                this.f52297k.removeCallbacksAndMessages(null);
                try {
                    androidx.media3.common.util.M.I(this.f52297k, new RunnableC23216e(this, 1));
                } catch (Exception e12) {
                    androidx.media3.common.util.s.h("Exception thrown while closing", e12);
                }
                C23206a1 c23206a1 = this.f52293g;
                boolean z12 = c23206a1.f52365j;
                MediaSessionCompat mediaSessionCompat = c23206a1.f52362g;
                if (!z12) {
                    mediaSessionCompat.setMediaButtonReceiver(null);
                }
                C23206a1.e eVar = c23206a1.f52364i;
                if (eVar != null) {
                    c23206a1.f52357b.f52291e.unregisterReceiver(eVar);
                }
                mediaSessionCompat.release();
                A1 a12 = this.f52292f;
                Iterator<O0.g> it = a12.f51918q.d().iterator();
                while (it.hasNext()) {
                    O0.f fVar = it.next().f52222d;
                    if (fVar != null) {
                        try {
                            fVar.f();
                        } catch (RemoteException unused) {
                        }
                    }
                }
                Iterator<O0.g> it2 = a12.f51919r.iterator();
                while (it2.hasNext()) {
                    O0.f fVar2 = it2.next().f52222d;
                    if (fVar2 != null) {
                        try {
                            fVar2.f();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Handler handler = this.f52297k;
        RunnableC23216e runnableC23216e = this.f52299m;
        handler.removeCallbacks(runnableC23216e);
        long j12 = this.f52307u;
        if (j12 > 0) {
            if (this.f52302p.k() || this.f52302p.isLoading()) {
                handler.postDelayed(runnableC23216e, j12);
            }
        }
    }

    public final void m() {
        if (Looper.myLooper() != this.f52297k.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
