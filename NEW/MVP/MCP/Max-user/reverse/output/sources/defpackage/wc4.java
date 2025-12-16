package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class wc4 extends jae {
    public wc4(jy0 jy0Var) {
        super(jy0Var, new fd4());
    }

    @Override // defpackage.jae
    public final nae a(k09 k09Var) {
        return new xc4(k09Var, this.b, this.a, this.c, this.d, this.e);
    }

    @Override // defpackage.jae
    public final jae b(long j) {
        this.e = j;
        return this;
    }

    @Override // defpackage.jae
    public final jae c(ExecutorService executorService) {
        this.c = executorService;
        return this;
    }

    @Override // defpackage.jae
    public final jae d(long j) {
        this.d = j;
        return this;
    }
}
