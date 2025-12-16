package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bumptech.glide.load.resource.bitmap.G;

/* compiled from: TransformationUtils.java */
/* loaded from: classes5.dex */
class E implements G.a {
    @Override // com.bumptech.glide.load.resource.bitmap.G.a
    public final void a(Canvas canvas, Paint paint, RectF rectF) {
        float f12 = 0;
        canvas.drawRoundRect(rectF, f12, f12, paint);
    }
}
