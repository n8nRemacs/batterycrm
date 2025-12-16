package com.avito.android.autoteka.presentation.ui;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.d;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DotWithShadowView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u0017\u0010!\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lcom/avito/android/autoteka/presentation/ui/DotWithShadowView;", "Landroid/view/View;", "", "value", "b", "I", "getDotColor", "()I", "setDotColor", "(I)V", "dotColor", "c", "getShadowColor", "setShadowColor", "shadowColor", "", "d", "F", "getShadowDx", "()F", "setShadowDx", "(F)V", "shadowDx", "e", "getShadowDy", "setShadowDy", "shadowDy", "f", "getShadowBlur", "setShadowBlur", "shadowBlur", "g", "getDotRadius", "dotRadius", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DotWithShadowView extends View {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int dotColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int shadowColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float shadowDx;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float shadowDy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float shadowBlur;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final float dotRadius;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Paint f97836h;

    @j
    public DotWithShadowView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getDotColor() {
        return this.dotColor;
    }

    public final float getDotRadius() {
        return this.dotRadius;
    }

    public final float getShadowBlur() {
        return this.shadowBlur;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final float getShadowDx() {
        return this.shadowDx;
    }

    public final float getShadowDy() {
        return this.shadowDy;
    }

    @Override // android.view.View
    public final void onDraw(@k Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f97836h;
        paint.setShadowLayer(this.shadowBlur, this.shadowDx, this.shadowDy, this.shadowColor);
        paint.setColor(this.dotColor);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.dotRadius, paint);
    }

    public final void setDotColor(int i12) {
        this.dotColor = i12;
        invalidate();
    }

    public final void setShadowBlur(float f12) {
        this.shadowBlur = f12;
    }

    public final void setShadowColor(int i12) {
        this.shadowColor = i12;
        invalidate();
    }

    public final void setShadowDx(float f12) {
        this.shadowDx = f12;
    }

    public final void setShadowDy(float f12) {
        this.shadowDy = f12;
    }

    public DotWithShadowView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.dotColor = d.getColor(context, R.color.common_gray_20);
        this.shadowColor = d.getColor(context, R.color.common_clear);
        this.shadowBlur = getContext().getResources().getDisplayMetrics().density * 6.0f;
        this.dotRadius = getContext().getResources().getDisplayMetrics().density * 4.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f97836h = paint;
        setLayerType(1, null);
    }
}
