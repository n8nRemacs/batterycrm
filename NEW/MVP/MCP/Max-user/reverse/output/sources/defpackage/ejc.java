package defpackage;

/* loaded from: classes2.dex */
public final class ejc extends ljc {
    public final long a;

    public ejc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejc) && this.a == ((ejc) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 4096;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // defpackage.t98
    public final int m() {
        return 4096;
    }

    public final String toString() {
        return a9h.d(this.a, "DebugProfileInfo(id=", ")");
    }
}
