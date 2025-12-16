package com.avito.android.messenger.map.viewing;

import com.avito.android.remote.model.messenger.geo.GeoMarker;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "updatedGeoMarkers", "", "Lcom/avito/android/messenger/map/viewing/view/a;", "apply", "([Lcom/avito/android/remote/model/messenger/geo/GeoMarker;)Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f196789b;

    public I(A a12) {
        this.f196789b = a12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        GeoMarker[] geoMarkerArr = (GeoMarker[]) obj;
        if (geoMarkerArr.length == 0) {
            return B0.f406639b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = geoMarkerArr.length;
        A a12 = this.f196789b;
        if (length == 1) {
            linkedHashSet.add(a12.ne((GeoMarker) C42756l.C(geoMarkerArr), true));
        } else {
            for (GeoMarker geoMarker : geoMarkerArr) {
                linkedHashSet.add(a12.ne(geoMarker, false));
            }
        }
        return linkedHashSet;
    }
}
