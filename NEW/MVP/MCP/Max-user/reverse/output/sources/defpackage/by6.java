package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* loaded from: classes.dex */
public final class by6 {
    public final boolean a;
    public sa9 d;
    public sa9 f;
    public sa9 h;
    public int[] j;
    public int[] l;
    public zx6[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ ContextMenuGridLayout x;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final fy6 v = new fy6(0);
    public final fy6 w = new fy6(-100000);

    public by6(ContextMenuGridLayout contextMenuGridLayout, boolean z) {
        this.x = contextMenuGridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, dy6 dy6Var, fy6 fy6Var, boolean z) {
        if (dy6Var.a() == 0) {
            return;
        }
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((zx6) it.next()).a.equals(dy6Var)) {
                    return;
                }
            }
        }
        arrayList.add(new zx6(dy6Var, fy6Var));
    }

    public static boolean n(int[] iArr, zx6 zx6Var) {
        if (!zx6Var.c) {
            return false;
        }
        dy6 dy6Var = zx6Var.a;
        int i = dy6Var.a;
        int i2 = dy6Var.b;
        int i3 = iArr[i] + zx6Var.b.a;
        if (i3 <= iArr[i2]) {
            return false;
        }
        iArr[i2] = i3;
        return true;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb;
        String str = this.a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            zx6 zx6Var = (zx6) it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            dy6 dy6Var = zx6Var.a;
            int i = dy6Var.a;
            int i2 = dy6Var.b;
            int i3 = zx6Var.b.a;
            if (i < i2) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i2);
                sb.append("-");
                sb.append(str);
                sb.append(i);
                sb.append(">=");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append("-");
                sb.append(str);
                sb.append(i2);
                sb.append("<=");
                i3 = -i3;
            }
            sb.append(i3);
            sb2.append(sb.toString());
        }
        return sb2.toString();
    }

    public final void b(sa9 sa9Var, boolean z) {
        for (fy6 fy6Var : (fy6[]) ((Object[]) sa9Var.c)) {
            fy6Var.a = Integer.MIN_VALUE;
        }
        cy6[] cy6VarArr = (cy6[]) ((Object[]) g().c);
        for (int i = 0; i < cy6VarArr.length; i++) {
            int iD = cy6VarArr[i].d(z);
            fy6 fy6Var2 = (fy6) ((Object[]) sa9Var.c)[((int[]) sa9Var.a)[i]];
            int i2 = fy6Var2.a;
            if (!z) {
                iD = -iD;
            }
            fy6Var2.a = Math.max(i2, iD);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        ContextMenuGridLayout contextMenuGridLayout = this.x;
        int childCount = contextMenuGridLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contextMenuGridLayout.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ey6 ey6Var = (ey6) childAt.getLayoutParams();
                boolean z2 = this.a;
                dy6 dy6Var = (z2 ? ey6Var.b : ey6Var.a).b;
                int i2 = z ? dy6Var.a : dy6Var.b;
                iArr[i2] = Math.max(iArr[i2], contextMenuGridLayout.f(childAt, z2, z));
            }
        }
    }

    public final sa9 d(boolean z) {
        dy6 dy6Var;
        ay6 ay6Var = new ay6(dy6.class, fy6.class);
        gy6[] gy6VarArr = (gy6[]) ((Object[]) g().b);
        int length = gy6VarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                dy6Var = gy6VarArr[i].b;
            } else {
                dy6 dy6Var2 = gy6VarArr[i].b;
                dy6Var = new dy6(dy6Var2.b, dy6Var2.a);
            }
            fy6 fy6Var = new fy6();
            fy6Var.a = Integer.MIN_VALUE;
            ay6Var.add(Pair.create(dy6Var, fy6Var));
        }
        return ay6Var.a();
    }

    public final zx6[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            sa9 sa9Var = this.f;
            int i = 0;
            while (true) {
                dy6[] dy6VarArr = (dy6[]) ((Object[]) sa9Var.b);
                if (i >= dy6VarArr.length) {
                    break;
                }
                k(arrayList, dy6VarArr[i], ((fy6[]) ((Object[]) sa9Var.c))[i], false);
                i++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            sa9 sa9Var2 = this.h;
            int i2 = 0;
            while (true) {
                dy6[] dy6VarArr2 = (dy6[]) ((Object[]) sa9Var2.b);
                if (i2 >= dy6VarArr2.length) {
                    break;
                }
                k(arrayList2, dy6VarArr2[i2], ((fy6[]) ((Object[]) sa9Var2.c))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < f()) {
                    int i4 = i3 + 1;
                    k(arrayList, new dy6(i3, i4), new fy6(0), true);
                    i3 = i4;
                }
            }
            int iF = f();
            k(arrayList, new dy6(0, iF), this.v, false);
            k(arrayList2, new dy6(iF, 0), this.w, false);
            zx6[] zx6VarArrR = r(arrayList);
            zx6[] zx6VarArrR2 = r(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zx6[].class.getComponentType(), zx6VarArrR.length + zx6VarArrR2.length);
            System.arraycopy(zx6VarArrR, 0, objArr, 0, zx6VarArrR.length);
            System.arraycopy(zx6VarArrR2, 0, objArr, zx6VarArrR.length, zx6VarArrR2.length);
            this.n = (zx6[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final sa9 g() {
        int iE;
        int i;
        sa9 sa9Var = this.d;
        boolean z = this.a;
        ContextMenuGridLayout contextMenuGridLayout = this.x;
        if (sa9Var == null) {
            ay6 ay6Var = new ay6(gy6.class, cy6.class);
            int childCount = contextMenuGridLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ey6 ey6Var = (ey6) contextMenuGridLayout.getChildAt(i2).getLayoutParams();
                gy6 gy6Var = z ? ey6Var.b : ey6Var.a;
                ay6Var.add(Pair.create(gy6Var, gy6Var.a(z).b()));
            }
            this.d = ay6Var.a();
        }
        if (!this.e) {
            for (cy6 cy6Var : (cy6[]) ((Object[]) this.d.c)) {
                cy6Var.c();
            }
            int childCount2 = contextMenuGridLayout.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt = contextMenuGridLayout.getChildAt(i3);
                ey6 ey6Var2 = (ey6) childAt.getLayoutParams();
                gy6 gy6Var2 = z ? ey6Var2.b : ey6Var2.a;
                if (childAt.getVisibility() == 8) {
                    iE = 0;
                } else {
                    iE = contextMenuGridLayout.e(childAt, z, false) + contextMenuGridLayout.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (gy6Var2.d == 0.0f) {
                    i = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[contextMenuGridLayout.getChildCount()];
                    }
                    i = this.t[i3];
                }
                int i4 = iE + i;
                sa9 sa9Var2 = this.d;
                cy6 cy6Var2 = (cy6) ((Object[]) sa9Var2.c)[((int[]) sa9Var2.a)[i3]];
                cy6Var2.c = ((gy6Var2.c == hy6.E0 && gy6Var2.d == 0.0f) ? 0 : 2) & cy6Var2.c;
                int iA = gy6Var2.a(z).a(childAt, i4, contextMenuGridLayout.getLayoutMode());
                cy6Var2.b(iA, i4 - iA);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[f() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            ContextMenuGridLayout contextMenuGridLayout = this.x;
            float f = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = contextMenuGridLayout.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = contextMenuGridLayout.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        ey6 ey6Var = (ey6) childAt.getLayoutParams();
                        if ((z3 ? ey6Var.b : ey6Var.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.r = z;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[contextMenuGridLayout.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (contextMenuGridLayout.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = contextMenuGridLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        View childAt2 = contextMenuGridLayout.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            ey6 ey6Var2 = (ey6) childAt2.getLayoutParams();
                            f += (z3 ? ey6Var2.b : ey6Var2.a).d;
                        }
                    }
                    int i3 = -1;
                    boolean z4 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        int i5 = (int) ((i4 + childCount2) / 2);
                        m();
                        p(i5, f);
                        boolean zQ = q(e(), iArr, false);
                        if (zQ) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z4 = zQ;
                    }
                    if (i3 > 0 && !z4) {
                        m();
                        p(i3, f);
                        q(e(), iArr, true);
                    }
                }
            } else {
                q(e(), iArr, true);
            }
            if (!this.u) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        if (this.c == Integer.MIN_VALUE) {
            ContextMenuGridLayout contextMenuGridLayout = this.x;
            int childCount = contextMenuGridLayout.getChildCount();
            int iMax = -1;
            for (int i = 0; i < childCount; i++) {
                ey6 ey6Var = (ey6) contextMenuGridLayout.getChildAt(i).getLayoutParams();
                dy6 dy6Var = (this.a ? ey6Var.b : ey6Var.a).b;
                iMax = Math.max(Math.max(Math.max(iMax, dy6Var.a), dy6Var.b), dy6Var.a());
            }
            this.c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        }
        return this.c;
    }

    public final int j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            this.v.a = 0;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        }
        if (mode == 0) {
            this.v.a = 0;
            this.w.a = -100000;
            this.q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        this.v.a = size;
        this.w.a = -size;
        this.q = false;
        return h()[f()];
    }

    public final void l() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i) {
        if (i == Integer.MIN_VALUE || i >= i()) {
            this.b = i;
        } else {
            hy6.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(int i, float f) {
        Arrays.fill(this.t, 0);
        ContextMenuGridLayout contextMenuGridLayout = this.x;
        int childCount = contextMenuGridLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = contextMenuGridLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ey6 ey6Var = (ey6) childAt.getLayoutParams();
                float f2 = (this.a ? ey6Var.b : ey6Var.a).d;
                if (f2 != 0.0f) {
                    int iRound = Math.round((i * f2) / f);
                    this.t[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(defpackage.zx6[] r13, int[] r14, boolean r15) {
        /*
            r12 = this;
            boolean r0 = r12.a
            if (r0 == 0) goto L7
            java.lang.String r0 = "horizontal"
            goto L9
        L7:
            java.lang.String r0 = "vertical"
        L9:
            int r1 = r12.f()
            r2 = 1
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
            r5 = r3
        L12:
            int r6 = r13.length
            if (r5 >= r6) goto Lb9
            java.util.Arrays.fill(r14, r3)
            r6 = r3
        L19:
            if (r6 >= r1) goto L7b
            int r7 = r13.length
            r8 = r3
            r9 = r8
        L1e:
            if (r8 >= r7) goto L2a
            r10 = r13[r8]
            boolean r10 = n(r14, r10)
            r9 = r9 | r10
            int r8 = r8 + 1
            goto L1e
        L2a:
            if (r9 != 0) goto L78
            if (r4 == 0) goto Lb9
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L38:
            int r1 = r13.length
            if (r3 >= r1) goto L4e
            r1 = r13[r3]
            boolean r5 = r4[r3]
            if (r5 == 0) goto L44
            r14.add(r1)
        L44:
            boolean r5 = r1.c
            if (r5 != 0) goto L4b
            r15.add(r1)
        L4b:
            int r3 = r3 + 1
            goto L38
        L4e:
            ru.ok.messages.views.widgets.ContextMenuGridLayout r13 = r12.x
            android.util.Printer r13 = r13.u0
            java.lang.String r1 = " constraints: "
            java.lang.StringBuilder r0 = defpackage.ho7.o(r0, r1)
            java.lang.String r14 = r12.a(r14)
            r0.append(r14)
            java.lang.String r14 = " are inconsistent; permanently removing: "
            r0.append(r14)
            java.lang.String r14 = r12.a(r15)
            r0.append(r14)
            java.lang.String r14 = ". "
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.println(r14)
            return r2
        L78:
            int r6 = r6 + 1
            goto L19
        L7b:
            if (r15 != 0) goto L7e
            return r3
        L7e:
            int r6 = r13.length
            boolean[] r6 = new boolean[r6]
            r7 = r3
        L82:
            if (r7 >= r1) goto L99
            int r8 = r13.length
            r9 = r3
        L86:
            if (r9 >= r8) goto L96
            boolean r10 = r6[r9]
            r11 = r13[r9]
            boolean r11 = n(r14, r11)
            r10 = r10 | r11
            r6[r9] = r10
            int r9 = r9 + 1
            goto L86
        L96:
            int r7 = r7 + 1
            goto L82
        L99:
            if (r5 != 0) goto L9c
            r4 = r6
        L9c:
            r7 = r3
        L9d:
            int r8 = r13.length
            if (r7 >= r8) goto Lb5
            boolean r8 = r6[r7]
            if (r8 == 0) goto Lb2
            r8 = r13[r7]
            dy6 r9 = r8.a
            int r10 = r9.a
            int r9 = r9.b
            if (r10 >= r9) goto Laf
            goto Lb2
        Laf:
            r8.c = r3
            goto Lb5
        Lb2:
            int r7 = r7 + 1
            goto L9d
        Lb5:
            int r5 = r5 + 1
            goto L12
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by6.q(zx6[], int[], boolean):boolean");
    }

    public final zx6[] r(ArrayList arrayList) {
        ggg gggVar = new ggg(this, (zx6[]) arrayList.toArray(new zx6[arrayList.size()]));
        int length = ((zx6[][]) gggVar.o).length;
        for (int i = 0; i < length; i++) {
            gggVar.i0(i);
        }
        return (zx6[]) gggVar.d;
    }
}
