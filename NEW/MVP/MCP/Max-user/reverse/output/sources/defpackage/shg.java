package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class shg implements Cloneable {
    public static final Animator[] M0 = new Animator[0];
    public static final int[] N0 = {2, 1, 3, 4};
    public static final dwf O0 = new dwf();
    public static final ThreadLocal P0 = new ThreadLocal();
    public uha H0;
    public ave I0;
    public long K0;
    public long L0;
    public ArrayList w0;
    public ArrayList x0;
    public rhg[] y0;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList o = new ArrayList();
    public final ArrayList X = new ArrayList();
    public ArrayList Y = null;
    public ArrayList Z = null;
    public fa6 s0 = new fa6(11);
    public fa6 t0 = new fa6(11);
    public big u0 = null;
    public final int[] v0 = N0;
    public final ArrayList z0 = new ArrayList();
    public Animator[] A0 = M0;
    public int B0 = 0;
    public boolean C0 = false;
    public boolean D0 = false;
    public shg E0 = null;
    public ArrayList F0 = null;
    public ArrayList G0 = new ArrayList();
    public dwf J0 = O0;

    public static void c(fa6 fa6Var, View view, eig eigVar) {
        us usVar = (us) fa6Var.a;
        us usVar2 = (us) fa6Var.d;
        SparseArray sparseArray = (SparseArray) fa6Var.b;
        ek8 ek8Var = (ek8) fa6Var.c;
        usVar.put(view, eigVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = hfh.a;
        String strK = veh.k(view);
        if (strK != null) {
            if (usVar2.containsKey(strK)) {
                usVar2.put(strK, null);
            } else {
                usVar2.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (ek8Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ek8Var.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ek8Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ek8Var.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayList o(ArrayList arrayList, int i) {
        if (i > 0) {
            Integer numValueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(numValueOf)) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }

    public static us t() {
        ThreadLocal threadLocal = P0;
        us usVar = (us) threadLocal.get();
        if (usVar != null) {
            return usVar;
        }
        us usVar2 = new us(0);
        threadLocal.set(usVar2);
        return usVar2;
    }

    public static boolean z(eig eigVar, eig eigVar2, String str) {
        Object obj = eigVar.a.get(str);
        Object obj2 = eigVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(shg shgVar, o9g o9gVar, boolean z) {
        shg shgVar2 = this.E0;
        if (shgVar2 != null) {
            shgVar2.A(shgVar, o9gVar, z);
        }
        ArrayList arrayList = this.F0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.F0.size();
        rhg[] rhgVarArr = this.y0;
        if (rhgVarArr == null) {
            rhgVarArr = new rhg[size];
        }
        this.y0 = null;
        rhg[] rhgVarArr2 = (rhg[]) this.F0.toArray(rhgVarArr);
        for (int i = 0; i < size; i++) {
            rhg rhgVar = rhgVarArr2[i];
            switch (o9gVar.a) {
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    rhgVar.d(shgVar);
                    break;
                case 13:
                    rhgVar.e(shgVar);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    rhgVar.h(shgVar);
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    rhgVar.b();
                    break;
                default:
                    rhgVar.f();
                    break;
            }
            rhgVarArr2[i] = null;
        }
        this.y0 = rhgVarArr2;
    }

    public void B(View view) {
        if (this.D0) {
            return;
        }
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
        this.A0 = M0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.A0 = animatorArr;
        A(this, o9g.o, false);
        this.C0 = true;
    }

    public void C() {
        us usVarT = t();
        this.K0 = 0L;
        for (int i = 0; i < this.G0.size(); i++) {
            Animator animator = (Animator) this.G0.get(i);
            ohg ohgVar = (ohg) usVarT.get(animator);
            if (animator != null && ohgVar != null) {
                Animator animator2 = ohgVar.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.z0.add(animator);
                this.K0 = Math.max(this.K0, phg.a(animator));
            }
        }
        this.G0.clear();
    }

    public shg D(rhg rhgVar) {
        shg shgVar;
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            if (!arrayList.remove(rhgVar) && (shgVar = this.E0) != null) {
                shgVar.D(rhgVar);
            }
            if (this.F0.size() == 0) {
                this.F0 = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.X.remove(view);
    }

    public void F(View view) {
        if (this.C0) {
            if (!this.D0) {
                ArrayList arrayList = this.z0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
                this.A0 = M0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.A0 = animatorArr;
                A(this, o9g.X, false);
            }
            this.C0 = false;
        }
    }

    public void G() {
        O();
        us usVarT = t();
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (usVarT.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new kh(this, usVarT, false, 4));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new s6(9, this));
                    animator.start();
                }
            }
        }
        this.G0.clear();
        n();
    }

    public void H(long j, long j2) {
        long j3 = this.K0;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.D0 = false;
            A(this, o9g.b, z);
        }
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
        this.A0 = M0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            phg.b(animator, Math.min(Math.max(0L, j), phg.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.A0 = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.D0 = true;
        }
        A(this, o9g.c, z);
    }

    public void I(long j) {
        this.c = j;
    }

    public void J(ave aveVar) {
        this.I0 = aveVar;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void L(dwf dwfVar) {
        if (dwfVar == null) {
            this.J0 = O0;
        } else {
            this.J0 = dwfVar;
        }
    }

    public void M(uha uhaVar) {
        this.H0 = uhaVar;
    }

    public void N(long j) {
        this.b = j;
    }

    public final void O() {
        if (this.B0 == 0) {
            A(this, o9g.b, false);
            this.D0 = false;
        }
        this.B0++;
    }

    public String P(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        ArrayList arrayList2 = this.X;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(rhg rhgVar) {
        if (this.F0 == null) {
            this.F0 = new ArrayList();
        }
        this.F0.add(rhgVar);
    }

    public void b(View view) {
        this.X.add(view);
    }

    public void d() {
        ArrayList arrayList = this.z0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0);
        this.A0 = M0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.A0 = animatorArr;
        A(this, o9g.d, false);
    }

    public abstract void e(eig eigVar);

    public final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.Y;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            if (view.getParent() instanceof ViewGroup) {
                eig eigVar = new eig(view);
                if (z) {
                    h(eigVar);
                } else {
                    e(eigVar);
                }
                eigVar.c.add(this);
                g(eigVar);
                if (z) {
                    c(this.s0, view, eigVar);
                } else {
                    c(this.t0, view, eigVar);
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList arrayList2 = this.Z;
                if (arrayList2 == null || !arrayList2.contains(Integer.valueOf(id))) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        f(viewGroup.getChildAt(i), z);
                    }
                }
            }
        }
    }

    public void g(eig eigVar) {
        if (this.H0 != null) {
            HashMap map = eigVar.a;
            if (map.isEmpty()) {
                return;
            }
            this.H0.getClass();
            String[] strArr = uha.A0;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.H0.getClass();
                    View view = eigVar.b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void h(eig eigVar);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        ArrayList arrayList2 = this.X;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                eig eigVar = new eig(viewFindViewById);
                if (z) {
                    h(eigVar);
                } else {
                    e(eigVar);
                }
                eigVar.c.add(this);
                g(eigVar);
                if (z) {
                    c(this.s0, viewFindViewById, eigVar);
                } else {
                    c(this.t0, viewFindViewById, eigVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            eig eigVar2 = new eig(view);
            if (z) {
                h(eigVar2);
            } else {
                e(eigVar2);
            }
            eigVar2.c.add(this);
            g(eigVar2);
            if (z) {
                c(this.s0, view, eigVar2);
            } else {
                c(this.t0, view, eigVar2);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            ((us) this.s0.a).clear();
            ((SparseArray) this.s0.b).clear();
            ((ek8) this.s0.c).a();
        } else {
            ((us) this.t0.a).clear();
            ((SparseArray) this.t0.b).clear();
            ((ek8) this.t0.c).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public shg clone() {
        try {
            shg shgVar = (shg) super.clone();
            shgVar.G0 = new ArrayList();
            shgVar.s0 = new fa6(11);
            shgVar.t0 = new fa6(11);
            shgVar.w0 = null;
            shgVar.x0 = null;
            shgVar.E0 = this;
            shgVar.F0 = null;
            return shgVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, eig eigVar, eig eigVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.view.ViewGroup r24, defpackage.fa6 r25, defpackage.fa6 r26, java.util.ArrayList r27, java.util.ArrayList r28) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shg.m(android.view.ViewGroup, fa6, fa6, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n() {
        int i = this.B0 - 1;
        this.B0 = i;
        if (i == 0) {
            A(this, o9g.c, false);
            for (int i2 = 0; i2 < ((ek8) this.s0.c).g(); i2++) {
                View view = (View) ((ek8) this.s0.c).h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ek8) this.t0.c).g(); i3++) {
                View view2 = (View) ((ek8) this.t0.c).h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.D0 = true;
        }
    }

    public void p(int i) {
        this.Y = o(this.Y, i);
    }

    public void q(ViewGroup viewGroup) {
        us usVarT = t();
        int i = usVarT.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        us usVar = new us(usVarT);
        usVarT.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            ohg ohgVar = (ohg) usVar.i(i2);
            if (ohgVar.a != null && windowId.equals(ohgVar.d)) {
                ((Animator) usVar.f(i2)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.w0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (defpackage.eig) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eig r(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            big r0 = r4.u0
            if (r0 == 0) goto L9
            eig r5 = r0.r(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.w0
            goto L10
        Le:
            java.util.ArrayList r0 = r4.x0
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            eig r3 = (defpackage.eig) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.x0
            goto L35
        L33:
            java.util.ArrayList r5 = r4.w0
        L35:
            java.lang.Object r5 = r5.get(r2)
            eig r5 = (defpackage.eig) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shg.r(android.view.View, boolean):eig");
    }

    public final shg s() {
        big bigVar = this.u0;
        return bigVar != null ? bigVar.s() : this;
    }

    public final String toString() {
        return P("");
    }

    public String[] u() {
        return null;
    }

    public final eig v(View view, boolean z) {
        big bigVar = this.u0;
        if (bigVar != null) {
            return bigVar.v(view, z);
        }
        return (eig) ((us) (z ? this.s0 : this.t0).a).get(view);
    }

    public boolean w() {
        return !this.z0.isEmpty();
    }

    public boolean x(eig eigVar, eig eigVar2) {
        if (eigVar != null && eigVar2 != null) {
            String[] strArrU = u();
            if (strArrU != null) {
                for (String str : strArrU) {
                    if (z(eigVar, eigVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = eigVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (z(eigVar, eigVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.Y;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.X;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }
}
