package defpackage;

/* loaded from: classes2.dex */
public final class e94 {
    public final long a;
    public final kac b;

    public e94(long j, kac kacVar) {
        this.a = j;
        this.b = kacVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e94)) {
            return false;
        }
        e94 e94Var = (e94) obj;
        return this.a == e94Var.a && fni.a(this.b, e94Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CpuState(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
