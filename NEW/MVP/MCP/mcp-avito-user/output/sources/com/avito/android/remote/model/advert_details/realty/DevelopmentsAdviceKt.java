package com.avito.android.remote.model.advert_details.realty;

import Y61.k;
import com.avito.android.remote.model.AnalyticsData;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.FormCategory;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: DevelopmentsAdvice.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toConsultationFormData", "Lcom/avito/android/remote/model/ConsultationFormData;", "Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "analyticsData", "Lcom/avito/android/remote/model/AnalyticsData;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class DevelopmentsAdviceKt {
    @k
    @InterfaceC42830m
    public static final ConsultationFormData toConsultationFormData(@k DevelopmentsAdviceView developmentsAdviceView) {
        return new ConsultationFormData(developmentsAdviceView.getTitle(), developmentsAdviceView.getDescription(), null, null, null, null, null, developmentsAdviceView.getButtonTitle(), null, FormCategory.NewBuildings, null, null, 3452, null);
    }

    @k
    public static final ConsultationFormData toConsultationFormData(@k DevelopmentsAdviceView developmentsAdviceView, @k AnalyticsData analyticsData) {
        return new ConsultationFormData(developmentsAdviceView.getTitle(), developmentsAdviceView.getDescription(), null, null, null, null, null, developmentsAdviceView.getButtonTitle(), null, FormCategory.NewBuildings, analyticsData, null, 2428, null);
    }
}
