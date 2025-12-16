package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Cj.InterfaceC13310a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconRepository_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/x;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/w;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31180x implements dagger.internal.h<C31179w> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176538e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13310a> f176539a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f176540b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f176541c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.account.E> f176542d;

    /* compiled from: CartMenuIconRepository_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/x$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.x$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31180x(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k H h12, @Y61.k Provider provider3) {
        this.f176539a = provider;
        this.f176540b = provider2;
        this.f176541c = h12;
        this.f176542d = provider3;
    }

    @X41.n
    @Y61.k
    public static final C31180x a(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k H h12, @Y61.k Provider provider3) {
        f176538e.getClass();
        return new C31180x(provider, provider2, h12, provider3);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f176539a);
        InterfaceC35745a5 interfaceC35745a5 = this.f176540b.get();
        F f12 = (F) this.f176541c.get();
        com.avito.android.account.E e12 = this.f176542d.get();
        f176538e.getClass();
        return new C31179w(eVarB, interfaceC35745a5, f12, e12);
    }
}
