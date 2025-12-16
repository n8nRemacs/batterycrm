package defpackage;

/* loaded from: classes2.dex */
public final class wuh implements avh {
    public final j5g a;
    public final l5g b;

    public wuh(j5g j5gVar, l5g l5gVar) {
        this.a = j5gVar;
        this.b = l5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuh)) {
            return false;
        }
        wuh wuhVar = (wuh) obj;
        return this.a.equals(wuhVar.a) && this.b.equals(wuhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbarShared(sharedPlural=" + this.a + ", toChatsPlural=" + this.b + ")";
    }
}
