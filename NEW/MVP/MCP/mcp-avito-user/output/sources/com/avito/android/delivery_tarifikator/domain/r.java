package com.avito.android.delivery_tarifikator.domain;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationSettingMapperImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/r;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/q;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<C29821q> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f135330c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<U> f135331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135332b;

    /* compiled from: LocationSettingMapperImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/r$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f135331a = provider;
        this.f135332b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U u12 = this.f135331a.get();
        InterfaceC29823t interfaceC29823t = (InterfaceC29823t) this.f135332b.get();
        f135330c.getClass();
        return new C29821q(u12, interfaceC29823t);
    }
}
