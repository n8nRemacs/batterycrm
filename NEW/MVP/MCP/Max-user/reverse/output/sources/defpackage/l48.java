package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class l48 {
    public AtomicReference a = new AtomicReference(null);
    public final boolean b = true;
    public zq5 c = new zq5();
    public l38 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final tcf j;

    public l48(j48 j48Var) {
        l38 l38Var = l38.b;
        this.d = l38Var;
        this.i = new ArrayList();
        this.e = new WeakReference(j48Var);
        this.j = ucf.a(l38Var);
    }

    public final void a(f48 f48Var) {
        b48 xn4Var;
        j48 j48Var;
        c("addObserver");
        l38 l38Var = this.d;
        l38 l38Var2 = l38.a;
        if (l38Var != l38Var2) {
            l38Var2 = l38.b;
        }
        k48 k48Var = new k48();
        HashMap map = n48.a;
        boolean z = f48Var instanceof b48;
        boolean z2 = f48Var instanceof vn4;
        int i = 2;
        Object obj = null;
        if (z && z2) {
            xn4Var = new xn4((vn4) f48Var, i, (b48) f48Var);
        } else if (z2) {
            xn4Var = new xn4((vn4) f48Var, i, obj);
        } else if (z) {
            xn4Var = (b48) f48Var;
        } else {
            Class<?> cls = f48Var.getClass();
            if (n48.b(cls) == 2) {
                List list = (List) n48.b.get(cls);
                if (list.size() == 1) {
                    n48.a((Constructor) list.get(0), f48Var);
                    throw null;
                }
                int size = list.size();
                zq6[] zq6VarArr = new zq6[size];
                if (size > 0) {
                    n48.a((Constructor) list.get(0), f48Var);
                    throw null;
                }
                xn4Var = new nhd(i, zq6VarArr);
            } else {
                xn4Var = new xn4(f48Var);
            }
        }
        k48Var.b = xn4Var;
        k48Var.a = l38Var2;
        if (((k48) this.c.b(f48Var, k48Var)) == null && (j48Var = (j48) this.e.get()) != null) {
            i = (this.f != 0 || this.g) ? 1 : 0;
            l38 l38VarB = b(f48Var);
            this.f++;
            while (k48Var.a.compareTo(l38VarB) < 0 && this.c.o.containsKey(f48Var)) {
                l38 l38Var3 = k48Var.a;
                ArrayList arrayList = this.i;
                arrayList.add(l38Var3);
                i38 i38Var = k38.Companion;
                l38 l38Var4 = k48Var.a;
                i38Var.getClass();
                int iOrdinal = l38Var4.ordinal();
                k38 k38Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : k38.ON_RESUME : k38.ON_START : k38.ON_CREATE;
                if (k38Var == null) {
                    throw new IllegalStateException("no event up from " + k48Var.a);
                }
                k48Var.a(j48Var, k38Var);
                arrayList.remove(arrayList.size() - 1);
                l38VarB = b(f48Var);
            }
            if (i == 0) {
                h();
            }
            this.f--;
        }
    }

    public final l38 b(f48 f48Var) {
        k48 k48Var;
        HashMap map = this.c.o;
        owd owdVar = map.containsKey(f48Var) ? ((owd) map.get(f48Var)).d : null;
        l38 l38Var = (owdVar == null || (k48Var = (k48) owdVar.b) == null) ? null : k48Var.a;
        ArrayList arrayList = this.i;
        l38 l38Var2 = arrayList.isEmpty() ? null : (l38) wy1.d(arrayList, 1);
        l38 l38Var3 = this.d;
        if (l38Var == null || l38Var.compareTo(l38Var3) >= 0) {
            l38Var = l38Var3;
        }
        return (l38Var2 == null || l38Var2.compareTo(l38Var) >= 0) ? l38Var : l38Var2;
    }

    public final void c(String str) {
        if (this.b) {
            fs.c().b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(ho7.i("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(k38 k38Var) {
        c("handleLifecycleEvent");
        e(k38Var.a());
    }

    public final void e(l38 l38Var) {
        l38 l38Var2 = this.d;
        if (l38Var2 == l38Var) {
            return;
        }
        l38 l38Var3 = l38.b;
        l38 l38Var4 = l38.a;
        if (l38Var2 == l38Var3 && l38Var == l38Var4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + l38Var + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = l38Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == l38Var4) {
            this.c = new zq5();
        }
    }

    public final void f(f48 f48Var) {
        c("removeObserver");
        this.c.c(f48Var);
    }

    public final void g(l38 l38Var) {
        c("setCurrentState");
        e(l38Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.h = false;
        r11.j.setValue(r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l48.h():void");
    }
}
