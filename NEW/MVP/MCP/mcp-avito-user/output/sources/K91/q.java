package K91;

import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public final I91.d f9325a;

    public q(I91.d dVar) {
        super(0);
        this.f9325a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && L.f(this.f9325a, ((q) obj).f9325a);
    }

    public final int hashCode() {
        I91.d dVar = this.f9325a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "WithBlock(address=" + this.f9325a + ')';
    }
}
