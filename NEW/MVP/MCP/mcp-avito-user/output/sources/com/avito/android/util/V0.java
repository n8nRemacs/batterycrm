package com.avito.android.util;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import j.InterfaceC42156l;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Drawables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V0 {
    public static final void a(@Y61.k Drawable drawable, int i12) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i12);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i12);
            drawable.invalidateSelf();
        } else {
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i12);
                return;
            }
            V2.f318762a.i("Drawables.kt", "Can't apply color to " + drawable.getClass().getSimpleName() + " => using color filter instead", null);
            drawable.setColorFilter(i12, PorterDuff.Mode.SRC_IN);
        }
    }

    @Y61.k
    public static final Bitmap b(@Y61.k Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static RippleDrawable c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            return new RippleDrawable(colorStateList, null, null);
        }
        return null;
    }

    @Y61.k
    @InterfaceC42830m
    public static final void d(@Y61.k Drawable drawable, @InterfaceC42156l int i12) {
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        drawable.mutate().setTint(i12);
    }
}
