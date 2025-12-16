package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes8.dex */
final class yl1 {
    @j.N
    public static Rect a(@j.N View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i12 = -iArr[0];
        int i13 = -iArr[1];
        rect.offset(i12, i13);
        return rect;
    }
}
