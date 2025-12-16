package com.avito.android.location_list.di;

import android.os.Bundle;
import com.avito.android.location_list.LocationListActivity;
import com.avito.android.remote.model.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationListModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_list/di/d;", "", "a", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.h
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Bundle f182001a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LocationListActivity f182002b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Bundle f182003c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f182004d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.fragments.c f182005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182006f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182007g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Location f182008h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Location f182009i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182010j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f182011k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f182012l;

    /* compiled from: LocationListModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/di/d$a;", "", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @h31.h
    public interface a {
    }

    public d(@Y61.l Bundle bundle, @Y61.k LocationListActivity locationListActivity, @Y61.l Bundle bundle2, @Y61.k String str, @Y61.k com.avito.android.ui.fragments.c cVar, boolean z12, boolean z13, @Y61.l Location location, @Y61.l Location location2, boolean z14, @Y61.l String str2, boolean z15) {
        this.f182001a = bundle;
        this.f182002b = locationListActivity;
        this.f182003c = bundle2;
        this.f182004d = str;
        this.f182005e = cVar;
        this.f182006f = z12;
        this.f182007g = z13;
        this.f182008h = location;
        this.f182009i = location2;
        this.f182010j = z14;
        this.f182011k = str2;
        this.f182012l = z15;
    }

    public /* synthetic */ d(Bundle bundle, LocationListActivity locationListActivity, Bundle bundle2, String str, com.avito.android.ui.fragments.c cVar, boolean z12, boolean z13, Location location, Location location2, boolean z14, String str2, boolean z15, int i12, C42822w c42822w) {
        this(bundle, locationListActivity, bundle2, str, cVar, z12, z13, location, location2, z14, str2, (i12 & 2048) != 0 ? false : z15);
    }
}
