package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ue0 implements qi6 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final c q;
    public boolean r;
    public int s;

    public ue0(c cVar) {
        cVar.H();
        ei6 ei6Var = cVar.w;
        if (ei6Var != null) {
            ei6Var.d.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = cVar;
    }

    @Override // defpackage.qi6
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (c.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(aj6 aj6Var) {
        this.a.add(aj6Var);
        aj6Var.d = this.b;
        aj6Var.e = this.c;
        aj6Var.f = this.d;
        aj6Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (c.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                aj6 aj6Var = (aj6) arrayList.get(i2);
                a aVar = aj6Var.b;
                if (aVar != null) {
                    aVar.C0 += i;
                    if (c.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aj6Var.b + " to " + aj6Var.b.C0);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new vg8());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        c cVar = this.q;
        if (z2) {
            this.s = cVar.j.getAndIncrement();
        } else {
            this.s = -1;
        }
        cVar.x(this, z);
        return this.s;
    }

    public final void e() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.q.A(this, false);
    }

    public final void f(int i, a aVar, String str, int i2) {
        String str2 = aVar.Y0;
        if (str2 != null) {
            zi6.c(aVar, str2);
        }
        Class<?> cls = aVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = aVar.J0;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(aVar);
                sb.append(": was ");
                throw new IllegalStateException(ctd.j(sb, aVar.J0, " now ", str));
            }
            aVar.J0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + aVar + " with tag " + str + " to container view with no id");
            }
            int i3 = aVar.H0;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + aVar + ": was " + aVar.H0 + " now " + i);
            }
            aVar.H0 = i;
            aVar.I0 = i;
        }
        b(new aj6(i2, aVar));
        aVar.D0 = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aj6 aj6Var = (aj6) arrayList.get(i);
            switch (aj6Var.a) {
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
                    str2 = "cmd=" + aj6Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aj6Var.b);
            if (z) {
                if (aj6Var.d != 0 || aj6Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aj6Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aj6Var.e));
                }
                if (aj6Var.f != 0 || aj6Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aj6Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aj6Var.g));
                }
            }
        }
    }

    public final void h(a aVar) {
        c cVar = aVar.D0;
        if (cVar == null || cVar == this.q) {
            b(new aj6(3, aVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void i(a aVar, l38 l38Var) {
        c cVar = aVar.D0;
        c cVar2 = this.q;
        if (cVar != cVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + cVar2);
        }
        if (l38Var == l38.b && aVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + l38Var + " after the Fragment has been created");
        }
        if (l38Var == l38.a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + l38Var + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        aj6 aj6Var = new aj6();
        aj6Var.a = 10;
        aj6Var.b = aVar;
        aj6Var.c = false;
        aj6Var.h = aVar.Z0;
        aj6Var.i = l38Var;
        b(aj6Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
