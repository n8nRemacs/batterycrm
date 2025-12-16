package com.avito.android.analytics.statsd;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideOnDiskStatsdEventStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/statsd/s;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/inhouse_transport/x;", "Lcom/avito/android/analytics/statsd/StatsdRecord;", "LX41/o;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.x<StatsdRecord>> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f91067e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.analytics.inhouse_transport.e> f91068a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.analytics.inhouse_transport.l> f91069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91070c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35863o4> f91071d;

    /* compiled from: StatsdCommonModule_ProvideOnDiskStatsdEventStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/s$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f91068a = provider;
        this.f91069b = provider2;
        this.f91070c = uVar;
        this.f91071d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.inhouse_transport.e eVar = this.f91068a.get();
        com.avito.android.analytics.inhouse_transport.l lVar = this.f91069b.get();
        com.avito.android.analytics.inhouse_transport.c cVar = (com.avito.android.analytics.inhouse_transport.c) this.f91070c.get();
        InterfaceC35863o4 interfaceC35863o4 = this.f91071d.get();
        f91067e.getClass();
        int i12 = C28521m.f91059a;
        return new com.avito.android.analytics.inhouse_transport.x(eVar, lVar, cVar, interfaceC35863o4);
    }
}
