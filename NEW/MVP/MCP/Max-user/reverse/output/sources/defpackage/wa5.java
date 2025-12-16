package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class wa5 extends eaj {
    public final /* synthetic */ eaj a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public wa5(eaj eajVar, ThreadPoolExecutor threadPoolExecutor) {
        this.a = eajVar;
        this.b = threadPoolExecutor;
    }

    @Override // defpackage.eaj
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.eaj
    public final void b(hz9 hz9Var) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.a.b(hz9Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
