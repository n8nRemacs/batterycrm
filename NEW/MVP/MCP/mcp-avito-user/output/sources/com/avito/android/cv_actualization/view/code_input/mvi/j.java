package com.avito.android.cv_actualization.view.code_input.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import com.avito.android.date_time_formatter.b;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.Metadata;
import qt.c;

/* compiled from: JsxCvActualizationCodeInputReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "Lqt/c;", "<init>", "()V", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements u<JsxCvActualizationCodeInputInternalAction, qt.c> {
    @Inject
    public j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final qt.c a(JsxCvActualizationCodeInputInternalAction jsxCvActualizationCodeInputInternalAction, qt.c cVar) {
        boolean z12 = true;
        JsxCvActualizationCodeInputInternalAction jsxCvActualizationCodeInputInternalAction2 = jsxCvActualizationCodeInputInternalAction;
        qt.c cVar2 = cVar;
        PrintableText printableText = null;
        Object[] objArr = 0;
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.StartingRetry) {
            return qt.c.a(cVar2, null, com.avito.android.printable_text.b.a(), true, 3);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.RetrySuccess) {
            return qt.c.a(cVar2, null, null, false, 7);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.RetryFailureWithBusinessError) {
            return qt.c.a(cVar2, null, com.avito.android.printable_text.b.f(((JsxCvActualizationCodeInputInternalAction.RetryFailureWithBusinessError) jsxCvActualizationCodeInputInternalAction2).f131214c), false, 3);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.RetryFailure) {
            return qt.c.a(cVar2, null, null, false, 7);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.StartingConfirm) {
            return qt.c.a(cVar2, null, com.avito.android.printable_text.b.a(), true, 3);
        }
        if (jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.ConfirmFailureWithBusinessError) {
            return qt.c.a(cVar2, null, com.avito.android.printable_text.b.f(((JsxCvActualizationCodeInputInternalAction.ConfirmFailureWithBusinessError) jsxCvActualizationCodeInputInternalAction2).f131208c), false, 3);
        }
        if (!(jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.TimerTick)) {
            return jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.TimerFinish ? qt.c.a(cVar2, new c.a(z12, printableText, 2, objArr == true ? 1 : 0), null, false, 13) : jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.InputCodeErrorValidation ? qt.c.a(cVar2, null, ((JsxCvActualizationCodeInputInternalAction.InputCodeErrorValidation) jsxCvActualizationCodeInputInternalAction2).f131210b, false, 11) : jsxCvActualizationCodeInputInternalAction2 instanceof JsxCvActualizationCodeInputInternalAction.InputChanged ? qt.c.a(cVar2, null, com.avito.android.printable_text.b.a(), false, 11) : cVar2;
        }
        b.a aVar = com.avito.android.date_time_formatter.b.f132563a;
        long j12 = ((JsxCvActualizationCodeInputInternalAction.TimerTick) jsxCvActualizationCodeInputInternalAction2).f131217b;
        aVar.getClass();
        return qt.c.a(cVar2, new c.a(com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_retry_button_disabled, b.a.a(j12)), false), null, false, 13);
    }
}
