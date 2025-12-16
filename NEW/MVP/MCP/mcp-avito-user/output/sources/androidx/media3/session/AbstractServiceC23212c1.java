package androidx.media3.session;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.collection.C20199a;
import androidx.media.C;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.C23240m;
import androidx.media3.session.InterfaceC23249p;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42153i;
import j.InterfaceC42164u;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MediaSessionService.java */
/* renamed from: androidx.media3.session.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC23212c1 extends Service {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f52402j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f52403b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f52404c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public final C20199a f52405d = new C20199a();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    @j.P
    public e f52406e;

    /* renamed from: f, reason: collision with root package name */
    @j.B
    public M0 f52407f;

    /* renamed from: g, reason: collision with root package name */
    @j.B
    public C23240m f52408g;

    /* renamed from: h, reason: collision with root package name */
    @j.B
    public C23237l f52409h;

    /* renamed from: i, reason: collision with root package name */
    @j.B
    @j.P
    public c f52410i;

    /* compiled from: MediaSessionService.java */
    @j.X
    /* renamed from: androidx.media3.session.c1$b */
    public static final class b {
        @InterfaceC42164u
        public static boolean a(IllegalStateException illegalStateException) {
            return F.c(illegalStateException);
        }
    }

    /* compiled from: MediaSessionService.java */
    /* renamed from: androidx.media3.session.c1$d */
    public final class d implements O0.h {
        public d(a aVar) {
        }
    }

    /* compiled from: MediaSessionService.java */
    /* renamed from: androidx.media3.session.c1$e */
    public static final class e extends InterfaceC23249p.b {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<AbstractServiceC23212c1> f52412b;

        /* renamed from: p, reason: collision with root package name */
        public final Handler f52413p;

        /* renamed from: q, reason: collision with root package name */
        public final androidx.media.C f52414q;

        /* renamed from: r, reason: collision with root package name */
        public final Set<InterfaceC23243n> f52415r;

        public e(AbstractServiceC23212c1 abstractServiceC23212c1) {
            this.f52412b = new WeakReference<>(abstractServiceC23212c1);
            Context applicationContext = abstractServiceC23212c1.getApplicationContext();
            this.f52413p = new Handler(applicationContext.getMainLooper());
            this.f52414q = androidx.media.C.a(applicationContext);
            this.f52415r = Collections.synchronizedSet(new HashSet());
        }

        @Override // androidx.media3.session.InterfaceC23249p
        public final void H3(@j.P final InterfaceC23243n interfaceC23243n, @j.P Bundle bundle) {
            if (interfaceC23243n == null || bundle == null) {
                return;
            }
            try {
                final C23231j c23231j = (C23231j) C23231j.f52532l.fromBundle(bundle);
                if (this.f52412b.get() == null) {
                    try {
                        interfaceC23243n.f();
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                final int callingUid = Binder.getCallingUid();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = c23231j.f52536e;
                }
                final int i12 = callingPid;
                final C.b bVar = new C.b(c23231j.f52535d, i12, callingUid);
                final boolean zB2 = this.f52414q.b(bVar);
                this.f52415r.add(interfaceC23243n);
                try {
                    this.f52413p.post(new Runnable() { // from class: androidx.media3.session.d1
                        /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[ORIG_RETURN, RETURN] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() throws java.lang.Throwable {
                            /*
                                r11 = this;
                                androidx.media.C$b r0 = r3
                                androidx.media3.session.j r1 = r4
                                boolean r2 = r5
                                int r7 = r6
                                int r8 = r7
                                androidx.media3.session.c1$e r3 = r11.f52438b
                                java.util.Set<androidx.media3.session.n> r4 = r3.f52415r
                                androidx.media3.session.n r9 = r2
                                r4.remove(r9)
                                r4 = 1
                                java.lang.ref.WeakReference<androidx.media3.session.c1> r3 = r3.f52412b     // Catch: java.lang.Throwable -> L52
                                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L52
                                androidx.media3.session.c1 r3 = (androidx.media3.session.AbstractServiceC23212c1) r3     // Catch: java.lang.Throwable -> L52
                                if (r3 != 0) goto L22
                            L1e:
                                r9.f()     // Catch: android.os.RemoteException -> L5e
                                goto L5e
                            L22:
                                androidx.media3.session.O0$g r5 = new androidx.media3.session.O0$g     // Catch: java.lang.Throwable -> L52
                                int r6 = r1.f52534c     // Catch: java.lang.Throwable -> L52
                                r10 = 0
                                r5.<init>(r0, r6, r2, r10)     // Catch: java.lang.Throwable -> L52
                                androidx.media3.session.O0 r0 = r3.d(r5)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
                                if (r0 != 0) goto L31
                                goto L1e
                            L31:
                                r3.a(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
                                r2 = 0
                                int r5 = r1.f52534c     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                java.lang.String r6 = r1.f52535d     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                android.os.Bundle r1 = r1.f52537f     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                androidx.media3.session.T0 r0 = r0.f52204a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                r0.getClass()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                androidx.media3.common.util.C23110a.h(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                androidx.media3.session.A1 r3 = r0.f52292f     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                r4 = r9
                                r3.e4(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
                                goto L5b
                            L4a:
                                r4 = r2
                                goto L5f
                            L4c:
                                r4 = r2
                                goto L55
                            L4e:
                                r0 = move-exception
                                goto L4a
                            L50:
                                r0 = move-exception
                                goto L4c
                            L52:
                                r0 = move-exception
                                goto L5f
                            L54:
                                r0 = move-exception
                            L55:
                                java.lang.String r1 = "Failed to add a session to session service"
                                androidx.media3.common.util.s.h(r1, r0)     // Catch: java.lang.Throwable -> L52
                                r2 = r4
                            L5b:
                                if (r2 == 0) goto L5e
                                goto L1e
                            L5e:
                                return
                            L5f:
                                if (r4 == 0) goto L64
                                r9.f()     // Catch: android.os.RemoteException -> L64
                            L64:
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.RunnableC23215d1.run():void");
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (RuntimeException e12) {
                androidx.media3.common.util.s.h("Ignoring malformed Bundle for ConnectionRequest", e12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(O0 o02) {
        O0 o03;
        boolean z12 = true;
        C23110a.a("session is already released", !o02.f52204a.f());
        synchronized (this.f52403b) {
            o03 = (O0) this.f52405d.get(o02.f52204a.f52294h);
            if (o03 != null && o03 != o02) {
                z12 = false;
            }
            C23110a.a("Session ID should be unique", z12);
            this.f52405d.put(o02.f52204a.f52294h, o02);
        }
        if (o03 == null) {
            androidx.media3.common.util.M.I(this.f52404c, new RunnableC23276z0(this, c(), o02, 5));
        }
    }

    public final C23237l b() {
        C23237l c23237l;
        synchronized (this.f52403b) {
            try {
                if (this.f52409h == null) {
                    this.f52409h = new C23237l(this);
                }
                c23237l = this.f52409h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23237l;
    }

    public final M0 c() {
        M0 m02;
        synchronized (this.f52403b) {
            try {
                if (this.f52407f == null) {
                    if (this.f52408g == null) {
                        C23240m.c cVar = new C23240m.c(getApplicationContext());
                        C23110a.g(!cVar.f52578c);
                        C23240m c23240m = new C23240m(cVar, null);
                        cVar.f52578c = true;
                        this.f52408g = c23240m;
                    }
                    this.f52407f = new M0(this, this.f52408g, b());
                }
                m02 = this.f52407f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m02;
    }

    @j.P
    public abstract O0 d(O0.g gVar);

    public final void e(final O0 o02, final boolean z12) {
        boolean zContainsKey;
        J jA2;
        final M0 m0C = c();
        AbstractServiceC23212c1 abstractServiceC23212c1 = m0C.f52131a;
        synchronized (abstractServiceC23212c1.f52403b) {
            zContainsKey = abstractServiceC23212c1.f52405d.containsKey(o02.f52204a.f52294h);
        }
        if (!zContainsKey || (jA2 = m0C.a(o02)) == null || jA2.getCurrentTimeline().x() || jA2.getPlaybackState() == 1) {
            m0C.b(true);
            return;
        }
        int i12 = m0C.f52139i + 1;
        m0C.f52139i = i12;
        final AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) m0C.f52138h.get(o02);
        C23110a.h(abstractC37401r1);
        final C23214d0 c23214d0 = new C23214d0(i12, m0C, o02);
        androidx.media3.common.util.M.I(new Handler(o02.b().G()), new Runnable() { // from class: androidx.media3.session.I0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 893
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.I0.run():void");
            }
        });
    }

    public final boolean f(O0 o02, boolean z12) {
        try {
            e(o02, c().c(o02, z12));
            return true;
        } catch (IllegalStateException e12) {
            if (androidx.media3.common.util.M.f47887a < 31 || !b.a(e12)) {
                throw e12;
            }
            androidx.media3.common.util.s.d("Failed to start foreground", e12);
            this.f52404c.post(new Z(this, 3));
            return false;
        }
    }

    public final void g(O0 o02) {
        synchronized (this.f52403b) {
            C23110a.a("session not found", this.f52405d.containsKey(o02.f52204a.f52294h));
            this.f52405d.remove(o02.f52204a.f52294h);
        }
        androidx.media3.common.util.M.I(this.f52404c, new RunnableC23253q0(10, c(), o02));
    }

    @Override // android.app.Service
    @InterfaceC42153i
    @j.P
    public IBinder onBind(@j.P Intent intent) {
        String action;
        e eVar;
        ServiceC23218e1 serviceC23218e1;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.f52403b) {
                eVar = this.f52406e;
                C23110a.h(eVar);
            }
            return eVar;
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        C.b bVar = new C.b("android.media.session.MediaController", -1, -1);
        Bundle bundle = Bundle.EMPTY;
        O0 o0D = d(new O0.g(bVar, 0, false, null));
        if (o0D == null) {
            return null;
        }
        a(o0D);
        T0 t02 = o0D.f52204a;
        synchronized (t02.f52287a) {
            try {
                if (t02.f52305s == null) {
                    t02.f52305s = t02.a(t02.f52296j.f52204a.f52293g.f52362g.getSessionToken());
                }
                serviceC23218e1 = t02.f52305s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceC23218e1.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public void onCreate() {
        super.onCreate();
        synchronized (this.f52403b) {
            this.f52406e = new e(this);
        }
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public void onDestroy() {
        super.onDestroy();
        synchronized (this.f52403b) {
            try {
                e eVar = this.f52406e;
                if (eVar != null) {
                    eVar.f52412b.clear();
                    eVar.f52413p.removeCallbacksAndMessages(null);
                    Iterator<InterfaceC23243n> it = eVar.f52415r.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().f();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f52406e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public final int onStartCommand(@j.P Intent intent, int i12, int i13) {
        O0 o0D;
        O0 next;
        if (intent == null) {
            return 1;
        }
        C23237l c23237lB = b();
        Uri data = intent.getData();
        keyEvent = null;
        KeyEvent keyEvent = null;
        if (data != null) {
            synchronized (O0.f52202b) {
                try {
                    Iterator<O0> it = O0.f52203c.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (androidx.media3.common.util.M.a(next.f52204a.f52288b, data)) {
                        }
                    }
                } finally {
                }
            }
            o0D = next;
        } else {
            o0D = null;
        }
        c23237lB.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            if (o0D == null) {
                C.b bVar = new C.b("android.media.session.MediaController", -1, -1);
                Bundle bundle = Bundle.EMPTY;
                o0D = d(new O0.g(bVar, 0, false, null));
                if (o0D == null) {
                    return 1;
                }
                a(o0D);
            }
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("android.intent.extra.KEY_EVENT")) {
                keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
            }
            if (keyEvent != null) {
                o0D.f52204a.f52293g.f52362g.getController().dispatchMediaButtonEvent(keyEvent);
            }
        } else if (o0D != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return 1;
            }
            Bundle extras3 = intent.getExtras();
            Object obj2 = extras3 != null ? extras3.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
            Bundle bundle2 = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
            M0 m0C = c();
            J jA2 = m0C.a(o0D);
            if (jA2 != null) {
                androidx.media3.common.util.M.I(new Handler(o0D.b().G()), new RunnableC23276z0(m0C, o0D, str, bundle2, jA2));
            }
        }
        return 1;
    }

    /* compiled from: MediaSessionService.java */
    @androidx.media3.common.util.J
    /* renamed from: androidx.media3.session.c1$c */
    public interface c {
        @j.X
        default void a() {
        }
    }
}
