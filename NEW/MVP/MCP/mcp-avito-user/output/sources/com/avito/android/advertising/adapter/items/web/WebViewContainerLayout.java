package com.avito.android.advertising.adapter.items.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WebViewContainerLayout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/WebViewContainerLayout;", "Landroid/view/ViewGroup;", "", "aRatio", "Lkotlin/G0;", "setRatio", "(F)V", "", "aMaxWidth", "setMaxChildWidth", "(I)V", "<set-?>", "b", "F", "getRatio", "()F", "ratio", "c", "I", "getMaxWidth", "()I", "maxWidth", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WebViewContainerLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float ratio;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxWidth;

    @X41.j
    public WebViewContainerLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i14 - i12, i15 - i13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i13);
        int i14 = this.maxWidth;
        if (i14 != -1 && mode == 1073741824) {
            size = Math.min(size, i14);
            i12 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            mode = 1073741824;
        }
        float f12 = this.ratio;
        if (f12 != -1.0f && size > 0 && mode != 0 && (mode2 != 1073741824 || size2 == 0)) {
            super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824));
        } else {
            super.onMeasure(i12, i13);
        }
    }

    public final void setMaxChildWidth(int aMaxWidth) {
        this.maxWidth = aMaxWidth;
        requestLayout();
    }

    public final void setRatio(float aRatio) {
        this.ratio = aRatio;
        requestLayout();
    }

    public WebViewContainerLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.ratio = -1.0f;
        this.maxWidth = -1;
    }
}
