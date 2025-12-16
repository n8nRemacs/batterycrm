package defpackage;

/* loaded from: classes.dex */
public final class yjd extends gg7 {
    public static final yjd s0 = new yjd();
    public final transient int X;
    public final transient int Y;
    public final transient yjd Z;
    public final transient Object d;
    public final transient Object[] o;

    public yjd() {
        this.d = null;
        this.o = new Object[0];
        this.X = 0;
        this.Y = 0;
        this.Z = this;
    }

    @Override // defpackage.ah7
    public final hh7 b() {
        return new bkd(this, this.o, this.X, this.Y);
    }

    @Override // defpackage.ah7
    public final hh7 c() {
        return new ckd(this, new dkd(this.X, this.Y, this.o));
    }

    @Override // defpackage.ah7
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ah7, java.util.Map
    public final Object get(Object obj) {
        Object objJ = ekd.j(this.d, this.o, this.Y, this.X, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.Map
    public final int size() {
        return this.Y;
    }

    public yjd(int i, Object[] objArr) {
        this.o = objArr;
        this.Y = i;
        this.X = 0;
        int iH = i >= 2 ? hh7.h(i) : 0;
        Object objI = ekd.i(objArr, i, iH, 0);
        if (!(objI instanceof Object[])) {
            this.d = objI;
            Object objI2 = ekd.i(objArr, i, iH, 1);
            if (!(objI2 instanceof Object[])) {
                this.Z = new yjd(objI2, objArr, i, this);
                return;
            }
            throw ((zg7) ((Object[]) objI2)[2]).a();
        }
        throw ((zg7) ((Object[]) objI)[2]).a();
    }

    public yjd(Object obj, Object[] objArr, int i, yjd yjdVar) {
        this.d = obj;
        this.o = objArr;
        this.X = 1;
        this.Y = i;
        this.Z = yjdVar;
    }
}
