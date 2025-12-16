package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class xj5 implements Callable {
    public final Callable a;
    public final tj5 b;
    public final uj5 c;

    public xj5(Callable callable, tj5 tj5Var, uj5 uj5Var) {
        this.a = callable;
        this.b = tj5Var;
        this.c = uj5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        uj5 uj5Var = this.c;
        long jA = this.b.a();
        try {
            return this.a.call();
        } finally {
            uj5Var.a(jA);
        }
    }
}
