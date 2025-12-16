package defpackage;

import android.os.SystemClock;
import android.util.SparseBooleanArray;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class rei {
    public static final ukd a = new ukd(23, null);

    public static boolean a(wie wieVar, wie wieVar2) {
        t3c t3cVar = wieVar.a;
        int i = t3cVar.b;
        t3c t3cVar2 = wieVar2.a;
        return i == t3cVar2.b && t3cVar.e == t3cVar2.e && t3cVar.h == t3cVar2.h && t3cVar.i == t3cVar2.i;
    }

    public static int b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return zxg.i(zxg.Z(j, j2), 0, 100);
    }

    public static long c(q4c q4cVar, long j, long j2, long j3) {
        wie wieVar = q4cVar.c;
        wie wieVar2 = q4cVar.c;
        boolean z = wieVar.equals(wie.l) || j2 < wieVar2.c;
        if (q4cVar.v) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - wieVar2.c;
                }
                long j4 = wieVar2.a.f + ((long) (j3 * q4cVar.g.a));
                long j5 = wieVar2.d;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return wieVar2.a.f;
        }
        return j;
    }

    public static o3c d(o3c o3cVar, o3c o3cVar2) {
        if (o3cVar != null) {
            a26 a26Var = o3cVar.a;
            if (o3cVar2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < a26Var.a.size(); i++) {
                    if (o3cVar2.a(a26Var.b(i))) {
                        int iB = a26Var.b(i);
                        hsi.g(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                hsi.g(!false);
                return new o3c(new a26(sparseBooleanArray));
            }
        }
        return o3c.b;
    }

    public static int e(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(ho7.g("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
    }

    public static q4c f(q4c q4cVar, q4c q4cVar2, o4c o4cVar, o3c o3cVar) {
        if (o4cVar.a && o3cVar.a(17)) {
            q4cVar2 = q4cVar2.h(q4cVar.j);
        }
        return (o4cVar.b && o3cVar.a(30)) ? q4cVar2.b(q4cVar.D) : q4cVar2;
    }

    public static void g(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }

    public static void h(u3c u3cVar, v69 v69Var) {
        int i = v69Var.b;
        long j = v69Var.c;
        wg7 wg7Var = v69Var.a;
        if (i == -1) {
            if (u3cVar.S(20)) {
                u3cVar.C(wg7Var);
                return;
            } else {
                if (wg7Var.isEmpty()) {
                    return;
                }
                u3cVar.x((k09) wg7Var.get(0));
                return;
            }
        }
        if (u3cVar.S(20)) {
            u3cVar.A(v69Var.b, j, wg7Var);
        } else {
            if (wg7Var.isEmpty()) {
                return;
            }
            u3cVar.h((k09) wg7Var.get(0), j);
        }
    }
}
