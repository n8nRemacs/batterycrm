package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class cji extends zhi {
    public static final cji o = new cji(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public cji(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.zhi, defpackage.qhi
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.qhi
    public final int b() {
        return this.d;
    }

    @Override // defpackage.qhi
    public final int c() {
        return 0;
    }

    @Override // defpackage.qhi
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rui.c(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
