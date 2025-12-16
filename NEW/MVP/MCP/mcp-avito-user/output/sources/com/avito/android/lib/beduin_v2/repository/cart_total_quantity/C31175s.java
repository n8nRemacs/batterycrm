package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconInteractor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/s;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/q;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31175s implements dagger.internal.h<C31174q> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176520e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31180x f176521a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<F> f176522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.account.E> f176523c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f176524d;

    /* compiled from: CartMenuIconInteractor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/s$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.s$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31175s(@Y61.k C31180x c31180x, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f176521a = c31180x;
        this.f176522b = provider;
        this.f176523c = provider2;
        this.f176524d = provider3;
    }

    @X41.n
    @Y61.k
    public static final C31175s a(@Y61.k C31180x c31180x, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        f176520e.getClass();
        return new C31175s(c31180x, provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C31179w c31179w = (C31179w) this.f176521a.get();
        F f12 = this.f176522b.get();
        com.avito.android.account.E e12 = this.f176523c.get();
        R0 r02 = this.f176524d.get();
        f176520e.getClass();
        return new C31174q(c31179w, f12, e12, r02);
    }
}
