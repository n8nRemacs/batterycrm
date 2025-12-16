package com.avito.android.lib.beduin_v2.repository.domain.cart_items;

import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartItemsRepositoryClientImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/g;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/e;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f176558c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<h> f176559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f176560b;

    /* compiled from: CartItemsRepositoryClientImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/g$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k Provider<h> provider, @Y61.k Provider<R0> provider2) {
        this.f176559a = provider;
        this.f176560b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f176559a.get();
        R0 r02 = this.f176560b.get();
        f176558c.getClass();
        return new e(hVar, r02);
    }
}
