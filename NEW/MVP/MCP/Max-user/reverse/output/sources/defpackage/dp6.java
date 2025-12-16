package defpackage;

/* loaded from: classes2.dex */
public final class dp6 implements ep6 {
    public final ece a;

    public dp6(ece eceVar) {
        this.a = eceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp6) && fni.a(this.a, ((dp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
