package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.k;
import j.N;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes6.dex */
class i extends com.google.android.material.shape.k {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f357460z = 0;

    /* renamed from: y, reason: collision with root package name */
    @N
    public b f357461y;

    /* compiled from: CutoutDrawable.java */
    public static class c extends i {

        /* renamed from: A, reason: collision with root package name */
        public Paint f357463A;

        /* renamed from: B, reason: collision with root package name */
        public int f357464B;

        @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
        public final void draw(@N Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                View view = (View) callback;
                if (view.getLayerType() != 2) {
                    view.setLayerType(2, null);
                }
            } else {
                this.f357464B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
            }
            super.draw(canvas);
            if (getCallback() instanceof View) {
                return;
            }
            canvas.restoreToCount(this.f357464B);
        }

        @Override // com.google.android.material.shape.k
        public final void f(@N Canvas canvas) {
            super.f(canvas);
            RectF rectF = this.f357461y.f357462s;
            if (this.f357463A == null) {
                Paint paint = new Paint(1);
                this.f357463A = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.f357463A.setColor(-1);
                this.f357463A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            canvas.drawRect(rectF, this.f357463A);
        }
    }

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    public static class d extends i {
        @Override // com.google.android.material.shape.k
        public final void f(@N Canvas canvas) {
            if (this.f357461y.f357462s.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f357461y.f357462s);
            super.f(canvas);
            canvas.restore();
        }
    }

    public i(b bVar, a aVar) {
        super(bVar);
        this.f357461y = bVar;
    }

    @Override // com.google.android.material.shape.k, android.graphics.drawable.Drawable
    @N
    public final Drawable mutate() {
        this.f357461y = new b(this.f357461y, null);
        return this;
    }

    public final void z(float f12, float f13, float f14, float f15) {
        RectF rectF = this.f357461y.f357462s;
        if (f12 == rectF.left && f13 == rectF.top && f14 == rectF.right && f15 == rectF.bottom) {
            return;
        }
        rectF.set(f12, f13, f14, f15);
        invalidateSelf();
    }

    /* compiled from: CutoutDrawable.java */
    public static final class b extends k.c {

        /* renamed from: s, reason: collision with root package name */
        @N
        public final RectF f357462s;

        public b(com.google.android.material.shape.q qVar, RectF rectF, a aVar) {
            super(qVar);
            this.f357462s = rectF;
        }

        @Override // com.google.android.material.shape.k.c, android.graphics.drawable.Drawable.ConstantState
        @N
        public final Drawable newDrawable() {
            int i12 = i.f357460z;
            d dVar = new d(this, null);
            dVar.invalidateSelf();
            return dVar;
        }

        public b(b bVar, a aVar) {
            super(bVar);
            this.f357462s = bVar.f357462s;
        }
    }
}
