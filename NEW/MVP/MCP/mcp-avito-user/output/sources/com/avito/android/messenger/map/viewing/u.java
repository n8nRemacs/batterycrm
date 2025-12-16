package com.avito.android.messenger.map.viewing;

import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: PlatformMapInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/geo/GeoMarker;", "it", "Lkotlin/G0;", "accept", "([Lcom/avito/android/remote/model/messenger/geo/GeoMarker;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public static final u<T> f196856b = new u<>();

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.i("PlatformMapInteractor", "Got GeoMarkers from server: " + ((GeoMarker[]) obj), null);
    }
}
