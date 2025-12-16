package com.yandex.div.core.widget;

import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: DivViewWrapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k {
    public static final void a(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 == null) {
            return;
        }
        layoutParams.width = layoutParams2.width;
        layoutParams.height = layoutParams2.height;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            if (marginLayoutParams2.isMarginRelative()) {
                marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
            }
        }
        if ((layoutParams instanceof com.yandex.div.internal.widget.c) && (layoutParams2 instanceof com.yandex.div.internal.widget.c)) {
            com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
            com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
            cVar.f370250h = cVar2.f370250h;
            cVar.f370249g = cVar2.f370249g;
        }
    }
}
