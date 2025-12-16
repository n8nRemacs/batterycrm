package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import bV0.C25569a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryClientImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/X;", "LZU0/a;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class X implements ZU0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31174q f176495a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31164g f176496b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f176497c;

    @Inject
    public X(@Y61.k C31174q c31174q, @Y61.k InterfaceC31164g interfaceC31164g, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f176495a = c31174q;
        this.f176496b = interfaceC31164g;
        this.f176497c = interfaceC35745a5;
    }

    @Override // ZU0.a
    public final void a(@Y61.k C25569a c25569a) {
        this.f176495a.f176513a.a(Integer.valueOf(c25569a.f57097a)).i();
    }

    @Override // ZU0.a
    @Y61.k
    public final T b(@Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        return new T(A1.e(g1.a(this.f176495a.b()).z(this.f176497c.a()), lVar, new U(lVar2)));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.lib.beduin_v2.repository.cart_total_quantity.S] */
    @Override // ZU0.a
    @Y61.k
    public final S c(@Y61.k Y41.l lVar) {
        final T tB2 = b(V.f176493l, lVar);
        final io.reactivex.rxjava3.internal.observers.y yVarH = A1.h(this.f176496b.a(), null, new W(lVar), 3);
        return new HV0.c() { // from class: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.S
            @Override // HV0.c
            public final void dispose() {
                tB2.dispose();
                DisposableHelper.a(yVarH);
            }
        };
    }

    @Override // ZU0.a
    public final void clear() {
        F f12 = this.f176495a.f176514b;
        f12.getClass();
        new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31181y(f12, 0)).i();
    }
}
