package com.avito.android.lib.util.layout;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.d;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: OffsetLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/util/layout/OffsetLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OffsetLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public int f181410b;

    /* renamed from: c, reason: collision with root package name */
    public int f181411c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f181412d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f181413e;

    public OffsetLayout(@k Context context) {
        super(context);
        this.f181412d = new ArrayList();
        this.f181413e = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, d.n.f178961c0);
        this.f181410b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, this.f181410b);
        this.f181411c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, this.f181411c);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            int iIntValue = ((Number) this.f181412d.get(i16)).intValue() + getPaddingLeft();
            int iIntValue2 = ((Number) this.f181413e.get(i16)).intValue() + getPaddingTop();
            childAt.layout(iIntValue, iIntValue2, childAt.getMeasuredWidth() + iIntValue, childAt.getMeasuredHeight() + iIntValue2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        ArrayList arrayList = this.f181412d;
        arrayList.clear();
        ArrayList arrayList2 = this.f181413e;
        arrayList2.clear();
        int size = (View.MeasureSpec.getSize(i12) - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredWidth > size - i16) {
                if (i15 > 0) {
                    i14 += i15 + this.f181410b;
                }
                i15 = 0;
                i16 = 0;
            }
            arrayList.add(i17, Integer.valueOf(i16));
            arrayList2.add(i17, Integer.valueOf(i14));
            i16 += measuredWidth + this.f181411c;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i14 + i15, 1073741824));
    }

    public OffsetLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181412d = new ArrayList();
        this.f181413e = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178961c0);
        this.f181410b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, this.f181410b);
        this.f181411c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, this.f181411c);
        typedArrayObtainStyledAttributes.recycle();
    }
}
