package com.avito.android.profile_settings_extended.adapter.universal.section;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetPreviewFrameLayout.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/section/UniversalWidgetPreviewFrameLayout;", "Landroid/widget/FrameLayout;", "", "unlimitedWidth", "Lkotlin/G0;", "setUnlimitedWidth", "(Z)V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UniversalWidgetPreviewFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public float f229912b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f229913c;

    @X41.j
    public UniversalWidgetPreviewFrameLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        float f12 = this.f229912b;
        int iSave = canvas.save();
        canvas.scale(f12, f12, 0.0f, 0.0f);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        View childAt = getChildAt(0);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        float width = getWidth();
        float f12 = this.f229912b;
        int i16 = (int) (((width - (measuredWidth * f12)) / 2.0f) / f12);
        float height = getHeight();
        float f13 = this.f229912b;
        int i17 = (int) (((height - (measuredHeight * f13)) / 2.0f) / f13);
        childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        if (getChildCount() != 1) {
            super.onMeasure(i12, i13);
            return;
        }
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        View childAt = getChildAt(0);
        if (this.f229913c) {
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
        }
        this.f229912b = Math.min(size2 / childAt.getMeasuredHeight(), Math.min(size / childAt.getMeasuredWidth(), 1.0f));
        setMeasuredDimension(size, size2);
    }

    public final void setUnlimitedWidth(boolean unlimitedWidth) {
        this.f229913c = unlimitedWidth;
    }

    public UniversalWidgetPreviewFrameLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f229912b = 1.0f;
    }
}
