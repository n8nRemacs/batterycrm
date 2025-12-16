package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import j.k0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kZ0.InterfaceC42651a;
import mZ0.C44035b;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final Context f360888a;

    /* renamed from: b, reason: collision with root package name */
    public final L f360889b;

    /* renamed from: c, reason: collision with root package name */
    public final W f360890c;

    /* renamed from: d, reason: collision with root package name */
    public final long f360891d;

    /* renamed from: e, reason: collision with root package name */
    public F f360892e;

    /* renamed from: f, reason: collision with root package name */
    public F f360893f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360894g;

    /* renamed from: h, reason: collision with root package name */
    public C37598u f360895h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f360896i;

    /* renamed from: j, reason: collision with root package name */
    public final C44035b f360897j;

    /* renamed from: k, reason: collision with root package name */
    @k0
    public final com.google.firebase.crashlytics.a f360898k;

    /* renamed from: l, reason: collision with root package name */
    public final com.google.firebase.crashlytics.a f360899l;

    /* renamed from: m, reason: collision with root package name */
    public final ExecutorService f360900m;

    /* renamed from: n, reason: collision with root package name */
    public final C37591m f360901n;

    /* renamed from: o, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.b f360902o;

    public E(com.google.firebase.g gVar, Q q12, com.google.firebase.crashlytics.internal.b bVar, L l12, com.google.firebase.crashlytics.a aVar, com.google.firebase.crashlytics.a aVar2, C44035b c44035b, ExecutorService executorService) {
        this.f360889b = l12;
        gVar.a();
        this.f360888a = gVar.f361595a;
        this.f360896i = q12;
        this.f360902o = bVar;
        this.f360898k = aVar;
        this.f360899l = aVar2;
        this.f360900m = executorService;
        this.f360897j = c44035b;
        this.f360901n = new C37591m(executorService);
        this.f360891d = System.currentTimeMillis();
        this.f360890c = new W();
    }

    public static Task a(final E e12, com.google.firebase.crashlytics.internal.settings.k kVar) {
        Task<Void> taskE;
        C c12;
        C37591m c37591m = e12.f360901n;
        C37591m c37591m2 = e12.f360901n;
        if (!Boolean.TRUE.equals(c37591m.f360985d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        e12.f360892e.a();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        dVar.a(2);
        try {
            try {
                e12.f360898k.b(new InterfaceC42651a() { // from class: com.google.firebase.crashlytics.internal.common.z
                    @Override // kZ0.InterfaceC42651a
                    public final void a(String str) {
                        this.f361030a.e(str);
                    }
                });
                e12.f360895h.h();
                if (kVar.a().f361456b.f361461a) {
                    if (!e12.f360895h.e(kVar)) {
                        dVar.a(5);
                    }
                    taskE = e12.f360895h.i(kVar.b());
                    c12 = new C(e12);
                } else {
                    dVar.a(3);
                    taskE = C37030m.e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    c12 = new C(e12);
                }
            } catch (Exception e13) {
                dVar.b();
                taskE = C37030m.e(e13);
                c12 = new C(e12);
            }
            c37591m2.a(c12);
            return taskE;
        } catch (Throwable th2) {
            c37591m2.a(new C(e12));
            throw th2;
        }
    }

    @j.N
    public final Task<Boolean> b() {
        C37598u c37598u = this.f360895h;
        if (c37598u.f361016q.compareAndSet(false, true)) {
            return c37598u.f361013n.f355672a;
        }
        com.google.firebase.crashlytics.internal.d.f361031a.a(5);
        return C37030m.f(Boolean.FALSE);
    }

    public final void c() {
        C37598u c37598u = this.f360895h;
        c37598u.f361014o.d(Boolean.FALSE);
        com.google.android.gms.tasks.P p12 = c37598u.f361015p.f355672a;
    }

    public final void d(com.google.firebase.crashlytics.internal.settings.k kVar) {
        final A a12 = new A(this, kVar);
        ExecutorService executorService = e0.f360968a;
        final C37028k c37028k = new C37028k();
        final ExecutorService executorService2 = this.f360900m;
        executorService2.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c0
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable = a12;
                Executor executor = executorService2;
                C37028k c37028k2 = c37028k;
                ExecutorService executorService3 = e0.f360968a;
                try {
                    ((A) callable).call().i(executor, new d0(1, c37028k2));
                } catch (Exception e12) {
                    c37028k2.a(e12);
                }
            }
        });
    }

    public final void e(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f360891d;
        C37598u c37598u = this.f360895h;
        c37598u.getClass();
        c37598u.f361004e.a(new CallableC37599v(c37598u, jCurrentTimeMillis, str));
    }

    public final void f(@j.N Throwable th2) {
        C37598u c37598u = this.f360895h;
        Thread threadCurrentThread = Thread.currentThread();
        c37598u.getClass();
        RunnableC37600w runnableC37600w = new RunnableC37600w(c37598u, System.currentTimeMillis(), th2, threadCurrentThread);
        C37591m c37591m = c37598u.f361004e;
        c37591m.getClass();
        c37591m.a(new CallableC37588j(runnableC37600w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0151, code lost:
    
        if (r1.isConnectedOrConnecting() != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.firebase.crashlytics.internal.common.C37579a r29, com.google.firebase.crashlytics.internal.settings.g r30) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.E.g(com.google.firebase.crashlytics.internal.common.a, com.google.firebase.crashlytics.internal.settings.g):boolean");
    }

    public final void h() {
        C37598u c37598u = this.f360895h;
        c37598u.f361014o.d(Boolean.TRUE);
        com.google.android.gms.tasks.P p12 = c37598u.f361015p.f355672a;
    }

    public final void i(@j.P Boolean bool) {
        Boolean boolA;
        L l12 = this.f360889b;
        synchronized (l12) {
            if (bool != null) {
                boolA = bool;
            } else {
                com.google.firebase.g gVar = l12.f360918b;
                gVar.a();
                boolA = l12.a(gVar.f361595a);
            }
            l12.f360922f = boolA;
            SharedPreferences.Editor editorEdit = l12.f360917a.edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (l12.f360919c) {
                try {
                    if (l12.b()) {
                        if (!l12.f360921e) {
                            l12.f360920d.d(null);
                            l12.f360921e = true;
                        }
                    } else if (l12.f360921e) {
                        l12.f360920d = new C37028k<>();
                        l12.f360921e = false;
                    }
                } finally {
                }
            }
        }
    }

    public final void j(String str, String str2) {
        C37598u c37598u = this.f360895h;
        c37598u.getClass();
        try {
            c37598u.f361003d.e(str, str2);
        } catch (IllegalArgumentException e12) {
            Context context = c37598u.f361000a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e12;
            }
            com.google.firebase.crashlytics.internal.d.f361031a.b();
        }
    }

    public final void k() {
        this.f360895h.f361003d.f();
    }

    public final void l(String str) {
        this.f360895h.f361003d.h(str);
    }
}
