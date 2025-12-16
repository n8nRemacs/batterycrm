package com.avito.android.analytics.statsd;

import com.avito.android.InterfaceC32900o;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdKeyFactoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/H;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/G;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f91034c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f91035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91036b;

    /* compiled from: StatsdKeyFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/H$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f91035a = provider;
        this.f91036b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f91035a.get();
        InterfaceC32900o interfaceC32900o = (InterfaceC32900o) this.f91036b.get();
        f91034c.getClass();
        return new G(c12, interfaceC32900o);
    }
}
