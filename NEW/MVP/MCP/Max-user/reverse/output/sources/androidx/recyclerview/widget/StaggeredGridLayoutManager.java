package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aw7;
import defpackage.c58;
import defpackage.did;
import defpackage.hfh;
import defpackage.hid;
import defpackage.i18;
import defpackage.iid;
import defpackage.j9j;
import defpackage.p9f;
import defpackage.r98;
import defpackage.r9a;
import defpackage.r9f;
import defpackage.s9f;
import defpackage.w93;
import defpackage.whd;
import defpackage.xhd;
import defpackage.xpb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends a implements hid {
    public boolean D;
    public boolean E;
    public r9f F;
    public final r9a H;
    public final boolean I;
    public int[] J;
    public final r98 K;
    public s9f[] q;
    public final aw7 r;
    public final aw7 s;
    public final int t;
    public int u;
    public final i18 v;
    public boolean w;
    public BitSet y;
    public int p = -1;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;
    public final xpb B = new xpb(9, false);
    public final int C = 2;
    public final Rect G = new Rect();

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.w = false;
        r9a r9aVar = new r9a();
        r9aVar.g = this;
        r9aVar.c();
        this.H = r9aVar;
        this.I = true;
        this.K = new r98(24, this);
        whd whdVarO = a.O(context, attributeSet, i, i2);
        int i3 = whdVarO.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i3 != this.t) {
            this.t = i3;
            aw7 aw7Var = this.r;
            this.r = this.s;
            this.s = aw7Var;
            x0();
        }
        k1(whdVarO.b);
        boolean z = whdVarO.c;
        d(null);
        r9f r9fVar = this.F;
        if (r9fVar != null && r9fVar.Z != z) {
            r9fVar.Z = z;
        }
        this.w = z;
        x0();
        i18 i18Var = new i18();
        i18Var.a = true;
        i18Var.f = 0;
        i18Var.g = 0;
        this.v = i18Var;
        this.r = aw7.b(this, this.t);
        this.s = aw7.b(this, 1 - this.t);
    }

    public static int n1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.a
    public final int A0(int i, did didVar, iid iidVar) {
        return i1(i, didVar, iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void D0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int iL = L() + K();
        int iJ = J() + M();
        if (this.t == 1) {
            int iHeight = rect.height() + iJ;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = hfh.a;
            i4 = a.i(i2, iHeight, recyclerView.getMinimumHeight());
            i3 = a.i(i, (this.u * this.p) + iL, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iL;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = hfh.a;
            i3 = a.i(i, iWidth, recyclerView2.getMinimumWidth());
            i4 = a.i(i2, (this.u * this.p) + iJ, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        c58 c58Var = new c58(recyclerView.getContext());
        c58Var.a = i;
        K0(c58Var);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean L0() {
        return this.F == null;
    }

    public final boolean M0() {
        int iT0;
        if (x() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iT0 = U0();
                T0();
            } else {
                iT0 = T0();
                U0();
            }
            if (iT0 == 0 && Y0() != null) {
                this.B.q();
                this.f = true;
                x0();
                return true;
            }
        }
        return false;
    }

    public final int N0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return j9j.b(iidVar, this.r, Q0(z), P0(z), this, this.I, this.x);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int O0(did didVar, i18 i18Var, iid iidVar) {
        s9f s9fVar;
        ?? r3;
        int iJ;
        int iD;
        int iM;
        int iD2;
        int i;
        int i2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i3 = 0;
        int i4 = 1;
        staggeredGridLayoutManager.y.set(0, staggeredGridLayoutManager.p, true);
        i18 i18Var2 = staggeredGridLayoutManager.v;
        int i5 = i18Var2.i ? i18Var.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : i18Var.e == 1 ? i18Var.g + i18Var.b : i18Var.f - i18Var.b;
        int i6 = i18Var.e;
        for (int i7 = 0; i7 < staggeredGridLayoutManager.p; i7++) {
            if (!((ArrayList) staggeredGridLayoutManager.q[i7].e).isEmpty()) {
                staggeredGridLayoutManager.m1(staggeredGridLayoutManager.q[i7], i6, i5);
            }
        }
        int iH = staggeredGridLayoutManager.x ? staggeredGridLayoutManager.r.h() : staggeredGridLayoutManager.r.m();
        boolean z = false;
        while (true) {
            int i8 = i18Var.c;
            int i9 = -1;
            if (i8 < 0 || i8 >= iidVar.b() || (!i18Var2.i && staggeredGridLayoutManager.y.isEmpty())) {
                break;
            }
            View viewD = didVar.d(i18Var.c);
            i18Var.c += i18Var.d;
            p9f p9fVar = (p9f) viewD.getLayoutParams();
            int iH2 = p9fVar.a.h();
            xpb xpbVar = staggeredGridLayoutManager.B;
            int[] iArr = (int[]) xpbVar.b;
            int i10 = (iArr == null || iH2 >= iArr.length) ? -1 : iArr[iH2];
            if (i10 == -1) {
                if (staggeredGridLayoutManager.c1(i18Var.e)) {
                    i = staggeredGridLayoutManager.p - i4;
                    i2 = -1;
                } else {
                    i9 = staggeredGridLayoutManager.p;
                    i = i3;
                    i2 = i4;
                }
                s9f s9fVar2 = null;
                if (i18Var.e == i4) {
                    int iM2 = staggeredGridLayoutManager.r.m();
                    int i11 = Integer.MAX_VALUE;
                    while (i != i9) {
                        s9f s9fVar3 = staggeredGridLayoutManager.q[i];
                        int i12 = i2;
                        int iH3 = s9fVar3.h(iM2);
                        if (iH3 < i11) {
                            s9fVar2 = s9fVar3;
                            i11 = iH3;
                        }
                        i += i12;
                        i2 = i12;
                    }
                } else {
                    int i13 = i2;
                    int iH4 = staggeredGridLayoutManager.r.h();
                    int i14 = Integer.MIN_VALUE;
                    while (i != i9) {
                        s9f s9fVar4 = staggeredGridLayoutManager.q[i];
                        int iJ2 = s9fVar4.j(iH4);
                        if (iJ2 > i14) {
                            s9fVar2 = s9fVar4;
                            i14 = iJ2;
                        }
                        i += i13;
                    }
                }
                s9fVar = s9fVar2;
                xpbVar.r(iH2);
                ((int[]) xpbVar.b)[iH2] = s9fVar.d;
            } else {
                s9fVar = staggeredGridLayoutManager.q[i10];
            }
            s9f s9fVar5 = s9fVar;
            p9fVar.o = s9fVar5;
            if (i18Var.e == 1) {
                staggeredGridLayoutManager.b(viewD);
                r3 = 0;
            } else {
                r3 = 0;
                staggeredGridLayoutManager.c(0, viewD, false);
            }
            if (staggeredGridLayoutManager.t == 1) {
                staggeredGridLayoutManager.a1(viewD, a.y(r3, staggeredGridLayoutManager.u, staggeredGridLayoutManager.l, r3, ((ViewGroup.MarginLayoutParams) p9fVar).width), a.y(true, staggeredGridLayoutManager.o, staggeredGridLayoutManager.m, staggeredGridLayoutManager.J() + staggeredGridLayoutManager.M(), ((ViewGroup.MarginLayoutParams) p9fVar).height));
            } else {
                staggeredGridLayoutManager.a1(viewD, a.y(true, staggeredGridLayoutManager.n, staggeredGridLayoutManager.l, staggeredGridLayoutManager.L() + staggeredGridLayoutManager.K(), ((ViewGroup.MarginLayoutParams) p9fVar).width), a.y(false, staggeredGridLayoutManager.u, staggeredGridLayoutManager.m, 0, ((ViewGroup.MarginLayoutParams) p9fVar).height));
            }
            if (i18Var.e == 1) {
                iD = s9fVar5.h(iH);
                iJ = staggeredGridLayoutManager.r.d(viewD) + iD;
            } else {
                iJ = s9fVar5.j(iH);
                iD = iJ - staggeredGridLayoutManager.r.d(viewD);
            }
            if (i18Var.e == 1) {
                s9f s9fVar6 = p9fVar.o;
                s9fVar6.getClass();
                p9f p9fVar2 = (p9f) viewD.getLayoutParams();
                p9fVar2.o = s9fVar6;
                ArrayList arrayList = (ArrayList) s9fVar6.e;
                arrayList.add(viewD);
                s9fVar6.b = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    s9fVar6.a = Integer.MIN_VALUE;
                }
                if (p9fVar2.a.q() || p9fVar2.a.t()) {
                    s9fVar6.c = ((StaggeredGridLayoutManager) s9fVar6.f).r.d(viewD) + s9fVar6.c;
                }
            } else {
                s9f s9fVar7 = p9fVar.o;
                s9fVar7.getClass();
                p9f p9fVar3 = (p9f) viewD.getLayoutParams();
                p9fVar3.o = s9fVar7;
                ArrayList arrayList2 = (ArrayList) s9fVar7.e;
                arrayList2.add(0, viewD);
                s9fVar7.a = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    s9fVar7.b = Integer.MIN_VALUE;
                }
                if (p9fVar3.a.q() || p9fVar3.a.t()) {
                    s9fVar7.c = ((StaggeredGridLayoutManager) s9fVar7.f).r.d(viewD) + s9fVar7.c;
                }
            }
            if (staggeredGridLayoutManager.Z0() && staggeredGridLayoutManager.t == 1) {
                iD2 = staggeredGridLayoutManager.s.h() - (((staggeredGridLayoutManager.p - 1) - s9fVar5.d) * staggeredGridLayoutManager.u);
                iM = iD2 - staggeredGridLayoutManager.s.d(viewD);
            } else {
                iM = staggeredGridLayoutManager.s.m() + (s9fVar5.d * staggeredGridLayoutManager.u);
                iD2 = staggeredGridLayoutManager.s.d(viewD) + iM;
            }
            int i15 = iM;
            int i16 = iD2;
            if (staggeredGridLayoutManager.t == 1) {
                staggeredGridLayoutManager.T(viewD, i15, iD, i16, iJ);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.T(viewD, iD, i15, iJ, i16);
            }
            staggeredGridLayoutManager.m1(s9fVar5, i18Var2.e, i5);
            staggeredGridLayoutManager.e1(didVar, i18Var2);
            if (i18Var2.h && viewD.hasFocusable()) {
                staggeredGridLayoutManager.y.set(s9fVar5.d, false);
            }
            z = true;
            i4 = 1;
            i3 = 0;
        }
        if (!z) {
            staggeredGridLayoutManager.e1(didVar, i18Var2);
        }
        int iM3 = i18Var2.e == -1 ? staggeredGridLayoutManager.r.m() - staggeredGridLayoutManager.W0(staggeredGridLayoutManager.r.m()) : staggeredGridLayoutManager.V0(staggeredGridLayoutManager.r.h()) - staggeredGridLayoutManager.r.h();
        if (iM3 > 0) {
            return Math.min(i18Var.b, iM3);
        }
        return 0;
    }

    public final View P0(boolean z) {
        int iM = this.r.m();
        int iH = this.r.h();
        View view = null;
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            int iF = this.r.f(viewW);
            int iC = this.r.c(viewW);
            if (iC > iM && iF < iH) {
                if (iC <= iH || !z) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    public final View Q0(boolean z) {
        int iM = this.r.m();
        int iH = this.r.h();
        int iX = x();
        View view = null;
        for (int i = 0; i < iX; i++) {
            View viewW = w(i);
            int iF = this.r.f(viewW);
            if (this.r.c(viewW) > iM && iF < iH) {
                if (iF >= iM || !z) {
                    return viewW;
                }
                if (view == null) {
                    view = viewW;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R() {
        return this.C != 0;
    }

    public final void R0(did didVar, iid iidVar, boolean z) {
        int iH;
        int iV0 = V0(Integer.MIN_VALUE);
        if (iV0 != Integer.MIN_VALUE && (iH = this.r.h() - iV0) > 0) {
            int i = iH - (-i1(-iH, didVar, iidVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.r(i);
        }
    }

    public final void S0(did didVar, iid iidVar, boolean z) {
        int iM;
        int iW0 = W0(Integer.MAX_VALUE);
        if (iW0 != Integer.MAX_VALUE && (iM = iW0 - this.r.m()) > 0) {
            int iI1 = iM - i1(iM, didVar, iidVar);
            if (!z || iI1 <= 0) {
                return;
            }
            this.r.r(-iI1);
        }
    }

    public final int T0() {
        if (x() == 0) {
            return 0;
        }
        return a.N(w(0));
    }

    public final int U0() {
        int iX = x();
        if (iX == 0) {
            return 0;
        }
        return a.N(w(iX - 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final void V(int i) {
        super.V(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s9f s9fVar = this.q[i2];
            int i3 = s9fVar.a;
            if (i3 != Integer.MIN_VALUE) {
                s9fVar.a = i3 + i;
            }
            int i4 = s9fVar.b;
            if (i4 != Integer.MIN_VALUE) {
                s9fVar.b = i4 + i;
            }
        }
    }

    public final int V0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.a
    public final void W(int i) {
        super.W(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s9f s9fVar = this.q[i2];
            int i3 = s9fVar.a;
            if (i3 != Integer.MIN_VALUE) {
                s9fVar.a = i3 + i;
            }
            int i4 = s9fVar.b;
            if (i4 != Integer.MIN_VALUE) {
                s9fVar.b = i4 + i;
            }
        }
    }

    public final int W0(int i) {
        int iJ = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.q[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X() {
        this.B.q();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Y0() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final boolean Z0() {
        return I() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // defpackage.hid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.x()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.T0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a0(android.view.View r9, int r10, defpackage.did r11, defpackage.iid r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a0(android.view.View, int, did, iid):android.view.View");
    }

    public final void a1(View view, int i, int i2) {
        Rect rect = this.G;
        e(rect, view);
        p9f p9fVar = (p9f) view.getLayoutParams();
        int iN1 = n1(i, ((ViewGroup.MarginLayoutParams) p9fVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) p9fVar).rightMargin + rect.right);
        int iN12 = n1(i2, ((ViewGroup.MarginLayoutParams) p9fVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) p9fVar).bottomMargin + rect.bottom);
        if (G0(view, iN1, iN12, p9fVar)) {
            view.measure(iN1, iN12);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            View viewQ0 = Q0(false);
            View viewP0 = P0(false);
            if (viewQ0 == null || viewP0 == null) {
                return;
            }
            int iN = a.N(viewQ0);
            int iN2 = a.N(viewP0);
            if (iN < iN2) {
                accessibilityEvent.setFromIndex(iN);
                accessibilityEvent.setToIndex(iN2);
            } else {
                accessibilityEvent.setFromIndex(iN2);
                accessibilityEvent.setToIndex(iN);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0423  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(defpackage.did r17, defpackage.iid r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(did, iid, boolean):void");
    }

    public final boolean c1(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == Z0();
    }

    @Override // androidx.recyclerview.widget.a
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    public final void d1(int i, iid iidVar) {
        int iT0;
        int i2;
        if (i > 0) {
            iT0 = U0();
            i2 = 1;
        } else {
            iT0 = T0();
            i2 = -1;
        }
        i18 i18Var = this.v;
        i18Var.a = true;
        l1(iT0, iidVar);
        j1(i2);
        i18Var.c = iT0 + i18Var.d;
        i18Var.b = Math.abs(i);
    }

    public final void e1(did didVar, i18 i18Var) {
        if (!i18Var.a || i18Var.i) {
            return;
        }
        if (i18Var.b == 0) {
            if (i18Var.e == -1) {
                f1(didVar, i18Var.g);
                return;
            } else {
                g1(didVar, i18Var.f);
                return;
            }
        }
        int i = 1;
        if (i18Var.e == -1) {
            int i2 = i18Var.f;
            int iJ = this.q[0].j(i2);
            while (i < this.p) {
                int iJ2 = this.q[i].j(i2);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i++;
            }
            int i3 = i2 - iJ;
            f1(didVar, i3 < 0 ? i18Var.g : i18Var.g - Math.min(i3, i18Var.b));
            return;
        }
        int i4 = i18Var.g;
        int iH = this.q[0].h(i4);
        while (i < this.p) {
            int iH2 = this.q[i].h(i4);
            if (iH2 < iH) {
                iH = iH2;
            }
            i++;
        }
        int i5 = iH - i18Var.g;
        g1(didVar, i5 < 0 ? i18Var.f : Math.min(i5, i18Var.b) + i18Var.f);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        X0(i, i2, 1);
    }

    public final void f1(did didVar, int i) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            if (this.r.f(viewW) < i || this.r.q(viewW) < i) {
                return;
            }
            p9f p9fVar = (p9f) viewW.getLayoutParams();
            p9fVar.getClass();
            if (((ArrayList) p9fVar.o.e).size() == 1) {
                return;
            }
            s9f s9fVar = p9fVar.o;
            ArrayList arrayList = (ArrayList) s9fVar.e;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            p9f p9fVar2 = (p9f) view.getLayoutParams();
            p9fVar2.o = null;
            if (p9fVar2.a.q() || p9fVar2.a.t()) {
                s9fVar.c -= ((StaggeredGridLayoutManager) s9fVar.f).r.d(view);
            }
            if (size == 1) {
                s9fVar.a = Integer.MIN_VALUE;
            }
            s9fVar.b = Integer.MIN_VALUE;
            v0(viewW, didVar);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void g0() {
        this.B.q();
        x0();
    }

    public final void g1(did didVar, int i) {
        while (x() > 0) {
            View viewW = w(0);
            if (this.r.c(viewW) > i || this.r.p(viewW) > i) {
                return;
            }
            p9f p9fVar = (p9f) viewW.getLayoutParams();
            p9fVar.getClass();
            if (((ArrayList) p9fVar.o.e).size() == 1) {
                return;
            }
            s9f s9fVar = p9fVar.o;
            ArrayList arrayList = (ArrayList) s9fVar.e;
            View view = (View) arrayList.remove(0);
            p9f p9fVar2 = (p9f) view.getLayoutParams();
            p9fVar2.o = null;
            if (arrayList.size() == 0) {
                s9fVar.b = Integer.MIN_VALUE;
            }
            if (p9fVar2.a.q() || p9fVar2.a.t()) {
                s9fVar.c -= ((StaggeredGridLayoutManager) s9fVar.f).r.d(view);
            }
            s9fVar.a = Integer.MIN_VALUE;
            v0(viewW, didVar);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(xhd xhdVar) {
        return xhdVar instanceof p9f;
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i, int i2) {
        X0(i, i2, 8);
    }

    public final void h1() {
        if (this.t == 1 || !Z0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        X0(i, i2, 2);
    }

    public final int i1(int i, did didVar, iid iidVar) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        d1(i, iidVar);
        i18 i18Var = this.v;
        int iO0 = O0(didVar, i18Var, iidVar);
        if (i18Var.b >= iO0) {
            i = i < 0 ? -iO0 : iO0;
        }
        this.r.r(-i);
        this.D = this.x;
        i18Var.b = 0;
        e1(didVar, i18Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.a
    public final void j(int i, int i2, iid iidVar, w93 w93Var) {
        i18 i18Var;
        int iH;
        int iJ;
        if (this.t != 0) {
            i = i2;
        }
        if (x() == 0 || i == 0) {
            return;
        }
        d1(i, iidVar);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            i18Var = this.v;
            if (i3 >= i5) {
                break;
            }
            if (i18Var.d == -1) {
                iH = i18Var.f;
                iJ = this.q[i3].j(iH);
            } else {
                iH = this.q[i3].h(i18Var.g);
                iJ = i18Var.g;
            }
            int i6 = iH - iJ;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = i18Var.c;
            if (i8 < 0 || i8 >= iidVar.b()) {
                return;
            }
            w93Var.b(i18Var.c, this.J[i7]);
            i18Var.c += i18Var.d;
        }
    }

    public final void j1(int i) {
        i18 i18Var = this.v;
        i18Var.e = i;
        i18Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(RecyclerView recyclerView, int i, int i2) {
        X0(i, i2, 4);
    }

    public final void k1(int i) {
        d(null);
        if (i != this.p) {
            this.B.q();
            x0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new s9f[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new s9f(this, i2);
            }
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return j9j.a(iidVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.a
    public final void l0(did didVar, iid iidVar) {
        b1(didVar, iidVar, true);
    }

    public final void l1(int i, iid iidVar) {
        int iN;
        int iN2;
        int i2;
        i18 i18Var = this.v;
        boolean z = false;
        i18Var.b = 0;
        i18Var.c = i;
        c58 c58Var = this.e;
        if (c58Var == null || !c58Var.e || (i2 = iidVar.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = this.r.n();
                iN2 = 0;
            } else {
                iN2 = this.r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.u0) {
            i18Var.g = this.r.g() + iN;
            i18Var.f = -iN2;
        } else {
            i18Var.f = this.r.m() - iN2;
            i18Var.g = this.r.h() + iN;
        }
        i18Var.h = false;
        i18Var.a = true;
        if (this.r.j() == 0 && this.r.g() == 0) {
            z = true;
        }
        i18Var.i = z;
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(iid iidVar) {
        return N0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(iid iidVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.c();
    }

    public final void m1(s9f s9fVar, int i, int i2) {
        int i3 = s9fVar.c;
        int i4 = s9fVar.d;
        if (i != -1) {
            int i5 = s9fVar.b;
            if (i5 == Integer.MIN_VALUE) {
                s9fVar.c();
                i5 = s9fVar.b;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = s9fVar.a;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) s9fVar.e).get(0);
            p9f p9fVar = (p9f) view.getLayoutParams();
            s9fVar.a = ((StaggeredGridLayoutManager) s9fVar.f).r.f(view);
            p9fVar.getClass();
            i6 = s9fVar.a;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return j9j.c(iidVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return j9j.a(iidVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof r9f) {
            r9f r9fVar = (r9f) parcelable;
            this.F = r9fVar;
            if (this.z != -1) {
                r9fVar.d = null;
                r9fVar.c = 0;
                r9fVar.a = -1;
                r9fVar.b = -1;
                r9fVar.d = null;
                r9fVar.c = 0;
                r9fVar.o = 0;
                r9fVar.X = null;
                r9fVar.Y = null;
            }
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(iid iidVar) {
        return N0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        int iJ;
        int iM;
        int[] iArr;
        r9f r9fVar = this.F;
        if (r9fVar != null) {
            r9f r9fVar2 = new r9f();
            r9fVar2.c = r9fVar.c;
            r9fVar2.a = r9fVar.a;
            r9fVar2.b = r9fVar.b;
            r9fVar2.d = r9fVar.d;
            r9fVar2.o = r9fVar.o;
            r9fVar2.X = r9fVar.X;
            r9fVar2.Z = r9fVar.Z;
            r9fVar2.s0 = r9fVar.s0;
            r9fVar2.t0 = r9fVar.t0;
            r9fVar2.Y = r9fVar.Y;
            return r9fVar2;
        }
        r9f r9fVar3 = new r9f();
        r9fVar3.Z = this.w;
        r9fVar3.s0 = this.D;
        r9fVar3.t0 = this.E;
        xpb xpbVar = this.B;
        if (xpbVar == null || (iArr = (int[]) xpbVar.b) == null) {
            r9fVar3.o = 0;
        } else {
            r9fVar3.X = iArr;
            r9fVar3.o = iArr.length;
            r9fVar3.Y = (ArrayList) xpbVar.c;
        }
        if (x() <= 0) {
            r9fVar3.a = -1;
            r9fVar3.b = -1;
            r9fVar3.c = 0;
            return r9fVar3;
        }
        r9fVar3.a = this.D ? U0() : T0();
        View viewP0 = this.x ? P0(true) : Q0(true);
        r9fVar3.b = viewP0 != null ? a.N(viewP0) : -1;
        int i = this.p;
        r9fVar3.c = i;
        r9fVar3.d = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            if (this.D) {
                iJ = this.q[i2].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.r.h();
                    iJ -= iM;
                }
            } else {
                iJ = this.q[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.r.m();
                    iJ -= iM;
                }
            }
            r9fVar3.d[i2] = iJ;
        }
        return r9fVar3;
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return j9j.c(iidVar, this.r, Q0(z), P0(z), this, this.I);
    }

    @Override // androidx.recyclerview.widget.a
    public final void q0(int i) {
        if (i == 0) {
            M0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd t() {
        return this.t == 0 ? new p9f(-2, -1) : new p9f(-1, -2);
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd u(Context context, AttributeSet attributeSet) {
        return new p9f(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new p9f((ViewGroup.MarginLayoutParams) layoutParams) : new p9f(layoutParams);
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, did didVar, iid iidVar) {
        return i1(i, didVar, iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
        r9f r9fVar = this.F;
        if (r9fVar != null && r9fVar.a != i) {
            r9fVar.d = null;
            r9fVar.c = 0;
            r9fVar.a = -1;
            r9fVar.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        x0();
    }
}
