package defpackage;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* loaded from: classes.dex */
public abstract class du7 extends LockFreeLinkedListNode implements sy4, jj7 {
    public su7 a;

    @Override // defpackage.jj7
    public final xha b() {
        return null;
    }

    public abstract boolean c();

    public abstract void d(Throwable th);

    @Override // defpackage.sy4
    public final void dispose() {
        su7 su7Var = this.a;
        if (su7Var == null) {
            su7Var = null;
        }
        su7Var.removeNode$kotlinx_coroutines_core(this);
    }

    @Override // defpackage.jj7
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(zg4.a(this));
        sb.append("[job@");
        su7 su7Var = this.a;
        if (su7Var == null) {
            su7Var = null;
        }
        sb.append(zg4.a(su7Var));
        sb.append(']');
        return sb.toString();
    }
}
