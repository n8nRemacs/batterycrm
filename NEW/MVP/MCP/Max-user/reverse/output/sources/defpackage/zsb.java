package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zsb extends h3 {
    public final /* synthetic */ int a;
    public final xsb b;

    public /* synthetic */ zsb(int i, xsb xsbVar) {
        this.a = i;
        this.b = xsbVar;
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
                Object key = entry.getKey();
                xsb xsbVar = this.b;
                Object obj2 = xsbVar.get(key);
                Boolean boolValueOf = obj2 == null ? null : Boolean.valueOf(obj2.equals(entry.getValue()));
                return boolValueOf == null ? entry.getValue() == null && xsbVar.containsKey(entry.getKey()) : boolValueOf.booleanValue();
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // defpackage.h3
    public final int getSize() {
        switch (this.a) {
        }
        return this.b.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new atb(this.b);
            default:
                vig[] vigVarArr = new vig[8];
                for (int i = 0; i < 8; i++) {
                    vigVarArr[i] = new wig(1);
                }
                return new btb(this.b, vigVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                xsb xsbVar = this.b;
                if (!xsbVar.containsKey(obj)) {
                    return false;
                }
                xsbVar.remove(obj);
                return true;
        }
    }
}
