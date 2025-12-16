package com.avito.beduin.v2.repository.cart.items.interactions;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.repository.cart.items.interactions.c;
import kotlin.Metadata;

/* compiled from: CartItemsRepositoryGetInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/d;", "Lcom/avito/beduin/v2/interaction/repository/flow/h;", "Lcom/avito/beduin/v2/repository/cart/items/interactions/c;", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.beduin.v2.interaction.repository.flow.h<c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WU0.a f338138c;

    public d(@Y61.k WU0.a aVar) {
        super(c.a.f338137b);
        this.f338138c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.h
    public final com.avito.beduin.v2.engine.field.d q(com.avito.beduin.v2.interaction.repository.flow.d dVar, C36272i c36272i) {
        YU0.b bVar = this.f338138c.get(((c) dVar).f338136d);
        return bVar != null ? bVar.a(c36272i) : com.avito.beduin.v2.engine.field.entity.f.f336800b;
    }
}
