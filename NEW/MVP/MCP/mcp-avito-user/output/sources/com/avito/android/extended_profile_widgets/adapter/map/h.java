package com.avito.android.extended_profile_widgets.adapter.map;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.lite.yandex.YandexMapLiteModeViewImpl;
import com.avito.android.remote.model.ExtendedProfileGeo;
import com.avito.android.util.I5;
import com.yandex.mapkit.mapview.MapView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: MapItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/map/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/map/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f154558h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AvitoMarkerIconFactory f154560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f154561d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f154562e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ExtendedProfileGeo.Address f154563f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public YandexMapLiteModeViewImpl f154564g;

    public h(@k View view, @k AvitoMarkerIconFactory avitoMarkerIconFactory) {
        super(view);
        this.f154559b = view;
        this.f154560c = avitoMarkerIconFactory;
        this.f154561d = (TextView) view.findViewById(R.id.extended_profile_map_title);
        this.f154562e = view.findViewById(R.id.open_fullscreen_button);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.g
    public final void MT(@k MapItem mapItem, @k e eVar, @k e eVar2, @k Y41.a aVar) {
        ExtendedProfileGeo.Address address;
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl;
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl2;
        I5.a(this.f154561d, mapItem.f154544d, false);
        ExtendedProfileGeo extendedProfileGeo = mapItem.f154545e;
        List<ExtendedProfileGeo.Address> addresses = extendedProfileGeo.getAddresses();
        ExtendedProfileGeo.Address address2 = addresses != null ? (ExtendedProfileGeo.Address) C42745f0.G(addresses) : null;
        if (!L.f(address2, this.f154563f) || (yandexMapLiteModeViewImpl2 = this.f154564g) == null) {
            this.f154564g = new YandexMapLiteModeViewImpl((MapView) this.f154559b.findViewById(R.id.extended_profile_yandex_map), this.f154560c, R.style.Theme_DesignSystem_Re23);
            List<ExtendedProfileGeo.Address> addresses2 = extendedProfileGeo.getAddresses();
            if (addresses2 != null && (address = (ExtendedProfileGeo.Address) C42745f0.G(addresses2)) != null && (yandexMapLiteModeViewImpl = this.f154564g) != null) {
                MapLiteModeView.DefaultImpls.bindView$default(yandexMapLiteModeViewImpl, new AvitoMapPoint(address.getCoordinates().getLatitude(), address.getCoordinates().getLongitude(), null, 4, null), C42784z0.f406748b, eVar, eVar2, false, false, false, 80, null);
            }
            this.f154563f = address2;
        } else {
            yandexMapLiteModeViewImpl2.onStart();
        }
        this.f154562e.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(8, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154562e.setOnClickListener(null);
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl = this.f154564g;
        if (yandexMapLiteModeViewImpl != null) {
            yandexMapLiteModeViewImpl.onStop();
        }
        this.f154564g = null;
        this.f154563f = null;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.g
    public final void onDestroyView() {
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl = this.f154564g;
        if (yandexMapLiteModeViewImpl != null) {
            yandexMapLiteModeViewImpl.onDestroyView();
        }
        this.f154564g = null;
        this.f154563f = null;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.g
    public final void onLowMemory() {
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl = this.f154564g;
        if (yandexMapLiteModeViewImpl != null) {
            yandexMapLiteModeViewImpl.onLowMemory();
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.g
    public final void onStart() {
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl = this.f154564g;
        if (yandexMapLiteModeViewImpl != null) {
            yandexMapLiteModeViewImpl.onStart();
        }
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.map.g
    public final void onStop() {
        YandexMapLiteModeViewImpl yandexMapLiteModeViewImpl = this.f154564g;
        if (yandexMapLiteModeViewImpl != null) {
            yandexMapLiteModeViewImpl.onStop();
        }
    }
}
