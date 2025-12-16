package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import j.N;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes6.dex */
final class d extends m<h> {

    /* renamed from: c, reason: collision with root package name */
    public int f356913c;

    /* renamed from: d, reason: collision with root package name */
    public float f356914d;

    /* renamed from: e, reason: collision with root package name */
    public float f356915e;

    /* renamed from: f, reason: collision with root package name */
    public float f356916f;

    public d(@N h hVar) {
        this.f356954a = hVar;
        this.f356913c = 1;
    }

    @Override // com.google.android.material.progressindicator.m
    public final int a() {
        return g();
    }

    @Override // com.google.android.material.progressindicator.m
    public final int b() {
        return g();
    }

    public final void c(@N Canvas canvas, @N Rect rect, @InterfaceC42167x float f12) {
        float fWidth = rect.width() / g();
        float fHeight = rect.height() / g();
        h hVar = this.f356954a;
        float f13 = (hVar.f356932g / 2.0f) + hVar.f356933h;
        canvas.translate((f13 * fWidth) + rect.left, (f13 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f14 = -f13;
        canvas.clipRect(f14, f14, f13, f13);
        this.f356913c = hVar.f356934i == 0 ? 1 : -1;
        this.f356914d = hVar.f356907a * f12;
        this.f356915e = hVar.f356908b * f12;
        this.f356916f = (hVar.f356932g - r9) / 2.0f;
        if ((this.f356955b.e() && hVar.f356911e == 2) || (this.f356955b.d() && hVar.f356912f == 1)) {
            this.f356916f = (((1.0f - f12) * hVar.f356907a) / 2.0f) + this.f356916f;
        } else if ((this.f356955b.e() && hVar.f356911e == 1) || (this.f356955b.d() && hVar.f356912f == 2)) {
            this.f356916f -= ((1.0f - f12) * hVar.f356907a) / 2.0f;
        }
    }

    public final void d(Canvas canvas, Paint paint, float f12, float f13, float f14) {
        canvas.save();
        canvas.rotate(f14);
        float f15 = this.f356916f;
        float f16 = f12 / 2.0f;
        canvas.drawRoundRect(new RectF(f15 - f16, f13, f15 + f16, -f13), f13, f13, paint);
        canvas.restore();
    }

    public final void e(@N Canvas canvas, @N Paint paint, @InterfaceC42167x float f12, @InterfaceC42167x float f13, @InterfaceC42156l int i12) {
        if (f12 == f13) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i12);
        paint.setStrokeWidth(this.f356914d);
        float f14 = this.f356913c;
        float f15 = f12 * 360.0f * f14;
        float f16 = (f13 >= f12 ? f13 - f12 : (1.0f + f13) - f12) * 360.0f * f14;
        float f17 = this.f356916f;
        float f18 = -f17;
        canvas.drawArc(new RectF(f18, f18, f17, f17), f15, f16, false, paint);
        if (this.f356915e <= 0.0f || Math.abs(f16) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        d(canvas, paint, this.f356914d, this.f356915e, f15);
        d(canvas, paint, this.f356914d, this.f356915e, f15 + f16);
    }

    public final void f(@N Canvas canvas, @N Paint paint) {
        int iA2 = com.google.android.material.color.k.a(this.f356954a.f356910d, this.f356955b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iA2);
        paint.setStrokeWidth(this.f356914d);
        float f12 = this.f356916f;
        float f13 = -f12;
        canvas.drawArc(new RectF(f13, f13, f12, f12), 0.0f, 360.0f, false, paint);
    }

    public final int g() {
        h hVar = this.f356954a;
        return (hVar.f356933h * 2) + hVar.f356932g;
    }
}
