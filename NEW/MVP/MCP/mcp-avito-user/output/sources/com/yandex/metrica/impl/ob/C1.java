package com.yandex.metrica.impl.ob;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
class C1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f377875f = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<A6> f377876a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final Thread.UncaughtExceptionHandler f377877b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38917k3 f377878c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38712bm f377879d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38868i3 f377880e;

    @j.k0
    public C1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @j.N List<A6> list, @j.N InterfaceC38712bm interfaceC38712bm, @j.N C38868i3 c38868i3, @j.N C38917k3 c38917k3) {
        this.f377876a = list;
        this.f377877b = uncaughtExceptionHandler;
        this.f377879d = interfaceC38712bm;
        this.f377880e = c38868i3;
        this.f377878c = c38917k3;
    }

    public static boolean a() {
        return f377875f.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        try {
            f377875f.set(true);
            C39212w6 c39212w6 = new C39212w6(this.f377880e.a(thread), this.f377878c.a(thread), ((Xl) this.f377879d).b());
            Iterator<A6> it = this.f377876a.iterator();
            while (it.hasNext()) {
                it.next().a(th2, c39212w6);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f377877b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }
    }
}
