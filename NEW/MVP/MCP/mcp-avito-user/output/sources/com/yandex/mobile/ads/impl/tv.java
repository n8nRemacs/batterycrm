package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class tv extends bj1<ImageView, rv> {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final w20 f390313b;

    public tv(@j.N ImageView imageView, @j.N w20 w20Var) {
        super(imageView);
        this.f390313b = w20Var;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final /* bridge */ /* synthetic */ boolean a(@j.N View view, @j.N rv rvVar) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N rv rvVar) {
        ImageView imageView = (ImageView) view;
        b30 b30VarA = rvVar.a();
        if (b30VarA != null) {
            imageView.setForeground(null);
            imageView.setBackground(null);
            Bitmap bitmapA = this.f390313b.a(b30VarA);
            if (bitmapA == null) {
                imageView.setImageDrawable(androidx.core.content.d.getDrawable(imageView.getContext(), R.drawable.monetization_ads_internal_default_adtune_feedback_icon));
            } else {
                imageView.setImageBitmap(bitmapA);
            }
        }
    }
}
