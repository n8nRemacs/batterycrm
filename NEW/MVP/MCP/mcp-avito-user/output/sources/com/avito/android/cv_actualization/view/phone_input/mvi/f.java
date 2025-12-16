package com.avito.android.cv_actualization.view.phone_input.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.cv_actualization.view.phone_input.mvi.entity.JsxCvActualizationPhoneInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import tt.AbstractC48714b;

/* compiled from: JsxCvActualizationPhoneInputOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Ltt/b;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements t<JsxCvActualizationPhoneInputInternalAction, AbstractC48714b> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131301b;

    @Inject
    public f(boolean z12) {
        this.f131301b = z12;
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC48714b b(JsxCvActualizationPhoneInputInternalAction jsxCvActualizationPhoneInputInternalAction) {
        AbstractC48714b cVar;
        JsxCvActualizationPhoneInputInternalAction jsxCvActualizationPhoneInputInternalAction2 = jsxCvActualizationPhoneInputInternalAction;
        if (jsxCvActualizationPhoneInputInternalAction2.equals(JsxCvActualizationPhoneInputInternalAction.OnToolbarNavigationClick.f131293b)) {
            return this.f131301b ? AbstractC48714b.a.f439619a : AbstractC48714b.d.f439623a;
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.OpenCodeScreen) {
            JsxCvActualizationPhoneInputInternalAction.OpenCodeScreen openCodeScreen = (JsxCvActualizationPhoneInputInternalAction.OpenCodeScreen) jsxCvActualizationPhoneInputInternalAction2;
            cVar = new AbstractC48714b.C12690b(openCodeScreen.f131294b, openCodeScreen.f131295c);
        } else {
            if (!(jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.ShowErrorToast)) {
                return null;
            }
            cVar = new AbstractC48714b.c(((JsxCvActualizationPhoneInputInternalAction.ShowErrorToast) jsxCvActualizationPhoneInputInternalAction2).f131299c);
        }
        return cVar;
    }
}
