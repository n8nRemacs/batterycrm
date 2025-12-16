package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class rk8 {
    public LinkedList a;
    public WeakReference b;

    public final void a(qk8 qk8Var) {
        Iterator itDescendingIterator;
        Iterator itDescendingIterator2;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null || (itDescendingIterator = linkedList.descendingIterator()) == null) {
            return;
        }
        qk8 qk8Var2 = null;
        qk8 qk8Var3 = null;
        while (itDescendingIterator.hasNext()) {
            qk8 qk8Var4 = (qk8) ((WeakReference) itDescendingIterator.next()).get();
            if (qk8Var4 == null) {
                itDescendingIterator.remove();
            } else {
                if (qk8Var3 == null) {
                    qk8Var3 = qk8Var4;
                }
                if (qk8Var4 == qk8Var) {
                    if (qk8Var3 == qk8Var && (set = qk8Var.a) != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((pk8) it.next()).b();
                        }
                    }
                    itDescendingIterator.remove();
                }
            }
        }
        WeakReference weakReference = this.b;
        qk8 qk8Var5 = weakReference != null ? (qk8) weakReference.get() : null;
        if (qk8Var5 != null) {
            qk8Var2 = qk8Var5;
        } else {
            LinkedList linkedList2 = this.a;
            if (linkedList2 != null && (itDescendingIterator2 = linkedList2.descendingIterator()) != null) {
                while (itDescendingIterator2.hasNext() && (qk8Var2 = (qk8) ((WeakReference) itDescendingIterator2.next()).get()) == null) {
                    itDescendingIterator2.remove();
                }
            }
        }
        if (qk8Var2 != null) {
            qk8Var2.a();
        }
    }

    public final void b(qk8 qk8Var) {
        WeakReference weakReference;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null) {
            this.a = new LinkedList();
            weakReference = null;
        } else {
            Iterator itDescendingIterator = linkedList.descendingIterator();
            if (itDescendingIterator == null) {
                return;
            }
            weakReference = null;
            qk8 qk8Var2 = null;
            while (itDescendingIterator.hasNext()) {
                WeakReference weakReference2 = (WeakReference) itDescendingIterator.next();
                qk8 qk8Var3 = (qk8) weakReference2.get();
                if (qk8Var3 == null) {
                    itDescendingIterator.remove();
                } else {
                    if (qk8Var2 == null) {
                        if (qk8Var3 != qk8Var && (set = qk8Var3.a) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((pk8) it.next()).b();
                            }
                        }
                        qk8Var2 = qk8Var3;
                    }
                    if (qk8Var3 == qk8Var) {
                        itDescendingIterator.remove();
                        weakReference = weakReference2;
                    }
                }
            }
        }
        if (weakReference == null) {
            weakReference = new WeakReference(qk8Var);
        }
        LinkedList linkedList2 = this.a;
        if (linkedList2 != null) {
            linkedList2.add(weakReference);
        }
        WeakReference weakReference3 = this.b;
        qk8 qk8Var4 = weakReference3 != null ? (qk8) weakReference3.get() : null;
        if (qk8Var4 == null || qk8Var == qk8Var4) {
            qk8Var.a();
        } else {
            qk8Var4.a();
        }
    }
}
