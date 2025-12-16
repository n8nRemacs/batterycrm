package com.avito.android.lib.design.item_color_picker;

import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: FixedItemColorPickerLinearLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/FixedItemColorPickerLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FixedItemColorPickerLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@l RecyclerView.n nVar) {
        return nVar != null && ((ViewGroup.MarginLayoutParams) nVar).width == -2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        ((ViewGroup.MarginLayoutParams) nVarA0).width = -2;
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.k Context context, @l AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        ((ViewGroup.MarginLayoutParams) nVar).width = -2;
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.k ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        ((ViewGroup.MarginLayoutParams) nVarC0).width = -2;
        return nVarC0;
    }
}
