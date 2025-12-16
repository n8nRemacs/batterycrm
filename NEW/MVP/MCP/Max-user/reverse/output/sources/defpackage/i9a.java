package defpackage;

/* loaded from: classes2.dex */
public final class i9a {
    public final h9a a;
    public final boolean b;

    public i9a(h9a h9aVar, boolean z) {
        this.a = h9aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9a)) {
            return false;
        }
        i9a i9aVar = (i9a) obj;
        return fni.a(this.a, i9aVar.a) && this.b == i9aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
