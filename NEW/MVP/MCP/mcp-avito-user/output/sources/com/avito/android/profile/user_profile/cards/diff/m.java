package com.avito.android.profile.user_profile.cards.diff;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.service_booking.o;
import com.avito.android.util.M3;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileCardsDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/diff/m;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends C23424o.f<TV0.a> {
    @Inject
    public m() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF85355b() == aVar4.getF85355b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof CardItem.ActiveOrdersWidgetCardItem) && (aVar4 instanceof CardItem.ActiveOrdersWidgetCardItem)) {
            CardItem.ActiveOrdersWidgetCardItem activeOrdersWidgetCardItem = (CardItem.ActiveOrdersWidgetCardItem) aVar4;
            return new com.avito.android.profile.user_profile.cards.active_orders.c(M3.a(new k(aVar3), activeOrdersWidgetCardItem.f224295d), M3.a(new c(aVar3), activeOrdersWidgetCardItem.f224296e), M3.a(new f(aVar3), activeOrdersWidgetCardItem.f224299h), M3.a(new i(aVar3), activeOrdersWidgetCardItem.f224297f), M3.a(new h(aVar3), activeOrdersWidgetCardItem.f224298g), M3.a(new b(aVar3), activeOrdersWidgetCardItem.f224300i));
        }
        if (!(aVar3 instanceof CardItem.ServiceBookingCardItem) || !(aVar4 instanceof CardItem.ServiceBookingCardItem)) {
            return null;
        }
        CardItem.ServiceBookingCardItem serviceBookingCardItem = (CardItem.ServiceBookingCardItem) aVar4;
        return new o(M3.a(new l(aVar3), serviceBookingCardItem.f224561e), M3.a(new j(aVar3), serviceBookingCardItem.f224562f), M3.a(new d(aVar3), serviceBookingCardItem.f224563g), M3.a(new g(aVar3), serviceBookingCardItem.f224565i), M3.a(new a(aVar3), serviceBookingCardItem.f224564h), M3.a(new e(aVar3), Boolean.valueOf(serviceBookingCardItem.f224560d)));
    }
}
