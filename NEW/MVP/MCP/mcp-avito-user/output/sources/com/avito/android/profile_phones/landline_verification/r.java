package com.avito.android.profile_phones.landline_verification;

import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationViewModel f227242b;

    public r(LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel) {
        this.f227242b = landlinePhoneVerificationViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        boolean z12 = th2 instanceof ApiException;
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227242b;
        if (z12) {
            ApiError apiError = ((ApiException) th2).f318522b;
            if (apiError instanceof ApiError.NetworkIOError) {
                landlinePhoneVerificationViewModel.f227183P.postValue(new LandlinePhoneVerificationViewModel.b(((ApiError.NetworkIOError) apiError).getF244063c(), null, th2, 2, null));
                return;
            }
        }
        LandlinePhoneVerificationViewModel.ne(landlinePhoneVerificationViewModel, th2, null, 2);
        V2.f318762a.a("DEFAULT_TAG", "Failed to requestManualVerificationCall", th2);
    }
}
