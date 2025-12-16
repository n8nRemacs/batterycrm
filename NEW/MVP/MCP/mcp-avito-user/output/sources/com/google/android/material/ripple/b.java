package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.core.content.d;
import androidx.core.graphics.C22767g;
import j.InterfaceC42156l;
import j.InterfaceC42164u;
import j.N;
import j.P;
import j.U;
import j.X;

/* compiled from: RippleUtils.java */
@RestrictTo
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f357010a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f357011b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f357012c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f357013d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f357014e = {R.attr.state_enabled, R.attr.state_pressed};

    /* compiled from: RippleUtils.java */
    @X
    public static class a {
        @InterfaceC42164u
        private static Drawable a(@N Context context, @U int i12) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i12, i12, i12, i12);
            int i13 = com.google.android.material.R.attr.colorControlHighlight;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            TypedValue typedValueA = com.google.android.material.resources.b.a(i13, context);
            if (typedValueA != null) {
                int i14 = typedValueA.resourceId;
                colorStateList = i14 != 0 ? d.getColorStateList(context, i14) : ColorStateList.valueOf(typedValueA.data);
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                colorStateListValueOf = colorStateList;
            }
            return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
        }
    }

    @N
    public static ColorStateList a(@P ColorStateList colorStateList) {
        int[] iArr = f357011b;
        return new ColorStateList(new int[][]{f357013d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f357012c), b(colorStateList, iArr), b(colorStateList, f357010a)});
    }

    @InterfaceC42156l
    public static int b(@P ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return C22767g.i(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    @N
    public static ColorStateList c(@P ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f357014e, 0));
        }
        return colorStateList;
    }

    public static boolean d(@N int[] iArr) {
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 : iArr) {
            if (i12 == 16842910) {
                z12 = true;
            } else if (i12 == 16842908 || i12 == 16842919 || i12 == 16843623) {
                z13 = true;
            }
        }
        return z12 && z13;
    }
}
