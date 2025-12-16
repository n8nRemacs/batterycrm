package defpackage;

/* loaded from: classes2.dex */
public final class uz extends xz {
    public final long a;
    public final r5g b;

    public uz(long j, r5g r5gVar) {
        this.a = j;
        this.b = r5gVar;
    }

    @Override // defpackage.xz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.xz
    public final s5g b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        return this.a == uzVar.a && this.b.equals(uzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NeedDownload(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
