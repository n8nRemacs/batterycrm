package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import defpackage.az1;
import defpackage.c0d;
import defpackage.cj6;
import defpackage.ei6;
import defpackage.hf;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.k38;
import defpackage.l38;
import defpackage.l48;
import defpackage.li6;
import defpackage.nhd;
import defpackage.py0;
import defpackage.teh;
import defpackage.ti6;
import defpackage.tp4;
import defpackage.u45;
import defpackage.v7f;
import defpackage.vi6;
import defpackage.w7f;
import defpackage.xi6;
import defpackage.xu1;
import defpackage.yi6;
import defpackage.zfi;
import defpackage.zh6;
import defpackage.zi6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {
    public final py0 a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(py0 py0Var, f fVar, a aVar) {
        this.a = py0Var;
        this.b = fVar;
        this.c = aVar;
    }

    public final void a() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        aVar.F0.R();
        aVar.a = 3;
        aVar.Q0 = false;
        aVar.I(bundle2);
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onActivityCreated()"));
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + aVar);
        }
        if (aVar.S0 != null) {
            Bundle bundle3 = aVar.b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = aVar.c;
            if (sparseArray != null) {
                aVar.S0.restoreHierarchyState(sparseArray);
                aVar.c = null;
            }
            aVar.Q0 = false;
            aVar.f0(bundle4);
            if (!aVar.Q0) {
                throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onViewStateRestored()"));
            }
            if (aVar.S0 != null) {
                aVar.b1.a(k38.ON_CREATE);
            }
        }
        aVar.b = null;
        ti6 ti6Var = aVar.F0;
        ti6Var.H = false;
        ti6Var.I = false;
        ti6Var.O.g = false;
        ti6Var.u(4);
        this.a.i(aVar, false);
    }

    public final void b() {
        a aVar;
        View view;
        View view2;
        a aVar2 = this.c;
        View view3 = aVar2.R0;
        while (true) {
            aVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(c0d.fragment_container_view_tag);
            a aVar3 = tag instanceof a ? (a) tag : null;
            if (aVar3 != null) {
                aVar = aVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        a aVar4 = aVar2.G0;
        if (aVar != null && !aVar.equals(aVar4)) {
            int i = aVar2.I0;
            yi6 yi6Var = zi6.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(aVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(aVar);
            sb.append(" via container with ID ");
            zi6.b(new WrongNestedHierarchyViolation(aVar2, ho7.j(sb, i, " without using parent's childFragmentManager")));
            zi6.a(aVar2).getClass();
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = aVar2.R0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(aVar2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar5 = (a) arrayList.get(iIndexOf);
                        if (aVar5.R0 == viewGroup && (view = aVar5.S0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar6 = (a) arrayList.get(i2);
                    if (aVar6.R0 == viewGroup && (view2 = aVar6.S0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        aVar2.R0.addView(aVar2.S0, iIndexOfChild);
    }

    public final void c() {
        e eVar;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + aVar);
        }
        a aVar2 = aVar.Y;
        f fVar = this.b;
        if (aVar2 != null) {
            eVar = (e) fVar.b.get(aVar2.o);
            if (eVar == null) {
                throw new IllegalStateException("Fragment " + aVar + " declared target fragment " + aVar.Y + " that does not belong to this FragmentManager!");
            }
            aVar.Z = aVar.Y.o;
            aVar.Y = null;
        } else {
            String str = aVar.Z;
            if (str != null) {
                eVar = (e) fVar.b.get(str);
                if (eVar == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(aVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(ho7.l(sb, aVar.Z, " that does not belong to this FragmentManager!"));
                }
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        c cVar = aVar.D0;
        aVar.E0 = cVar.w;
        aVar.G0 = cVar.y;
        py0 py0Var = this.a;
        py0Var.p(aVar, false);
        ArrayList arrayList = aVar.f1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar3 = ((zh6) it.next()).a;
            aVar3.e1.q();
            zfi.e(aVar3);
            Bundle bundle = aVar3.b;
            aVar3.e1.r(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        aVar.F0.b(aVar.E0, aVar.r(), aVar);
        aVar.a = 0;
        aVar.Q0 = false;
        aVar.L(aVar.E0.d);
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = aVar.D0.p.iterator();
        while (it2.hasNext()) {
            ((vi6) it2.next()).a(aVar);
        }
        ti6 ti6Var = aVar.F0;
        ti6Var.H = false;
        ti6Var.I = false;
        ti6Var.O.g = false;
        ti6Var.u(0);
        py0Var.j(aVar, false);
    }

    public final int d() {
        tp4 tp4Var;
        a aVar = this.c;
        if (aVar.D0 == null) {
            return aVar.a;
        }
        int iMin = this.e;
        int iOrdinal = aVar.Z0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (aVar.x0) {
            if (aVar.y0) {
                iMin = Math.max(this.e, 2);
                View view = aVar.S0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, aVar.a) : Math.min(iMin, 1);
            }
        }
        if (aVar.z0 && aVar.R0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!aVar.u0) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup != null) {
            aVar.x().I();
            Object tag = viewGroup.getTag(c0d.special_effects_controller_view_tag);
            if (tag instanceof tp4) {
                tp4Var = (tp4) tag;
            } else {
                tp4Var = new tp4(viewGroup);
                viewGroup.setTag(c0d.special_effects_controller_view_tag, tp4Var);
            }
            tp4Var.getClass();
            v7f v7fVarF = tp4Var.f(aVar);
            int i = v7fVarF != null ? v7fVarF.b : 0;
            v7f v7fVarG = tp4Var.g(aVar);
            i = v7fVarG != null ? v7fVarG.b : 0;
            int i2 = i == 0 ? -1 : w7f.$EnumSwitchMapping$0[az1.v(i)];
            if (i2 != -1 && i2 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (aVar.v0) {
            iMin = aVar.H() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (aVar.T0 && aVar.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (aVar.w0) {
            iMin = Math.max(iMin, 3);
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + aVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + aVar);
        }
        Bundle bundle2 = aVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (aVar.X0) {
            aVar.a = 1;
            Bundle bundle4 = aVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            aVar.F0.X(bundle);
            ti6 ti6Var = aVar.F0;
            ti6Var.H = false;
            ti6Var.I = false;
            ti6Var.O.g = false;
            ti6Var.u(1);
            return;
        }
        py0 py0Var = this.a;
        py0Var.q(aVar, false);
        aVar.F0.R();
        aVar.a = 1;
        aVar.Q0 = false;
        aVar.a1.a(new nhd(4, aVar));
        aVar.M(bundle3);
        aVar.X0 = true;
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onCreate()"));
        }
        aVar.a1.d(k38.ON_CREATE);
        py0Var.k(aVar, false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        a aVar = this.c;
        if (aVar.x0) {
            return;
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterS = aVar.S(bundle2);
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup == null) {
            int i = aVar.I0;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(u45.j("Cannot create fragment ", aVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) aVar.D0.x.d(i);
                if (viewGroup == null) {
                    if (!aVar.A0 && !aVar.z0) {
                        try {
                            resourceName = aVar.k0().getResources().getResourceName(aVar.I0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.I0) + " (" + resourceName + ") for fragment " + aVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    yi6 yi6Var = zi6.a;
                    zi6.b(new WrongFragmentContainerViolation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    zi6.a(aVar).getClass();
                }
            }
        }
        aVar.R0 = viewGroup;
        aVar.g0(layoutInflaterS, viewGroup, bundle2);
        if (aVar.S0 != null) {
            if (c.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + aVar);
            }
            aVar.S0.setSaveFromParentEnabled(false);
            aVar.S0.setTag(c0d.fragment_container_view_tag, aVar);
            if (viewGroup != null) {
                b();
            }
            if (aVar.K0) {
                aVar.S0.setVisibility(8);
            }
            if (aVar.S0.isAttachedToWindow()) {
                View view = aVar.S0;
                WeakHashMap weakHashMap = hfh.a;
                teh.c(view);
            } else {
                View view2 = aVar.S0;
                view2.addOnAttachStateChangeListener(new hf(view2, 1));
            }
            Bundle bundle3 = aVar.b;
            aVar.e0(aVar.S0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            aVar.F0.u(2);
            this.a.v(aVar, aVar.S0, false);
            int visibility = aVar.S0.getVisibility();
            aVar.s().j = aVar.S0.getAlpha();
            if (aVar.R0 != null && visibility == 0) {
                View viewFindFocus = aVar.S0.findFocus();
                if (viewFindFocus != null) {
                    aVar.s().k = viewFindFocus;
                    if (c.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + aVar);
                    }
                }
                aVar.S0.setAlpha(0.0f);
            }
        }
        aVar.a = 2;
    }

    public final void g() {
        a aVarB;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + aVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = aVar.v0 && !aVar.H();
        f fVar = this.b;
        if (z) {
            fVar.i(aVar.o, null);
        }
        if (!z) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.o) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                String str = aVar.Z;
                if (str != null && (aVarB = fVar.b(str)) != null && aVarB.M0) {
                    aVar.Y = aVarB;
                }
                aVar.a = 0;
                return;
            }
        }
        ei6 ei6Var = aVar.E0;
        if (ei6Var != null) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            b bVar = ei6Var.d;
            if (bVar != null) {
                zIsChangingConfigurations = true ^ bVar.isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            fVar.d.f(aVar, false);
        }
        aVar.F0.l();
        aVar.a1.d(k38.ON_DESTROY);
        aVar.a = 0;
        aVar.Q0 = false;
        aVar.X0 = false;
        aVar.P();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onDestroy()"));
        }
        this.a.l(aVar, false);
        Iterator it = fVar.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar.o.equals(aVar2.Z)) {
                    aVar2.Y = aVar;
                    aVar2.Z = null;
                }
            }
        }
        String str2 = aVar.Z;
        if (str2 != null) {
            aVar.Y = fVar.b(str2);
        }
        fVar.h(this);
    }

    public final void h() {
        View view;
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + aVar);
        }
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup != null && (view = aVar.S0) != null) {
            viewGroup.removeView(view);
        }
        aVar.F0.u(1);
        if (aVar.S0 != null) {
            cj6 cj6Var = aVar.b1;
            cj6Var.b();
            if (cj6Var.o.d.a(l38.c)) {
                aVar.b1.a(k38.ON_DESTROY);
            }
        }
        aVar.a = 1;
        aVar.Q0 = false;
        aVar.Q();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onDestroyView()"));
        }
        new androidx.loader.app.b(aVar, aVar.h()).c();
        aVar.B0 = false;
        this.a.w(aVar, false);
        aVar.R0 = null;
        aVar.S0 = null;
        aVar.b1 = null;
        aVar.c1.k(null);
        aVar.y0 = false;
    }

    public final void i() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + aVar);
        }
        aVar.a = -1;
        aVar.Q0 = false;
        aVar.R();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onDetach()"));
        }
        ti6 ti6Var = aVar.F0;
        if (!ti6Var.J) {
            ti6Var.l();
            aVar.F0 = new ti6();
        }
        this.a.n(aVar, false);
        aVar.a = -1;
        aVar.E0 = null;
        aVar.G0 = null;
        aVar.D0 = null;
        if (!aVar.v0 || aVar.H()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.o) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                return;
            }
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + aVar);
        }
        aVar.E();
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.x0 && aVar.y0 && !aVar.B0) {
            if (c.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            aVar.g0(aVar.S(bundle2), null, bundle2);
            View view = aVar.S0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.S0.setTag(c0d.fragment_container_view_tag, aVar);
                if (aVar.K0) {
                    aVar.S0.setVisibility(8);
                }
                Bundle bundle3 = aVar.b;
                aVar.e0(aVar.S0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                aVar.F0.u(2);
                this.a.v(aVar, aVar.S0, false);
                aVar.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        tp4 tp4Var;
        ViewGroup viewGroup2;
        tp4 tp4Var2;
        ViewGroup viewGroup3;
        tp4 tp4Var3;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (z) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + aVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = aVar.a;
                int i2 = 3;
                if (iD == i) {
                    if (!z2 && i == -1 && aVar.v0 && !aVar.H()) {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + aVar);
                        }
                        fVar.d.f(aVar, true);
                        fVar.h(this);
                        if (c.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + aVar);
                        }
                        aVar.E();
                    }
                    if (aVar.W0) {
                        if (aVar.S0 != null && (viewGroup = aVar.R0) != null) {
                            aVar.x().I();
                            Object tag = viewGroup.getTag(c0d.special_effects_controller_view_tag);
                            if (tag instanceof tp4) {
                                tp4Var = (tp4) tag;
                            } else {
                                tp4Var = new tp4(viewGroup);
                                viewGroup.setTag(c0d.special_effects_controller_view_tag, tp4Var);
                            }
                            if (aVar.K0) {
                                tp4Var.getClass();
                                if (c.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + aVar);
                                }
                                tp4Var.d(3, 1, this);
                            } else {
                                tp4Var.getClass();
                                if (c.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + aVar);
                                }
                                tp4Var.d(2, 1, this);
                            }
                        }
                        c cVar = aVar.D0;
                        if (cVar != null && aVar.u0 && c.L(aVar)) {
                            cVar.G = true;
                        }
                        aVar.W0 = false;
                        aVar.T(aVar.K0);
                        aVar.F0.o();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            aVar.a = 1;
                            break;
                        case 2:
                            aVar.y0 = false;
                            aVar.a = 2;
                            break;
                        case 3:
                            if (c.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + aVar);
                            }
                            if (aVar.S0 != null && aVar.c == null) {
                                p();
                            }
                            if (aVar.S0 != null && (viewGroup2 = aVar.R0) != null) {
                                aVar.x().I();
                                Object tag2 = viewGroup2.getTag(c0d.special_effects_controller_view_tag);
                                if (tag2 instanceof tp4) {
                                    tp4Var2 = (tp4) tag2;
                                } else {
                                    tp4Var2 = new tp4(viewGroup2);
                                    viewGroup2.setTag(c0d.special_effects_controller_view_tag, tp4Var2);
                                }
                                tp4Var2.getClass();
                                if (c.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + aVar);
                                }
                                tp4Var2.d(1, 3, this);
                            }
                            aVar.a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            aVar.a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (aVar.S0 != null && (viewGroup3 = aVar.R0) != null) {
                                aVar.x().I();
                                Object tag3 = viewGroup3.getTag(c0d.special_effects_controller_view_tag);
                                if (tag3 instanceof tp4) {
                                    tp4Var3 = (tp4) tag3;
                                } else {
                                    tp4Var3 = new tp4(viewGroup3);
                                    viewGroup3.setTag(c0d.special_effects_controller_view_tag, tp4Var3);
                                }
                                int visibility = aVar.S0.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                tp4Var3.getClass();
                                if (c.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + aVar);
                                }
                                tp4Var3.d(i2, 2, this);
                            }
                            aVar.a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            aVar.a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom RESUMED: " + aVar);
        }
        aVar.F0.u(5);
        if (aVar.S0 != null) {
            aVar.b1.a(k38.ON_PAUSE);
        }
        aVar.a1.d(k38.ON_PAUSE);
        aVar.a = 6;
        aVar.Q0 = false;
        aVar.X();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onPause()"));
        }
        this.a.o(aVar, false);
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (aVar.b.getBundle("savedInstanceState") == null) {
            aVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            aVar.c = aVar.b.getSparseParcelableArray("viewState");
            aVar.d = aVar.b.getBundle("viewRegistryState");
            xi6 xi6Var = (xi6) aVar.b.getParcelable("state");
            if (xi6Var != null) {
                aVar.Z = xi6Var.w0;
                aVar.s0 = xi6Var.x0;
                aVar.U0 = xi6Var.y0;
            }
            if (aVar.U0) {
                return;
            }
            aVar.T0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.c.K(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.a r2 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            bi6 r0 = r2.V0
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.S0
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.S0
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.c.K(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.S0
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            bi6 r0 = r2.s()
            r0.k = r3
            ti6 r0 = r2.F0
            r0.R()
            ti6 r0 = r2.F0
            r1 = 1
            r0.z(r1)
            r0 = 7
            r2.a = r0
            r1 = 0
            r2.Q0 = r1
            r2.a0()
            boolean r4 = r2.Q0
            if (r4 == 0) goto Lcb
            l48 r4 = r2.a1
            k38 r5 = defpackage.k38.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r2.S0
            if (r4 == 0) goto Lab
            cj6 r4 = r2.b1
            r4.a(r5)
        Lab:
            ti6 r4 = r2.F0
            r4.H = r1
            r4.I = r1
            androidx.fragment.app.FragmentManagerViewModel r5 = r4.O
            r5.g = r1
            r4.u(r0)
            py0 r0 = r7.a
            r0.r(r2, r1)
            androidx.fragment.app.f r0 = r7.b
            java.lang.String r1 = r2.o
            r0.i(r1, r3)
            r2.b = r3
            r2.c = r3
            r2.d = r3
            return
        Lcb:
            xu1 r0 = new xu1
            java.lang.String r1 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = defpackage.u45.j(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        a aVar = this.c;
        if (aVar.a == -1 && (bundle = aVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new xi6(aVar));
        if (aVar.a > -1) {
            Bundle bundle3 = new Bundle();
            aVar.b0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.s(aVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            aVar.e1.s(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = aVar.F0.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (aVar.S0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = aVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aVar.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aVar.X;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        a aVar = this.c;
        if (aVar.S0 == null) {
            return;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + aVar + " with view " + aVar.S0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        aVar.S0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            aVar.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        aVar.b1.X.s(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        aVar.d = bundle;
    }

    public final void q() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto STARTED: " + aVar);
        }
        aVar.F0.R();
        aVar.F0.z(true);
        aVar.a = 5;
        aVar.Q0 = false;
        aVar.c0();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onStart()"));
        }
        l48 l48Var = aVar.a1;
        k38 k38Var = k38.ON_START;
        l48Var.d(k38Var);
        if (aVar.S0 != null) {
            aVar.b1.a(k38Var);
        }
        ti6 ti6Var = aVar.F0;
        ti6Var.H = false;
        ti6Var.I = false;
        ti6Var.O.g = false;
        ti6Var.u(5);
        this.a.t(aVar, false);
    }

    public final void r() {
        boolean zK = c.K(3);
        a aVar = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom STARTED: " + aVar);
        }
        ti6 ti6Var = aVar.F0;
        ti6Var.I = true;
        ti6Var.O.g = true;
        ti6Var.u(4);
        if (aVar.S0 != null) {
            aVar.b1.a(k38.ON_STOP);
        }
        aVar.a1.d(k38.ON_STOP);
        aVar.a = 4;
        aVar.Q0 = false;
        aVar.d0();
        if (!aVar.Q0) {
            throw new xu1(u45.j("Fragment ", aVar, " did not call through to super.onStop()"));
        }
        this.a.u(aVar, false);
    }

    public e(py0 py0Var, f fVar, ClassLoader classLoader, li6 li6Var, Bundle bundle) {
        this.a = py0Var;
        this.b = fVar;
        xi6 xi6Var = (xi6) bundle.getParcelable("state");
        a aVarA = li6Var.a(xi6Var.a);
        aVarA.o = xi6Var.b;
        aVarA.x0 = xi6Var.c;
        aVarA.z0 = xi6Var.d;
        aVarA.A0 = true;
        aVarA.H0 = xi6Var.o;
        aVarA.I0 = xi6Var.X;
        aVarA.J0 = xi6Var.Y;
        aVarA.M0 = xi6Var.Z;
        aVarA.v0 = xi6Var.s0;
        aVarA.L0 = xi6Var.t0;
        aVarA.K0 = xi6Var.u0;
        aVarA.Z0 = l38.values()[xi6Var.v0];
        aVarA.Z = xi6Var.w0;
        aVarA.s0 = xi6Var.x0;
        aVarA.U0 = xi6Var.y0;
        this.c = aVarA;
        aVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        aVarA.n0(bundle2);
        if (c.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + aVarA);
        }
    }

    public e(py0 py0Var, f fVar, a aVar, Bundle bundle) {
        this.a = py0Var;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.d = null;
        aVar.C0 = 0;
        aVar.y0 = false;
        aVar.u0 = false;
        a aVar2 = aVar.Y;
        aVar.Z = aVar2 != null ? aVar2.o : null;
        aVar.Y = null;
        aVar.b = bundle;
        aVar.X = bundle.getBundle("arguments");
    }
}
