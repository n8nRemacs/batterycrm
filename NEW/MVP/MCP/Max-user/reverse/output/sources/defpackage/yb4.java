package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public abstract class yb4 extends phd implements adf {
    public int X;
    public final SparseArray Y;
    public int Z;
    public final /* synthetic */ int d;
    public ArrayList o;
    public final c54 s0;
    public Cloneable t0;
    public wgh u0;

    public yb4(Widget widget) {
        this.d = 1;
        this.s0 = widget;
        this.t0 = new LongSparseArray();
        this.o = new ArrayList();
        this.X = Integer.MAX_VALUE;
        this.Y = new SparseArray();
        A(true);
    }

    public static ViewPager2 H(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public static ViewPager2 I(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public void C(cud cudVar, int i) throws SecurityException {
        Bundle bundle;
        ytd ytdVar;
        long jK = k(i);
        f82 f82Var = cudVar.E0;
        String strValueOf = String.valueOf(jK);
        c54 c54Var = this.s0;
        boolean z = false;
        ytd childRouter = c54Var.getChildRouter(f82Var, strValueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(cudVar.F0) && (ytdVar = cudVar.F0) != null) {
            c54Var.removeChildRouter(ytdVar);
        }
        cudVar.F0 = childRouter;
        cudVar.G0 = jK;
        if (!childRouter.n() && (bundle = (Bundle) ((ek8) this.t0).b(jK)) != null) {
            childRouter.O(bundle);
            ((ek8) this.t0).f(jK);
            this.o.remove(Long.valueOf(jK));
            z = true;
        }
        c54 c54VarB = k8j.b(childRouter);
        if ((c54VarB != null ? c54VarB.getTargetController() : null) != null) {
            ho7.q("Router adapter. Attach router, target exist | router restored:", getClass().getName(), z);
        }
        childRouter.J();
        E(childRouter, i);
        if (i != this.Z) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((bud) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.Y.put(i, childRouter);
        cudVar.H0 = true;
    }

    public void D(dud dudVar, int i) throws SecurityException {
        Bundle bundle;
        ytd ytdVar;
        long jK = k(i);
        Widget widget = (Widget) this.s0;
        ytd childRouter = widget.getChildRouter(dudVar.E0, String.valueOf(jK), true, false);
        childRouter.e = 1;
        if (!childRouter.equals(dudVar.F0) && (ytdVar = dudVar.F0) != null) {
            widget.removeChildRouter(ytdVar);
        }
        dudVar.F0 = childRouter;
        dudVar.H0 = jK;
        if (!childRouter.n() && (bundle = (Bundle) ((LongSparseArray) this.t0).get(jK)) != null) {
            childRouter.O(bundle);
            ((LongSparseArray) this.t0).remove(jK);
            this.o.remove(Long.valueOf(jK));
        }
        childRouter.J();
        E(childRouter, i);
        if (i != this.Z) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((bud) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.Y.put(i, childRouter);
        dudVar.I0 = true;
    }

    public abstract void E(ytd ytdVar, int i);

    public void F(cud cudVar) {
        if (cudVar.H0) {
            ytd ytdVar = cudVar.F0;
            if (ytdVar != null) {
                ytdVar.G();
                L(cudVar.G0, ytdVar);
                int iF = cudVar.f();
                SparseArray sparseArray = this.Y;
                if (fni.a(sparseArray.get(iF), ytdVar)) {
                    sparseArray.remove(cudVar.f());
                }
            }
            cudVar.H0 = false;
        }
    }

    public void G(dud dudVar) {
        if (dudVar.I0) {
            ytd ytdVar = dudVar.F0;
            if (ytdVar != null) {
                ytdVar.G();
                K(dudVar.H0, ytdVar);
                int i = dudVar.G0;
                SparseArray sparseArray = this.Y;
                if (fni.a(sparseArray.get(i), ytdVar)) {
                    sparseArray.remove(dudVar.G0);
                }
            }
            dudVar.I0 = false;
        }
    }

    /* renamed from: J */
    public void y(dud dudVar) {
        G(dudVar);
        ytd ytdVar = dudVar.F0;
        if (ytdVar != null) {
            ((Widget) this.s0).removeChildRouter(ytdVar);
            dudVar.F0 = null;
        }
    }

    public void K(long j, ytd ytdVar) {
        Bundle bundle = new Bundle();
        ytdVar.P(bundle);
        ((LongSparseArray) this.t0).put(j, bundle);
        this.o.remove(Long.valueOf(j));
        this.o.add(Long.valueOf(j));
        while (((LongSparseArray) this.t0).size() > this.X) {
            ((LongSparseArray) this.t0).remove(((Number) this.o.remove(0)).longValue());
        }
    }

    public void L(long j, ytd ytdVar) {
        Bundle bundle = new Bundle();
        ytdVar.P(bundle);
        ((ek8) this.t0).e(j, bundle);
        this.o.remove(Long.valueOf(j));
        this.o.add(Long.valueOf(j));
        while (((ek8) this.t0).g() > this.X) {
            ((ek8) this.t0).f(((Number) this.o.remove(0)).longValue());
        }
    }

    @Override // defpackage.adf
    public final Parcelable a() {
        switch (this.d) {
            case 0:
                SparseArray sparseArray = this.Y;
                to7 to7VarH = n7j.h(0, sparseArray.size());
                ArrayList arrayList = new ArrayList(we3.q(to7VarH, 10));
                Iterator it = to7VarH.iterator();
                while (((so7) it).c) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(((so7) it).nextInt())));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                while (!arrayList2.isEmpty()) {
                    int iIntValue = ((Number) arrayList2.remove(ve3.i(arrayList2))).intValue();
                    L(k(iIntValue), (ytd) sparseArray.get(iIntValue));
                    if (!arrayList2.isEmpty()) {
                        int iIntValue2 = ((Number) arrayList2.remove(0)).intValue();
                        L(k(iIntValue2), (ytd) sparseArray.get(iIntValue2));
                    }
                }
                to7 to7VarH2 = n7j.h(0, ((ek8) this.t0).g());
                ArrayList arrayList3 = new ArrayList(we3.q(to7VarH2, 10));
                Iterator it2 = to7VarH2.iterator();
                while (((so7) it2).c) {
                    arrayList3.add(Long.valueOf(((ek8) this.t0).d(((so7) it2).nextInt())));
                }
                to7 to7VarH3 = n7j.h(0, ((ek8) this.t0).g());
                ArrayList arrayList4 = new ArrayList(we3.q(to7VarH3, 10));
                Iterator it3 = to7VarH3.iterator();
                while (((so7) it3).c) {
                    arrayList4.add((Bundle) ((ek8) this.t0).h(((so7) it3).nextInt()));
                }
                return new xb4(arrayList3, arrayList4, this.o, this.X);
            default:
                SparseArray sparseArray2 = this.Y;
                to7 to7VarH4 = n7j.h(0, sparseArray2.size());
                ArrayList arrayList5 = new ArrayList(we3.q(to7VarH4, 10));
                Iterator it4 = to7VarH4.iterator();
                while (((so7) it4).c) {
                    arrayList5.add(Integer.valueOf(sparseArray2.keyAt(((so7) it4).nextInt())));
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                while (!arrayList6.isEmpty()) {
                    int iIntValue3 = ((Number) arrayList6.remove(ve3.i(arrayList6))).intValue();
                    K(k(iIntValue3), (ytd) sparseArray2.get(iIntValue3));
                    if (!arrayList6.isEmpty()) {
                        int iIntValue4 = ((Number) arrayList6.remove(0)).intValue();
                        K(k(iIntValue4), (ytd) sparseArray2.get(iIntValue4));
                    }
                }
                to7 to7VarH5 = n7j.h(0, ((LongSparseArray) this.t0).size());
                ArrayList arrayList7 = new ArrayList(we3.q(to7VarH5, 10));
                Iterator it5 = to7VarH5.iterator();
                while (((so7) it5).c) {
                    arrayList7.add(Long.valueOf(((LongSparseArray) this.t0).keyAt(((so7) it5).nextInt())));
                }
                to7 to7VarH6 = n7j.h(0, ((LongSparseArray) this.t0).size());
                ArrayList arrayList8 = new ArrayList(we3.q(to7VarH6, 10));
                Iterator it6 = to7VarH6.iterator();
                while (((so7) it6).c) {
                    arrayList8.add((Bundle) ((LongSparseArray) this.t0).valueAt(((so7) it6).nextInt()));
                }
                return new aud(arrayList7, arrayList8, this.o, this.X);
        }
    }

    @Override // defpackage.adf
    public final void c(Parcelable parcelable) {
        switch (this.d) {
            case 0:
                if (parcelable instanceof xb4) {
                    this.t0 = new ek8((Object) null);
                    xb4 xb4Var = (xb4) parcelable;
                    ArrayList arrayList = xb4Var.a;
                    Iterator it = ve3.h(arrayList).iterator();
                    while (((so7) it).c) {
                        int iNextInt = ((so7) it).nextInt();
                        ((ek8) this.t0).e(((Number) arrayList.get(iNextInt)).longValue(), xb4Var.b.get(iNextInt));
                    }
                    this.o = new ArrayList(xb4Var.c);
                    this.X = xb4Var.d;
                    break;
                }
                break;
            default:
                if (parcelable instanceof aud) {
                    this.t0 = new LongSparseArray();
                    aud audVar = (aud) parcelable;
                    ArrayList arrayList2 = audVar.a;
                    Iterator it2 = ve3.h(arrayList2).iterator();
                    while (((so7) it2).c) {
                        int iNextInt2 = ((so7) it2).nextInt();
                        ((LongSparseArray) this.t0).put(((Number) arrayList2.get(iNextInt2)).longValue(), audVar.b.get(iNextInt2));
                    }
                    this.o = new ArrayList(audVar.c);
                    this.X = audVar.d;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.phd
    public long k(int i) {
        return i;
    }

    @Override // defpackage.phd
    public final void q(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                ViewPager2 viewPager2I = I(recyclerView);
                ki0 ki0Var = new ki0(6, this);
                viewPager2I.b(ki0Var);
                this.u0 = ki0Var;
                break;
            default:
                ViewPager2 viewPager2H = H(recyclerView);
                ki0 ki0Var2 = new ki0(10, this);
                viewPager2H.b(ki0Var2);
                this.u0 = ki0Var2;
                break;
        }
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) throws SecurityException {
        switch (this.d) {
            case 0:
                C((cud) midVar, i);
                break;
            default:
                dud dudVar = (dud) midVar;
                dudVar.G0 = i;
                D(dudVar, i);
                break;
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                int i2 = cud.I0;
                f82 f82Var = new f82(viewGroup.getContext());
                WeakHashMap weakHashMap = hfh.a;
                f82Var.setId(View.generateViewId());
                f82Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                f82Var.setSaveEnabled(false);
                return new cud(f82Var);
            default:
                int i3 = dud.J0;
                f82 f82Var2 = new f82(viewGroup.getContext());
                WeakHashMap weakHashMap2 = hfh.a;
                f82Var2.setId(View.generateViewId());
                f82Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                f82Var2.setSaveEnabled(false);
                return new dud(f82Var2);
        }
    }

    @Override // defpackage.phd
    public final void u(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                ViewPager2 viewPager2I = I(recyclerView);
                ki0 ki0Var = (ki0) this.u0;
                if (ki0Var != null) {
                    viewPager2I.g(ki0Var);
                }
                this.u0 = null;
                break;
            default:
                ViewPager2 viewPager2H = H(recyclerView);
                ki0 ki0Var2 = (ki0) this.u0;
                if (ki0Var2 != null) {
                    viewPager2H.g(ki0Var2);
                }
                this.u0 = null;
                break;
        }
    }

    @Override // defpackage.phd
    public final /* bridge */ /* synthetic */ boolean v(mid midVar) {
        switch (this.d) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.phd
    public final void w(mid midVar) throws SecurityException {
        switch (this.d) {
            case 0:
                cud cudVar = (cud) midVar;
                if (!cudVar.H0) {
                    C(cudVar, cudVar.f());
                    break;
                }
                break;
            default:
                dud dudVar = (dud) midVar;
                if (!dudVar.I0) {
                    D(dudVar, dudVar.G0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.phd
    public final void x(mid midVar) {
        switch (this.d) {
            case 0:
                cud cudVar = (cud) midVar;
                F(cudVar);
                cudVar.E0.removeAllViews();
                break;
            default:
                dud dudVar = (dud) midVar;
                G(dudVar);
                dudVar.E0.removeAllViews();
                break;
        }
    }

    @Override // defpackage.phd
    public void y(mid midVar) {
        switch (this.d) {
            case 0:
                cud cudVar = (cud) midVar;
                F(cudVar);
                ytd ytdVar = cudVar.F0;
                if (ytdVar != null) {
                    this.s0.removeChildRouter(ytdVar);
                    cudVar.F0 = null;
                    break;
                }
                break;
            default:
                y((dud) midVar);
                break;
        }
    }

    public yb4(c54 c54Var) {
        this.d = 0;
        this.s0 = c54Var;
        this.t0 = new ek8((Object) null);
        this.o = new ArrayList();
        this.X = Integer.MAX_VALUE;
        this.Y = new SparseArray();
        A(true);
    }
}
