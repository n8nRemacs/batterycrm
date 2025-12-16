package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class mig {
    public static volatile rc4 e;
    public final hc3 a;
    public final hc3 b;
    public final i0e c;
    public final awg d;

    public mig(hc3 hc3Var, hc3 hc3Var2, i0e i0eVar, awg awgVar, y4i y4iVar) {
        this.a = hc3Var;
        this.b = hc3Var2;
        this.c = i0eVar;
        this.d = awgVar;
        y4iVar.a.execute(new m1h(9, y4iVar));
    }

    public static mig a() {
        rc4 rc4Var = e;
        if (rc4Var != null) {
            return (mig) rc4Var.Y.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (mig.class) {
                try {
                    if (e == null) {
                        qc4 qc4Var = new qc4();
                        context.getClass();
                        qc4Var.a = context;
                        e = qc4Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final jig c(be5 be5Var) {
        byte[] bytes;
        Set setUnmodifiableSet = be5Var != null ? Collections.unmodifiableSet(dy0.d) : Collections.singleton(new gf5("proto"));
        ka5 ka5VarA = ac0.a();
        be5Var.getClass();
        ka5VarA.a = "cct";
        dy0 dy0Var = (dy0) be5Var;
        String str = dy0Var.a;
        String str2 = dy0Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = wy1.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        ka5VarA.b = bytes;
        return new jig(setUnmodifiableSet, ka5VarA.e(), this);
    }
}
