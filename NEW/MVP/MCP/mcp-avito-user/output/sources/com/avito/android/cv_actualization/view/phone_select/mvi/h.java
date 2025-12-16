package com.avito.android.cv_actualization.view.phone_select.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vt.AbstractC49379b;

/* compiled from: JsxCvActualizationPhoneSelectOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lvt/b;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<JsxCvActualizationPhoneSelectInternalAction, AbstractC49379b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC49379b b(JsxCvActualizationPhoneSelectInternalAction jsxCvActualizationPhoneSelectInternalAction) {
        JsxCvActualizationPhoneSelectInternalAction jsxCvActualizationPhoneSelectInternalAction2 = jsxCvActualizationPhoneSelectInternalAction;
        if (jsxCvActualizationPhoneSelectInternalAction2 instanceof JsxCvActualizationPhoneSelectInternalAction.ShowPhoneInput) {
            return new AbstractC49379b.c(((JsxCvActualizationPhoneSelectInternalAction.ShowPhoneInput) jsxCvActualizationPhoneSelectInternalAction2).f131365b);
        }
        if (jsxCvActualizationPhoneSelectInternalAction2 instanceof JsxCvActualizationPhoneSelectInternalAction.PhoneUpdatedSuccess) {
            return new AbstractC49379b.C12797b(((JsxCvActualizationPhoneSelectInternalAction.PhoneUpdatedSuccess) jsxCvActualizationPhoneSelectInternalAction2).f131364b);
        }
        if (jsxCvActualizationPhoneSelectInternalAction2.equals(JsxCvActualizationPhoneSelectInternalAction.PhoneUpdateFailure.f131363b)) {
            return AbstractC49379b.a.f441029a;
        }
        return null;
    }
}
