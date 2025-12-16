package com.avito.android.lib.util.layout;

import RV.b;
import RV.d;
import RV.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.avito.android.lib.design.d;
import kotlin.Metadata;

/* compiled from: RatioFrameLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/util/layout/RatioFrameLayout;", "Landroid/widget/FrameLayout;", "LRV/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "ratio", "Lkotlin/G0;", "setRatio", "(F)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatioFrameLayout extends FrameLayout implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f181415b;

    public RatioFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        e eVar = new e(this);
        this.f181415b = eVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178997u0);
        int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
        int i13 = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (i13 == 0) {
            eVar.b(0.0f);
        } else {
            eVar.b(i12 / i13);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        b bVarA = this.f181415b.a(i12, i13);
        super.onMeasure(bVarA.f14473a, bVarA.f14474b);
    }

    public void setRatio(float ratio) {
        this.f181415b.b(ratio);
    }
}
