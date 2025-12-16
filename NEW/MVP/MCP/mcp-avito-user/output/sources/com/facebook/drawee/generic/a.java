package com.facebook.drawee.generic;

import I41.h;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedBitmapDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.e;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.systrace.b;
import uW0.C48986a;

/* compiled from: WrappingUtils.java */
/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f340161a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            RoundedBitmapDrawable roundedBitmapDrawable = new RoundedBitmapDrawable(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(roundedBitmapDrawable, roundingParams);
            return roundedBitmapDrawable;
        }
        if (drawable instanceof NinePatchDrawable) {
            q qVar = new q((NinePatchDrawable) drawable);
            b(qVar, roundingParams);
            return qVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            C48986a.l("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        o oVar = new o(((ColorDrawable) drawable).getColor());
        b(oVar, roundingParams);
        return oVar;
    }

    public static void b(n nVar, RoundingParams roundingParams) {
        nVar.b(roundingParams.f340152b);
        nVar.h(roundingParams.f340153c);
        nVar.c(roundingParams.f340155e, roundingParams.f340156f);
        nVar.d(roundingParams.f340157g);
        nVar.l();
        nVar.j();
    }

    public static Drawable c(@h Drawable drawable, @h RoundingParams roundingParams, Resources resources) {
        try {
            b.a();
            if (drawable != null && roundingParams != null && roundingParams.f340151a == RoundingParams.RoundingMethod.f340159c) {
                if (!(drawable instanceof i)) {
                    return a(drawable, roundingParams, resources);
                }
                e eVar = (i) drawable;
                while (true) {
                    Object objA = eVar.a();
                    if (objA == eVar || !(objA instanceof e)) {
                        break;
                    }
                    eVar = (e) objA;
                }
                eVar.g(a(eVar.g(f340161a), roundingParams, resources));
                return drawable;
            }
            return drawable;
        } finally {
            b.a();
        }
    }

    public static Drawable d(@h Drawable drawable, @h RoundingParams roundingParams) {
        try {
            b.a();
            if (drawable != null && roundingParams != null && roundingParams.f340151a == RoundingParams.RoundingMethod.f340158b) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.f340029n = roundingParams.f340154d;
                roundedCornersDrawable.invalidateSelf();
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            b.a();
        }
    }

    @h
    public static Drawable e(@h Drawable drawable, @h s.a aVar) {
        b.a();
        if (drawable == null || aVar == null) {
            b.a();
            return drawable;
        }
        r rVar = new r(drawable, aVar);
        b.a();
        return rVar;
    }
}
