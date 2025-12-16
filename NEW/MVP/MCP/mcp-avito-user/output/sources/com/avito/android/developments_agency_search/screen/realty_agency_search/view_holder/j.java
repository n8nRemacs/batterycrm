package com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder;

import Lw.InterfaceC14443a;
import Lw.c;
import Nw.C14618a;
import Y41.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.notes.x;
import com.avito.android.developments_agency_search.screen.realty_agency_search.view.AgencySearchResultBottomSheetBehavior;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.P5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: RealtyAgencySearchViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/i;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/a;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i, com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.a, e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC14443a, G0> f139026a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f139027b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f139028c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f139029d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f139030e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f139031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f139032g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C14618a f139033h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f139034i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AgencySearchResultBottomSheetBehavior f139035j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<View> f139036k;

    /* compiled from: RealtyAgencySearchViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f139026a.invoke(InterfaceC14443a.p.f10211a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k View view, @Y61.k FragmentManager fragmentManager, @Y61.k String str, @Y61.k l<? super InterfaceC14443a, G0> lVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k com.avito.konveyor.adapter.j jVar2, @Y61.k com.avito.konveyor.adapter.a aVar2, boolean z12) {
        this.f139026a = lVar;
        this.f139027b = jVar;
        this.f139028c = aVar;
        this.f139029d = bVar;
        this.f139030e = jVar2;
        this.f139031f = aVar2;
        new com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.b(lVar, view, z12);
        View viewFindViewById = view.findViewById(R.id.map_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f139032g = new h((ViewGroup) viewFindViewById, fragmentManager, lVar);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        View viewFindViewById2 = toolbar.findViewById(R.id.toolbar_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById2).setText(str);
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        toolbar.setNavigationOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 2));
        if (!z12) {
            P5.a(toolbar, 0, new ActionMenu(toolbar.getContext().getString(R.string.das_toolbar_menu_additional_info_title), 2, Integer.valueOf(C35835l0.j(R.attr.ic_info24, toolbar.getContext())), Integer.valueOf(R.attr.black), null, 16, null));
            com.avito.android.ui.d.a(toolbar.getMenu().getItem(0), new x(this, 1));
        }
        C14618a c14618a = new C14618a(28);
        this.f139033h = c14618a;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.searchResultsRecyclerView);
        recyclerView.setAdapter(jVar);
        recyclerView.o(new Ow.b((LinearLayoutManager) recyclerView.getLayoutManager(), new c()));
        recyclerView.setClipToOutline(true);
        recyclerView.setOutlineProvider(c14618a);
        bVar.a(recyclerView, null);
        this.f139034i = recyclerView;
        AgencySearchResultBottomSheetBehavior agencySearchResultBottomSheetBehavior = (AgencySearchResultBottomSheetBehavior) ((CoordinatorLayout.g) recyclerView.getLayoutParams()).f44447a;
        agencySearchResultBottomSheetBehavior.v(new b());
        agencySearchResultBottomSheetBehavior.b(6);
        this.f139035j = agencySearchResultBottomSheetBehavior;
        View viewFindViewById3 = view.findViewById(R.id.developmentTooltipRecyclerView);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById3;
        recyclerView2.setAdapter(jVar2);
        recyclerView2.setClipToOutline(true);
        recyclerView2.setOutlineProvider(new C14618a(16));
        recyclerView2.invalidateOutline();
        BottomSheetBehavior<View> bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.g) recyclerView2.getLayoutParams()).f44447a;
        bottomSheetBehavior.v(new a());
        this.f139036k = bottomSheetBehavior;
    }

    public final void a(@Y61.k c.h.a aVar) {
        View view = this.f139032g.f139024d;
        D6.G(view, aVar.f10278a);
        View viewFindViewById = view.findViewById(R.id.find_me_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        D6.G((FloatingActionButton) viewFindViewById, aVar.f10279b);
    }

    /* compiled from: RealtyAgencySearchViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/j$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@Y61.k View view, int i12) {
            if (i12 == 5) {
                j.this.f139026a.invoke(InterfaceC14443a.d.b.f10185a);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@Y61.k View view, float f12) {
        }
    }

    /* compiled from: RealtyAgencySearchViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.c {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@Y61.k View view, int i12) {
            j jVar = j.this;
            if (i12 == 4) {
                jVar.f139026a.invoke(InterfaceC14443a.b.C0638a.f10178a);
            } else {
                jVar.f139026a.invoke(InterfaceC14443a.b.c.f10180a);
            }
            jVar.f139033h.f11872a = i12 != 3 ? i12 != 4 ? 28 : 16 : 0;
            jVar.f139034i.invalidateOutline();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@Y61.k View view, float f12) {
        }
    }
}
