package com.avito.android.lib.util.layout;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatioForegroundFrameLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/lib/util/layout/RatioForegroundFrameLayout;", "Lcom/avito/android/lib/util/layout/ForegroundFrameLayout;", "", "aRatio", "Lkotlin/G0;", "setRatio", "(F)V", "<set-?>", "c", "F", "getRatio", "()F", "ratio", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class RatioForegroundFrameLayout extends ForegroundFrameLayout {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float ratio;

    @j
    public RatioForegroundFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        float f12 = this.ratio;
        if (f12 == -1.0f || size <= 0 || mode == 0) {
            super.onMeasure(i12, i13);
        } else {
            super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824));
        }
    }

    public final void setRatio(float aRatio) {
        this.ratio = aRatio;
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RatioForegroundFrameLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.ratio = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178995t0);
        this.ratio = typedArrayObtainStyledAttributes.getFloat(2, -1.0f) / typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        v.a(this, typedArrayObtainStyledAttributes.getDimension(0, 1.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
