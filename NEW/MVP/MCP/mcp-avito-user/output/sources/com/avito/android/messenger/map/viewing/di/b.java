package com.avito.android.messenger.map.viewing.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.messenger.map.viewing.PlatformMapFragment;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PlatformMapFragmentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/di/b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PlatformMapFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/viewing/di/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k InterfaceC39417a interfaceC39417a);

        @h31.b
        @k
        a b(@k Resources resources);

        @k
        b build();

        @h31.b
        @k
        a c(@l MarkersRequest markersRequest);

        @h31.b
        @k
        a d(@k ActivityC22955m activityC22955m);

        @h31.b
        @k
        a e(@k FragmentManager fragmentManager);

        @h31.b
        @k
        a f(@k GeoMarker[] geoMarkerArr);

        @k
        a g(@k c cVar);

        @h31.b
        @k
        a h(@k PlatformMapFragment platformMapFragment);
    }

    void a(@k PlatformMapFragment platformMapFragment);
}
