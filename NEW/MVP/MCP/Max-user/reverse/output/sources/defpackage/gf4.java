package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public class gf4 extends zhd {
    public RecyclerView a;
    public Scroller b;
    public final b6f c = new b6f(this);
    public final /* synthetic */ int d;
    public jjb e;
    public jjb f;

    public gf4(int i) {
        this.d = i;
    }

    public static int c(View view, aw7 aw7Var) {
        return ((aw7Var.d(view) / 2) + aw7Var.f(view)) - ((aw7Var.n() / 2) + aw7Var.m());
    }

    public static View e(a aVar, aw7 aw7Var) {
        int iX = aVar.x();
        View view = null;
        if (iX == 0) {
            return null;
        }
        int iN = (aw7Var.n() / 2) + aw7Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iX; i2++) {
            View viewW = aVar.w(i2);
            int iAbs = Math.abs(((aw7Var.d(viewW) / 2) + aw7Var.f(viewW)) - iN);
            if (iAbs < i) {
                view = viewW;
                i = iAbs;
            }
        }
        return view;
    }

    public static View f(a aVar, aw7 aw7Var) {
        int iX = aVar.x();
        View view = null;
        if (iX == 0) {
            return null;
        }
        int iN = (aw7Var.n() / 2) + aw7Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iX; i2++) {
            View viewW = aVar.w(i2);
            int iAbs = Math.abs(((aw7Var.d(viewW) / 2) + aw7Var.f(viewW)) - iN);
            if (iAbs < i) {
                view = viewW;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b6f b6fVar = this.c;
        if (recyclerView2 != null) {
            recyclerView2.s0(b6fVar);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.m(b6fVar);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    public final int[] b(a aVar, View view) {
        switch (this.d) {
            case 0:
                int[] iArr = new int[2];
                if (aVar.f()) {
                    aw7 aw7VarH = h(aVar);
                    iArr[0] = ((aw7VarH.d(view) / 2) + aw7VarH.f(view)) - ((aw7VarH.n() / 2) + aw7VarH.m());
                } else {
                    iArr[0] = 0;
                }
                if (aVar.g()) {
                    aw7 aw7VarJ = j(aVar);
                    iArr[1] = ((aw7VarJ.d(view) / 2) + aw7VarJ.f(view)) - ((aw7VarJ.n() / 2) + aw7VarJ.m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (aVar.f()) {
                    iArr2[0] = c(view, i(aVar));
                } else {
                    iArr2[0] = 0;
                }
                if (aVar.g()) {
                    iArr2[1] = c(view, k(aVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public int d(a aVar, aw7 aw7Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iX = aVar.x();
        float f = 1.0f;
        if (iX != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iX; i5++) {
                View viewW = aVar.w(i5);
                int iN = a.N(viewW);
                if (iN != -1) {
                    if (iN < i4) {
                        view = viewW;
                        i4 = iN;
                    }
                    if (iN > i3) {
                        view2 = viewW;
                        i3 = iN;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(aw7Var.c(view), aw7Var.c(view2)) - Math.min(aw7Var.f(view), aw7Var.f(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View g(androidx.recyclerview.widget.a r3) {
        /*
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.g()
            if (r0 == 0) goto L14
            aw7 r0 = r2.k(r3)
            android.view.View r3 = f(r3, r0)
            goto L24
        L14:
            boolean r0 = r3.f()
            if (r0 == 0) goto L23
            aw7 r0 = r2.i(r3)
            android.view.View r3 = f(r3, r0)
            goto L24
        L23:
            r3 = 0
        L24:
            return r3
        L25:
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L3e
            r0 = r3
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.U0()
            if (r1 == 0) goto L5c
            int r1 = r0.Y0()
            int r0 = r0.H()
            int r0 = r0 + (-1)
            if (r1 == r0) goto L5c
        L3e:
            boolean r0 = r3.g()
            if (r0 == 0) goto L4d
            aw7 r0 = r2.j(r3)
            android.view.View r3 = e(r3, r0)
            goto L5d
        L4d:
            boolean r0 = r3.f()
            if (r0 == 0) goto L5c
            aw7 r0 = r2.h(r3)
            android.view.View r3 = e(r3, r0)
            goto L5d
        L5c:
            r3 = 0
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf4.g(androidx.recyclerview.widget.a):android.view.View");
    }

    public aw7 h(a aVar) {
        jjb jjbVar = this.f;
        if (jjbVar == null || ((a) jjbVar.b) != aVar) {
            this.f = new jjb(aVar, 0);
        }
        return this.f;
    }

    public aw7 i(a aVar) {
        jjb jjbVar = this.f;
        if (jjbVar == null || ((a) jjbVar.b) != aVar) {
            this.f = new jjb(aVar, 0);
        }
        return this.f;
    }

    public aw7 j(a aVar) {
        jjb jjbVar = this.e;
        if (jjbVar == null || ((a) jjbVar.b) != aVar) {
            this.e = new jjb(aVar, 1);
        }
        return this.e;
    }

    public aw7 k(a aVar) {
        jjb jjbVar = this.e;
        if (jjbVar == null || ((a) jjbVar.b) != aVar) {
            this.e = new jjb(aVar, 1);
        }
        return this.e;
    }

    public final void l() {
        a layoutManager;
        View viewG;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewG);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.A0(i, iArrB[1], false);
    }
}
