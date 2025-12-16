package defpackage;

/* loaded from: classes.dex */
public final class xcj extends n4j {
    public final transient Object[] c;
    public final transient int d;
    public final transient int o = 1;

    public xcj(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gvi.e(i, this.o);
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }
}
