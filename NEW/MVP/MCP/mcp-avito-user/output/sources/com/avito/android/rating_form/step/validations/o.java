package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExperienceValidationCoroutineInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/validations/o;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface o {
    @Y61.l
    FieldIdentifier a(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k List<RatingFormField> list);

    @Y61.l
    LinkedHashMap b(@Y61.k List list);
}
