package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class jva {
    public final Runnable a;
    public final js b = new js();
    public bva c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public jva(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = gva.a.a(new cva(this, 0), new cva(this, 1), new dva(this, 0), new dva(this, 1));
            } else {
                onBackInvokedCallbackA = eva.a.a(new dva(this, 2));
            }
            this.d = onBackInvokedCallbackA;
        }
    }

    public final void a(j48 j48Var, bva bvaVar) {
        l48 l48VarP = j48Var.p();
        if (l48VarP.d == l38.a) {
            return;
        }
        bvaVar.b.add(new hva(this, l48VarP, bvaVar));
        f();
        bvaVar.c = new o91(0, this, jva.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 26);
    }

    public final iva b(bva bvaVar) {
        this.b.addLast(bvaVar);
        iva ivaVar = new iva(this, bvaVar);
        bvaVar.b.add(ivaVar);
        f();
        bvaVar.c = new o91(0, this, jva.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 27);
        return ivaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        bva bvaVarPrevious;
        bva bvaVar = this.c;
        if (bvaVar == null) {
            js jsVar = this.b;
            ListIterator listIterator = jsVar.listIterator(jsVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    bvaVarPrevious = 0;
                    break;
                } else {
                    bvaVarPrevious = listIterator.previous();
                    if (((bva) bvaVarPrevious).a) {
                        break;
                    }
                }
            }
            bvaVar = bvaVarPrevious;
        }
        this.c = null;
        if (bvaVar != null) {
            bvaVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        bva bvaVarPrevious;
        bva bvaVar = this.c;
        if (bvaVar == null) {
            js jsVar = this.b;
            ListIterator listIterator = jsVar.listIterator(jsVar.getSize());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    bvaVarPrevious = 0;
                    break;
                } else {
                    bvaVarPrevious = listIterator.previous();
                    if (((bva) bvaVarPrevious).a) {
                        break;
                    }
                }
            }
            bvaVar = bvaVarPrevious;
        }
        this.c = null;
        if (bvaVar != null) {
            bvaVar.b();
        } else {
            this.a.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        eva evaVar = eva.a;
        if (z && !this.f) {
            evaVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            evaVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        js jsVar = this.b;
        if (jsVar == null || !jsVar.isEmpty()) {
            Iterator it = jsVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((bva) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }
}
