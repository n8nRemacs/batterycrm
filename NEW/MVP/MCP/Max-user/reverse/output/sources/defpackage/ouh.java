package defpackage;

/* loaded from: classes2.dex */
public final class ouh implements avh {
    public final String a;

    public ouh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouh) && fni.a(this.a, ((ouh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowCloseDialog(appName=", this.a, ")");
    }
}
