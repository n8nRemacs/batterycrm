package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.avito.android.Z0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartMenuIconViewModelFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/P;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/O;", "a", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f176480e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35745a5> f176481a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31175s f176482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176483c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f176484d;

    /* compiled from: CartMenuIconViewModelFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/P$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P(@Y61.k Provider provider, @Y61.k C31175s c31175s, @Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2) {
        this.f176481a = provider;
        this.f176482b = c31175s;
        this.f176483c = uVar;
        this.f176484d = uVar2;
    }

    @X41.n
    @Y61.k
    public static final P a(@Y61.k Provider provider, @Y61.k C31175s c31175s, @Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2) {
        f176480e.getClass();
        return new P(provider, c31175s, uVar, uVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f176481a.get();
        C31174q c31174q = (C31174q) this.f176482b.get();
        InterfaceC31164g interfaceC31164g = (InterfaceC31164g) this.f176483c.get();
        Z0 z02 = (Z0) this.f176484d.get();
        f176480e.getClass();
        return new O(interfaceC35745a5, c31174q, interfaceC31164g, z02);
    }
}
