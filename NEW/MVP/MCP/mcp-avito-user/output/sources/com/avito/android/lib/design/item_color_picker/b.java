package com.avito.android.lib.design.item_color_picker;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemColorAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/lib/design/item_color_picker/b$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final j f179473c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f179474d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f179475e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f179476f = new ArrayList();

    /* compiled from: ItemColorAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/item_color_picker/b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {
    }

    public b(@Y61.k j jVar, boolean z12, boolean z13) {
        this.f179473c = jVar;
        this.f179474d = z12;
        this.f179475e = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f179476f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        j jVar = this.f179473c;
        boolean zC2 = jVar.c(i12);
        boolean z12 = this.f179474d;
        ArrayList arrayList = this.f179476f;
        boolean z13 = z12 && (!jVar.b() || jVar.c(i12)) && ((com.avito.android.lib.design.item_color_picker.a) arrayList.get(i12)).isEnabled();
        ItemColorView itemColorView = (ItemColorView) aVar.itemView;
        itemColorView.setEnabled(z13);
        itemColorView.setSelected(zC2);
        itemColorView.setColors((com.avito.android.lib.design.item_color_picker.a) arrayList.get(i12));
        if (!this.f179475e) {
            itemColorView.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i12, 3, this));
        }
        ViewGroup.LayoutParams layoutParams = itemColorView.getLayoutParams();
        if (layoutParams instanceof FlexboxLayoutManager.LayoutParams) {
            ((FlexboxLayoutManager.LayoutParams) layoutParams).f348468f = 3.0f;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.design_item_color_viewholder_layout, viewGroup, false));
    }
}
