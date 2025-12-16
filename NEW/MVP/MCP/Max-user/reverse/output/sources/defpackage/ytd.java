package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ytd {
    public final gg0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ViewGroup i;

    public ytd() {
        gg0 gg0Var = new gg0();
        this.a = gg0Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.g = false;
        this.h = false;
        gg0Var.b = new xtd(0, this);
    }

    public static void b(ytd ytdVar, ArrayList arrayList) {
        ytdVar.getClass();
        gg0 gg0Var = ytdVar.a;
        ArrayList arrayList2 = new ArrayList(gg0Var.a.size());
        Iterator itC = gg0Var.c();
        while (itC.hasNext()) {
            arrayList2.add(((bud) itC.next()).a);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            c54 c54Var = (c54) it.next();
            if (c54Var.getView() != null) {
                arrayList.add(c54Var.getView());
            }
            Iterator<ytd> it2 = c54Var.getChildRouters().iterator();
            while (it2.hasNext()) {
                b(it2.next(), arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            bud budVar = (bud) it.next();
            if (z2) {
                arrayList.add(budVar);
            }
            z2 = (budVar.b() == null || budVar.b().d()) ? false : true;
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final void A() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                h54.c((e54) arrayList.get(i));
                i++;
            }
        }
    }

    public final boolean B(c54 c54Var) {
        iei.a();
        gg0 gg0Var = this.a;
        bud budVarA = gg0Var.a();
        ArrayDeque arrayDeque = gg0Var.a;
        if (budVarA == null || budVarA.a != c54Var) {
            Iterator it = gg0Var.iterator();
            bud budVar = null;
            h54 h54VarB = budVarA != null ? budVarA.b() : null;
            boolean z = (h54VarB == null || h54VarB.d()) ? false : true;
            bud budVar2 = null;
            while (true) {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    break;
                }
                bud budVar3 = (bud) f2Var.next();
                c54 c54Var2 = budVar3.a;
                if (c54Var2 == c54Var) {
                    Y(budVar3);
                    arrayDeque.remove(budVar3);
                    budVar2 = budVar3;
                } else if (budVar2 != null) {
                    if (z && !c54Var2.isAttached()) {
                        budVar = budVar3;
                    }
                }
            }
            if (budVar2 != null) {
                y(budVar, budVar2, false);
            }
        } else {
            Y(gg0Var.b());
            y(gg0Var.a(), budVarA, false);
        }
        return this.e == 3 ? budVarA != null : !arrayDeque.isEmpty();
    }

    public final boolean C() {
        iei.a();
        bud budVarA = this.a.a();
        if (budVarA != null) {
            return B(budVarA.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        iei.a();
        iei.a();
        gg0 gg0Var = this.a;
        if (gg0Var.a.size() <= 1) {
            return false;
        }
        ArrayDeque arrayDeque = gg0Var.a;
        Object next = null;
        if (arrayDeque instanceof List) {
            List list = (List) arrayDeque;
            if (!list.isEmpty()) {
                next = list.get(list.size() - 1);
            }
        } else {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                next = it.next();
                while (it.hasNext()) {
                    next = it.next();
                }
            }
        }
        F((bud) next);
        return true;
    }

    public final void E(String str) {
        bud budVar;
        iei.a();
        iei.a();
        Iterator it = this.a.iterator();
        do {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            } else {
                budVar = (bud) f2Var.next();
            }
        } while (!str.equals(budVar.b));
        F(budVar);
    }

    public final void F(bud budVar) {
        gg0 gg0Var = this.a;
        if (gg0Var.a.size() > 0) {
            bud budVarA = gg0Var.a();
            ArrayList arrayList = new ArrayList();
            Iterator itC = gg0Var.c();
            while (itC.hasNext()) {
                bud budVar2 = (bud) itC.next();
                arrayList.add(budVar2);
                if (budVar2 == budVar) {
                    break;
                }
            }
            h54 overriddenPopHandler = budVarA.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = budVarA.d;
            }
            Q(arrayList, overriddenPopHandler);
        }
    }

    public final void G() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            c54 c54Var = ((bud) f2Var.next()).a;
            String instanceId = c54Var.getInstanceId();
            HashMap map = h54.c;
            if (j6j.a(instanceId)) {
                c54Var.setNeedsAttach(true);
            }
            c54Var.prepareForHostDetach();
        }
    }

    public final void H(bud budVar) {
        iei.a();
        bud budVarA = this.a.a();
        I(budVar);
        y(budVar, budVarA, true);
    }

    public void I(bud budVar) {
        c54 c54Var = budVar.a;
        gg0 gg0Var = this.a;
        ArrayDeque arrayDeque = gg0Var.a;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (fni.a(((bud) it.next()).a, c54Var)) {
                    throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
                }
            }
        }
        gg0Var.a.push(budVar);
        xtd xtdVar = gg0Var.b;
        if (xtdVar != null) {
            xtdVar.f();
        }
    }

    public final void J() {
        iei.a();
        gg0 gg0Var = this.a;
        ArrayList arrayList = new ArrayList(gg0Var.a.size());
        Iterator itC = gg0Var.c();
        while (itC.hasNext()) {
            arrayList.add((bud) itC.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bud budVar = (bud) it.next();
            if (budVar.a.getNeedsAttach()) {
                z(budVar, null, true, new c2f(false));
            } else {
                T(budVar.a);
            }
        }
    }

    public abstract void K(int i, String str);

    public final void L(g54 g54Var) {
        this.b.remove(g54Var);
    }

    public final void M(bud budVar) {
        iei.a();
        gg0 gg0Var = this.a;
        bud budVarA = gg0Var.a();
        if (!gg0Var.a.isEmpty()) {
            Y(gg0Var.b());
        }
        h54 h54VarB = budVar.b();
        if (budVarA != null) {
            boolean z = budVarA.b() == null || budVarA.b().d();
            boolean z2 = h54VarB == null || h54VarB.d();
            if (!z && z2) {
                Iterator it = l(gg0Var.iterator(), true).iterator();
                while (it.hasNext()) {
                    z(null, (bud) it.next(), true, h54VarB);
                }
            }
        }
        I(budVar);
        if (h54VarB != null) {
            h54VarB.a = true;
        }
        budVar.c(h54VarB);
        y(budVar, budVarA, true);
    }

    public abstract void N(String str, String[] strArr, int i);

    public void O(Bundle bundle) throws SecurityException {
        Bundle bundle2 = (Bundle) bundle.getParcelable("Router.backstack");
        this.e = az1.y(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        gg0 gg0Var = this.a;
        gg0Var.getClass();
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle3 = (Bundle) it.next();
                ArrayDeque arrayDeque = gg0Var.a;
                c54 c54VarNewInstance = c54.newInstance(bundle3.getBundle("RouterTransaction.controller.bundle"));
                HashMap map = h54.c;
                h54 h54VarB = j6j.b(bundle3.getBundle("RouterTransaction.pushControllerChangeHandler"));
                h54 h54VarB2 = j6j.b(bundle3.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new bud(c54VarNewInstance, bundle3.getString("RouterTransaction.tag"), h54VarB, h54VarB2, bundle3.getBoolean("RouterTransaction.attachedToRouter"), bundle3.getInt("RouterTransaction.transactionIndex")));
            }
        }
        xtd xtdVar = gg0Var.b;
        if (xtdVar != null) {
            xtdVar.f();
        }
        Iterator itC = gg0Var.c();
        while (itC.hasNext()) {
            T(((bud) itC.next()).a);
        }
    }

    public void P(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        gg0 gg0Var = this.a;
        gg0Var.getClass();
        ArrayDeque arrayDeque = gg0Var.a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            bud budVar = (bud) it.next();
            budVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("RouterTransaction.controller.bundle", budVar.a.saveInstanceState());
            h54 h54Var = budVar.c;
            if (h54Var != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", h54Var.j());
            }
            h54 h54Var2 = budVar.d;
            if (h54Var2 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", h54Var2.j());
            }
            bundle3.putString("RouterTransaction.tag", budVar.b);
            bundle3.putInt("RouterTransaction.transactionIndex", budVar.f);
            bundle3.putBoolean("RouterTransaction.attachedToRouter", budVar.e);
            arrayList.add(bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", az1.v(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(java.util.List r12, defpackage.h54 r13) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytd.Q(java.util.List, h54):void");
    }

    public final void R(boolean z) {
        if (this.a.a.size() > 0 && z != this.f) {
            Log.e("Conductor", "setOnBackPressedDispatcherEnabled call ignored, as controllers with a different setting have already been pushed.");
        }
        this.f = z;
    }

    public final void S(bud budVar) {
        iei.a();
        Q(Collections.singletonList(budVar), budVar.b());
    }

    public void T(c54 c54Var) {
        c54Var.setRouter(this);
        c54Var.onContextAvailable();
    }

    public abstract void U(Intent intent);

    public abstract void V(String str, Intent intent, int i);

    public abstract void W(String str, Intent intent, int i, Bundle bundle);

    public abstract void X(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

    public final void Y(bud budVar) {
        c54 c54Var = budVar.a;
        if (c54Var.isDestroyed()) {
            return;
        }
        this.d.add(c54Var);
        c54Var.addLifecycleListener(new m54(4, this));
    }

    public abstract void Z(String str);

    public final void a(g54 g54Var) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(g54Var)) {
            return;
        }
        arrayList.add(g54Var);
    }

    public void c(boolean z) {
        this.e = 3;
        gg0 gg0Var = this.a;
        gg0Var.getClass();
        ArrayList arrayList = new ArrayList();
        while (!gg0Var.a.isEmpty()) {
            arrayList.add(gg0Var.b());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y((bud) it.next());
        }
        bud budVar = null;
        if (z && arrayList.size() > 0) {
            bud budVar2 = (bud) arrayList.get(0);
            budVar2.a.addLifecycleListener(new q9((j54) this, arrayList));
            h54 overriddenPopHandler = budVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = budVar2.d;
            }
            z(null, budVar2, false, overriddenPopHandler);
            budVar = budVar2;
        }
        if (arrayList.size() > 0) {
            sha shaVar = new sha();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bud budVar3 = (bud) it2.next();
                if (budVar3 != budVar) {
                    c54 c54Var = budVar3.a;
                    i54 i54Var = i54.POP_EXIT;
                    c54Var.changeStarted(shaVar, i54Var);
                    budVar3.a.changeEnded(shaVar, i54Var);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        gg0 gg0Var = this.a;
        ArrayList arrayList = new ArrayList(gg0Var.a.size());
        Iterator itC = gg0Var.c();
        while (itC.hasNext()) {
            arrayList.add((bud) itC.next());
        }
        return arrayList;
    }

    public final c54 f(String str) {
        c54 c54VarFindController;
        Iterator it = this.a.iterator();
        do {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return null;
            }
            c54VarFindController = ((bud) f2Var.next()).a.findController(str);
        } while (c54VarFindController == null);
        return c54VarFindController;
    }

    public final c54 g(String str) {
        bud budVar;
        Iterator it = this.a.iterator();
        do {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return null;
            }
            budVar = (bud) f2Var.next();
        } while (!str.equals(budVar.b));
        return budVar.a;
    }

    public final jva h() {
        Activity activityD = d();
        if (activityD instanceof nl3) {
            return ((nl3) activityD).u();
        }
        return null;
    }

    public abstract ytd i();

    public abstract List j();

    public abstract l16 k();

    public final boolean m() {
        gg0 gg0Var = this.a;
        if (gg0Var.a.isEmpty()) {
            return false;
        }
        return gg0Var.a().a.handleBack() || ((gg0Var.a.size() > 1 || this.e != 1) && C());
    }

    public final boolean n() {
        return this.a.a.size() > 0;
    }

    public abstract void o();

    public void p(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.activityDestroyed(activity);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().p(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c54 c54Var = (c54) arrayList.get(size);
            c54Var.activityDestroyed(activity);
            Iterator<ytd> it3 = c54Var.getChildRouters().iterator();
            while (it3.hasNext()) {
                it3.next().p(activity, z);
            }
        }
        this.i = null;
    }

    public final void q(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.activityPaused(activity);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().q(activity);
            }
        }
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.activityResumed(activity);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().r(activity);
            }
        }
    }

    public final void s(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.activityStarted(activity);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().s(activity);
            }
        }
    }

    public final void t(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                this.h = true;
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.activityStopped(activity);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().t(activity);
            }
        }
    }

    public void u() {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            } else {
                ((bud) f2Var.next()).a.onContextAvailable();
            }
        }
    }

    public final void v(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.createOptionsMenu(menu, menuInflater);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().v(menu, menuInflater);
            }
        }
    }

    public final boolean w(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return false;
            }
            bud budVar = (bud) f2Var.next();
            if (budVar.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                if (it2.next().w(menuItem)) {
                    return true;
                }
            }
        }
    }

    public final void x(Menu menu) {
        Iterator it = this.a.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                return;
            }
            bud budVar = (bud) f2Var.next();
            budVar.a.prepareOptionsMenu(menu);
            Iterator<ytd> it2 = budVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().x(menu);
            }
        }
    }

    public void y(bud budVar, bud budVar2, boolean z) {
        h54 overriddenPopHandler;
        if (z && budVar != null) {
            budVar.e = true;
        }
        if (z) {
            overriddenPopHandler = budVar.b();
        } else if (budVar2 != null) {
            overriddenPopHandler = budVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = budVar2.d;
            }
        } else {
            overriddenPopHandler = null;
        }
        z(budVar, budVar2, z, overriddenPopHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.bud r10, defpackage.bud r11, boolean r12, defpackage.h54 r13) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L7
            c54 r1 = r10.a
            r3 = r1
            goto L8
        L7:
            r3 = r0
        L8:
            if (r11 == 0) goto Lc
            c54 r0 = r11.a
        Lc:
            r4 = r0
            r11 = 0
            r0 = 1
            if (r10 == 0) goto L25
            l16 r1 = r9.k()
            int r2 = r10.f
            r5 = -1
            if (r2 != r5) goto L21
            int r2 = r1.b
            int r2 = r2 + r0
            r1.b = r2
            r10.f = r2
        L21:
            r9.T(r3)
            goto L47
        L25:
            gg0 r10 = r9.a
            java.util.ArrayDeque r10 = r10.a
            int r10 = r10.size()
            if (r10 != 0) goto L3c
            int r10 = r9.e
            r1 = 2
            if (r10 != r1) goto L3c
            sha r13 = new sha
            r13.<init>()
        L39:
            r7 = r13
            r10 = r0
            goto L49
        L3c:
            if (r12 != 0) goto L47
            if (r4 == 0) goto L47
            boolean r10 = r4.isAttached()
            if (r10 != 0) goto L47
            goto L39
        L47:
            r10 = r11
            r7 = r13
        L49:
            if (r12 == 0) goto L75
            if (r3 == 0) goto L75
            boolean r13 = r3.isDestroyed()
            if (r13 != 0) goto L54
            goto L75
        L54:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Trying to push a controller that has already been destroyed. ("
            r11.<init>(r12)
            java.lang.Class r12 = r3.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            java.lang.String r12 = ")"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L75:
            e54 r2 = new e54
            android.view.ViewGroup r6 = r9.i
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r13 = r9.b
            r8.<init>(r13)
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r12 = r9.c
            int r13 = r12.size()
            if (r13 <= 0) goto L95
            if (r3 == 0) goto L91
            r3.setNeedsAttach(r0)
        L91:
            r12.add(r2)
            goto Lbd
        L95:
            if (r4 == 0) goto Lba
            if (r7 == 0) goto L9f
            boolean r13 = r7.d()
            if (r13 == 0) goto Lba
        L9f:
            boolean r13 = r9.g
            if (r13 != 0) goto Lba
            if (r3 == 0) goto La8
            r3.setNeedsAttach(r0)
        La8:
            r12.add(r2)
            android.view.ViewGroup r12 = r9.i
            if (r12 == 0) goto Lbd
            awa r13 = new awa
            r1 = 22
            r13.<init>(r1, r9)
            r12.post(r13)
            goto Lbd
        Lba:
            defpackage.h54.c(r2)
        Lbd:
            if (r10 == 0) goto Ld2
            if (r4 == 0) goto Ld2
            android.view.View r10 = r4.getView()
            if (r10 == 0) goto Lcf
            android.view.View r10 = r4.getView()
            r4.detach(r10, r0, r11)
            return
        Lcf:
            r4.destroy()
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytd.z(bud, bud, boolean, h54):void");
    }
}
