package com.avito.android.analytics.statsd;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdSenderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/Q;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/L;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q implements dagger.internal.h<L> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f91048e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC28520l> f91049a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> f91050b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f91051c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.h> f91052d;

    /* compiled from: StatsdSenderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/Q$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Q(@Y61.k Provider<InterfaceC28520l> provider, @Y61.k Provider<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> provider2, @Y61.k Provider<InterfaceC35745a5> provider3, @Y61.k Provider<com.avito.android.server_time.h> provider4) {
        this.f91049a = provider;
        this.f91050b = provider2;
        this.f91051c = provider3;
        this.f91052d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28520l interfaceC28520l = this.f91049a.get();
        com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar = this.f91050b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f91051c.get();
        com.avito.android.server_time.h hVar = this.f91052d.get();
        f91048e.getClass();
        return new L(interfaceC28520l, uVar, interfaceC35745a5, hVar);
    }
}
