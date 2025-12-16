package com.avito.android.developments_agency_search.screen.deal_room_development;

import Dw.e;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.lib.design.button.Button;
import com.avito.android.progress_overlay.l;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DealRoomDevelopmentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/h;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/g;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f137918a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f137919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f137920c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f137921d;

    public h(@k Y41.l lVar, @k View view, @k com.avito.konveyor.adapter.a aVar, @k com.avito.konveyor.adapter.j jVar) {
        this.f137918a = jVar;
        this.f137919b = aVar;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        toolbar.setNavigationOnClickListener(new m(22, lVar));
        View viewFindViewById2 = view.findViewById(R.id.recyclerView);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById2).setAdapter(jVar);
        View viewFindViewById3 = view.findViewById(R.id.client_fixation_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        button.setOnClickListener(new m(23, lVar));
        this.f137920c = button;
        View viewFindViewById4 = view.findViewById(R.id.progress_overlay_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f137921d = new l((ViewGroup) viewFindViewById4, R.id.recycler_view, null, 0, 0, 28, null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.g
    public final void a() {
        this.f137921d.k(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room_development.g
    public final void b(@k e.a aVar) {
        this.f137921d.j();
        this.f137919b.c(new UV0.c(aVar.f3552a));
        this.f137918a.notifyDataSetChanged();
        D6.G(this.f137920c, aVar.f3553b);
    }
}
