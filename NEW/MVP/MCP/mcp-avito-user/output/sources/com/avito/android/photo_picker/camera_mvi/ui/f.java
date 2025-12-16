package com.avito.android.photo_picker.camera_mvi.ui;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectedPhotosView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/ui/f;", "Landroid/view/View;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends View {

    /* renamed from: b, reason: collision with root package name */
    public final float f219298b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f219299c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f219300d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Bitmap f219301e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public RectF f219302f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Path f219303g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public InterfaceC28373a f219304h;

    public f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f219298b = y6.b(12);
        float fB2 = y6.b(2);
        this.f219299c = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(C35835l0.d(R.attr.constantBlack, context));
        paint.setStrokeWidth(fB2);
        paint.setStyle(Paint.Style.STROKE);
        this.f219300d = paint;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        RectF rectF;
        Path path;
        Bitmap bitmap = this.f219301e;
        if (bitmap == null || (rectF = this.f219302f) == null || (path = this.f219303g) == null || bitmap.isRecycled()) {
            return;
        }
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f219299c);
        canvas.drawPath(path, this.f219300d);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        RectF rectF = new RectF(0.0f, 0.0f, i12, i13);
        this.f219302f = rectF;
        Path path = new Path();
        float f12 = this.f219298b;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        this.f219303g = path;
    }
}
