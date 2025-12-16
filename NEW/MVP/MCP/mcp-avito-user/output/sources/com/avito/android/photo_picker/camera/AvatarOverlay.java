package com.avito.android.photo_picker.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_picker.P;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: AvatarOverlay.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_picker/camera/AvatarOverlay;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvatarOverlay extends View {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Paint f218907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f218908c;

    /* renamed from: d, reason: collision with root package name */
    public final int f218909d;

    /* renamed from: e, reason: collision with root package name */
    public final int f218910e;

    /* renamed from: f, reason: collision with root package name */
    public float f218911f;

    /* renamed from: g, reason: collision with root package name */
    public float f218912g;

    /* renamed from: h, reason: collision with root package name */
    public float f218913h;

    public AvatarOverlay(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        paint.setColor(C35835l0.d(R.attr.black, getContext()));
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f218907b = paint;
        setLayerType(1, null);
        this.f218910e = C35835l0.d(R.attr.transparentWhite, getContext());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, P.j.f218777a);
            this.f218908c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f218909d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f218910e = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.f218910e);
        canvas.drawCircle(this.f218911f, this.f218912g, this.f218913h, this.f218907b);
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        this.f218913h = Math.min(i16 - (this.f218908c * 2), i17 - (this.f218909d * 2)) / 2;
        this.f218911f = (i16 / 2) + i12;
        this.f218912g = (i17 / 2) + i13;
    }
}
