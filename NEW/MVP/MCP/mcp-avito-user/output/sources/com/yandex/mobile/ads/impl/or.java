package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class or {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final dq f388622a = new dq();

    @Y61.k
    public final LayerDrawable a(@Y61.k Context context, int i12, int i13) {
        this.f388622a.getClass();
        int iA2 = dq.a(context, 6.0f);
        this.f388622a.getClass();
        int iA3 = dq.a(context, 4.0f);
        this.f388622a.getClass();
        int iA4 = dq.a(context, 3.0f);
        this.f388622a.getClass();
        int iA5 = dq.a(context, 12.0f);
        int i14 = ((i13 + 1) * iA3) + (iA2 * i13);
        float f12 = iA5;
        RectF rectF = new RectF(0.0f, 0.0f, i14, f12);
        float[] fArr = new float[8];
        int i15 = 0;
        for (int i16 = 0; i16 < 8; i16++) {
            fArr[i16] = f12;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i14);
        shapeDrawable.setIntrinsicHeight(iA5);
        shapeDrawable.getPaint().setColor(-16777216);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i13];
        for (int i17 = 0; i17 < i13; i17++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(iA2);
            shapeDrawable2.setIntrinsicWidth(iA2);
            shapeDrawable2.getPaint().setColor(-1);
            if (i17 != i12) {
                shapeDrawable2.setAlpha(102);
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            shapeDrawableArr[i17] = shapeDrawable2;
        }
        kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0(2);
        t0Var.a(shapeDrawable);
        t0Var.b(shapeDrawableArr);
        ArrayList<Object> arrayList = t0Var.f406850a;
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new ShapeDrawable[arrayList.size()]));
        while (i15 < i13) {
            int i18 = iA3 + iA2;
            int i19 = i15 + 1;
            layerDrawable.setLayerInset(i19, (i18 * i15) + iA3, iA4, i14 - (i18 * i19), iA4);
            i15 = i19;
        }
        return layerDrawable;
    }
}
