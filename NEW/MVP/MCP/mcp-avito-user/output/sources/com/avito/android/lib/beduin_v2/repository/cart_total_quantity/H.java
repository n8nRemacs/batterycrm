package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconStorage_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/H;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/F;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class H implements dagger.internal.h<F> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176450c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC31158a> f176452b;

    /* compiled from: CartMenuIconStorage_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/H$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public H(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        this.f176451a = uVar;
        this.f176452b = provider;
    }

    @X41.n
    @Y61.k
    public static final H a(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider) {
        f176450c.getClass();
        return new H(uVar, provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f176451a.get();
        InterfaceC31158a interfaceC31158a = this.f176452b.get();
        f176450c.getClass();
        return new F(lVar, interfaceC31158a);
    }
}
