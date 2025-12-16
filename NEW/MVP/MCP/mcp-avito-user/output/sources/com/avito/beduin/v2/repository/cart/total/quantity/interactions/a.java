package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.d;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d;", "a", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends com.avito.beduin.v2.interaction.repository.flow.d {

    /* compiled from: CartTotalQuantityRepositoryGetInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "<init>", "()V", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.repository.cart.total.quantity.interactions.a$a, reason: collision with other inner class name */
    public static final class C10477a extends d.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C10477a f338154b = new C10477a();

        public C10477a() {
            super("CartTotalQuantity", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.d.a
        public final com.avito.beduin.v2.interaction.repository.flow.d c(z zVar, m mVar, l lVar, l lVar2, Y41.a aVar) {
            return new a(aVar, lVar, lVar2);
        }
    }

    public a() {
        throw null;
    }
}
