package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.service_order_map.serviceordermap.ServiceOrderMapActivityArgs;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/g;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/f;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f278800c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.service_order_map.serviceordermap.domain.a> f278801a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f278802b;

    /* compiled from: ServiceOrderMapBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/g$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f278801a = provider;
        this.f278802b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_order_map.serviceordermap.domain.a aVar = this.f278801a.get();
        ServiceOrderMapActivityArgs serviceOrderMapActivityArgs = (ServiceOrderMapActivityArgs) this.f278802b.f393949a;
        f278800c.getClass();
        return new f(aVar, serviceOrderMapActivityArgs);
    }
}
