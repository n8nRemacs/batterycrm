package com.avito.android.cv_validation_bottom_sheet.ui;

import Y41.l;
import androidx.core.os.C22777e;
import com.avito.android.cv_validation_bottom_sheet.mvi.n;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: CvValidationBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class a extends H implements l<n, G0> {
    @Override // Y41.l
    public final G0 invoke(n nVar) {
        n nVar2 = nVar;
        CvValidationBottomSheet cvValidationBottomSheet = (CvValidationBottomSheet) this.receiver;
        CvValidationBottomSheet.a aVar = CvValidationBottomSheet.f131925r0;
        cvValidationBottomSheet.getClass();
        if (nVar2 instanceof n.b) {
            cvValidationBottomSheet.getParentFragmentManager().o0(C22777e.b(new Q("CV_VALIDATION_BOTTOM_SHEET_RESULT_KEY", ((n.b) nVar2).f131915a)), "CV_VALIDATION_BOTTOM_SHEET_REQUEST_KEY");
            cvValidationBottomSheet.dismiss();
        } else if (nVar2 instanceof n.a) {
            cvValidationBottomSheet.dismiss();
        }
        return G0.f406611a;
    }
}
