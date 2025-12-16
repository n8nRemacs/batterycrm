package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartTotalQuantityRepositoryClientImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/Z;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/X;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Z implements dagger.internal.h<X> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f176498d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31175s f176499a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC31164g> f176500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f176501c;

    /* compiled from: CartTotalQuantityRepositoryClientImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/Z$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Z(@Y61.k C31175s c31175s, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f176499a = c31175s;
        this.f176500b = provider;
        this.f176501c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C31174q c31174q = (C31174q) this.f176499a.get();
        InterfaceC31164g interfaceC31164g = this.f176500b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f176501c.get();
        f176498d.getClass();
        return new X(c31174q, interfaceC31164g, interfaceC35745a5);
    }
}
