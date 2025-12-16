package com.avito.beduin.v2.repository.cart.items.interactions;

import Y41.l;
import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CartItemsRepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/j;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "a", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends x {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f338151d;

    /* compiled from: CartItemsRepositoryUpdateInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/cart/items/interactions/j$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/x$a;", "<init>", "()V", "cart-items_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends x.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f338152b = new a();

        public a() {
            super("CartItems", null, 2, null);
        }

        public static final YU0.a d(a aVar, com.avito.beduin.v2.engine.field.d dVar, z zVar) {
            aVar.getClass();
            A a12 = dVar.a(zVar);
            if (a12 != null) {
                return new YU0.a(com.avito.beduin.v2.engine.utils.g.b(a12, zVar, "itemId"), new YU0.b(com.avito.beduin.v2.engine.utils.g.a(a12, zVar, "quantity"), Integer.valueOf(com.avito.beduin.v2.engine.utils.g.a(a12, zVar, "maxQuantity"))));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.x.a
        @Y61.k
        public final x c(@Y61.k z zVar, @Y61.k m mVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2) throws BeduinPropertyException {
            List<com.avito.beduin.v2.engine.field.d> list = mVar.d(zVar, "items").f336782b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
                String strP = r.p("items[", i12, ']');
                try {
                    arrayList.add(d(f338152b, dVar, zVar));
                    i12 = i13;
                } catch (Exception e12) {
                    throw new BeduinPropertyException(strP, e12);
                }
            }
            return new j(arrayList, aVar, lVar, aVar2);
        }
    }

    public j(@Y61.k ArrayList arrayList, @Y61.k Y41.a aVar, @Y61.k l lVar, @Y61.l Y41.a aVar2) {
        super(aVar, aVar2, lVar);
        this.f338151d = arrayList;
    }
}
