package Ba1;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import kotlin.jvm.internal.L;

/* renamed from: Ba1.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13130h {
    public static final void a(LinearLayout linearLayout) {
        b(linearLayout, H91.c.a(20), H91.c.a(20), H91.c.a(20), H91.c.a(20));
    }

    public static final void b(LinearLayout linearLayout, int i12, int i13, int i14, int i15) {
        Boolean boolValueOf;
        Context context = linearLayout.getContext();
        if (context != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.sdkBioBottomButtonWithUnderlay, typedValue, true);
            boolValueOf = Boolean.valueOf(typedValue.data != 0);
        } else {
            boolValueOf = null;
        }
        if (L.f(boolValueOf, Boolean.FALSE)) {
            linearLayout.setBackground(null);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            linearLayout.setPadding(0, 0, 0, 0);
            linearLayout.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMargins(i12, i13, i14, i15);
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }
}
