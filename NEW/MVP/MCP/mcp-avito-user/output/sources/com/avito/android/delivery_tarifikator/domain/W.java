package com.avito.android.delivery_tarifikator.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/W;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/V;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f135263b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f135264a;

    /* compiled from: TariffProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/W$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W(@Y61.k dagger.internal.u uVar) {
        this.f135264a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h0 h0Var = (h0) this.f135264a.get();
        f135263b.getClass();
        return new V(h0Var);
    }
}
