package com.avito.android.cv_validation_bottom_sheet.ui;

import Y41.l;
import android.widget.TextView;
import com.avito.android.cv_validation_bottom_sheet.mvi.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CvValidationBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class b extends H implements l<s, G0> {
    @Override // Y41.l
    public final G0 invoke(s sVar) {
        s sVar2 = sVar;
        CvValidationBottomSheet cvValidationBottomSheet = (CvValidationBottomSheet) this.receiver;
        com.avito.konveyor.adapter.a aVar = cvValidationBottomSheet.f131929j0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(new UV0.c(sVar2.f131919b));
        TextView textView = cvValidationBottomSheet.f131935p0;
        if (textView != null) {
            I5.a(textView, sVar2.f131920c, false);
        }
        AttributedText attributedText = sVar2.f131922e;
        if (attributedText != null) {
            TextView textView2 = cvValidationBottomSheet.f131936q0;
            if (textView2 != null) {
                j.a(textView2, attributedText, null);
            }
        } else {
            TextView textView3 = cvValidationBottomSheet.f131936q0;
            if (textView3 != null) {
                I5.a(textView3, sVar2.f131921d, false);
            }
        }
        Button button = cvValidationBottomSheet.f131934o0;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, sVar2.f131923f, false);
        }
        return G0.f406611a;
    }
}
