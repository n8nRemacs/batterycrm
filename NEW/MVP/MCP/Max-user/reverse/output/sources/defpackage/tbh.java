package defpackage;

/* loaded from: classes2.dex */
public final class tbh implements oud {
    public final sbh a;

    public tbh(sbh sbhVar) {
        this.a = sbhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbh) && fni.a(this.a, ((tbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
