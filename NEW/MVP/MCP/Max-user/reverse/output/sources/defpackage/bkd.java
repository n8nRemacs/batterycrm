package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class bkd extends hh7 {
    public final transient int X;
    public final transient int Y;
    public final transient ah7 d;
    public final transient Object[] o;

    public bkd(ah7 ah7Var, Object[] objArr, int i, int i2) {
        this.d = ah7Var;
        this.o = objArr;
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.ng7
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ng7
    /* renamed from: g */
    public final rrg iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.hh7
    public final wg7 k() {
        return new akd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Y;
    }
}
