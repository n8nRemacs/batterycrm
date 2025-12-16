package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class on8 extends h3 {
    public final /* synthetic */ int a;
    public final nn8 b;

    public /* synthetic */ on8(int i, nn8 nn8Var) {
        this.a = i;
        this.b = nn8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                nn8 nn8Var = this.b;
                nn8Var.getClass();
                int iE = nn8Var.e(entry.getKey());
                if (iE < 0) {
                    return false;
                }
                return fni.a(nn8Var.b[iE], entry.getValue());
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                nn8 nn8Var = this.b;
                nn8Var.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iE = nn8Var.e(entry.getKey());
                        if (!(iE < 0 ? false : fni.a(nn8Var.b[iE], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.h3
    public final int getSize() {
        switch (this.a) {
        }
        return this.b.s0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                nn8 nn8Var = this.b;
                nn8Var.getClass();
                return new kn8(0, nn8Var);
            default:
                nn8 nn8Var2 = this.b;
                nn8Var2.getClass();
                return new kn8(1, nn8Var2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    nn8 nn8Var = this.b;
                    nn8Var.c();
                    int iE = nn8Var.e(entry.getKey());
                    if (iE >= 0 && fni.a(nn8Var.b[iE], entry.getValue())) {
                        nn8Var.h(iE);
                        break;
                    }
                }
                break;
            default:
                nn8 nn8Var2 = this.b;
                nn8Var2.c();
                int iE2 = nn8Var2.e(obj);
                if (iE2 >= 0) {
                    nn8Var2.h(iE2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                this.b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                this.b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
