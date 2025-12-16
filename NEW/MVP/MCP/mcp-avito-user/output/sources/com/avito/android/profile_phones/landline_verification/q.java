package com.avito.android.profile_phones.landline_verification;

import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationViewModel f227240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f227241c;

    public q(LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel, String str) {
        this.f227240b = landlinePhoneVerificationViewModel;
        this.f227241c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f227240b.f227182O.setValue(new LandlinePhoneVerificationViewModel.c.C6901c(this.f227241c, LandlinePhoneVerificationViewModel.ResultStatus.f227193d));
    }
}
