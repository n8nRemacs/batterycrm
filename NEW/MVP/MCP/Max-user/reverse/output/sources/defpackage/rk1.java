package defpackage;

/* loaded from: classes.dex */
public final class rk1 {
    public final Integer a;
    public final i8a b;

    public rk1(Integer num, i8a i8aVar) {
        this.a = num;
        this.b = i8aVar;
    }

    public static rk1 a(rk1 rk1Var, Integer num, i8a i8aVar, int i) {
        if ((i & 1) != 0) {
            num = rk1Var.a;
        }
        if ((i & 2) != 0) {
            i8aVar = rk1Var.b;
        }
        rk1Var.getClass();
        rk1Var.getClass();
        return new rk1(num, i8aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1)) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return fni.a(this.a, rk1Var.a) && fni.a(this.b, rk1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=null)";
    }
}
