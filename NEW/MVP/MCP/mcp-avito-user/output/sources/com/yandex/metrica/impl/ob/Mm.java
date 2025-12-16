package com.yandex.metrica.impl.ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class Mm implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f378963b = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f378964a;

    public Mm(String str) {
        this.f378964a = str;
    }

    private String a() {
        StringBuilder sbZ = androidx.appcompat.app.r.z(this.f378964a, "-");
        sbZ.append(f378963b.incrementAndGet());
        return sbZ.toString();
    }

    public static int c() {
        return f378963b.incrementAndGet();
    }

    public Km b() {
        return new Km(a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Lm(runnable, a());
    }

    public static Lm a(String str, Runnable runnable) {
        return new Lm(runnable, new Mm(str).a());
    }
}
