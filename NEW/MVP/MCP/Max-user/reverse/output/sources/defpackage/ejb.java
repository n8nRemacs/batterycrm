package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ejb extends i2 implements RandomAccess {
    public final xx0[] a;
    public final int[] b;

    public ejb(xx0[] xx0VarArr, int[] iArr) {
        this.a = xx0VarArr;
        this.b = iArr;
    }

    @Override // defpackage.j0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof xx0) {
            return super.contains((xx0) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.j0
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.i2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof xx0) {
            return super.indexOf((xx0) obj);
        }
        return -1;
    }

    @Override // defpackage.i2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof xx0) {
            return super.lastIndexOf((xx0) obj);
        }
        return -1;
    }
}
