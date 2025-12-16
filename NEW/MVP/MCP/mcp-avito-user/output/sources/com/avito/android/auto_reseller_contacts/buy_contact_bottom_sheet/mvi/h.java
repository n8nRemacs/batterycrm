package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi;

import Se.AbstractC15175b;
import com.avito.android.arch.mvi.t;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.entity.BuyContactsInternalActions;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BuyContactsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "LSe/b;", "<init>", "()V", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements t<BuyContactsInternalActions, AbstractC15175b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC15175b b(BuyContactsInternalActions buyContactsInternalActions) {
        BuyContactsInternalActions buyContactsInternalActions2 = buyContactsInternalActions;
        if (buyContactsInternalActions2 instanceof BuyContactsInternalActions.DeeplinkClicked) {
            return new AbstractC15175b.a(((BuyContactsInternalActions.DeeplinkClicked) buyContactsInternalActions2).f95722b);
        }
        return null;
    }
}
