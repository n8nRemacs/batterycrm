package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import yt.AbstractC50298b;

/* compiled from: JsxActualizationBottomSheetOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "Lyt/b;", "<init>", "()V", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<JsxActualizationBottomSheetInternalAction, AbstractC50298b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC50298b b(JsxActualizationBottomSheetInternalAction jsxActualizationBottomSheetInternalAction) {
        JsxActualizationBottomSheetInternalAction jsxActualizationBottomSheetInternalAction2 = jsxActualizationBottomSheetInternalAction;
        if (jsxActualizationBottomSheetInternalAction2 instanceof JsxActualizationBottomSheetInternalAction.CloseFlow) {
            return AbstractC50298b.a.f443558a;
        }
        if (jsxActualizationBottomSheetInternalAction2 instanceof JsxActualizationBottomSheetInternalAction.SetResult) {
            return new AbstractC50298b.C12927b(((JsxActualizationBottomSheetInternalAction.SetResult) jsxActualizationBottomSheetInternalAction2).f131515b);
        }
        return null;
    }
}
