package com.avito.android.location_picker.view.radius;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.lib.util.x;
import com.avito.android.location_picker.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadiusCircleView.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/location_picker/view/radius/RadiusCircleViewImpl;", "Landroid/view/View;", "Lcom/avito/android/location_picker/view/radius/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "radius", "Lkotlin/G0;", "setRadius", "(F)V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RadiusCircleViewImpl extends View implements b {

    /* renamed from: b, reason: collision with root package name */
    public float f182782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Paint f182783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Paint f182784d;

    public RadiusCircleViewImpl(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f182782b = 400.0f;
        Paint paint = new Paint(1);
        this.f182783c = paint;
        Paint paint2 = new Paint(1);
        this.f182784d = paint2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, S0.h.f182185a);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, getContext(), 0);
        ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes, getContext(), 1);
        float dimension = typedArrayObtainStyledAttributes.getDimension(2, 2.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (colorStateListA != null) {
            paint.setColor(colorStateListA.getDefaultColor());
        }
        paint.setStyle(Paint.Style.FILL);
        if (colorStateListA2 != null) {
            paint2.setColor(colorStateListA2.getDefaultColor());
        }
        paint2.setStrokeWidth(dimension);
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        float fWidth = canvas.getClipBounds().width() / 2.0f;
        float fHeight = canvas.getClipBounds().height() / 2.0f;
        canvas.drawCircle(fWidth, fHeight, this.f182782b, this.f182783c);
        canvas.drawCircle(fWidth, fHeight, this.f182782b, this.f182784d);
    }

    public void setRadius(float radius) {
        this.f182782b = radius;
        invalidate();
    }
}
