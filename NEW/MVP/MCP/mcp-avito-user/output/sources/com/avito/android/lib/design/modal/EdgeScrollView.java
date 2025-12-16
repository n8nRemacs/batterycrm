package com.avito.android.lib.design.modal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import kotlin.Metadata;

/* compiled from: EdgeScrollView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/modal/EdgeScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EdgeScrollView extends ScrollView {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Drawable f179684b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Drawable f179685c;

    public EdgeScrollView(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        super.dispatchDraw(canvas);
        View childAt = getChildAt(0);
        int iComputeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        Drawable drawable = this.f179685c;
        if (drawable != null) {
            drawable.setBounds(iComputeHorizontalScrollOffset, (getMeasuredHeight() + iComputeVerticalScrollOffset) - (childAt != null ? childAt.getPaddingBottom() : 0), getMeasuredWidth() + iComputeHorizontalScrollOffset, getMeasuredHeight() + iComputeVerticalScrollOffset);
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f179684b;
        if (drawable2 != null) {
            drawable2.setBounds(iComputeHorizontalScrollOffset, iComputeVerticalScrollOffset, getMeasuredWidth() + iComputeHorizontalScrollOffset, (childAt != null ? childAt.getPaddingTop() : 0) + iComputeVerticalScrollOffset);
            drawable2.draw(canvas);
        }
    }
}
