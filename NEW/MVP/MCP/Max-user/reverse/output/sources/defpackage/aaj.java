package defpackage;

/* loaded from: classes.dex */
public final class aaj extends n4j {
    public static final aaj o = new aaj(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public aaj(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.n4j, defpackage.jyi
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.jyi
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jyi
    public final int c() {
        return 0;
    }

    @Override // defpackage.jyi
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gvi.e(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
