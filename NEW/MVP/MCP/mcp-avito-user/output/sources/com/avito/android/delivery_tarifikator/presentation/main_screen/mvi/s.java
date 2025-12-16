package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorMainBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/s;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/r;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f135718e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135719a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135720b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<Mv.e> f135721c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<Mv.i> f135722d;

    /* compiled from: TarifikatorMainBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/s$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f135719a = lVar;
        this.f135720b = uVar;
        this.f135721c = provider;
        this.f135722d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) this.f135719a.f393949a;
        com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e eVar = (com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e) this.f135720b.get();
        Mv.e eVar2 = this.f135721c.get();
        Mv.i iVar = this.f135722d.get();
        f135718e.getClass();
        return new r(deliveryTarifikatorParams, eVar, eVar2, iVar);
    }
}
