package com.avito.android.str_booking.ui.location;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.lite.yandex.YandexMapLiteModeViewImpl;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.util.I5;
import com.yandex.mapkit.mapview.MapView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingLocationView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/ui/location/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/location/g;", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, AvitoMap.MapClickListener, AvitoMap.MarkerClickListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f286108b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f286109c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super Coordinates, G0> f286110d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Coordinates f286111e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final YandexMapLiteModeViewImpl f286112f;

    public h(@k View view, @k AvitoMarkerIconFactory avitoMarkerIconFactory) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.str_booking_location_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286108b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_location_address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f286109c = (TextView) viewFindViewById2;
        this.f286112f = new YandexMapLiteModeViewImpl((MapView) view.findViewById(R.id.str_booking_yandex_map), avitoMarkerIconFactory, R.style.Theme_DesignSystem_Re23);
    }

    @Override // com.avito.android.str_booking.ui.location.g
    public final void B0(@l String str) {
        I5.a(this.f286109c, str, false);
    }

    @Override // com.avito.android.str_booking.ui.location.g
    public final void b(@l String str) {
        I5.a(this.f286108b, str, false);
    }

    @Override // com.avito.android.avito_map.AvitoMap.MarkerClickListener
    public final void onMarkerClicked(@l Object obj) {
        Y41.l<? super Coordinates, G0> lVar;
        Coordinates coordinates = this.f286111e;
        if (coordinates == null || (lVar = this.f286110d) == null) {
            return;
        }
        lVar.invoke(coordinates);
    }

    @Override // com.avito.android.str_booking.ui.location.g
    public final void v60(@k Y41.l<? super Coordinates, G0> lVar) {
        this.f286110d = lVar;
    }

    @Override // com.avito.android.str_booking.ui.location.g
    public final void vV(@k Coordinates coordinates) {
        this.f286111e = coordinates;
        MapLiteModeView.DefaultImpls.bindView$default(this.f286112f, new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null), C42784z0.f406748b, this, this, true, true, false, 64, null);
    }

    @Override // com.avito.android.avito_map.AvitoMap.MapClickListener
    public final void onMapClicked(@k AvitoMapTarget avitoMapTarget) {
    }
}
