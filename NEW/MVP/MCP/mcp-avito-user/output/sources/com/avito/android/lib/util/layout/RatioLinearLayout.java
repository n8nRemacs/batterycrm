package com.avito.android.lib.util.layout;

import RV.b;
import RV.d;
import RV.e;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;

/* compiled from: RatioLinearLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/lib/util/layout/RatioLinearLayout;", "Landroid/widget/LinearLayout;", "LRV/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "ratio", "Lkotlin/G0;", "setRatio", "(F)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatioLinearLayout extends LinearLayout implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f181416b;

    public RatioLinearLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181416b = new e(this);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        b bVarA = this.f181416b.a(i12, i13);
        super.onMeasure(bVarA.f14473a, bVarA.f14474b);
    }

    public void setRatio(float ratio) {
        this.f181416b.b(ratio);
    }
}
