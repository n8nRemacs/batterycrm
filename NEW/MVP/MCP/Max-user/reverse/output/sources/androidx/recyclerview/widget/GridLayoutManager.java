package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.did;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.iid;
import defpackage.iy6;
import defpackage.jy6;
import defpackage.ky6;
import defpackage.l5;
import defpackage.m5;
import defpackage.nm5;
import defpackage.w93;
import defpackage.wy1;
import defpackage.x48;
import defpackage.xhd;
import defpackage.y48;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public ky6 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new iy6();
        this.L = new Rect();
        B1(a.O(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int A0(int i, did didVar, iid iidVar) {
        C1();
        v1();
        return super.A0(i, didVar, iidVar);
    }

    public final void A1(int i, View view, boolean z) {
        int iY;
        int iY2;
        jy6 jy6Var = (jy6) view.getLayoutParams();
        Rect rect = jy6Var.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) jy6Var).topMargin + ((ViewGroup.MarginLayoutParams) jy6Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) jy6Var).leftMargin + ((ViewGroup.MarginLayoutParams) jy6Var).rightMargin;
        int iW1 = w1(jy6Var.o, jy6Var.X);
        if (this.p == 1) {
            iY2 = a.y(false, iW1, i, i3, ((ViewGroup.MarginLayoutParams) jy6Var).width);
            iY = a.y(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) jy6Var).height);
        } else {
            int iY3 = a.y(false, iW1, i, i2, ((ViewGroup.MarginLayoutParams) jy6Var).height);
            int iY4 = a.y(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) jy6Var).width);
            iY = iY3;
            iY2 = iY4;
        }
        xhd xhdVar = (xhd) view.getLayoutParams();
        if (z ? I0(view, iY2, iY, xhdVar) : G0(view, iY2, iY, xhdVar)) {
            view.measure(iY2, iY);
        }
    }

    public final void B1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(ho7.f(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.d();
        x0();
    }

    public final void C1() {
        int iJ;
        int iM;
        if (this.p == 1) {
            iJ = this.n - L();
            iM = K();
        } else {
            iJ = this.o - J();
            iM = M();
        }
        u1(iJ - iM);
    }

    @Override // androidx.recyclerview.widget.a
    public final void D0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.G == null) {
            super.D0(rect, i, i2);
        }
        int iL = L() + K();
        int iJ = J() + M();
        if (this.p == 1) {
            int iHeight = rect.height() + iJ;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = hfh.a;
            i4 = a.i(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            i3 = a.i(i, iArr[iArr.length - 1] + iL, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iL;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = hfh.a;
            i3 = a.i(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            i4 = a.i(i2, iArr2[iArr2.length - 1] + iJ, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final boolean L0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void N0(iid iidVar, y48 y48Var, w93 w93Var) {
        int i;
        int iC = this.F;
        for (int i2 = 0; i2 < this.F && (i = y48Var.d) >= 0 && i < iidVar.b() && iC > 0; i2++) {
            int i3 = y48Var.d;
            w93Var.b(i3, Math.max(0, y48Var.g));
            iC -= this.K.c(i3);
            y48Var.d += y48Var.e;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int P(did didVar, iid iidVar) {
        if (this.p == 0) {
            return this.F;
        }
        if (iidVar.b() < 1) {
            return 0;
        }
        return x1(iidVar.b() - 1, didVar, iidVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a0(android.view.View r23, int r24, defpackage.did r25, defpackage.iid r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a0(android.view.View, int, did, iid):android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(did didVar, iid iidVar, m5 m5Var) {
        super.c0(didVar, iidVar, m5Var);
        m5Var.h(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View c1(did didVar, iid iidVar, boolean z, boolean z2) {
        int i;
        int iX;
        int iX2 = x();
        int i2 = 1;
        if (z2) {
            iX = x() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iX2;
            iX = 0;
        }
        int iB = iidVar.b();
        S0();
        int iM = this.r.m();
        int iH = this.r.h();
        View view = null;
        View view2 = null;
        while (iX != i) {
            View viewW = w(iX);
            int iN = a.N(viewW);
            if (iN >= 0 && iN < iB && y1(iN, didVar, iidVar) == 0) {
                if (((xhd) viewW.getLayoutParams()).a.q()) {
                    if (view2 == null) {
                        view2 = viewW;
                    }
                } else {
                    if (this.r.f(viewW) < iH && this.r.c(viewW) >= iM) {
                        return viewW;
                    }
                    if (view == null) {
                        view = viewW;
                    }
                }
            }
            iX += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(did didVar, iid iidVar, View view, m5 m5Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof jy6)) {
            e0(view, m5Var);
            return;
        }
        jy6 jy6Var = (jy6) layoutParams;
        int iX1 = x1(jy6Var.a.h(), didVar, iidVar);
        if (this.p == 0) {
            m5Var.i(l5.a(false, jy6Var.o, jy6Var.X, iX1, 1));
        } else {
            m5Var.i(l5.a(false, iX1, 1, jy6Var.o, jy6Var.X));
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0() {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public boolean h(xhd xhdVar) {
        return xhdVar instanceof jy6;
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void i1(did didVar, iid iidVar, y48 y48Var, x48 x48Var) {
        int i;
        int i2;
        int i3;
        int iE;
        int iK;
        int iM;
        int iE2;
        int iY;
        int iY2;
        boolean z;
        int i4;
        View viewB;
        int iK2 = this.r.k();
        boolean z2 = iK2 != 1073741824;
        int i5 = x() > 0 ? this.G[this.F] : 0;
        if (z2) {
            C1();
        }
        boolean z3 = y48Var.e == 1;
        int iY1 = this.F;
        if (!z3) {
            iY1 = y1(y48Var.d, didVar, iidVar) + z1(y48Var.d, didVar, iidVar);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = y48Var.d) >= 0 && i4 < iidVar.b() && iY1 > 0) {
            int i7 = y48Var.d;
            int iZ1 = z1(i7, didVar, iidVar);
            if (iZ1 > this.F) {
                throw new IllegalArgumentException(ho7.j(wy1.k("Item at position ", i7, " requires ", iZ1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iY1 -= iZ1;
            if (iY1 < 0 || (viewB = y48Var.b(didVar)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            x48Var.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            jy6 jy6Var = (jy6) view.getLayoutParams();
            int iZ12 = z1(a.N(view), didVar, iidVar);
            jy6Var.X = iZ12;
            jy6Var.o = i8;
            i8 += iZ12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (y48Var.k != null) {
                z = false;
                if (z3) {
                    c(-1, view2, true);
                } else {
                    c(0, view2, true);
                }
            } else if (z3) {
                b(view2);
                z = false;
            } else {
                z = false;
                c(0, view2, false);
            }
            e(this.L, view2);
            A1(iK2, view2, z);
            int iD = this.r.d(view2);
            if (iD > i9) {
                i9 = iD;
            }
            float fE = (this.r.e(view2) * 1.0f) / ((jy6) view2.getLayoutParams()).X;
            if (fE > f) {
                f = fE;
            }
        }
        if (z2) {
            u1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                A1(1073741824, view3, true);
                int iD2 = this.r.d(view3);
                if (iD2 > i9) {
                    i9 = iD2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.d(view4) != i9) {
                jy6 jy6Var2 = (jy6) view4.getLayoutParams();
                Rect rect = jy6Var2.b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) jy6Var2).topMargin + ((ViewGroup.MarginLayoutParams) jy6Var2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) jy6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) jy6Var2).rightMargin;
                int iW1 = w1(jy6Var2.o, jy6Var2.X);
                if (this.p == 1) {
                    iY2 = a.y(false, iW1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) jy6Var2).width);
                    iY = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iY = a.y(false, iW1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) jy6Var2).height);
                    iY2 = iMakeMeasureSpec;
                }
                if (I0(view4, iY2, iY, (xhd) view4.getLayoutParams())) {
                    view4.measure(iY2, iY);
                }
            }
        }
        x48Var.a = i9;
        if (this.p != 1) {
            if (y48Var.f == -1) {
                int i15 = y48Var.b;
                iK = i15 - i9;
                iE = i15;
            } else {
                int i16 = y48Var.b;
                iE = i16 + i9;
                iK = i16;
            }
            iM = 0;
            iE2 = 0;
        } else if (y48Var.f == -1) {
            iE2 = y48Var.b;
            iM = iE2 - i9;
            iK = 0;
            iE = 0;
        } else {
            int i17 = y48Var.b;
            iM = i17;
            iE = 0;
            iE2 = i17 + i9;
            iK = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            jy6 jy6Var3 = (jy6) view5.getLayoutParams();
            if (this.p != 1) {
                iM = M() + this.G[jy6Var3.o];
                iE2 = this.r.e(view5) + iM;
            } else if (h1()) {
                iE = this.G[this.F - jy6Var3.o] + K();
                iK = iE - this.r.e(view5);
            } else {
                iK = K() + this.G[jy6Var3.o];
                iE = this.r.e(view5) + iK;
            }
            int i19 = iE;
            int i20 = iK;
            int i21 = iE2;
            T(view5, i20, iM, i19, i21);
            iK = i20;
            iE = i19;
            iE2 = i21;
            if (jy6Var3.a.q() || jy6Var3.a.t()) {
                x48Var.c = true;
            }
            x48Var.d = view5.hasFocusable() | x48Var.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(did didVar, iid iidVar, nm5 nm5Var, int i) {
        C1();
        if (iidVar.b() > 0 && !iidVar.h) {
            boolean z = i == 1;
            int iY1 = y1(nm5Var.b, didVar, iidVar);
            if (z) {
                while (iY1 > 0) {
                    int i2 = nm5Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    nm5Var.b = i3;
                    iY1 = y1(i3, didVar, iidVar);
                }
            } else {
                int iB = iidVar.b() - 1;
                int i4 = nm5Var.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iY12 = y1(i5, didVar, iidVar);
                    if (iY12 <= iY1) {
                        break;
                    }
                    i4 = i5;
                    iY1 = iY12;
                }
                nm5Var.b = i4;
            }
        }
        v1();
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(RecyclerView recyclerView, int i, int i2) {
        this.K.d();
        this.K.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void l0(did didVar, iid iidVar) {
        boolean z = iidVar.h;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iX = x();
            for (int i = 0; i < iX; i++) {
                jy6 jy6Var = (jy6) w(i).getLayoutParams();
                int iH = jy6Var.a.h();
                sparseIntArray2.put(iH, jy6Var.X);
                sparseIntArray.put(iH, jy6Var.o);
            }
        }
        super.l0(didVar, iidVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int m(iid iidVar) {
        return P0(iidVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void m0(iid iidVar) {
        super.m0(iidVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int n(iid iidVar) {
        return Q0(iidVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int p(iid iidVar) {
        return P0(iidVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int q(iid iidVar) {
        return Q0(iidVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void q1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.q1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public xhd t() {
        return this.p == 0 ? new jy6(-2, -1) : new jy6(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public xhd u(Context context, AttributeSet attributeSet) {
        jy6 jy6Var = new jy6(context, attributeSet);
        jy6Var.o = -1;
        jy6Var.X = 0;
        return jy6Var;
    }

    public final void u1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.a
    public xhd v(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            jy6 jy6Var = new jy6((ViewGroup.MarginLayoutParams) layoutParams);
            jy6Var.o = -1;
            jy6Var.X = 0;
            return jy6Var;
        }
        jy6 jy6Var2 = new jy6(layoutParams);
        jy6Var2.o = -1;
        jy6Var2.X = 0;
        return jy6Var2;
    }

    public final void v1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int w1(int i, int i2) {
        if (this.p != 1 || !h1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int x1(int i, did didVar, iid iidVar) {
        if (!iidVar.h) {
            return this.K.a(i, this.F);
        }
        int iB = didVar.b(i);
        if (iB != -1) {
            return this.K.a(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final int y0(int i, did didVar, iid iidVar) {
        C1();
        v1();
        return super.y0(i, didVar, iidVar);
    }

    public final int y1(int i, did didVar, iid iidVar) {
        if (!iidVar.h) {
            return this.K.b(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = didVar.b(i);
        if (iB != -1) {
            return this.K.b(iB, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final int z(did didVar, iid iidVar) {
        if (this.p == 1) {
            return this.F;
        }
        if (iidVar.b() < 1) {
            return 0;
        }
        return x1(iidVar.b() - 1, didVar, iidVar) + 1;
    }

    public final int z1(int i, did didVar, iid iidVar) {
        if (!iidVar.h) {
            return this.K.c(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = didVar.b(i);
        if (iB != -1) {
            return this.K.c(iB);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public GridLayoutManager(int i) {
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new iy6();
        this.L = new Rect();
        B1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new iy6();
        this.L = new Rect();
        B1(i);
    }
}
