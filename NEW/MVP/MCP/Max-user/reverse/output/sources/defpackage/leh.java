package defpackage;

/* loaded from: classes.dex */
public final class leh {
    public final int a;
    public final boolean b;

    public leh(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leh)) {
            return false;
        }
        leh lehVar = (leh) obj;
        return this.a == lehVar.a && this.b == lehVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VideoWebViewState(orientation=" + this.a + ", isFullScreen=" + this.b + ")";
    }
}
