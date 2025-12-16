package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class eb8 implements wta {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final uqa b;
    public final Executor c;

    public eb8(Executor executor, uqa uqaVar) {
        this.c = executor;
        this.b = uqaVar;
    }

    @Override // defpackage.wta
    public final void a(Object obj) {
        this.c.execute(new qz5(this, 21, (fb8) obj));
    }
}
