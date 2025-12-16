package defpackage;

/* loaded from: classes2.dex */
public final class vz extends xz {
    public final long a;
    public final r5g b;

    public vz(long j, r5g r5gVar) {
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
        if (!(obj instanceof vz)) {
            return false;
        }
        vz vzVar = (vz) obj;
        return this.a == vzVar.a && this.b.equals(vzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
