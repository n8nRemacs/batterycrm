package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class fa3 {
    public final int a;
    public final Method b;

    public fa3(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa3)) {
            return false;
        }
        fa3 fa3Var = (fa3) obj;
        return this.a == fa3Var.a && this.b.getName().equals(fa3Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
