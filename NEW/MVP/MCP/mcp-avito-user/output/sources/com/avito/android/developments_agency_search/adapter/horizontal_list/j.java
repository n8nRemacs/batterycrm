package com.avito.android.developments_agency_search.adapter.horizontal_list;

import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: HorizontalListItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/horizontal_list/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/adapter/horizontal_list/i;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f136307b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f136308c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HorizontalListLayoutManager f136309d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Ow.g f136310e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f136311f;

    public j(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar) {
        super(view);
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f136307b = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f136308c = jVar;
        view.getContext();
        HorizontalListLayoutManager horizontalListLayoutManager = new HorizontalListLayoutManager();
        this.f136309d = horizontalListLayoutManager;
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(horizontalListLayoutManager);
        this.f136311f = recyclerView;
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.i
    public final void E5(@Y61.k List<? extends com.avito.conveyor_item.a> list) {
        this.f136307b.f338510e = new UV0.c(list);
        this.f136308c.notifyDataSetChanged();
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.i
    public final void hm(@l Float f12) {
        float fFloatValue = f12 != null ? f12.floatValue() : 0.0f;
        HorizontalListLayoutManager horizontalListLayoutManager = this.f136309d;
        horizontalListLayoutManager.getClass();
        horizontalListLayoutManager.f136289G = s.f(fFloatValue, 0.0f, 1.0f);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Ow.g gVar = this.f136310e;
        RecyclerView recyclerView = this.f136311f;
        if (gVar != null) {
            recyclerView.v0(gVar);
        }
        C35976x4.a(recyclerView);
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.i
    public final void lX(int i12) {
        this.f136309d.f136290H = y6.b(i12);
        this.f136311f.l(new com.avito.android.profile.horizontal_scroll_widget.a(0, 0, y6.b(i12) / 2, 3, null), -1);
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.i
    public final void qc(@Y61.k Y41.l<? super Integer, G0> lVar) {
        Ow.g gVar = new Ow.g(lVar);
        this.f136310e = gVar;
        this.f136311f.o(gVar);
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.i
    public final void wB(int i12, int i13) {
        D6.f(this.f136311f, y6.b(i12), 0, y6.b(i13), 0, 10);
    }
}
