package com.avito.android.lib.design.badge;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: BadgeFunctions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    public static final void a(@k TextView textView, @k CharSequence charSequence, @k String str, @l String str2, @f0 int i12, @l String str3, @l String str4) {
        I5.a(textView, TextUtils.concat(charSequence, str2, b(str, str, textView.getContext(), i12, str3, str4)), false);
    }

    public static final SpannableString b(String str, CharSequence charSequence, Context context, @f0 int i12, String str2, String str3) throws Resources.NotFoundException {
        Badge badge = new Badge(context, null, 0, 0, 14, null);
        if (str3 == null) {
            str3 = "";
        }
        Integer numA = com.avito.android.lib.util.e.a(str3);
        ColorStateList colorStateListE = numA != null ? C35835l0.e(numA.intValue(), context) : null;
        if (str2 == null) {
            str2 = "";
        }
        Integer numA2 = com.avito.android.lib.util.e.a(str2);
        Badge.e(badge, i12, numA2 != null ? Integer.valueOf(C35835l0.d(numA2.intValue(), context)) : null, colorStateListE, 24);
        badge.setTitleText(charSequence);
        badge.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(badge.getMeasuredWidth(), badge.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        badge.layout(0, 0, badge.getMeasuredWidth(), badge.getMeasuredHeight());
        badge.draw(canvas);
        int I12 = C43066x.I(str, charSequence.toString(), 0, false, 6);
        int length = charSequence.length() + I12;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new y(context, bitmapCreateBitmap), I12, length, 33);
        return spannableString;
    }

    public static SpannableString c(String str, CharSequence charSequence, Context context, int i12) {
        return b(C43066x.a0(C43066x.a0("$\\text $\\badgeText", "$\\text", str, false), "$\\badgeText", charSequence.toString(), false), charSequence, context, (i12 & 8) != 0 ? R.style.Design_Widget_Badge : R.style.Re23_Badge_TextRedS, null, null);
    }

    public static void d(TextView textView, String str, String str2, int i12, String str3, int i13) {
        if ((i13 & 8) != 0) {
            str3 = "$\\text $\\badgeText";
        }
        textView.setText(b(C43066x.a0(C43066x.a0(str3, "$\\text", str, false), "$\\badgeText", str2.toString(), false), str2, textView.getContext(), i12, null, null));
    }
}
