package com.avito.android.bottom_sheet_group.items.multiselect_item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetMultiselectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/multiselect_item/h;", "Lcom/avito/android/bottom_sheet_group/items/multiselect_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f107379h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f107380b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f107381c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f107382d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public j f107383e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107384f;

    /* renamed from: g, reason: collision with root package name */
    public final int f107385g;

    public h(@k View view) {
        super(view);
        this.f107380b = (TextView) view.findViewById(R.id.multiselect_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bottom_sheet_group_multiselect_items_list);
        this.f107381c = recyclerView;
        View viewFindViewById = view.findViewById(R.id.more_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f107382d = (TextView) viewFindViewById;
        this.f107384f = view.getResources().getDimensionPixelSize(R.dimen.filter_item_bottom_sheet_group_title_first_item_top_margin);
        this.f107385g = view.getResources().getDimensionPixelSize(R.dimen.filter_item_bottom_sheet_group_title_top_margin);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.bottom_sheet_group.items.multiselect_item.g
    public final void ry() {
        j jVar = this.f107383e;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.bottom_sheet_group.items.multiselect_item.g
    public final void tr(@k j jVar) {
        this.f107383e = jVar;
        this.f107381c.setAdapter(jVar);
    }

    @Override // com.avito.android.bottom_sheet_group.items.multiselect_item.g
    public final void y20(@k String str, boolean z12, boolean z13) {
        TextView textView = this.f107380b;
        if (z12) {
            D6.w(textView);
            return;
        }
        if (z13) {
            D6.c(this.f107380b, null, Integer.valueOf(this.f107384f), null, null, 13);
        } else {
            D6.c(this.f107380b, null, Integer.valueOf(this.f107385g), null, null, 13);
        }
        D6.H(textView);
        textView.setText(str);
    }

    @Override // com.avito.android.bottom_sheet_group.items.multiselect_item.g
    public final void yQ(@l String str, @l Y41.a<G0> aVar) {
        TextView textView = this.f107382d;
        I5.a(textView, str, false);
        textView.setOnClickListener(new com.avito.android.blueprint.date.interval.j(22, aVar));
    }
}
