package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* loaded from: classes2.dex */
public final class yg7 extends a2 implements sg7 {
    public final long a;

    public yg7(long j) {
        this.a = j;
    }

    @Override // defpackage.lyg
    public final String a() {
        return Long.toString(this.a);
    }

    @Override // defpackage.gqa
    public final long b() {
        return this.a;
    }

    @Override // defpackage.lyg
    public final int d() {
        return 3;
    }

    @Override // defpackage.sg7
    public final int e() {
        long j = this.a;
        if (-2147483648L > j || j > 2147483647L) {
            throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
        }
        return (int) j;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyg) {
            a2 a2Var = (a2) ((lyg) obj);
            if (a2Var.d() == 3) {
                sg7 sg7VarF = a2Var.f();
                if (sg7VarF.j() && this.a == sg7VarF.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a2, defpackage.lyg
    public final sg7 f() {
        return this;
    }

    @Override // defpackage.gqa
    public final BigInteger h() {
        return BigInteger.valueOf(this.a);
    }

    public final int hashCode() {
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    @Override // defpackage.sg7
    public final long i() {
        return this.a;
    }

    @Override // defpackage.sg7
    public final boolean j() {
        return true;
    }

    @Override // defpackage.a2, defpackage.lh7
    /* renamed from: k */
    public final sg7 f() {
        return this;
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
