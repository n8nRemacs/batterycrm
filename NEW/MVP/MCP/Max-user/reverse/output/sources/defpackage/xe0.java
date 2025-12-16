package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class xe0 {
    public static final Set a = gke.h(uz9.Y, uz9.o, uz9.d, uz9.X, uz9.Z);

    public static boolean a(String str) {
        Object next;
        f2 f2Var = new f2(0, uz9.w0);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((uz9) next).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        uz9 uz9Var = (uz9) next;
        if (uz9Var == null) {
            uz9Var = uz9.c;
        }
        return !a.contains(uz9Var);
    }
}
