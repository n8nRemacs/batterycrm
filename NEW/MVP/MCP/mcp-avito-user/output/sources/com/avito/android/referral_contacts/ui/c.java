package com.avito.android.referral_contacts.ui;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReferralContactsIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/ui/c;", "Lcom/avito/android/referral_contacts/ui/b;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f252588a;

    @Inject
    public c(@k Context context) {
        this.f252588a = context;
    }

    @Override // com.avito.android.referral_contacts.ui.b
    @k
    public final Intent a() {
        ReferralContactsActivity.f252574r.getClass();
        return new Intent(this.f252588a, (Class<?>) ReferralContactsActivity.class);
    }
}
