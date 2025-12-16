package com.avito.android.location;

import com.avito.android.remote.model.Location;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: SavedLocationStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/H;", "", "b", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface H {

    /* compiled from: SavedLocationStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SavedLocationStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/H$b;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    void a(@Y61.k Location location, @Y61.l LocationSource locationSource, boolean z12);

    void b(@Y61.k b bVar);

    @Y61.l
    q c(@Y61.k LocationSource locationSource, boolean z12);

    void d();

    void e(@Y61.k b bVar);

    @Y61.k
    HashMap<LocationSource, String> f();

    @Y61.l
    q j();
}
