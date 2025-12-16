package com.avito.android.job.cv_info_actualization.mvi;

import TP.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction;
import com.avito.android.job.cv_info_actualization.ui.JsxCvInfoActualizationResult;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "LTP/c;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements t<JsxCvInfoActualizationInternalAction, TP.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f174188b;

    @Inject
    public l(@Y61.l DeepLink deepLink) {
        this.f174188b = deepLink;
    }

    @Override // com.avito.android.arch.mvi.t
    public final TP.c b(JsxCvInfoActualizationInternalAction jsxCvInfoActualizationInternalAction) {
        JsxCvInfoActualizationInternalAction jsxCvInfoActualizationInternalAction2 = jsxCvInfoActualizationInternalAction;
        if (jsxCvInfoActualizationInternalAction2.equals(JsxCvInfoActualizationInternalAction.OnToolbarNavigationClick.f174172b)) {
            return c.a.f15656a;
        }
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.FormSentSuccess) {
            return new c.b(new JsxCvInfoActualizationResult(this.f174188b));
        }
        if (jsxCvInfoActualizationInternalAction2 instanceof JsxCvInfoActualizationInternalAction.FormSentFailure) {
            return new c.C1072c(((JsxCvInfoActualizationInternalAction.FormSentFailure) jsxCvInfoActualizationInternalAction2).f174162c);
        }
        return null;
    }
}
