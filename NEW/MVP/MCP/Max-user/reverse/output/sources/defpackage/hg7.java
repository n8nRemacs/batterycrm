package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class hg7 extends a2 implements sg7 {
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger o;
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        b = BigInteger.valueOf(-2147483648L);
        c = BigInteger.valueOf(2147483647L);
        d = BigInteger.valueOf(Long.MIN_VALUE);
        o = BigInteger.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    public hg7(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.lyg
    public final String a() {
        return this.a.toString();
    }

    @Override // defpackage.gqa
    public final long b() {
        return this.a.longValue();
    }

    @Override // defpackage.lyg
    public final int d() {
        return 3;
    }

    @Override // defpackage.sg7
    public final int e() {
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) < 0 || bigInteger2.compareTo(c) > 0) {
            throw new MessageIntegerOverflowException(bigInteger2);
        }
        return bigInteger2.intValue();
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        a2 a2Var = (a2) ((lyg) obj);
        if (a2Var.d() != 3) {
            return false;
        }
        return this.a.equals(a2Var.f().h());
    }

    @Override // defpackage.a2, defpackage.lyg
    public final sg7 f() {
        return this;
    }

    @Override // defpackage.gqa
    public final BigInteger h() {
        return this.a;
    }

    public final int hashCode() {
        long jLongValue;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            jLongValue = bigInteger2.longValue();
        } else {
            if (d.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(o) > 0) {
                return bigInteger2.hashCode();
            }
            long jLongValue2 = bigInteger2.longValue();
            jLongValue = jLongValue2 ^ (jLongValue2 >>> 32);
        }
        return (int) jLongValue;
    }

    @Override // defpackage.sg7
    public final long i() {
        boolean zJ = j();
        BigInteger bigInteger = this.a;
        if (zJ) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    @Override // defpackage.sg7
    public final boolean j() {
        BigInteger bigInteger = d;
        BigInteger bigInteger2 = this.a;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(o) <= 0;
    }

    @Override // defpackage.a2, defpackage.lh7
    /* renamed from: k */
    public final sg7 f() {
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
