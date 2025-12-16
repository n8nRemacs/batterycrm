package com.avito.android.profile_phones.landline_verification;

import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/e;", "Lru/avito/component/toolbar/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements ru.avito.component.toolbar.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationFragment f227227b;

    public e(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment) {
        this.f227227b = landlinePhoneVerificationFragment;
    }

    @Override // ru.avito.component.toolbar.a
    public final void R() {
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227227b.f227168u0;
        if (landlinePhoneVerificationViewModel == null) {
            landlinePhoneVerificationViewModel = null;
        }
        landlinePhoneVerificationViewModel.f227182O.setValue(LandlinePhoneVerificationViewModel.c.a.f227206a);
    }

    @Override // ru.avito.component.toolbar.a
    public final void u() {
    }
}
