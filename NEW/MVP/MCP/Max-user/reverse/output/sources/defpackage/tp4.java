package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tp4 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public tp4(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(v7f v7fVar) {
        if (v7fVar.i) {
            ctd.a(v7fVar.a, v7fVar.c.l0(), this.a);
            v7fVar.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            v7f v7fVar = (v7f) next;
            View view = v7fVar.c.S0;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(ho7.f(visibility, "Unknown visibility "));
                    }
                } else if (v7fVar.a != 2) {
                    break;
                }
            }
        }
        v7f v7fVar2 = (v7f) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            v7f v7fVar3 = (v7f) objPrevious;
            View view2 = v7fVar3.c.S0;
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(ho7.f(visibility2, "Unknown visibility "));
                }
            }
            if (v7fVar3.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        v7f v7fVar4 = (v7f) obj;
        if (c.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + v7fVar2 + " to " + v7fVar4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        a aVar = ((v7f) ue3.P(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bi6 bi6Var = ((v7f) it2.next()).c.V0;
            bi6 bi6Var2 = aVar.V0;
            bi6Var.b = bi6Var2.b;
            bi6Var.c = bi6Var2.c;
            bi6Var.d = bi6Var2.d;
            bi6Var.e = bi6Var2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            v7f v7fVar5 = (v7f) it3.next();
            arrayList2.add(new np4(v7fVar5, z));
            if (!z ? v7fVar5 == v7fVar4 : v7fVar5 == v7fVar2) {
                z2 = true;
            }
            a aVar2 = v7fVar5.c;
            sp4 sp4Var = new sp4(6, v7fVar5);
            if (v7fVar5.a == 2) {
                if (z) {
                    bi6 bi6Var3 = aVar2.V0;
                } else {
                    aVar2.getClass();
                }
            } else if (z) {
                bi6 bi6Var4 = aVar2.V0;
            } else {
                aVar2.getClass();
            }
            if (v7fVar5.a == 2) {
                if (z) {
                    bi6 bi6Var5 = aVar2.V0;
                } else {
                    bi6 bi6Var6 = aVar2.V0;
                }
            }
            if (z2) {
                if (z) {
                    bi6 bi6Var7 = aVar2.V0;
                } else {
                    aVar2.getClass();
                }
            }
            arrayList3.add(sp4Var);
            v7fVar5.d.add(new kp4(this, v7fVar5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!((sp4) next2).B0()) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((sp4) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((sp4) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            af3.v(arrayList7, ((v7f) ((np4) it7.next()).b).k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z3 = false;
        while (it8.hasNext()) {
            np4 np4Var = (np4) it8.next();
            Context context = this.a.getContext();
            v7f v7fVar6 = (v7f) np4Var.b;
            xo8 xo8VarL0 = np4Var.L0(context);
            if (xo8VarL0 != null) {
                if (((AnimatorSet) xo8VarL0.c) == null) {
                    arrayList6.add(np4Var);
                } else {
                    a aVar3 = v7fVar6.c;
                    if (v7fVar6.k.isEmpty()) {
                        if (v7fVar6.a == 3) {
                            v7fVar6.i = false;
                        }
                        v7fVar6.j.add(new pp4(np4Var));
                        z3 = true;
                    } else if (c.K(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + aVar3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            np4 np4Var2 = (np4) it9.next();
            v7f v7fVar7 = (v7f) np4Var2.b;
            a aVar4 = v7fVar7.c;
            if (zIsEmpty) {
                if (!z3) {
                    v7fVar7.j.add(new mp4(np4Var2));
                } else if (c.K(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + aVar4 + " as Animations cannot run alongside Animators.");
                }
            } else if (c.K(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + aVar4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            af3.v(arrayList, ((v7f) it.next()).k);
        }
        List listD0 = ue3.d0(ue3.h0(arrayList));
        int size = listD0.size();
        for (int i = 0; i < size; i++) {
            ((u7f) listD0.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((v7f) list.get(i2));
        }
        List listD02 = ue3.d0(list);
        int size3 = listD02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            v7f v7fVar = (v7f) listD02.get(i3);
            if (v7fVar.k.isEmpty()) {
                v7fVar.b();
            }
        }
    }

    public final void d(int i, int i2, e eVar) {
        synchronized (this.b) {
            try {
                v7f v7fVarF = f(eVar.c);
                if (v7fVarF == null) {
                    a aVar = eVar.c;
                    v7fVarF = aVar.w0 ? g(aVar) : null;
                }
                if (v7fVarF != null) {
                    v7fVarF.d(i, i2);
                    return;
                }
                v7f v7fVar = new v7f(i, i2, eVar);
                this.b.add(v7fVar);
                v7fVar.d.add(new kp4(this, v7fVar, 1));
                v7fVar.d.add(new kp4(this, v7fVar, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp4.e():void");
    }

    public final v7f f(a aVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            v7f v7fVar = (v7f) next;
            if (fni.a(v7fVar.c, aVar) && !v7fVar.e) {
                break;
            }
        }
        return (v7f) next;
    }

    public final v7f g(a aVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            v7f v7fVar = (v7f) next;
            if (fni.a(v7fVar.c, aVar) && !v7fVar.e) {
                break;
            }
        }
        return (v7f) next;
    }

    public final void h() {
        String str;
        String str2;
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                j();
                i(this.b);
                Iterator it = new ArrayList(this.c).iterator();
                while (it.hasNext()) {
                    v7f v7fVar = (v7f) it.next();
                    if (c.K(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + v7fVar);
                    }
                    v7fVar.a(this.a);
                }
                Iterator it2 = new ArrayList(this.b).iterator();
                while (it2.hasNext()) {
                    v7f v7fVar2 = (v7f) it2.next();
                    if (c.K(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + v7fVar2);
                    }
                    v7fVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v7f v7fVar = (v7f) list.get(i);
            e eVar = v7fVar.l;
            if (!v7fVar.h) {
                v7fVar.h = true;
                int i2 = v7fVar.b;
                if (i2 == 2) {
                    a aVar = eVar.c;
                    View viewFindFocus = aVar.S0.findFocus();
                    if (viewFindFocus != null) {
                        aVar.s().k = viewFindFocus;
                        if (c.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + aVar);
                        }
                    }
                    View viewL0 = v7fVar.c.l0();
                    if (viewL0.getParent() == null) {
                        eVar.b();
                        viewL0.setAlpha(0.0f);
                    }
                    if (viewL0.getAlpha() == 0.0f && viewL0.getVisibility() == 0) {
                        viewL0.setVisibility(4);
                    }
                    bi6 bi6Var = aVar.V0;
                    viewL0.setAlpha(bi6Var == null ? 1.0f : bi6Var.j);
                } else if (i2 == 3) {
                    a aVar2 = eVar.c;
                    View viewL02 = aVar2.l0();
                    if (c.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewL02.findFocus() + " on view " + viewL02 + " for Fragment " + aVar2);
                    }
                    viewL02.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            af3.v(arrayList, ((v7f) it.next()).k);
        }
        List listD0 = ue3.d0(ue3.h0(arrayList));
        int size2 = listD0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            u7f u7fVar = (u7f) listD0.get(i3);
            if (!u7fVar.a) {
                u7fVar.d(this.a);
            }
            u7fVar.a = true;
        }
    }

    public final void j() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v7f v7fVar = (v7f) it.next();
            int i = 2;
            if (v7fVar.b == 2) {
                int visibility = v7fVar.c.l0().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(ho7.f(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                v7fVar.d(i, 1);
            }
        }
    }
}
