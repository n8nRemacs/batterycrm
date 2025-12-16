package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.d;
import com.yandex.metrica.impl.ob.Fh;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class Jh implements Runnable, Gh {

    /* renamed from: a, reason: collision with root package name */
    private final ServiceConnection f378620a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f378621b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Runnable f378622c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Bh> f378623d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f378624e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f378625f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private ServerSocket f378626g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private C38758di f378627h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private Lm f378628i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final M0 f378629j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final d.C10948d f378630k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final C39295zh f378631l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final C39295zh f378632m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final Fh f378633n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final Pm f378634o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<C38758di, List<Integer>> f378635p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final C39271yh f378636q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final Ih f378637r;

    /* renamed from: s, reason: collision with root package name */
    private final String f378638s;

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            Jh.this.c();
            try {
                Jh.this.f378624e.unbindService(Jh.this.f378620a);
            } catch (Throwable unused) {
                Jh.this.f378629j.reportEvent("socket_unbind_has_thrown_exception");
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Jh jh2 = Jh.this;
            Jh.a(jh2, jh2.f378627h);
        }
    }

    public class d extends HashMap<String, Bh> {

        public class a implements Bh {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.Bh
            @j.N
            public Ah a(@j.N Socket socket, @j.N Uri uri, @j.N Hh hh2) {
                Jh jh2 = Jh.this;
                return new C39080qh(socket, uri, jh2, jh2.f378627h, Jh.this.f378636q.a(), hh2);
            }
        }

        public class b implements Bh {
            public b() {
            }

            @Override // com.yandex.metrica.impl.ob.Bh
            @j.N
            public Ah a(@j.N Socket socket, @j.N Uri uri, @j.N Hh hh2) {
                Jh jh2 = Jh.this;
                return new Dh(socket, uri, jh2, jh2.f378627h, hh2);
            }
        }

        public d() {
            put("p", new a());
            put("i", new b());
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Jh.f(Jh.this);
        }
    }

    public enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    public Jh(@j.N Context context, @j.N C39057pi c39057pi, @j.N Fh fh2, @j.N InterfaceC39011nm<C38758di, List<Integer>> interfaceC39011nm, @j.N C39223wh c39223wh, @j.N C39223wh c39223wh2, @j.N String str) {
        this(context, c39057pi, (com.yandex.metrica.coreutils.services.d) com.yandex.metrica.coreutils.services.h.f377659c.f377660a.getValue(), F0.g().q(), C39031oh.a(), new C39295zh("open", c39223wh), new C39295zh("port_already_in_use", c39223wh2), new C39271yh(context, c39057pi), new Ih(), fh2, interfaceC39011nm, str);
    }

    public static void f(Jh jh2) {
        jh2.getClass();
        Intent intent = new Intent(jh2.f378624e, (Class<?>) MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!jh2.f378624e.bindService(intent, jh2.f378620a, 1)) {
                jh2.f378629j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            jh2.f378629j.reportEvent("socket_bind_has_thrown_exception");
        }
        Lm lmB = jh2.f378634o.b(jh2);
        jh2.f378628i = lmB;
        lmB.start();
        jh2.f378637r.d();
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        Socket socketAccept;
        ServerSocket serverSocket;
        synchronized (this) {
            try {
                C38758di c38758di = this.f378627h;
                if (c38758di != null && a(c38758di) == f.SHOULD_RETRY) {
                    this.f378625f = false;
                    long j12 = this.f378627h.f380412j;
                    ICommonExecutor iCommonExecutorA = this.f378634o.a();
                    iCommonExecutorA.remove(this.f378622c);
                    iCommonExecutorA.executeDelayed(this.f378622c, j12, TimeUnit.SECONDS);
                    return;
                }
                if (A2.a(26)) {
                    TrafficStats.setThreadStatsTag(40230);
                }
                if (this.f378626g != null) {
                    while (this.f378625f) {
                        synchronized (this) {
                            try {
                                socketAccept = null;
                                serverSocket = this.f378625f ? this.f378626g : null;
                            } finally {
                            }
                        }
                        if (serverSocket != null) {
                            try {
                                socketAccept = serverSocket.accept();
                                Hh hh2 = new Hh(new com.yandex.metrica.coreutils.services.e(), new C38837gm());
                                if (A2.a(26)) {
                                    TrafficStats.tagSocket(socketAccept);
                                }
                                new Ch(socketAccept, this, this.f378623d, hh2).a();
                            } catch (Throwable unused) {
                                if (socketAccept != null) {
                                }
                            }
                            if (socketAccept != null) {
                                try {
                                    socketAccept.close();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    private synchronized void c(@j.N C38758di c38758di) {
        if (!this.f378625f && this.f378630k.a(c38758di.f380408f)) {
            this.f378625f = true;
        }
    }

    public void a() {
        this.f378621b.removeMessages(100);
        this.f378637r.e();
    }

    public synchronized void b() {
        if (this.f378625f) {
            a();
            Handler handler = this.f378621b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f378627h.f380403a));
            this.f378637r.c();
        }
    }

    public synchronized void a(@j.N C39057pi c39057pi) {
        try {
            C38758di c38758diM = c39057pi.M();
            synchronized (this) {
                if (c38758diM != null) {
                    c(c38758diM);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public synchronized void c() {
        try {
            this.f378625f = false;
            Lm lm2 = this.f378628i;
            if (lm2 != null) {
                lm2.stopRunning();
                this.f378628i = null;
            }
            ServerSocket serverSocket = this.f378626g;
            if (serverSocket != null) {
                serverSocket.close();
                this.f378626g = null;
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(Jh jh2, C38758di c38758di) {
        synchronized (jh2) {
            if (c38758di != null) {
                jh2.c(c38758di);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Jh(@j.N android.content.Context r3, @j.N com.yandex.metrica.impl.ob.C39057pi r4, @j.N com.yandex.metrica.coreutils.services.d r5, @j.N com.yandex.metrica.impl.ob.Pm r6, @j.N com.yandex.metrica.impl.ob.M0 r7, @j.N com.yandex.metrica.impl.ob.C39295zh r8, @j.N com.yandex.metrica.impl.ob.C39295zh r9, @j.N com.yandex.metrica.impl.ob.C39271yh r10, @j.N com.yandex.metrica.impl.ob.Ih r11, @j.N com.yandex.metrica.impl.ob.Fh r12, @j.N com.yandex.metrica.impl.ob.InterfaceC39011nm<com.yandex.metrica.impl.ob.C38758di, java.util.List<java.lang.Integer>> r13, @j.N java.lang.String r14) {
        /*
            r2 = this;
            r2.<init>()
            com.yandex.metrica.impl.ob.Jh$a r0 = new com.yandex.metrica.impl.ob.Jh$a
            r0.<init>(r2)
            r2.f378620a = r0
            com.yandex.metrica.impl.ob.Jh$b r0 = new com.yandex.metrica.impl.ob.Jh$b
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f378621b = r0
            com.yandex.metrica.impl.ob.Jh$c r0 = new com.yandex.metrica.impl.ob.Jh$c
            r0.<init>()
            r2.f378622c = r0
            com.yandex.metrica.impl.ob.Jh$d r0 = new com.yandex.metrica.impl.ob.Jh$d
            r0.<init>()
            r2.f378623d = r0
            r2.f378624e = r3
            r2.f378629j = r7
            r2.f378631l = r8
            r2.f378632m = r9
            r2.f378633n = r12
            r2.f378635p = r13
            r2.f378634o = r6
            r2.f378636q = r10
            r2.f378637r = r11
            java.lang.String r3 = "[YandexUID"
            java.lang.String r7 = "Server]"
            java.lang.String r3 = AK.c.k(r3, r14, r7)
            r2.f378638s = r3
            com.yandex.metrica.impl.ob.Jh$e r3 = new com.yandex.metrica.impl.ob.Jh$e
            r3.<init>()
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r6.a()
            monitor-enter(r5)
            com.yandex.metrica.coreutils.services.a$b r7 = new com.yandex.metrica.coreutils.services.a$b     // Catch: java.lang.Throwable -> L77
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L77
            com.yandex.metrica.coreutils.services.d$b r3 = new com.yandex.metrica.coreutils.services.d$b     // Catch: java.lang.Throwable -> L77
            com.yandex.metrica.coreutils.services.g r8 = r5.f377648b     // Catch: java.lang.Throwable -> L77
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L77
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L77
            com.yandex.metrica.coreutils.services.d$d r8 = new com.yandex.metrica.coreutils.services.d$d     // Catch: java.lang.Throwable -> L74
            r9 = 0
            r8.<init>(r6, r7, r3, r9)     // Catch: java.lang.Throwable -> L74
            java.util.ArrayList r3 = r5.f377647a     // Catch: java.lang.Throwable -> L74
            r3.add(r8)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r5)
            r2.f378630k = r8
            com.yandex.metrica.impl.ob.di r3 = r4.M()
            r2.b(r3)
            com.yandex.metrica.impl.ob.di r3 = r2.f378627h
            if (r3 == 0) goto L73
            r2.c(r3)
        L73:
            return
        L74:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r3     // Catch: java.lang.Throwable -> L77
        L77:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jh.<init>(android.content.Context, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.coreutils.services.d, com.yandex.metrica.impl.ob.Pm, com.yandex.metrica.impl.ob.M0, com.yandex.metrica.impl.ob.zh, com.yandex.metrica.impl.ob.zh, com.yandex.metrica.impl.ob.yh, com.yandex.metrica.impl.ob.Ih, com.yandex.metrica.impl.ob.Fh, com.yandex.metrica.impl.ob.nm, java.lang.String):void");
    }

    @j.N
    private synchronized f a(@j.N C38758di c38758di) {
        f fVar;
        Integer next;
        Throwable th2;
        Fh.a e12;
        try {
            Iterator<Integer> it = this.f378635p.a(c38758di).iterator();
            fVar = f.ORDINARY_FAIL;
            Integer num = null;
            while (this.f378626g == null && it.hasNext()) {
                try {
                    next = it.next();
                    if (next != null) {
                        try {
                            this.f378626g = this.f378633n.a(next.intValue());
                            fVar = f.OK;
                            this.f378631l.a(this, next.intValue(), c38758di);
                        } catch (Fh.a e13) {
                            e12 = e13;
                            String message = e12.getMessage();
                            Throwable cause = e12.getCause();
                            if (cause != null && message != null) {
                                Map<String, Object> mapA = a(next);
                                ((HashMap) mapA).put("exception", Log.getStackTraceString(cause));
                                this.f378629j.reportEvent(b(message), mapA);
                            }
                            num = next;
                        } catch (BindException unused) {
                            num = next;
                            fVar = f.SHOULD_RETRY;
                            this.f378632m.a(this, num.intValue(), c38758di);
                        } catch (Throwable th3) {
                            th2 = th3;
                            Map<String, Object> mapA2 = a(next);
                            ((HashMap) mapA2).put("exception", Log.getStackTraceString(th2));
                            this.f378629j.reportEvent(b("open_error"), mapA2);
                            num = next;
                        }
                    }
                } catch (Fh.a e14) {
                    next = num;
                    e12 = e14;
                } catch (BindException unused2) {
                } catch (Throwable th4) {
                    next = num;
                    th2 = th4;
                }
                num = next;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return fVar;
    }

    private void b(@j.P C38758di c38758di) {
        this.f378627h = c38758di;
        if (c38758di != null) {
            d.C10948d c10948d = this.f378630k;
            long j12 = c38758di.f380407e;
            c10948d.getClass();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            d.b bVar = c10948d.f377654a;
            bVar.getClass();
            bVar.f377652d = timeUnit.toMillis(j12);
        }
    }

    public void b(int i12, @j.N Hh hh2) {
        this.f378629j.reportEvent(b("sync_succeed"), a(i12, hh2));
    }

    public synchronized void b(@j.N C39057pi c39057pi) {
        try {
            this.f378636q.a(c39057pi);
            C38758di c38758diM = c39057pi.M();
            if (c38758diM != null) {
                this.f378627h = c38758diM;
                d.C10948d c10948d = this.f378630k;
                long j12 = c38758diM.f380407e;
                c10948d.getClass();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d.b bVar = c10948d.f377654a;
                bVar.getClass();
                bVar.f377652d = timeUnit.toMillis(j12);
                c(c38758diM);
            } else {
                c();
                b((C38758di) null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String b(@j.N String str) {
        return androidx.camera.camera2.internal.G.f("socket_", str);
    }

    private Map<String, Object> a(@j.P Integer num) {
        HashMap map = new HashMap();
        map.put("port", num == null ? "" : String.valueOf(num));
        return map;
    }

    public class a implements ServiceConnection {
        public a(Jh jh2) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }
    }

    private Map<String, Object> a(int i12, @j.N Hh hh2) {
        Map<String, Object> mapA = a(Integer.valueOf(i12));
        HashMap map = (HashMap) mapA;
        map.put("idle_interval", Double.valueOf(this.f378637r.b()));
        map.put("background_interval", Double.valueOf(this.f378637r.a()));
        map.put("request_read_time", Long.valueOf(hh2.d()));
        map.put("response_form_time", Long.valueOf(hh2.e()));
        map.put("response_send_time", Long.valueOf(hh2.f()));
        return mapA;
    }

    public void a(@j.N String str, String str2) {
        HashMap mapG = org.webrtc.h.g(TooltipAttribute.PARAM_DEEP_LINK, str2);
        this.f378629j.reportEvent("socket_" + str, mapG);
    }

    public void a(@j.N String str) {
        this.f378629j.reportEvent(b(str));
    }

    public void a(@j.N String str, Throwable th2) {
        this.f378629j.reportError(b(str), th2);
    }

    public void a(@j.N String str, @j.P Integer num) {
        this.f378629j.reportEvent(b(str), a(num));
    }

    public void a(@j.N Map<String, Object> map, int i12, @j.N Hh hh2) {
        Map<String, Object> mapA = a(i12, hh2);
        ((HashMap) mapA).put("params", map);
        this.f378629j.reportEvent(b("reversed_sync_succeed"), mapA);
    }
}
