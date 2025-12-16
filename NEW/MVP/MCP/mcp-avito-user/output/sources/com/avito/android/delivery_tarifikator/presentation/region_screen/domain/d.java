package com.avito.android.delivery_tarifikator.presentation.region_screen.domain;

import Y61.k;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29815k;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29828y;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorRegionScreenInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/domain/d;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/domain/c;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f135786c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC29815k> f135787a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f135788b;

    /* compiled from: TarifikatorRegionScreenInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/domain/d$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k u uVar, @k Provider provider) {
        this.f135787a = provider;
        this.f135788b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29815k interfaceC29815k = this.f135787a.get();
        InterfaceC29828y interfaceC29828y = (InterfaceC29828y) this.f135788b.get();
        f135786c.getClass();
        return new c(interfaceC29815k, interfaceC29828y);
    }
}
