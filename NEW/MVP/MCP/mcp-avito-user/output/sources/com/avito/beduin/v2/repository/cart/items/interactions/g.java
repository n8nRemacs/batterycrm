package com.avito.beduin.v2.repository.cart.items.interactions;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.interaction.repository.flow.l;
import com.avito.beduin.v2.interaction.repository.flow.n;
import com.avito.beduin.v2.repository.cart.items.interactions.e;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CartItemsRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/g;", "Lcom/avito/beduin/v2/interaction/repository/flow/n;", "Lcom/avito/beduin/v2/repository/cart/items/interactions/e;", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends n<e> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WU0.a f338147c;

    public g(@Y61.k WU0.a aVar) {
        super(e.a.f338139b);
        this.f338147c = aVar;
    }

    @Override // com.avito.beduin.v2.interaction.repository.flow.n
    public final InterfaceC43160i q(l lVar, C36272i c36272i) {
        return C43175k.d(new f(this, c36272i, null));
    }
}
