package com.huawei.updatesdk.b.g;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f363854a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f363855b;

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f363856a = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        private String f363857b;

        public a(String str) {
            this.f363857b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f363857b + "#" + this.f363856a.incrementAndGet());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f363854a = new ThreadPoolExecutor(2, 2, 10L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-ServerTask"));
        f363855b = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-CheckTask"));
    }
}
