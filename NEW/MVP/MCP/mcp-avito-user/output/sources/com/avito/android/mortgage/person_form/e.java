package com.avito.android.mortgage.person_form;

import Y61.k;
import Y61.l;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C23434z;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: MortgagePersonFormView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/e;", "Landroidx/recyclerview/widget/z;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends C23434z {
    @Override // androidx.recyclerview.widget.C23434z
    public final int i(@l View view, int i12) {
        int i13 = super.i(view, i12);
        if (view != null && view.getTop() > 0 && view.getTop() < Math.abs(i13)) {
            i13 = -view.getTop();
        }
        return y6.b(36) + i13;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final float j(@k DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int n() {
        return -1;
    }
}
