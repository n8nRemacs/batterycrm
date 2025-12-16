package com.avito.android.advert_details_items.neighboring_dates.tools;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NeighboringDatesChipsSnapHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/tools/c;", "Landroidx/recyclerview/widget/A;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends A {

    /* renamed from: f, reason: collision with root package name */
    public final int f84961f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public I f84962g;

    public c() {
        this(0, 1, null);
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @k
    public final int[] c(@k RecyclerView.m mVar, @k View view) {
        int iG2;
        int iM2;
        int[] iArr = new int[2];
        iArr[1] = 0;
        if (mVar.I()) {
            I iA2 = this.f84962g;
            if (iA2 == null) {
                iA2 = I.a(mVar);
                this.f84962g = iA2;
            }
            if (RecyclerView.m.t0(view) == 0) {
                iG2 = iA2.g(view);
                iM2 = iA2.m();
            } else {
                iG2 = iA2.g(view) - iA2.m();
                iM2 = this.f84961f;
            }
            iArr[0] = iG2 - iM2;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @l
    public final View f(@k RecyclerView.m mVar) {
        int iAbs;
        View view = null;
        LinearLayoutManager linearLayoutManager = mVar instanceof LinearLayoutManager ? (LinearLayoutManager) mVar : null;
        if (linearLayoutManager == null) {
            return null;
        }
        I iA2 = this.f84962g;
        if (iA2 == null) {
            iA2 = I.a(mVar);
            this.f84962g = iA2;
        }
        int iK1 = linearLayoutManager.K1();
        if (iK1 == -1) {
            return null;
        }
        int iE02 = linearLayoutManager.e0();
        int iM2 = iA2.m() + (iK1 == 0 ? 0 : this.f84961f);
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < iE02; i13++) {
            View viewD0 = linearLayoutManager.d0(i13);
            if (viewD0 != null && (iAbs = Math.abs(iA2.g(viewD0) - iM2)) < i12) {
                view = viewD0;
                i12 = iAbs;
            }
        }
        return view;
    }

    public c(int i12, int i13, C42822w c42822w) {
        this.f84961f = (i13 & 1) != 0 ? y6.b(16) : i12;
    }
}
