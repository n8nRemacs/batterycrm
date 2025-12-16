package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/f;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f77915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f77916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f77917c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77918d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f77919e;

    public f(@k View view, @k com.avito.konveyor.a aVar, @k com.avito.konveyor.adapter.a aVar2) {
        this.f77915a = aVar2;
        View viewFindViewById = view.findViewById(R.id.search);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f77916b = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f77917c = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.empty_stub);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77918d = (TextView) viewFindViewById3;
        this.f77919e = new com.jakewharton.rxrelay3.c<>();
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar));
    }

    public final void a(@k List<? extends com.avito.conveyor_item.a> list) {
        D6.w(this.f77918d);
        RecyclerView recyclerView = this.f77917c;
        D6.H(recyclerView);
        this.f77915a.c(new UV0.c(list));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
