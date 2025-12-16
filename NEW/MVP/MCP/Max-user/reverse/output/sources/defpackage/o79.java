package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeMediaSessionService;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public class o79 {
    public static final yie E = new yie(1);
    public boolean A;
    public final wg7 B;
    public final wg7 C;
    public final Bundle D;
    public final Object a = new Object();
    public final Uri b;
    public final l79 c;
    public final jv8 d;
    public final usd e;
    public final OneMeMediaSessionService f;
    public final z89 g;
    public final z79 h;
    public final String i;
    public final tje j;
    public final w69 k;
    public final Handler l;
    public final h79 m;
    public final i79 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final wg7 r;
    public q4c s;
    public a5c t;
    public PendingIntent u;
    public m79 v;
    public r5j w;
    public k89 x;
    public boolean y;
    public final long z;

    public o79(w69 w69Var, OneMeMediaSessionService oneMeMediaSessionService, em5 em5Var, wg7 wg7Var, wg7 wg7Var2, wg7 wg7Var3, usd usdVar, Bundle bundle, Bundle bundle2, h79 h79Var) {
        a8i.j("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "]");
        this.k = w69Var;
        this.f = oneMeMediaSessionService;
        this.i = "";
        this.u = null;
        this.B = wg7Var;
        this.C = wg7Var2;
        this.r = wg7Var3;
        this.e = usdVar;
        this.D = bundle2;
        this.m = h79Var;
        this.p = true;
        this.q = true;
        z89 z89Var = new z89(this);
        this.g = z89Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper looper = em5Var.E0;
        Handler handler = new Handler(looper);
        this.l = handler;
        this.s = q4c.F;
        this.c = new l79(this, looper);
        this.d = new jv8(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(o79.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = uriBuild;
        z79 z79Var = new z79(this, uriBuild, handler, bundle, wg7Var, wg7Var2, s69.e, s69.f, bundle2);
        this.h = z79Var;
        this.j = new tje(Process.myUid(), 1008000300, 5, oneMeMediaSessionService.getPackageName(), z89Var, bundle, ((b79) z79Var.k.b).c.b);
        a5c a5cVar = new a5c(em5Var);
        this.t = a5cVar;
        zxg.a0(handler, new k79(this, 1, a5cVar));
        this.z = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.n = new i79(this, 2);
        zxg.a0(handler, new i79(this, 3));
    }

    public static void a(o79 o79Var) {
        synchronized (o79Var.a) {
            try {
                if (o79Var.y) {
                    return;
                }
                final wie wieVarM = o79Var.t.m();
                if (!o79Var.c.hasMessages(1) && rei.a(wieVarM, o79Var.s.c)) {
                    fde fdeVar = o79Var.g.d;
                    wg7 wg7VarP = fdeVar.p();
                    for (int i = 0; i < wg7VarP.size(); i++) {
                        final u69 u69Var = (u69) wg7VarP.get(i);
                        fdeVar.s(u69Var);
                        final boolean z = fdeVar.z(u69Var, 16);
                        final boolean z2 = fdeVar.z(u69Var, 17);
                        o79Var.c(u69Var, new n79() { // from class: j79
                            @Override // defpackage.n79
                            public final void a(t69 t69Var, int i2) {
                                t69Var.i(i2, wieVarM, z, z2, u69Var.c);
                            }
                        });
                    }
                    try {
                        o79Var.h.i.i(0, wieVarM, true, true, 0);
                    } catch (RemoteException e) {
                        a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
                o79Var.u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(u69 u69Var) {
        return u69Var != null && Objects.equals(u69Var.a.a.a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.KeyEvent r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            w69 r0 = r7.k
            o79 r0 = r0.a
            u69 r4 = r0.e()
            r4.getClass()
            int r8 = r8.getKeyCode()
            r0 = 85
            if (r8 == r0) goto L17
            r0 = 79
            if (r8 != r0) goto L1b
        L17:
            if (r9 == 0) goto L1b
            r8 = 87
        L1b:
            r9 = 126(0x7e, float:1.77E-43)
            if (r8 == r9) goto L73
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 == r9) goto L6c
            r9 = 272(0x110, float:3.81E-43)
            if (r8 == r9) goto L64
            r9 = 273(0x111, float:3.83E-43)
            if (r8 == r9) goto L5c
            switch(r8) {
                case 85: goto L46;
                case 86: goto L3f;
                case 87: goto L64;
                case 88: goto L5c;
                case 89: goto L38;
                case 90: goto L30;
                default: goto L2e;
            }
        L2e:
            r8 = 0
            return r8
        L30:
            ar3 r8 = new ar3
            r9 = 1
            r8.<init>(r7, r4, r9)
        L36:
            r5 = r8
            goto L7a
        L38:
            ar3 r8 = new ar3
            r9 = 2
            r8.<init>(r7, r4, r9)
            goto L36
        L3f:
            ar3 r8 = new ar3
            r9 = 3
            r8.<init>(r7, r4, r9)
            goto L36
        L46:
            a5c r8 = r7.t
            boolean r8 = r8.i()
            if (r8 == 0) goto L55
            ar3 r8 = new ar3
            r9 = 4
            r8.<init>(r7, r4, r9)
            goto L36
        L55:
            ar3 r8 = new ar3
            r9 = 5
            r8.<init>(r7, r4, r9)
            goto L36
        L5c:
            ar3 r8 = new ar3
            r9 = 9
            r8.<init>(r7, r4, r9)
            goto L36
        L64:
            ar3 r8 = new ar3
            r9 = 8
            r8.<init>(r7, r4, r9)
            goto L36
        L6c:
            ar3 r8 = new ar3
            r9 = 7
            r8.<init>(r7, r4, r9)
            goto L36
        L73:
            ar3 r8 = new ar3
            r9 = 6
            r8.<init>(r7, r4, r9)
            goto L36
        L7a:
            ul5 r1 = new ul5
            r6 = 3
            r2 = r7
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            android.os.Handler r8 = r2.l
            defpackage.zxg.a0(r8, r1)
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o79.b(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final void c(u69 u69Var, n79 n79Var) {
        int iV;
        z89 z89Var = this.g;
        try {
            dy dyVarV = z89Var.d.v(u69Var);
            if (dyVarV != null) {
                iV = dyVarV.v();
            } else if (!h(u69Var)) {
                return;
            } else {
                iV = 0;
            }
            t69 t69Var = u69Var.d;
            if (t69Var != null) {
                n79Var.a(t69Var, iV);
            }
        } catch (DeadObjectException unused) {
            z89Var.d.H(u69Var);
        } catch (RemoteException e) {
            a8i.m("MediaSessionImpl", "Exception in " + u69Var, e);
        }
    }

    public final void d(n79 n79Var) {
        wg7 wg7VarP = this.g.d.p();
        for (int i = 0; i < wg7VarP.size(); i++) {
            c((u69) wg7VarP.get(i), n79Var);
        }
        try {
            n79Var.a(this.h.i, 0);
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final u69 e() {
        wg7 wg7VarP = this.g.d.p();
        for (int i = 0; i < wg7VarP.size(); i++) {
            u69 u69Var = (u69) wg7VarP.get(i);
            if (i(u69Var)) {
                return u69Var;
            }
        }
        return null;
    }

    public final void f(o3c o3cVar) {
        this.c.a(false, false);
        d(new sy8(o3cVar));
        try {
            x79 x79Var = this.h.i;
            mv4 mv4Var = this.s.q;
            x79Var.k();
        } catch (RemoteException e) {
            a8i.h("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(u69 u69Var, boolean z) {
        if (p()) {
            int i = 0;
            boolean z2 = this.t.S(16) && this.t.E() != null;
            boolean z3 = this.t.S(31) || this.t.S(20);
            u69 u69VarT = t(u69Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            hsi.g(!false);
            sparseBooleanArray.append(1, true);
            hsi.g(!false);
            o3c o3cVar = new o3c(new a26(sparseBooleanArray));
            if (z2 || !z3) {
                if (!z2) {
                    a8i.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                zxg.J(this.t);
                if (z) {
                    q(u69VarT);
                    return;
                }
                return;
            }
            usd usdVar = this.e;
            usdVar.getClass();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "OneMeMediaSessionService", "onPlaybackResumption", null);
                }
            }
            if (Build.VERSION.SDK_INT <= 30) {
                OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) usdVar.b;
                int i2 = OneMeMediaSessionService.s0;
                nla nlaVar = new nla(oneMeMediaSessionService, "default_channel_id");
                nlaVar.e = nla.c("Media Service");
                nlaVar.f = nla.c("Shutting down media service...");
                nlaVar.F.icon = ivd.f1;
                ((OneMeMediaSessionService) usdVar.b).startForeground(134, nlaVar.a());
                ((OneMeMediaSessionService) usdVar.b).stopForeground(1);
                ((OneMeMediaSessionService) usdVar.b).stopSelf();
            }
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            yf7 yf7Var = new yf7();
            yf7Var.l(unsupportedOperationException);
            yf7Var.d(new yn6(yf7Var, i, new vd(this, u69VarT, z, o3cVar)), new fv1(4, this));
        }
    }

    public final boolean h(u69 u69Var) {
        return this.g.d.y(u69Var) || this.h.f.y(u69Var);
    }

    public final boolean i(u69 u69Var) {
        return Objects.equals(u69Var.a.a.a, this.f.getPackageName()) && u69Var.b != 0 && new Bundle(u69Var.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    public final ha8 l(u69 u69Var, List list) {
        return this.e.o(this.k, t(u69Var), list);
    }

    public final s69 m(u69 u69Var) {
        boolean z = this.A;
        z79 z79Var = this.h;
        if (z && k(u69Var)) {
            z79Var.getClass();
            bie bieVar = s69.e;
            bie bieVar2 = z79Var.v;
            bieVar2.getClass();
            o3c o3cVar = z79Var.w;
            o3cVar.getClass();
            wg7 wg7Var = z79Var.t;
            wg7 wg7VarJ = wg7Var == null ? null : wg7.j(wg7Var);
            wg7 wg7Var2 = z79Var.u;
            return new s69(bieVar2, o3cVar, wg7VarJ, wg7Var2 != null ? wg7.j(wg7Var2) : null);
        }
        this.e.getClass();
        o3c o3cVar2 = s69.f;
        bie bieVar3 = s69.e;
        s69 s69Var = new s69(bieVar3, o3cVar2, null, null);
        if (i(u69Var)) {
            this.A = true;
            w69 w69Var = this.k;
            wg7 wg7Var3 = w69Var.a.C;
            int i = 0;
            if (wg7Var3.isEmpty()) {
                z79Var.t = w69Var.a.B;
            } else {
                z79Var.u = wg7Var3;
                Bundle bundle = z79Var.s;
                boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z3 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                z79Var.L();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z2 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z3) {
                    ((b79) z79Var.k.b).a.setExtras(bundle);
                }
            }
            o79 o79Var = z79Var.g;
            Bundle bundle2 = z79Var.s;
            boolean z4 = z79Var.w.a(17) != o3cVar2.a(17);
            z79Var.v = bieVar3;
            z79Var.w = o3cVar2;
            if (!z79Var.u.isEmpty()) {
                boolean z5 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z6 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                z79Var.L();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z5 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z6) {
                    ((b79) z79Var.k.b).a.setExtras(bundle2);
                }
            }
            if (z4) {
                zxg.a0(o79Var.l, new r79(z79Var, o79Var.t, i));
                return s69Var;
            }
            z79Var.M(o79Var.t);
        }
        return s69Var;
    }

    public final bg7 n(u69 u69Var) {
        t(u69Var);
        this.e.getClass();
        return a6a.c(new yie(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.u69 r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o79.o(u69, android.content.Intent):boolean");
    }

    public final boolean p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hke hkeVar = new hke();
            this.o.post(new k79(this, 2, hkeVar));
            try {
                return ((Boolean) hkeVar.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        r5j r5jVar = this.w;
        if (r5jVar != null) {
            OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) r5jVar.b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 31 && i < 33 && !oneMeMediaSessionService.b().u0) {
                return oneMeMediaSessionService.k(this.k, true);
            }
        }
        return true;
    }

    public final void q(u69 u69Var) {
        t(u69Var);
        this.e.getClass();
    }

    public final hke r(u69 u69Var, List list, int i, long j) {
        return zxg.l0(this.e.o(this.k, t(u69Var), list), new ir5(i, j));
    }

    public final void s() throws NoSuchFieldException, SecurityException {
        a8i.j("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "] [" + e19.b() + "]");
        synchronized (this.a) {
            try {
                if (this.y) {
                    return;
                }
                this.y = true;
                jv8 jv8Var = this.d;
                se5 se5Var = (se5) jv8Var.b;
                if (se5Var != null) {
                    jv8Var.removeCallbacks(se5Var);
                    jv8Var.b = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    zxg.a0(this.l, new i79(this, 0));
                } catch (Exception e) {
                    a8i.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                z79 z79Var = this.h;
                ComponentName componentName = z79Var.m;
                o79 o79Var = z79Var.g;
                h79 h79Var = z79Var.k;
                int i = Build.VERSION.SDK_INT;
                if (i < 31) {
                    if (componentName == null) {
                        ((b79) h79Var.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", o79Var.b);
                        intent.setComponent(componentName);
                        ((b79) h79Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(o79Var.f, 0, intent, z79.x));
                    }
                }
                eo eoVar = z79Var.l;
                if (eoVar != null) {
                    o79Var.f.unregisterReceiver(eoVar);
                }
                b79 b79Var = (b79) h79Var.b;
                MediaSession mediaSession = b79Var.a;
                b79Var.f.kill();
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e2) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                    }
                }
                mediaSession.setCallback(null);
                b79Var.b.c.clear();
                mediaSession.release();
                z89 z89Var = this.g;
                Set set = z89Var.e;
                fde fdeVar = z89Var.d;
                for (u69 u69Var : fdeVar.p()) {
                    fdeVar.H(u69Var);
                    t69 t69Var = u69Var.d;
                    if (t69Var != null) {
                        t69Var.onDisconnected();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    t69 t69Var2 = ((u69) it.next()).d;
                    if (t69Var2 != null) {
                        t69Var2.onDisconnected();
                    }
                }
                set.clear();
                z89Var.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u69 t(u69 u69Var) {
        if (!this.A || !k(u69Var)) {
            return u69Var;
        }
        u69 u69VarE = e();
        u69VarE.getClass();
        return u69VarE;
    }

    public final void u() {
        Handler handler = this.l;
        i79 i79Var = this.n;
        handler.removeCallbacks(i79Var);
        if (this.q) {
            long j = this.z;
            if (j > 0) {
                if (this.t.R() || this.t.Q()) {
                    handler.postDelayed(i79Var, j);
                }
            }
        }
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
