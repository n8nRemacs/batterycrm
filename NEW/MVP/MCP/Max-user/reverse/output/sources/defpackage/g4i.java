package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g4i {
    public static final g4i b;
    public final e4i a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = d4i.q;
        } else {
            b = e4i.b;
        }
    }

    public g4i(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new d4i(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new c4i(this, windowInsets);
        } else if (i >= 28) {
            this.a = new b4i(this, windowInsets);
        } else {
            this.a = new a4i(this, windowInsets);
        }
    }

    public static co7 e(co7 co7Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, co7Var.a - i);
        int iMax2 = Math.max(0, co7Var.b - i2);
        int iMax3 = Math.max(0, co7Var.c - i3);
        int iMax4 = Math.max(0, co7Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? co7Var : co7.b(iMax, iMax2, iMax3, iMax4);
    }

    public static g4i h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        g4i g4iVar = new g4i(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = hfh.a;
            g4i g4iVarA = weh.a(view);
            e4i e4iVar = g4iVar.a;
            e4iVar.q(g4iVarA);
            e4iVar.d(view.getRootView());
        }
        return g4iVar;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g4i) {
            return Objects.equals(this.a, ((g4i) obj).a);
        }
        return false;
    }

    public final g4i f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        y3i x3iVar = i5 >= 30 ? new x3i(this) : i5 >= 29 ? new v3i(this) : new u3i(this);
        x3iVar.g(co7.b(i, i2, i3, i4));
        return x3iVar.b();
    }

    public final WindowInsets g() {
        e4i e4iVar = this.a;
        if (e4iVar instanceof z3i) {
            return ((z3i) e4iVar).c;
        }
        return null;
    }

    public final int hashCode() {
        e4i e4iVar = this.a;
        if (e4iVar == null) {
            return 0;
        }
        return e4iVar.hashCode();
    }

    public g4i() {
        this.a = new e4i(this);
    }
}
