package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37825a {

    /* renamed from: d, reason: collision with root package name */
    final C37848w f365364d;

    /* renamed from: e, reason: collision with root package name */
    final f2 f365365e;

    /* renamed from: f, reason: collision with root package name */
    final g1 f365366f;

    /* renamed from: g, reason: collision with root package name */
    final Application f365367g;

    /* renamed from: h, reason: collision with root package name */
    final Runnable f365368h;

    /* renamed from: i, reason: collision with root package name */
    final Runnable f365369i;

    /* renamed from: j, reason: collision with root package name */
    final Runnable f365370j;

    /* renamed from: a, reason: collision with root package name */
    final Map<Activity, Boolean> f365361a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    final Handler f365362b = C37835i.f365658a;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f365363c = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    long f365371k = 0;

    /* renamed from: l, reason: collision with root package name */
    long f365372l = 0;

    private C37825a(C37848w c37848w, f2 f2Var, g1 g1Var, Application application) {
        this.f365364d = c37848w;
        this.f365365e = f2Var;
        this.f365366f = g1Var;
        this.f365367g = application;
        final int i12 = 0;
        this.f365368h = new Runnable(this) { // from class: com.my.tracker.obfuscated.A

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C37825a f365261c;

            {
                this.f365261c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f365261c.b();
                        break;
                    case 1:
                        this.f365261c.c();
                        break;
                    default:
                        this.f365261c.d();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f365369i = new Runnable(this) { // from class: com.my.tracker.obfuscated.A

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C37825a f365261c;

            {
                this.f365261c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f365261c.b();
                        break;
                    case 1:
                        this.f365261c.c();
                        break;
                    default:
                        this.f365261c.d();
                        break;
                }
            }
        };
        final int i14 = 2;
        this.f365370j = new Runnable(this) { // from class: com.my.tracker.obfuscated.A

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C37825a f365261c;

            {
                this.f365261c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f365261c.b();
                        break;
                    case 1:
                        this.f365261c.c();
                        break;
                    default:
                        this.f365261c.d();
                        break;
                }
            }
        };
    }

    public void e() {
        if (this.f365363c.get()) {
            C37835i.f(this.f365369i);
        }
    }

    public void f() {
        e2.a("ActivityHandler: timer tick for buffering period");
        this.f365364d.a();
        e();
    }

    public static C37825a a(C37848w c37848w, f2 f2Var, g1 g1Var, Application application) {
        return new C37825a(c37848w, f2Var, g1Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f365363c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(c2.a(this.f365365e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        z0.a(this.f365367g).d(c2.b(this.f365371k));
    }

    public void a() {
        this.f365367g.registerActivityLifecycleCallbacks(new b());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.f365361a.put(activity, Boolean.TRUE) != null || this.f365361a.size() > 1) {
            return;
        }
        p1.d().b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f365371k >= c2.a(this.f365365e.i())) {
            this.f365366f.c();
            if (this.f365365e.q()) {
                this.f365364d.e();
                a(c2.a(this.f365365e.e()));
                return;
            }
        }
        long j12 = this.f365372l - jCurrentTimeMillis;
        if (j12 > 0) {
            a(j12);
        } else {
            f();
        }
    }

    public void c(Activity activity) {
        if (this.f365361a.remove(activity) == null || !this.f365361a.isEmpty()) {
            return;
        }
        p1.d().a();
        this.f365363c.set(false);
        this.f365362b.removeCallbacks(this.f365368h);
        this.f365371k = System.currentTimeMillis();
        C37835i.a(this.f365370j);
    }

    public void d(Activity activity) {
        C37835i.f(new H(3, this, activity));
    }

    public void a(long j12) {
        this.f365362b.removeCallbacks(this.f365368h);
        this.f365363c.set(true);
        this.f365362b.postDelayed(this.f365368h, j12);
        this.f365372l = System.currentTimeMillis() + j12;
    }

    /* renamed from: com.my.tracker.obfuscated.a$b */
    public final class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C37825a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C37825a.this.c(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
