package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lli extends jli {
    public static final lli o = new lli(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public lli(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.dli
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.dli
    public final int b() {
        return 0;
    }

    @Override // defpackage.dli
    public final int c() {
        return this.d;
    }

    @Override // defpackage.dli
    public final boolean d() {
        return false;
    }

    @Override // defpackage.jli, defpackage.dli
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dvi.e(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
