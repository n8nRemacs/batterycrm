package com.avito.android.analytics.statsd;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideFileStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/p;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/inhouse_transport/e;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.statsd.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28524p implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f91061b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f91062a;

    /* compiled from: StatsdCommonModule_ProvideFileStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/p$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.statsd.p$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C28524p(@Y61.k dagger.internal.l lVar) {
        this.f91062a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f91062a.f393949a;
        f91061b.getClass();
        int i12 = C28521m.f91059a;
        return new com.avito.android.analytics.inhouse_transport.f("statsd", application);
    }
}
