package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class hed {
    public volatile x9f a;
    public long b;
    public long c;
    public final tcf d;
    public final hbd e;

    public hed() {
        tcf tcfVarA = ucf.a(0L);
        this.d = tcfVarA;
        this.e = new hbd(tcfVarA);
    }

    public final void a() {
        x9f x9fVar = this.a;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.a = null;
        this.b = ((Number) this.d.getValue()).longValue();
    }
}
