package com.avito.android.advert_core.map;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.lite.google.GoogleMapLiteModeViewImpl;
import com.avito.android.avito_map.lite.yandex.YandexMapLiteModeViewImpl;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.yandex.mapkit.mapview.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertMapView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/map/i;", "Lcom/avito/android/advert_core/map/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f83766b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AvitoMarkerIconFactory f83767c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83768d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f83769e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f83770f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f83771g;

    /* renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f83772h;

    /* renamed from: i, reason: collision with root package name */
    public final View f83773i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public CardView f83774j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public View f83775k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public MapLiteModeView f83776l;

    public i(@Y61.k View view, @Y61.k AvitoMarkerIconFactory avitoMarkerIconFactory, boolean z12) {
        super(view);
        this.f83766b = view;
        this.f83767c = avitoMarkerIconFactory;
        this.f83768d = z12;
        this.f83769e = (TextView) view.findViewById(R.id.developments_catalog_map_header);
        this.f83770f = (TextView) view.findViewById(R.id.developments_catalog_map_objects);
        this.f83771g = (TextView) view.findViewById(R.id.developments_catalog_map_distance);
        this.f83772h = (ShimmerFrameLayout) view.findViewById(R.id.map_shimmer);
        this.f83773i = view.findViewById(R.id.map_overlay);
    }

    @Override // com.avito.android.advert_core.map.g
    public final void B20(@Y61.k a aVar) {
        TextView textView = this.f83769e;
        if (textView != null) {
            I5.a(textView, aVar.f83744c, false);
            Integer numValueOf = Integer.valueOf(R.attr.textH2);
            if (!aVar.f83747f) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                textView.setTextAppearance(C35835l0.j(numValueOf.intValue(), textView.getContext()));
            }
        }
        TextView textView2 = this.f83770f;
        if (textView2 != null) {
            I5.a(textView2, aVar.f83745d, false);
        }
        TextView textView3 = this.f83771g;
        if (textView3 != null) {
            I5.a(textView3, aVar.f83746e, false);
        }
    }

    @Override // com.avito.android.advert_core.map.g
    public final boolean B4() {
        return this.f83776l != null;
    }

    @Override // com.avito.android.advert_core.map.g
    public final void Eq(@Y61.k a aVar, @Y61.k e eVar, @Y61.k e eVar2) {
        float f12;
        if (B4()) {
            return;
        }
        View view = this.f83766b;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.stub_map);
        boolean z12 = this.f83768d;
        if (viewStub != null) {
            viewStub.setLayoutResource(z12 ? R.layout.advert_map_yandex_view : R.layout.advert_map_google_view);
            viewStub.inflate();
        }
        AvitoMarkerIconFactory avitoMarkerIconFactory = this.f83767c;
        this.f83776l = z12 ? new YandexMapLiteModeViewImpl((MapView) view.findViewById(R.id.developments_catalog_yandex_map), avitoMarkerIconFactory, R.style.Theme_DesignSystem_Legacy) : new GoogleMapLiteModeViewImpl((com.google.android.gms.maps.MapView) view.findViewById(R.id.developments_catalog_google_map), avitoMarkerIconFactory);
        this.f83774j = (CardView) view.findViewById(R.id.map_container);
        this.f83775k = view.findViewById(R.id.map_shimmer_background);
        MapLiteModeView mapLiteModeView = this.f83776l;
        if (mapLiteModeView != null) {
            MapLiteModeView.DefaultImpls.bindView$default(mapLiteModeView, aVar.f83742a, aVar.f83743b, eVar, eVar2, true, true, false, 64, null);
        }
        if (z12) {
            if (aVar.f83748g) {
                View view2 = this.f83775k;
                if (view2 != null) {
                    view2.setBackground(D6.u(view, R.drawable.advert_map_shimmer_backround_rounded));
                }
                f12 = 20.0f;
            } else {
                View view3 = this.f83775k;
                if (view3 != null) {
                    view3.setBackground(D6.u(view, R.drawable.advert_map_shimmer_background));
                }
                f12 = 5.0f;
            }
            float fApplyDimension = TypedValue.applyDimension(1, f12, view.getResources().getDisplayMetrics());
            CardView cardView = this.f83774j;
            if (cardView != null) {
                cardView.setRadius(fApplyDimension);
            }
        }
        this.f83772h.postDelayed(new h(this), 700L);
    }

    @Override // com.avito.android.advert_core.map.g
    public final void onDestroyView() {
        MapLiteModeView mapLiteModeView = this.f83776l;
        if (mapLiteModeView != null) {
            mapLiteModeView.onDestroyView();
        }
    }

    @Override // com.avito.android.advert_core.map.g
    public final void onLowMemory() {
        MapLiteModeView mapLiteModeView = this.f83776l;
        if (mapLiteModeView != null) {
            mapLiteModeView.onLowMemory();
        }
    }

    @Override // com.avito.android.advert_core.map.g
    public final void onStart() {
        MapLiteModeView mapLiteModeView = this.f83776l;
        if (mapLiteModeView != null) {
            mapLiteModeView.onStart();
        }
    }

    @Override // com.avito.android.advert_core.map.g
    public final void onStop() {
        MapLiteModeView mapLiteModeView = this.f83776l;
        if (mapLiteModeView != null) {
            mapLiteModeView.onStop();
        }
    }
}
