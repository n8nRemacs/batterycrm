package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aw7;
import defpackage.c58;
import defpackage.did;
import defpackage.hid;
import defpackage.ho7;
import defpackage.iid;
import defpackage.j9j;
import defpackage.nm5;
import defpackage.w93;
import defpackage.whd;
import defpackage.x48;
import defpackage.xhd;
import defpackage.y48;
import defpackage.z48;

/* loaded from: classes.dex */
public class LinearLayoutManager extends a implements hid {
    public final nm5 A;
    public final x48 B;
    public int C;
    public final int[] D;
    public int p;
    public y48 q;
    public aw7 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public z48 z;

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.a
    public int A0(int i, did didVar, iid iidVar) {
        if (this.p == 0) {
            return 0;
        }
        return n1(i, didVar, iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean H0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iX = x();
            for (int i = 0; i < iX; i++) {
                ViewGroup.LayoutParams layoutParams = w(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.a
    public void J0(RecyclerView recyclerView, int i) {
        c58 c58Var = new c58(recyclerView.getContext());
        c58Var.a = i;
        K0(c58Var);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean L0() {
        return this.z == null && this.s == this.v;
    }

    public void M0(iid iidVar, int[] iArr) {
        int i;
        int iN = iidVar.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void N0(iid iidVar, y48 y48Var, w93 w93Var) {
        int i = y48Var.d;
        if (i < 0 || i >= iidVar.b()) {
            return;
        }
        w93Var.b(i, Math.max(0, y48Var.g));
    }

    public final int O0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        aw7 aw7Var = this.r;
        boolean z = !this.w;
        return j9j.a(iidVar, aw7Var, W0(z), V0(z), this, this.w);
    }

    public final int P0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        aw7 aw7Var = this.r;
        boolean z = !this.w;
        return j9j.b(iidVar, aw7Var, W0(z), V0(z), this, this.w, this.u);
    }

    public final int Q0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        aw7 aw7Var = this.r;
        boolean z = !this.w;
        return j9j.c(iidVar, aw7Var, W0(z), V0(z), this, this.w);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R() {
        return true;
    }

    public final int R0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && h1()) ? -1 : 1 : (this.p != 1 && h1()) ? 1 : -1;
    }

    public final void S0() {
        if (this.q == null) {
            y48 y48Var = new y48();
            y48Var.a = true;
            y48Var.h = 0;
            y48Var.i = 0;
            y48Var.k = null;
            this.q = y48Var;
        }
    }

    public final int T0(did didVar, y48 y48Var, iid iidVar, boolean z) {
        int i;
        int i2 = y48Var.c;
        int i3 = y48Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                y48Var.g = i3 + i2;
            }
            k1(didVar, y48Var);
        }
        int i4 = y48Var.c + y48Var.h;
        while (true) {
            if ((!y48Var.l && i4 <= 0) || (i = y48Var.d) < 0 || i >= iidVar.b()) {
                break;
            }
            x48 x48Var = this.B;
            x48Var.a = 0;
            x48Var.b = false;
            x48Var.c = false;
            x48Var.d = false;
            i1(didVar, iidVar, y48Var, x48Var);
            if (!x48Var.b) {
                int i5 = y48Var.b;
                int i6 = x48Var.a;
                y48Var.b = (y48Var.f * i6) + i5;
                if (!x48Var.c || y48Var.k != null || !iidVar.h) {
                    y48Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = y48Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    y48Var.g = i8;
                    int i9 = y48Var.c;
                    if (i9 < 0) {
                        y48Var.g = i8 + i9;
                    }
                    k1(didVar, y48Var);
                }
                if (z && x48Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - y48Var.c;
    }

    public final int U0() {
        View viewB1 = b1(0, x(), true, false);
        if (viewB1 == null) {
            return -1;
        }
        return a.N(viewB1);
    }

    public final View V0(boolean z) {
        return this.u ? b1(0, x(), z, true) : b1(x() - 1, -1, z, true);
    }

    public final View W0(boolean z) {
        return this.u ? b1(x() - 1, -1, z, true) : b1(0, x(), z, true);
    }

    public final int X0() {
        View viewB1 = b1(0, x(), false, true);
        if (viewB1 == null) {
            return -1;
        }
        return a.N(viewB1);
    }

    public final int Y0() {
        View viewB1 = b1(x() - 1, -1, true, false);
        if (viewB1 == null) {
            return -1;
        }
        return a.N(viewB1);
    }

    @Override // androidx.recyclerview.widget.a
    public void Z(RecyclerView recyclerView) {
    }

    public final int Z0() {
        View viewB1 = b1(x() - 1, -1, false, true);
        if (viewB1 == null) {
            return -1;
        }
        return a.N(viewB1);
    }

    @Override // defpackage.hid
    public final PointF a(int i) {
        if (x() == 0) {
            return null;
        }
        int i2 = (i < a.N(w(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.a
    public View a0(View view, int i, did didVar, iid iidVar) {
        int iR0;
        m1();
        if (x() != 0 && (iR0 = R0(i)) != Integer.MIN_VALUE) {
            S0();
            r1(iR0, (int) (this.r.n() * 0.33333334f), false, iidVar);
            y48 y48Var = this.q;
            y48Var.g = Integer.MIN_VALUE;
            y48Var.a = false;
            T0(didVar, y48Var, iidVar, true);
            View viewA1 = iR0 == -1 ? this.u ? a1(x() - 1, -1) : a1(0, x()) : this.u ? a1(0, x()) : a1(x() - 1, -1);
            View viewG1 = iR0 == -1 ? g1() : f1();
            if (!viewG1.hasFocusable()) {
                return viewA1;
            }
            if (viewA1 != null) {
                return viewG1;
            }
        }
        return null;
    }

    public final View a1(int i, int i2) {
        int i3;
        int i4;
        S0();
        if (i2 <= i && i2 >= i) {
            return w(i);
        }
        if (this.r.f(w(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.t(i, i2, i3, i4) : this.d.t(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(X0());
            accessibilityEvent.setToIndex(Z0());
        }
    }

    public final View b1(int i, int i2, boolean z, boolean z2) {
        S0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.t(i, i2, i3, i4) : this.d.t(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View c1(defpackage.did r17, defpackage.iid r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.S0()
            int r1 = r0.x()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.x()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            aw7 r7 = r0.r
            int r7 = r7.m()
            aw7 r8 = r0.r
            int r8 = r8.h()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.w(r1)
            int r13 = androidx.recyclerview.widget.a.N(r12)
            aw7 r14 = r0.r
            int r14 = r14.f(r12)
            aw7 r15 = r0.r
            int r15 = r15.c(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            xhd r13 = (defpackage.xhd) r13
            mid r13 = r13.a
            boolean r13 = r13.q()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c1(did, iid, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void d(String str) {
        if (this.z == null) {
            super.d(str);
        }
    }

    public final int d1(int i, did didVar, iid iidVar, boolean z) {
        int iH;
        int iH2 = this.r.h() - i;
        if (iH2 <= 0) {
            return 0;
        }
        int i2 = -n1(-iH2, didVar, iidVar);
        int i3 = i + i2;
        if (!z || (iH = this.r.h() - i3) <= 0) {
            return i2;
        }
        this.r.r(iH);
        return iH + i2;
    }

    public final int e1(int i, did didVar, iid iidVar, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -n1(iM2, didVar, iidVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.r(-iM);
        return i2 - iM;
    }

    @Override // androidx.recyclerview.widget.a
    public boolean f() {
        return this.p == 0;
    }

    public final View f1() {
        return w(this.u ? 0 : x() - 1);
    }

    @Override // androidx.recyclerview.widget.a
    public boolean g() {
        return this.p == 1;
    }

    public final View g1() {
        return w(this.u ? x() - 1 : 0);
    }

    public final boolean h1() {
        return I() == 1;
    }

    public void i1(did didVar, iid iidVar, y48 y48Var, x48 x48Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iK;
        int iE;
        int i5;
        int i6;
        View viewB = y48Var.b(didVar);
        if (viewB == null) {
            x48Var.b = true;
            return;
        }
        xhd xhdVar = (xhd) viewB.getLayoutParams();
        if (y48Var.k == null) {
            if (this.u == (y48Var.f == -1)) {
                b(viewB);
            } else {
                c(0, viewB, false);
            }
        } else {
            if (this.u == (y48Var.f == -1)) {
                c(-1, viewB, true);
            } else {
                c(0, viewB, true);
            }
        }
        U(viewB);
        x48Var.a = this.r.d(viewB);
        if (this.p == 1) {
            if (h1()) {
                iE = this.n - L();
                iK = iE - this.r.e(viewB);
            } else {
                iK = K();
                iE = this.r.e(viewB) + iK;
            }
            if (y48Var.f == -1) {
                i6 = y48Var.b;
                i5 = i6 - x48Var.a;
            } else {
                i5 = y48Var.b;
                i6 = x48Var.a + i5;
            }
            int i7 = iK;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iE;
        } else {
            int iM = M();
            int iE2 = this.r.e(viewB) + iM;
            if (y48Var.f == -1) {
                int i8 = y48Var.b;
                i3 = i8 - x48Var.a;
                i = i8;
                i2 = iE2;
            } else {
                int i9 = y48Var.b;
                i = x48Var.a + i9;
                i2 = iE2;
                i3 = i9;
            }
            i4 = iM;
        }
        T(viewB, i3, i4, i, i2);
        if (xhdVar.a.q() || xhdVar.a.t()) {
            x48Var.c = true;
        }
        x48Var.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i, int i2, iid iidVar, w93 w93Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        S0();
        r1(i > 0 ? 1 : -1, Math.abs(i), true, iidVar);
        N0(iidVar, this.q, w93Var);
    }

    public void j1(did didVar, iid iidVar, nm5 nm5Var, int i) {
    }

    @Override // androidx.recyclerview.widget.a
    public final void k(int i, w93 w93Var) {
        boolean z;
        int i2;
        z48 z48Var = this.z;
        if (z48Var == null || (i2 = z48Var.a) < 0) {
            m1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = z48Var.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            w93Var.b(i2, 0);
            i2 += i3;
        }
    }

    public final void k1(did didVar, y48 y48Var) {
        if (!y48Var.a || y48Var.l) {
            return;
        }
        int i = y48Var.g;
        int i2 = y48Var.i;
        if (y48Var.f == -1) {
            int iX = x();
            if (i < 0) {
                return;
            }
            int iG = (this.r.g() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iX; i3++) {
                    View viewW = w(i3);
                    if (this.r.f(viewW) < iG || this.r.q(viewW) < iG) {
                        l1(didVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iX - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewW2 = w(i5);
                if (this.r.f(viewW2) < iG || this.r.q(viewW2) < iG) {
                    l1(didVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iX2 = x();
        if (!this.u) {
            for (int i7 = 0; i7 < iX2; i7++) {
                View viewW3 = w(i7);
                if (this.r.c(viewW3) > i6 || this.r.p(viewW3) > i6) {
                    l1(didVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iX2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewW4 = w(i9);
            if (this.r.c(viewW4) > i6 || this.r.p(viewW4) > i6) {
                l1(didVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(iid iidVar) {
        return O0(iidVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l0(defpackage.did r18, defpackage.iid r19) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.l0(did, iid):void");
    }

    public final void l1(did didVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewW = w(i);
                if (w(i) != null) {
                    this.a.b0(i);
                }
                didVar.h(viewW);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewW2 = w(i3);
            if (w(i3) != null) {
                this.a.b0(i3);
            }
            didVar.h(viewW2);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int m(iid iidVar) {
        return P0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void m0(iid iidVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.e();
    }

    public final void m1() {
        if (this.p == 1 || !h1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int n(iid iidVar) {
        return Q0(iidVar);
    }

    public final int n1(int i, did didVar, iid iidVar) {
        if (x() != 0 && i != 0) {
            S0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            r1(i2, iAbs, true, iidVar);
            y48 y48Var = this.q;
            int iT0 = T0(didVar, y48Var, iidVar, false) + y48Var.g;
            if (iT0 >= 0) {
                if (iAbs > iT0) {
                    i = i2 * iT0;
                }
                this.r.r(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(iid iidVar) {
        return O0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof z48) {
            z48 z48Var = (z48) parcelable;
            this.z = z48Var;
            if (this.x != -1) {
                z48Var.a = -1;
            }
            x0();
        }
    }

    public final void o1(int i, int i2) {
        this.x = i;
        this.y = i2;
        z48 z48Var = this.z;
        if (z48Var != null) {
            z48Var.a = -1;
        }
        x0();
    }

    @Override // androidx.recyclerview.widget.a
    public int p(iid iidVar) {
        return P0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        z48 z48Var = this.z;
        if (z48Var != null) {
            z48 z48Var2 = new z48();
            z48Var2.a = z48Var.a;
            z48Var2.b = z48Var.b;
            z48Var2.c = z48Var.c;
            return z48Var2;
        }
        z48 z48Var3 = new z48();
        if (x() <= 0) {
            z48Var3.a = -1;
            return z48Var3;
        }
        S0();
        boolean z = this.s ^ this.u;
        z48Var3.c = z;
        if (z) {
            View viewF1 = f1();
            z48Var3.b = this.r.h() - this.r.c(viewF1);
            z48Var3.a = a.N(viewF1);
            return z48Var3;
        }
        View viewG1 = g1();
        z48Var3.a = a.N(viewG1);
        z48Var3.b = this.r.f(viewG1) - this.r.m();
        return z48Var3;
    }

    public final void p1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(ho7.f(i, "invalid orientation:"));
        }
        d(null);
        if (i != this.p || this.r == null) {
            aw7 aw7VarB = aw7.b(this, i);
            this.r = aw7VarB;
            this.A.f = aw7VarB;
            this.p = i;
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public int q(iid iidVar) {
        return Q0(iidVar);
    }

    public void q1(boolean z) {
        d(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        x0();
    }

    public final void r1(int i, int i2, boolean z, iid iidVar) {
        int iM;
        this.q.l = this.r.j() == 0 && this.r.g() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        M0(iidVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        y48 y48Var = this.q;
        int i3 = z2 ? iMax2 : iMax;
        y48Var.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        y48Var.i = iMax;
        if (z2) {
            y48Var.h = this.r.i() + i3;
            View viewF1 = f1();
            y48 y48Var2 = this.q;
            y48Var2.e = this.u ? -1 : 1;
            int iN = a.N(viewF1);
            y48 y48Var3 = this.q;
            y48Var2.d = iN + y48Var3.e;
            y48Var3.b = this.r.c(viewF1);
            iM = this.r.c(viewF1) - this.r.h();
        } else {
            View viewG1 = g1();
            y48 y48Var4 = this.q;
            y48Var4.h = this.r.m() + y48Var4.h;
            y48 y48Var5 = this.q;
            y48Var5.e = this.u ? 1 : -1;
            int iN2 = a.N(viewG1);
            y48 y48Var6 = this.q;
            y48Var5.d = iN2 + y48Var6.e;
            y48Var6.b = this.r.f(viewG1);
            iM = (-this.r.f(viewG1)) + this.r.m();
        }
        y48 y48Var7 = this.q;
        y48Var7.c = i2;
        if (z) {
            y48Var7.c = i2 - iM;
        }
        y48Var7.g = iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final View s(int i) {
        int iX = x();
        if (iX == 0) {
            return null;
        }
        int iN = i - a.N(w(0));
        if (iN >= 0 && iN < iX) {
            View viewW = w(iN);
            if (a.N(viewW) == i) {
                return viewW;
            }
        }
        return super.s(i);
    }

    public final void s1(int i, int i2) {
        this.q.c = this.r.h() - i2;
        y48 y48Var = this.q;
        y48Var.e = this.u ? -1 : 1;
        y48Var.d = i;
        y48Var.f = 1;
        y48Var.b = i2;
        y48Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public xhd t() {
        return new xhd(-2, -2);
    }

    public final void t1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        y48 y48Var = this.q;
        y48Var.d = i;
        y48Var.e = this.u ? 1 : -1;
        y48Var.f = -1;
        y48Var.b = i2;
        y48Var.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.a
    public int y0(int i, did didVar, iid iidVar) {
        if (this.p == 1) {
            return 0;
        }
        return n1(i, didVar, iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void z0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        z48 z48Var = this.z;
        if (z48Var != null) {
            z48Var.a = -1;
        }
        x0();
    }

    public LinearLayoutManager(int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new nm5();
        this.B = new x48();
        this.C = 2;
        this.D = new int[2];
        p1(i);
        d(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        x0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new nm5();
        this.B = new x48();
        this.C = 2;
        this.D = new int[2];
        whd whdVarO = a.O(context, attributeSet, i, i2);
        p1(whdVarO.a);
        boolean z = whdVarO.c;
        d(null);
        if (z != this.t) {
            this.t = z;
            x0();
        }
        q1(whdVarO.d);
    }
}
