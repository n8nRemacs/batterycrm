package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pii implements p5j, vva, nva, kva {
    public final /* synthetic */ int a;
    public final Executor b;
    public final o44 c;
    public final ybj d;

    public /* synthetic */ pii(Executor executor, o44 o44Var, ybj ybjVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = o44Var;
        this.d = ybjVar;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        this.d.o(obj);
    }

    @Override // defpackage.kva
    public void b() {
        this.d.p();
    }

    @Override // defpackage.p5j
    public final void c(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new c5e(this, task, false, 11));
                break;
            default:
                this.b.execute(new owf(this, 8, task));
                break;
        }
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        this.d.n(exc);
    }
}
