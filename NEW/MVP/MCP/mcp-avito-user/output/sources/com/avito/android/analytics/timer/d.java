package com.avito.android.analytics.timer;

import CY.j;
import Y61.k;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: AnalyticsTimer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/timer/d;", "T", "Lcom/avito/android/analytics/timer/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d<T> implements a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.a f91110a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<f> f91111b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<e<T>> f91112c;

    public d(@k com.avito.android.server_time.a aVar, @k j jVar) {
        this.f91110a = aVar;
        io.reactivex.rxjava3.subjects.e<f> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f91111b = eVar;
        io.reactivex.rxjava3.subjects.e<e<T>> eVar2 = new io.reactivex.rxjava3.subjects.e<>();
        this.f91112c = eVar2;
        z.K0(eVar, eVar2, new b(0)).t0(new c(jVar));
    }

    @Override // com.avito.android.analytics.timer.a
    public final void a() {
        this.f91110a.getClass();
        this.f91111b.onNext(new f(System.currentTimeMillis(), null));
    }

    @Override // com.avito.android.analytics.timer.a
    public final void b(T t12) {
        this.f91110a.getClass();
        this.f91112c.onNext(new e<>(System.currentTimeMillis(), t12));
    }
}
