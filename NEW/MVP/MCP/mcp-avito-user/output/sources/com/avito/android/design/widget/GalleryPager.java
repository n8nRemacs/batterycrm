package com.avito.android.design.widget;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.ui.SafeViewPager;
import hw.InterfaceC41177b;
import kG0.C42580a;
import kotlin.Metadata;

/* compiled from: GalleryPager.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/design/widget/GalleryPager;", "Lcom/avito/android/ui/SafeViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "aRatio", "Lkotlin/G0;", "setRatio", "(F)V", "<set-?>", "j0", "F", "getRatio", "()F", "ratio", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class GalleryPager extends SafeViewPager {

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public float ratio;

    public GalleryPager(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ratio = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406217g);
        this.ratio = typedArrayObtainStyledAttributes.getFloat(1, -1.0f) / typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i12, int i13) throws Resources.NotFoundException {
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        float f12 = this.ratio;
        if (f12 != -1.0f && size > 0 && mode != 0) {
            if (f12 == -1.0f || size <= 0 || mode == 0) {
                super.onMeasure(i12, i13);
                return;
            } else {
                super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824));
                return;
            }
        }
        super.onMeasure(i12, i13);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z12 = layoutParams.width == -2;
        boolean z13 = layoutParams.height == -2;
        int childCount = getChildCount();
        if ((z12 || z13) && childCount > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i12, i13);
            if (z13) {
                i13 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824);
            }
            if (z12) {
                i12 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824);
            }
        }
        super.onMeasure(i12, i13);
    }

    public final void setRatio(float aRatio) {
        this.ratio = aRatio;
        requestLayout();
    }
}
