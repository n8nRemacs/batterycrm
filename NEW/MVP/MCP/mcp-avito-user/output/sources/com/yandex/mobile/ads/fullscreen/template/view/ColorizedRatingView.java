package com.yandex.mobile.ads.fullscreen.template.view;

import Ba1.C13127e;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.C22241a;
import com.yandex.mobile.ads.impl.qw0;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class ColorizedRatingView extends qw0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f383156a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(@N Context context) {
        super(context);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@P Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    C22241a.e();
                    drawable2.setColorFilter(C13127e.c(BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i13 = f383156a;
                if (i12 >= 29) {
                    C22241a.e();
                    drawable3.setColorFilter(C22241a.d(i13, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i13, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i12 < 29) {
                    drawable4.setColorFilter(i13, PorterDuff.Mode.SRC_ATOP);
                } else {
                    C22241a.e();
                    drawable4.setColorFilter(C22241a.d(i13, BlendMode.SRC_ATOP));
                }
            }
        }
    }

    public ColorizedRatingView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorizedRatingView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
    }
}
