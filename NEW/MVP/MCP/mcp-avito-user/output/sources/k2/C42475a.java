package k2;

import Y61.k;
import Y61.l;
import android.util.DisplayMetrics;
import kotlin.Metadata;

/* compiled from: DeviceMetrics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk2/a;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C42475a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DisplayMetrics f406024a;

    public C42475a(@k DisplayMetrics displayMetrics) {
        this.f406024a = displayMetrics;
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof C42475a) {
            C42475a c42475a = (C42475a) obj;
            c42475a.getClass();
            if (this.f406024a.equals(c42475a.f406024a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f406024a.hashCode() - 564489730;
    }

    @k
    public final String toString() {
        return "DeviceMetrics{ Manufacturer: google, model: pixel fold, Rear display metrics: " + this.f406024a + " }";
    }
}
