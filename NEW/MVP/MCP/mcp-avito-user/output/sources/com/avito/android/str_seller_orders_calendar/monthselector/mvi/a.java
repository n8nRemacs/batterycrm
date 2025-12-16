package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Mz0.C14551c;
import Mz0.InterfaceC14549a;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity.MonthSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MonthSelectorActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LMz0/a;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "LMz0/c;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14549a, MonthSelectorInternalAction, C14551c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MonthSelectorInternalAction> b(InterfaceC14549a interfaceC14549a, C14551c c14551c) {
        InterfaceC14549a interfaceC14549a2 = interfaceC14549a;
        if (interfaceC14549a2 instanceof InterfaceC14549a.C0715a) {
            return new C43210w(MonthSelectorInternalAction.CloseScreen.f290453b);
        }
        if (interfaceC14549a2 instanceof InterfaceC14549a.b) {
            return new C43210w(new MonthSelectorInternalAction.PassResult(((InterfaceC14549a.b) interfaceC14549a2).f11153a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
