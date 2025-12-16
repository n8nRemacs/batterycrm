package com.avito.android.cv_actualization.view.phone_select.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vt.C49380c;

/* compiled from: JsxCvActualizationPhoneSelectReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lvt/c;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<JsxCvActualizationPhoneSelectInternalAction, C49380c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49380c a(JsxCvActualizationPhoneSelectInternalAction jsxCvActualizationPhoneSelectInternalAction, C49380c c49380c) {
        JsxCvActualizationPhoneSelectInternalAction jsxCvActualizationPhoneSelectInternalAction2 = jsxCvActualizationPhoneSelectInternalAction;
        C49380c c49380c2 = c49380c;
        return jsxCvActualizationPhoneSelectInternalAction2 instanceof JsxCvActualizationPhoneSelectInternalAction.ContentLoaded ? C49380c.a(c49380c2, false, false, ((JsxCvActualizationPhoneSelectInternalAction.ContentLoaded) jsxCvActualizationPhoneSelectInternalAction2).f131361b, 2) : jsxCvActualizationPhoneSelectInternalAction2 instanceof JsxCvActualizationPhoneSelectInternalAction.ErrorLoadedContent ? C49380c.a(c49380c2, false, true, null, 4) : jsxCvActualizationPhoneSelectInternalAction2 instanceof JsxCvActualizationPhoneSelectInternalAction.ShowInitialLoading ? C49380c.a(c49380c2, true, false, null, 4) : c49380c2;
    }
}
