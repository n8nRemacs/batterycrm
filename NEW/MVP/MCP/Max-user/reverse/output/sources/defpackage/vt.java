package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class vt {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        ((vt) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(1000) + a9h.a(Boolean.hashCode(false) * 31, 31, BuildConfig.SILENCE_TIME_TO_UPLOAD);
    }

    public final String toString() {
        return "Config(doAsserts=false, sendTimeout=15000, maxEvents=1000)";
    }
}
