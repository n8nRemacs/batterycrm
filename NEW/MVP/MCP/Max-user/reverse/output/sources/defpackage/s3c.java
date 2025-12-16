package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s3c implements lw0 {
    public final long X;
    public final long Y;
    public final int Z;
    public final Object a;
    public final int b;
    public final i09 c;
    public final Object d;
    public final int o;
    public final int s0;

    public s3c(Object obj, int i, i09 i09Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = i09Var;
        this.d = obj2;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = i3;
        this.s0 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3c.class == obj.getClass()) {
            s3c s3cVar = (s3c) obj;
            if (this.b == s3cVar.b && this.o == s3cVar.o && this.X == s3cVar.X && this.Y == s3cVar.Y && this.Z == s3cVar.Z && this.s0 == s3cVar.s0 && uyi.c(this.a, s3cVar.a) && uyi.c(this.d, s3cVar.d) && uyi.c(this.c, s3cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.o), Long.valueOf(this.X), Long.valueOf(this.Y), Integer.valueOf(this.Z), Integer.valueOf(this.s0)});
    }
}
