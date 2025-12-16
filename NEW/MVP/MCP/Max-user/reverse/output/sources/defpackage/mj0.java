package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class mj0 implements se4 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public ze4 d;

    public mj0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(wggVar)) {
            return;
        }
        arrayList.add(wggVar);
        this.c++;
    }

    public final void b(int i) {
        ze4 ze4Var = this.d;
        String str = zxg.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((wgg) this.b.get(i2)).d(this, ze4Var, this.a, i);
        }
    }

    public final void c() {
        ze4 ze4Var = this.d;
        String str = zxg.a;
        for (int i = 0; i < this.c; i++) {
            ((wgg) this.b.get(i)).h(this, ze4Var, this.a);
        }
        this.d = null;
    }

    public final void d(ze4 ze4Var) {
        for (int i = 0; i < this.c; i++) {
            ((wgg) this.b.get(i)).c(this, ze4Var, this.a);
        }
    }

    public final void e(ze4 ze4Var) {
        this.d = ze4Var;
        for (int i = 0; i < this.c; i++) {
            ((wgg) this.b.get(i)).i(this, ze4Var, this.a);
        }
    }
}
