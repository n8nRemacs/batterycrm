package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.repository.cart.total.quantity.interactions.a;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/c;", "Lcom/avito/beduin/v2/interaction/repository/flow/f;", "Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/a;", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.beduin.v2.interaction.repository.flow.f<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ZU0.a f338157c;

    public c(@k ZU0.a aVar) {
        super(a.C10477a.f338154b);
        this.f338157c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.f
    public final HV0.c q(com.avito.beduin.v2.interaction.repository.flow.d dVar, l lVar, l lVar2, C36272i c36272i) {
        return this.f338157c.b(lVar, new b(c36272i, lVar2));
    }
}
