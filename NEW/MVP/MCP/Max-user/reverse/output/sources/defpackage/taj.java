package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class taj {
    public static void a(qrf qrfVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                qrfVar.S(i);
            } else if (obj instanceof byte[]) {
                qrfVar.D(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                qrfVar.g(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                qrfVar.g(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                qrfVar.k(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                qrfVar.k(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                qrfVar.k(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                qrfVar.k(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                qrfVar.f(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                qrfVar.k(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final z74 b(Executor executor) {
        z74 z74Var;
        fy4 fy4Var = executor instanceof fy4 ? (fy4) executor : null;
        return (fy4Var == null || (z74Var = fy4Var.a) == null) ? new lj5(executor) : z74Var;
    }
}
