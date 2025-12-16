package com.avito.android.analytics.screens.tracker.degrade;

import Y61.k;
import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.F;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import l41.g;
import l41.o;

/* compiled from: DegradeScreenSteps.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/degrade/b;", "", "T", "Lio/reactivex/rxjava3/core/F;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b<T> implements F<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final float f90810b;

    /* compiled from: DegradeScreenSteps.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f90811b;

        public a(AtomicLong atomicLong) {
            this.f90811b = atomicLong;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.time.c.f301452a.getClass();
            this.f90811b.set(com.avito.android.time.c.f301453b.a());
        }
    }

    /* compiled from: DegradeScreenSteps.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.screens.tracker.degrade.b$b, reason: collision with other inner class name */
    public static final class C2682b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f90812b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<T> f90813c;

        public C2682b(AtomicLong atomicLong, b<T> bVar) {
            this.f90812b = atomicLong;
            this.f90813c = bVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            com.avito.android.time.c.f301452a.getClass();
            return z.c0(obj).z(kotlin.math.b.c((com.avito.android.time.c.f301453b.a() - this.f90812b.get()) * this.f90813c.f90810b), TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
        }
    }

    public b(float f12) {
        this.f90810b = f12;
    }

    @Override // io.reactivex.rxjava3.core.F
    @k
    public final E<T> a(@k z<T> zVar) {
        if (this.f90810b == 0.0f) {
            return zVar;
        }
        AtomicLong atomicLong = new AtomicLong();
        return zVar.J(io.reactivex.rxjava3.internal.functions.a.f401993c, new a(atomicLong)).T(new C2682b(atomicLong, this), Integer.MAX_VALUE);
    }
}
