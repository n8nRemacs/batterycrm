package com.otaliastudios.transcoder.internal.utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ThreadPool.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/utils/l;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final ThreadPoolExecutor f366222a;

    /* compiled from: ThreadPool.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/otaliastudios/transcoder/internal/utils/l$a", "Ljava/util/concurrent/ThreadFactory;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AtomicInteger f366223b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @Y61.k
        public final Thread newThread(@Y61.k Runnable runnable) {
            return new Thread(runnable, L.j(Integer.valueOf(this.f366223b.getAndIncrement()), "TranscoderThread #"));
        }
    }

    static {
        new l();
        f366222a = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() + 1, Runtime.getRuntime().availableProcessors() + 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    }
}
