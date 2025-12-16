package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class f51 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final i51 f385180a = new i51();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ld f385181b = new ld();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final of f385182c = new of();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private h51 f385183d;

    public final void a(@Y61.k ImageView imageView, @Y61.k b30 b30Var, @Y61.k Bitmap bitmap) {
        h51 h51Var = new h51(this.f385181b, this.f385182c, this.f385180a, b30Var, bitmap);
        this.f385183d = h51Var;
        imageView.addOnLayoutChangeListener(h51Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void a(@Y61.k ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f385183d);
    }
}
