package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class pn8 extends AbstractCollection implements Collection, ny7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pn8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((nn8) this.b).clear();
                break;
            default:
                ((xsb) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((nn8) this.b).containsValue(obj);
            default:
                return ((xsb) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((nn8) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                nn8 nn8Var = (nn8) this.b;
                nn8Var.getClass();
                return new kn8(2, nn8Var);
            default:
                xsb xsbVar = (xsb) this.b;
                vig[] vigVarArr = new vig[8];
                for (int i = 0; i < 8; i++) {
                    vigVarArr[i] = new wig(2);
                }
                return new btb(xsbVar, vigVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                nn8 nn8Var = (nn8) this.b;
                nn8Var.c();
                int i2 = nn8Var.X;
                while (true) {
                    i = -1;
                    i2--;
                    if (i2 >= 0) {
                        if (nn8Var.c[i2] >= 0 && fni.a(nn8Var.b[i2], obj)) {
                            i = i2;
                        }
                    }
                }
                if (i < 0) {
                    return false;
                }
                nn8Var.h(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                ((nn8) this.b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                ((nn8) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((nn8) this.b).s0;
            default:
                return ((xsb) this.b).getSize();
        }
    }
}
