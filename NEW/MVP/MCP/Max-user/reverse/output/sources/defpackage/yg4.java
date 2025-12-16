package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class yg4 {
    public final long a;
    public final s5g b;
    public final int c;
    public final s5g d;
    public final i8j e;

    public yg4(long j, s5g s5gVar, int i, s5g s5gVar2, i8j i8jVar) {
        this.a = j;
        this.b = s5gVar;
        this.c = i;
        this.d = s5gVar2;
        this.e = i8jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg4)) {
            return false;
        }
        yg4 yg4Var = (yg4) obj;
        return pu4.a(this.a, yg4Var.a) && fni.a(this.b, yg4Var.b) && this.c == yg4Var.c && fni.a(this.d, yg4Var.d) && fni.a(this.e, yg4Var.e);
    }

    public final int hashCode() {
        AtomicLong atomicLong = pu4.b;
        int iK = xrf.k(this.c, xc0.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
        s5g s5gVar = this.d;
        return this.e.hashCode() + ((iK + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    public final String toString() {
        AtomicLong atomicLong = pu4.b;
        return "DebugSettingItem(itemId=" + a9h.d(this.a, "DevButtonId(value=", ")") + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    public /* synthetic */ yg4(long j, s5g s5gVar, int i, s5g s5gVar2, i8j i8jVar, int i2) {
        this(j, s5gVar, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : s5gVar2, (i2 & 16) != 0 ? vg4.a : i8jVar);
    }
}
