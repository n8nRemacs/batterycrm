package ru.cyberity.cbr.geo.domain;

import Y61.l;
import android.location.Location;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: GeoHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Landroid/location/Location;", "", "a", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a {
    public static final boolean a(@l Location location) {
        if (location == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider();
    }
}
