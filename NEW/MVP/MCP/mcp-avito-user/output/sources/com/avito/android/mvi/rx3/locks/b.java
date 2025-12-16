package com.avito.android.mvi.rx3.locks;

import io.reactivex.rxjava3.core.H;
import java.util.concurrent.ForkJoinPool;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ForkJoinCommonPoolScheduler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/b;", "", "<init>", "()V", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f207036a = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f207037b = C42727D.c(a.f207038l);

    /* compiled from: ForkJoinCommonPoolScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/H;", "Lj41/e;", "kotlin.jvm.PlatformType", "invoke", "()Lio/reactivex/rxjava3/core/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<H> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f207038l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final H invoke() {
            ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
            H h12 = io.reactivex.rxjava3.schedulers.b.f404941a;
            return new io.reactivex.rxjava3.internal.schedulers.d(forkJoinPoolCommonPool, false, false);
        }
    }
}
