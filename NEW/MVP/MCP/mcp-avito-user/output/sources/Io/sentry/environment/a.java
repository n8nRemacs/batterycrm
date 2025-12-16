package io.sentry.environment;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SentryEnvironment.java */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<AtomicInteger> f405159a = new C11530a();

    /* renamed from: b, reason: collision with root package name */
    public static final org.slf4j.a f405160b = org.slf4j.b.d(a.class);

    /* compiled from: SentryEnvironment.java */
    /* renamed from: io.sentry.environment.a$a, reason: collision with other inner class name */
    public static class C11530a extends ThreadLocal<AtomicInteger> {
        @Override // java.lang.ThreadLocal
        public final AtomicInteger initialValue() {
            return new AtomicInteger();
        }
    }

    public static boolean a() {
        return f405159a.get().get() > 0;
    }

    public static void b() {
        ThreadLocal<AtomicInteger> threadLocal = f405159a;
        try {
            if (a()) {
                f405160b.f("Thread already managed by Sentry");
            }
        } finally {
            threadLocal.get().incrementAndGet();
        }
    }

    public static void c() {
        ThreadLocal<AtomicInteger> threadLocal = f405159a;
        try {
            if (!a()) {
                b();
                f405160b.f("Thread not yet managed by Sentry");
            }
        } finally {
            if (threadLocal.get().decrementAndGet() == 0) {
                threadLocal.remove();
            }
        }
    }
}
