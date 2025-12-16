package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class q98 implements py4, qy4 {
    public LinkedList a;
    public volatile boolean b;

    @Override // defpackage.qy4
    public final boolean a(py4 py4Var) {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(py4Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        py4Var.dispose();
        return false;
    }

    @Override // defpackage.qy4
    public final boolean b(py4 py4Var) {
        if (!c(py4Var)) {
            return false;
        }
        ((nzd) py4Var).dispose();
        return true;
    }

    @Override // defpackage.qy4
    public final boolean c(py4 py4Var) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                LinkedList linkedList = this.a;
                if (linkedList != null && linkedList.remove(py4Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                LinkedList linkedList = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((py4) it.next()).dispose();
                    } catch (Throwable th) {
                        raj.c(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw bj5.d((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b;
    }
}
