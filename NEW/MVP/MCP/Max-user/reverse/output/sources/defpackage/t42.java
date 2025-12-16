package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class t42 extends zk3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(t42.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public t42(l42 l42Var, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + l42Var + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
