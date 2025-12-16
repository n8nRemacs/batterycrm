package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ctb extends j0 implements Set {
    public final /* synthetic */ int a;
    public final vsb b;

    public /* synthetic */ ctb(vsb vsbVar, int i) {
        this.a = i;
        this.b = vsbVar;
    }

    @Override // defpackage.j0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                vsb vsbVar = this.b;
                Object obj2 = vsbVar.get(key);
                Boolean boolValueOf = obj2 == null ? null : Boolean.valueOf(obj2.equals(entry.getValue()));
                return boolValueOf == null ? entry.getValue() == null && vsbVar.containsKey(entry.getKey()) : boolValueOf.booleanValue();
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // defpackage.j0
    public final int getSize() {
        switch (this.a) {
            case 0:
                vsb vsbVar = this.b;
                vsbVar.getClass();
                return vsbVar.b;
            default:
                vsb vsbVar2 = this.b;
                vsbVar2.getClass();
                return vsbVar2.b;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                uig uigVar = this.b.a;
                vig[] vigVarArr = new vig[8];
                for (int i = 0; i < 8; i++) {
                    vigVarArr[i] = new wig(0);
                }
                return new dtb(uigVar, vigVarArr);
            default:
                uig uigVar2 = this.b.a;
                vig[] vigVarArr2 = new vig[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    vigVarArr2[i2] = new wig(1);
                }
                return new dtb(uigVar2, vigVarArr2);
        }
    }
}
