package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Mz0.InterfaceC14550b;
import com.avito.android.arch.mvi.t;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity.MonthSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MonthSelectorOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "LMz0/b;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<MonthSelectorInternalAction, InterfaceC14550b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14550b b(MonthSelectorInternalAction monthSelectorInternalAction) {
        InterfaceC14550b cVar;
        MonthSelectorInternalAction monthSelectorInternalAction2 = monthSelectorInternalAction;
        if (monthSelectorInternalAction2 instanceof MonthSelectorInternalAction.CloseScreen) {
            return InterfaceC14550b.a.f11154a;
        }
        if (monthSelectorInternalAction2 instanceof MonthSelectorInternalAction.PassResult) {
            cVar = new InterfaceC14550b.C0716b(((MonthSelectorInternalAction.PassResult) monthSelectorInternalAction2).f290457b);
        } else {
            if (!(monthSelectorInternalAction2 instanceof MonthSelectorInternalAction.ScrollToPosition)) {
                return null;
            }
            cVar = new InterfaceC14550b.c(((MonthSelectorInternalAction.ScrollToPosition) monthSelectorInternalAction2).f290458b);
        }
        return cVar;
    }
}
