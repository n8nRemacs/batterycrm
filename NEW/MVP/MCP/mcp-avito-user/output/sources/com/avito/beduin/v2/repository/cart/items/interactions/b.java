package com.avito.beduin.v2.repository.cart.items.interactions;

import com.avito.beduin.v2.interaction.repository.flow.q;
import com.avito.beduin.v2.interaction.repository.flow.u;
import com.avito.beduin.v2.repository.cart.items.interactions.a;
import kotlin.Metadata;

/* compiled from: CartItemsRepositoryClearInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/b;", "Lcom/avito/beduin/v2/interaction/repository/flow/u;", "Lcom/avito/beduin/v2/repository/cart/items/interactions/a;", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends u<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WU0.a f338135c;

    public b(@Y61.k WU0.a aVar) {
        super(a.C10476a.f338134b);
        this.f338135c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.u
    public final void q(q qVar) {
        this.f338135c.clear();
    }
}
