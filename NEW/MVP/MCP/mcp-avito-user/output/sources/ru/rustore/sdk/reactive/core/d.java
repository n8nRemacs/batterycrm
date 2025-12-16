package ru.rustore.sdk.reactive.core;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.N;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/core/d;", "", "<init>", "()V", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f436864a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436865b = C42727D.c(c.f436871l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436866c = C42727D.c(C12585d.f436872l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436867d = C42727D.c(b.f436870l);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f436868e = C42727D.c(a.f436869l);

    /* compiled from: Dispatchers.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"ru/rustore/sdk/reactive/core/c", "invoke", "()Lru/rustore/sdk/reactive/core/c;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class a extends N implements Y41.a<ru.rustore.sdk.reactive.core.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f436869l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final ru.rustore.sdk.reactive.core.c invoke() {
            return new ru.rustore.sdk.reactive.core.c();
        }
    }

    /* compiled from: Dispatchers.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"ru/rustore/sdk/reactive/core/e", "invoke", "()Lru/rustore/sdk/reactive/core/e;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class b extends N implements Y41.a<e> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f436870l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            return new e(new Handler(Looper.getMainLooper()));
        }
    }

    /* compiled from: Dispatchers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ScheduledThreadPoolExecutor> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f436871l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ScheduledThreadPoolExecutor invoke() {
            return new ScheduledThreadPoolExecutor(1);
        }
    }

    /* compiled from: Dispatchers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.core.d$d, reason: collision with other inner class name */
    public static final class C12585d extends N implements Y41.a<ThreadPoolExecutor> {

        /* renamed from: l, reason: collision with root package name */
        public static final C12585d f436872l = new C12585d();

        public C12585d() {
            super(0);
        }

        @Override // Y41.a
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    static {
        C42754k<Y41.a<G0>> c42754k = l.f436878a;
    }

    @Y61.k
    public static ru.rustore.sdk.reactive.core.a a() {
        synchronized (f.f436874a) {
        }
        return (ru.rustore.sdk.reactive.core.a) f436868e.getValue();
    }
}
