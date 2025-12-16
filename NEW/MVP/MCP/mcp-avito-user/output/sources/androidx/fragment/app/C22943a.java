package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22943a extends H implements FragmentManager.k, FragmentManager.q {

    /* renamed from: q, reason: collision with root package name */
    public final FragmentManager f46526q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f46527r;

    /* renamed from: s, reason: collision with root package name */
    public int f46528s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f46529t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22943a(@j.N FragmentManager fragmentManager) {
        super(0);
        fragmentManager.O();
        r<?> rVar = fragmentManager.f46384v;
        if (rVar != null) {
            rVar.f46584c.getClassLoader();
        }
        this.f46528s = -1;
        this.f46529t = false;
        this.f46526q = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public final boolean a(@j.N ArrayList<C22943a> arrayList, @j.N ArrayList<Boolean> arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f46448g) {
            return true;
        }
        FragmentManager fragmentManager = this.f46526q;
        if (fragmentManager.f46366d == null) {
            fragmentManager.f46366d = new ArrayList<>();
        }
        fragmentManager.f46366d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.H
    public final int e() {
        return t(false);
    }

    @Override // androidx.fragment.app.H
    public final int f() {
        return t(true);
    }

    @Override // androidx.fragment.app.H
    public final void g() {
        if (this.f46448g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f46449h = false;
        this.f46526q.C(this, false);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public final int getId() {
        return this.f46528s;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @j.P
    public final String getName() {
        return this.f46450i;
    }

    @Override // androidx.fragment.app.H
    public final void h() {
        if (this.f46448g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f46449h = false;
        this.f46526q.C(this, true);
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void i(@j.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f46526q) {
            super.i(fragment);
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.H
    public final void j(int i12, Fragment fragment, @j.P String str, int i13) {
        super.j(i12, fragment, str, i13);
        fragment.mFragmentManager = this.f46526q;
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void k(@j.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f46526q) {
            super.k(fragment);
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.H
    public final boolean l() {
        return this.f46442a.isEmpty();
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void m(@j.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f46526q) {
            super.m(fragment);
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void p(@j.N Fragment fragment, @j.N Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f46526q;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (state == Lifecycle.State.f46680c && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.f46679b) {
            super.p(fragment, state);
            return;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void q(@j.P Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f46526q) {
            super.q(fragment);
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.H
    @j.N
    public final void r(@j.N Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f46526q) {
            super.r(fragment);
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void s(int i12) {
        if (this.f46448g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList<H.a> arrayList = this.f46442a;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                H.a aVar = arrayList.get(i13);
                Fragment fragment = aVar.f46459b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i12;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar.f46459b);
                        int i14 = aVar.f46459b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final int t(boolean z12) {
        if (this.f46527r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new l0());
            u("  ", printWriter, true);
            printWriter.close();
        }
        this.f46527r = true;
        boolean z13 = this.f46448g;
        FragmentManager fragmentManager = this.f46526q;
        if (z13) {
            this.f46528s = fragmentManager.f46371i.getAndIncrement();
        } else {
            this.f46528s = -1;
        }
        fragmentManager.z(this, z12);
        return this.f46528s;
    }

    public final String toString() {
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(128, "BackStackEntry{");
        sbQ.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f46528s >= 0) {
            sbQ.append(" #");
            sbQ.append(this.f46528s);
        }
        if (this.f46450i != null) {
            sbQ.append(" ");
            sbQ.append(this.f46450i);
        }
        sbQ.append("}");
        return sbQ.toString();
    }

    public final void u(String str, PrintWriter printWriter, boolean z12) {
        String str2;
        if (z12) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f46450i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f46528s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f46527r);
            if (this.f46447f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f46447f));
            }
            if (this.f46443b != 0 || this.f46444c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f46443b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f46444c));
            }
            if (this.f46445d != 0 || this.f46446e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f46445d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f46446e));
            }
            if (this.f46451j != 0 || this.f46452k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f46451j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f46452k);
            }
            if (this.f46453l != 0 || this.f46454m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f46453l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f46454m);
            }
        }
        ArrayList<H.a> arrayList = this.f46442a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            H.a aVar = arrayList.get(i12);
            switch (aVar.f46458a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f46458a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i12);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f46459b);
            if (z12) {
                if (aVar.f46461d != 0 || aVar.f46462e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f46461d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f46462e));
                }
                if (aVar.f46463f != 0 || aVar.f46464g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f46463f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f46464g));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22943a(@j.N C22943a c22943a) {
        super(0);
        c22943a.f46526q.O();
        r<?> rVar = c22943a.f46526q.f46384v;
        if (rVar != null) {
            rVar.f46584c.getClassLoader();
        }
        Iterator<H.a> it = c22943a.f46442a.iterator();
        while (it.hasNext()) {
            H.a next = it.next();
            ArrayList<H.a> arrayList = this.f46442a;
            H.a aVar = new H.a();
            aVar.f46458a = next.f46458a;
            aVar.f46459b = next.f46459b;
            aVar.f46460c = next.f46460c;
            aVar.f46461d = next.f46461d;
            aVar.f46462e = next.f46462e;
            aVar.f46463f = next.f46463f;
            aVar.f46464g = next.f46464g;
            aVar.f46465h = next.f46465h;
            aVar.f46466i = next.f46466i;
            arrayList.add(aVar);
        }
        this.f46443b = c22943a.f46443b;
        this.f46444c = c22943a.f46444c;
        this.f46445d = c22943a.f46445d;
        this.f46446e = c22943a.f46446e;
        this.f46447f = c22943a.f46447f;
        this.f46448g = c22943a.f46448g;
        this.f46449h = c22943a.f46449h;
        this.f46450i = c22943a.f46450i;
        this.f46453l = c22943a.f46453l;
        this.f46454m = c22943a.f46454m;
        this.f46451j = c22943a.f46451j;
        this.f46452k = c22943a.f46452k;
        if (c22943a.f46455n != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f46455n = arrayList2;
            arrayList2.addAll(c22943a.f46455n);
        }
        if (c22943a.f46456o != null) {
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f46456o = arrayList3;
            arrayList3.addAll(c22943a.f46456o);
        }
        this.f46457p = c22943a.f46457p;
        this.f46528s = -1;
        this.f46529t = false;
        this.f46526q = c22943a.f46526q;
        this.f46527r = c22943a.f46527r;
        this.f46528s = c22943a.f46528s;
        this.f46529t = c22943a.f46529t;
    }
}
