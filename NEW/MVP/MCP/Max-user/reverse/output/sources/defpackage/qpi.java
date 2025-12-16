package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qpi implements p5j, vva, nva, kva {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public qpi(Executor executor, kva kvaVar) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = kvaVar;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        ((ybj) this.d).o(obj);
    }

    @Override // defpackage.kva
    public void b() {
        ((ybj) this.d).p();
    }

    @Override // defpackage.p5j
    public final void c(Task task) {
        switch (this.a) {
            case 0:
                if (((ybj) task).d) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new thg(14, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                }
                this.b.execute(new c5e(this, task, false, 13));
                return;
            case 2:
                if (task.h() || ((ybj) task).d) {
                    return;
                }
                synchronized (this.c) {
                }
                this.b.execute(new owf(this, 10, task));
                return;
            case 3:
                if (task.h()) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new owf(this, 11, task));
                    return;
                }
                return;
            default:
                this.b.execute(new owf(this, 12, task));
                return;
        }
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        ((ybj) this.d).n(exc);
    }

    public qpi(Executor executor, lva lvaVar) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = lvaVar;
    }

    public qpi(Executor executor, nva nvaVar) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = nvaVar;
    }

    public qpi(Executor executor, vva vvaVar) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.d = vvaVar;
    }

    public qpi(Executor executor, apf apfVar, ybj ybjVar) {
        this.a = 4;
        this.b = executor;
        this.c = apfVar;
        this.d = ybjVar;
    }
}
