package defpackage;

/* loaded from: classes2.dex */
public final class ax5 {
    public final String a;

    public ax5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax5) && this.a.equals(((ax5) obj).a);
    }

    public final int hashCode() {
        return az1.v(2) + a9h.b(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return wy1.j("FilePreferencesOptions(name=", this.a, ", isDebugMode=false, commitStrategy=", "BIG_CHANGES", ")");
    }
}
