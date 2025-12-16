package com.avito.android.recycler.layout_manager;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UnpredictiveStaticHeightLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recycler/layout_manager/UnpredictiveStaticHeightLayoutManager;", "Lcom/avito/android/recycler/layout_manager/UnpredictiveLinearLayoutManager;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UnpredictiveStaticHeightLayoutManager extends UnpredictiveLinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public int f252355G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f252356H;

    /* renamed from: I, reason: collision with root package name */
    public int f252357I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f252358J;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void V0(@l RecyclerView.z zVar) {
        Y41.l<? super Integer, G0> lVar = this.f252358J;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.f252355G));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void q1(@k Rect rect, int i12, int i13) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        int iL2 = RecyclerView.m.L(i12, paddingRight, s0());
        int iL3 = RecyclerView.m.L(i13, paddingBottom, r0());
        this.f252355G = iL3;
        if (this.f252356H) {
            iL3 = this.f252357I;
        }
        this.f53837c.setMeasuredDimension(iL2, iL3);
    }
}
