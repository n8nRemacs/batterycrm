package com.avito.android.profile_phones.landline_verification;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.RequestCodeResult;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LandlinePhoneVerificationViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/RequestCodeResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f227237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LandlinePhoneVerificationViewModel f227238c;

    public o(LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel, String str) {
        this.f227237b = str;
        this.f227238c = landlinePhoneVerificationViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = this.f227238c;
        D<LandlinePhoneVerificationViewModel.b> d12 = landlinePhoneVerificationViewModel.f227183P;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                if (error.getError() instanceof ApiError.NetworkIOError) {
                    d12.postValue(new LandlinePhoneVerificationViewModel.b(error.getError().getF244063c(), error.getError(), null, 4, null));
                    return;
                } else {
                    LandlinePhoneVerificationViewModel.ne(landlinePhoneVerificationViewModel, null, error.getError(), 1);
                    return;
                }
            }
            return;
        }
        RequestCodeResult requestCodeResult = (RequestCodeResult) ((TypedResult.Success) typedResult).getResult();
        if (requestCodeResult instanceof RequestCodeResult.VerifyByCall) {
            DeepLink deeplink = ((RequestCodeResult.VerifyByCall) requestCodeResult).getDeeplink();
            LandlinePhoneVerificationLink landlinePhoneVerificationLink = deeplink instanceof LandlinePhoneVerificationLink ? (LandlinePhoneVerificationLink) deeplink : null;
            if (landlinePhoneVerificationLink == null) {
                return;
            }
            PhoneVerificationLinkContext phoneVerificationLinkContext = landlinePhoneVerificationLink.f133914b;
            Integer callId = phoneVerificationLinkContext.getCallId();
            LandlinePhoneVerificationViewModel.ke(landlinePhoneVerificationViewModel, new LandlinePhoneVerificationViewModel.a(callId != null ? callId.intValue() : 0, phoneVerificationLinkContext.getTitle(), phoneVerificationLinkContext.getSubtitle(), phoneVerificationLinkContext.getDescription(), this.f227237b, false, false, 64, null));
            return;
        }
        if (requestCodeResult instanceof RequestCodeResult.Failure) {
            d12.postValue(new LandlinePhoneVerificationViewModel.b(((RequestCodeResult.Failure) requestCodeResult).getMessage(), null, null, 6, null));
            return;
        }
        if (!(requestCodeResult instanceof RequestCodeResult.IncorrectData)) {
            LandlinePhoneVerificationViewModel.ne(landlinePhoneVerificationViewModel, null, null, 3);
            return;
        }
        String str = (String) C42745f0.F(((RequestCodeResult.IncorrectData) requestCodeResult).getMessages().values());
        if (str == null) {
            str = "";
        }
        d12.postValue(new LandlinePhoneVerificationViewModel.b(str, null, null, 6, null));
    }
}
