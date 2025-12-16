package com.avito.android.map.mvi;

import aY.InterfaceC19837a;
import aY.InterfaceC19840d;
import android.location.Location;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerItemKt;
import com.avito.android.avito_map.marker.MarkerWithIdAndContext;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.map.analytics.ParentType;
import com.avito.android.map.mvi.entity.LoadState;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map_core.analytics.event.SourceAction;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.CloseMapButton;
import com.avito.android.remote.model.Counter;
import com.avito.android.remote.model.MapOnboarding;
import com.avito.android.remote.model.MarkersFeatures;
import com.avito.android.remote.model.PinFloatingContainer;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SourceKt;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.serp_floating_container.SerpFloatingContainerState;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.retry.AppendingState;
import com.avito.android.serp.adapter.retry.RetryItem;
import com.avito.android.serp.adapter.seller_element.SellerPinItem;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.util.O2;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import lW.InterfaceC43691a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: MapReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/M;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lcom/avito/android/map/mvi/entity/a;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class M implements com.avito.android.arch.mvi.u<MapInternalAction, com.avito.android.map.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19840d f184969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19837a f184970c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.view.e f184971d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map.analytics.a f184972e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f184973f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final P f184974g;

    /* compiled from: MapReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MapErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MapErrorType mapErrorType = MapErrorType.f185053b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MapErrorType mapErrorType2 = MapErrorType.f185053b;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MapErrorType mapErrorType3 = MapErrorType.f185053b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MapErrorType mapErrorType4 = MapErrorType.f185053b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MapErrorType mapErrorType5 = MapErrorType.f185053b;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Inject
    public M(@Y61.k InterfaceC19840d interfaceC19840d, @Y61.k InterfaceC19837a interfaceC19837a, @Y61.k com.avito.android.map_core.view.e eVar, @Y61.k com.avito.android.map.analytics.a aVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k P p12) {
        this.f184969b = interfaceC19840d;
        this.f184970c = interfaceC19837a;
        this.f184971d = eVar;
        this.f184972e = aVar;
        this.f184973f = interfaceC43691a;
        this.f184974g = p12;
    }

    public static PinnedItem b(ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof SellerPinItem) {
                break;
            }
        }
        if (!(next instanceof SellerPinItem)) {
            next = null;
        }
        SellerPinItem sellerPinItem = (SellerPinItem) next;
        if (sellerPinItem == null) {
            return null;
        }
        return new PinnedItem(sellerPinItem.f271700g, sellerPinItem.f271697d, sellerPinItem.f271701h, sellerPinItem.f271699f);
    }

    public static com.avito.android.map.mvi.entity.a c(com.avito.android.map.mvi.entity.a aVar) {
        return com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, new a.C5436a(null, null, null, 0, null, 0, null, null, 0, false, null, null, null, 8191, null), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862207);
    }

    public static com.avito.android.map.mvi.entity.a d(com.avito.android.map.mvi.entity.a aVar) {
        a.d.f185196d.getClass();
        return com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, a.d.f185197e, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870655);
    }

    public static boolean e(String str) {
        return kotlin.jvm.internal.L.f(str, HiddenParameter.TYPE) || str == null;
    }

    public static List h(List list) {
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!(((l1) listIterator.previous()) instanceof RetryItem)) {
                    return C42745f0.E0(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final com.avito.android.map.mvi.entity.a a(@Y61.k MapInternalAction mapInternalAction, @Y61.k com.avito.android.map.mvi.entity.a aVar) {
        com.avito.android.map.mvi.entity.a aVarA;
        List listT;
        P p12;
        com.avito.android.map.mvi.entity.a aVarA2;
        P p13;
        com.avito.android.map.mvi.entity.a aVarA3;
        com.avito.android.map.mvi.entity.a aVar2;
        Float fValueOf;
        P p14;
        com.avito.android.map.mvi.entity.a aVarA4;
        P p15;
        P p16;
        com.avito.android.map.mvi.entity.a aVarA5;
        boolean z12 = mapInternalAction instanceof MapInternalAction.MarkersLoading;
        InterfaceC19840d interfaceC19840d = this.f184969b;
        P p17 = this.f184974g;
        if (z12) {
            LoadState loadState = LoadState.f185048c;
            a.f fVar = aVar.f185167r;
            InlineAction.Predefined.State state = InlineAction.Predefined.State.f283118b;
            return p17.a(c(com.avito.android.map.mvi.entity.a.a(aVar, null, MarkerItemKt.setSelected(interfaceC19840d.a(aVar.f185152c), null), null, loadState, null, null, null, false, null, null, null, null, null, null, null, null, a.f.b(fVar), null, null, null, false, false, null, null, false, false, null, 536281077)));
        }
        if (!(mapInternalAction instanceof MapInternalAction.IsRequestRationale)) {
            if (mapInternalAction instanceof MapInternalAction.AnalyticsParentTypeUpdated) {
                return com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, ((MapInternalAction.AnalyticsParentTypeUpdated) mapInternalAction).getF185061b(), null, null, null, null, null, false, false, null, null, false, false, null, 536854527);
            }
            int i12 = 0;
            if (mapInternalAction instanceof MapInternalAction.MarkersLoaded) {
                ParentType parentType = aVar.f185165p;
                if (com.avito.android.map.analytics.h.a(parentType) && e(aVar.getF185166q())) {
                    this.f184972e.i(aVar.getF185151b(), aVar.j(), aVar.f185157h, aVar.f185156g, SourceKt.isRecommendations(aVar.getF185151b().getSource()), SourceAction.f185598d);
                    parentType = ParentType.f184822c;
                }
                ParentType parentType2 = parentType;
                MapInternalAction.MarkersLoaded markersLoaded = (MapInternalAction.MarkersLoaded) mapInternalAction;
                List<MarkerItem> listN = markersLoaded.n();
                MarkersFeatures f185095c = markersLoaded.getF185095c();
                LoadState loadState2 = LoadState.f185049d;
                List<AvitoMapPoint> listK = markersLoaded.k();
                CloseMapButton f185102j = markersLoaded.getF185102j();
                Counter f185099g = markersLoaded.getF185099g();
                LatLngBounds f185098f = markersLoaded.getF185098f();
                boolean f185106n = markersLoaded.getF185106n();
                DrawingState f185096d = markersLoaded.getF185096d();
                Float f185105m = markersLoaded.getF185105m();
                SearchParams f185107o = markersLoaded.getF185107o();
                Boolean f185101i = markersLoaded.getF185101i();
                boolean zBooleanValue = f185101i != null ? f185101i.booleanValue() : false;
                String f185100h = markersLoaded.getF185100h();
                InlineAction.Predefined.State f185108p = markersLoaded.getF185108p();
                aVar.f185167r.getClass();
                return p17.a(c(d(com.avito.android.map.mvi.entity.a.a(aVar, f185107o, listN, f185095c, loadState2, f185099g, f185105m, f185098f, f185106n, null, null, f185102j, listK, f185096d, null, parentType2, null, a.f.a(f185108p, f185100h, zBooleanValue), null, null, null, false, false, null, markersLoaded.getF185103k(), false, markersLoaded.getF185109q(), null, 369009408))));
            }
            if (mapInternalAction instanceof MapInternalAction.AreaSaved) {
                SearchParams f185151b = aVar.getF185151b();
                return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, f185151b.copy(((-1234173943) & 1) != 0 ? f185151b.categoryId : null, ((-1234173943) & 2) != 0 ? f185151b.geoCoords : null, ((-1234173943) & 4) != 0 ? f185151b.locationId : null, ((-1234173943) & 8) != 0 ? f185151b.suggestLocationId : null, ((-1234173943) & 16) != 0 ? f185151b.metroIds : null, ((-1234173943) & 32) != 0 ? f185151b.directionId : null, ((-1234173943) & 64) != 0 ? f185151b.districtId : null, ((-1234173943) & 128) != 0 ? f185151b.params : null, ((-1234173943) & 256) != 0 ? f185151b.priceMax : null, ((-1234173943) & 512) != 0 ? f185151b.priceMin : null, ((-1234173943) & 1024) != 0 ? f185151b.query : null, ((-1234173943) & 2048) != 0 ? f185151b.title : null, ((-1234173943) & 4096) != 0 ? f185151b.owner : null, ((-1234173943) & 8192) != 0 ? f185151b.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? f185151b.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? f185151b.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? f185151b.radius : null, ((-1234173943) & 131072) != 0 ? f185151b.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? f185151b.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? f185151b.localPriority : null, ((-1234173943) & 1048576) != 0 ? f185151b.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? f185151b.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? f185151b.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? f185151b.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? f185151b.sellerId : null, ((-1234173943) & 33554432) != 0 ? f185151b.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? f185151b.displayType : null, ((-1234173943) & 134217728) != 0 ? f185151b.shopId : null, ((-1234173943) & 268435456) != 0 ? f185151b.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? f185151b.area : null, ((-1234173943) & 1073741824) != 0 ? f185151b.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? f185151b.clarifyIconType : null, (0 & 1) != 0 ? f185151b.drawId : ((MapInternalAction.AreaSaved) mapInternalAction).getF185062b()), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870910));
            }
            if (mapInternalAction instanceof MapInternalAction.MarkerClicked) {
                MarkerWithIdAndContext f185093b = ((MapInternalAction.MarkerClicked) mapInternalAction).getF185093b();
                if (f185093b instanceof MarkerItem.Rash) {
                    p16 = p17;
                    aVarA5 = com.avito.android.map.mvi.entity.a.a(aVar, null, interfaceC19840d.d(aVar.f185152c), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), false), null, null, false, false, null, null, false, false, null, 534642685);
                } else {
                    p16 = p17;
                    aVarA5 = f185093b instanceof MarkerItem.Pin ? com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), false), null, null, false, false, null, null, false, false, null, 534642687) : com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), false), null, null, false, false, null, null, false, false, null, 534642687);
                }
                return p16.a(aVarA5);
            }
            if (mapInternalAction instanceof MapInternalAction.FavorableAdvertChanged) {
                return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, interfaceC19840d.c(((MapInternalAction.FavorableAdvertChanged) mapInternalAction).getF185072b(), aVar.f185152c), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870909));
            }
            boolean z13 = mapInternalAction instanceof MapInternalAction.PinAdvertsLoading;
            String str = HiddenParameter.TYPE;
            if (z13) {
                MapInternalAction.PinAdvertsLoading pinAdvertsLoading = (MapInternalAction.PinAdvertsLoading) mapInternalAction;
                interfaceC19840d.b(pinAdvertsLoading.f185126b.f185190b);
                a.C5436a.C5437a c5437a = pinAdvertsLoading.f185126b;
                String str2 = c5437a.f185189a;
                List listI0 = aVar.getF185164o().f185176a;
                String str3 = c5437a.f185189a;
                String str4 = aVar.f185160k;
                boolean z14 = (kotlin.jvm.internal.L.f(str4, str3) || str4 == null || str4.length() == 0) ? false : true;
                a.C5436a f185164o = aVar.getF185164o();
                LoadState loadState3 = LoadState.f185048c;
                if (z14) {
                    listI0 = C42745f0.T(new RetryItem(0, AppendingState.f270752d, null, null, 13, null));
                } else {
                    List list = listI0;
                    if (list != null && !list.isEmpty()) {
                        listI0 = C42745f0.i0(new RetryItem(0, AppendingState.f270752d, null, null, 13, null), h(listI0));
                    }
                }
                List list2 = listI0;
                if (!pinAdvertsLoading.getF185127c()) {
                    str = aVar.getF185164o().f185183h;
                }
                aVarA = p17.a(d(com.avito.android.map.mvi.entity.a.a(aVar, null, MarkerItemKt.setViewed(MarkerItemKt.setSelected(aVar.f185152c, str2), str2), null, LoadState.f185049d, null, null, null, false, null, str2, null, null, null, a.C5436a.a(f185164o, list2, loadState3, 0, null, 0, str, 0, false, null, null, null, 8058), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862197)));
            } else {
                boolean z15 = mapInternalAction instanceof MapInternalAction.PinAdvertsLoaded;
                com.avito.android.map.analytics.a aVar3 = this.f184972e;
                if (z15) {
                    MapInternalAction.PinAdvertsLoaded pinAdvertsLoaded = (MapInternalAction.PinAdvertsLoaded) mapInternalAction;
                    List<SerpElement> listE = pinAdvertsLoaded.e();
                    SerpDisplayType f185121c = pinAdvertsLoaded.getF185121c();
                    a.C5436a.C5437a c5437a2 = pinAdvertsLoaded.f185122d;
                    ArrayList arrayListA = this.f184970c.a(listE, f185121c, c5437a2.b());
                    LatLng f185192d = c5437a2.getF185192d();
                    LatLngBounds latLngBounds = aVar.f185157h;
                    com.avito.android.map_core.view.e eVar = this.f184971d;
                    LatLng latLngB = com.avito.android.map_core.utils.d.b(f185192d, latLngBounds, eVar.a().f406619b.intValue(), eVar.b(pinAdvertsLoaded.f185123e));
                    int size = c5437a2.f185190b.size() - arrayListA.size();
                    ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
                    for (Object obj : arrayListA) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        arrayList.add(C42745f0.U(String.valueOf(i12 + size), ((l1) obj).getF281526b(), "0", "1"));
                        i12 = i13;
                    }
                    aVar3.e(arrayList, aVar.getF185151b());
                    List listZ = aVar.getF185164o().f185176a;
                    if (listZ == null) {
                        listZ = C42745f0.z();
                    }
                    ArrayList arrayListH0 = C42745f0.h0(arrayListA, h(listZ));
                    a.C5436a f185164o2 = aVar.getF185164o();
                    LoadState loadState4 = LoadState.f185049d;
                    a.C5436a.C5437a c5437a3 = pinAdvertsLoaded.f185122d;
                    int size2 = c5437a3.f185190b.size();
                    String str5 = pinAdvertsLoaded.getF185124f() ? "collapsed" : aVar.getF185164o().f185183h;
                    PinnedItem pinnedItemB = b(arrayListH0);
                    PinFloatingContainer f185125g = pinAdvertsLoaded.getF185125g();
                    if (f185125g == null) {
                        f185125g = aVar.getF185164o().f185188m;
                    }
                    return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, com.avito.android.map_core.utils.d.a(latLngB, aVar.f185157h), true, null, null, null, null, null, a.C5436a.a(f185164o2, arrayListH0, loadState4, pinAdvertsLoaded.f185123e, c5437a3, size2, str5, 0, false, pinnedItemB, null, f185125g, 2882), null, null, null, null, latLngB, null, false, false, null, null, false, false, null, 536338239));
                }
                if (mapInternalAction instanceof MapInternalAction.Error) {
                    int iOrdinal = ((MapInternalAction.Error) mapInternalAction).getF185067c().ordinal();
                    if (iOrdinal == 0) {
                        p14 = p17;
                        if (O2.a(aVar.getF185164o().f185176a)) {
                            a.C5436a f185164o3 = aVar.getF185164o();
                            List listZ2 = aVar.getF185164o().f185176a;
                            if (listZ2 == null) {
                                listZ2 = C42745f0.z();
                            }
                            aVarA4 = com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(f185164o3, C42745f0.i0(new RetryItem(0, AppendingState.f270753e, null, null, 13, null), h(listZ2)), null, 0, null, 0, null, 0, false, null, null, null, 8190), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862719);
                        } else {
                            aVarA4 = com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, LoadState.f185050e, 0, null, 0, null, 0, false, null, null, null, 8187), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862207);
                        }
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                                aVarA4 = d(aVar);
                            } else {
                                if (iOrdinal != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVarA4 = aVar;
                            }
                            p15 = p17;
                            return p15.a(aVarA4);
                        }
                        p14 = p17;
                        aVarA4 = c(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, LoadState.f185050e, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870903));
                    }
                    p15 = p14;
                    return p15.a(aVarA4);
                }
                if (mapInternalAction instanceof MapInternalAction.MapClicked) {
                    return p17.a(g(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), true), null, null, true, false, null, null, false, false, null, 534642687)));
                }
                if (mapInternalAction instanceof MapInternalAction.LocationLoaded) {
                    MapInternalAction.LocationLoaded locationLoaded = (MapInternalAction.LocationLoaded) mapInternalAction;
                    boolean z16 = locationLoaded.f185086d;
                    boolean z17 = locationLoaded.f185085c;
                    if (z16) {
                        aVar2 = aVar;
                        fValueOf = null;
                    } else {
                        fValueOf = Float.valueOf(z17 ? 11.5f : 17.0f);
                        aVar2 = aVar;
                    }
                    a.d dVar = aVar2.f185159j;
                    Location location = locationLoaded.f185084b;
                    MarkerItem.MyLocation myLocation = new MarkerItem.MyLocation(new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null).toLatLng(), z17, fValueOf);
                    dVar.getClass();
                    return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, a.d.a(myLocation), null, null, null, null, null, null, null, null, null, null, null, false, !locationLoaded.f185086d, null, null, true, false, null, 460848895));
                }
                if (mapInternalAction instanceof MapInternalAction.GeoDisabledInSettings) {
                    return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, a.d.b(aVar.f185159j, false, 5), null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870655));
                }
                if (mapInternalAction instanceof MapInternalAction.SearchSubscriptionStateChanged) {
                    MapInternalAction.SearchSubscriptionStateChanged searchSubscriptionStateChanged = (MapInternalAction.SearchSubscriptionStateChanged) mapInternalAction;
                    return com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, new a.f(searchSubscriptionStateChanged.getF185131b(), searchSubscriptionStateChanged.getF185132c(), searchSubscriptionStateChanged.getF185133d()), null, null, null, false, false, null, null, false, false, null, 536805375);
                }
                if (mapInternalAction instanceof MapInternalAction.FiltersUpdated) {
                    return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, ((MapInternalAction.FiltersUpdated) mapInternalAction).getF185073b().getF133403b(), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870910));
                }
                if (mapInternalAction instanceof MapInternalAction.PanelStateChanged) {
                    MapInternalAction.PanelStateChanged panelStateChanged = (MapInternalAction.PanelStateChanged) mapInternalAction;
                    if (kotlin.jvm.internal.L.f(panelStateChanged.f185119b, HiddenParameter.TYPE)) {
                        p13 = p17;
                        aVarA3 = g(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), true), null, null, true, false, null, null, false, false, null, 534642687));
                    } else {
                        p13 = p17;
                        a.C5436a f185164o4 = aVar.getF185164o();
                        String str6 = panelStateChanged.f185119b;
                        aVarA3 = com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(f185164o4, null, null, 0, null, 0, str6, 0, false, null, aVar.getF185164o().f185187l.copy(1.0f, kotlin.jvm.internal.L.f(str6, SearchParamsConverterKt.EXPANDED)), null, 6015), null, null, null, null, null, null, false, false, null, null, false, false, null, 534765567);
                    }
                    return p13.a(aVarA3);
                }
                if (mapInternalAction instanceof MapInternalAction.PanelOffsetChanged) {
                    boolean z18 = aVar.getF185164o().f185188m != null;
                    boolean z19 = ((MapInternalAction.PanelOffsetChanged) mapInternalAction).getF185118b() >= 0.8f;
                    SerpFloatingContainerState serpFloatingContainerState = aVar.getF185164o().f185187l;
                    boolean z22 = serpFloatingContainerState.isVisible() && serpFloatingContainerState.getAlpha() == 1.0f;
                    if (z18 && z19 && !z22) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, null, 0, null, 0, null, 0, false, null, aVar.getF185164o().f185187l.copy(1.0f, true), null, 6143), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862719));
                    }
                    if (z18 && !z19 && z22) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, null, 0, null, 0, null, 0, false, null, aVar.getF185164o().f185187l.copy(1.0f, false), null, 6143), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862719));
                    }
                } else {
                    if (mapInternalAction instanceof MapInternalAction.MapOnboardingLoaded) {
                        SearchParams f185151b2 = aVar.getF185151b();
                        MapInternalAction.MapOnboardingLoaded mapOnboardingLoaded = (MapInternalAction.MapOnboardingLoaded) mapInternalAction;
                        MapOnboarding mapOnboarding = mapOnboardingLoaded.f185091b;
                        aVar3.c(f185151b2, mapOnboarding != null ? mapOnboarding.getId() : null);
                        aVar.getF185168s().getClass();
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.a(mapOnboardingLoaded.f185091b), null, null, false, false, null, null, false, false, null, 536739839));
                    }
                    if (mapInternalAction instanceof MapInternalAction.MapMoved) {
                        SearchParams f185151b3 = aVar.getF185151b();
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, f185151b3.copy(((-1234173943) & 1) != 0 ? f185151b3.categoryId : null, ((-1234173943) & 2) != 0 ? f185151b3.geoCoords : null, ((-1234173943) & 4) != 0 ? f185151b3.locationId : null, ((-1234173943) & 8) != 0 ? f185151b3.suggestLocationId : null, ((-1234173943) & 16) != 0 ? f185151b3.metroIds : null, ((-1234173943) & 32) != 0 ? f185151b3.directionId : null, ((-1234173943) & 64) != 0 ? f185151b3.districtId : null, ((-1234173943) & 128) != 0 ? f185151b3.params : null, ((-1234173943) & 256) != 0 ? f185151b3.priceMax : null, ((-1234173943) & 512) != 0 ? f185151b3.priceMin : null, ((-1234173943) & 1024) != 0 ? f185151b3.query : null, ((-1234173943) & 2048) != 0 ? f185151b3.title : null, ((-1234173943) & 4096) != 0 ? f185151b3.owner : null, ((-1234173943) & 8192) != 0 ? f185151b3.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? f185151b3.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? f185151b3.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? f185151b3.radius : null, ((-1234173943) & 131072) != 0 ? f185151b3.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? f185151b3.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? f185151b3.localPriority : null, ((-1234173943) & 1048576) != 0 ? f185151b3.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? f185151b3.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? f185151b3.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? f185151b3.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? f185151b3.sellerId : null, ((-1234173943) & 33554432) != 0 ? f185151b3.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? f185151b3.displayType : null, ((-1234173943) & 134217728) != 0 ? f185151b3.shopId : null, ((-1234173943) & 268435456) != 0 ? f185151b3.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? f185151b3.area : com.avito.android.map_core.utils.d.d(((MapInternalAction.MapMoved) mapInternalAction).getF185090b()), ((-1234173943) & 1073741824) != 0 ? f185151b3.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? f185151b3.clarifyIconType : null, (0 & 1) != 0 ? f185151b3.drawId : null), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), true), null, null, true, false, null, null, false, false, null, 467009534));
                    }
                    if (mapInternalAction instanceof MapInternalAction.ZoomIn) {
                        Float f185144b = aVar.f185156g;
                        if (f185144b == null) {
                            f185144b = ((MapInternalAction.ZoomIn) mapInternalAction).getF185144b();
                        }
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, f185144b != null ? Float.valueOf(kotlin.ranges.s.c(f185144b.floatValue() + 1.0f, 18.0f)) : null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536346591));
                    }
                    if (mapInternalAction instanceof MapInternalAction.ZoomOut) {
                        Float f185145b = aVar.f185156g;
                        if (f185145b == null) {
                            f185145b = ((MapInternalAction.ZoomOut) mapInternalAction).getF185145b();
                        }
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, f185145b != null ? Float.valueOf(kotlin.ranges.s.a(f185145b.floatValue() - 1.0f, 2.0f)) : null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536346591));
                    }
                    if (mapInternalAction instanceof MapInternalAction.ShortcutsLayoutChange) {
                        MapInternalAction.ShortcutsLayoutChange shortcutsLayoutChange = (MapInternalAction.ShortcutsLayoutChange) mapInternalAction;
                        int f185135c = shortcutsLayoutChange.getF185135c() - shortcutsLayoutChange.getF185134b();
                        boolean zF2 = kotlin.jvm.internal.L.f(aVar.getF185164o().f185183h, SearchParamsConverterKt.EXPANDED);
                        if (f185135c < 0 || zF2) {
                            p12 = p17;
                            aVarA2 = (f185135c < 0 || !zF2) ? aVar : com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, null, 0, null, 0, null, f185135c, false, null, null, null, 7935), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862719);
                        } else {
                            aVar.getF185171v().getClass();
                            p12 = p17;
                            aVarA2 = com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, null, 0, null, 0, null, f185135c, false, null, null, null, 7935), null, null, null, null, null, a.e.a(f185135c), false, false, null, null, false, false, null, 535814143);
                        }
                        return p12.a(aVarA2);
                    }
                    if (mapInternalAction instanceof MapInternalAction.ShowListClicked) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 534773759));
                    }
                    if (mapInternalAction instanceof MapInternalAction.UpdateButtonsVisibility) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, ((MapInternalAction.UpdateButtonsVisibility) mapInternalAction).getF185139b(), false, null, null, false, false, null, 534773759));
                    }
                    if (mapInternalAction instanceof MapInternalAction.UpdateScrollToTopButtonVisibility) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, a.C5436a.a(aVar.getF185164o(), null, null, 0, null, 0, null, 0, ((MapInternalAction.UpdateScrollToTopButtonVisibility) mapInternalAction).getF185142b() && aVar.getF185169t().isFullMap(), null, null, null, 7679), null, null, null, null, null, null, false, false, null, null, false, false, null, 536862719));
                    }
                    if (mapInternalAction instanceof MapInternalAction.MapMoveStarted) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, a.c.b(aVar.getF185168s(), false), null, null, false, !aVar.getF185149C(), null, null, true, false, null, 327024639));
                    }
                    if (mapInternalAction instanceof MapInternalAction.UpdateUserMovedMapSinceLastLocationUpdate) {
                        return p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 528482303));
                    }
                    if (mapInternalAction instanceof MapInternalAction.Draw) {
                        C42784z0 c42784z0Z = C42745f0.z();
                        DrawingState drawingState = DrawingState.f185716c;
                        if (aVar.f185162m != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(aVar.f185162m);
                            arrayList2.add(((MapInternalAction.Draw) mapInternalAction).f185065b);
                            listT = arrayList2;
                        } else {
                            listT = C42745f0.T(((MapInternalAction.Draw) mapInternalAction).f185065b);
                        }
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, c42784z0Z, null, null, null, null, null, false, null, null, null, listT, drawingState, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536864765));
                    } else if (mapInternalAction instanceof MapInternalAction.StartDrawing) {
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, C42745f0.z(), null, null, null, null, null, false, null, null, null, null, DrawingState.f185716c, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536864765));
                    } else if (mapInternalAction instanceof MapInternalAction.FinishDrawing) {
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, DrawingState.f185717d, null, null, null, null, null, null, null, false, true, null, null, false, false, null, 528478207));
                    } else if (mapInternalAction instanceof MapInternalAction.ResetDrawing ? true : mapInternalAction instanceof MapInternalAction.CancelDrawing) {
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, DrawingState.f185715b, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536864767));
                    } else if (mapInternalAction instanceof MapInternalAction.UpdateNewSerpMapInteraction) {
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, ((MapInternalAction.UpdateNewSerpMapInteraction) mapInternalAction).getF185141b(), null, false, false, null, 520093695));
                    } else if (mapInternalAction instanceof MapInternalAction.BottomSheetStateChanged) {
                        int f185063b = ((MapInternalAction.BottomSheetStateChanged) mapInternalAction).getF185063b();
                        aVarA = com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, f185063b != 3 ? f185063b != 4 ? f185063b != 5 ? "none" : HiddenParameter.TYPE : "collapsed" : SearchParamsConverterKt.EXPANDED, null, null, null, null, false, false, null, null, false, false, null, 536838143);
                    } else if (mapInternalAction instanceof MapInternalAction.UpdateLocationPermissionState) {
                        aVarA = p17.a(com.avito.android.map.mvi.entity.a.a(aVar, null, null, null, null, null, null, null, false, a.d.b(aVar.f185159j, ((MapInternalAction.UpdateLocationPermissionState) mapInternalAction).getF185140b(), 3), null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536870655));
                    } else if (!(kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.ScrollPinsToTop.f185130b) ? true : mapInternalAction instanceof MapInternalAction.NotifyFeaturesRefresh ? true : mapInternalAction instanceof MapInternalAction.FloatingViewsStateUpdate ? true : mapInternalAction instanceof MapInternalAction.GeoEnabledAndPermissionGranted ? true : kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.GeoNeedPermissionDialog.f185080b) ? true : kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.GoToSettings.f185081b) ? true : kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.IsPermissionGranted.f185082b) ? true : kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.MapOnboardingLoading.f185092b) ? true : mapInternalAction instanceof MapInternalAction.NotifyFeaturesAboutSubscriptionsState ? true : kotlin.jvm.internal.L.f(mapInternalAction, MapInternalAction.SubscribeButtonClicked.f185138b) ? true : mapInternalAction instanceof MapInternalAction.ReloadInlines)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return aVarA;
        }
        String f181728b = FindLocationPage.f181725c.getF181728b();
        InterfaceC43691a interfaceC43691a = this.f184973f;
        interfaceC43691a.e(f181728b);
        interfaceC43691a.f(null, "PERMISSION DENIED");
        return aVar;
    }

    public final com.avito.android.map.mvi.entity.a g(com.avito.android.map.mvi.entity.a aVar) {
        return c(com.avito.android.map.mvi.entity.a.a(aVar, null, MarkerItemKt.setSelected(this.f184969b.a(aVar.f185152c), null), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, 536346493));
    }
}
