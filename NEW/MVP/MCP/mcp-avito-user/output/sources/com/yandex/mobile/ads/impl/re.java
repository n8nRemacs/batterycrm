package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.df;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.ns0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public abstract class re<T> implements ns0.a, df.a<AdResponse<T>> {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    protected final Context f389494b;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Executor f389496d;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    protected final n2 f389498f;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final e31 f389500h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final zc f389501i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    protected final a4 f389502j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    protected final r90 f389503k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    protected final p21 f389504l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final fa f389505m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final pf f389506n;

    /* renamed from: r, reason: collision with root package name */
    private boolean f389510r;

    /* renamed from: s, reason: collision with root package name */
    private long f389511s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    protected AdResponse<T> f389512t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    private t2 f389513u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    private String f389514v;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final Handler f389493a = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final x2 f389495c = new x2(this);

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private d4 f389509q = d4.f384518b;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ns0 f389497e = ns0.a();

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final q71 f389507o = q71.a();

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final hz0 f389508p = new hz0();

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final f7 f389499g = new f7();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ac1 f389515b;

        /* renamed from: com.yandex.mobile.ads.impl.re$a$a, reason: collision with other inner class name */
        public class C10985a implements cd {
            public C10985a() {
            }

            @Override // com.yandex.mobile.ads.impl.cd
            public final void a(@j.P String str) {
                re.this.f389502j.a(z3.f392165e);
                re.this.f389498f.b(str);
                a aVar = a.this;
                re.this.b(aVar.f389515b);
            }
        }

        public a(ac1 ac1Var) {
            this.f389515b = ac1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zc zcVar = re.this.f389501i;
            re reVar = re.this;
            zcVar.a(reVar.f389494b, reVar.f389505m, new C10985a());
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w2 f389518b;

        public b(w2 w2Var) {
            this.f389518b = w2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            re.this.a(this.f389518b);
        }
    }

    public re(@j.N Context context, @j.N y6 y6Var, @j.N a4 a4Var) {
        this.f389494b = context;
        this.f389502j = a4Var;
        n2 n2Var = new n2(y6Var);
        this.f389498f = n2Var;
        Executor executorB = v90.a().b();
        this.f389496d = executorB;
        this.f389504l = new p21(context, executorB, a4Var);
        this.f389500h = new e31();
        this.f389501i = ad.a();
        this.f389505m = ga.a();
        this.f389506n = new pf(n2Var);
        this.f389503k = new r90(context, n2Var);
    }

    @j.N
    public abstract oe<T> a(String str, String str2);

    @j.N
    public final a4 e() {
        return this.f389502j;
    }

    public final synchronized g5 f() {
        return this.f389498f.a();
    }

    @j.P
    public final AdResponse<T> g() {
        return this.f389512t;
    }

    @j.N
    public final Context h() {
        return this.f389494b;
    }

    @j.P
    public final SizeInfo i() {
        return this.f389498f.n();
    }

    public final synchronized boolean j() {
        return this.f389509q == d4.f384517a;
    }

    public final synchronized boolean k() {
        return this.f389510r;
    }

    public final boolean l() {
        return !this.f389497e.b(this.f389494b);
    }

    public void m() {
        n();
    }

    public synchronized void n() {
        t2 t2Var = this.f389513u;
        if (t2Var != null) {
            ((com.yandex.mobile.ads.banner.e) t2Var).d();
        }
    }

    public final void o() {
        this.f389502j.a(new n7(ky0.c.f387327b, this.f389514v));
        this.f389502j.a(z3.f392163c);
        this.f389507o.a(n80.f388181a, this);
        d4 d4Var = d4.f384520d;
        synchronized (this) {
            Objects.toString(d4Var);
            this.f389509q = d4Var;
        }
        this.f389511s = SystemClock.elapsedRealtime();
    }

    public void p() {
        y2.a(this.f389498f.b().a());
        o();
        n();
    }

    public final void q() {
        getClass().toString();
        this.f389497e.a(this.f389494b, this);
    }

    public final void r() {
        getClass().toString();
        this.f389497e.b(this.f389494b, this);
    }

    @j.k0
    @j.P
    public w2 s() {
        return this.f389503k.b();
    }

    public final synchronized void a() {
        d4 d4Var = d4.f384517a;
        Objects.toString(d4Var);
        this.f389509q = d4Var;
    }

    public final synchronized void c(@j.P g5 g5Var) {
        f7 f7Var;
        f7Var = this.f389499g;
        synchronized (this) {
            d4 d4Var = d4.f384519c;
            synchronized (this) {
                Objects.toString(d4Var);
                this.f389509q = d4Var;
            }
        }
        this.f389493a.post(new pe(this, g5Var, f7Var));
    }

    @j.N
    public final n2 d() {
        return this.f389498f;
    }

    public synchronized void b(@j.N g5 g5Var) {
        d4 d4Var;
        d4 d4Var2;
        synchronized (this) {
            Objects.toString(this.f389509q);
            d4Var = this.f389509q;
            d4Var2 = d4.f384519c;
        }
        if (d4Var != d4Var2) {
            if (a(g5Var)) {
                this.f389502j.a();
                this.f389502j.b(z3.f392163c);
                this.f389507o.b(n80.f388181a, this);
                synchronized (this) {
                    f7 f7Var = this.f389499g;
                    synchronized (this) {
                        synchronized (this) {
                            Objects.toString(d4Var2);
                            this.f389509q = d4Var2;
                            this.f389493a.post(new pe(this, g5Var, f7Var));
                        }
                    }
                }
            } else {
                m();
            }
        }
    }

    @j.k0
    public final void a(@j.N ac1 ac1Var) {
        this.f389502j.b(z3.f392165e);
        this.f389496d.execute(new a(ac1Var));
    }

    public synchronized void c() {
        synchronized (this) {
        }
        if (!this.f389510r) {
            this.f389510r = true;
            r();
            this.f389504l.a();
            b();
            this.f389495c.b();
            this.f389493a.removeCallbacksAndMessages(null);
            this.f389507o.a(n80.f388181a, this);
            this.f389512t = null;
            getClass().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BiddingSettings biddingSettings, ac1 ac1Var) {
        this.f389506n.a(this.f389494b, biddingSettings, new O(15, this, ac1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ac1 ac1Var, String str) {
        this.f389502j.a(z3.f392166f);
        this.f389498f.c(str);
        synchronized (this) {
            this.f389496d.execute(new se(this, ac1Var));
        }
    }

    public void a(@j.P String str) {
        this.f389498f.a(str);
    }

    public final void a(@j.P com.yandex.mobile.ads.banner.e eVar) {
        this.f389513u = eVar;
    }

    public final void a(@j.N SizeInfo sizeInfo) {
        this.f389498f.a(sizeInfo);
    }

    public synchronized boolean a(g5 g5Var) {
        boolean z12;
        try {
            z12 = true;
            if (this.f389512t != null && this.f389511s > 0 && SystemClock.elapsedRealtime() - this.f389511s <= this.f389512t.h() && (g5Var == null || g5Var.equals(this.f389498f.a()))) {
                synchronized (this) {
                    if (!(this.f389509q == d4.f384521e)) {
                        z12 = false;
                    }
                }
            }
        } finally {
        }
        return z12;
    }

    @j.k0
    public final void b(@j.N ac1 ac1Var) {
        v11 v11VarA = q21.b().a(this.f389494b);
        BiddingSettings biddingSettingsF = v11VarA != null ? v11VarA.f() : null;
        if (biddingSettingsF != null) {
            this.f389502j.b(z3.f392166f);
            this.f389496d.execute(new H0(this, biddingSettingsF, ac1Var, 8));
        } else {
            synchronized (this) {
                this.f389496d.execute(new se(this, ac1Var));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ns0.a
    public void a(@j.N Intent intent) {
        intent.getAction();
    }

    public final void a(boolean z12) {
        this.f389498f.b(z12);
    }

    @Override // com.yandex.mobile.ads.impl.kz0.b
    public synchronized void a(@j.N AdResponse<T> adResponse) {
        this.f389502j.a(z3.f392170j);
        this.f389512t = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.kz0.a
    public final void a(@j.N ok1 ok1Var) {
        if (ok1Var instanceof r2) {
            b(x2.a(this.f389498f, ((r2) ok1Var).a()));
        }
    }

    public void b(@j.N w2 w2Var) {
        h70.c(w2Var.c(), new Object[0]);
        d4 d4Var = d4.f384521e;
        synchronized (this) {
            Objects.toString(d4Var);
            this.f389509q = d4Var;
        }
        this.f389502j.a(new n7(ky0.c.f387328c, this.f389514v));
        this.f389502j.a(z3.f392163c);
        this.f389507o.a(n80.f388181a, this);
        this.f389493a.post(new b(w2Var));
    }

    public synchronized void a(@j.N w2 w2Var) {
        t2 t2Var = this.f389513u;
        if (t2Var != null) {
            ((com.yandex.mobile.ads.banner.e) t2Var).a(w2Var);
        }
    }

    public final void a(@j.N xr0 xr0Var) {
        g5 g5VarA = this.f389498f.a();
        synchronized (this) {
            d4 d4Var = d4.f384519c;
            synchronized (this) {
                Objects.toString(d4Var);
                this.f389509q = d4Var;
            }
        }
        this.f389493a.post(new pe(this, g5VarA, xr0Var));
    }

    public final void b() {
        this.f389501i.a(this.f389505m);
    }

    public final void b(@j.P String str) {
        this.f389514v = str;
    }
}
