package defpackage;

/* loaded from: classes2.dex */
public final class bkh implements oud {
    public final h3a a;

    public bkh(h3a h3aVar) {
        this.a = h3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkh) && fni.a(this.a, ((bkh) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
