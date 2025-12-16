package defpackage;

/* loaded from: classes.dex */
public final class e6c extends d6c {
    public final Object c;

    public e6c(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.d6c, defpackage.c6c
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.d6c, defpackage.c6c
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.c) {
            zB = super.b(obj);
        }
        return zB;
    }
}
