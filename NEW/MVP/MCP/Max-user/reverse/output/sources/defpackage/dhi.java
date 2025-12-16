package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dhi extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi3 b;

    public /* synthetic */ dhi(wi3 wi3Var, int i) {
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
                Map mapO = wi3Var.o();
                if (mapO != null) {
                    return mapO.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iS = wi3Var.s(entry.getKey());
                    if (iS != -1 && pui.c(wi3Var.n()[iS], entry.getValue())) {
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
                Map mapO = wi3Var.o();
                return mapO != null ? mapO.entrySet().iterator() : new lgi(wi3Var, 1);
            default:
                wi3 wi3Var2 = this.b;
                Map mapO2 = wi3Var2.o();
                return mapO2 != null ? mapO2.keySet().iterator() : new lgi(wi3Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                wi3 wi3Var = this.b;
                Map mapO = wi3Var.o();
                if (mapO != null) {
                    return mapO.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!wi3Var.q()) {
                        int iR = wi3Var.r();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = wi3Var.b;
                        Objects.requireNonNull(obj2);
                        int iC = xui.c(key, value, iR, obj2, wi3Var.l(), wi3Var.m(), wi3Var.n());
                        if (iC != -1) {
                            wi3Var.p(iC, iR);
                            wi3Var.Y--;
                            wi3Var.X += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                wi3 wi3Var2 = this.b;
                Map mapO2 = wi3Var2.o();
                return mapO2 != null ? mapO2.keySet().remove(obj) : wi3Var2.u(obj) != wi3.v0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
