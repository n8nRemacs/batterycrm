package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.Z0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CartMenuIconViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/O;", "Landroidx/lifecycle/P0$c;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class O implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f176476a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31174q f176477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31164g f176478c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z0 f176479d;

    @Inject
    public O(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C31174q c31174q, @Y61.k InterfaceC31164g interfaceC31164g, @Y61.k Z0 z02) {
        this.f176476a = interfaceC35745a5;
        this.f176477b = c31174q;
        this.f176478c = interfaceC31164g;
        this.f176479d = z02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(N.class)) {
            return new N(this.f176476a, this.f176477b, this.f176478c, this.f176479d);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
