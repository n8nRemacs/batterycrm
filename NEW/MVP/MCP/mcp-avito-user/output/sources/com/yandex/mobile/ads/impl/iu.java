package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.tj1;

/* loaded from: classes8.dex */
public final class iu {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tj1 f386689a = new tj1();

    @j.N
    public final <T extends View & tj1.a> hu a(@j.N T t12) {
        int iA2;
        this.f386689a.getClass();
        RectF rectF = null;
        if (tj1.a(t12)) {
            iA2 = rj1.a(t12);
            Rect rect = new Rect();
            if (t12.getLocalVisibleRect(rect)) {
                rect.offset(t12.getLeft(), t12.getTop());
            } else {
                rect = null;
            }
            Context context = t12.getContext();
            if (rect != null) {
                int iRound = Math.round(rect.left / context.getResources().getDisplayMetrics().density);
                int iRound2 = Math.round(rect.top / context.getResources().getDisplayMetrics().density);
                int iRound3 = Math.round(rect.right / context.getResources().getDisplayMetrics().density);
                int iRound4 = Math.round(rect.bottom / context.getResources().getDisplayMetrics().density);
                int i12 = iRound4 - iRound2;
                if (iRound3 - iRound > 0 && i12 > 0) {
                    rectF = new RectF(iRound, iRound2, iRound3, iRound4);
                }
            }
        } else {
            iA2 = 0;
        }
        return new hu(iA2, rectF);
    }
}
