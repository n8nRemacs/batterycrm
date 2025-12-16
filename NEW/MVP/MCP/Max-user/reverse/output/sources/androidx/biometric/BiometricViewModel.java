package androidx.biometric;

import android.os.Looper;
import defpackage.dvi;
import defpackage.go0;
import defpackage.i5i;
import defpackage.j8a;
import defpackage.jkc;
import defpackage.ko0;
import defpackage.un0;
import defpackage.yfh;

/* loaded from: classes.dex */
public class BiometricViewModel extends yfh {
    public dvi b;
    public jkc c;
    public go0 d;
    public jkc e;
    public i5i f;
    public ko0 g;
    public String h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public j8a o;
    public j8a p;
    public j8a q;
    public j8a r;
    public j8a s;
    public j8a u;
    public j8a w;
    public j8a x;
    public int i = 0;
    public boolean t = true;
    public int v = 0;

    public static void j(j8a j8aVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            j8aVar.k(obj);
        } else {
            j8aVar.i(obj);
        }
    }

    public final int e() {
        return this.c != null ? 15 : 0;
    }

    public final void f(un0 un0Var) {
        if (this.p == null) {
            this.p = new j8a();
        }
        j(this.p, un0Var);
    }

    public final void g(CharSequence charSequence) {
        if (this.x == null) {
            this.x = new j8a();
        }
        j(this.x, charSequence);
    }

    public final void h(int i) {
        if (this.w == null) {
            this.w = new j8a();
        }
        j(this.w, Integer.valueOf(i));
    }

    public final void i(boolean z) {
        if (this.s == null) {
            this.s = new j8a();
        }
        j(this.s, Boolean.valueOf(z));
    }
}
