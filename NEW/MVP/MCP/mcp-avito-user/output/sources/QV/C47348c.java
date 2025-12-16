package qV;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: NavBar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: qV.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47348c {
    public static void a(View view, Integer num, Integer num2, int i12) {
        if ((i12 & 1) != 0) {
            num = null;
        }
        if ((i12 & 4) != 0) {
            num2 = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int iIntValue = num != null ? num.intValue() : marginLayoutParams.leftMargin;
        int iIntValue2 = num != null ? num.intValue() : marginLayoutParams.getMarginStart();
        int i13 = marginLayoutParams.topMargin;
        int iIntValue3 = num2 != null ? num2.intValue() : marginLayoutParams.rightMargin;
        int iIntValue4 = num2 != null ? num2.intValue() : marginLayoutParams.getMarginEnd();
        int i14 = marginLayoutParams.bottomMargin;
        if (iIntValue == marginLayoutParams.leftMargin && iIntValue2 == marginLayoutParams.getMarginStart() && i13 == marginLayoutParams.topMargin && iIntValue3 == marginLayoutParams.rightMargin && iIntValue4 == marginLayoutParams.getMarginEnd() && i14 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.setMargins(0, i13, 0, i14);
        marginLayoutParams.setMarginStart(iIntValue2);
        marginLayoutParams.setMarginEnd(iIntValue4);
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }
}
