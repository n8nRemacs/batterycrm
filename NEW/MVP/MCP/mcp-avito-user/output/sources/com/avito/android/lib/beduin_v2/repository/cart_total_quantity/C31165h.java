package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CartIconQuantityStream.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/h;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/g;", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/a;", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* renamed from: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31165h implements InterfaceC31164g, InterfaceC31158a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<C31169l> f176502a = new io.reactivex.rxjava3.subjects.e<>();

    @Inject
    public C31165h() {
    }

    @Override // com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31164g
    @Y61.k
    public final C41981q0 a() {
        io.reactivex.rxjava3.subjects.e<C31169l> eVar = this.f176502a;
        eVar.getClass();
        return new C41981q0(eVar);
    }

    @Override // com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31158a
    public final void b(@Y61.k C31169l c31169l) {
        this.f176502a.onNext(c31169l);
    }
}
