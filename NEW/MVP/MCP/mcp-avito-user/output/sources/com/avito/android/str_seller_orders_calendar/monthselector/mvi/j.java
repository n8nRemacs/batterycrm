package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Lz0.AbstractC14461a;
import Mz0.C14551c;
import Mz0.C14552d;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity.MonthSelectorInternalAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MonthSelectorReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "LMz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<MonthSelectorInternalAction, C14551c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C14551c a(MonthSelectorInternalAction monthSelectorInternalAction, C14551c c14551c) {
        com.avito.conveyor_item.a aVar;
        MonthSelectorInternalAction monthSelectorInternalAction2 = monthSelectorInternalAction;
        C14551c c14551c2 = c14551c;
        if (!(monthSelectorInternalAction2 instanceof MonthSelectorInternalAction.Init)) {
            return c14551c2;
        }
        MonthSelectorInternalAction.Init init = (MonthSelectorInternalAction.Init) monthSelectorInternalAction2;
        List list = init.f290456d;
        if (list == null) {
            list = c14551c2.f11161d;
        }
        String str = init.f290455c;
        C14551c c14551cA = C14551c.a(c14551c2, init.f290454b, str, list, null, 8);
        List<AbstractC14461a> list2 = c14551cA.f11161d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (AbstractC14461a abstractC14461a : list2) {
            if (abstractC14461a instanceof AbstractC14461a.C0655a) {
                AbstractC14461a.C0655a c0655a = (AbstractC14461a.C0655a) abstractC14461a;
                aVar = new com.avito.android.str_seller_orders_calendar.monthselector.items.month.a(c0655a.f10330a, c0655a.f10331b, c0655a.f10332c, c0655a.f10333d);
            } else {
                if (!(abstractC14461a instanceof AbstractC14461a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new com.avito.android.str_seller_orders_calendar.monthselector.items.year.a(((AbstractC14461a.b) abstractC14461a).f10334a);
            }
            arrayList.add(aVar);
        }
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.str_orders_calendar_month_selector_title, new Serializable[0]);
        c14551cA.f11162e.getClass();
        return C14551c.a(c14551cA, null, null, null, new C14552d(printableTextC, arrayList), 7);
    }
}
