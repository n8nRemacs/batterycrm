package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y61.k;
import com.avito.beduin.v2.interaction.repository.flow.q;
import com.avito.beduin.v2.interaction.repository.flow.u;
import com.avito.beduin.v2.repository.cart.total.quantity.interactions.g;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryRemoveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/h;", "Lcom/avito/beduin/v2/interaction/repository/flow/u;", "Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/g;", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends u<g> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZU0.a f338168c;

    public h(@k ZU0.a aVar) {
        super(g.a.f338167b);
        this.f338168c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.u
    public final void q(q qVar) {
        this.f338168c.clear();
    }
}
