package com.avito.android.item_map.routes;

import Ca1.ViewOnClickListenerC13236c;
import android.content.res.Resources;
import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoFittingBoundsBuilderKt;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapPolyline;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.avito.android.item_map.di.d;
import com.avito.android.item_map.remote.model.route.Meta;
import com.avito.android.item_map.remote.model.route.Route;
import com.avito.android.item_map.remote.model.route.RouteResponse;
import com.avito.android.item_map.remote.model.route.Type;
import com.avito.android.item_map.routes.b;
import com.avito.android.item_map.view.L;
import com.avito.android.item_map.view.Q;
import com.avito.android.item_map.view.V;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RoutesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/l;", "Lcom/avito/android/item_map/routes/k;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f173392b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public V f173393c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public d f173394d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Button f173395e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f173396f = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public RoutesPresenterState f173397g;

    /* compiled from: RoutesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/item_map/remote/model/route/RouteResponse;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super RouteResponse>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f173399m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f173400n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, AvitoMapPoint avitoMapPoint) {
            super(1);
            this.f173399m = z12;
            this.f173400n = avitoMapPoint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(P2<? super RouteResponse> p22) {
            V v12;
            V v13;
            Route route;
            P2<? super RouteResponse> p23 = p22;
            boolean z12 = p23 instanceof P2.b;
            boolean z13 = this.f173399m;
            l lVar = l.this;
            if (z12) {
                RoutesPresenterState routesPresenterState = lVar.f173397g;
                P2.b bVar = (P2.b) p23;
                List<Route> listD = ((RouteResponse) bVar.f318720a).d();
                RouteResponse routeResponse = (RouteResponse) bVar.f318720a;
                Area mapArea = routeResponse.getMapArea();
                List<Route> listD2 = routeResponse.d();
                Type type = (listD2 == null || (route = (Route) C42745f0.E(listD2)) == null) ? null : route.getType();
                routesPresenterState.getClass();
                lVar.f173397g = new RoutesPresenterState(listD, mapArea, type);
                if (z13 && (v13 = lVar.f173393c) != null) {
                    v13.f(this.f173400n);
                }
            } else if (p23 instanceof P2.c) {
                d dVar = lVar.f173394d;
                if (dVar != null) {
                    Iterator it = dVar.f173382d.entrySet().iterator();
                    while (it.hasNext()) {
                        ((com.avito.android.item_map.routes.a) ((Map.Entry) it.next()).getValue()).a();
                    }
                }
            } else if (p23 instanceof P2.a) {
                lVar.d(false);
                d dVar2 = lVar.f173394d;
                if (dVar2 != null) {
                    Iterator it2 = dVar2.f173382d.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((com.avito.android.item_map.routes.a) ((Map.Entry) it2.next()).getValue()).a();
                    }
                }
                if (z13 && (v12 = lVar.f173393c) != null) {
                    Q.a.a(v12, R.string.connection_problem);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RoutesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f173402m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12) {
            super(1);
            this.f173402m = z12;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V v12;
            l lVar = l.this;
            lVar.d(false);
            V2.f318762a.f(th2);
            if (this.f173402m && (v12 = lVar.f173393c) != null) {
                Q.a.a(v12, R.string.something_went_wrong);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public l(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k e eVar, @Y61.l @d.c Kundle kundle) {
        RoutesPresenterState routesPresenterState;
        this.f173391a = interfaceC35745a5;
        this.f173392b = eVar;
        this.f173397g = new RoutesPresenterState(null, null, null, 7, null);
        if (kundle == null || (routesPresenterState = (RoutesPresenterState) kundle.d("routesState")) == null) {
            return;
        }
        this.f173397g.getClass();
        this.f173397g = new RoutesPresenterState(routesPresenterState.f173371b, routesPresenterState.f173372c, routesPresenterState.f173373d);
    }

    @Override // com.avito.android.item_map.routes.k
    public final void I() {
        this.f173396f.e();
        this.f173393c = null;
        this.f173394d = null;
        this.f173395e = null;
    }

    @Override // com.avito.android.item_map.routes.k
    public final void a(@Y61.l V v12) {
        this.f173393c = v12;
    }

    @Override // com.avito.android.item_map.routes.k
    public final void b(@Y61.k AvitoMapPoint avitoMapPoint, boolean z12) {
        G0 g02;
        V v12;
        if (this.f173397g.f173371b != null) {
            if (z12 && (v12 = this.f173393c) != null) {
                v12.f(avitoMapPoint);
            }
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            this.f173396f.b(this.f173392b.a(avitoMapPoint).j0(this.f173391a.e()).v0(new com.avito.android.api.a(21, new a(z12, avitoMapPoint)), new com.avito.android.api.a(22, new b(z12)), io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    @Override // com.avito.android.item_map.routes.k
    public final void c(@Y61.l d dVar) throws Resources.NotFoundException {
        V v12;
        AvitoMap avitoMap;
        Location location;
        AvitoMapMarker avitoMapMarker;
        AvitoMap avitoMap2;
        AvitoMapPolyline avitoMapPolylineAddPolyline$default;
        this.f173394d = dVar;
        RoutesPresenterState routesPresenterState = this.f173397g;
        List<Route> list = routesPresenterState.f173371b;
        List<Route> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        String str = null;
        this.f173395e = null;
        boolean z12 = list.size() == 1;
        for (Route route : list) {
            RouteButtonViewState routeButtonViewState = RouteButtonViewState.f173367b;
            Type type = route.getType();
            Type type2 = this.f173397g.f173373d;
            RouteButtonViewState routeButtonViewState2 = (type2 == null || type != type2) ? RouteButtonViewState.f173367b : RouteButtonViewState.f173368c;
            if (!route.c().isEmpty()) {
                d dVar2 = this.f173394d;
                if (dVar2 != null) {
                    Meta meta = route.getMeta();
                    Type type3 = route.getType();
                    AttributedText buttonText = meta.getButtonText();
                    String text = buttonText != null ? buttonText.getText() : str;
                    if (text != null && text.length() != 0) {
                        ViewGroup viewGroup = dVar2.f173379a;
                        if (z12) {
                            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.route_buttons_margin_view_for_one);
                            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                viewGroup.requestLayout();
                            }
                        }
                        View viewInflate = dVar2.f173381c.inflate(z12 ? R.layout.item_route_list_item : R.layout.item_route_check_list_item, viewGroup, false);
                        com.avito.android.util.text.a aVar = dVar2.f173380b;
                        com.avito.android.item_map.routes.b bVar = new com.avito.android.item_map.routes.b(viewInflate, type3, aVar);
                        dVar2.f173382d.put(String.valueOf(meta.getButtonText()), bVar);
                        CharSequence charSequenceC = aVar.c(viewInflate.getContext(), meta.getButtonText());
                        BaseListItem baseListItem = bVar.f173377d;
                        if (charSequenceC != null) {
                            baseListItem.setTitle(charSequenceC);
                        }
                        int i12 = b.a.f173378a[type3.ordinal()];
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if (baseListItem instanceof ListItemCheckmark) {
                                    ((ListItemCheckmark) baseListItem).setImageResource(R.drawable.item_map_walking_route_16);
                                } else if (baseListItem instanceof ListItem) {
                                    ListItem.k((ListItem) baseListItem, R.drawable.item_map_walking_route_16, 0, 2);
                                }
                            }
                        } else if (baseListItem instanceof ListItemCheckmark) {
                            ((ListItemCheckmark) baseListItem).setImageResource(R.drawable.common_ic_auto_16);
                        } else if (baseListItem instanceof ListItem) {
                            ListItem.k((ListItem) baseListItem, R.drawable.common_ic_auto_16, 0, 2);
                        }
                        bVar.b(routeButtonViewState2);
                        baseListItem.setOnClickListener(new ViewOnClickListenerC13236c(this, meta, bVar, 28));
                        viewGroup.addView(viewInflate);
                    }
                }
                V v13 = this.f173393c;
                if (v13 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Coordinates coordinates : route.c()) {
                        arrayList.add(new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null));
                    }
                    AvitoMap avitoMap3 = v13.f173582q;
                    if (avitoMap3 != null) {
                        int outlineColor = v13.f173568c.getOutlineColor();
                        Type type4 = route.getType();
                        type4.getClass();
                        boolean z13 = type4 == Type.Walking;
                        RouteButtonViewState routeButtonViewState3 = RouteButtonViewState.f173368c;
                        L l12 = v13.f173568c;
                        avitoMapPolylineAddPolyline$default = AvitoMap.DefaultImpls.addPolyline$default(avitoMap3, arrayList, outlineColor, 8.0f, routeButtonViewState2 == routeButtonViewState3 ? l12.h() : l12.g(), z13, 4.0f, routeButtonViewState2 == routeButtonViewState3 ? 1.0f : 0.0f, false, 128, null);
                    } else {
                        avitoMapPolylineAddPolyline$default = null;
                    }
                    if (avitoMapPolylineAddPolyline$default != null) {
                        v13.f173558N.put(String.valueOf(route.getMeta().getButtonText()), avitoMapPolylineAddPolyline$default);
                    }
                }
            }
            str = null;
        }
        V v14 = this.f173393c;
        if (v14 != null && (location = v14.f173579n.f173434g) != null) {
            new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null);
            AvitoMapMarker avitoMapMarker2 = v14.f173585t;
            if (avitoMapMarker2 == null || (avitoMap2 = v14.f173582q) == null) {
                avitoMapMarker = null;
            } else {
                avitoMapMarker = null;
                AvitoMap.DefaultImpls.removeMarker$default(avitoMap2, avitoMapMarker2, false, 2, null);
            }
            AvitoMap avitoMap4 = v14.f173582q;
            v14.f173585t = avitoMap4 != null ? AvitoMap.DefaultImpls.addMarker$default(avitoMap4, new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null), AvitoMapMarker.Type.MARKER_MY_LOCATION_BLUE, AvitoMapMarker.Anchor.BOTTOM_CENTER, (Float) null, R.style.Theme_DesignSystem_Legacy, 8, (Object) null) : avitoMapMarker;
        }
        Area area = routesPresenterState.f173372c;
        if (area == null || (v12 = this.f173393c) == null || (avitoMap = v12.f173582q) == null) {
            return;
        }
        avitoMap.moveTo(AvitoGoogleMapKt.toAvitoMapBounds(AvitoFittingBoundsBuilderKt.toLatLngBounds(area)), true);
    }

    @Override // com.avito.android.item_map.routes.k
    public final void d(boolean z12) {
        Button button = this.f173395e;
        if (button != null) {
            button.setLoading(z12);
        }
    }

    @Override // com.avito.android.item_map.routes.k
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f173397g, "routesState");
        return kundle;
    }

    @Override // com.avito.android.item_map.routes.k
    public final boolean e() {
        List<Route> list = this.f173397g.f173371b;
        return list == null || list.isEmpty();
    }

    @Override // com.avito.android.item_map.routes.k
    @Y61.k
    public final Type f() {
        Type type = this.f173397g.f173373d;
        return type == null ? Type.Driving : type;
    }

    @Override // com.avito.android.item_map.routes.k
    public final void g(@Y61.k Button button) {
        this.f173395e = button;
    }
}
