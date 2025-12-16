package com.avito.android.delivery_tarifikator.domain;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffUsageCheckerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/b0;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/a0;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b0 implements dagger.internal.h<C29805a0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f135276b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<l0> f135277a;

    /* compiled from: TariffUsageCheckerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/b0$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b0(@Y61.k Provider<l0> provider) {
        this.f135277a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l0 l0Var = this.f135277a.get();
        f135276b.getClass();
        return new C29805a0(l0Var);
    }
}
