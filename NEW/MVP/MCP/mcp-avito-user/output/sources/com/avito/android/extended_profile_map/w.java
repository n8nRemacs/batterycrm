package com.avito.android.extended_profile_map;

import android.view.View;
import androidx.core.view.C22823h0;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22984Q;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapMarker;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: ExtendedProfileMapView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/w;", "Lcom/avito/android/extended_profile_map/n;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class w implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f151328b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileMapFragment f151329c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final y f151330d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<AA.a, G0> f151331e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.c f151332f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public AvitoMap f151333g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f151334h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f151335i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public String f151336j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f151337k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_map.bottom_sheet.f f151338l;

    public w(@Y61.k View view, @Y61.k ExtendedProfileMapFragment extendedProfileMapFragment, @Y61.k y yVar, @Y61.k Y41.l lVar, @Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.extended_profile_phone_dialog.c cVar) {
        this.f151328b = view;
        this.f151329c = extendedProfileMapFragment;
        this.f151330d = yVar;
        this.f151331e = lVar;
        this.f151332f = cVar;
        View viewFindViewById = view.findViewById(R.id.extended_profile_map_close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f151334h = viewFindViewById;
        this.f151335i = new LinkedHashMap();
        this.f151338l = new com.avito.android.extended_profile_map.bottom_sheet.f(view.getContext(), new p(this), new q(this), new r(this));
        viewFindViewById.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 7));
        C22823h0.K(view, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 16));
        avitoMapAttachHelper.setMapAttachedListener(this);
        avitoMapAttachHelper.attachView(R.id.extended_profile_map, view, fragmentManager);
        C43259k.d(C22984Q.a(extendedProfileMapFragment.getViewLifecycleOwner()), null, null, new o(extendedProfileMapFragment, this, null), 3);
    }

    public final void a(String str, boolean z12) {
        AvitoMap avitoMap;
        LinkedHashMap linkedHashMap = this.f151335i;
        AvitoMapMarker avitoMapMarker = (AvitoMapMarker) linkedHashMap.get(str);
        if (avitoMapMarker != null) {
            AvitoMap avitoMap2 = this.f151333g;
            if (avitoMap2 != null) {
                AvitoMap.DefaultImpls.removeMarker$default(avitoMap2, avitoMapMarker, false, 2, null);
            }
            AvitoMap avitoMap3 = this.f151333g;
            if (avitoMap3 != null) {
                AvitoMapMarker avitoMapMarkerAddMarker$default = AvitoMap.DefaultImpls.addMarker$default(avitoMap3, avitoMapMarker.getPosition(), z12 ? AvitoMapMarker.Type.MARKER_PIN_DEFAULT_RED : AvitoMapMarker.Type.MARKER_PIN_DEFAULT, (AvitoMapMarker.AvitoMapAnchor) null, (Float) null, R.style.Theme_DesignSystem_Re23, 12, (Object) null);
                if (avitoMapMarkerAddMarker$default != null) {
                    Object data = avitoMapMarker.getData();
                    if (data != null) {
                        avitoMapMarkerAddMarker$default.setData(data);
                    }
                    linkedHashMap.put(str, avitoMapMarkerAddMarker$default);
                }
            }
        }
        if (z12) {
            this.f151336j = str;
            AvitoMapMarker avitoMapMarker2 = (AvitoMapMarker) linkedHashMap.get(str);
            if (avitoMapMarker2 == null || (avitoMap = this.f151333g) == null) {
                return;
            }
            avitoMap.moveTo(avitoMapMarker2.getPosition().getLatitude() - 0.1d, avitoMapMarker2.getPosition().getLongitude(), true, Float.valueOf(10.0f));
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper.MapAttachListener
    public final void onMapAttach(@Y61.k AvitoMap avitoMap) {
        this.f151333g = avitoMap;
    }
}
