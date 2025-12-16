package one.me.android.media.service;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import defpackage.a8i;
import defpackage.arf;
import defpackage.b79;
import defpackage.b89;
import defpackage.b99;
import defpackage.bj;
import defpackage.c29;
import defpackage.co4;
import defpackage.d7j;
import defpackage.ei5;
import defpackage.em5;
import defpackage.eo4;
import defpackage.f29;
import defpackage.g79;
import defpackage.gq5;
import defpackage.h79;
import defpackage.hl5;
import defpackage.hsi;
import defpackage.i3;
import defpackage.i89;
import defpackage.j89;
import defpackage.k79;
import defpackage.k89;
import defpackage.kx8;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.lzf;
import defpackage.o79;
import defpackage.ox8;
import defpackage.px8;
import defpackage.pz1;
import defpackage.q2b;
import defpackage.rs0;
import defpackage.svi;
import defpackage.t76;
import defpackage.u02;
import defpackage.u69;
import defpackage.ue4;
import defpackage.us;
import defpackage.usd;
import defpackage.v9j;
import defpackage.w69;
import defpackage.w6b;
import defpackage.wg7;
import defpackage.wqi;
import defpackage.ya7;
import defpackage.z19;
import defpackage.zjd;
import defpackage.zk6;
import defpackage.zxg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneMeMediaSessionService extends Service {
    public static final /* synthetic */ int s0 = 0;
    public w69 Y;
    public ContextScope Z;
    public j89 c;
    public f29 d;
    public bj o;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final us X = new us(0);

    public final void a(w69 w69Var) {
        w69 w69Var2;
        boolean z = true;
        hsi.a("session is already released", !w69Var.a.j());
        synchronized (this.a) {
            w69Var2 = (w69) this.X.get(w69Var.a.i);
            if (w69Var2 != null && w69Var2 != w69Var) {
                z = false;
            }
            hsi.a("Session ID should be unique", z);
            this.X.put(w69Var.a.i, w69Var);
        }
        if (w69Var2 == null) {
            zxg.a0(this.b, new i89(this, w69Var, 0));
        }
    }

    public final f29 b() {
        if (this.d == null) {
            hsi.i(getBaseContext(), "Accessing service context before onCreate()");
            rs0 rs0Var = new rs0(getApplicationContext());
            hsi.g(!rs0Var.c);
            co4 co4Var = new co4(rs0Var);
            rs0Var.c = true;
            if (this.o == null) {
                this.o = new bj(6, this);
            }
            this.d = new f29(this, co4Var, this.o);
        }
        return this.d;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.X.values());
        }
        return arrayList;
    }

    public final boolean d(w69 w69Var) {
        boolean zContainsKey;
        synchronized (this.a) {
            zContainsKey = this.X.containsKey(w69Var.a.i);
        }
        return zContainsKey;
    }

    public final void e() {
        super.onCreate();
        this.c = new j89(this);
    }

    public final void f() {
        super.onDestroy();
        j89 j89Var = this.c;
        if (j89Var != null) {
            j89Var.c.clear();
            j89Var.d.removeCallbacksAndMessages(null);
            Set set = j89Var.e;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                v9j.b((ya7) it.next());
            }
            set.clear();
            this.c = null;
        }
    }

    public final w69 g(u69 u69Var) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeMediaSessionService", "onGetSession, controllerInfo=" + u69Var + ", mediaSession=" + this.Y, null);
            }
        }
        return this.Y;
    }

    public final int h(Intent intent, int i, int i2) {
        w69 w69VarG;
        w69 w69Var;
        if (intent != null) {
            if (this.o == null) {
                this.o = new bj(6, this);
            }
            bj bjVar = this.o;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (w69.b) {
                    try {
                        Iterator it = w69.c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                w69Var = null;
                                break;
                            }
                            w69Var = (w69) it.next();
                            if (Objects.equals(w69Var.a.b, data)) {
                            }
                        }
                    } finally {
                    }
                }
                w69VarG = w69Var;
            } else {
                w69VarG = null;
            }
            bjVar.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (w69VarG == null) {
                    w69VarG = g(new u69(new b89("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY));
                    if (w69VarG != null) {
                        a(w69VarG);
                    }
                }
                o79 o79Var = w69VarG.a;
                o79Var.l.post(new k79(o79Var, 4, intent));
                return 1;
            }
            if (w69VarG != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    f29 f29VarB = b();
                    px8 px8VarA = f29VarB.a(w69VarG);
                    if (px8VarA != null) {
                        zxg.a0(new Handler(((em5) w69VarG.a()).E0), new u02(f29VarB, w69VarG, str, bundle, px8VarA, 8));
                    }
                }
            }
        }
        return 1;
    }

    public final void i(Intent intent) {
        if (b().u0) {
            ArrayList arrayListC = c();
            for (int i = 0; i < arrayListC.size(); i++) {
                if (((i3) ((w69) arrayListC.get(i)).a()).z0()) {
                    return;
                }
            }
        }
        f29 f29VarB = b();
        OneMeMediaSessionService oneMeMediaSessionService = f29VarB.a;
        f29VarB.w0 = false;
        Handler handler = f29VarB.d;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            ArrayList arrayListC2 = oneMeMediaSessionService.c();
            for (int i2 = 0; i2 < arrayListC2.size(); i2++) {
                oneMeMediaSessionService.k((w69) arrayListC2.get(i2), false);
            }
        }
        ArrayList arrayListC3 = c();
        for (int i3 = 0; i3 < arrayListC3.size(); i3++) {
            ((em5) ((w69) arrayListC3.get(i3)).a()).o1(false);
        }
        stopSelf();
    }

    public final void j(w69 w69Var, boolean z) {
        wg7 wg7VarF;
        f29 f29VarB = b();
        if (!f29VarB.a.d(w69Var) || !f29VarB.c(w69Var)) {
            f29VarB.a.stopForeground(1);
            f29VarB.u0 = false;
            if (f29VarB.t0 != null) {
                f29VarB.c.b.cancel(null, 1001);
                f29VarB.s0++;
                f29VarB.t0 = null;
                return;
            }
            return;
        }
        int i = f29VarB.s0 + 1;
        f29VarB.s0 = i;
        px8 px8VarA = f29VarB.a(w69Var);
        px8VarA.getClass();
        px8VarA.D();
        ox8 ox8Var = px8VarA.c;
        if (ox8Var.isConnected()) {
            wg7VarF = ox8Var.F();
        } else {
            t76 t76Var = wg7.b;
            wg7VarF = zjd.o;
        }
        zxg.a0(new Handler(((em5) w69Var.a()).E0), new c29(0, f29VarB, w69Var, wg7VarF, new pz1(f29VarB, i, w69Var), z));
    }

    public final boolean k(w69 w69Var, boolean z) {
        try {
            j(w69Var, b().b(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !z19.B(e)) {
                throw e;
            }
            a8i.h("MSessionService", "Failed to start foreground", e);
            this.b.post(new gq5(19, this));
            return false;
        }
    }

    public final void l(w69 w69Var) {
        synchronized (this.a) {
            hsi.a("session not found", this.X.containsKey(w69Var.a.i));
            this.X.remove(w69Var.a.i);
        }
        zxg.a0(this.b, new i89(this, w69Var, 1));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        w69 w69VarG;
        k89 k89Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            j89 j89Var = this.c;
            hsi.h(j89Var);
            return j89Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (w69VarG = g(new u69(new b89("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        a(w69VarG);
        o79 o79Var = w69VarG.a;
        synchronized (o79Var.a) {
            try {
                if (o79Var.x == null) {
                    g79 g79Var = ((b79) o79Var.h.k.b).c;
                    k89 k89Var2 = new k89(o79Var);
                    k89Var2.a(g79Var);
                    o79Var.x = k89Var2;
                }
                k89Var = o79Var.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k89Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    public final void onCreate() {
        w69 w69Var;
        lg8 lg8Var = lg8.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "OneMeMediaSessionService", "onCreate", null);
        }
        e();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "OneMeMediaSessionService", "createMediaSession", null);
        }
        hl5 hl5Var = new hl5(this);
        b99 b99Var = (b99) kx8.a.getAccessor().c(50);
        hsi.g(!hl5Var.x);
        b99Var.getClass();
        hl5Var.d = new eo4(2, b99Var);
        em5 em5VarA = hl5Var.a();
        em5VarA.L0(new ei5());
        try {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            t76 t76Var = wg7.b;
            zjd zjdVar = zjd.o;
            w69Var = new w69(this, em5VarA, zjdVar, zjdVar, zjdVar, new usd(28, this), bundle, bundle2, new h79(6, new ue4(this)));
        } catch (RuntimeException e) {
            wqi.e("OneMeMediaSessionService", "Failed to create media session", e);
            em5VarA.h1();
            w69Var = null;
        }
        this.Y = w69Var;
        if (w69Var != null) {
            arf arfVarA = zk6.a();
            kx8 kx8Var = kx8.a;
            ContextScope contextScopeA = d7j.a(arfVarA.plus(((q2b) ((lzf) kx8Var.getAccessor().c(8))).c().getImmediate()));
            this.Z = contextScopeA;
            svi.e(contextScopeA, ((q2b) ((lzf) kx8Var.getAccessor().c(8))).b(), null, new w6b(2, null), 2);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeMediaSessionService", "onDestroy", null);
            }
        }
        ContextScope contextScope = this.Z;
        if (contextScope != null) {
            d7j.c(contextScope, null);
        }
        this.Z = null;
        w69 w69Var = this.Y;
        if (w69Var != null) {
            ((em5) w69Var.a()).h1();
            try {
                synchronized (w69.b) {
                    w69.c.remove(w69Var.a.i);
                }
                w69Var.a.s();
            } catch (Exception unused) {
            }
            this.Y = null;
        }
        f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, null);
            }
        }
        h(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "OneMeMediaSessionService", "onTaskRemoved", null);
            }
        }
        i(intent);
    }
}
