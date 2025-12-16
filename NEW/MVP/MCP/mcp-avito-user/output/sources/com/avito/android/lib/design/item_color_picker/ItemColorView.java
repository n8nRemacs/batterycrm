package com.avito.android.lib.design.item_color_picker;

import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ItemColorView.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/ItemColorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/lib/design/item_color_picker/a;", "itemColor", "Lkotlin/G0;", "setColors", "(Lcom/avito/android/lib/design/item_color_picker/a;)V", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemColorView extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final Paint paint;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f179454c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Integer f179455d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Integer f179456e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Map<Float, Integer> f179457f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179458g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179459h;

    /* renamed from: i, reason: collision with root package name */
    public final int f179460i;

    /* renamed from: j, reason: collision with root package name */
    public final int f179461j;

    /* renamed from: k, reason: collision with root package name */
    public final int f179462k;

    /* renamed from: l, reason: collision with root package name */
    public final int f179463l;

    public ItemColorView(@Y61.k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chips);
        this.paint = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178915D, R.attr.chips, R.style.Design_Widget_ItemColor_Item);
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f179458g = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f179459h = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f179460i = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f179461j = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f179462k = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f179463l = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Y61.k
    public final Paint getPaint() {
        return this.paint;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.paint;
        paint.setStyle(Paint.Style.FILL);
        Map<Float, Integer> map = this.f179457f;
        if (map == null || map.isEmpty()) {
            Integer num = this.f179454c;
            if (num != null) {
                paint.setColor(num.intValue());
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, isSelected() ? this.f179458g : this.f179461j, paint);
            }
        } else {
            Map<Float, Integer> map2 = this.f179457f;
            if (map2 != null) {
                paint.setShader(new LinearGradient(36.0f, 0.0f, 0.0f, 36.0f, C42745f0.L0(map2.values()), C42745f0.J0(map2.keySet()), Shader.TileMode.CLAMP));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, isSelected() ? this.f179458g : this.f179461j, paint);
                paint.setShader(null);
            }
        }
        paint.setStyle(Paint.Style.STROKE);
        if (isSelected()) {
            Integer num2 = this.f179456e;
            if (num2 != null) {
                paint.setColor(num2.intValue());
                paint.setStrokeWidth(this.f179460i);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f179459h - 2, paint);
                return;
            }
            return;
        }
        Integer num3 = this.f179455d;
        if (num3 != null) {
            paint.setColor(num3.intValue());
            paint.setStrokeWidth(this.f179463l);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f179462k, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(getMinimumWidth(), getMinimumHeight());
    }

    public final void setColors(@Y61.k a itemColor) {
        this.f179454c = itemColor.c();
        itemColor.a();
        this.f179455d = itemColor.getStrokeColor();
        this.f179456e = itemColor.e();
        this.f179457f = itemColor.d();
        invalidate();
    }
}
