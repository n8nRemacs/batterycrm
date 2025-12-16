package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lji extends zhi {
    public final transient Object[] c;
    public final transient int d;
    public final transient int o = 1;

    public lji(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rui.c(i, this.o);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
