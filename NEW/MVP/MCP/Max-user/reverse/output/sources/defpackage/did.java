package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class did {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public b g;
    public final /* synthetic */ RecyclerView h;

    public did(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(mid midVar, boolean z) {
        RecyclerView.o(midVar);
        View view = midVar.a;
        RecyclerView recyclerView = this.h;
        oid oidVar = recyclerView.y1;
        if (oidVar != null) {
            nid nidVar = oidVar.e;
            hfh.n(view, nidVar != null ? (z4) nidVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.B0;
            if (arrayList.size() > 0) {
                throw xrf.n(arrayList, 0);
            }
            phd phdVar = recyclerView.z0;
            if (phdVar != null) {
                phdVar.y(midVar);
            }
            if (recyclerView.r1 != null) {
                recyclerView.t0.y(midVar);
            }
            if (RecyclerView.L1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + midVar);
            }
        }
        midVar.C0 = null;
        midVar.B0 = null;
        c().putRecycledView(midVar);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.r1.b()) {
            return !recyclerView.r1.h ? i : recyclerView.o.p(i, 0);
        }
        StringBuilder sbM = ho7.m(i, "invalid position ", ". State item count is ");
        sbM.append(recyclerView.r1.b());
        sbM.append(recyclerView.F());
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final b c() {
        if (this.g == null) {
            this.g = new b();
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return k(i, BuildConfig.MAX_TIME_TO_UPLOAD).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        phd phdVar;
        b bVar = this.g;
        if (bVar == null || (phdVar = (recyclerView = this.h).z0) == null || !recyclerView.F0) {
            return;
        }
        bVar.attachForPoolingContainer(phdVar);
    }

    public final void f() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            g(size);
        }
        this.c.clear();
        if (RecyclerView.Q1) {
            w93 w93Var = this.h.q1;
            int[] iArr = w93Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            w93Var.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.L1) {
            u45.o(i, "Recycling cached view at index ", "RecyclerView");
        }
        mid midVar = (mid) this.c.get(i);
        if (RecyclerView.L1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + midVar);
        }
        a(midVar, true);
        this.c.remove(i);
    }

    public final void h(View view) {
        mid midVarU = RecyclerView.U(view);
        boolean zS = midVarU.s();
        RecyclerView recyclerView = this.h;
        if (zS) {
            recyclerView.removeDetachedView(view, false);
        }
        if (midVarU.r()) {
            midVarU.x0.l(midVarU);
        } else if (midVarU.y()) {
            midVarU.t0 &= -33;
        }
        i(midVarU);
        if (recyclerView.Z0 == null || midVarU.p()) {
            return;
        }
        recyclerView.Z0.d(midVarU);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e4, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.mid r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.did.i(mid):void");
    }

    public final void j(View view) {
        uhd uhdVar;
        mid midVarU = RecyclerView.U(view);
        int i = midVarU.t0 & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && midVarU.t() && (uhdVar = recyclerView.Z0) != null) {
            un4 un4Var = (un4) uhdVar;
            if (midVarU.i().isEmpty() && un4Var.g && !midVarU.o()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                midVarU.x0 = this;
                midVarU.y0 = true;
                this.b.add(midVarU);
                return;
            }
        }
        if (midVarU.o() && !midVarU.q() && !recyclerView.z0.b) {
            throw new IllegalArgumentException(wy1.f(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        midVarU.x0 = this;
        midVarU.y0 = false;
        this.a.add(midVarU);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0531 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mid k(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.did.k(int, long):mid");
    }

    public final void l(mid midVar) {
        if (midVar.y0) {
            this.b.remove(midVar);
        } else {
            this.a.remove(midVar);
        }
        midVar.x0 = null;
        midVar.y0 = false;
        midVar.t0 &= -33;
    }

    public final void m() {
        a aVar = this.h.A0;
        this.f = this.e + (aVar != null ? aVar.j : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
            g(size);
        }
    }
}
