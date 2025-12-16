package com.avito.android.service_order_map.serviceordermap.link;

import Y61.k;
import android.app.Application;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/link/b;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/link/a;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements h<com.avito.android.service_order_map.serviceordermap.link.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f278715e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f278716a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f278717b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f278718c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f278719d;

    /* compiled from: ServiceOrderMapDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/link/b$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k l lVar, @k dv.b bVar, @k dv.b bVar2, @k Provider provider) {
        this.f278716a = lVar;
        this.f278717b = bVar;
        this.f278718c = bVar2;
        this.f278719d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f278716a.f393949a;
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f278717b.get();
        a.b bVar = (a.b) this.f278718c.get();
        R0 r02 = this.f278719d.get();
        f278715e.getClass();
        return new com.avito.android.service_order_map.serviceordermap.link.a(application, interfaceC4053a, bVar, r02);
    }
}
