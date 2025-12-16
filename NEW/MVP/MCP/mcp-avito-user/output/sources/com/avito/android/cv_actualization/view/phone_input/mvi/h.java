package com.avito.android.cv_actualization.view.phone_input.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.cv_actualization.view.phone_input.mvi.entity.JsxCvActualizationPhoneInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: JsxCvActualizationPhoneInputReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Ltt/c;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements u<JsxCvActualizationPhoneInputInternalAction, tt.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final tt.c a(JsxCvActualizationPhoneInputInternalAction jsxCvActualizationPhoneInputInternalAction, tt.c cVar) {
        JsxCvActualizationPhoneInputInternalAction jsxCvActualizationPhoneInputInternalAction2 = jsxCvActualizationPhoneInputInternalAction;
        tt.c cVar2 = cVar;
        if (jsxCvActualizationPhoneInputInternalAction2.equals(JsxCvActualizationPhoneInputInternalAction.OnToolbarNavigationClick.f131293b)) {
            return tt.c.a(cVar2, null, false, 5);
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.ShowLoading) {
            return tt.c.a(cVar2, null, true, 1);
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.OpenCodeScreen) {
            return tt.c.a(cVar2, null, false, 3);
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.ShowErrorToast) {
            return tt.c.a(cVar2, null, false, 3);
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.ShowBusinessError) {
            return tt.c.a(cVar2, ((JsxCvActualizationPhoneInputInternalAction.ShowBusinessError) jsxCvActualizationPhoneInputInternalAction2).f131297c, false, 2);
        }
        if (jsxCvActualizationPhoneInputInternalAction2 instanceof JsxCvActualizationPhoneInputInternalAction.ShowInputValidationError) {
            return tt.c.a(cVar2, ((JsxCvActualizationPhoneInputInternalAction.ShowInputValidationError) jsxCvActualizationPhoneInputInternalAction2).f131300b, false, 6);
        }
        throw new NoWhenBranchMatchedException();
    }
}
