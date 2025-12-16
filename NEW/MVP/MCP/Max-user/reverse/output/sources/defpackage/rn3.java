package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class rn3 implements Iterator, my7 {
    public final sm6 a;
    public int b = -1;
    public Object c;
    public Object d;
    public final /* synthetic */ sn3 o;

    public rn3(sn3 sn3Var, sm6 sm6Var) {
        this.o = sn3Var;
        this.a = sm6Var;
        a();
    }

    public final void a() {
        T t;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            sn3 sn3Var = this.o;
            if (i >= sn3Var.a) {
                return;
            }
            a17 a17Var = (a17) sn3Var.d.get(i);
            if (a17Var != null && (t = a17Var.get()) != 0) {
                this.c = t;
                Object obj = sn3Var.e.get(this.b);
                if (obj instanceof gp8) {
                    obj = ((gp8) obj).a;
                }
                if (obj != null) {
                    this.d = obj;
                    return;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.o.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b >= this.o.a) {
            throw new NoSuchElementException();
        }
        Object obj = this.c;
        Object obj2 = qqg.a;
        if (obj == null) {
            obj = obj2;
        }
        Object obj3 = this.d;
        if (obj3 != null) {
            obj2 = obj3;
        }
        Object objInvoke = this.a.invoke(obj, obj2);
        a();
        return objInvoke;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Symbol symbol = wn3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
