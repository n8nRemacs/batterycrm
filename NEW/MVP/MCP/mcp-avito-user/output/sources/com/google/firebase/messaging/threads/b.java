package com.google.firebase.messaging.threads;

import j.N;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.messaging.threads.a f361933a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.google.firebase.messaging.threads.a f361934b = new C10729b();

    /* compiled from: PoolableExecutors.java */
    /* renamed from: com.google.firebase.messaging.threads.b$b, reason: collision with other inner class name */
    public static class C10729b implements com.google.firebase.messaging.threads.a {
        public C10729b() {
        }

        @Override // com.google.firebase.messaging.threads.a
        @N
        public final ExecutorService a(com.google.android.gms.common.util.concurrent.b bVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }
}
