package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ti3 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi3 b;

    public /* synthetic */ ti3(wi3 wi3Var, int i) {
        this.a = i;
        this.b = wi3Var;
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
                wi3 wi3Var = this.b;
                Map mapB = wi3Var.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = wi3Var.d(entry.getKey());
                    if (iD != -1 && uyi.c(wi3Var.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                wi3 wi3Var = this.b;
                Map mapB = wi3Var.b();
                return mapB != null ? mapB.entrySet().iterator() : new si3(wi3Var, 1);
            default:
                wi3 wi3Var2 = this.b;
                Map mapB2 = wi3Var2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new si3(wi3Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                wi3 wi3Var = this.b;
                Map mapB = wi3Var.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!wi3Var.f()) {
                        int iC = wi3Var.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = wi3Var.b;
                        Objects.requireNonNull(obj2);
                        int iD = z4j.d(key, value, iC, obj2, wi3Var.h(), wi3Var.i(), wi3Var.j());
                        if (iD != -1) {
                            wi3Var.e(iD, iC);
                            wi3Var.Y--;
                            wi3Var.X += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                wi3 wi3Var2 = this.b;
                Map mapB2 = wi3Var2.b();
                return mapB2 != null ? mapB2.keySet().remove(obj) : wi3Var2.g(obj) != wi3.u0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
