package defpackage;

/* loaded from: classes2.dex */
public final class ffd {
    public final int a;
    public final int b;
    public final int c;

    public ffd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffd)) {
            return false;
        }
        ffd ffdVar = (ffd) obj;
        return this.a == ffdVar.a && this.b == ffdVar.b && this.c == ffdVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("Config(recordingButtonIcon=", this.a, ", pauseRecordingIcon=", this.b, ", resumeRecodingIcon="), this.c, ")");
    }
}
