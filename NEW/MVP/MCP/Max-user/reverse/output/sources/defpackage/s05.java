package defpackage;

/* loaded from: classes2.dex */
public final class s05 implements u05 {
    public final int a;

    public s05(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s05) && this.a == ((s05) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "DownloadFailed(textFailRes=", ")");
    }
}
