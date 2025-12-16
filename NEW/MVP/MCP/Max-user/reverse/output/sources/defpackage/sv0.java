package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class sv0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sv0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        nf9 nf9VarB;
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                uv0 uv0Var = (uv0) this.c;
                c1f c1fVar = (c1f) this.d;
                String str = c1fVar.a;
                be7 be7Var = uv0Var.f;
                if (atomicBoolean.get()) {
                    throw new CancellationException();
                }
                ce5 ce5VarJ = uv0Var.g.j(c1fVar);
                if (ce5VarJ != null) {
                    op5.d(uv0.class, str, "Found image for %s in staging area");
                    be7Var.getClass();
                } else {
                    op5.d(uv0.class, str, "Did not find image for %s in staging area");
                    be7Var.getClass();
                    try {
                        nf9VarB = uv0Var.b(c1fVar);
                    } catch (Exception unused) {
                    }
                    if (nf9VarB == null) {
                        return null;
                    }
                    qk4 qk4VarJ0 = vc3.j0(nf9VarB);
                    try {
                        ce5VarJ = new ce5(qk4VarJ0);
                    } finally {
                        qk4VarJ0.close();
                    }
                }
                if (!Thread.interrupted()) {
                    return ce5VarJ;
                }
                if (op5.a.h(2)) {
                    op5.a.v(uv0.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                }
                ce5VarJ.close();
                throw new InterruptedException();
            case 1:
                return ((ft4) this.b).a.submit(new kr4((Callable) this.c, 3, (iv6) this.d));
            default:
                jac jacVar = (jac) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                String str2 = (String) this.d;
                WorkDatabase workDatabase = jacVar.o;
                arrayList.addAll(workDatabase.y().i(str2));
                return workDatabase.x().p(str2);
        }
    }
}
