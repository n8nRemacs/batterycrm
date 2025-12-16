package defpackage;

/* loaded from: classes2.dex */
public abstract class ml0 implements f2h {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final ry e;
    public final boolean f;
    public final int g;
    public final int h;

    public ml0(long j, long j2, boolean z, long j3, ry ryVar, boolean z2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = ryVar;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.f2h
    public long b() {
        return 0L;
    }

    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ml0 ml0Var = (ml0) obj;
        ry ryVar = ml0Var.e;
        if (this.a != ml0Var.a || this.b != ml0Var.b || this.c != ml0Var.c || this.d != ml0Var.d || this.f != ml0Var.f || this.g != ml0Var.g || this.h != ml0Var.h) {
            return false;
        }
        ry ryVar2 = this.e;
        return ryVar2 != null ? ryVar2.equals(ryVar) : ryVar == null;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 961;
        long j3 = this.d;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        ry ryVar = this.e;
        return ((((((i2 + (ryVar != null ? ryVar.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g) * 31) + this.h;
    }
}
