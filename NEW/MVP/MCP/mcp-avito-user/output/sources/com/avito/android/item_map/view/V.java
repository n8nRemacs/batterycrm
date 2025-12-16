package com.avito.android.item_map.view;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Zd.InterfaceC19542a;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactoryKt;
import com.avito.android.avito_map.yandex.AvitoYandexMap;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.item_map.view.badge_pin.MapMarkerBadgeText;
import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_address.pin.BlackPinView;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.L5;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.mapkit.mapview.MapView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import yO.C50152a;

/* compiled from: ItemMapView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/item_map/view/V;", "Lcom/avito/android/item_map/view/Q;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "Lcom/avito/android/advert_core/advert/c;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class V implements Q, AvitoMapAttachHelper.MapAttachListener, com.avito.android.advert_core.advert.c {

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final BottomSheet f173547C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final ViewOnLayoutChangeListenerC19701a f173548D;

    /* renamed from: E, reason: collision with root package name */
    public final LinearLayout f173549E;

    /* renamed from: F, reason: collision with root package name */
    public final FloatingActionButton f173550F;

    /* renamed from: G, reason: collision with root package name */
    public final RecyclerView f173551G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f173552H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f173553I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageView f173554J;

    /* renamed from: K, reason: collision with root package name */
    public final Context f173555K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f173556L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f173557M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f173558N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final HashMap<AvitoMapPoint, AvitoMapMarker> f173559O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f173560P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f173561Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public Integer f173562R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Float f173563S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.advert_core.contactbar.A f173564T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public Dialog f173565U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f173566V;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f173567b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L f173568c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final S f173569d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.dialog.a f173570e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f173571f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f173572g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f173573h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.d f173574i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f173575j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.sheet.j f173576k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f173577l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f173578m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ItemMapState f173579n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f173580o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AvitoMapAttachHelper f173581p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public AvitoMap f173582q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public AvitoMapMarker f173583r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public AvitoMapMarker f173584s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public AvitoMapMarker f173585t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f173586u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f173587v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AvitoMapTarget> f173588w = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<AvitoMapTarget> f173589x = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f173590y = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f173591z = C42727D.c(new Z(this));

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f173545A = C42727D.c(new W(this));

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final HashMap<Integer, Bitmap> f173546B = new HashMap<>();

    /* compiled from: ItemMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173592a;

        static {
            int[] iArr = new int[SellerAddressesInfo.GeoReferencesLayout.values().length];
            try {
                iArr[SellerAddressesInfo.GeoReferencesLayout.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SellerAddressesInfo.GeoReferencesLayout.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f173592a = iArr;
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AvitoMapPoint f173594c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AvitoMap f173595d;

        public b(AvitoMapPoint avitoMapPoint, AvitoMap avitoMap) {
            this.f173594c = avitoMapPoint;
            this.f173595d = avitoMap;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            AvitoMapPoint avitoMapPointA = V.a(V.this, this.f173594c);
            if (avitoMapPointA != null) {
                this.f173595d.moveTo(avitoMapPointA, true, Float.valueOf(15.0f));
            }
        }
    }

    /* compiled from: ItemMapView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/item_map/view/V$c", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements AvitoMap.MapMoveEndListener {
        public c() {
        }

        @Override // com.avito.android.avito_map.AvitoMap.MapMoveEndListener
        public final void onMapSettled(@Y61.k AvitoMapCameraPosition avitoMapCameraPosition) {
            V.this.f173588w.accept(new AvitoMapTarget(avitoMapCameraPosition.getMapPoint(), avitoMapCameraPosition.getZoomLevel()));
        }
    }

    /* compiled from: ItemMapView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/item_map/view/V$d", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements AvitoMap.MarkerClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AvitoMap f173598c;

        public d(AvitoMap avitoMap) {
            this.f173598c = avitoMap;
        }

        @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
        public final void onMarkerClicked(@Y61.l Object obj) {
            AvitoMapPoint avitoMapPoint = obj instanceof AvitoMapPoint ? (AvitoMapPoint) obj : null;
            if (avitoMapPoint != null) {
                V v12 = V.this;
                v12.f173589x.accept(new AvitoMapTarget(avitoMapPoint, this.f173598c.getMapTarget().getZoomLevel()));
                if (!v12.j() || kotlin.jvm.internal.L.f(v12.f173560P, avitoMapPoint)) {
                    return;
                }
                HashMap<AvitoMapPoint, AvitoMapMarker> map = v12.f173559O;
                AvitoMapMarker avitoMapMarker = map.get(avitoMapPoint);
                if (avitoMapMarker != null) {
                    v12.k(Collections.singletonList(avitoMapMarker));
                }
                map.remove(avitoMapPoint);
                v12.h(avitoMapPoint, true);
                AvitoMapMarker avitoMapMarker2 = map.get(v12.f173560P);
                if (avitoMapMarker2 != null) {
                    v12.k(Collections.singletonList(avitoMapMarker2));
                }
                AvitoMapPoint avitoMapPoint2 = v12.f173560P;
                if (avitoMapPoint2 != null) {
                    v12.h(avitoMapPoint2, false);
                }
                v12.f173560P = avitoMapPoint;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V(@Y61.k android.view.View r33, @Y61.k com.avito.android.item_map.view.L r34, @Y61.k com.avito.android.item_map.view.S r35, @Y61.k com.avito.android.lib.deprecated_design.dialog.a r36, @Y61.k com.avito.android.util.InterfaceC35945t1 r37, @Y61.k com.avito.android.util.InterfaceC35741a1 r38, @Y61.k com.avito.android.advert_core.contactbar.InterfaceC28265d r39, @Y61.k com.avito.android.deal_confirmation.d r40, @Y61.k Zd.InterfaceC19542a r41, @Y61.k com.avito.android.deal_confirmation.sheet.j r42, @Y61.k com.avito.android.util.InterfaceC35845m2 r43, @Y61.k com.avito.android.deeplink_handler.handler.composite.a r44, @Y61.k com.avito.android.item_map.ItemMapFragment r45, @Y61.k com.avito.android.item_map.view.ItemMapState r46, @Y61.k com.avito.android.B2 r47, @Y61.k com.avito.android.autoteka.data.a r48, @Y61.k com.avito.android.avito_map.AvitoMapAttachHelper r49) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_map.view.V.<init>(android.view.View, com.avito.android.item_map.view.L, com.avito.android.item_map.view.S, com.avito.android.lib.deprecated_design.dialog.a, com.avito.android.util.t1, com.avito.android.util.a1, com.avito.android.advert_core.contactbar.d, com.avito.android.deal_confirmation.d, Zd.a, com.avito.android.deal_confirmation.sheet.j, com.avito.android.util.m2, com.avito.android.deeplink_handler.handler.composite.a, com.avito.android.item_map.ItemMapFragment, com.avito.android.item_map.view.ItemMapState, com.avito.android.B2, com.avito.android.autoteka.data.a, com.avito.android.avito_map.AvitoMapAttachHelper):void");
    }

    public static final AvitoMapPoint a(V v12, AvitoMapPoint avitoMapPoint) {
        MapView mapView;
        BottomSheet bottomSheet;
        Float fM2;
        AvitoMapPoint avitoMapPointFromScreenLocation;
        AvitoMap map = v12.f173581p.getMap();
        if (map == null) {
            return null;
        }
        AvitoYandexMap avitoYandexMap = map instanceof AvitoYandexMap ? (AvitoYandexMap) map : null;
        if (avitoYandexMap == null || (mapView = avitoYandexMap.getMapView()) == null) {
            return null;
        }
        int iR2 = D6.r(mapView);
        ItemMapState.BottomSheetState bottomSheetState = v12.f173579n.f173437j;
        if (!((bottomSheetState != null ? bottomSheetState.f173458e : null) instanceof ItemMapState.BottomSheetVisibility.HalfExpanded) || (fM2 = (bottomSheet = v12.f173547C).getF177863v()) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf((int) (bottomSheet.getF177843b().getHeight() * fM2.floatValue()));
        if (!v12.f173561Q) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        if (iR2 == 0 || iIntValue == 0 || (avitoMapPointFromScreenLocation = map.fromScreenLocation(new Point(D6.s(mapView) / 2, ((int) ((iR2 - iIntValue) * 1.3d)) / 2))) == null) {
            return null;
        }
        return new AvitoMapPoint(avitoMapPoint.getLatitude() - (avitoMapPointFromScreenLocation.getLatitude() - avitoMapPoint.getLatitude()), avitoMapPoint.getLongitude(), null, 4, null);
    }

    public static float o(float f12) {
        if (f12 > 0.0f && f12 < 1.0f) {
            return f12;
        }
        V2.f318762a.j("ItemMapView", "Wrong bottom sheet halfExpandedRatio " + f12 + ". Default value 0.7 will be used.", null);
        return 0.7f;
    }

    public final void b(@Y61.l AvitoMapPoint avitoMapPoint, boolean z12, boolean z13, boolean z14, int i12) {
        AvitoMap avitoMap;
        AvitoMap avitoMap2;
        this.f173586u = avitoMapPoint;
        AvitoMapMarker avitoMapMarker = this.f173583r;
        if (avitoMapMarker != null && (avitoMap2 = this.f173582q) != null) {
            AvitoMap.DefaultImpls.removeMarker$default(avitoMap2, avitoMapMarker, false, 2, null);
        }
        AvitoMap avitoMap3 = this.f173582q;
        AvitoMapMarker avitoMapMarkerAddUserCoords = avitoMap3 != null ? avitoMap3.addUserCoords(avitoMapPoint, z12, R.style.Theme_DesignSystem_Legacy) : null;
        AvitoMapPoint avitoMapPoint2 = this.f173586u;
        if (avitoMapPoint2 != null && avitoMapMarkerAddUserCoords != null) {
            avitoMapMarkerAddUserCoords.setData(avitoMapPoint2);
        }
        this.f173583r = avitoMapMarkerAddUserCoords;
        if (z13) {
            if (z12) {
                AvitoMap avitoMap4 = this.f173582q;
                if (avitoMap4 != null) {
                    avitoMap4.moveTo(avitoMapPoint, true, Float.valueOf(11.5f));
                    return;
                }
                return;
            }
            if (z14) {
                AvitoMap avitoMap5 = this.f173582q;
                if (avitoMap5 != null) {
                    avitoMap5.moveTo(avitoMapPoint, true, Float.valueOf(15.0f));
                    return;
                }
                return;
            }
            AvitoMapPoint avitoMapPoint3 = this.f173587v;
            if (avitoMapPoint3 == null || (avitoMap = this.f173582q) == null) {
                return;
            }
            AvitoMap.DefaultImpls.moveToPointsWithPadding$default(avitoMap, C42745f0.U(avitoMapPoint, avitoMapPoint3), Integer.valueOf(i12), null, false, null, 28, null);
        }
    }

    public final void d(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint) {
        if (this.f173568c.d()) {
            return;
        }
        AvitoMap map = this.f173581p.getMap();
        AvitoYandexMap avitoYandexMap = map instanceof AvitoYandexMap ? (AvitoYandexMap) map : null;
        MapView mapView = avitoYandexMap != null ? avitoYandexMap.getMapView() : null;
        if (mapView != null) {
            if (!mapView.isLaidOut() || mapView.isLayoutRequested()) {
                mapView.addOnLayoutChangeListener(new b(avitoMapPoint, avitoMap));
                return;
            }
            AvitoMapPoint avitoMapPointA = a(this, avitoMapPoint);
            if (avitoMapPointA != null) {
                avitoMap.moveTo(avitoMapPointA, true, Float.valueOf(15.0f));
            }
        }
    }

    public final void e(@Y61.l AttributedText attributedText, boolean z12) {
        ItemMapState.BottomSheetState bottomSheetState = this.f173579n.f173437j;
        ItemMapState.BottomSheetState bottomSheetStateA = bottomSheetState != null ? ItemMapState.BottomSheetState.a(bottomSheetState, null, attributedText, z12, 2559) : null;
        if (bottomSheetStateA != null) {
            n(bottomSheetStateA);
        }
    }

    public final void f(@Y61.k AvitoMapPoint avitoMapPoint) {
        String str;
        ArrayList arrayList = new ArrayList();
        ItemMapState itemMapState = this.f173579n;
        ItemMapState.BottomSheetState bottomSheetState = itemMapState.f173437j;
        if (bottomSheetState != null && (str = bottomSheetState.f173455b) != null) {
            arrayList.add(new C31071h(str, itemMapState.f173429b, itemMapState.f173427B, bottomSheetState.f173457d != null || bottomSheetState.f173466m));
        }
        arrayList.add(new d0(avitoMapPoint));
        RouteButtons routeButtons = itemMapState.f173442o;
        if (routeButtons != null && routeButtons.getHasCreateFollowTheRoute()) {
            arrayList.add(new C31068e());
        }
        BottomSheet bottomSheet = this.f173547C;
        bottomSheet.n2(false);
        bottomSheet.t2(BottomSheet.NotchVisibility.f177826b);
        S s5 = this.f173569d;
        s5.f173497j = arrayList;
        s5.notifyDataSetChanged();
    }

    public final void g(BottomSheet bottomSheet) {
        bottomSheet.j2();
        Drawable drawableH = C35835l0.h(R.attr.white, this.f173555K);
        LinearLayout linearLayout = this.f173549E;
        linearLayout.setBackground(drawableH);
        linearLayout.setElevation(0.0f);
    }

    public final void h(AvitoMapPoint avitoMapPoint, boolean z12) {
        AvitoMapMarker avitoMapMarkerAddMarker;
        Bitmap bitmap;
        boolean z13 = avitoMapPoint.getData() instanceof MapMarkerBadgeText;
        HashMap<AvitoMapPoint, AvitoMapMarker> map = this.f173559O;
        Float fValueOf = Float.valueOf(2.0f);
        if (!z13) {
            AvitoMapMarker.Type type = z12 ? AvitoMapMarker.Type.MARKER_PIN_ADDRESS_DARK : AvitoMapMarker.Type.MARKER_PIN_ADDRESS_BLUE;
            AvitoMap avitoMap = this.f173582q;
            if (avitoMap == null || (avitoMapMarkerAddMarker = avitoMap.addMarker(avitoMapPoint, type, AvitoMapMarker.Anchor.BOTTOM_CENTER, fValueOf, R.style.Theme_DesignSystem_Legacy)) == null) {
                return;
            }
            avitoMapMarkerAddMarker.setData(avitoMapPoint);
            map.put(avitoMapPoint, avitoMapMarkerAddMarker);
            return;
        }
        MapMarkerBadgeText mapMarkerBadgeText = (MapMarkerBadgeText) avitoMapPoint.getData();
        AvitoMap avitoMap2 = this.f173582q;
        if (avitoMap2 != null) {
            int iHashCode = Boolean.hashCode(z12) + (avitoMapPoint.hashCode() * 31);
            ItemMapState.BottomSheetState bottomSheetState = this.f173579n.f173437j;
            if ((bottomSheetState != null ? bottomSheetState.f173457d : null) != null) {
                bitmap = AvitoMarkerIconFactoryKt.toBitmap((BlackPinView) this.f173545A.getValue());
            } else {
                C50152a c50152a = (C50152a) this.f173591z.getValue();
                c50152a.f443086b.setText(mapMarkerBadgeText.f173609b);
                View view = c50152a.f443085a;
                view.setSelected(z12);
                bitmap = AvitoMarkerIconFactoryKt.toBitmap(view);
            }
            Bitmap bitmap2 = bitmap;
            this.f173546B.put(Integer.valueOf(iHashCode), bitmap2);
            AvitoMapMarker avitoMapMarkerAddMarker$default = AvitoMap.DefaultImpls.addMarker$default(avitoMap2, avitoMapPoint, bitmap2, (AvitoMapMarker.AvitoMapAnchor) AvitoMapMarker.Anchor.BOTTOM_CENTER, fValueOf, false, 16, (Object) null);
            if (avitoMapMarkerAddMarker$default != null) {
                avitoMapMarkerAddMarker$default.setData(avitoMapPoint);
                map.put(avitoMapPoint, avitoMapMarkerAddMarker$default);
            }
        }
    }

    public final void i(com.avito.android.advert_core.contactbar.A a12, O o12, ContactBarData contactBarData, AdvertActions advertActions, String str) {
        InterfaceC28265d interfaceC28265d = this.f173573h;
        interfaceC28265d.bb(this);
        interfaceC28265d.Qa(o12);
        interfaceC28265d.Ra(str);
        interfaceC28265d.wb(advertActions);
        InterfaceC28265d.a.a(interfaceC28265d, a12, contactBarData, interfaceC28265d.Ua());
        this.f173574i.b(o12);
    }

    public final boolean j() {
        List<MultiAddressesItem> addresses;
        MultiAddressesInfo multiAddressesInfo = this.f173579n.f173431d;
        if (multiAddressesInfo == null || (addresses = multiAddressesInfo.getAddresses()) == null) {
            return false;
        }
        return !addresses.isEmpty();
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ja(@Y61.k PhoneLink phoneLink) {
        androidx.appcompat.app.l lVar = this.f173566V;
        if (lVar == null || !lVar.isShowing()) {
            androidx.appcompat.app.l lVarCreate = new l.a(new androidx.appcompat.view.d(this.f173555K, R.style.Theme_DesignSystem_Re23)).setTitle(R.string.advert_core_phone).setMessage(this.f173571f.a(phoneLink.getF133573b())).setPositiveButton(R.string.call, new U(0, this, phoneLink)).setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 21)).create();
            this.f173566V = lVarCreate;
            if (lVarCreate != null) {
                com.avito.android.lib.util.g.a(lVarCreate);
            }
            this.f173573h.qb();
        }
    }

    public final void k(List<? extends AvitoMapMarker> list) {
        for (AvitoMapMarker avitoMapMarker : list) {
            AvitoMap avitoMap = this.f173582q;
            if (avitoMap != null) {
                AvitoMap.DefaultImpls.removeMarker$default(avitoMap, avitoMapMarker, false, 2, null);
            }
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ka(@Y61.k Throwable th2) {
        L5.b(this.f173555K, InterfaceC35741a1.a.a(this.f173572g, th2, null, null, 6).k0(this.f173567b.getContext()), 0);
    }

    public final void l(BottomSheet bottomSheet, float f12) {
        bottomSheet.s2(new BottomSheet.c.a(b0.f173608c));
        bottomSheet.o2();
        bottomSheet.v2(Float.valueOf(o(f12)));
        D6.c(this.f173551G, null, null, null, 0, 7);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void la() {
        Dialog dialog = this.f173565U;
        if (dialog != null) {
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f173565U = null;
        }
    }

    public final void m(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f173567b, printableText, null, null, null, null, 0, null, null, false, false, null, this.f173556L, 2046);
    }

    public final void n(ItemMapState.BottomSheetState bottomSheetState) {
        List<GeoReference> geoReference;
        List<AmenityButton> list;
        ArrayList arrayList = new ArrayList();
        ItemMapState itemMapState = this.f173579n;
        ItemMapState.AmenityButtonsState amenityButtonsState = itemMapState.f173440m;
        if (amenityButtonsState != null && (list = amenityButtonsState.f173454b) != null && (!list.isEmpty())) {
            arrayList.add(new C31065b(itemMapState.f173440m.f173454b));
        }
        boolean z12 = bottomSheetState.f173463j;
        String str = itemMapState.f173427B;
        String str2 = itemMapState.f173429b;
        ItemMapState.BottomSheetState bottomSheetState2 = itemMapState.f173437j;
        boolean z13 = false;
        SellerAddressesInfo sellerAddressesInfo = bottomSheetState.f173457d;
        String str3 = bottomSheetState.f173455b;
        if (z12 && str3 != null && str3.length() != 0) {
            arrayList.add(new C31071h((bottomSheetState2 == null || !bottomSheetState2.f173466m) ? str3 : FV.a.f4720a.e(str3, this.f173556L, R.attr.textIconCopy, y6.b(3)), str2, str, sellerAddressesInfo != null || (bottomSheetState2 != null && bottomSheetState2.f173466m)));
        }
        Drawable drawable = null;
        if ((sellerAddressesInfo != null ? sellerAddressesInfo.getGeoReference() : null) != null) {
            int i12 = a.f173592a[sellerAddressesInfo.getGeoReferencesLayout().ordinal()];
            if (i12 == 1) {
                List<GeoReference> geoReference2 = sellerAddressesInfo.getGeoReference();
                if (geoReference2 != null) {
                    arrayList.addAll(geoReference2);
                }
            } else if (i12 == 2 && (geoReference = sellerAddressesInfo.getGeoReference()) != null) {
                List<GeoReference> list2 = geoReference;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (GeoReference geoReference3 : list2) {
                    arrayList2.add(new GeoReference(geoReference3.getColors(), geoReference3.getContent(), null, null, null));
                }
                arrayList.addAll(arrayList2);
            }
        } else {
            arrayList.addAll(bottomSheetState.f173456c);
        }
        if (bottomSheetState.f173463j) {
            arrayList.add(C31070g.f173616a);
        } else if (str3 != null && str3.length() != 0) {
            Context context = this.f173555K;
            Drawable drawableH = C35835l0.h(R.attr.ic_copyM, context);
            if (drawableH != null) {
                drawableH.setTint(C35835l0.d(R.attr.black, context));
                drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
                drawable = drawableH;
            }
            String strValueOf = String.valueOf(str3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strValueOf.concat("  "));
            if (drawable != null) {
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), strValueOf.length() + 1, spannableStringBuilder.length(), 33);
            }
            if (sellerAddressesInfo != null || (bottomSheetState2 != null && bottomSheetState2.f173466m)) {
                z13 = true;
            }
            arrayList.add(new C31071h(spannableStringBuilder, str2, str, z13));
        }
        if (bottomSheetState.f173465l) {
            arrayList.add(h0.f173623a);
        } else {
            AttributedText attributedText = bottomSheetState.f173464k;
            if (attributedText != null) {
                arrayList.add(new C31069f(attributedText));
            }
        }
        BottomSheet bottomSheet = this.f173547C;
        RouteButtons routeButtons = itemMapState.f173442o;
        if (routeButtons != null && routeButtons.getHasCreateRouteButton()) {
            arrayList.add(new C31067d());
            bottomSheet.t2(BottomSheet.NotchVisibility.f177828d);
            bottomSheet.n2(true);
            g(bottomSheet);
        }
        if (kotlin.jvm.internal.L.f(itemMapState.f173428C, Boolean.TRUE)) {
            arrayList.add(new c0(bottomSheetState.f173461h));
        }
        if (sellerAddressesInfo != null) {
            bottomSheet.t2(BottomSheet.NotchVisibility.f177827c);
            List<AttributedText> workingHours = sellerAddressesInfo.getWorkingHours();
            if (workingHours != null) {
                arrayList.add(new g0(sellerAddressesInfo.getWorkingHoursTitle(), workingHours));
            }
            if (O2.a(sellerAddressesInfo.getDetails())) {
                arrayList.add(new f0(sellerAddressesInfo.getDetailsTitle(), sellerAddressesInfo.getDetails()));
            }
            SellerAddressesInfo.SellerAddressesAdditionalInfo additionalInfo = sellerAddressesInfo.getAdditionalInfo();
            if (additionalInfo != null) {
                arrayList.add(new e0(additionalInfo));
            }
        }
        S s5 = this.f173569d;
        s5.f173497j = arrayList;
        s5.notifyDataSetChanged();
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void na() {
        Context context = this.f173555K;
        L5.b(context, context.getResources().getString(R.string.advert_core_advert_seller_notified_about_call), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMapAttach(@Y61.k com.avito.android.avito_map.AvitoMap r22) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_map.view.V.onMapAttach(com.avito.android.avito_map.AvitoMap):void");
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void t2() {
        if (this.f173565U == null) {
            this.f173565U = this.f173570e.d();
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ma() {
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ia(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
    }
}
