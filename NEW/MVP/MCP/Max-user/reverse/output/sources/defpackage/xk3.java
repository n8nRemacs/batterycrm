package defpackage;

/* loaded from: classes.dex */
public final class xk3 {
    public final Object a;
    public final z32 b;
    public final um6 c;
    public final Object d;
    public final Throwable e;

    public xk3(Object obj, z32 z32Var, um6 um6Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = z32Var;
        this.c = um6Var;
        this.d = obj2;
        this.e = th;
    }

    public static xk3 a(xk3 xk3Var, z32 z32Var, Throwable th, int i) {
        Object obj = xk3Var.a;
        if ((i & 2) != 0) {
            z32Var = xk3Var.b;
        }
        z32 z32Var2 = z32Var;
        um6 um6Var = xk3Var.c;
        Object obj2 = xk3Var.d;
        if ((i & 16) != 0) {
            th = xk3Var.e;
        }
        xk3Var.getClass();
        return new xk3(obj, z32Var2, um6Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk3)) {
            return false;
        }
        xk3 xk3Var = (xk3) obj;
        return fni.a(this.a, xk3Var.a) && fni.a(this.b, xk3Var.b) && fni.a(this.c, xk3Var.c) && fni.a(this.d, xk3Var.d) && fni.a(this.e, xk3Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        z32 z32Var = this.b;
        int iHashCode2 = (iHashCode + (z32Var == null ? 0 : z32Var.hashCode())) * 31;
        um6 um6Var = this.c;
        int iHashCode3 = (iHashCode2 + (um6Var == null ? 0 : um6Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ xk3(Object obj, z32 z32Var, um6 um6Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : z32Var, (i & 4) != 0 ? null : um6Var, (Object) null, (i & 16) != 0 ? null : th);
    }
}
