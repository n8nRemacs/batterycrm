package com.yandex.mobile.ads.nativeads.template;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j.N;
import j.k0;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: b, reason: collision with root package name */
    @k0
    static final int f392850b = Color.parseColor("#eaeaea");

    /* renamed from: a, reason: collision with root package name */
    private final ImageView[] f392851a;

    public b(@N ImageView... imageViewArr) {
        this.f392851a = imageViewArr;
        b();
    }

    public final void a() {
        for (ImageView imageView : this.f392851a) {
            ColorDrawable colorDrawable = (ColorDrawable) imageView.getBackground();
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                objectAnimatorOfPropertyValuesHolder.setTarget(colorDrawable);
                objectAnimatorOfPropertyValuesHolder.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder.start();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                objectAnimatorOfPropertyValuesHolder2.setTarget(drawable);
                objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f392851a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f392850b);
                }
            }
        }
    }
}
