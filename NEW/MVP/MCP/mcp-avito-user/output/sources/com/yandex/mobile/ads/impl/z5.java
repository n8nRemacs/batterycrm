package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* loaded from: classes8.dex */
public final class z5 {
    @j.N
    public static RelativeLayout.LayoutParams a(@j.N Context context, @j.P SizeInfo sizeInfo) {
        RelativeLayout.LayoutParams layoutParams;
        if (sizeInfo != null) {
            int iC2 = sizeInfo.c(context);
            int iA2 = sizeInfo.a(context);
            int i12 = rj1.f389556b;
            layoutParams = new RelativeLayout.LayoutParams(l41.a(context, 1, iC2), l41.a(context, 1, iA2));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    @j.N
    public static RelativeLayout.LayoutParams a(@j.N Context context, @j.P AdResponse adResponse) {
        RelativeLayout.LayoutParams layoutParams;
        if (adResponse != null) {
            int iQ2 = adResponse.q();
            int iD2 = adResponse.d();
            int i12 = rj1.f389556b;
            layoutParams = new RelativeLayout.LayoutParams(l41.a(context, 1, iQ2), l41.a(context, 1, iD2));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    @j.N
    public static RelativeLayout.LayoutParams a(@j.N Context context, @j.N wx wxVar) {
        int i12 = rj1.f389556b;
        int iA2 = l41.a(context, 1, 25.0f);
        int iA3 = l41.a(context, 1, 64.0f);
        int i13 = iA3 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA3, iA3);
        layoutParams.addRule(7, wxVar.getId());
        layoutParams.addRule(6, wxVar.getId());
        ViewGroup.LayoutParams layoutParams2 = wxVar.getLayoutParams();
        int i14 = layoutParams2.width;
        boolean z12 = i14 == -1 || i14 + iA2 >= context.getResources().getDisplayMetrics().widthPixels;
        int i15 = layoutParams2.height;
        boolean z13 = i15 == -1 || i15 + iA2 >= context.getResources().getDisplayMetrics().heightPixels;
        int i16 = (iA2 >> 1) - ((iA3 - iA2) / 2);
        if (!z12 && !z13) {
            i16 = -i13;
        }
        layoutParams.setMargins(0, i16, i16, 0);
        return layoutParams;
    }
}
