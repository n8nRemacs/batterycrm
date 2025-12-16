package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LottieThreadFactory.java */
/* loaded from: classes10.dex */
public class f implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f60102e = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final ThreadGroup f60103b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f60104c = new AtomicInteger(1);

    /* renamed from: d, reason: collision with root package name */
    public final String f60105d;

    public f() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f60103b = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f60105d = "lottie-" + f60102e.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f60103b, runnable, this.f60105d + this.f60104c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
