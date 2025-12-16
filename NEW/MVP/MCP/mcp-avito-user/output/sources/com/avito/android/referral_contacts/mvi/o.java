package com.avito.android.referral_contacts.mvi;

import Ui0.C15525a;
import Ui0.InterfaceC15526b;
import com.avito.android.arch.mvi.u;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReferralContactsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/referral_contacts/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "LUi0/f;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements u<ReferralContactsInternalAction, Ui0.f> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ui0.f a(ReferralContactsInternalAction referralContactsInternalAction, Ui0.f fVar) {
        ReferralContactsInternalAction referralContactsInternalAction2 = referralContactsInternalAction;
        Ui0.f fVar2 = fVar;
        if (!(referralContactsInternalAction2 instanceof ReferralContactsInternalAction.ContentLoaded)) {
            return referralContactsInternalAction2 instanceof ReferralContactsInternalAction.Error ? Ui0.f.a(fVar2, null, null, null, null, InterfaceC15526b.a.f16558a, ((ReferralContactsInternalAction.Error) referralContactsInternalAction2).f252514c, 127) : referralContactsInternalAction2 instanceof ReferralContactsInternalAction.StartLoading ? Ui0.f.a(fVar2, null, null, null, null, InterfaceC15526b.c.f16560a, null, 383) : referralContactsInternalAction2 instanceof ReferralContactsInternalAction.TextChanged ? Ui0.f.a(fVar2, null, ((ReferralContactsInternalAction.TextChanged) referralContactsInternalAction2).f252516b, null, null, null, null, 509) : fVar2;
        }
        ReferralContactsInternalAction.ContentLoaded contentLoaded = (ReferralContactsInternalAction.ContentLoaded) referralContactsInternalAction2;
        return Ui0.f.a(fVar2, contentLoaded.f252510c, null, contentLoaded.f252509b, new C15525a(contentLoaded.f252511d, contentLoaded.f252512e), InterfaceC15526b.C1137b.f16559a, null, 286);
    }
}
