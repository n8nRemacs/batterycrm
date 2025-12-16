package defpackage;

import bolts.Task;

/* loaded from: classes.dex */
public final class f2g implements p44 {
    @Override // defpackage.p44
    public final Object a(Task task) {
        return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
