package com.avito.android.comparison.text_measurer;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.text.StaticLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.comparison.text_measurer.a;
import com.avito.android.remote.model.Size;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextMeasurer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/text_measurer/b;", "Lcom/avito/android/comparison/text_measurer/a;", "<init>", "()V", "_avito_comparison_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @k
    public static StaticLayout c(@k String str, @k a.C3707a c3707a) {
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(str, 0, str.length(), c3707a.f124217f, c3707a.f124212a).setLineSpacing(c3707a.f124218g, c3707a.f124219h).setBreakStrategy(c3707a.f124224m).setHyphenationFrequency(c3707a.f124225n).setAlignment(c3707a.f124221j).setTextDirection(c3707a.f124222k).setMaxLines(c3707a.f124227p).setEllipsize(c3707a.f124228q).setEllipsizedWidth(c3707a.f124229r).setIncludePad(c3707a.f124220i);
        if (Build.VERSION.SDK_INT >= 28) {
            includePad.setUseLineSpacingFromFallbacks(c3707a.f124223l);
        }
        return includePad.build();
    }

    @Override // com.avito.android.comparison.text_measurer.a
    @k
    public final a.C3707a a(@k TextView textView, int i12) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return new a.C3707a(i12, textView.getPaddingBottom() + textView.getPaddingTop(), textView.getPaddingRight() + textView.getPaddingLeft(), (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0), textView.getPaint(), textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), textView.getIncludeFontPadding(), null, null, false, 0, 0, 0, 0, null, 0, 261632, null);
    }

    @Override // com.avito.android.comparison.text_measurer.a
    @k
    public final Size b(@l String str, @k a.C3707a c3707a) {
        if (str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return Size.INSTANCE.getZERO();
        }
        StaticLayout staticLayoutC = c(str, c3707a);
        return new Size(c3707a.f124216e + c3707a.f124214c + staticLayoutC.getWidth(), c3707a.f124215d + c3707a.f124213b + staticLayoutC.getHeight());
    }
}
