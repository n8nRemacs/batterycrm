package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39015o1 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f381210j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    private final Context f381211a;

    /* renamed from: b, reason: collision with root package name */
    private final ICommonExecutor f381212b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f381213c;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f381214d;

    /* renamed from: e, reason: collision with root package name */
    private IMetricaService f381215e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f381216f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39279z1 f381217g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f381218h;

    /* renamed from: i, reason: collision with root package name */
    private final ServiceConnection f381219i;

    /* renamed from: com.yandex.metrica.impl.ob.o1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C39015o1.a(C39015o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C39015o1.this) {
                C39015o1.this.f381215e = IMetricaService.a.e4(iBinder);
            }
            C39015o1.b(C39015o1.this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C39015o1.this) {
                C39015o1.this.f381215e = null;
            }
            C39015o1.c(C39015o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$c */
    public interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C39015o1(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, P.g().i());
    }

    public static void c(C39015o1 c39015o1) {
        Iterator<c> it = c39015o1.f381214d.iterator();
        while (it.hasNext()) {
            it.next().onServiceDisconnected();
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.f381215e != null) {
                    return;
                }
                Intent intentA = C38991n2.a(this.f381211a);
                try {
                    this.f381217g.a(this.f381211a);
                    this.f381211a.bindService(intentA, this.f381219i, 1);
                } catch (Throwable unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized IMetricaService d() {
        return this.f381215e;
    }

    public synchronized boolean e() {
        return this.f381215e != null;
    }

    public void f() {
        synchronized (this.f381216f) {
            this.f381212b.remove(this.f381218h);
        }
    }

    public void g() {
        ICommonExecutor iCommonExecutor = this.f381212b;
        synchronized (this.f381216f) {
            try {
                iCommonExecutor.remove(this.f381218h);
                if (!this.f381213c) {
                    iCommonExecutor.executeDelayed(this.f381218h, f381210j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(C39015o1 c39015o1) {
        synchronized (c39015o1) {
            if (c39015o1.f381211a != null && c39015o1.e()) {
                try {
                    c39015o1.f381215e = null;
                    c39015o1.f381211a.unbindService(c39015o1.f381219i);
                } catch (Throwable unused) {
                }
            }
            c39015o1.f381215e = null;
            Iterator<c> it = c39015o1.f381214d.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected();
            }
        }
    }

    @j.k0
    public C39015o1(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N C39279z1 c39279z1) {
        this.f381214d = new CopyOnWriteArrayList();
        this.f381215e = null;
        this.f381216f = new Object();
        this.f381218h = new a();
        this.f381219i = new b();
        this.f381211a = context.getApplicationContext();
        this.f381212b = iCommonExecutor;
        this.f381213c = false;
        this.f381217g = c39279z1;
    }

    public void c() {
        synchronized (this.f381216f) {
            this.f381213c = true;
            f();
        }
    }

    public void a(c cVar) {
        this.f381214d.add(cVar);
    }

    public static void b(C39015o1 c39015o1) {
        Iterator<c> it = c39015o1.f381214d.iterator();
        while (it.hasNext()) {
            it.next().onServiceConnected();
        }
    }

    public void a() {
        synchronized (this.f381216f) {
            this.f381213c = false;
            g();
        }
    }
}
