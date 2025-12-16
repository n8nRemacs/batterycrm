package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import kotlin.Metadata;

/* compiled from: BoundedViewSpecCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/p;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f178561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178562b;

    public p(int i12, int i13) {
        this.f178561a = i12;
        this.f178562b = i13;
    }

    public final int a(int i12) {
        int size = View.MeasureSpec.getSize(i12);
        int i13 = this.f178561a;
        if (i13 >= 0) {
            size = Math.max(i13, size);
        }
        int i14 = this.f178562b;
        if (i14 >= 0) {
            size = Math.min(size, i14);
        }
        return View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i12));
    }
}
