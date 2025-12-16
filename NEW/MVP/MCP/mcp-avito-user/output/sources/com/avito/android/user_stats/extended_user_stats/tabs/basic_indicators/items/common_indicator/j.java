package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator;

import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: CommonIndicatorItemView.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {
    public static final void a(@Y61.k LayoutInflater layoutInflater, @Y61.k LinearLayout linearLayout, double d12, double d13, @l UniversalColor universalColor) {
        Color color;
        linearLayout.removeAllViews();
        double d14 = d12 - d13;
        b(layoutInflater, linearLayout, d13, (universalColor == null || (color = universalColor.getColor()) == null) ? C35835l0.d(R.attr.blue600, linearLayout.getContext()) : color.getValue(), d14 == 0.0d ? R.drawable.rounded_bar : R.drawable.rounded_left_bar);
        View viewInflate = layoutInflater.inflate(R.layout.line_bar, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(D6.j(linearLayout, 2), 0));
        linearLayout.addView(viewInflate);
        b(layoutInflater, linearLayout, d14, C35835l0.d(R.attr.warmGray8, linearLayout.getContext()), R.drawable.rounded_right_bar);
    }

    public static final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, double d12, int i12, int i13) {
        View viewInflate = layoutInflater.inflate(R.layout.line_bar, (ViewGroup) null, false);
        Resources resources = viewInflate.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        viewInflate.setBackground(resources.getDrawable(i13, null));
        ((GradientDrawable) viewInflate.getBackground()).setColor(i12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, D6.j(viewInflate, 4));
        layoutParams.weight = (float) d12;
        viewInflate.setLayoutParams(layoutParams);
        linearLayout.addView(viewInflate);
    }

    @Y61.k
    public static final String c(double d12) {
        return NumberFormat.getInstance(new Locale("ru", "RU")).format(kotlin.math.b.c(d12 * 100.0d) / 100.0d).toString();
    }
}
