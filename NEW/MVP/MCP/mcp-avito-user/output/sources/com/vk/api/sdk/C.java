package com.vk.api.sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: VKScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/C;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C f366522a = new C();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f366523b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f366524c = C42727D.c(a.f366526l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f366525d = C42727D.c(b.f366527l);

    /* compiled from: VKScheduler.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/os/Handler;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f366526l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* compiled from: VKScheduler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends N implements Y41.a<ExecutorService> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f366527l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(32, new D());
        }
    }

    public static void a(Runnable runnable) {
        if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            f366522a.getClass();
            ((Handler) f366524c.getValue()).postDelayed(runnable, 0L);
        }
    }
}
