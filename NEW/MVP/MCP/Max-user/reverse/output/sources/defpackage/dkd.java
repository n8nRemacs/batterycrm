package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dkd extends wg7 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int o;

    public dkd(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.d = i;
        this.o = i2;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u5j.d(i, this.o);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
