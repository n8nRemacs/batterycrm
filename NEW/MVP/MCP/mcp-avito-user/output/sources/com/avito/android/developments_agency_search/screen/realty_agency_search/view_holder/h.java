package com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder;

import Lw.InterfaceC14443a;
import Y41.l;
import Y41.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.lib.design.map.state.MoveReason;
import com.avito.android.lib.design.map.state.a;
import com.avito.android.map_core.view.zoom.ZoomButton;
import com.avito.android.util.C35835l0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oV.C44694a;

/* compiled from: RealtyAgencySearchMapViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/h;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC14443a, G0> f139021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public MapState f139022b = new MapState(null, null, null, null, null, null, new a(1, this, h.class, "onMapMoveEnd", "onMapMoveEnd(Lcom/avito/android/lib/design/map/state/MoveTo$VisibleSnapshot;)V", 0), new c(), new b(1, this, h.class, "onMarkerClick", "onMarkerClick(Lcom/avito/android/lib/design/map/state/MapState$Marker;)V", 0), null, null, null, null, 7743, null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.map.b f139023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f139024d;

    /* compiled from: RealtyAgencySearchMapViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<a.c, G0> {
        @Override // Y41.l
        public final G0 invoke(a.c cVar) {
            a.c cVar2 = cVar;
            h hVar = (h) this.receiver;
            com.avito.android.lib.design.map.state.a aVar = hVar.f139022b.f179618d;
            a.c cVar3 = aVar instanceof a.c ? (a.c) aVar : null;
            AvitoMapBounds avitoMapBounds = cVar3 != null ? cVar3.f179655c : null;
            AvitoMapBounds avitoMapBounds2 = cVar2.f179655c;
            if (!L.f(avitoMapBounds, avitoMapBounds2)) {
                if (avitoMapBounds2 != null) {
                    hVar.f139021a.invoke(new InterfaceC14443a.f.d(avitoMapBounds2, cVar2.f179656d == MoveReason.f179644b, (int) cVar2.f179654b));
                }
                MapState mapStateA = MapState.a(hVar.f139022b, null, cVar2, 8183);
                hVar.f139022b = mapStateA;
                hVar.f139023c.setState(mapStateA);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchMapViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<MapState.a, G0> {
        @Override // Y41.l
        public final G0 invoke(MapState.a aVar) {
            MapState.a aVar2 = aVar;
            h hVar = (h) this.receiver;
            hVar.getClass();
            hVar.f139021a.invoke(new InterfaceC14443a.f.c(aVar2.f179631a));
            MapState mapStateA = MapState.a(hVar.f139022b, null, new a.b(aVar2.f179632b, false, null, 6, null), 8183);
            hVar.f139022b = mapStateA;
            hVar.f139023c.setState(mapStateA);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyAgencySearchMapViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapPoint;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<AvitoMapPoint, Float, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(AvitoMapPoint avitoMapPoint, Float f12) {
            f12.floatValue();
            h.this.f139021a.invoke(InterfaceC14443a.f.C0646a.f10196a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k ViewGroup viewGroup, @Y61.k FragmentManager fragmentManager, @Y61.k l<? super InterfaceC14443a, G0> lVar) throws Resources.NotFoundException {
        this.f139021a = lVar;
        com.avito.android.lib.design.map.b bVar = new com.avito.android.lib.design.map.b(viewGroup.getContext(), fragmentManager, false, null, 0, 0, 60, null);
        C44694a.b bVar2 = C44694a.f419779o;
        Context context = bVar.getContext();
        int iJ2 = C35835l0.j(R.attr.mapDefault, bVar.getContext());
        bVar2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iJ2, d.n.f178954Y);
        C44694a c44694aB = C44694a.b.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        bVar.setStyle(c44694aB);
        View viewInflate = LayoutInflater.from(bVar.getContext()).inflate(R.layout.agency_search_map_buttons_panel, (ViewGroup) bVar, false);
        View viewFindViewById = viewInflate.findViewById(R.id.zoom_map);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.zoom.ZoomButton");
        }
        ((ZoomButton) viewFindViewById).setState(new com.avito.android.map_core.view.zoom.a(new f(0, this, h.class, "onZoomInClick", "onZoomInClick()V", 0), new g(0, this, h.class, "onZoomOutClick", "onZoomOutClick()V", 0)));
        View viewFindViewById2 = viewInflate.findViewById(R.id.find_me_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        ((FloatingActionButton) viewFindViewById2).setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 1));
        bVar.addView(viewInflate);
        this.f139024d = viewInflate;
        this.f139023c = bVar;
        ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
        viewGroup.addView(bVar, layoutParams == null ? new LinearLayout.LayoutParams(-1, -1) : layoutParams);
    }
}
