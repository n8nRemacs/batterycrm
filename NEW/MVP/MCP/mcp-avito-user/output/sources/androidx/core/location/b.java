package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.RestrictTo;
import j.X;

/* compiled from: GnssStatusWrapper.java */
@RestrictTo
@X
/* loaded from: classes.dex */
class b extends androidx.core.location.a {

    /* renamed from: a, reason: collision with root package name */
    public final GnssStatus f44792a;

    /* compiled from: GnssStatusWrapper.java */
    @X
    public static class a {
    }

    /* compiled from: GnssStatusWrapper.java */
    @X
    /* renamed from: androidx.core.location.b$b, reason: collision with other inner class name */
    public static class C1734b {
    }

    public b(GnssStatus gnssStatus) {
        gnssStatus.getClass();
        this.f44792a = gnssStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f44792a.equals(((b) obj).f44792a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44792a.hashCode();
    }
}
