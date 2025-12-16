package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class u0e {
    public static final j3f a;
    public static final xm3 b;
    public static final rs7 c;
    public static final qgg d;

    static {
        RuntimeException runtimeExceptionD;
        try {
            j3f j3fVar = t0e.a;
            Objects.requireNonNull(j3fVar, "Scheduler Supplier result can't be null");
            a = j3fVar;
            try {
                xm3 xm3Var = q0e.a;
                Objects.requireNonNull(xm3Var, "Scheduler Supplier result can't be null");
                b = xm3Var;
                try {
                    rs7 rs7Var = r0e.a;
                    Objects.requireNonNull(rs7Var, "Scheduler Supplier result can't be null");
                    c = rs7Var;
                    d = qgg.c;
                    try {
                        Objects.requireNonNull(s0e.a, "Scheduler Supplier result can't be null");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static j0e a() {
        xm3 xm3Var = b;
        v1a v1aVar = t8j.b;
        if (v1aVar == null) {
            return xm3Var;
        }
        try {
            return (j0e) v1aVar.apply(xm3Var);
        } catch (Throwable th) {
            throw bj5.d(th);
        }
    }

    public static j0e b() {
        rs7 rs7Var = c;
        qha qhaVar = t8j.d;
        if (qhaVar == null) {
            return rs7Var;
        }
        try {
            return (j0e) qhaVar.apply(rs7Var);
        } catch (Throwable th) {
            throw bj5.d(th);
        }
    }
}
