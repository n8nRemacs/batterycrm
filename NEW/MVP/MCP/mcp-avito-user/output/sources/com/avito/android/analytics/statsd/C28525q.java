package com.avito.android.analytics.statsd;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideHotSwapStatsdEventStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/statsd/q;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/inhouse_transport/u;", "Lcom/avito/android/analytics/statsd/StatsdRecord;", "LX41/o;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.statsd.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28525q implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f91063c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.analytics.inhouse_transport.v<StatsdRecord>> f91064a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91065b;

    /* compiled from: StatsdCommonModule_ProvideHotSwapStatsdEventStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/q$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.statsd.q$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C28525q(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f91064a = provider;
        this.f91065b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f91065b));
        f91063c.getClass();
        int i12 = C28521m.f91059a;
        return new com.avito.android.analytics.inhouse_transport.j(this.f91064a, eVarA);
    }
}
