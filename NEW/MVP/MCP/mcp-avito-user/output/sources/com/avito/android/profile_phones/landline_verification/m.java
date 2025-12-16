package com.avito.android.profile_phones.landline_verification;

import androidx.view.M0;
import androidx.view.P0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationVMFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/m;", "Landroidx/lifecycle/P0$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f227236a;

    @Inject
    public m(@Y61.k j jVar) {
        this.f227236a = jVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(LandlinePhoneVerificationViewModel.class)) {
            return new LandlinePhoneVerificationViewModel(this.f227236a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
