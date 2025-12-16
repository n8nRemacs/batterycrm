package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SaveSettingsUseCaseImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/B;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/A;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f135232d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC24182a> f135233a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135234b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f135235c;

    /* compiled from: SaveSettingsUseCaseImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/B$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public B(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f135233a = provider;
        this.f135234b = lVar;
        this.f135235c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC24182a interfaceC24182a = this.f135233a.get();
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) this.f135234b.f393949a;
        R0 r02 = this.f135235c.get();
        f135232d.getClass();
        return new A(interfaceC24182a, deliveryTarifikatorParams, r02);
    }
}
