package com.avito.android.delivery_tarifikator.domain;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorSettingsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/r0;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/q0;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r0 implements dagger.internal.h<q0> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f135333e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC29820p> f135334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<l0> f135335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<U> f135337d;

    /* compiled from: TarifikatorSettingsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/r0$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r0(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f135334a = provider;
        this.f135335b = provider2;
        this.f135336c = uVar;
        this.f135337d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC29820p interfaceC29820p = this.f135334a.get();
        l0 l0Var = this.f135335b.get();
        t0 t0Var = (t0) this.f135336c.get();
        U u12 = this.f135337d.get();
        f135333e.getClass();
        return new q0(interfaceC29820p, l0Var, t0Var, u12);
    }
}
