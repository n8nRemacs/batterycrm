package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ysb extends wsb {
    public boolean X;
    public int Y;
    public final xsb d;
    public Object o;

    public ysb(xsb xsbVar, vig[] vigVarArr) {
        super(xsbVar.c, vigVarArr);
        this.d = xsbVar;
        this.Y = xsbVar.o;
    }

    public final void c(int i, uig uigVar, Object obj, int i2) {
        int i3 = i2 * 5;
        vig[] vigVarArr = this.a;
        if (i3 <= 30) {
            int iC = 1 << agi.c(i, i3);
            if (uigVar.i(iC)) {
                vigVarArr[i2].a(Integer.bitCount(uigVar.a) * 2, uigVar.f(iC), uigVar.d);
                this.b = i2;
                return;
            }
            int iU = uigVar.u(iC);
            uig uigVarT = uigVar.t(iU);
            vigVarArr[i2].a(Integer.bitCount(uigVar.a) * 2, iU, uigVar.d);
            c(i, uigVarT, obj, i2 + 1);
            return;
        }
        vig vigVar = vigVarArr[i2];
        Object[] objArr = uigVar.d;
        vigVar.a(objArr.length, 0, objArr);
        while (true) {
            vig vigVar2 = vigVarArr[i2];
            if (fni.a(vigVar2.a[vigVar2.c], obj)) {
                this.b = i2;
                return;
            } else {
                vigVarArr[i2].c += 2;
            }
        }
    }

    @Override // defpackage.wsb, java.util.Iterator
    public final Object next() {
        if (this.d.o != this.Y) {
            throw new ConcurrentModificationException();
        }
        if (!this.c) {
            throw new NoSuchElementException();
        }
        vig vigVar = this.a[this.b];
        this.o = vigVar.a[vigVar.c];
        this.X = true;
        return super.next();
    }

    @Override // defpackage.wsb, java.util.Iterator
    public final void remove() {
        if (!this.X) {
            throw new IllegalStateException();
        }
        boolean z = this.c;
        xsb xsbVar = this.d;
        if (!z) {
            xsbVar.remove(this.o);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            vig vigVar = this.a[this.b];
            Object obj = vigVar.a[vigVar.c];
            xsbVar.remove(this.o);
            c(obj == null ? 0 : obj.hashCode(), xsbVar.c, obj, 0);
        }
        this.o = null;
        this.X = false;
        this.Y = xsbVar.o;
    }
}
