package com.avito.android.messenger.map.viewing;

import android.os.Bundle;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformMapFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32549b extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f196806l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GeoMarker[] f196807m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MarkersRequest f196808n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f196809o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32549b(String str, GeoMarker[] geoMarkerArr, MarkersRequest markersRequest, boolean z12) {
        super(1);
        this.f196806l = str;
        this.f196807m = geoMarkerArr;
        this.f196808n = markersRequest;
        this.f196809o = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("title", this.f196806l);
        bundle2.putParcelableArray("initial_pins", this.f196807m);
        MarkersRequest markersRequest = this.f196808n;
        if (markersRequest != null) {
            bundle2.putParcelable("markers_request", markersRequest);
        }
        bundle2.putBoolean("lock_bottom_sheet", this.f196809o);
        return G0.f406611a;
    }
}
