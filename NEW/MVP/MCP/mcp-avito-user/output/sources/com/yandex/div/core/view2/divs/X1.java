package com.yandex.div.core.view2.divs;

import android.graphics.Typeface;
import android.util.DisplayMetrics;
import com.yandex.div2.D4;
import com.yandex.div2.T5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class X1 {
    public static final com.yandex.div.internal.widget.slider.b a(T5.f fVar, DisplayMetrics displayMetrics, com.yandex.div.core.font.a aVar, com.yandex.div.json.expressions.e eVar) {
        Number numberValueOf;
        com.yandex.div2.O0 o02;
        com.yandex.div2.O0 o03;
        long jLongValue = fVar.f373663a.a(eVar).longValue();
        int iOrdinal = fVar.f373664b.a(eVar).ordinal();
        if (iOrdinal == 0) {
            numberValueOf = Integer.valueOf(C37931a.o(Long.valueOf(jLongValue), displayMetrics));
        } else if (iOrdinal == 1) {
            numberValueOf = Integer.valueOf(C37931a.J(Long.valueOf(jLongValue), displayMetrics));
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numberValueOf = Long.valueOf(jLongValue);
        }
        float fFloatValue = numberValueOf.floatValue();
        Typeface typefaceX = C37931a.x(fVar.f373665c.a(eVar), aVar);
        D4 d42 = fVar.f373666d;
        return new com.yandex.div.internal.widget.slider.b(fFloatValue, typefaceX, (d42 == null || (o02 = d42.f371170a) == null) ? 0.0f : C37931a.O(o02, displayMetrics, eVar), (d42 == null || (o03 = d42.f371171b) == null) ? 0.0f : C37931a.O(o03, displayMetrics, eVar), fVar.f373667e.a(eVar).intValue());
    }
}
