package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ydi extends zci {
    public final transient Object[] c;
    public final transient int d;
    public final transient int o;

    public ydi(int i, int i2, Object[] objArr) {
        this.c = objArr;
        this.d = i;
        this.o = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        kvi.c(i, this.o);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
