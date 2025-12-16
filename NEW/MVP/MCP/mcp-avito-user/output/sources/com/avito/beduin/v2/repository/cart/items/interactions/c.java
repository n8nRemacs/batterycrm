package com.avito.beduin.v2.repository.cart.items.interactions;

import Y41.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.d;
import kotlin.Metadata;

/* compiled from: CartItemsRepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/c;", "Lcom/avito/beduin/v2/interaction/repository/flow/d;", "a", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.beduin.v2.interaction.repository.flow.d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f338136d;

    /* compiled from: CartItemsRepositoryGetInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/c$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "<init>", "()V", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f338137b = new a();

        public a() {
            super("CartItems", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.d.a
        @Y61.k
        public final com.avito.beduin.v2.interaction.repository.flow.d c(@Y61.k z zVar, @Y61.k m mVar, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
            return new c(mVar.l(zVar, "itemId"), lVar, lVar2, aVar);
        }
    }

    public c(@Y61.k String str, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
        super(aVar, lVar, lVar2);
        this.f338136d = str;
    }
}
