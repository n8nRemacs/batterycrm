package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.AbstractServiceC23085i;
import androidx.media.C;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import androidx.media3.session.C23206a1.a;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.InterfaceC37564s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MediaSessionLegacyStub.java */
/* renamed from: androidx.media3.session.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23206a1 extends MediaSessionCompat.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final int f52355o;

    /* renamed from: a, reason: collision with root package name */
    public final C23225h<C.b> f52356a;

    /* renamed from: b, reason: collision with root package name */
    public final T0 f52357b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media.C f52358c;

    /* renamed from: d, reason: collision with root package name */
    public final d f52359d;

    /* renamed from: e, reason: collision with root package name */
    public final b f52360e;

    /* renamed from: f, reason: collision with root package name */
    public final f f52361f;

    /* renamed from: g, reason: collision with root package name */
    public final MediaSessionCompat f52362g;

    /* renamed from: h, reason: collision with root package name */
    public final String f52363h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final e f52364i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f52365j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public androidx.media.J f52366k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f52367l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public InterfaceC37564s0<Bitmap> f52368m;

    /* renamed from: n, reason: collision with root package name */
    public int f52369n;

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$b */
    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final C23225h<C.b> f52373a;

        public b(Looper looper, C23225h<C.b> c23225h) {
            super(looper);
            this.f52373a = c23225h;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            O0.g gVar = (O0.g) message.obj;
            C23225h<C.b> c23225h = this.f52373a;
            if (c23225h.g(gVar)) {
                try {
                    O0.f fVar = gVar.f52222d;
                    C23110a.h(fVar);
                    fVar.f();
                } catch (RemoteException unused) {
                }
                c23225h.k(gVar);
            }
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$c */
    public static final class c implements O0.f {

        /* renamed from: a, reason: collision with root package name */
        public final C.b f52374a;

        public c(C.b bVar) {
            this.f52374a = bVar;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != c.class) {
                return false;
            }
            return androidx.media3.common.util.M.a(this.f52374a, ((c) obj).f52374a);
        }

        public final int hashCode() {
            return Objects.hash(this.f52374a);
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$e */
    public final class e extends BroadcastReceiver {
        public e(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (androidx.media3.common.util.M.a(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
                Uri data = intent.getData();
                if (androidx.media3.common.util.M.a(data, data) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    C23206a1.this.f52362g.getController().dispatchMediaButtonEvent(keyEvent);
                }
            }
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$f */
    public class f extends Handler {
        public f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C.b bVar = (C.b) message.obj;
            int i12 = C23206a1.f52355o;
            C23206a1 c23206a1 = C23206a1.this;
            c23206a1.f52361f.removeMessages(1002);
            c23206a1.b(1, new U0(c23206a1, 10), bVar);
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$g */
    public interface g {
        void b(O0.g gVar);
    }

    static {
        f52355o = androidx.media3.common.util.M.f47887a >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[PHI: r2
  0x0093: PHI (r2v9 android.content.ComponentName) = (r2v8 android.content.ComponentName), (r2v14 android.content.ComponentName) binds: [B:12:0x007f, B:17:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23206a1(androidx.media3.session.T0 r9, android.net.Uri r10, android.os.Handler r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.C23206a1.<init>(androidx.media3.session.T0, android.net.Uri, android.os.Handler):void");
    }

    public static androidx.media3.common.z a(@j.P String str, @j.P Uri uri, @j.P String str2, @j.P Bundle bundle) {
        z.c cVar = new z.c();
        if (str == null) {
            str = "";
        }
        cVar.f47988a = str;
        z.i.a aVar = new z.i.a();
        aVar.f48085a = uri;
        aVar.f48086b = str2;
        aVar.f48087c = bundle;
        cVar.f48000m = aVar.a();
        return cVar.a();
    }

    @j.P
    public static ComponentName d(com.avito.android.messenger.service.media_session.a aVar, String str) {
        PackageManager packageManager = aVar.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(aVar.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void b(int i12, g gVar, @j.P C.b bVar) {
        T0 t02 = this.f52357b;
        if (t02.f()) {
            return;
        }
        if (bVar == null) {
            androidx.media3.common.util.s.b();
        } else {
            androidx.media3.common.util.M.I(t02.f52297k, new J0(i12, this, 1, bVar, gVar));
        }
    }

    public final void c(@j.P K1 k12, int i12, g gVar, @j.P C.b bVar) {
        Object objValueOf = k12;
        if (bVar != null) {
            androidx.media3.common.util.M.I(this.f52357b.f52297k, new RunnableC23247o0(this, k12, i12, bVar, gVar));
            return;
        }
        if (k12 == null) {
            objValueOf = Integer.valueOf(i12);
        }
        objValueOf.toString();
        androidx.media3.common.util.s.b();
    }

    public final void e(final androidx.media3.common.z zVar, final boolean z12) {
        b(31, new g() { // from class: androidx.media3.session.Y0
            @Override // androidx.media3.session.C23206a1.g
            public final void b(O0.g gVar) {
                int i12 = C23206a1.f52355o;
                C23206a1 c23206a1 = this.f52344b;
                c23206a1.getClass();
                C37568u0.a(c23206a1.f52357b.i(gVar, AbstractC37401r1.E(zVar), -1, -9223372036854775807L), c23206a1.new a(gVar, z12), com.google.common.util.concurrent.Q0.a());
            }
        }, this.f52362g.getCurrentControllerInfo());
    }

    @j.P
    public final O0.g f(C.b bVar) {
        O0.g gVarE = this.f52356a.e(bVar);
        if (gVarE == null) {
            c cVar = new c(bVar);
            boolean zB2 = this.f52358c.b(bVar);
            Bundle bundle = Bundle.EMPTY;
            O0.g gVar = new O0.g(bVar, 0, zB2, cVar);
            T0 t02 = this.f52357b;
            O0.e eVarD = t02.f52290d.d(t02.f52296j, gVar);
            if (!eVarD.f52215a) {
                return null;
            }
            this.f52356a.a(bVar, gVar, eVarD.f52216b, eVarD.f52217c);
            gVarE = gVar;
        }
        b bVar2 = this.f52360e;
        long j12 = this.f52367l;
        bVar2.removeMessages(1001, gVarE);
        bVar2.sendMessageDelayed(bVar2.obtainMessage(1001, gVarE), j12);
        return gVarE;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onAddQueueItem(@j.P MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        b(20, new C23214d0(this, mediaDescriptionCompat, -1), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCommand(String str, @j.P final Bundle bundle, @j.P final ResultReceiver resultReceiver) {
        C23110a.h(str);
        if (TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) && resultReceiver != null) {
            resultReceiver.send(0, this.f52357b.f52295i.k());
        } else {
            final K1 k12 = new K1(Bundle.EMPTY, str);
            c(k12, 0, new g() { // from class: androidx.media3.session.X0
                @Override // androidx.media3.session.C23206a1.g
                public final void b(O0.g gVar) {
                    C23206a1 c23206a1 = this.f52337b;
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        int i12 = C23206a1.f52355o;
                        bundle2 = Bundle.EMPTY;
                    }
                    com.google.common.util.concurrent.D0<O1> d0G = c23206a1.f52357b.g(gVar, k12, bundle2);
                    ResultReceiver resultReceiver2 = resultReceiver;
                    if (resultReceiver2 != null) {
                        d0G.N(new RunnableC23253q0(9, d0G, resultReceiver2), com.google.common.util.concurrent.Q0.a());
                    }
                }
            }, this.f52362g.getCurrentControllerInfo());
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, @j.P Bundle bundle) {
        K1 k12 = new K1(Bundle.EMPTY, str);
        c(k12, 0, new U(this, k12, bundle), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onFastForward() {
        b(12, new U0(this, 0), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        C.b currentControllerInfo = this.f52362g.getCurrentControllerInfo();
        int keyCode = keyEvent.getKeyCode();
        f fVar = this.f52361f;
        if (keyCode != 79 && keyCode != 85) {
            if (fVar.hasMessages(1002)) {
                fVar.removeMessages(1002);
                b(1, new U0(this, 10), currentControllerInfo);
            }
            return false;
        }
        if (this.f52363h.equals(currentControllerInfo.a()) || keyEvent.getRepeatCount() != 0) {
            fVar.removeMessages(1002);
            b(1, new U0(this, 10), currentControllerInfo);
        } else if (fVar.hasMessages(1002)) {
            fVar.removeMessages(1002);
            onSkipToNext();
        } else {
            fVar.sendMessageDelayed(fVar.obtainMessage(1002, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        b(1, new U0(this, 11), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        b(1, new U0(this, 9), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(String str, @j.P Bundle bundle) {
        e(a(str, null, null, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, @j.P Bundle bundle) {
        e(a(null, null, str, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromUri(Uri uri, @j.P Bundle bundle) {
        e(a(null, uri, null, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepare() {
        b(2, new U0(this, 5), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromMediaId(String str, @j.P Bundle bundle) {
        e(a(str, null, null, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, @j.P Bundle bundle) {
        e(a(null, null, str, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromUri(Uri uri, @j.P Bundle bundle) {
        e(a(null, uri, null, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRemoveQueueItem(@j.P MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        b(20, new N(8, this, mediaDescriptionCompat), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRemoveQueueItemAt(int i12) {
        b(20, new W0(this, i12, 1), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onRewind() {
        b(11, new U0(this, 4), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j12) {
        b(5, new V0(this, j12, 1), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetPlaybackSpeed(float f12) {
        b(13, new Y(f12, 2, this), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat) {
        onSetRating(ratingCompat, null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRepeatMode(int i12) {
        b(15, new W0(this, i12, 0), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetShuffleMode(int i12) {
        b(14, new W0(this, i12, 2), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        boolean zU2 = this.f52357b.f52302p.u(9);
        MediaSessionCompat mediaSessionCompat = this.f52362g;
        if (zU2) {
            b(9, new U0(this, 7), mediaSessionCompat.getCurrentControllerInfo());
        } else {
            b(8, new U0(this, 8), mediaSessionCompat.getCurrentControllerInfo());
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        boolean zU2 = this.f52357b.f52302p.u(7);
        MediaSessionCompat mediaSessionCompat = this.f52362g;
        if (zU2) {
            b(7, new U0(this, 1), mediaSessionCompat.getCurrentControllerInfo());
        } else {
            b(6, new U0(this, 2), mediaSessionCompat.getCurrentControllerInfo());
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToQueueItem(long j12) {
        b(10, new V0(this, j12, 0), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onStop() {
        b(3, new U0(this, 6), this.f52362g.getCurrentControllerInfo());
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetRating(RatingCompat ratingCompat, @j.P Bundle bundle) {
        androidx.media3.common.J jU2 = C1.u(ratingCompat);
        if (jU2 != null) {
            c(null, 40010, new U0(this, jU2), this.f52362g.getCurrentControllerInfo());
        } else {
            Objects.toString(ratingCompat);
            androidx.media3.common.util.s.g();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onAddQueueItem(@j.P MediaDescriptionCompat mediaDescriptionCompat, int i12) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        b(20, new C23214d0(this, mediaDescriptionCompat, i12), this.f52362g.getCurrentControllerInfo());
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$d */
    public final class d implements O0.f {

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public Uri f52377c;

        /* renamed from: a, reason: collision with root package name */
        public androidx.media3.common.B f52375a = androidx.media3.common.B.f47110J;

        /* renamed from: b, reason: collision with root package name */
        public String f52376b = "";

        /* renamed from: d, reason: collision with root package name */
        public long f52378d = -9223372036854775807L;

        /* compiled from: MediaSessionLegacyStub.java */
        /* renamed from: androidx.media3.session.a1$d$a */
        public class a implements InterfaceC37564s0<Bitmap> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.media3.common.B f52380a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f52381b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f52382c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f52383d;

            public a(androidx.media3.common.B b12, String str, Uri uri, long j12) {
                this.f52380a = b12;
                this.f52381b = str;
                this.f52382c = uri;
                this.f52383d = j12;
            }

            @Override // com.google.common.util.concurrent.InterfaceC37564s0
            public final void a(Throwable th2) {
                if (this != C23206a1.this.f52368m) {
                    return;
                }
                th2.getMessage();
                androidx.media3.common.util.s.g();
            }

            @Override // com.google.common.util.concurrent.InterfaceC37564s0
            public final void onSuccess(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                d dVar = d.this;
                C23206a1 c23206a1 = C23206a1.this;
                if (this != c23206a1.f52368m) {
                    return;
                }
                c23206a1.f52362g.setMetadata(C1.p(this.f52380a, this.f52381b, this.f52382c, this.f52383d, bitmap2));
                T0 t02 = C23206a1.this.f52357b;
                androidx.media3.common.util.M.I(t02.f52300n, new RunnableC23216e(t02, 4));
            }
        }

        public d() {
        }

        @Override // androidx.media3.session.O0.f
        public final void d(int i12, N1 n12, boolean z12, boolean z13) {
            T0 t02 = C23206a1.this.f52357b;
            t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
        }

        @Override // androidx.media3.session.O0.f
        public final void e(int i12, H.c cVar) {
            C23206a1 c23206a1 = C23206a1.this;
            G1 g12 = c23206a1.f52357b.f52302p;
            int i13 = g12.u(20) ? 4 : 0;
            if (c23206a1.f52369n != i13) {
                c23206a1.f52369n = i13;
                c23206a1.f52362g.setFlags(i13);
            }
            c23206a1.f52357b.f52293g.f52362g.setPlaybackState(g12.m0());
        }

        public final void h() {
            int i12;
            F1 f12;
            C23206a1 c23206a1 = C23206a1.this;
            G1 g12 = c23206a1.f52357b.f52302p;
            if (g12.getDeviceInfo().f47692b == 0) {
                f12 = null;
            } else {
                H.c cVarN = g12.n();
                if (cVarN.f47242b.a(26, 34)) {
                    i12 = cVarN.f47242b.a(25, 33) ? 2 : 1;
                } else {
                    i12 = 0;
                }
                Handler handler = new Handler(g12.f47862a.G());
                int iW2 = g12.u(23) ? g12.w() : 0;
                C23104o deviceInfo = g12.getDeviceInfo();
                f12 = new F1(g12, i12, deviceInfo.f47694d, iW2, deviceInfo.f47695e, handler);
            }
            c23206a1.f52366k = f12;
            MediaSessionCompat mediaSessionCompat = c23206a1.f52362g;
            if (f12 == null) {
                mediaSessionCompat.setPlaybackToLocal(C1.z(g12.u(21) ? g12.Q() : C23091e.f47644h));
            } else {
                mediaSessionCompat.setPlaybackToRemote(f12);
            }
        }

        public final void i(@j.P androidx.media3.common.z zVar) {
            o();
            C23206a1 c23206a1 = C23206a1.this;
            if (zVar == null) {
                c23206a1.f52362g.setRatingType(0);
            } else {
                c23206a1.f52362g.setRatingType(C1.A(zVar.f47981e.f47161i));
            }
            T0 t02 = c23206a1.f52357b;
            t02.f52293g.f52362g.setPlaybackState(t02.f52302p.m0());
        }

        public final void j(int i12, G1 g12) {
            n(g12.r0());
            k(g12.u(18) ? g12.y() : androidx.media3.common.B.f47110J);
            g12.s0();
            o();
            m(g12.o());
            l(g12.getRepeatMode());
            g12.getDeviceInfo();
            h();
            C23206a1 c23206a1 = C23206a1.this;
            c23206a1.getClass();
            int i13 = g12.u(20) ? 4 : 0;
            if (c23206a1.f52369n != i13) {
                c23206a1.f52369n = i13;
                c23206a1.f52362g.setFlags(i13);
            }
            i(g12.q0());
        }

        public final void k(androidx.media3.common.B b12) {
            C23206a1 c23206a1 = C23206a1.this;
            CharSequence queueTitle = c23206a1.f52362g.getController().getQueueTitle();
            CharSequence charSequence = b12.f47154b;
            if (TextUtils.equals(queueTitle, charSequence)) {
                return;
            }
            c23206a1.f52362g.setQueueTitle(charSequence);
        }

        public final void l(int i12) {
            C23206a1.this.f52357b.f52293g.f52362g.setRepeatMode(C1.r(i12));
        }

        public final void m(boolean z12) {
            MediaSessionCompat mediaSessionCompat = C23206a1.this.f52357b.f52293g.f52362g;
            AbstractServiceC23085i.a aVar = C1.f51933a;
            mediaSessionCompat.setShuffleMode(z12 ? 1 : 0);
        }

        public final void n(androidx.media3.common.P p12) {
            boolean zX2 = p12.x();
            C23206a1 c23206a1 = C23206a1.this;
            if (zX2) {
                c23206a1.f52362g.setQueue(null);
                return;
            }
            AbstractServiceC23085i.a aVar = C1.f51933a;
            ArrayList arrayList = new ArrayList();
            P.d dVar = new P.d();
            for (int i12 = 0; i12 < p12.w(); i12++) {
                arrayList.add(p12.u(i12, dVar, 0L).f47409d);
            }
            ArrayList arrayList2 = new ArrayList();
            RunnableC23219f runnableC23219f = new RunnableC23219f(this, new AtomicInteger(0), arrayList, arrayList2, p12, 3);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                byte[] bArr = ((androidx.media3.common.z) arrayList.get(i13)).f47981e.f47163k;
                if (bArr == null) {
                    arrayList2.add(null);
                    runnableC23219f.run();
                } else {
                    com.google.common.util.concurrent.D0<Bitmap> d0B = c23206a1.f52357b.f52298l.b(bArr);
                    arrayList2.add(d0B);
                    Handler handler = c23206a1.f52357b.f52297k;
                    Objects.requireNonNull(handler);
                    d0B.N(runnableC23219f, new androidx.media3.exoplayer.audio.o(handler, 0));
                }
            }
            o();
        }

        public final void o() {
            Bitmap bitmap;
            z.h hVar;
            C23206a1 c23206a1 = C23206a1.this;
            G1 g12 = c23206a1.f52357b.f52302p;
            androidx.media3.common.z zVarQ0 = g12.q0();
            androidx.media3.common.B bS02 = g12.s0();
            long duration = g12.u(16) ? g12.getDuration() : -9223372036854775807L;
            String str = zVarQ0 != null ? zVarQ0.f47978b : "";
            Uri uri = (zVarQ0 == null || (hVar = zVarQ0.f47979c) == null) ? null : hVar.f48069b;
            if (Objects.equals(this.f52375a, bS02) && Objects.equals(this.f52376b, str) && Objects.equals(this.f52377c, uri) && this.f52378d == duration) {
                return;
            }
            this.f52376b = str;
            this.f52377c = uri;
            this.f52375a = bS02;
            this.f52378d = duration;
            T0 t02 = c23206a1.f52357b;
            com.google.common.util.concurrent.D0<Bitmap> d0C = t02.f52298l.c(bS02);
            if (d0C != null) {
                c23206a1.f52368m = null;
                if (d0C.isDone()) {
                    try {
                        bitmap = (Bitmap) C37568u0.b(d0C);
                    } catch (ExecutionException e12) {
                        e12.getMessage();
                        androidx.media3.common.util.s.g();
                    }
                } else {
                    a aVar = new a(bS02, str, uri, duration);
                    c23206a1.f52368m = aVar;
                    Handler handler = t02.f52297k;
                    Objects.requireNonNull(handler);
                    C37568u0.a(d0C, aVar, new androidx.media3.exoplayer.audio.o(handler, 0));
                }
                bitmap = null;
            } else {
                bitmap = null;
            }
            c23206a1.f52362g.setMetadata(C1.p(bS02, str, uri, duration, bitmap));
        }

        @Override // androidx.media3.session.O0.f
        public final void f() {
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* renamed from: androidx.media3.session.a1$a */
    public class a implements InterfaceC37564s0<O0.i> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O0.g f52370a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f52371b;

        public a(O0.g gVar, boolean z12) {
            this.f52370a = gVar;
            this.f52371b = z12;
        }

        @Override // com.google.common.util.concurrent.InterfaceC37564s0
        public final void onSuccess(O0.i iVar) {
            final O0.i iVar2 = iVar;
            T0 t02 = C23206a1.this.f52357b;
            Handler handler = t02.f52297k;
            final boolean z12 = this.f52371b;
            androidx.media3.common.util.M.I(handler, new RunnableC23253q0(t02, this.f52370a, new Runnable() { // from class: androidx.media3.session.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    G1 g12 = C23206a1.this.f52357b.f52302p;
                    C1.E(g12, iVar2);
                    int playbackState = g12.getPlaybackState();
                    if (playbackState == 1) {
                        if (g12.u(2)) {
                            g12.prepare();
                        }
                    } else if (playbackState == 4 && g12.u(4)) {
                        g12.D();
                    }
                    if (z12 && g12.u(1)) {
                        g12.play();
                    }
                }
            }));
        }

        @Override // com.google.common.util.concurrent.InterfaceC37564s0
        public final void a(Throwable th2) {
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSetCaptioningEnabled(boolean z12) {
    }
}
