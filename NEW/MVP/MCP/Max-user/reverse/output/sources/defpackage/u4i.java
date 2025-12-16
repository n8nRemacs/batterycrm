package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class u4i {
    public final t2g a;
    public final se6 b;
    public final s5i c;

    static {
        cei.m("WMFgUpdater");
    }

    public u4i(WorkDatabase workDatabase, jac jacVar, u5i u5iVar) {
        this.b = jacVar;
        this.a = u5iVar;
        this.c = workDatabase.x();
    }
}
