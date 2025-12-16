package com.avito.android.referral_program;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReferralIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_program/d;", "Lcom/avito/android/referral_program/c;", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f252635a;

    @Inject
    public d(@Y61.k Application application) {
        this.f252635a = application;
    }

    @Override // com.avito.android.referral_program.c
    @Y61.k
    public final Intent a(@Y61.k ReferralPageDeepLink referralPageDeepLink) {
        if (referralPageDeepLink == null) {
            throw new NoWhenBranchMatchedException();
        }
        ReferralPageActivity.f252601m.getClass();
        return new Intent(this.f252635a, (Class<?>) ReferralPageActivity.class).putExtra("pagePath", referralPageDeepLink.f252603b).putExtra("screenName", referralPageDeepLink.f252604c).putExtra("scrollOnKeyboardShown", referralPageDeepLink.f252605d);
    }
}
