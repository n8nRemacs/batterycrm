package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class vm9 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final bwf e;

    public vm9(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var4;
        this.e = new bwf(new nz(k18Var3, 20));
    }

    public final void a() {
        wqi.c(vm9.class.getName(), "try to restore uploads", new Object[0]);
        if (this.d.compareAndSet(false, true)) {
            ((ExecutorService) this.e.getValue()).execute(new gq5(20, this));
        }
    }
}
