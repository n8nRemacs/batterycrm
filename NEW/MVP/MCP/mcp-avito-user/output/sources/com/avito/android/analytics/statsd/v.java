package com.avito.android.analytics.statsd;

import Ec.InterfaceC13473b;
import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.statsd.z;
import com.avito.android.di.module.P9;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdCommonModule_ProvideStatsdEventTrackerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/v;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/statsd/z;", "a", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<z> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f91079h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.analytics.inhouse_transport.u<StatsdRecord>> f91080a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final P9 f91081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f91082c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13473b> f91083d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f91084e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f91085f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.h> f91086g;

    /* compiled from: StatsdCommonModule_ProvideStatsdEventTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/v$a;", "", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(@Y61.k Provider provider, @Y61.k P9 p92, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider5) {
        this.f91080a = provider;
        this.f91081b = p92;
        this.f91082c = provider2;
        this.f91083d = provider3;
        this.f91084e = provider4;
        this.f91085f = uVar;
        this.f91086g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.inhouse_transport.u<StatsdRecord> uVar = this.f91080a.get();
        com.avito.android.analytics.inhouse_transport.k kVar = (com.avito.android.analytics.inhouse_transport.k) this.f91081b.get();
        C c12 = this.f91082c.get();
        InterfaceC13473b interfaceC13473b = this.f91083d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f91084e.get();
        InterfaceC32896n interfaceC32896n = (InterfaceC32896n) this.f91085f.get();
        com.avito.android.server_time.h hVar = this.f91086g.get();
        f91079h.getClass();
        int i12 = C28521m.f91059a;
        E.f91028a.getClass();
        return new z(uVar, kVar, c12, new z.a(E.f91029b, interfaceC32896n.o().invoke().booleanValue()), interfaceC13473b, interfaceC35745a5, hVar);
    }
}
