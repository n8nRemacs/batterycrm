package defpackage;

/* loaded from: classes3.dex */
public final class er6 implements z42 {
    public long a;
    public long b;

    @Override // defpackage.z42
    public final long getType() {
        return this.a;
    }

    public final String toString() {
        long j = this.a;
        return ho7.k(az1.l(j, "Capsule[type=", ", length="), this.b, "]");
    }
}
