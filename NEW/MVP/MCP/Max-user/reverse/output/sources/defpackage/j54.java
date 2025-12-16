package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j54 extends ytd {
    public c54 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public j54() {
        this.e = 2;
    }

    @Override // defpackage.ytd
    public final void I(bud budVar) {
        if (this.m) {
            budVar.a.setDetachFrozen(true);
        }
        super.I(budVar);
    }

    @Override // defpackage.ytd
    public final void K(int i, String str) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().K(i, str);
    }

    @Override // defpackage.ytd
    public final void N(String str, String[] strArr, int i) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().N(str, strArr, i);
    }

    @Override // defpackage.ytd
    public final void O(Bundle bundle) {
        super.O(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    @Override // defpackage.ytd
    public final void P(Bundle bundle) {
        super.P(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    @Override // defpackage.ytd
    public final void Q(List list, h54 h54Var) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bud) it.next()).a.setDetachFrozen(true);
            }
        }
        super.Q(list, h54Var);
    }

    @Override // defpackage.ytd
    public final void T(c54 c54Var) {
        c54Var.setParentController(this.j);
        c54Var.setRouter(this);
        c54Var.onContextAvailable();
    }

    @Override // defpackage.ytd
    public final void U(Intent intent) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().U(intent);
    }

    @Override // defpackage.ytd
    public final void V(String str, Intent intent, int i) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().V(str, intent, i);
    }

    @Override // defpackage.ytd
    public final void W(String str, Intent intent, int i, Bundle bundle) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().W(str, intent, i, bundle);
    }

    @Override // defpackage.ytd
    public final void X(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().X(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // defpackage.ytd
    public final void Z(String str) {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().Z(str);
    }

    public final void a0() {
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof g54)) {
            L((g54) viewParent);
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            c54 c54Var = (c54) it.next();
            if (c54Var.getView() != null) {
                c54Var.detach(c54Var.getView(), true, false);
            }
        }
        Iterator it2 = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it2;
            if (!f2Var.hasNext()) {
                break;
            }
            bud budVar = (bud) f2Var.next();
            if (budVar.a.getView() != null) {
                c54 c54Var2 = budVar.a;
                c54Var2.detach(c54Var2.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.i = null;
    }

    public final void b0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            } else {
                ((bud) f2Var.next()).a.setDetachFrozen(z);
            }
        }
    }

    @Override // defpackage.ytd
    public final void c(boolean z) {
        b0(false);
        super.c(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(c54 c54Var, ViewGroup viewGroup) {
        if (this.j == c54Var && this.i == viewGroup) {
            return;
        }
        a0();
        if (viewGroup instanceof g54) {
            a((g54) viewGroup);
        }
        this.j = c54Var;
        this.i = viewGroup;
        R(c54Var.onBackPressedDispatcherEnabled);
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                this.i.post(new r98(19, this));
                return;
            }
            ((bud) f2Var.next()).a.setParentController(c54Var);
        }
    }

    @Override // defpackage.ytd
    public final Activity d() {
        c54 c54Var = this.j;
        if (c54Var != null) {
            return c54Var.getActivity();
        }
        return null;
    }

    @Override // defpackage.ytd
    public final ytd i() {
        c54 c54Var = this.j;
        return (c54Var == null || c54Var.getRouter() == null) ? this : this.j.getRouter().i();
    }

    @Override // defpackage.ytd
    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    @Override // defpackage.ytd
    public final l16 k() {
        if (i() != this) {
            return i().k();
        }
        c54 c54Var = this.j;
        throw new IllegalStateException("Unable to retrieve TransactionIndexer from ".concat(c54Var != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", c54Var.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()) : "null host controller"));
    }

    @Override // defpackage.ytd
    public final void o() {
        c54 c54Var = this.j;
        if (c54Var == null || c54Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().o();
    }

    @Override // defpackage.ytd
    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        a0();
    }

    @Override // defpackage.ytd
    public final void y(bud budVar, bud budVar2, boolean z) {
        super.y(budVar, budVar2, z);
        if (budVar == null || this.j.isAttached()) {
            return;
        }
        if (budVar.b() != null && !budVar.b().d()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            } else {
                ((bud) f2Var.next()).a.setNeedsAttach(false);
            }
        }
    }
}
