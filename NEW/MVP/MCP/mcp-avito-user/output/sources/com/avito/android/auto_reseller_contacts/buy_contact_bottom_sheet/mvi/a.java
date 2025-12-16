package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi;

import Se.C15176c;
import Se.InterfaceC15174a;
import com.avito.android.arch.mvi.a;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.entity.BuyContactsInternalActions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BuyContactsActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LSe/a;", "Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "LSe/c;", "<init>", "()V", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15174a, BuyContactsInternalActions, C15176c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BuyContactsInternalActions> b(InterfaceC15174a interfaceC15174a, C15176c c15176c) {
        InterfaceC15174a interfaceC15174a2 = interfaceC15174a;
        if (interfaceC15174a2 instanceof InterfaceC15174a.C1027a) {
            return new C43210w(new BuyContactsInternalActions.DeeplinkClicked(((InterfaceC15174a.C1027a) interfaceC15174a2).f15096a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
