package com.avito.android.analytics.statsd;

import com.avito.android.G2;
import com.avito.android.analytics.statsd.C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideStatsdEventValidatorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/w;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/C;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements dagger.internal.h<C> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f91087b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91088a;

    /* compiled from: StatsdCommonModule_ProvideStatsdEventValidatorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/w$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k dagger.internal.u uVar) {
        this.f91088a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G2 g22 = (G2) this.f91088a.get();
        f91087b.getClass();
        int i12 = C28521m.f91059a;
        return g22.d().invoke().booleanValue() ? new C.a() : new C.b();
    }
}
