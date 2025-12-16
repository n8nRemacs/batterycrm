package com.avito.android.location_list;

import android.os.Bundle;
import com.avito.android.remote.model.Location;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_list.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31531z extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Location f182088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Location f182089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f182090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f182091o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f182092p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f182093q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f182094r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31531z(Location location, Location location2, boolean z12, boolean z13, boolean z14, String str, boolean z15) {
        super(1);
        this.f182088l = location;
        this.f182089m = location2;
        this.f182090n = z12;
        this.f182091o = z13;
        this.f182092p = z14;
        this.f182093q = str;
        this.f182094r = z15;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("selected_location", this.f182088l);
        bundle2.putParcelable("parent_location", this.f182089m);
        bundle2.putBoolean("has_region", this.f182090n);
        bundle2.putBoolean("has_search_area", this.f182091o);
        bundle2.putBoolean("show_whole", this.f182092p);
        bundle2.putString("extra_category_id", this.f182093q);
        bundle2.putBoolean("track_location_events", this.f182094r);
        return G0.f406611a;
    }
}
