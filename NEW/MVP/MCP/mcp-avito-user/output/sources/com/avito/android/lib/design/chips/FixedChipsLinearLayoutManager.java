package com.avito.android.lib.design.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: FixedChipsLinearLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/FixedChipsLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FixedChipsLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f178709G;

    /* renamed from: H, reason: collision with root package name */
    public final int f178710H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f178711I;

    public FixedChipsLinearLayoutManager(@Y61.k Context context, int i12, int i13, boolean z12) {
        super(0, false);
        this.f178709G = i12;
        this.f178710H = i13;
        this.f178711I = z12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@Y61.l RecyclerView.n nVar) {
        return nVar != null && ((ViewGroup.MarginLayoutParams) nVar).width == h2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        ((ViewGroup.MarginLayoutParams) nVarA0).width = h2();
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        ((ViewGroup.MarginLayoutParams) nVar).width = h2();
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.k ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        ((ViewGroup.MarginLayoutParams) nVarC0).width = h2();
        return nVarC0;
    }

    public final int h2() {
        int iMax = Math.max((((this.f53850p - getPaddingRight()) - getPaddingLeft()) - ((o0() - 1) * this.f178709G)) / o0(), 0);
        if (!this.f178711I || iMax < this.f178710H) {
            return -2;
        }
        return iMax;
    }
}
