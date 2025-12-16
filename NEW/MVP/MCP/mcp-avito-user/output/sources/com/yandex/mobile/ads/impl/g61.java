package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;

/* loaded from: classes8.dex */
public final class g61 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i12, int i13) {
        for (Object obj2 : spannableStringBuilder.getSpans(i12, i13, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i12 && spannableStringBuilder.getSpanEnd(obj2) == i13 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i12, i13, 33);
    }
}
