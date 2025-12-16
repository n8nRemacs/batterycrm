package u31;

import kotlin.jvm.internal.L;

/* renamed from: u31.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48788c {

    /* renamed from: c, reason: collision with root package name */
    public static final C48788c f439756c = new C48788c(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f439757a;

    /* renamed from: b, reason: collision with root package name */
    public final g31.f f439758b;

    public C48788c(Integer num, g31.f fVar) {
        this.f439757a = num;
        this.f439758b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48788c)) {
            return false;
        }
        C48788c c48788c = (C48788c) obj;
        return L.f(this.f439757a, c48788c.f439757a) && L.f(this.f439758b, c48788c.f439758b);
    }

    public final int hashCode() {
        Integer num = this.f439757a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        g31.f fVar = this.f439758b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "LoadingSsoState(partnerColorInt=" + this.f439757a + ", openScreen=" + this.f439758b + ")";
    }
}
