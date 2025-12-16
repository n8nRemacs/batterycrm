package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes8.dex */
public final class jv {

    /* renamed from: c, reason: collision with root package name */
    private static final int f386979c = Color.parseColor("#66000000");

    /* renamed from: d, reason: collision with root package name */
    private static final int f386980d = Color.parseColor("#00000000");

    /* renamed from: e, reason: collision with root package name */
    private static final int f386981e = Color.parseColor("#7f7f7f");

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private Context f386982a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final NativeAdAssets f386983b;

    public jv(@j.N Context context, @j.N NativeAdAssets nativeAdAssets) {
        this.f386982a = context;
        this.f386983b = nativeAdAssets;
    }

    public final void a(@j.N ImageView imageView, @j.N FrameLayout frameLayout, int i12) {
        if (!new kv(this.f386983b).a()) {
            int i13 = f386981e;
            Drawable drawable = androidx.core.content.d.getDrawable(this.f386982a, R.drawable.monetization_ads_internal_ic_close_gray);
            drawable.setColorFilter(new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(drawable);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
            frameLayout.setVisibility(0);
            return;
        }
        if (this.f386983b.getMedia() != null) {
            int i14 = f386981e;
            Drawable drawable2 = androidx.core.content.d.getDrawable(this.f386982a, R.drawable.monetization_ads_internal_ic_close_gray);
            drawable2.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(drawable2);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
            frameLayout.setVisibility(8);
            return;
        }
        if (this.f386983b.getImage() != null) {
            Drawable drawable3 = androidx.core.content.d.getDrawable(this.f386982a, R.drawable.monetization_ads_internal_ic_close_gray);
            drawable3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(drawable3);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f386979c, f386980d});
            frameLayout.setPadding(0, 0, 0, i12);
            frameLayout.setBackground(gradientDrawable);
            frameLayout.setVisibility(0);
        }
    }
}
