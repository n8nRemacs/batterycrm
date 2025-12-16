package com.avito.android.messenger.map.search;

import android.os.Bundle;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GeoSearchFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.search.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32530a extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f196511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f196512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GeoPoint f196513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ GeoPoint f196514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32530a(String str, String str2, GeoPoint geoPoint, GeoPoint geoPoint2) {
        super(1);
        this.f196511l = str;
        this.f196512m = str2;
        this.f196513n = geoPoint;
        this.f196514o = geoPoint2;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("channel_id", this.f196511l);
        bundle2.putString("initial_query", this.f196512m);
        GeoPoint geoPoint = this.f196513n;
        if (geoPoint != null) {
            bundle2.putParcelable("center_point", geoPoint);
        }
        GeoPoint geoPoint2 = this.f196514o;
        if (geoPoint2 != null) {
            bundle2.putParcelable("item_location", geoPoint2);
        }
        return G0.f406611a;
    }
}
