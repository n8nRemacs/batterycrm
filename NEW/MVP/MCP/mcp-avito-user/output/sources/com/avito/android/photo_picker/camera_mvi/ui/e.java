package com.avito.android.photo_picker.camera_mvi.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridLinesView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/ui/e;", "Landroid/view/View;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends View {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f219293b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f219294c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public RectF f219295d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public RectF f219296e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public float[] f219297f;

    public e(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Paint paint = new Paint(1);
        paint.setColor(C35835l0.d(R.attr.constantBlack, context));
        paint.setAlpha(184);
        this.f219293b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(1.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(C35835l0.d(R.attr.constantWhite, context));
        paint2.setAlpha(64);
        this.f219294c = paint2;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        RectF rectF;
        float[] fArr;
        RectF rectF2 = this.f219295d;
        if (rectF2 == null || (rectF = this.f219296e) == null || (fArr = this.f219297f) == null) {
            return;
        }
        Paint paint = this.f219293b;
        canvas.drawRect(rectF2, paint);
        canvas.drawRect(rectF, paint);
        canvas.drawLines(fArr, this.f219294c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        float fMin = Math.min(i12, i13);
        float fAbs = Math.abs(i12 - i13) / 2.0f;
        float f12 = i12 > i13 ? fAbs : 0.0f;
        float f13 = i12 <= i13 ? fAbs : 0.0f;
        this.f219295d = i12 > i13 ? new RectF(getLeft(), getTop(), getLeft() + fAbs, getBottom()) : new RectF(getLeft(), getTop(), getRight(), getTop() + fAbs);
        this.f219296e = i12 > i13 ? new RectF(getRight() - fAbs, getTop(), getRight(), getBottom()) : new RectF(getLeft(), getBottom() - fAbs, getRight(), getBottom());
        float f14 = fMin / 3.0f;
        float f15 = f13 + f14;
        float f16 = f12 + fMin;
        float f17 = 2 * f14;
        float f18 = f13 + f17;
        float f19 = f14 + f12;
        float f22 = fMin + f13;
        float f23 = f17 + f12;
        this.f219297f = new float[]{f12, f15, f16, f15, f12, f18, f16, f18, f19, f13, f19, f22, f23, f13, f23, f22};
    }
}
