package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import defpackage.ai6;
import defpackage.bi6;
import defpackage.cgh;
import defpackage.cj6;
import defpackage.d8a;
import defpackage.dgh;
import defpackage.ei6;
import defpackage.fgh;
import defpackage.ggh;
import defpackage.gq5;
import defpackage.j48;
import defpackage.j8a;
import defpackage.kyd;
import defpackage.l38;
import defpackage.l48;
import defpackage.lyd;
import defpackage.oi6;
import defpackage.pai;
import defpackage.pn;
import defpackage.q08;
import defpackage.s07;
import defpackage.ti6;
import defpackage.u45;
import defpackage.ue;
import defpackage.vd;
import defpackage.w0d;
import defpackage.wqi;
import defpackage.yi6;
import defpackage.zfi;
import defpackage.zh6;
import defpackage.zi6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes.dex */
public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, j48, ggh, s07, kyd {
    public static final Object h1 = new Object();
    public boolean A0;
    public boolean B0;
    public int C0;
    public c D0;
    public ei6 E0;
    public a G0;
    public int H0;
    public int I0;
    public String J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean Q0;
    public ViewGroup R0;
    public View S0;
    public boolean T0;
    public bi6 V0;
    public boolean W0;
    public Bundle X;
    public boolean X0;
    public a Y;
    public String Y0;
    public l38 Z0;
    public l48 a1;
    public Bundle b;
    public cj6 b1;
    public SparseArray c;
    public final j8a c1;
    public Bundle d;
    public lyd d1;
    public vd e1;
    public final ArrayList f1;
    public final zh6 g1;
    public int s0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public int a = -1;
    public String o = UUID.randomUUID().toString();
    public String Z = null;
    public Boolean t0 = null;
    public ti6 F0 = new ti6();
    public boolean P0 = true;
    public boolean U0 = true;

    public a() {
        new ue(21, this);
        this.Z0 = l38.o;
        this.c1 = new j8a();
        new AtomicInteger();
        this.f1 = new ArrayList();
        this.g1 = new zh6(this);
        D();
    }

    public final int A() {
        yi6 yi6Var = zi6.a;
        zi6.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        zi6.a(this).getClass();
        return this.s0;
    }

    public View B() {
        return this.S0;
    }

    public final j48 C() {
        cj6 cj6Var = this.b1;
        if (cj6Var != null) {
            return cj6Var;
        }
        throw new IllegalStateException(u45.j("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void D() {
        this.a1 = new l48(this);
        this.e1 = new vd(this);
        this.d1 = null;
        ArrayList arrayList = this.f1;
        zh6 zh6Var = this.g1;
        if (arrayList.contains(zh6Var)) {
            return;
        }
        if (this.a < 0) {
            arrayList.add(zh6Var);
            return;
        }
        a aVar = zh6Var.a;
        aVar.e1.q();
        zfi.e(aVar);
        Bundle bundle = aVar.b;
        aVar.e1.r(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void E() {
        D();
        this.Y0 = this.o;
        this.o = UUID.randomUUID().toString();
        this.u0 = false;
        this.v0 = false;
        this.x0 = false;
        this.y0 = false;
        this.A0 = false;
        this.C0 = 0;
        this.D0 = null;
        this.F0 = new ti6();
        this.E0 = null;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = false;
        this.L0 = false;
    }

    public final boolean F() {
        return this.E0 != null && this.u0;
    }

    public final boolean G() {
        if (this.K0) {
            return true;
        }
        c cVar = this.D0;
        if (cVar != null) {
            a aVar = this.G0;
            cVar.getClass();
            if (aVar == null ? false : aVar.G()) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        return this.C0 > 0;
    }

    public void I(Bundle bundle) {
        this.Q0 = true;
    }

    public void J(int i, int i2, Intent intent) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void K(Activity activity) {
        this.Q0 = true;
    }

    public void L(Context context) {
        this.Q0 = true;
        ei6 ei6Var = this.E0;
        b bVar = ei6Var == null ? null : ei6Var.c;
        if (bVar != null) {
            this.Q0 = false;
            K(bVar);
        }
    }

    public void M(Bundle bundle) {
        Bundle bundle2;
        this.Q0 = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.F0.X(bundle2);
            ti6 ti6Var = this.F0;
            ti6Var.H = false;
            ti6Var.I = false;
            ti6Var.O.g = false;
            ti6Var.u(1);
        }
        ti6 ti6Var2 = this.F0;
        if (ti6Var2.v >= 1) {
            return;
        }
        ti6Var2.H = false;
        ti6Var2.I = false;
        ti6Var2.O.g = false;
        ti6Var2.u(1);
    }

    public void N(Menu menu, MenuInflater menuInflater) {
    }

    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void P() {
        this.Q0 = true;
    }

    public void Q() {
        this.Q0 = true;
    }

    public void R() {
        this.Q0 = true;
    }

    public LayoutInflater S(Bundle bundle) {
        ei6 ei6Var = this.E0;
        if (ei6Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        b bVar = ei6Var.Y;
        LayoutInflater layoutInflaterCloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);
        layoutInflaterCloneInContext.setFactory2(this.F0.f);
        return layoutInflaterCloneInContext;
    }

    public void T(boolean z) {
    }

    public void U(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.Q0 = true;
    }

    public final void V(AttributeSet attributeSet, Bundle bundle) {
        this.Q0 = true;
        ei6 ei6Var = this.E0;
        b bVar = ei6Var == null ? null : ei6Var.c;
        if (bVar != null) {
            this.Q0 = false;
            U(bVar, attributeSet, bundle);
        }
    }

    public boolean W(MenuItem menuItem) {
        return false;
    }

    public void X() {
        this.Q0 = true;
    }

    public void Y(Menu menu) {
    }

    public void Z(int i, String[] strArr, int[] iArr) {
    }

    public void a0() {
        this.Q0 = true;
    }

    public void b0(Bundle bundle) {
    }

    public void c0() {
        this.Q0 = true;
    }

    @Override // defpackage.s07
    public final dgh d() {
        Application application;
        if (this.D0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.d1 == null) {
            Context applicationContext = k0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && c.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + k0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.d1 = new lyd(application, this, this.X);
        }
        return this.d1;
    }

    public void d0() {
        this.Q0 = true;
    }

    @Override // defpackage.s07
    public final d8a e() {
        Application application;
        Context applicationContext = k0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && c.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + k0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        d8a d8aVar = new d8a(0);
        if (application != null) {
            d8aVar.a(cgh.d, application);
        }
        d8aVar.a(zfi.a, this);
        d8aVar.a(zfi.b, this);
        Bundle bundle = this.X;
        if (bundle != null) {
            d8aVar.a(zfi.c, bundle);
        }
        return d8aVar;
    }

    public void e0(View view, Bundle bundle) {
    }

    public void f0(Bundle bundle) {
        this.Q0 = true;
    }

    public void g0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.F0.R();
        this.B0 = true;
        this.b1 = new cj6(this, h(), new gq5(4, this));
        View viewO = O(layoutInflater, viewGroup, bundle);
        this.S0 = viewO;
        if (viewO == null) {
            if (this.b1.o != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.b1 = null;
            return;
        }
        this.b1.b();
        if (c.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.S0 + " for Fragment " + this);
        }
        pai.d(this.S0, this.b1);
        this.S0.setTag(w0d.view_tree_view_model_store_owner, this.b1);
        wqi.l(this.S0, this.b1);
        this.c1.k(this.b1);
    }

    @Override // defpackage.ggh
    public final fgh h() {
        if (this.D0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (w() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.D0.O.d;
        fgh fghVar = (fgh) map.get(this.o);
        if (fghVar != null) {
            return fghVar;
        }
        fgh fghVar2 = new fgh();
        map.put(this.o, fghVar2);
        return fghVar2;
    }

    public final void h0(String[] strArr, int i) {
        if (this.E0 == null) {
            throw new IllegalStateException(u45.j("Fragment ", this, " not attached to Activity"));
        }
        c cVarX = x();
        if (cVarX.E == null) {
            cVarX.w.getClass();
            return;
        }
        cVarX.F.addLast(new oi6(this.o, i));
        cVarX.E.n(strArr);
    }

    public final b i0() {
        b bVarT = t();
        if (bVarT != null) {
            return bVarT;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle j0() {
        Bundle bundle = this.X;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " does not have any arguments."));
    }

    public final Context k0() {
        Context contextV = v();
        if (contextV != null) {
            return contextV;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " not attached to a context."));
    }

    @Override // defpackage.kyd
    public final pn l() {
        return (pn) this.e1.d;
    }

    public final View l0() {
        View viewB = B();
        if (viewB != null) {
            return viewB;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void m0(int i, int i2, int i3, int i4) {
        if (this.V0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        s().b = i;
        s().c = i2;
        s().d = i3;
        s().e = i4;
    }

    public void n0(Bundle bundle) {
        c cVar = this.D0;
        if (cVar != null) {
            if (cVar == null ? false : cVar.P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.X = bundle;
    }

    public final void o0(boolean z) {
        if (this.P0 != z) {
            this.P0 = z;
            if (this.O0 && F() && !G()) {
                this.E0.Y.invalidateOptionsMenu();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        i0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.Q0 = true;
    }

    @Override // defpackage.j48
    public final l48 p() {
        return this.a1;
    }

    public final void p0() {
        yi6 yi6Var = zi6.a;
        zi6.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        zi6.a(this).getClass();
        this.M0 = true;
        c cVar = this.D0;
        if (cVar != null) {
            cVar.O.e(this);
        } else {
            this.N0 = true;
        }
    }

    public final void q0(FrgBase frgBase, int i) {
        yi6 yi6Var = zi6.a;
        zi6.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + frgBase + " with request code " + i + " for fragment " + this));
        zi6.a(this).getClass();
        c cVar = this.D0;
        c cVar2 = frgBase.D0;
        if (cVar != null && cVar2 != null && cVar != cVar2) {
            throw new IllegalArgumentException("Fragment " + frgBase + " must share the same FragmentManager to be set as a target fragment");
        }
        for (a aVarZ = frgBase; aVarZ != null; aVarZ = aVarZ.z(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + frgBase + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.D0 == null || frgBase.D0 == null) {
            this.Z = null;
            this.Y = frgBase;
        } else {
            this.Z = frgBase.o;
            this.Y = null;
        }
        this.s0 = i;
    }

    public q08 r() {
        return new ai6(this);
    }

    public final void r0(Intent intent, int i, Bundle bundle) {
        if (this.E0 == null) {
            throw new IllegalStateException(u45.j("Fragment ", this, " not attached to Activity"));
        }
        c cVarX = x();
        if (cVarX.C != null) {
            cVarX.F.addLast(new oi6(this.o, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            cVarX.C.n(intent);
            return;
        }
        ei6 ei6Var = cVarX.w;
        if (i == -1) {
            ei6Var.d.startActivity(intent, bundle);
        } else {
            ei6Var.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public final bi6 s() {
        if (this.V0 == null) {
            bi6 bi6Var = new bi6();
            Object obj = h1;
            bi6Var.g = obj;
            bi6Var.h = obj;
            bi6Var.i = obj;
            bi6Var.j = 1.0f;
            bi6Var.k = null;
            this.V0 = bi6Var;
        }
        return this.V0;
    }

    public final b t() {
        ei6 ei6Var = this.E0;
        if (ei6Var == null) {
            return null;
        }
        return ei6Var.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.o);
        if (this.H0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.H0));
        }
        if (this.J0 != null) {
            sb.append(" tag=");
            sb.append(this.J0);
        }
        sb.append(")");
        return sb.toString();
    }

    public final c u() {
        if (this.E0 != null) {
            return this.F0;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " has not been attached yet."));
    }

    public final Context v() {
        ei6 ei6Var = this.E0;
        if (ei6Var == null) {
            return null;
        }
        return ei6Var.d;
    }

    public final int w() {
        l38 l38Var = this.Z0;
        return (l38Var == l38.b || this.G0 == null) ? l38Var.ordinal() : Math.min(l38Var.ordinal(), this.G0.w());
    }

    public final c x() {
        c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(u45.j("Fragment ", this, " not associated with a fragment manager."));
    }

    public final String y(int i) {
        return k0().getResources().getString(i);
    }

    public final a z(boolean z) {
        String str;
        if (z) {
            yi6 yi6Var = zi6.a;
            zi6.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            zi6.a(this).getClass();
        }
        a aVar = this.Y;
        if (aVar != null) {
            return aVar;
        }
        c cVar = this.D0;
        if (cVar == null || (str = this.Z) == null) {
            return null;
        }
        return cVar.c.b(str);
    }
}
