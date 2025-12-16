package ru.avito.component.serp;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: FixedWidthLinearLayoutManager.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/FixedWidthLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FixedWidthLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final int f430440G;

    public FixedWidthLinearLayoutManager(int i12, @k Context context) {
        super(0, false);
        this.f430440G = i12;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        ((ViewGroup.MarginLayoutParams) nVarA0).width = this.f430440G;
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n b0(@l Context context, @l AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        ((ViewGroup.MarginLayoutParams) nVar).width = this.f430440G;
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n c0(@l ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        ((ViewGroup.MarginLayoutParams) nVarC0).width = this.f430440G;
        return nVarC0;
    }
}
