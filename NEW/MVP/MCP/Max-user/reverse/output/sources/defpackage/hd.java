package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hd {
    public final long a;
    public final r9g b;
    public final int c;
    public final c99 d;
    public final long e;
    public final r9g f;
    public final int g;
    public final c99 h;
    public final long i;
    public final long j;

    public hd(long j, r9g r9gVar, int i, c99 c99Var, long j2, r9g r9gVar2, int i2, c99 c99Var2, long j3, long j4) {
        this.a = j;
        this.b = r9gVar;
        this.c = i;
        this.d = c99Var;
        this.e = j2;
        this.f = r9gVar2;
        this.g = i2;
        this.h = c99Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hd.class == obj.getClass()) {
            hd hdVar = (hd) obj;
            if (this.a == hdVar.a && this.c == hdVar.c && this.e == hdVar.e && this.g == hdVar.g && this.i == hdVar.i && this.j == hdVar.j && uyi.c(this.b, hdVar.b) && uyi.c(this.d, hdVar.d) && uyi.c(this.f, hdVar.f) && uyi.c(this.h, hdVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
