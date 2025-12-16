package defpackage;

import bolts.Task;

/* loaded from: classes.dex */
public final class c2g implements p44 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p44 b;

    public /* synthetic */ c2g(p44 p44Var, int i) {
        this.a = i;
        this.b = p44Var;
    }

    @Override // defpackage.p44
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWith(this.b);
            default:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWithTask(this.b);
        }
    }
}
