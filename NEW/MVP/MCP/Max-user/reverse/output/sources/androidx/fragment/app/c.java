package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import defpackage.aj6;
import defpackage.az1;
import defpackage.bi6;
import defpackage.c0d;
import defpackage.ei6;
import defpackage.gi6;
import defpackage.ho7;
import defpackage.ii6;
import defpackage.j48;
import defpackage.j8;
import defpackage.ji6;
import defpackage.ju3;
import defpackage.jva;
import defpackage.ka5;
import defpackage.ki6;
import defpackage.l38;
import defpackage.l48;
import defpackage.li6;
import defpackage.ll3;
import defpackage.mc5;
import defpackage.mi6;
import defpackage.ni6;
import defpackage.pi6;
import defpackage.pn;
import defpackage.py0;
import defpackage.q08;
import defpackage.qi6;
import defpackage.r5j;
import defpackage.ti6;
import defpackage.tp4;
import defpackage.u5i;
import defpackage.ue;
import defpackage.ue0;
import defpackage.uha;
import defpackage.ui6;
import defpackage.usd;
import defpackage.ve0;
import defpackage.vg8;
import defpackage.vid;
import defpackage.we0;
import defpackage.wi6;
import defpackage.wy1;
import defpackage.xi6;
import defpackage.z44;
import defpackage.zi6;
import defpackage.zid;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {
    public u5i C;
    public u5i D;
    public u5i E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public FragmentManagerViewModel O;
    public boolean b;
    public ArrayList e;
    public jva g;
    public final ii6 q;
    public final ii6 r;
    public final ii6 s;
    public final ii6 t;
    public ei6 w;
    public q08 x;
    public a y;
    public a z;
    public final ArrayList a = new ArrayList();
    public final f c = new f();
    public ArrayList d = new ArrayList();
    public final gi6 f = new gi6(this);
    public ue0 h = null;
    public final z44 i = new z44(6, this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final ArrayList n = new ArrayList();
    public final py0 o = new py0(this);
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public final ki6 u = new ki6(this);
    public int v = -1;
    public final li6 A = new li6(this);
    public final uha B = new uha(20);
    public ArrayDeque F = new ArrayDeque();
    public final ue P = new ue(22, this);

    /* JADX WARN: Type inference failed for: r0v16, types: [ii6] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ii6] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ii6] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ii6] */
    public c() {
        final int i = 0;
        this.q = new ju3(this) { // from class: ii6
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.M()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.M() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        w6a w6aVar = (w6a) obj;
                        c cVar3 = this.b;
                        if (cVar3.M()) {
                            boolean z = w6aVar.a;
                            cVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        mzb mzbVar = (mzb) obj;
                        c cVar4 = this.b;
                        if (cVar4.M()) {
                            boolean z2 = mzbVar.a;
                            cVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new ju3(this) { // from class: ii6
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.M()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.M() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        w6a w6aVar = (w6a) obj;
                        c cVar3 = this.b;
                        if (cVar3.M()) {
                            boolean z = w6aVar.a;
                            cVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        mzb mzbVar = (mzb) obj;
                        c cVar4 = this.b;
                        if (cVar4.M()) {
                            boolean z2 = mzbVar.a;
                            cVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.s = new ju3(this) { // from class: ii6
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.M()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.M() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        w6a w6aVar = (w6a) obj;
                        c cVar3 = this.b;
                        if (cVar3.M()) {
                            boolean z = w6aVar.a;
                            cVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        mzb mzbVar = (mzb) obj;
                        c cVar4 = this.b;
                        if (cVar4.M()) {
                            boolean z2 = mzbVar.a;
                            cVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.t = new ju3(this) { // from class: ii6
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.M()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.M() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        w6a w6aVar = (w6a) obj;
                        c cVar3 = this.b;
                        if (cVar3.M()) {
                            boolean z = w6aVar.a;
                            cVar3.n(false);
                            break;
                        }
                        break;
                    default:
                        mzb mzbVar = (mzb) obj;
                        c cVar4 = this.b;
                        if (cVar4.M()) {
                            boolean z2 = mzbVar.a;
                            cVar4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet F(ue0 ue0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < ue0Var.a.size(); i++) {
            a aVar = ((aj6) ue0Var.a.get(i)).b;
            if (aVar != null && ue0Var.g) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(a aVar) {
        if (aVar.O0 && aVar.P0) {
            return true;
        }
        Iterator it = aVar.F0.c.e().iterator();
        boolean zL = false;
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != null) {
                zL = L(aVar2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(a aVar) {
        if (aVar == null) {
            return true;
        }
        if (aVar.P0) {
            return aVar.D0 == null || N(aVar.G0);
        }
        return false;
    }

    public static boolean O(a aVar) {
        if (aVar == null) {
            return true;
        }
        c cVar = aVar.D0;
        return aVar.equals(cVar.z) && O(cVar.y);
    }

    public static void g0(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + aVar);
        }
        if (aVar.K0) {
            aVar.K0 = false;
            aVar.W0 = !aVar.W0;
        }
    }

    public final void A(ue0 ue0Var, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        y(z);
        ue0Var.a(this.L, this.M);
        this.b = true;
        try {
            W(this.L, this.M);
            d();
            j0();
            if (this.K) {
                this.K = false;
                h0();
            }
            this.c.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0231 A[PHI: r15
  0x0231: PHI (r15v22 int) = (r15v21 int), (r15v24 int) binds: [B:105:0x021e, B:109:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.util.ArrayList r28, java.util.ArrayList r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.B(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final a C(int i) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && aVar.H0 == i) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.H0 == i) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final a D(String str) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && str.equals(aVar.J0)) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (str.equals(aVar2.J0)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            tp4 tp4Var = (tp4) it.next();
            if (tp4Var.e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                tp4Var.e = false;
                tp4Var.e();
            }
        }
    }

    public final ViewGroup G(a aVar) {
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aVar.I0 <= 0 || !this.x.e()) {
            return null;
        }
        View viewD = this.x.d(aVar.I0);
        if (viewD instanceof ViewGroup) {
            return (ViewGroup) viewD;
        }
        return null;
    }

    public final li6 H() {
        a aVar = this.y;
        return aVar != null ? aVar.D0.H() : this.A;
    }

    public final uha I() {
        a aVar = this.y;
        return aVar != null ? aVar.D0.I() : this.B;
    }

    public final void J(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + aVar);
        }
        if (aVar.K0) {
            return;
        }
        aVar.K0 = true;
        aVar.W0 = true ^ aVar.W0;
        f0(aVar);
    }

    public final boolean M() {
        a aVar = this.y;
        if (aVar == null) {
            return true;
        }
        return aVar.F() && this.y.x().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i, boolean z) {
        ei6 ei6Var;
        if (this.w == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.v) {
            this.v = i;
            f fVar = this.c;
            HashMap map = fVar.b;
            Iterator it = fVar.a.iterator();
            while (it.hasNext()) {
                e eVar = (e) map.get(((a) it.next()).o);
                if (eVar != null) {
                    eVar.k();
                }
            }
            for (e eVar2 : map.values()) {
                if (eVar2 != null) {
                    eVar2.k();
                    a aVar = eVar2.c;
                    if (aVar.v0 && !aVar.H()) {
                        fVar.h(eVar2);
                    }
                }
            }
            h0();
            if (this.G && (ei6Var = this.w) != null && this.v == 7) {
                ei6Var.Y.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.F0.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        z(false);
        y(true);
        a aVar = this.z;
        if (aVar != null && i < 0 && aVar.u().S()) {
            return true;
        }
        boolean zU = U(this.L, this.M, i, i2);
        if (zU) {
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        j0();
        if (this.K) {
            this.K = false;
            h0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    ue0 ue0Var = (ue0) this.d.get(size2);
                    if (i >= 0 && i == ue0Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        ue0 ue0Var2 = (ue0) this.d.get(size - 1);
                        if (i < 0 || i != ue0Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((ue0) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + aVar + " nesting=" + aVar.C0);
        }
        boolean zH = aVar.H();
        if (aVar.L0 && zH) {
            return;
        }
        f fVar = this.c;
        synchronized (fVar.a) {
            fVar.a.remove(aVar);
        }
        aVar.u0 = false;
        if (L(aVar)) {
            this.G = true;
        }
        aVar.v0 = true;
        f0(aVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((ue0) arrayList.get(i)).o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ue0) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void X(Bundle bundle) {
        py0 py0Var;
        int i;
        boolean z;
        int i2;
        e eVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.d.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.d.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        f fVar = this.c;
        HashMap map2 = fVar.c;
        HashMap map3 = fVar.b;
        map2.clear();
        map2.putAll(map);
        ui6 ui6Var = (ui6) bundle.getParcelable("state");
        if (ui6Var == null) {
            return;
        }
        map3.clear();
        Iterator it = ui6Var.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            py0Var = this.o;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = fVar.i((String) it.next(), null);
            if (bundleI != null) {
                a aVar = (a) this.O.b.get(((xi6) bundleI.getParcelable("state")).b);
                if (aVar != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + aVar);
                    }
                    eVar = new e(py0Var, fVar, aVar, bundleI);
                } else {
                    eVar = new e(this.o, this.c, this.w.d.getClassLoader(), H(), bundleI);
                }
                a aVar2 = eVar.c;
                aVar2.b = bundleI;
                aVar2.D0 = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + aVar2.o + "): " + aVar2);
                }
                eVar.m(this.w.d.getClassLoader());
                fVar.g(eVar);
                eVar.e = this.v;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.O;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.b.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            a aVar3 = (a) it2.next();
            if (map3.get(aVar3.o) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + aVar3 + " that was not found in the set of active Fragments " + ui6Var.a);
                }
                this.O.i(aVar3);
                aVar3.D0 = this;
                e eVar2 = new e(py0Var, fVar, aVar3);
                eVar2.e = 1;
                eVar2.k();
                aVar3.v0 = true;
                eVar2.k();
            }
        }
        ArrayList<String> arrayList = ui6Var.b;
        fVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                a aVarB = fVar.b(str3);
                if (aVarB == null) {
                    throw new IllegalStateException(ho7.i("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + aVarB);
                }
                fVar.a(aVarB);
            }
        }
        if (ui6Var.c != null) {
            this.d = new ArrayList(ui6Var.c.length);
            int i3 = 0;
            while (true) {
                ve0[] ve0VarArr = ui6Var.c;
                if (i3 >= ve0VarArr.length) {
                    break;
                }
                ve0 ve0Var = ve0VarArr[i3];
                ArrayList arrayList2 = ve0Var.b;
                ue0 ue0Var = new ue0(this);
                int[] iArr = ve0Var.a;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    aj6 aj6Var = new aj6();
                    int i6 = i4 + 1;
                    int i7 = i;
                    aj6Var.a = iArr[i4];
                    if (K(i7)) {
                        Log.v("FragmentManager", "Instantiate " + ue0Var + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    aj6Var.h = l38.values()[ve0Var.c[i5]];
                    aj6Var.i = l38.values()[ve0Var.d[i5]];
                    int i8 = i4 + 2;
                    aj6Var.c = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    aj6Var.d = i9;
                    int i10 = iArr[i4 + 3];
                    aj6Var.e = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    aj6Var.f = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    aj6Var.g = i13;
                    ue0Var.b = i9;
                    ue0Var.c = i10;
                    ue0Var.d = i12;
                    ue0Var.e = i13;
                    ue0Var.b(aj6Var);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                ue0Var.f = ve0Var.o;
                ue0Var.h = ve0Var.X;
                ue0Var.g = true;
                ue0Var.i = ve0Var.Z;
                ue0Var.j = ve0Var.s0;
                ue0Var.k = ve0Var.t0;
                ue0Var.l = ve0Var.u0;
                ue0Var.m = ve0Var.v0;
                ue0Var.n = ve0Var.w0;
                ue0Var.o = ve0Var.x0;
                ue0Var.s = ve0Var.Y;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((aj6) ue0Var.a.get(i15)).b = fVar.b(str4);
                    }
                }
                ue0Var.c(1);
                if (K(i14)) {
                    StringBuilder sbM = ho7.m(i3, "restoreAllState: back stack #", " (index ");
                    sbM.append(ue0Var.s);
                    sbM.append("): ");
                    sbM.append(ue0Var);
                    Log.v("FragmentManager", sbM.toString());
                    PrintWriter printWriter = new PrintWriter(new vg8());
                    ue0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(ue0Var);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.j.set(ui6Var.d);
        String str5 = ui6Var.o;
        if (str5 != null) {
            a aVarB2 = fVar.b(str5);
            this.z = aVarB2;
            r(aVarB2);
        }
        ArrayList arrayList3 = ui6Var.X;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.k.put((String) arrayList3.get(i16), (we0) ui6Var.Y.get(i16));
            }
        }
        this.F = new ArrayDeque(ui6Var.Z);
    }

    public final Bundle Y() {
        ArrayList arrayList;
        ve0[] ve0VarArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.H = true;
        this.O.g = true;
        f fVar = this.c;
        fVar.getClass();
        HashMap map = fVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (e eVar : map.values()) {
            if (eVar != null) {
                a aVar = eVar.c;
                fVar.i(aVar.o, eVar.o());
                arrayList2.add(aVar.o);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + aVar + ": " + aVar.b);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            f fVar2 = this.c;
            synchronized (fVar2.a) {
                try {
                    if (fVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fVar2.a.size());
                        Iterator it = fVar2.a.iterator();
                        while (it.hasNext()) {
                            a aVar2 = (a) it.next();
                            arrayList.add(aVar2.o);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + aVar2.o + "): " + aVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                ve0VarArr = new ve0[size];
                for (int i = 0; i < size; i++) {
                    ve0VarArr[i] = new ve0((ue0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder sbM = ho7.m(i, "saveAllState: adding back stack #", ": ");
                        sbM.append(this.d.get(i));
                        Log.v("FragmentManager", sbM.toString());
                    }
                }
            } else {
                ve0VarArr = null;
            }
            ui6 ui6Var = new ui6();
            ui6Var.o = null;
            ArrayList arrayList3 = new ArrayList();
            ui6Var.X = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            ui6Var.Y = arrayList4;
            ui6Var.a = arrayList2;
            ui6Var.b = arrayList;
            ui6Var.c = ve0VarArr;
            ui6Var.d = this.j.get();
            a aVar3 = this.z;
            if (aVar3 != null) {
                ui6Var.o = aVar3.o;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            ui6Var.Z = new ArrayList(this.F);
            bundle.putParcelable("state", ui6Var);
            for (String str : this.l.keySet()) {
                bundle.putBundle(wy1.h("result_", str), (Bundle) this.l.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(wy1.h("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.o.removeCallbacks(this.P);
                    this.w.o.post(this.P);
                    j0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e a(a aVar) {
        String str = aVar.Y0;
        if (str != null) {
            zi6.c(aVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + aVar);
        }
        e eVarG = g(aVar);
        aVar.D0 = this;
        f fVar = this.c;
        fVar.g(eVarG);
        if (!aVar.L0) {
            fVar.a(aVar);
            aVar.v0 = false;
            if (aVar.S0 == null) {
                aVar.W0 = false;
            }
            if (L(aVar)) {
                this.G = true;
            }
        }
        return eVarG;
    }

    public final void a0(a aVar, boolean z) {
        ViewGroup viewGroupG = G(aVar);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ei6 ei6Var, q08 q08Var, a aVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = ei6Var;
        this.x = q08Var;
        this.y = aVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (aVar != 0) {
            copyOnWriteArrayList.add(new ni6(aVar));
        } else if (ei6Var != null) {
            copyOnWriteArrayList.add(ei6Var);
        }
        if (this.y != null) {
            j0();
        }
        if (ei6Var != null) {
            jva jvaVarU = ei6Var.Y.u();
            this.g = jvaVarU;
            jvaVarU.a(aVar != 0 ? aVar : ei6Var, this.i);
        }
        if (aVar != 0) {
            FragmentManagerViewModel fragmentManagerViewModel = aVar.D0.O;
            HashMap map = fragmentManagerViewModel.c;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(aVar.o);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.e);
                map.put(aVar.o, fragmentManagerViewModel2);
            }
            this.O = fragmentManagerViewModel2;
        } else if (ei6Var != null) {
            this.O = (FragmentManagerViewModel) new zid(ei6Var.Y.h(), FragmentManagerViewModel.h).i(vid.a(FragmentManagerViewModel.class));
        } else {
            this.O = new FragmentManagerViewModel(false);
        }
        this.O.g = P();
        this.c.d = this.O;
        ei6 ei6Var2 = this.w;
        if (ei6Var2 != null && aVar == 0) {
            pn pnVarL = ei6Var2.l();
            pnVarL.f("android:support:fragments", new ji6(0, (ti6) this));
            Bundle bundleC = pnVarL.c("android:support:fragments");
            if (bundleC != null) {
                X(bundleC);
            }
        }
        ei6 ei6Var3 = this.w;
        if (ei6Var3 != null) {
            ll3 ll3Var = ei6Var3.Y.Z;
            String strH = wy1.h("FragmentManager:", aVar != 0 ? ho7.l(new StringBuilder(), aVar.o, ":") : "");
            ti6 ti6Var = (ti6) this;
            this.C = ll3Var.c(az1.i(strH, "StartActivityForResult"), new j8(1), new usd(18, ti6Var));
            this.D = ll3Var.c(az1.i(strH, "StartIntentSenderForResult"), new j8(2), new mc5(15, ti6Var));
            this.E = ll3Var.c(az1.i(strH, "RequestPermissions"), new j8(0), new r5j(19, ti6Var));
        }
        ei6 ei6Var4 = this.w;
        if (ei6Var4 != null) {
            ei6Var4.Y.s(this.q);
        }
        ei6 ei6Var5 = this.w;
        if (ei6Var5 != null) {
            ei6Var5.Y.t0.add(this.r);
        }
        ei6 ei6Var6 = this.w;
        if (ei6Var6 != null) {
            ei6Var6.Y.v0.add(this.s);
        }
        ei6 ei6Var7 = this.w;
        if (ei6Var7 != null) {
            ei6Var7.Y.w0.add(this.t);
        }
        ei6 ei6Var8 = this.w;
        if (ei6Var8 == null || aVar != 0) {
            return;
        }
        ka5 ka5Var = ei6Var8.Y.c;
        ((CopyOnWriteArrayList) ka5Var.b).add(this.u);
        ((Runnable) ka5Var.a).run();
    }

    public final void b0(String str, Bundle bundle) {
        pi6 pi6Var = (pi6) this.m.get(str);
        if (pi6Var == null || !pi6Var.a.d.a(l38.d)) {
            this.l.put(str, bundle);
        } else {
            pi6Var.b(str, bundle);
        }
        if (K(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void c(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + aVar);
        }
        if (aVar.L0) {
            aVar.L0 = false;
            if (aVar.u0) {
                return;
            }
            this.c.a(aVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + aVar);
            }
            if (L(aVar)) {
                this.G = true;
            }
        }
    }

    public final void c0(String str, j48 j48Var, wi6 wi6Var) {
        l48 l48VarP = j48Var.p();
        if (l48VarP.d == l38.a) {
            return;
        }
        mi6 mi6Var = new mi6(this, str, wi6Var, l48VarP);
        pi6 pi6Var = (pi6) this.m.put(str, new pi6(l48VarP, wi6Var, mi6Var));
        if (pi6Var != null) {
            pi6Var.a.f(pi6Var.c);
        }
        if (K(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + l48VarP + " and listener " + wi6Var);
        }
        l48VarP.a(mi6Var);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(a aVar, l38 l38Var) {
        if (aVar.equals(this.c.b(aVar.o)) && (aVar.E0 == null || aVar.D0 == this)) {
            aVar.Z0 = l38Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet e() {
        tp4 tp4Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e) it.next()).c.R0;
            if (viewGroup != null) {
                I();
                Object tag = viewGroup.getTag(c0d.special_effects_controller_view_tag);
                if (tag instanceof tp4) {
                    tp4Var = (tp4) tag;
                } else {
                    tp4Var = new tp4(viewGroup);
                    viewGroup.setTag(c0d.special_effects_controller_view_tag, tp4Var);
                }
                hashSet.add(tp4Var);
            }
        }
        return hashSet;
    }

    public final void e0(a aVar) {
        if (aVar != null) {
            if (!aVar.equals(this.c.b(aVar.o)) || (aVar.E0 != null && aVar.D0 != this)) {
                throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        a aVar2 = this.z;
        this.z = aVar;
        r(aVar2);
        r(this.z);
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        tp4 tp4Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((ue0) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                a aVar = ((aj6) it.next()).b;
                if (aVar != null && (viewGroup = aVar.R0) != null) {
                    I();
                    Object tag = viewGroup.getTag(c0d.special_effects_controller_view_tag);
                    if (tag instanceof tp4) {
                        tp4Var = (tp4) tag;
                    } else {
                        tp4Var = new tp4(viewGroup);
                        viewGroup.setTag(c0d.special_effects_controller_view_tag, tp4Var);
                    }
                    hashSet.add(tp4Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(a aVar) {
        ViewGroup viewGroupG = G(aVar);
        if (viewGroupG != null) {
            bi6 bi6Var = aVar.V0;
            if ((bi6Var == null ? 0 : bi6Var.e) + (bi6Var == null ? 0 : bi6Var.d) + (bi6Var == null ? 0 : bi6Var.c) + (bi6Var == null ? 0 : bi6Var.b) > 0) {
                if (viewGroupG.getTag(c0d.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(c0d.visible_removing_fragment_view_tag, aVar);
                }
                a aVar2 = (a) viewGroupG.getTag(c0d.visible_removing_fragment_view_tag);
                bi6 bi6Var2 = aVar.V0;
                boolean z = bi6Var2 != null ? bi6Var2.a : false;
                if (aVar2.V0 == null) {
                    return;
                }
                aVar2.s().a = z;
            }
        }
    }

    public final e g(a aVar) {
        String str = aVar.o;
        f fVar = this.c;
        e eVar = (e) fVar.b.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this.o, fVar, aVar);
        eVar2.m(this.w.d.getClassLoader());
        eVar2.e = this.v;
        return eVar2;
    }

    public final void h(a aVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + aVar);
        }
        if (aVar.L0) {
            return;
        }
        aVar.L0 = true;
        if (aVar.u0) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + aVar);
            }
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.u0 = false;
            if (L(aVar)) {
                this.G = true;
            }
            f0(aVar);
        }
    }

    public final void h0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            a aVar = eVar.c;
            if (aVar.T0) {
                if (this.b) {
                    this.K = true;
                } else {
                    aVar.T0 = false;
                    eVar.k();
                }
            }
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && this.w != null) {
            i0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.onConfigurationChanged(configuration);
                if (z) {
                    aVar.F0.i(true, configuration);
                }
            }
        }
    }

    public final void i0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new vg8());
        ei6 ei6Var = this.w;
        if (ei6Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ei6Var.Y.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final boolean j() {
        if (this.v >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (!aVar.K0 ? aVar.F0.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.i.f(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.i.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean zK;
        boolean z;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && N(aVar)) {
                if (aVar.K0) {
                    zK = false;
                } else {
                    if (aVar.O0 && aVar.P0) {
                        aVar.N(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zK = z | aVar.F0.k(menu, menuInflater);
                }
                if (zK) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                a aVar2 = (a) this.e.get(i);
                if (arrayList == null || !arrayList.contains(aVar2)) {
                    aVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        z(true);
        w();
        ei6 ei6Var = this.w;
        f fVar = this.c;
        if (ei6Var != null) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            b bVar = ei6Var.d;
            if (bVar != null) {
                zIsChangingConfigurations = true ^ bVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((we0) it.next()).a.iterator();
                while (it2.hasNext()) {
                    fVar.d.g((String) it2.next(), false);
                }
            }
        }
        u(-1);
        ei6 ei6Var2 = this.w;
        if (ei6Var2 != null) {
            ei6Var2.Y.t0.remove(this.r);
        }
        ei6 ei6Var3 = this.w;
        if (ei6Var3 != null) {
            ei6Var3.Y.s0.remove(this.q);
        }
        ei6 ei6Var4 = this.w;
        if (ei6Var4 != null) {
            ei6Var4.Y.v0.remove(this.s);
        }
        ei6 ei6Var5 = this.w;
        if (ei6Var5 != null) {
            ei6Var5.Y.w0.remove(this.t);
        }
        ei6 ei6Var6 = this.w;
        if (ei6Var6 != null && this.y == null) {
            ka5 ka5Var = ei6Var6.Y.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ka5Var.b;
            ki6 ki6Var = this.u;
            copyOnWriteArrayList.remove(ki6Var);
            if (((HashMap) ka5Var.c).remove(ki6Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) ka5Var.a).run();
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.i.e();
            this.g = null;
        }
        u5i u5iVar = this.C;
        if (u5iVar != null) {
            u5iVar.r();
            this.D.r();
            this.E.r();
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            i0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.onLowMemory();
                if (z) {
                    aVar.F0.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            i0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.F0.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.T(aVar.G());
                aVar.F0.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.v >= 1) {
            for (a aVar : this.c.f()) {
                if (aVar != null) {
                    if (!aVar.K0 ? (aVar.O0 && aVar.P0 && aVar.W(menuItem)) ? true : aVar.F0.p(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && !aVar.K0) {
                aVar.F0.q();
            }
        }
    }

    public final void r(a aVar) {
        if (aVar != null) {
            if (aVar.equals(this.c.b(aVar.o))) {
                aVar.D0.getClass();
                boolean zO = O(aVar);
                Boolean bool = aVar.t0;
                if (bool == null || bool.booleanValue() != zO) {
                    aVar.t0 = Boolean.valueOf(zO);
                    ti6 ti6Var = aVar.F0;
                    ti6Var.j0();
                    ti6Var.r(ti6Var.z);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            i0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z) {
                aVar.F0.s(true);
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean zT;
        boolean z;
        if (this.v < 1) {
            return false;
        }
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && N(aVar)) {
                if (aVar.K0) {
                    zT = false;
                } else {
                    if (aVar.O0 && aVar.P0) {
                        aVar.Y(menu);
                        z = true;
                    } else {
                        z = false;
                    }
                    zT = aVar.F0.t(menu) | z;
                }
                if (zT) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.y;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            ei6 ei6Var = this.w;
            if (ei6Var != null) {
                sb.append(ei6Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (e eVar : this.c.b.values()) {
                if (eVar != null) {
                    eVar.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((tp4) it.next()).h();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strI = az1.i(str, "    ");
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        String strI2 = az1.i(str, "    ");
        HashMap map = fVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar : map.values()) {
                printWriter.print(str);
                if (eVar != null) {
                    a aVar = eVar.c;
                    printWriter.println(aVar);
                    aVar.getClass();
                    printWriter.print(strI2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(aVar.H0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(aVar.I0));
                    printWriter.print(" mTag=");
                    printWriter.println(aVar.J0);
                    printWriter.print(strI2);
                    printWriter.print("mState=");
                    printWriter.print(aVar.a);
                    printWriter.print(" mWho=");
                    printWriter.print(aVar.o);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(aVar.C0);
                    printWriter.print(strI2);
                    printWriter.print("mAdded=");
                    printWriter.print(aVar.u0);
                    printWriter.print(" mRemoving=");
                    printWriter.print(aVar.v0);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(aVar.x0);
                    printWriter.print(" mInLayout=");
                    printWriter.println(aVar.y0);
                    printWriter.print(strI2);
                    printWriter.print("mHidden=");
                    printWriter.print(aVar.K0);
                    printWriter.print(" mDetached=");
                    printWriter.print(aVar.L0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(aVar.P0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(aVar.O0);
                    printWriter.print(strI2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(aVar.M0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(aVar.U0);
                    if (aVar.D0 != null) {
                        printWriter.print(strI2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(aVar.D0);
                    }
                    if (aVar.E0 != null) {
                        printWriter.print(strI2);
                        printWriter.print("mHost=");
                        printWriter.println(aVar.E0);
                    }
                    if (aVar.G0 != null) {
                        printWriter.print(strI2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(aVar.G0);
                    }
                    if (aVar.X != null) {
                        printWriter.print(strI2);
                        printWriter.print("mArguments=");
                        printWriter.println(aVar.X);
                    }
                    if (aVar.b != null) {
                        printWriter.print(strI2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(aVar.b);
                    }
                    if (aVar.c != null) {
                        printWriter.print(strI2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(aVar.c);
                    }
                    if (aVar.d != null) {
                        printWriter.print(strI2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(aVar.d);
                    }
                    Object objZ = aVar.z(false);
                    if (objZ != null) {
                        printWriter.print(strI2);
                        printWriter.print("mTarget=");
                        printWriter.print(objZ);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(aVar.s0);
                    }
                    printWriter.print(strI2);
                    printWriter.print("mPopDirection=");
                    bi6 bi6Var = aVar.V0;
                    printWriter.println(bi6Var == null ? false : bi6Var.a);
                    bi6 bi6Var2 = aVar.V0;
                    if ((bi6Var2 == null ? 0 : bi6Var2.b) != 0) {
                        printWriter.print(strI2);
                        printWriter.print("getEnterAnim=");
                        bi6 bi6Var3 = aVar.V0;
                        printWriter.println(bi6Var3 == null ? 0 : bi6Var3.b);
                    }
                    bi6 bi6Var4 = aVar.V0;
                    if ((bi6Var4 == null ? 0 : bi6Var4.c) != 0) {
                        printWriter.print(strI2);
                        printWriter.print("getExitAnim=");
                        bi6 bi6Var5 = aVar.V0;
                        printWriter.println(bi6Var5 == null ? 0 : bi6Var5.c);
                    }
                    bi6 bi6Var6 = aVar.V0;
                    if ((bi6Var6 == null ? 0 : bi6Var6.d) != 0) {
                        printWriter.print(strI2);
                        printWriter.print("getPopEnterAnim=");
                        bi6 bi6Var7 = aVar.V0;
                        printWriter.println(bi6Var7 == null ? 0 : bi6Var7.d);
                    }
                    bi6 bi6Var8 = aVar.V0;
                    if ((bi6Var8 == null ? 0 : bi6Var8.e) != 0) {
                        printWriter.print(strI2);
                        printWriter.print("getPopExitAnim=");
                        bi6 bi6Var9 = aVar.V0;
                        printWriter.println(bi6Var9 != null ? bi6Var9.e : 0);
                    }
                    if (aVar.R0 != null) {
                        printWriter.print(strI2);
                        printWriter.print("mContainer=");
                        printWriter.println(aVar.R0);
                    }
                    if (aVar.S0 != null) {
                        printWriter.print(strI2);
                        printWriter.print("mView=");
                        printWriter.println(aVar.S0);
                    }
                    if (aVar.v() != null) {
                        new androidx.loader.app.b(aVar, aVar.h()).a(strI2, printWriter);
                    }
                    printWriter.print(strI2);
                    printWriter.println("Child " + aVar.F0 + ":");
                    aVar.F0.v(az1.i(strI2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                a aVar2 = (a) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(aVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                a aVar3 = (a) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                ue0 ue0Var = (ue0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ue0Var.toString());
                ue0Var.g(strI, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (qi6) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((tp4) it.next()).h();
        }
    }

    public final void x(qi6 qi6Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(qi6Var);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.w.o.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean zA;
        y(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((qi6) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        j0();
        if (this.K) {
            this.K = false;
            h0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }
}
