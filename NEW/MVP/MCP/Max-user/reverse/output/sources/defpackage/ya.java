package defpackage;

/* loaded from: classes.dex */
public final class ya implements lb {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ((ya) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "DisableAllCameraAndMicInCall(isSuccess=true, isEnabled=false)";
    }
}
