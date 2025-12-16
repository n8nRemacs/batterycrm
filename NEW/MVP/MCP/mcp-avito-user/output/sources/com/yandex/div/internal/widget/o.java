package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SeparatorView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0010\u0018\u00002\u00020\u0001:\u0001!J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R*\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0006R2\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0006R$\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0006¨\u0006\""}, d2 = {"Lcom/yandex/div/internal/widget/o;", "Landroid/view/View;", "", "resId", "Lkotlin/G0;", "setDividerColorResource", "(I)V", "setDividerHeightResource", "", "value", "e", "Z", "isHorizontal", "()Z", "setHorizontal", "(Z)V", "height", "f", "I", "getDividerThickness", "()I", "setDividerThickness", "dividerThickness", "dividerGravity", "g", "getDividerGravity", "setDividerGravity", "getDividerGravity$annotations", "()V", "color", "getDividerColor", "setDividerColor", "dividerColor", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class o extends View {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Paint f370323b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Rect f370324c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f370325d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isHorizontal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int dividerThickness;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int dividerGravity;

    /* compiled from: SeparatorView.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/widget/o$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public @interface a {
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    public final int getDividerColor() {
        return this.f370323b.getColor();
    }

    public final int getDividerGravity() {
        return this.dividerGravity;
    }

    public final int getDividerThickness() {
        return this.dividerThickness;
    }

    @Override // android.view.View
    public final void onDraw(@Y61.k Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f370323b;
        if (Color.alpha(paint.getColor()) > 0) {
            boolean z12 = this.f370325d;
            Rect rect = this.f370324c;
            if (z12) {
                int paddingTop = this.isHorizontal ? getPaddingTop() : getPaddingLeft();
                int paddingBottom = this.isHorizontal ? getPaddingBottom() : getPaddingRight();
                int height = this.isHorizontal ? getHeight() : getWidth();
                int i12 = (height - paddingTop) - paddingBottom;
                int i13 = this.dividerGravity;
                if (i13 == 17) {
                    paddingTop = androidx.appcompat.app.r.f(i12, this.dividerThickness, 2, paddingTop);
                } else if (i13 != 8388611) {
                    paddingTop = i13 != 8388613 ? 0 : (height - paddingBottom) - this.dividerThickness;
                }
                if (this.isHorizontal) {
                    rect.top = paddingTop;
                    rect.bottom = Math.min(i12, this.dividerThickness) + paddingTop;
                    rect.left = getPaddingLeft();
                    rect.right = getWidth() - getPaddingRight();
                } else {
                    rect.left = paddingTop;
                    rect.right = Math.min(i12, this.dividerThickness) + paddingTop;
                    rect.top = getPaddingTop();
                    rect.bottom = getHeight() - getPaddingBottom();
                }
                this.f370325d = false;
            }
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.isHorizontal) {
            paddingBottom += this.dividerThickness;
        } else {
            paddingRight += this.dividerThickness;
        }
        int iMax = Math.max(paddingRight, getSuggestedMinimumWidth());
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == Integer.MIN_VALUE) {
            iMax = Math.min(iMax, size);
        } else if (mode == 1073741824) {
            iMax = size;
        }
        int iMax2 = Math.max(paddingBottom, getSuggestedMinimumHeight());
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (mode2 == Integer.MIN_VALUE) {
            iMax2 = Math.min(iMax2, size2);
        } else if (mode2 == 1073741824) {
            iMax2 = size2;
        }
        setMeasuredDimension(iMax, iMax2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        this.f370325d = true;
    }

    public final void setDividerColor(int i12) {
        Paint paint = this.f370323b;
        if (paint.getColor() != i12) {
            paint.setColor(i12);
            invalidate();
        }
    }

    public final void setDividerColorResource(@InterfaceC42158n int resId) {
        setDividerColor(androidx.core.content.d.getColor(getContext(), resId));
    }

    public final void setDividerGravity(@a int i12) {
        if (this.dividerGravity != i12) {
            this.dividerGravity = i12;
            this.f370325d = true;
            invalidate();
        }
    }

    public final void setDividerHeightResource(@InterfaceC42161q int resId) {
        setDividerThickness(getResources().getDimensionPixelSize(resId));
    }

    public final void setDividerThickness(int i12) {
        if (this.dividerThickness != i12) {
            this.dividerThickness = i12;
            this.f370325d = true;
            requestLayout();
        }
    }

    public final void setHorizontal(boolean z12) {
        if (this.isHorizontal != z12) {
            this.isHorizontal = z12;
            this.f370325d = true;
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i12, int i13, int i14, int i15) {
        super.setPadding(i12, i13, i14, i15);
        this.f370325d = true;
    }

    @X41.j
    public o(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        Paint paint = new Paint();
        paint.setColor(0);
        this.f370323b = paint;
        this.f370324c = new Rect();
        this.isHorizontal = true;
        this.dividerGravity = 17;
    }

    @a
    public static /* synthetic */ void getDividerGravity$annotations() {
    }
}
