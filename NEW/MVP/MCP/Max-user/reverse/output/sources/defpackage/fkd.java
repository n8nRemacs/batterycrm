package defpackage;

/* loaded from: classes.dex */
public final class fkd extends hh7 {
    public static final Object[] s0;
    public static final fkd t0;
    public final transient Object[] X;
    public final transient int Y;
    public final transient int Z;
    public final transient Object[] d;
    public final transient int o;

    static {
        Object[] objArr = new Object[0];
        s0 = objArr;
        t0 = new fkd(0, 0, 0, objArr, objArr);
    }

    public fkd(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.o = i;
        this.X = objArr2;
        this.Y = i2;
        this.Z = i3;
    }

    @Override // defpackage.ng7
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.Z;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ng7
    public final Object[] c() {
        return this.d;
    }

    @Override // defpackage.ng7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.X;
            if (objArr.length != 0) {
                int iH = t2i.h(obj);
                while (true) {
                    int i = iH & this.Y;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iH = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ng7
    public final int d() {
        return this.Z;
    }

    @Override // defpackage.ng7
    public final int e() {
        return 0;
    }

    @Override // defpackage.ng7
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ng7
    /* renamed from: g */
    public final rrg iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.hh7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.o;
    }

    @Override // defpackage.hh7
    public final wg7 k() {
        return wg7.h(this.Z, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Z;
    }
}
