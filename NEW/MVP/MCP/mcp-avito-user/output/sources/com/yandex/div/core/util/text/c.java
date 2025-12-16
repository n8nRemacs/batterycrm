package com.yandex.div.core.util.text;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.text.Layout;
import com.yandex.div2.AbstractC38582v7;
import com.yandex.div2.C38600x7;
import kotlin.Metadata;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/util/text/c;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c {
    public static int b(@k Layout layout, int i12) {
        int lineBottom = layout.getLineBottom(i12);
        boolean z12 = i12 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z12) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float lineTop = layout.getLineTop(i12 + 1) - layout.getLineTop(i12);
                spacingAdd = lineTop - ((lineTop - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) (lineBottom - spacingAdd);
        }
        return i12 == layout.getLineCount() - 1 ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public static int c(@k Layout layout, int i12) {
        int lineTop = layout.getLineTop(i12);
        return i12 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }

    public abstract void a(@k Canvas canvas, @k Layout layout, int i12, int i13, int i14, int i15, @l C38600x7 c38600x7, @l AbstractC38582v7 abstractC38582v7);
}
