package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.avito.android.lib.design.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BoundedLinearLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/BoundedLinearLayout;", "Landroid/widget/LinearLayout;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BoundedLinearLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f178503b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f178504c;

    @X41.j
    public BoundedLinearLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(this.f178503b.a(i12), this.f178504c.a(i13));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178974j, i12, i13);
        this.f178503b = new p(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1));
        this.f178504c = new p(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1));
        typedArrayObtainStyledAttributes.recycle();
    }
}
