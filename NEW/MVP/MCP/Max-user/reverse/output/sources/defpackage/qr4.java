package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class qr4 {
    public int a;
    public long b;
    public Object c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qr4(int i) {
        this(new CopyOnWriteArrayList(), 0, (c99) null, 0L);
        switch (i) {
            case 2:
                this.c = new w4f();
                this.d = mwf.a;
                break;
            default:
                break;
        }
    }

    public long a(long j) {
        long jK = xxg.K(j);
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + jK;
    }

    public void b(int i, gf6 gf6Var, int i2, Object obj, long j) {
        c(new g19(1, i, gf6Var, i2, obj, a(j), -9223372036854775807L));
    }

    public void c(g19 g19Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new se5(this, k99Var.b, g19Var, 22));
        }
    }

    public void d(tb8 tb8Var, int i, int i2, gf6 gf6Var, int i3, Object obj, long j, long j2) {
        e(tb8Var, new g19(i, i2, gf6Var, i3, obj, a(j), a(j2)));
    }

    public void e(tb8 tb8Var, g19 g19Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new h99(this, k99Var.b, tb8Var, g19Var, 2));
        }
    }

    public void f(tb8 tb8Var, int i, int i2, gf6 gf6Var, int i3, Object obj, long j, long j2) {
        g(tb8Var, new g19(i, i2, gf6Var, i3, obj, a(j), a(j2)));
    }

    public void g(tb8 tb8Var, g19 g19Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new h99(this, k99Var.b, tb8Var, g19Var, 1));
        }
    }

    public void h(tb8 tb8Var, int i, int i2, gf6 gf6Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        j(tb8Var, new g19(i, i2, gf6Var, i3, obj, a(j), a(j2)), iOException, z);
    }

    public void i(tb8 tb8Var, int i, IOException iOException, boolean z) {
        h(tb8Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void j(tb8 tb8Var, g19 g19Var, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new j99(this, k99Var.b, tb8Var, g19Var, iOException, z, 0));
        }
    }

    public void k(tb8 tb8Var, int i, int i2, gf6 gf6Var, int i3, Object obj, long j, long j2) {
        l(tb8Var, new g19(i, i2, gf6Var, i3, obj, a(j), a(j2)));
    }

    public void l(tb8 tb8Var, g19 g19Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new h99(this, k99Var.b, tb8Var, g19Var, 0));
        }
    }

    public void m(g19 g19Var) {
        c99 c99Var = (c99) this.c;
        c99Var.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            k99 k99Var = (k99) it.next();
            xxg.F(k99Var.a, new u02(this, k99Var.b, c99Var, g19Var, 14));
        }
    }

    public qr4(CopyOnWriteArrayList copyOnWriteArrayList, int i, c99 c99Var, long j) {
        this.d = copyOnWriteArrayList;
        this.a = i;
        this.c = c99Var;
        this.b = j;
    }

    public qr4(int i, long j, hf6 hf6Var, List list) {
        this.a = i;
        this.c = hf6Var;
        this.d = list;
        this.b = j;
    }
}
