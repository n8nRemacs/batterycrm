package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.api.remote.model.RatingFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientValidationCoroutineInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField;", "invoke", "(Lcom/avito/android/rating_form/api/remote/model/RatingFormField;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class l extends N implements Y41.l<RatingFormField, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final l f249750l = new l();

    public l() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(RatingFormField ratingFormField) {
        RatingFormField ratingFormField2 = ratingFormField;
        return Boolean.valueOf(ratingFormField2.getSendOnChange() && !ratingFormField2.getDisabled());
    }
}
