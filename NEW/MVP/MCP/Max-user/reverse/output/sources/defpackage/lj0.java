package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lj0 implements qe4 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public ye4 d;

    public lj0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(vggVar)) {
            return;
        }
        arrayList.add(vggVar);
        this.c++;
    }

    public final void b(int i) {
        ye4 ye4Var = this.d;
        int i2 = xxg.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((dk4) ((vgg) this.b.get(i3))).d(ye4Var, this.a, i);
        }
    }

    public final void c() throws Throwable {
        ye4 ye4Var = this.d;
        int i = xxg.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((dk4) ((vgg) this.b.get(i2))).e(ye4Var, this.a);
        }
        this.d = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((vgg) this.b.get(i)).getClass();
        }
    }

    public final void e(ye4 ye4Var) {
        this.d = ye4Var;
        for (int i = 0; i < this.c; i++) {
            ((dk4) ((vgg) this.b.get(i))).f(ye4Var, this.a);
        }
    }
}
