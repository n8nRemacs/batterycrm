package androidx.core.location;

import androidx.annotation.RestrictTo;
import androidx.core.util.U;
import j.N;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: LocationRequestCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: LocationRequestCompat.java */
    public static class a {
    }

    /* compiled from: LocationRequestCompat.java */
    @X
    public static class b {
    }

    /* compiled from: LocationRequestCompat.java */
    public static final class c {
    }

    /* compiled from: LocationRequestCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface d {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        ((h) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        int i12 = (int) 0;
        return (i12 * 31) + i12;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request[@");
        Object obj = U.f44893a;
        synchronized (obj) {
            if (U.f44894b.length < 0) {
                U.f44894b = new char[0];
            }
            char[] cArr = U.f44894b;
            cArr[0] = '0';
            sb2.append(cArr, 0, 1);
        }
        sb2.append(", duration=");
        synchronized (obj) {
            if (U.f44894b.length < 0) {
                U.f44894b = new char[0];
            }
            char[] cArr2 = U.f44894b;
            cArr2[0] = '0';
            sb2.append(cArr2, 0, 1);
        }
        sb2.append(", maxUpdates=0");
        if (0.0f > 0.0d) {
            sb2.append(", minUpdateDistance=0.0");
        }
        sb2.append(']');
        return sb2.toString();
    }
}
