package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class id {
    public final long a;
    public final s9g b;
    public final int c;
    public final d99 d;
    public final long e;
    public final s9g f;
    public final int g;
    public final d99 h;
    public final long i;
    public final long j;

    public id(long j, s9g s9gVar, int i, d99 d99Var, long j2, s9g s9gVar2, int i2, d99 d99Var2, long j3, long j4) {
        this.a = j;
        this.b = s9gVar;
        this.c = i;
        this.d = d99Var;
        this.e = j2;
        this.f = s9gVar2;
        this.g = i2;
        this.h = d99Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && id.class == obj.getClass()) {
            id idVar = (id) obj;
            if (this.a == idVar.a && this.c == idVar.c && this.e == idVar.e && this.g == idVar.g && this.i == idVar.i && this.j == idVar.j && Objects.equals(this.b, idVar.b) && Objects.equals(this.d, idVar.d) && Objects.equals(this.f, idVar.f) && Objects.equals(this.h, idVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
