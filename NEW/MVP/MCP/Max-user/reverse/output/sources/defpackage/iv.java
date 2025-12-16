package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iv {
    public static final i30 h = new i30(1);
    public final da8 a;
    public final xt4 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final i30 c = h;

    public iv(da8 da8Var, xt4 xt4Var) {
        this.a = da8Var;
        this.b = xt4Var;
    }

    public final void a(List list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            k98 k98Var = (k98) it.next();
            k98Var.a.D(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        da8 da8Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            da8Var.g(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.b).execute(new hv(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        da8Var.c(0, list.size());
        a(list3, runnable);
    }
}
