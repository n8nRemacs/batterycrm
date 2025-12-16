package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.q;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryRemoveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/g;", "Lcom/avito/beduin/v2/interaction/repository/flow/q;", "a", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends q {

    /* compiled from: CartTotalQuantityRepositoryRemoveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/g$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/q$a;", "<init>", "()V", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338167b = new a();

        public a() {
            super("CartTotalQuantity", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.q.a
        public final q c(z zVar, m mVar, Y41.a aVar, l lVar, Y41.a aVar2) {
            return new g(aVar, aVar2, lVar);
        }
    }

    public g() {
        throw null;
    }
}
