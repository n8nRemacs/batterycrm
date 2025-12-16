package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y61.k;
import bV0.C25569a;
import com.avito.beduin.v2.interaction.repository.flow.B;
import com.avito.beduin.v2.interaction.repository.flow.x;
import com.avito.beduin.v2.repository.cart.total.quantity.interactions.i;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/j;", "Lcom/avito/beduin/v2/interaction/repository/flow/B;", "Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/i;", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends B<i> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZU0.a f338171c;

    public j(@k ZU0.a aVar) {
        super(i.a.f338170b);
        this.f338171c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.B
    public final void q(x xVar) {
        this.f338171c.a(new C25569a(((i) xVar).f338169d));
    }
}
