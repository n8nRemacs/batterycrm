package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Bz0.C13210c;
import Bz0.InterfaceC13208a;
import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.strsellerordersdialog.mvi.entity.StrSellerOrdersDialogInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerOrdersDialogActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBz0/a;", "Lcom/avito/android/str_seller_orders/strsellerordersdialog/mvi/entity/StrSellerOrdersDialogInternalAction;", "LBz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13208a, StrSellerOrdersDialogInternalAction, C13210c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrSellerOrdersDialogInternalAction> b(InterfaceC13208a interfaceC13208a, C13210c c13210c) {
        InterfaceC13208a interfaceC13208a2 = interfaceC13208a;
        if (interfaceC13208a2 instanceof InterfaceC13208a.d) {
            return new C43210w(new StrSellerOrdersDialogInternalAction.InitWithNewDialogData(((InterfaceC13208a.d) interfaceC13208a2).f1828a));
        }
        if (interfaceC13208a2 instanceof InterfaceC13208a.b) {
            return new C43210w(new StrSellerOrdersDialogInternalAction.NotifyOrderClicked(((InterfaceC13208a.b) interfaceC13208a2).f1824a));
        }
        if (interfaceC13208a2 instanceof InterfaceC13208a.C0081a) {
            InterfaceC13208a.C0081a c0081a = (InterfaceC13208a.C0081a) interfaceC13208a2;
            return new C43210w(new StrSellerOrdersDialogInternalAction.NotifyOrderButtonClick(c0081a.f1822b, c0081a.f1821a, c0081a.f1823c));
        }
        if (interfaceC13208a2 instanceof InterfaceC13208a.c.C0082a) {
            return new C43210w(StrSellerOrdersDialogInternalAction.Close.f290150b);
        }
        if (!(interfaceC13208a2 instanceof InterfaceC13208a.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13208a.c.b bVar = (InterfaceC13208a.c.b) interfaceC13208a2;
        return new C43210w(new StrSellerOrdersDialogInternalAction.ShowErrorToast(bVar.f1826a, bVar.f1827b));
    }
}
