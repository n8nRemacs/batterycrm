package com.avito.android.avito_map.icon_factory;

import Y61.k;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import kotlin.Metadata;

/* compiled from: AvitoMarkerIconFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "toBitmapWithShadowForCardView", "cardView", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMarkerIconFactoryKt {
    @k
    public static final Bitmap toBitmap(@k View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    @k
    public static final Bitmap toBitmapWithShadowForCardView(@k View view, @k View view2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        view.draw(canvas);
        int elevation = (int) (view2.getElevation() * 3);
        if (elevation < 4) {
            elevation = 4;
        }
        int i12 = elevation / 2;
        int i13 = elevation * 2;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view2.getMeasuredWidth() + i13, view2.getMeasuredHeight() + i13, config);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.drawColor(0, mode);
        Paint paint = new Paint();
        float f12 = elevation;
        paint.setShader(new LinearGradient(0.0f, view2.getMeasuredHeight(), 0.0f, view2.getMeasuredHeight() + f12, Color.argb(26, 0, 0, 0), 0, Shader.TileMode.CLAMP));
        float f13 = i12;
        paint.setMaskFilter(new BlurMaskFilter(f13, BlurMaskFilter.Blur.NORMAL));
        float f14 = 2;
        canvas2.drawRoundRect(new RectF(f12 * f14, view2.getMeasuredHeight() / f14, view2.getMeasuredWidth() + f13, view2.getMeasuredHeight() + f13), f13, f13, paint);
        canvas2.translate(f12, f12);
        view2.draw(canvas2);
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), config);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
        canvas3.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        canvas3.drawBitmap(bitmapCreateBitmap2, view2.getLeft() - f12, view2.getTop() - f12, (Paint) null);
        return bitmapCreateBitmap3;
    }
}
