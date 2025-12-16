package com.avito.android.service_order_map.serviceordermap.domain;

import Y61.k;
import com.avito.android.location.find.o;
import com.avito.android.permissions.x;
import dagger.internal.l;
import java.lang.ref.WeakReference;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FindMeUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/g;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/domain/f;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f278661d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<o> f278662a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f278663b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f278664c;

    /* compiled from: FindMeUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/g$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k l lVar, @k l lVar2, @k Provider provider) {
        this.f278662a = provider;
        this.f278663b = lVar;
        this.f278664c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = this.f278662a.get();
        x xVar = (x) this.f278663b.f393949a;
        WeakReference weakReference = (WeakReference) this.f278664c.f393949a;
        f278661d.getClass();
        return new f(oVar, xVar, weakReference);
    }
}
