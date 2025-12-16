package com.avito.beduin.v2.repository.cart.items.interactions;

import Y41.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.q;
import kotlin.Metadata;

/* compiled from: CartItemsRepositoryRemoveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/h;", "Lcom/avito/beduin/v2/interaction/repository/flow/q;", "a", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends q {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f338148d;

    /* compiled from: CartItemsRepositoryRemoveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/h$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/q$a;", "<init>", "()V", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f338149b = new a();

        public a() {
            super("CartItems", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.q.a
        public final q c(z zVar, m mVar, Y41.a aVar, l lVar, Y41.a aVar2) {
            return new h(mVar.l(zVar, "itemId"), aVar, lVar, aVar2);
        }
    }

    public h(@Y61.k String str, @Y61.k Y41.a<dU0.f> aVar, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f338148d = str;
    }
}
