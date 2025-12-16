package defpackage;

/* loaded from: classes2.dex */
public final class bt8 implements it8 {
    public final ece a;

    public bt8(ece eceVar) {
        this.a = eceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt8) && fni.a(this.a, ((bt8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
