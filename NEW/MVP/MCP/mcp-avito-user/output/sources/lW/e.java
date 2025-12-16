package lW;

import Y61.k;
import android.location.Location;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LocationAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-location_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    @k
    public static final List<String> a(@k Location location) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(location.getTime());
        String provider = location.getProvider();
        if (provider == null) {
            provider = "";
        }
        return C42745f0.U(String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude()), String.valueOf(location.getAccuracy()), String.valueOf(seconds), provider);
    }
}
