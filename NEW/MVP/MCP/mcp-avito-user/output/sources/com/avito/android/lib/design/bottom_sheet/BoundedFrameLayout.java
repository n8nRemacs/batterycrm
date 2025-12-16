package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.lib.design.d;
import kotlin.Metadata;

/* compiled from: BoundedFrameLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/BoundedFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BoundedFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final p f178501b;

    /* renamed from: c, reason: collision with root package name */
    public final p f178502c;

    public BoundedFrameLayout(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178972i);
        this.f178501b = new p(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1));
        this.f178502c = new p(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        p pVar = this.f178501b;
        if (pVar == null) {
            pVar = null;
        }
        int iA2 = pVar.a(i12);
        p pVar2 = this.f178502c;
        super.onMeasure(iA2, (pVar2 != null ? pVar2 : null).a(i13));
    }
}
