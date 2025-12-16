package com.avito.android.cv_actualization.view.code_input.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import qt.b;

/* compiled from: JsxCvActualizationCodeInputOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "Lqt/b;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<JsxCvActualizationCodeInputInternalAction, qt.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final qt.b b(JsxCvActualizationCodeInputInternalAction jsxCvActualizationCodeInputInternalAction) {
        JsxCvActualizationCodeInputInternalAction jsxCvActualizationCodeInputInternalAction2 = jsxCvActualizationCodeInputInternalAction;
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.RetryFailure) {
            return new b.c(com.avito.android.printable_text.b.f(((JsxCvActualizationCodeInputInternalAction.RetryFailure) jsxCvActualizationCodeInputInternalAction2).f131212c));
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.ConfirmSuccess) {
            return new b.a(((JsxCvActualizationCodeInputInternalAction.ConfirmSuccess) jsxCvActualizationCodeInputInternalAction2).f131209b);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.ConfirmFailure) {
            return new b.c(com.avito.android.printable_text.b.f(null));
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.BackClicked) {
            return b.e.f429388a;
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.ScreenOpened) {
            return b.d.f429387a;
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.StartingRetry ? true : jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.StartingConfirm) {
            return b.C12338b.f429385a;
        }
        return null;
    }
}
