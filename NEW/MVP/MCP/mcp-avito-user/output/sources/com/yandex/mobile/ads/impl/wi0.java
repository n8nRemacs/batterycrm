package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes8.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w20 f391422a;

    public static final class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(@Y61.l View view) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
            if (viewPager2 != null) {
                viewPager2.callOnClick();
            }
        }
    }

    public wi0(@Y61.k w20 w20Var) {
        this.f391422a = w20Var;
    }

    @Y61.k
    public final vi0 a(@Y61.k ViewGroup viewGroup) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new a());
        return new vi0(imageView, new j30(imageView, this.f391422a));
    }
}
