package H91;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public abstract class g {
    public static void a(int i12, int i13, int i14, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i15 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        if ((i14 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i12 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i16 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        if ((i14 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i13 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMargins(i15, i12, i16, i13);
        view.setLayoutParams(marginLayoutParams5);
    }

    public static final void b(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void c(View view) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }
}
