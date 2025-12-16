package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bumptech.glide.load.resource.bitmap.G;

/* compiled from: TransformationUtils.java */
/* loaded from: classes5.dex */
class F implements G.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f339342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f339343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f339344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f339345d;

    public F(float f12, float f13, float f14, float f15) {
        this.f339342a = f12;
        this.f339343b = f13;
        this.f339344c = f14;
        this.f339345d = f15;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.G.a
    public final void a(Canvas canvas, Paint paint, RectF rectF) {
        Path path = new Path();
        float f12 = this.f339342a;
        float f13 = this.f339343b;
        float f14 = this.f339344c;
        float f15 = this.f339345d;
        path.addRoundRect(rectF, new float[]{f12, f12, f13, f13, f14, f14, f15, f15}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}
