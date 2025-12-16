package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: PhoneResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAnonymousNumberDialogLink", "Lcom/avito/android/anonymous_number_dialog/AnonymousNumberDialogLink;", "Lcom/avito/android/remote/model/SuccessPhoneResponse;", "_avito-discouraged_avito-api_async-phone"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PhoneResponseKt {
    @l
    public static final AnonymousNumberDialogLink toAnonymousNumberDialogLink(@k SuccessPhoneResponse successPhoneResponse) {
        AnonymousPhoneNumberResponse anonymousNumberModal = successPhoneResponse.getAnonymousNumberModal();
        if (anonymousNumberModal == null) {
            return null;
        }
        String title = anonymousNumberModal.getTitle();
        String description = anonymousNumberModal.getDescription();
        String pictureId = anonymousNumberModal.getPictureId();
        String title2 = anonymousNumberModal.getAction().getTitle();
        DeepLink deepLink = anonymousNumberModal.getAction().getDeepLink();
        SellerSurveyResponse showSurveyAfterCall = successPhoneResponse.getShowSurveyAfterCall();
        return new AnonymousNumberDialogLink(title, description, pictureId, title2, deepLink, showSurveyAfterCall != null ? showSurveyAfterCall.getSellerHashId() : null);
    }
}
