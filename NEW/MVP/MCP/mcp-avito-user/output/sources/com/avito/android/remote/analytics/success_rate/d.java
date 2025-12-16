package com.avito.android.remote.analytics.success_rate;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.B;
import com.avito.android.remote.analytics.image.q;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkRequestsSuccessRateAnalyticsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/d;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/success_rate/c;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class d implements h<c> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f253254e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f253255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f253256b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<B> f253257c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<q> f253258d;

    /* compiled from: NetworkRequestsSuccessRateAnalyticsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/d$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dagger.internal.f fVar, @k Provider provider, @k Provider provider2, @k Provider provider3) {
        this.f253255a = fVar;
        this.f253256b = provider;
        this.f253257c = provider2;
        this.f253258d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f253255a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f253256b.get();
        B b12 = this.f253257c.get();
        q qVar = this.f253258d.get();
        f253254e.getClass();
        return new c(interfaceC28373a, interfaceC35745a5, b12, qVar);
    }
}
