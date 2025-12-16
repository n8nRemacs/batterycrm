package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class iq9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ lq9 d;

    public /* synthetic */ iq9(lq9 lq9Var, long j, long j2, int i) {
        this.a = i;
        this.d = lq9Var;
        this.b = j;
        this.c = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lrd lrdVar;
        switch (this.a) {
            case 0:
                lq9 lq9Var = this.d;
                hq9 hq9Var = lq9Var.u;
                lrdVar = lq9Var.a;
                vk6 vk6VarA = hq9Var.a();
                vk6VarA.k(1, this.b);
                vk6VarA.k(2, this.c);
                try {
                    lrdVar.c();
                    try {
                        vk6VarA.w();
                        lrdVar.q();
                        hq9Var.r(vk6VarA);
                        return qqg.a;
                    } finally {
                    }
                } catch (Throwable th) {
                    hq9Var.r(vk6VarA);
                    throw th;
                }
            default:
                lq9 lq9Var2 = this.d;
                hq9 hq9Var2 = lq9Var2.v;
                lrdVar = lq9Var2.a;
                vk6 vk6VarA2 = hq9Var2.a();
                vk6VarA2.k(1, this.b);
                vk6VarA2.k(2, this.c);
                try {
                    lrdVar.c();
                    try {
                        vk6VarA2.w();
                        lrdVar.q();
                        hq9Var2.r(vk6VarA2);
                        return qqg.a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    hq9Var2.r(vk6VarA2);
                    throw th2;
                }
        }
    }
}
