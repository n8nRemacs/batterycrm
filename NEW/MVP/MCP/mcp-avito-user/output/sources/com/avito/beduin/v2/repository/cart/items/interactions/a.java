package com.avito.beduin.v2.repository.cart.items.interactions;

import Y41.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.q;
import kotlin.Metadata;

/* compiled from: CartItemsRepositoryClearInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/q;", "a", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends q {

    /* compiled from: CartItemsRepositoryClearInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/q$a;", "<init>", "()V", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.repository.cart.items.interactions.a$a, reason: collision with other inner class name */
    public static final class C10476a extends q.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C10476a f338134b = new C10476a();

        public C10476a() {
            super("CartItems", "Clear");
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.q.a
        public final q c(z zVar, m mVar, Y41.a aVar, l lVar, Y41.a aVar2) {
            return new a(aVar, aVar2, lVar);
        }
    }

    public a() {
        throw null;
    }
}
