package com.avito.beduin.v2.repository.cart.total.quantity.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.x;
import kotlin.Metadata;

/* compiled from: CartTotalQuantityRepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/i;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "a", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends x {

    /* renamed from: d, reason: collision with root package name */
    public final int f338169d;

    /* compiled from: CartTotalQuantityRepositoryUpdateInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/total/quantity/interactions/i$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/x$a;", "<init>", "()V", "cart-total-quantity_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends x.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338170b = new a();

        public a() {
            super("CartTotalQuantity", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.x.a
        @k
        public final x c(@k z zVar, @k m mVar, @k Y41.a<dU0.f> aVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2) {
            return new i(mVar.h(zVar, "quantity"), aVar, lVar, aVar2);
        }
    }

    public i(int i12, @k Y41.a<dU0.f> aVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f338169d = i12;
    }
}
