package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kd7 extends fh6 {
    public final /* synthetic */ int d = 1;
    public final Object o;

    public kd7(jf7 jf7Var) {
        super(jf7Var);
        this.o = new AtomicBoolean(false);
    }

    @Override // defpackage.fh6, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.o).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public kd7(jf7 jf7Var, ld7 ld7Var) {
        super(jf7Var);
        this.o = new WeakReference(ld7Var);
        c(new jd7(0, this));
    }
}
