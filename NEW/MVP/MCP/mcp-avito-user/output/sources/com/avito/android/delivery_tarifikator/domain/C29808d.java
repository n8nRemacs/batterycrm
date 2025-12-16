package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CustomTariffsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/d;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29808d implements dagger.internal.h<C29806b> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f135278f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC24182a> f135279a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135280b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f135281c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<h0> f135282d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<x0> f135283e;

    /* compiled from: CustomTariffsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/d$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29808d(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4) {
        this.f135279a = provider;
        this.f135280b = lVar;
        this.f135281c = provider2;
        this.f135282d = provider3;
        this.f135283e = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC24182a interfaceC24182a = this.f135279a.get();
        DeliveryTarifikatorParams deliveryTarifikatorParams = (DeliveryTarifikatorParams) this.f135280b.f393949a;
        R0 r02 = this.f135281c.get();
        h0 h0Var = this.f135282d.get();
        x0 x0Var = this.f135283e.get();
        f135278f.getClass();
        return new C29806b(interfaceC24182a, deliveryTarifikatorParams, r02, h0Var, x0Var);
    }
}
