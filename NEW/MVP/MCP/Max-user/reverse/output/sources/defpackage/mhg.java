package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mhg implements Iterator, my7 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public mhg(f2 f2Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = f2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((nhg) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) this.c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                f2 f2Var = viewGroup != null ? new f2(9, viewGroup) : null;
                if (f2Var == null || !f2Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) ue3.P(arrayList);
                        af3.x(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = f2Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public mhg(nhg nhgVar) {
        this.a = 0;
        this.c = nhgVar;
        this.b = nhgVar.a.iterator();
    }
}
