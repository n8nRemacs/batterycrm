package defpackage;

/* loaded from: classes2.dex */
public final class hna {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public hna(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i != 0;
    }

    public static hna a(hna hnaVar, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = hnaVar.a;
        }
        if ((i2 & 2) != 0) {
            z = hnaVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = hnaVar.c;
        }
        if ((i2 & 8) != 0) {
            z3 = hnaVar.d;
        }
        hnaVar.getClass();
        return new hna(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hna)) {
            return false;
        }
        hna hnaVar = (hna) obj;
        return this.a == hnaVar.a && this.b == hnaVar.b && this.c == hnaVar.c && this.d == hnaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b(a9h.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NotificationStackModel(hasCounterValue=" + this.a + ", hasReaction=" + this.b + ", hasMention=" + this.c + ", isMuted=" + this.d + ")";
    }
}
