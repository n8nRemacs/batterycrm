package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class j30 extends bj1<ImageView, b30> {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final w20 f386754b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final f30 f386755c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final f51 f386756d;

    public j30(@j.N ImageView imageView, @j.N w20 w20Var) {
        super(imageView);
        this.f386754b = w20Var;
        this.f386755c = new f30(w20Var);
        this.f386756d = new f51();
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.f386756d.a(imageView);
        super.a((j30) imageView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final boolean a(@j.N View view, @j.N b30 b30Var) {
        Drawable drawable = ((ImageView) view).getDrawable();
        return this.f386755c.a(drawable, b30Var);
    }

    public final void a(@j.N ImageView imageView) {
        imageView.setImageDrawable(null);
        this.f386756d.a(imageView);
        super.a((j30) imageView);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@j.N ImageView imageView, @j.N b30 b30Var) {
        Bitmap bitmapA = this.f386754b.a(b30Var);
        if (bitmapA != null) {
            if (b30Var.c() != null) {
                this.f386756d.a(imageView, b30Var, bitmapA);
            } else {
                imageView.setImageBitmap(bitmapA);
            }
        }
    }
}
