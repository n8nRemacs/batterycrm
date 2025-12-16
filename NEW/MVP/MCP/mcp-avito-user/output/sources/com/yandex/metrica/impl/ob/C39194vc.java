package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.ob.C39057pi;
import j.InterfaceC42148d;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.vc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39194vc {

    /* renamed from: n, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C39194vc f382047n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f382048o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    private static final Object f382049p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f382050q = 0;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private C38976mc f382053c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private C39057pi f382054d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Mc f382055e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private c f382056f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f382057g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Sb f382058h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final U7 f382059i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final T7 f382060j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final Ed f382061k;

    /* renamed from: b, reason: collision with root package name */
    private boolean f382052b = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f382062l = false;

    /* renamed from: m, reason: collision with root package name */
    private final Object f382063m = new Object();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakHashMap<Object, Object> f382051a = new WeakHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.vc$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39057pi f382064a;

        public a(C39057pi c39057pi) {
            this.f382064a = c39057pi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C39194vc.this.f382055e != null) {
                C39194vc.this.f382055e.a(this.f382064a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38976mc f382066a;

        public b(C38976mc c38976mc) {
            this.f382066a = c38976mc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C39194vc.this.f382055e != null) {
                C39194vc.this.f382055e.a(this.f382066a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vc$c */
    public static class c {
    }

    @j.k0
    public C39194vc(@j.N Context context, @j.N C39218wc c39218wc, @j.N c cVar, @j.N C39057pi c39057pi) {
        this.f382058h = new Sb(context, c39218wc.a(), c39218wc.d());
        this.f382059i = c39218wc.c();
        this.f382060j = c39218wc.b();
        this.f382061k = c39218wc.e();
        this.f382056f = cVar;
        this.f382054d = c39057pi;
    }

    public void b(@j.P Object obj) {
        synchronized (this.f382063m) {
            this.f382051a.remove(obj);
            b();
        }
    }

    public static C39194vc a(Context context) {
        if (f382047n == null) {
            synchronized (f382049p) {
                try {
                    if (f382047n == null) {
                        Context applicationContext = context.getApplicationContext();
                        f382047n = new C39194vc(applicationContext, new C39218wc(applicationContext), new c(), new C39057pi.b(applicationContext).a());
                    }
                } finally {
                }
            }
        }
        return f382047n;
    }

    private void b() {
        if (this.f382062l) {
            if (!this.f382052b || this.f382051a.isEmpty()) {
                this.f382058h.f379362b.execute(new RunnableC39122sc(this));
                Runnable runnable = this.f382057g;
                if (runnable != null) {
                    this.f382058h.f379362b.remove(runnable);
                }
                this.f382062l = false;
                return;
            }
            return;
        }
        if (!this.f382052b || this.f382051a.isEmpty()) {
            return;
        }
        if (this.f382055e == null) {
            c cVar = this.f382056f;
            Nc nc2 = new Nc(this.f382058h, this.f382059i, this.f382060j, this.f382054d, this.f382053c);
            cVar.getClass();
            this.f382055e = new Mc(nc2);
        }
        this.f382058h.f379362b.execute(new RunnableC39146tc(this));
        if (this.f382057g == null) {
            RunnableC39170uc runnableC39170uc = new RunnableC39170uc(this);
            this.f382057g = runnableC39170uc;
            this.f382058h.f379362b.executeDelayed(runnableC39170uc, f382048o);
        }
        this.f382058h.f379362b.execute(new RunnableC39098rc(this));
        this.f382062l = true;
    }

    public void a(@j.P Object obj) {
        synchronized (this.f382063m) {
            this.f382051a.put(obj, null);
            b();
        }
    }

    @j.P
    public Location a() {
        Mc mc2 = this.f382055e;
        if (mc2 == null) {
            return null;
        }
        return mc2.b();
    }

    @InterfaceC42148d
    public void a(boolean z12) {
        synchronized (this.f382063m) {
            try {
                if (this.f382052b != z12) {
                    this.f382052b = z12;
                    this.f382061k.a(z12);
                    this.f382058h.f379363c.a(this.f382061k.a());
                    b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(C39194vc c39194vc) {
        c39194vc.f382058h.f379362b.executeDelayed(c39194vc.f382057g, f382048o);
    }

    @InterfaceC42148d
    public void a(@j.N C39057pi c39057pi, @j.P C38976mc c38976mc) {
        synchronized (this.f382063m) {
            try {
                this.f382054d = c39057pi;
                this.f382061k.a(c39057pi);
                this.f382058h.f379363c.a(this.f382061k.a());
                this.f382058h.f379362b.execute(new a(c39057pi));
                if (!A2.a(this.f382053c, c38976mc)) {
                    a(c38976mc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC42148d
    public void a(@j.P C38976mc c38976mc) {
        synchronized (this.f382063m) {
            this.f382053c = c38976mc;
        }
        this.f382058h.f379362b.execute(new b(c38976mc));
    }
}
