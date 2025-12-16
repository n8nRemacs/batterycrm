package com.avito.android.publish;

import com.avito.android.publish.PublishSession;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;

/* compiled from: PublishViewModel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class N0 {
    @Y61.k
    public static final PublishSession.StepType a(@Y61.k CategoryPublishStep categoryPublishStep) {
        PublishSession.StepType stepType;
        PublishSession.StepType[] stepTypeArrValues = PublishSession.StepType.values();
        int length = stepTypeArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                stepType = null;
                break;
            }
            stepType = stepTypeArrValues[i12];
            if (kotlin.jvm.internal.L.f(stepType.f232025b, categoryPublishStep.getType())) {
                String subtype = categoryPublishStep.getSubtype();
                if (subtype == null) {
                    subtype = "";
                }
                if (kotlin.jvm.internal.L.f(stepType.f232026c, subtype)) {
                    break;
                }
            }
            i12++;
        }
        return stepType == null ? PublishSession.StepType.f232022x : stepType;
    }
}
