package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b2g implements p44 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2g b;
    public final /* synthetic */ p44 c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ b2g(o2g o2gVar, p44 p44Var, Executor executor, int i) {
        this.a = i;
        this.b = o2gVar;
        this.c = p44Var;
        this.d = executor;
    }

    @Override // defpackage.p44
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                Task.completeImmediately(this.b, this.c, task, this.d, null);
                break;
            default:
                Task.completeAfterTask(this.b, this.c, task, this.d, null);
                break;
        }
        return null;
    }
}
