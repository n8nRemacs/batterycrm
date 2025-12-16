package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class sdi extends zci {
    public static final sdi o = new sdi(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public sdi(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.zci, defpackage.pci
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.pci
    public final int b() {
        return this.d;
    }

    @Override // defpackage.pci
    public final int c() {
        return 0;
    }

    @Override // defpackage.pci
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        kvi.c(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
