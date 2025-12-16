package com.avito.android.analytics_adjust;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import uc.InterfaceC49030e;

/* compiled from: SendAnalyticsIdsTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/D;", "Ldagger/internal/h;", "Lcom/avito/android/analytics_adjust/SendAnalyticsIdsTask;", "a", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D implements dagger.internal.h<SendAnalyticsIdsTask> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f91190d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f91191a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC28533a> f91192b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC49030e> f91193c;

    /* compiled from: SendAnalyticsIdsTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/D$a;", "", "<init>", "()V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public D(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f91191a = fVar;
        this.f91192b = provider;
        this.f91193c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f91191a.get();
        InterfaceC28533a interfaceC28533a = this.f91192b.get();
        InterfaceC49030e interfaceC49030e = this.f91193c.get();
        f91190d.getClass();
        return new SendAnalyticsIdsTask(interfaceC28373a, interfaceC28533a, interfaceC49030e);
    }
}
