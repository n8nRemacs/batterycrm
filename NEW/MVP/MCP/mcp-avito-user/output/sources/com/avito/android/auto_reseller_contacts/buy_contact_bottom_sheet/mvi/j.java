package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi;

import Se.C15176c;
import com.avito.android.arch.mvi.u;
import com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet.mvi.entity.BuyContactsInternalActions;
import com.avito.android.remote.model.auto_contact_models.Benefit;
import com.avito.android.remote.model.auto_contact_models.ContactPackageModal;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: BuyContactsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/auto_reseller_contacts/buy_contact_bottom_sheet/mvi/entity/BuyContactsInternalActions;", "LSe/c;", "<init>", "()V", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<BuyContactsInternalActions, C15176c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C15176c a(BuyContactsInternalActions buyContactsInternalActions, C15176c c15176c) {
        BuyContactsInternalActions buyContactsInternalActions2 = buyContactsInternalActions;
        C15176c c15176c2 = c15176c;
        if (!(buyContactsInternalActions2 instanceof BuyContactsInternalActions.ShowInitialData)) {
            return c15176c2;
        }
        ContactPackageModal contactPackageModal = ((BuyContactsInternalActions.ShowInitialData) buyContactsInternalActions2).f95723b.f95706b;
        String benefitsTitle = contactPackageModal.getBenefitsTitle();
        List<Benefit> benefits = contactPackageModal.getBenefits();
        if (benefits == null) {
            benefits = C42784z0.f406748b;
        }
        return new C15176c(benefitsTitle, benefits, contactPackageModal.getButton(), contactPackageModal.getDescription(), contactPackageModal.getFooterText());
    }
}
