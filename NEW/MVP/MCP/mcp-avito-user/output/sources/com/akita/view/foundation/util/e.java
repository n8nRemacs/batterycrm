package com.akita.view.foundation.util;

import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {
    public static void a(View view, Integer num, Integer num2, Integer num3, Integer num4, int i12) {
        if ((i12 & 1) != 0) {
            num = null;
        }
        if ((i12 & 2) != 0) {
            num2 = null;
        }
        if ((i12 & 4) != 0) {
            num3 = null;
        }
        if ((i12 & 8) != 0) {
            num4 = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int iIntValue = num != null ? num.intValue() : marginLayoutParams.getMarginStart();
        int iIntValue2 = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
        int iIntValue3 = num3 != null ? num3.intValue() : marginLayoutParams.getMarginEnd();
        int iIntValue4 = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
        if (iIntValue == marginLayoutParams.getMarginStart() && iIntValue2 == marginLayoutParams.topMargin && iIntValue3 == marginLayoutParams.getMarginEnd() && iIntValue4 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.setMarginStart(iIntValue);
        marginLayoutParams.topMargin = iIntValue2;
        marginLayoutParams.setMarginEnd(iIntValue3);
        marginLayoutParams.bottomMargin = iIntValue4;
        view.requestLayout();
    }

    public static void b(View view, int i12, int i13, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i12 = view.getPaddingLeft();
        }
        if ((i16 & 4) != 0) {
            i14 = view.getPaddingRight();
        }
        if ((i16 & 8) != 0) {
            i15 = view.getPaddingBottom();
        }
        view.setPadding(i12, i13, i14, i15);
    }

    public static final void c(@l View view) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void d(@l View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }
}
