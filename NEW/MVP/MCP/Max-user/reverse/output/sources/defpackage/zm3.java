package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zm3 extends phd {
    public final an3 d;

    public zm3(phd... phdVarArr) {
        this(ym3.c, phdVarArr);
    }

    public final List C() {
        List list;
        ArrayList arrayList = this.d.d;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((lda) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final Pair D(int i) {
        an3 an3Var = this.d;
        c0 c0VarF = an3Var.f(i);
        Pair pair = new Pair(((lda) c0VarF.c).c, Integer.valueOf(c0VarF.a));
        c0VarF.b = false;
        c0VarF.c = null;
        c0VarF.a = -1;
        an3Var.h = c0VarF;
        return pair;
    }

    public final void E(phd phdVar) {
        an3 an3Var = this.d;
        ArrayList arrayList = an3Var.d;
        int i = an3Var.i(phdVar);
        if (i == -1) {
            return;
        }
        lda ldaVar = (lda) arrayList.get(i);
        int iD = an3Var.d(ldaVar);
        arrayList.remove(i);
        zm3 zm3Var = (zm3) an3Var.e;
        zm3Var.a.f(iD, ldaVar.e);
        Iterator it = an3Var.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                phdVar.u(recyclerView);
            }
        }
        ldaVar.c.B(ldaVar.f);
        ldaVar.a.dispose();
        an3Var.c();
    }

    @Override // defpackage.phd
    public final int i(phd phdVar, mid midVar, int i) {
        an3 an3Var = this.d;
        lda ldaVar = (lda) ((IdentityHashMap) an3Var.g).get(midVar);
        if (ldaVar == null) {
            return -1;
        }
        phd phdVar2 = ldaVar.c;
        int iD = i - an3Var.d(ldaVar);
        int iJ = phdVar2.j();
        if (iD >= 0 && iD < iJ) {
            return phdVar2.i(phdVar, midVar, iD);
        }
        StringBuilder sbK = wy1.k("Detected inconsistent adapter updates. The local position of the view holder maps to ", iD, " which is out of bounds for the adapter with size ", iJ, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbK.append(midVar);
        sbK.append("adapter:");
        sbK.append(phdVar);
        throw new IllegalStateException(sbK.toString());
    }

    @Override // defpackage.phd
    public final int j() {
        Iterator it = this.d.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((lda) it.next()).e;
        }
        return i;
    }

    @Override // defpackage.phd
    public final long k(int i) {
        an3 an3Var = this.d;
        c0 c0VarF = an3Var.f(i);
        lda ldaVar = (lda) c0VarF.c;
        long jQ = ldaVar.b.q(ldaVar.c.k(c0VarF.a));
        c0VarF.b = false;
        c0VarF.c = null;
        c0VarF.a = -1;
        an3Var.h = c0VarF;
        return jQ;
    }

    @Override // defpackage.phd
    public final int l(int i) {
        an3 an3Var = this.d;
        c0 c0VarF = an3Var.f(i);
        lda ldaVar = (lda) c0VarF.c;
        int iK = ldaVar.a.k(ldaVar.c.l(c0VarF.a));
        c0VarF.b = false;
        c0VarF.c = null;
        c0VarF.a = -1;
        an3Var.h = c0VarF;
        return iK;
    }

    @Override // defpackage.phd
    public final void q(RecyclerView recyclerView) {
        an3 an3Var = this.d;
        ArrayList arrayList = an3Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = an3Var.d.iterator();
        while (it2.hasNext()) {
            ((lda) it2.next()).c.q(recyclerView);
        }
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        an3 an3Var = this.d;
        c0 c0VarF = an3Var.f(i);
        ((IdentityHashMap) an3Var.g).put(midVar, (lda) c0VarF.c);
        lda ldaVar = (lda) c0VarF.c;
        ldaVar.c.h(midVar, c0VarF.a);
        c0VarF.b = false;
        c0VarF.c = null;
        c0VarF.a = -1;
        an3Var.h = c0VarF;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        lda ldaVarC = ((ohh) this.d.f).c(i);
        return ldaVarC.c.t(viewGroup, ldaVarC.a.i(i));
    }

    @Override // defpackage.phd
    public final void u(RecyclerView recyclerView) {
        an3 an3Var = this.d;
        ArrayList arrayList = an3Var.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = an3Var.d.iterator();
        while (it.hasNext()) {
            ((lda) it.next()).c.u(recyclerView);
        }
    }

    @Override // defpackage.phd
    public final boolean v(mid midVar) {
        an3 an3Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) an3Var.g;
        lda ldaVar = (lda) identityHashMap.get(midVar);
        if (ldaVar != null) {
            boolean zV = ldaVar.c.v(midVar);
            identityHashMap.remove(midVar);
            return zV;
        }
        throw new IllegalStateException("Cannot find wrapper for " + midVar + ", seems like it is not bound by this adapter: " + an3Var);
    }

    @Override // defpackage.phd
    public final void w(mid midVar) {
        this.d.g(midVar).c.w(midVar);
    }

    @Override // defpackage.phd
    public final void x(mid midVar) {
        this.d.g(midVar).c.x(midVar);
    }

    @Override // defpackage.phd
    public final void y(mid midVar) {
        an3 an3Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) an3Var.g;
        lda ldaVar = (lda) identityHashMap.get(midVar);
        if (ldaVar != null) {
            ldaVar.c.y(midVar);
            identityHashMap.remove(midVar);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + midVar + ", seems like it is not bound by this adapter: " + an3Var);
        }
    }

    public zm3(ym3 ym3Var, phd... phdVarArr) {
        List<phd> listAsList = Arrays.asList(phdVarArr);
        this.d = new an3(this, ym3Var);
        for (phd phdVar : listAsList) {
            an3 an3Var = this.d;
            an3Var.a(an3Var.d.size(), phdVar);
        }
        A(this.d.b != 1);
    }
}
