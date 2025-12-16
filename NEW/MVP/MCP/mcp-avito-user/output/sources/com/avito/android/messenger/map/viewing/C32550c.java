package com.avito.android.messenger.map.viewing;

import android.location.Location;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lW.C43692b;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "userLocation", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32550c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196810b;

    public C32550c(PlatformMapFragment platformMapFragment) {
        this.f196810b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Location location = (Location) obj;
        PlatformMapFragment platformMapFragment = this.f196810b;
        C43692b c43692b = platformMapFragment.f196800t0;
        if (c43692b == null) {
            c43692b = null;
        }
        c43692b.f(location, null);
        y yVar = platformMapFragment.f196796p0;
        (yVar != null ? yVar : null).y(new AvitoMapPoint(location.getLatitude(), location.getLongitude(), null, 4, null));
    }
}
