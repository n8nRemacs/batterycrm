package com.avito.android.section.complementary;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ComplementarySnapHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/complementary/g;", "LSV/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends SV.c {

    /* renamed from: k, reason: collision with root package name */
    public final int f264643k;

    public g(int i12) {
        super(8388611, 0, 2, null);
        this.f264643k = i12;
    }

    @Override // SV.a, androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @k
    public final int[] c(@k RecyclerView.m mVar, @k View view) {
        int[] iArrC = super.c(mVar, view);
        int i12 = ((RecyclerView.n) view.getLayoutParams()).f53859c.left;
        int i13 = this.f264643k;
        if (i12 >= i13) {
            iArrC[0] = iArrC[0] + i13;
        }
        return iArrC;
    }

    @Override // SV.a
    public final int m(@k LinearLayoutManager linearLayoutManager, @k I i12) {
        int iK1 = linearLayoutManager.K1();
        return (iK1 != -1 && i12.d(linearLayoutManager.Z(iK1)) <= this.f264643k) ? linearLayoutManager.H1() : iK1;
    }

    @Override // SV.a
    public final float o(@l View view, @k I i12) {
        if (view == null) {
            return 0.0f;
        }
        int i13 = ((RecyclerView.n) view.getLayoutParams()).f53859c.left;
        int iD2 = i12.d(view) - (i13 == 0 ? this.f264643k : 0);
        int iM2 = i12.m();
        float fE2 = i12.e(view);
        float f12 = (iD2 - iM2) / fE2;
        float f13 = i13 / fE2;
        if (f12 < 1.0f) {
            return f12 + (f13 > 0.0f ? (-f13) / 2 : 0.0f);
        }
        return f12;
    }
}
