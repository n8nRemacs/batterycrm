package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult;
import javax.inject.Inject;
import kotlin.Metadata;
import yt.C50299c;

/* compiled from: JsxActualizationBottomSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "Lyt/c;", "<init>", "()V", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<JsxActualizationBottomSheetInternalAction, C50299c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50299c a(JsxActualizationBottomSheetInternalAction jsxActualizationBottomSheetInternalAction, C50299c c50299c) {
        JsxActualizationBottomSheetInternalAction jsxActualizationBottomSheetInternalAction2 = jsxActualizationBottomSheetInternalAction;
        C50299c c50299c2 = c50299c;
        if (jsxActualizationBottomSheetInternalAction2 instanceof JsxActualizationBottomSheetInternalAction.StartKeepingPhone) {
            JsxActualizationBottomSheetResult jsxActualizationBottomSheetResult = c50299c2.f443561c;
            c50299c2.getClass();
            return new C50299c(false, jsxActualizationBottomSheetResult);
        }
        if (!(jsxActualizationBottomSheetInternalAction2 instanceof JsxActualizationBottomSheetInternalAction.CloseFlow)) {
            return c50299c2;
        }
        JsxActualizationBottomSheetResult jsxActualizationBottomSheetResult2 = ((JsxActualizationBottomSheetInternalAction.CloseFlow) jsxActualizationBottomSheetInternalAction2).f131514b;
        boolean z12 = c50299c2.f443560b;
        c50299c2.getClass();
        return new C50299c(z12, jsxActualizationBottomSheetResult2);
    }
}
