package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v7f {
    public int a;
    public int b;
    public final a c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;

    public v7f(int i, int i2, e eVar) {
        a aVar = eVar.c;
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = eVar;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (u7f u7fVar : ue3.d0(this.k)) {
            if (!u7fVar.b) {
                u7fVar.a(viewGroup);
            }
            u7fVar.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.w0 = false;
        this.l.k();
    }

    public final void c(u7f u7fVar) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(u7fVar) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        int iV = az1.v(i2);
        a aVar = this.c;
        if (iV == 0) {
            if (this.a != 1) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = " + ctd.o(this.a) + " -> " + ctd.o(i) + '.');
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iV == 1) {
            if (this.a == 1) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ctd.n(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                this.i = true;
                return;
            }
            return;
        }
        if (iV != 2) {
            return;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = " + ctd.o(this.a) + " -> REMOVED. mLifecycleImpact  = " + ctd.n(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
        this.i = true;
    }

    public final String toString() {
        StringBuilder sbN = az1.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(ctd.o(this.a));
        sbN.append(" lifecycleImpact = ");
        sbN.append(ctd.n(this.b));
        sbN.append(" fragment = ");
        sbN.append(this.c);
        sbN.append('}');
        return sbN.toString();
    }
}
