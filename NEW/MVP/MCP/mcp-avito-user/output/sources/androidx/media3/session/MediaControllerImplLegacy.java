package androidx.media3.session;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media.AbstractServiceC23085i;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.H;
import androidx.media3.common.P;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.z;
import androidx.media3.session.D1;
import androidx.media3.session.H1;
import androidx.media3.session.J;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class MediaControllerImplLegacy implements J.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f52146a;

    /* renamed from: b, reason: collision with root package name */
    public final J f52147b;

    /* renamed from: c, reason: collision with root package name */
    public final P1 f52148c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.util.r<H.g> f52149d;

    /* renamed from: e, reason: collision with root package name */
    public final b f52150e;

    /* renamed from: f, reason: collision with root package name */
    public final C23210c f52151f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public MediaControllerCompat f52152g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public MediaBrowserCompat f52153h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52154i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52155j;

    /* renamed from: k, reason: collision with root package name */
    public d f52156k = new d();

    /* renamed from: l, reason: collision with root package name */
    public d f52157l = new d();

    /* renamed from: m, reason: collision with root package name */
    public c f52158m = new c();

    public class a extends MediaBrowserCompat.ConnectionCallback {
        public a(AnonymousClass1 anonymousClass1) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            MediaBrowserCompat mediaBrowserCompat = mediaControllerImplLegacy.f52153h;
            if (mediaBrowserCompat != null) {
                mediaControllerImplLegacy.Z().a0(new RunnableC23253q0(0, mediaControllerImplLegacy, mediaBrowserCompat.getSessionToken()));
                mediaControllerImplLegacy.Z().f52080e.post(new RunnableC23250p0(mediaControllerImplLegacy, 1));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            MediaControllerImplLegacy.this.Z().release();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            MediaControllerImplLegacy.this.Z().release();
        }
    }

    public final class b extends MediaControllerCompat.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f52161a;

        public b(Looper looper) {
            this.f52161a = new Handler(looper, new C23232j0(this, 1));
        }

        public final void a() {
            Handler handler = this.f52161a;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.sendEmptyMessageDelayed(1, 500L);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onAudioInfoChanged(MediaControllerCompat.PlaybackInfo playbackInfo) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            int i12 = dVar.f52172f;
            mediaControllerImplLegacy.f52157l = new d(playbackInfo, dVar.f52168b, dVar.f52169c, dVar.f52170d, dVar.f52171e, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onCaptioningEnabledChanged(boolean z12) {
            J jZ2 = MediaControllerImplLegacy.this.Z();
            jZ2.getClass();
            C23110a.g(Looper.myLooper() == jZ2.f52080e.getLooper());
            new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z12);
            new K1(Bundle.EMPTY, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED");
            jZ2.f52079d.getClass();
            J.c.h();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onExtrasChanged(Bundle bundle) {
            J jZ2 = MediaControllerImplLegacy.this.Z();
            jZ2.getClass();
            C23110a.g(Looper.myLooper() == jZ2.f52080e.getLooper());
            jZ2.f52079d.getClass();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            int i12 = dVar.f52172f;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, dVar.f52168b, mediaMetadataCompat, dVar.f52170d, dVar.f52171e, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            PlaybackStateCompat playbackStateCompatX = MediaControllerImplLegacy.X(playbackStateCompat);
            int i12 = dVar.f52172f;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, playbackStateCompatX, dVar.f52169c, dVar.f52170d, dVar.f52171e, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onQueueChanged(@j.P List<MediaSessionCompat.QueueItem> list) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            List<MediaSessionCompat.QueueItem> listJ = MediaControllerImplLegacy.J(list);
            int i12 = dVar.f52172f;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, dVar.f52168b, dVar.f52169c, listJ, dVar.f52171e, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            int i12 = dVar.f52172f;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, dVar.f52168b, dVar.f52169c, dVar.f52170d, charSequence, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onRepeatModeChanged(int i12) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            CharSequence charSequence = dVar.f52171e;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, dVar.f52168b, dVar.f52169c, dVar.f52170d, charSequence, i12, dVar.f52173g);
            a();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionDestroyed() {
            MediaControllerImplLegacy.this.Z().release();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            J jZ2 = MediaControllerImplLegacy.this.Z();
            jZ2.getClass();
            C23110a.g(Looper.myLooper() == jZ2.f52080e.getLooper());
            new K1(Bundle.EMPTY, str);
            jZ2.f52079d.getClass();
            J.c.h();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionReady() {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            if (!mediaControllerImplLegacy.f52155j) {
                mediaControllerImplLegacy.e0();
                return;
            }
            d dVar = mediaControllerImplLegacy.f52157l;
            PlaybackStateCompat playbackStateCompatX = MediaControllerImplLegacy.X(mediaControllerImplLegacy.f52152g.getPlaybackState());
            int repeatMode = mediaControllerImplLegacy.f52152g.getRepeatMode();
            int shuffleMode = mediaControllerImplLegacy.f52152g.getShuffleMode();
            List<MediaSessionCompat.QueueItem> list = dVar.f52170d;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, playbackStateCompatX, dVar.f52169c, list, dVar.f52171e, repeatMode, shuffleMode);
            onCaptioningEnabledChanged(mediaControllerImplLegacy.f52152g.isCaptioningEnabled());
            this.f52161a.removeMessages(1);
            mediaControllerImplLegacy.a0(false, mediaControllerImplLegacy.f52157l);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onShuffleModeChanged(int i12) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            d dVar = mediaControllerImplLegacy.f52157l;
            CharSequence charSequence = dVar.f52171e;
            mediaControllerImplLegacy.f52157l = new d(dVar.f52167a, dVar.f52168b, dVar.f52169c, dVar.f52170d, charSequence, dVar.f52172f, i12);
            a();
        }
    }

    public MediaControllerImplLegacy(Context context, J j12, P1 p12, Looper looper, C23210c c23210c) {
        this.f52149d = new androidx.media3.common.util.r<>(looper, InterfaceC23115f.f47901a, new C23244n0(this));
        this.f52146a = context;
        this.f52147b = j12;
        this.f52150e = new b(looper);
        this.f52148c = p12;
        this.f52151f = c23210c;
    }

    public static List<MediaSessionCompat.QueueItem> J(@j.P List<MediaSessionCompat.QueueItem> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        AbstractServiceC23085i.a aVar = C1.f51933a;
        ArrayList arrayList = new ArrayList();
        for (MediaSessionCompat.QueueItem queueItem : list) {
            if (queueItem != null) {
                arrayList.add(queueItem);
            }
        }
        return arrayList;
    }

    @j.P
    public static PlaybackStateCompat X(@j.P PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return null;
        }
        if (playbackStateCompat.getPlaybackSpeed() > 0.0f) {
            return playbackStateCompat;
        }
        androidx.media3.common.util.s.g();
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), playbackStateCompat.getPosition(), 1.0f, playbackStateCompat.getLastPositionUpdateTime()).build();
    }

    public static H.k Y(int i12, @j.P androidx.media3.common.z zVar, long j12, boolean z12) {
        return new H.k(null, i12, zVar, null, i12, j12, j12, z12 ? 0 : -1, z12 ? 0 : -1);
    }

    @Override // androidx.media3.session.J.d
    public final boolean A() {
        return this.f52158m.f52163a.f51993t;
    }

    @Override // androidx.media3.session.J.d
    public final com.google.common.util.concurrent.D0<O1> B(K1 k12, Bundle bundle) {
        L1 l12 = this.f52158m.f52164b;
        l12.getClass();
        boolean zContains = l12.f52126b.contains(k12);
        String str = k12.f52116c;
        if (zContains) {
            this.f52152g.getTransportControls().sendCustomAction(str, bundle);
            return C37568u0.d(new O1(0));
        }
        final com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
        this.f52152g.sendCommand(str, bundle, new ResultReceiver(Z().f52080e) { // from class: androidx.media3.session.MediaControllerImplLegacy.1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i12, Bundle bundle2) {
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                e1Var.n(new O1(i12, bundle2));
            }
        });
        return e1Var;
    }

    @Override // androidx.media3.session.J.d
    public final int C() {
        return this.f52158m.f52163a.f51977d.f52195g;
    }

    @Override // androidx.media3.session.J.d
    public final void D() {
        f0(getCurrentMediaItemIndex(), 0L);
    }

    @Override // androidx.media3.session.J.d
    public final void E(H.g gVar) {
        this.f52149d.e(gVar);
    }

    @Override // androidx.media3.session.J.d
    public final void F(H.g gVar) {
        this.f52149d.a(gVar);
    }

    public final void G(int i12, List list) {
        ArrayList arrayList = new ArrayList();
        RunnableC23247o0 runnableC23247o0 = new RunnableC23247o0(this, new AtomicInteger(0), list, arrayList, i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            byte[] bArr = ((androidx.media3.common.z) list.get(i13)).f47981e.f47163k;
            if (bArr == null) {
                arrayList.add(null);
                runnableC23247o0.run();
            } else {
                com.google.common.util.concurrent.D0<Bitmap> d0B = this.f52151f.b(bArr);
                arrayList.add(d0B);
                Handler handler = Z().f52080e;
                Objects.requireNonNull(handler);
                d0B.N(runnableC23247o0, new androidx.media3.exoplayer.audio.o(handler, 0));
            }
        }
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void H(int i12) {
        R(i12, 1);
    }

    @Override // androidx.media3.session.J.d
    public final void I(@j.P Surface surface) {
        androidx.media3.common.util.s.g();
    }

    @Override // androidx.media3.session.J.d
    public final void K(androidx.media3.common.B b12) {
        androidx.media3.common.util.s.g();
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void L(boolean z12) {
        r(1, z12);
    }

    @Override // androidx.media3.session.J.d
    public final void M(List<androidx.media3.common.z> list, int i12, long j12) {
        if (list.isEmpty()) {
            t(0, Integer.MAX_VALUE);
            return;
        }
        H1 h1Y = H1.f52061i.y(0, list);
        long j13 = j12 == -9223372036854775807L ? 0L : j12;
        D1 d12 = this.f52158m.f52163a;
        N1 n12 = new N1(Y(i12, list.get(i12), j13, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        D1.a aVarB = M1.b(d12, d12);
        aVarB.f52014j = h1Y;
        aVarB.f52007c = n12;
        aVarB.f52015k = 0;
        D1 d1A = aVarB.a();
        c cVar = this.f52158m;
        h0(new c(d1A, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (d0()) {
            c0();
        }
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void N() {
        P(1);
    }

    @Override // androidx.media3.session.J.d
    public final void O(int i12, int i13, List<androidx.media3.common.z> list) {
        C23110a.b(i12 >= 0 && i12 <= i13);
        int iW2 = ((H1) this.f52158m.f52163a.f51984k).w();
        if (i12 > iW2) {
            return;
        }
        int iMin = Math.min(i13, iW2);
        T(iMin, list);
        t(i12, iMin);
    }

    @Override // androidx.media3.session.J.d
    public final void P(int i12) {
        int iW2 = w() - 1;
        if (iW2 >= getDeviceInfo().f47693c) {
            D1 d1B = this.f52158m.f52163a.b(iW2, A());
            c cVar = this.f52158m;
            h0(new c(d1B, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.adjustVolume(-1, i12);
    }

    @Override // androidx.media3.session.J.d
    public final C23091e Q() {
        return this.f52158m.f52163a.f51989p;
    }

    @Override // androidx.media3.session.J.d
    public final void R(int i12, int i13) {
        int i14;
        C23104o deviceInfo = getDeviceInfo();
        if (deviceInfo.f47693c <= i12 && ((i14 = deviceInfo.f47694d) == 0 || i12 <= i14)) {
            D1 d1B = this.f52158m.f52163a.b(i12, A());
            c cVar = this.f52158m;
            h0(new c(d1B, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.setVolumeTo(i12, i13);
    }

    @Override // androidx.media3.session.J.d
    public final void S(androidx.media3.common.z zVar) {
        f(zVar);
    }

    @Override // androidx.media3.session.J.d
    public final void T(int i12, List<androidx.media3.common.z> list) {
        C23110a.b(i12 >= 0);
        if (list.isEmpty()) {
            return;
        }
        H1 h12 = (H1) this.f52158m.f52163a.f51984k;
        if (h12.x()) {
            M(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i12, getCurrentTimeline().w());
        H1 h1Y = h12.y(iMin, list);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int size = list.size();
        if (currentMediaItemIndex >= iMin) {
            currentMediaItemIndex += size;
        }
        D1 d1N = this.f52158m.f52163a.n(h1Y, currentMediaItemIndex);
        c cVar = this.f52158m;
        h0(new c(d1N, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (d0()) {
            G(iMin, list);
        }
    }

    @Override // androidx.media3.session.J.d
    public final long U() {
        return this.f52158m.f52163a.f51977d.f52194f;
    }

    @Override // androidx.media3.session.J.d
    public final void V(androidx.media3.common.z zVar, long j12) {
        M(AbstractC37401r1.E(zVar), 0, j12);
    }

    @Override // androidx.media3.session.J.d
    public final void W(int i12, int i13, int i14) {
        C23110a.b(i12 >= 0 && i12 <= i13 && i14 >= 0);
        H1 h12 = (H1) this.f52158m.f52163a.f51984k;
        int iW2 = h12.w();
        int iMin = Math.min(i13, iW2);
        int i15 = iMin - i12;
        int i16 = iW2 - i15;
        int i17 = i16 - 1;
        int iMin2 = Math.min(i14, i16);
        if (i12 >= iW2 || i12 == iMin || i12 == iMin2) {
            return;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (currentMediaItemIndex >= i12) {
            currentMediaItemIndex = currentMediaItemIndex < iMin ? -1 : currentMediaItemIndex - i15;
        }
        if (currentMediaItemIndex == -1) {
            currentMediaItemIndex = androidx.media3.common.util.M.k(i12, 0, i17);
            androidx.media3.common.util.s.g();
        }
        if (currentMediaItemIndex >= iMin2) {
            currentMediaItemIndex += i15;
        }
        ArrayList arrayList = new ArrayList(h12.f52063g);
        androidx.media3.common.util.M.E(arrayList, i12, iMin, iMin2);
        D1 d1N = this.f52158m.f52163a.n(new H1(AbstractC37401r1.v(arrayList), h12.f52064h), currentMediaItemIndex);
        c cVar = this.f52158m;
        h0(new c(d1N, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (d0()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i18 = 0; i18 < i15; i18++) {
                arrayList2.add(this.f52156k.f52170d.get(i12));
                this.f52152g.removeQueueItem(this.f52156k.f52170d.get(i12).getDescription());
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                this.f52152g.addQueueItem(((MediaSessionCompat.QueueItem) arrayList2.get(i19)).getDescription(), i19 + iMin2);
            }
        }
    }

    public J Z() {
        return this.f52147b;
    }

    @Override // androidx.media3.session.J.d
    @j.P
    public final PlaybackException a() {
        return this.f52158m.f52163a.f51975b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0187 A[PHI: r1
  0x0187: PHI (r1v6 androidx.media3.session.H1) = (r1v1 androidx.media3.session.H1), (r1v8 androidx.media3.session.H1) binds: [B:87:0x018e, B:83:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(boolean r80, androidx.media3.session.MediaControllerImplLegacy.d r81) {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.MediaControllerImplLegacy.a0(boolean, androidx.media3.session.MediaControllerImplLegacy$d):void");
    }

    @Override // androidx.media3.session.J.d
    public final long b() {
        return 0L;
    }

    public final boolean b0() {
        return !this.f52158m.f52163a.f51984k.x();
    }

    @Override // androidx.media3.session.J.d
    public final void c(List list) {
        M(list, 0, -9223372036854775807L);
    }

    public final void c0() {
        P.d dVar = new P.d();
        C23110a.g(d0() && b0());
        D1 d12 = this.f52158m.f52163a;
        H1 h12 = (H1) d12.f51984k;
        int i12 = d12.f51977d.f52190b.f47255c;
        h12.u(i12, dVar, 0L);
        androidx.media3.common.z zVar = dVar.f47409d;
        if (h12.z(i12) == -1) {
            z.i iVar = zVar.f47983g;
            Uri uri = iVar.f48082b;
            z.i iVar2 = zVar.f47983g;
            if (uri != null) {
                if (this.f52158m.f52163a.f51994u) {
                    MediaControllerCompat.TransportControls transportControls = this.f52152g.getTransportControls();
                    Uri uri2 = iVar2.f48082b;
                    Bundle bundle = iVar2.f48084d;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    transportControls.playFromUri(uri2, bundle);
                } else {
                    MediaControllerCompat.TransportControls transportControls2 = this.f52152g.getTransportControls();
                    Uri uri3 = iVar2.f48082b;
                    Bundle bundle2 = iVar2.f48084d;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    transportControls2.prepareFromUri(uri3, bundle2);
                }
            } else if (iVar.f48083c == null) {
                boolean z12 = this.f52158m.f52163a.f51994u;
                String str = zVar.f47978b;
                if (z12) {
                    MediaControllerCompat.TransportControls transportControls3 = this.f52152g.getTransportControls();
                    Bundle bundle3 = iVar2.f48084d;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    transportControls3.playFromMediaId(str, bundle3);
                } else {
                    MediaControllerCompat.TransportControls transportControls4 = this.f52152g.getTransportControls();
                    Bundle bundle4 = iVar2.f48084d;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    transportControls4.prepareFromMediaId(str, bundle4);
                }
            } else if (this.f52158m.f52163a.f51994u) {
                MediaControllerCompat.TransportControls transportControls5 = this.f52152g.getTransportControls();
                String str2 = iVar2.f48083c;
                Bundle bundle5 = iVar2.f48084d;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                transportControls5.playFromSearch(str2, bundle5);
            } else {
                MediaControllerCompat.TransportControls transportControls6 = this.f52152g.getTransportControls();
                String str3 = iVar2.f48083c;
                Bundle bundle6 = iVar2.f48084d;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                transportControls6.prepareFromSearch(str3, bundle6);
            }
        } else if (this.f52158m.f52163a.f51994u) {
            this.f52152g.getTransportControls().play();
        } else {
            this.f52152g.getTransportControls().prepare();
        }
        if (this.f52158m.f52163a.f51977d.f52190b.f47259g != 0) {
            this.f52152g.getTransportControls().seekTo(this.f52158m.f52163a.f51977d.f52190b.f47259g);
        }
        if (this.f52158m.f52165c.a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < h12.w(); i13++) {
                if (i13 != i12 && h12.z(i13) == -1) {
                    h12.u(i13, dVar, 0L);
                    arrayList.add(dVar.f47409d);
                }
            }
            G(0, arrayList);
        }
    }

    @Override // androidx.media3.session.J.d
    public final void connect() {
        P1 p12 = this.f52148c;
        if (p12.f52238b.getType() != 0) {
            Z().a0(new RunnableC23250p0(this, 0));
            return;
        }
        Object objH = p12.f52238b.h();
        C23110a.h(objH);
        Z().a0(new RunnableC23253q0(0, this, (MediaSessionCompat.Token) objH));
        Z().f52080e.post(new RunnableC23250p0(this, 1));
    }

    @Override // androidx.media3.session.J.d
    public final void d(androidx.media3.common.G g12) {
        if (!g12.equals(getPlaybackParameters())) {
            D1 d1J = this.f52158m.f52163a.j(g12);
            c cVar = this.f52158m;
            h0(new c(d1J, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.getTransportControls().setPlaybackSpeed(g12.f47236b);
    }

    public final boolean d0() {
        return this.f52158m.f52163a.f51999z != 1;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.X e() {
        androidx.media3.common.util.s.g();
        return androidx.media3.common.X.f47549f;
    }

    public final void e0() {
        if (this.f52154i || this.f52155j) {
            return;
        }
        this.f52155j = true;
        a0(true, new d(this.f52152g.getPlaybackInfo(), X(this.f52152g.getPlaybackState()), this.f52152g.getMetadata(), J(this.f52152g.getQueue()), this.f52152g.getQueueTitle(), this.f52152g.getRepeatMode(), this.f52152g.getShuffleMode()));
    }

    @Override // androidx.media3.session.J.d
    public final void f(androidx.media3.common.z zVar) {
        V(zVar, -9223372036854775807L);
    }

    public final void f0(int i12, long j12) {
        Integer num;
        Integer num2;
        long j13;
        long j14;
        long j15;
        int i13;
        int i14 = i12;
        long j16 = j12;
        C23110a.b(i14 >= 0);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        androidx.media3.common.P p12 = this.f52158m.f52163a.f51984k;
        if ((p12.x() || i14 < p12.w()) && !isPlayingAd()) {
            if (i14 != currentMediaItemIndex) {
                long jZ2 = ((H1) this.f52158m.f52163a.f51984k).z(i14);
                if (jZ2 != -1) {
                    this.f52152g.getTransportControls().skipToQueueItem(jZ2);
                    num = 2;
                } else {
                    androidx.media3.common.util.s.g();
                    i14 = currentMediaItemIndex;
                    num = null;
                }
            } else {
                i14 = currentMediaItemIndex;
                num = null;
            }
            long currentPosition = getCurrentPosition();
            if (j16 == -9223372036854775807L) {
                j16 = currentPosition;
                num2 = null;
            } else {
                this.f52152g.getTransportControls().seekTo(j16);
                num2 = 1;
            }
            if (num == null) {
                long jU2 = U();
                long duration = getDuration();
                long jMax = j16 < currentPosition ? j16 : Math.max(j16, jU2);
                j14 = jMax;
                i13 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j13 = jMax - j16;
                j15 = duration;
            } else {
                j13 = 0;
                j14 = 0;
                j15 = -9223372036854775807L;
                i13 = 0;
            }
            D1 d1M = this.f52158m.f52163a.m(new N1(Y(i14, !p12.x() ? p12.u(i14, new P.d(), 0L).f47409d : null, j16, false), false, SystemClock.elapsedRealtime(), j15, j14, i13, j13, -9223372036854775807L, j15, j14));
            if (d1M.f51999z != 1) {
                d1M = d1M.l(2, null);
            }
            c cVar = this.f52158m;
            h0(new c(d1M, cVar.f52164b, cVar.f52165c, cVar.f52166d), num2, num);
        }
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.U g() {
        return androidx.media3.common.U.f47456B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(boolean r17, androidx.media3.session.MediaControllerImplLegacy.d r18, final androidx.media3.session.MediaControllerImplLegacy.c r19, @j.P java.lang.Integer r20, @j.P java.lang.Integer r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.MediaControllerImplLegacy.g0(boolean, androidx.media3.session.MediaControllerImplLegacy$d, androidx.media3.session.MediaControllerImplLegacy$c, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // androidx.media3.session.J.d
    public final long getContentPosition() {
        return getCurrentPosition();
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentMediaItemIndex() {
        return this.f52158m.f52163a.f51977d.f52190b.f47255c;
    }

    @Override // androidx.media3.session.J.d
    public final int getCurrentPeriodIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.session.J.d
    public final long getCurrentPosition() {
        return this.f52158m.f52163a.f51977d.f52190b.f47259g;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.P getCurrentTimeline() {
        return this.f52158m.f52163a.f51984k;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.V getCurrentTracks() {
        return androidx.media3.common.V.f47535c;
    }

    @Override // androidx.media3.session.J.d
    public final C23104o getDeviceInfo() {
        return this.f52158m.f52163a.f51991r;
    }

    @Override // androidx.media3.session.J.d
    public final long getDuration() {
        return this.f52158m.f52163a.f51977d.f52193e;
    }

    @Override // androidx.media3.session.J.d
    public final boolean getPlayWhenReady() {
        return this.f52158m.f52163a.f51994u;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.G getPlaybackParameters() {
        return this.f52158m.f52163a.f51981h;
    }

    @Override // androidx.media3.session.J.d
    public final int getPlaybackState() {
        return this.f52158m.f52163a.f51999z;
    }

    @Override // androidx.media3.session.J.d
    public final int getPlaybackSuppressionReason() {
        return 0;
    }

    @Override // androidx.media3.session.J.d
    public final int getRepeatMode() {
        return this.f52158m.f52163a.f51982i;
    }

    @Override // androidx.media3.session.J.d
    public final long getTotalBufferedDuration() {
        return this.f52158m.f52163a.f51977d.f52196h;
    }

    @Override // androidx.media3.session.J.d
    public final float getVolume() {
        return 1.0f;
    }

    @Override // androidx.media3.session.J.d
    public final void h(boolean z12) {
        if (z12 != o()) {
            D1 d12 = this.f52158m.f52163a;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52013i = z12;
            D1 d1A = aVarB.a();
            c cVar = this.f52158m;
            h0(new c(d1A, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        MediaControllerCompat.TransportControls transportControls = this.f52152g.getTransportControls();
        AbstractServiceC23085i.a aVar = C1.f51933a;
        transportControls.setShuffleMode(z12 ? 1 : 0);
    }

    public final void h0(c cVar, @j.P Integer num, @j.P Integer num2) {
        g0(false, this.f52156k, cVar, num, num2);
    }

    @Override // androidx.media3.session.J.d
    public final long i() {
        return getDuration();
    }

    @Override // androidx.media3.session.J.d
    public final boolean isConnected() {
        return this.f52155j;
    }

    @Override // androidx.media3.session.J.d
    public final boolean isLoading() {
        return false;
    }

    @Override // androidx.media3.session.J.d
    public final boolean isPlayingAd() {
        return this.f52158m.f52163a.f51977d.f52191c;
    }

    @Override // androidx.media3.session.J.d
    public final long j() {
        return this.f52158m.f52163a.f51971C;
    }

    @Override // androidx.media3.session.J.d
    public final boolean k() {
        return this.f52158m.f52163a.f51996w;
    }

    @Override // androidx.media3.session.J.d
    public final long l() {
        return U();
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.text.b m() {
        androidx.media3.common.util.s.g();
        return androidx.media3.common.text.b.f47856d;
    }

    @Override // androidx.media3.session.J.d
    public final H.c n() {
        return this.f52158m.f52165c;
    }

    @Override // androidx.media3.session.J.d
    public final boolean o() {
        return this.f52158m.f52163a.f51983j;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.B p() {
        androidx.media3.common.z zVarP = this.f52158m.f52163a.p();
        return zVarP == null ? androidx.media3.common.B.f47110J : zVarP.f47981e;
    }

    @Override // androidx.media3.session.J.d
    public final void pause() {
        D1 d12 = this.f52158m.f52163a;
        if (d12.f51994u) {
            D1 d1G = d12.g(1, 0, false);
            c cVar = this.f52158m;
            h0(new c(d1G, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
            if (d0() && b0()) {
                this.f52152g.getTransportControls().pause();
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public final void play() {
        D1 d12 = this.f52158m.f52163a;
        if (d12.f51994u) {
            return;
        }
        D1 d1G = d12.g(1, 0, true);
        c cVar = this.f52158m;
        h0(new c(d1G, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (d0() && b0()) {
            this.f52152g.getTransportControls().play();
        }
    }

    @Override // androidx.media3.session.J.d
    public final void prepare() {
        D1 d12 = this.f52158m.f52163a;
        if (d12.f51999z != 1) {
            return;
        }
        D1 d1L = d12.l(d12.f51984k.x() ? 4 : 2, null);
        c cVar = this.f52158m;
        h0(new c(d1L, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (b0()) {
            c0();
        }
    }

    @Override // androidx.media3.session.J.d
    public final long q() {
        return this.f52158m.f52163a.f51970B;
    }

    @Override // androidx.media3.session.J.d
    public final void r(int i12, boolean z12) {
        if (androidx.media3.common.util.M.f47887a < 23) {
            androidx.media3.common.util.s.g();
            return;
        }
        if (z12 != A()) {
            D1 d1B = this.f52158m.f52163a.b(w(), z12);
            c cVar = this.f52158m;
            h0(new c(d1B, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.adjustVolume(z12 ? -100 : 100, i12);
    }

    @Override // androidx.media3.session.J.d
    public void release() {
        if (this.f52154i) {
            return;
        }
        this.f52154i = true;
        MediaBrowserCompat mediaBrowserCompat = this.f52153h;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.disconnect();
            this.f52153h = null;
        }
        MediaControllerCompat mediaControllerCompat = this.f52152g;
        if (mediaControllerCompat != null) {
            b bVar = this.f52150e;
            mediaControllerCompat.unregisterCallback(bVar);
            bVar.f52161a.removeCallbacksAndMessages(null);
            this.f52152g = null;
        }
        this.f52155j = false;
        this.f52149d.d();
    }

    @Override // androidx.media3.session.J.d
    public final void s(int i12) {
        int iW2 = w();
        int i13 = getDeviceInfo().f47694d;
        if (i13 == 0 || iW2 + 1 <= i13) {
            D1 d1B = this.f52158m.f52163a.b(iW2 + 1, A());
            c cVar = this.f52158m;
            h0(new c(d1B, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.adjustVolume(1, i12);
    }

    @Override // androidx.media3.session.J.d
    public final void seekTo(long j12) {
        f0(getCurrentMediaItemIndex(), j12);
    }

    @Override // androidx.media3.session.J.d
    public final void setPlayWhenReady(boolean z12) {
        if (z12) {
            play();
        } else {
            pause();
        }
    }

    @Override // androidx.media3.session.J.d
    public final void setPlaybackSpeed(float f12) {
        if (f12 != getPlaybackParameters().f47236b) {
            D1 d1J = this.f52158m.f52163a.j(new androidx.media3.common.G(f12));
            c cVar = this.f52158m;
            h0(new c(d1J, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.getTransportControls().setPlaybackSpeed(f12);
    }

    @Override // androidx.media3.session.J.d
    public final void setRepeatMode(int i12) {
        if (i12 != getRepeatMode()) {
            D1 d12 = this.f52158m.f52163a;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52012h = i12;
            D1 d1A = aVarB.a();
            c cVar = this.f52158m;
            h0(new c(d1A, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        }
        this.f52152g.getTransportControls().setRepeatMode(C1.r(i12));
    }

    @Override // androidx.media3.session.J.d
    public final void setVolume(float f12) {
        androidx.media3.common.util.s.g();
    }

    @Override // androidx.media3.session.J.d
    public final void stop() {
        D1 d12 = this.f52158m.f52163a;
        if (d12.f51999z == 1) {
            return;
        }
        N1 n12 = d12.f51977d;
        H.k kVar = n12.f52190b;
        long j12 = kVar.f47259g;
        long j13 = n12.f52193e;
        D1 d1M = d12.m(new N1(kVar, false, SystemClock.elapsedRealtime(), j13, j12, C1.b(j12, j13), 0L, -9223372036854775807L, j13, j12));
        D1 d13 = this.f52158m.f52163a;
        if (d13.f51999z != 1) {
            d1M = d1M.l(1, d13.f51975b);
        }
        c cVar = this.f52158m;
        h0(new c(d1M, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        this.f52152g.getTransportControls().stop();
    }

    @Override // androidx.media3.session.J.d
    public final void t(int i12, int i13) {
        C23110a.b(i12 >= 0 && i13 >= i12);
        int iW2 = getCurrentTimeline().w();
        int iMin = Math.min(i13, iW2);
        if (i12 >= iW2 || i12 == iMin) {
            return;
        }
        H1 h12 = (H1) this.f52158m.f52163a.f51984k;
        h12.getClass();
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        AbstractC37401r1<H1.a> abstractC37401r1 = h12.f52063g;
        aVar.e(abstractC37401r1.subList(0, i12));
        aVar.e(abstractC37401r1.subList(iMin, abstractC37401r1.size()));
        H1 h13 = new H1(aVar.i(), h12.f52064h);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int i14 = iMin - i12;
        if (currentMediaItemIndex >= i12) {
            currentMediaItemIndex = currentMediaItemIndex < iMin ? -1 : currentMediaItemIndex - i14;
        }
        if (currentMediaItemIndex == -1) {
            currentMediaItemIndex = androidx.media3.common.util.M.k(i12, 0, h13.w() - 1);
            androidx.media3.common.util.s.g();
        }
        D1 d1N = this.f52158m.f52163a.n(h13, currentMediaItemIndex);
        c cVar = this.f52158m;
        h0(new c(d1N, cVar.f52164b, cVar.f52165c, cVar.f52166d), null, null);
        if (d0()) {
            while (i12 < iMin && i12 < this.f52156k.f52170d.size()) {
                this.f52152g.removeQueueItem(this.f52156k.f52170d.get(i12).getDescription());
                i12++;
            }
        }
    }

    @Override // androidx.media3.session.J.d
    public L1 u() {
        return this.f52158m.f52164b;
    }

    @Override // androidx.media3.session.J.d
    @Deprecated
    public final void v() {
        s(1);
    }

    @Override // androidx.media3.session.J.d
    public final int w() {
        return this.f52158m.f52163a.f51992s;
    }

    @Override // androidx.media3.session.J.d
    public final long x() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.session.J.d
    public final androidx.media3.common.B y() {
        return this.f52158m.f52163a.f51987n;
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final MediaControllerCompat.PlaybackInfo f52167a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final PlaybackStateCompat f52168b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final MediaMetadataCompat f52169c;

        /* renamed from: d, reason: collision with root package name */
        public final List<MediaSessionCompat.QueueItem> f52170d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final CharSequence f52171e;

        /* renamed from: f, reason: collision with root package name */
        public final int f52172f;

        /* renamed from: g, reason: collision with root package name */
        public final int f52173g;

        public d() {
            this.f52167a = null;
            this.f52168b = null;
            this.f52169c = null;
            this.f52170d = Collections.emptyList();
            this.f52171e = null;
            this.f52172f = 0;
            this.f52173g = 0;
        }

        public d(@j.P MediaControllerCompat.PlaybackInfo playbackInfo, @j.P PlaybackStateCompat playbackStateCompat, @j.P MediaMetadataCompat mediaMetadataCompat, List<MediaSessionCompat.QueueItem> list, @j.P CharSequence charSequence, int i12, int i13) {
            this.f52167a = playbackInfo;
            this.f52168b = playbackStateCompat;
            this.f52169c = mediaMetadataCompat;
            list.getClass();
            this.f52170d = list;
            this.f52171e = charSequence;
            this.f52172f = i12;
            this.f52173g = i13;
        }

        public d(d dVar) {
            this.f52167a = dVar.f52167a;
            this.f52168b = dVar.f52168b;
            this.f52169c = dVar.f52169c;
            this.f52170d = dVar.f52170d;
            this.f52171e = dVar.f52171e;
            this.f52172f = dVar.f52172f;
            this.f52173g = dVar.f52173g;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final D1 f52163a;

        /* renamed from: b, reason: collision with root package name */
        public final L1 f52164b;

        /* renamed from: c, reason: collision with root package name */
        public final H.c f52165c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC37401r1<C23213d> f52166d;

        public c() {
            D1 d12 = D1.f51936G;
            H1 h12 = H1.f52061i;
            D1.a aVarB = M1.b(d12, d12);
            aVarB.f52014j = h12;
            this.f52163a = aVarB.a();
            this.f52164b = L1.f52123c;
            this.f52165c = H.c.f47239c;
            this.f52166d = AbstractC37401r1.C();
        }

        public c(D1 d12, L1 l12, H.c cVar, AbstractC37401r1<C23213d> abstractC37401r1) {
            this.f52163a = d12;
            this.f52164b = l12;
            this.f52165c = cVar;
            this.f52166d = abstractC37401r1;
        }
    }

    @Override // androidx.media3.session.J.d
    public final void z(androidx.media3.common.U u12) {
    }
}
