package com.avito.android.referral_contacts.mvi;

import Ui0.e;
import com.avito.android.arch.mvi.t;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReferralContactsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/referral_contacts/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "LUi0/e;", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements t<ReferralContactsInternalAction, Ui0.e> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ui0.e b(ReferralContactsInternalAction referralContactsInternalAction) {
        if (referralContactsInternalAction instanceof ReferralContactsInternalAction.Close) {
            return e.a.f16568a;
        }
        return null;
    }
}
