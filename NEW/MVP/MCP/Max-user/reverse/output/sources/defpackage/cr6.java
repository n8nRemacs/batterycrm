package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class cr6 implements Iterator, my7 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ zde d;

    public cr6(rnf rnfVar) {
        this.a = 1;
        this.d = rnfVar;
        this.c = rnfVar.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [cm6, u08] */
    public void a() {
        az4 az4Var = (az4) this.d;
        Object objInvoke = this.b == -2 ? ((u08) az4Var.b).invoke() : ((em6) az4Var.c).invoke(this.c);
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 1) {
                }
                break;
            default:
                rnf rnfVar = (rnf) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < rnfVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                if (this.b >= rnfVar.c || !it.hasNext()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.c;
                this.b = -1;
                return obj;
            default:
                rnf rnfVar = (rnf) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < rnfVar.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i = this.b;
                if (i >= rnfVar.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                return it.next();
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

    public cr6(az4 az4Var) {
        this.a = 0;
        this.d = az4Var;
        this.b = -2;
    }
}
