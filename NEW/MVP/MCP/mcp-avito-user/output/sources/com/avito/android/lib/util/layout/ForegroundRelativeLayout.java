package com.avito.android.lib.util.layout;

import RV.a;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForegroundRelativeLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/util/layout/ForegroundRelativeLayout;", "Landroid/widget/RelativeLayout;", "LRV/a;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setForegroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ForegroundRelativeLayout extends RelativeLayout implements a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Drawable f181409b;

    @j
    public ForegroundRelativeLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@k Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = this.f181409b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f181409b;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        Drawable drawable = this.f181409b;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // RV.a
    public void setForegroundDrawable(@l Drawable drawable) {
        this.f181409b = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        invalidate();
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f181409b = null;
    }
}
