package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;

@X41.i
/* loaded from: classes8.dex */
public final class nj1 {
    @Y61.k
    public static final jj1 a(@Y61.k com.yandex.mobile.ads.banner.h hVar) {
        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(ub1.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = hVar.getLayoutParams();
        return new jj1(new ij1(ub1.a(hVar.getWidth()), ub1.a(hVar.getHeight())), new b90(numValueOf, layoutParams2 != null ? Integer.valueOf(ub1.a(layoutParams2.height)) : null), new ob0(new pb0(ub1.a(View.MeasureSpec.getSize(hVar.getWidthMeasureSpec())), a(hVar.getWidthMeasureSpec())), new pb0(ub1.a(View.MeasureSpec.getSize(hVar.getHeightMeasureSpec())), a(hVar.getHeightMeasureSpec()))));
    }

    @Y61.k
    public static final jj1 a(@Y61.k CustomizableMediaView customizableMediaView, @Y61.k String str) {
        ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(ub1.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
        Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(ub1.a(layoutParams2.height)) : null;
        int iA2 = ub1.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
        int iA3 = ub1.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
        qb0 qb0VarA = a(customizableMediaView.getWidthMeasureSpec());
        qb0 qb0VarA2 = a(customizableMediaView.getHeightMeasureSpec());
        return new jj1(new ij1(ub1.a(customizableMediaView.getWidth()), ub1.a(customizableMediaView.getHeight())), new b90(numValueOf, numValueOf2), new ob0(new pb0(iA2, qb0VarA), new pb0(iA3, qb0VarA2)), kotlin.collections.P0.g(new kotlin.Q("asset", "media"), new kotlin.Q("media_type", str)));
    }

    private static final qb0 a(int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE) {
            return qb0.f389132b;
        }
        if (mode == 0) {
            return qb0.f389133c;
        }
        if (mode != 1073741824) {
            return qb0.f389133c;
        }
        return qb0.f389131a;
    }
}
