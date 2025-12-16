package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import defpackage.aw7;
import defpackage.c58;
import defpackage.did;
import defpackage.f26;
import defpackage.g26;
import defpackage.h26;
import defpackage.hid;
import defpackage.i26;
import defpackage.iid;
import defpackage.j26;
import defpackage.jjb;
import defpackage.kce;
import defpackage.whd;
import defpackage.xa6;
import defpackage.xhd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends a implements hid {
    public static final Rect N = new Rect();
    public final g26 A;
    public aw7 B;
    public aw7 C;
    public j26 D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final SparseArray I;
    public final Context J;
    public View K;
    public int L;
    public final kce M;
    public int p;
    public final int q;
    public final int r;
    public boolean t;
    public boolean u;
    public final xa6 w;
    public did x;
    public iid y;
    public i26 z;
    public final int s = -1;
    public List v = new ArrayList();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        xa6 xa6Var = new xa6();
        xa6Var.a = this;
        this.w = xa6Var;
        this.A = new g26(this);
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = new SparseArray();
        this.L = -1;
        this.M = new kce(19);
        whd whdVarO = a.O(context, attributeSet, i, i2);
        int i3 = whdVarO.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (whdVarO.c) {
                    g1(3);
                } else {
                    g1(2);
                }
            }
        } else if (whdVarO.c) {
            g1(1);
        } else {
            g1(0);
        }
        int i4 = this.q;
        if (i4 != 1) {
            if (i4 == 0) {
                s0();
                this.v.clear();
                g26 g26Var = this.A;
                g26.b(g26Var);
                g26Var.d = 0;
            }
            this.q = 1;
            this.B = null;
            this.C = null;
            x0();
        }
        if (this.r != 4) {
            s0();
            this.v.clear();
            g26 g26Var2 = this.A;
            g26.b(g26Var2);
            g26Var2.d = 0;
            this.r = 4;
            x0();
        }
        this.J = context;
    }

    public static boolean S(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a
    public final int A0(int i, did didVar, iid iidVar) {
        if (e1() || (this.q == 0 && !e1())) {
            int iC1 = c1(i, didVar, iidVar);
            this.I.clear();
            return iC1;
        }
        int iD1 = d1(i);
        this.A.d += iD1;
        this.C.r(-iD1);
        return iD1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void J0(RecyclerView recyclerView, int i) {
        c58 c58Var = new c58(recyclerView.getContext());
        c58Var.a = i;
        K0(c58Var);
    }

    public final int M0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        int iB = iidVar.b();
        P0();
        View viewR0 = R0(iB);
        View viewT0 = T0(iB);
        if (iidVar.b() == 0 || viewR0 == null || viewT0 == null) {
            return 0;
        }
        return Math.min(this.B.n(), this.B.c(viewT0) - this.B.f(viewR0));
    }

    public final int N0(iid iidVar) {
        if (x() == 0) {
            return 0;
        }
        int iB = iidVar.b();
        View viewR0 = R0(iB);
        View viewT0 = T0(iB);
        if (iidVar.b() == 0 || viewR0 == null || viewT0 == null) {
            return 0;
        }
        int iN = a.N(viewR0);
        int iN2 = a.N(viewT0);
        int iAbs = Math.abs(this.B.c(viewT0) - this.B.f(viewR0));
        int i = ((int[]) this.w.c)[iN];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iN2] - i) + 1))) + (this.B.m() - this.B.f(viewR0)));
    }

    public final int O0(iid iidVar) {
        if (x() != 0) {
            int iB = iidVar.b();
            View viewR0 = R0(iB);
            View viewT0 = T0(iB);
            if (iidVar.b() != 0 && viewR0 != null && viewT0 != null) {
                View viewV0 = V0(0, x());
                int iN = viewV0 == null ? -1 : a.N(viewV0);
                return (int) ((Math.abs(this.B.c(viewT0) - this.B.f(viewR0)) / (((V0(x() - 1, -1) != null ? a.N(r4) : -1) - iN) + 1)) * iidVar.b());
            }
        }
        return 0;
    }

    public final void P0() {
        if (this.B != null) {
            return;
        }
        if (e1()) {
            if (this.q == 0) {
                this.B = new jjb(this, 0);
                this.C = new jjb(this, 1);
                return;
            } else {
                this.B = new jjb(this, 1);
                this.C = new jjb(this, 0);
                return;
            }
        }
        if (this.q == 0) {
            this.B = new jjb(this, 1);
            this.C = new jjb(this, 0);
        } else {
            this.B = new jjb(this, 0);
            this.C = new jjb(this, 1);
        }
    }

    public final int Q0(did didVar, iid iidVar, i26 i26Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        int i14 = i26Var.f;
        if (i14 != Integer.MIN_VALUE) {
            int i15 = i26Var.a;
            if (i15 < 0) {
                i26Var.f = i14 + i15;
            }
            f1(didVar, i26Var);
        }
        int i16 = i26Var.a;
        boolean zE1 = e1();
        int i17 = i16;
        int i18 = 0;
        while (true) {
            if (i17 <= 0 && !this.z.b) {
                break;
            }
            List list = this.v;
            int i19 = i26Var.d;
            if (i19 < 0 || i19 >= iidVar.b() || (i = i26Var.c) < 0 || i >= list.size()) {
                break;
            }
            f26 f26Var = (f26) this.v.get(i26Var.c);
            i26Var.d = f26Var.k;
            boolean zE12 = e1();
            g26 g26Var = this.A;
            Rect rect3 = N;
            xa6 xa6Var = this.w;
            if (zE12) {
                int iK = K();
                int iL = L();
                int i20 = this.n;
                int i21 = i26Var.e;
                if (i26Var.h == -1) {
                    i21 -= f26Var.c;
                }
                int i22 = i21;
                int i23 = i26Var.d;
                float f = g26Var.d;
                float f2 = iK - f;
                float measuredWidth = (i20 - iL) - f;
                float fMax = Math.max(0.0f, 0.0f);
                int i24 = f26Var.d;
                i2 = i16;
                int i25 = i23;
                int i26 = 0;
                while (i25 < i23 + i24) {
                    int i27 = i23;
                    View viewA1 = a1(i25);
                    if (viewA1 == null) {
                        i13 = i27;
                        z2 = zE1;
                        i11 = i24;
                        i12 = i25;
                        rect2 = rect3;
                    } else {
                        z2 = zE1;
                        if (i26Var.h == 1) {
                            e(rect3, viewA1);
                            b(viewA1);
                        } else {
                            e(rect3, viewA1);
                            c(i26, viewA1, false);
                            i26++;
                        }
                        int i28 = i26;
                        float f3 = measuredWidth;
                        long j = ((long[]) xa6Var.d)[i25];
                        int i29 = (int) j;
                        int i30 = (int) (j >> 32);
                        if (h1(viewA1, i29, i30, (h26) viewA1.getLayoutParams())) {
                            viewA1.measure(i29, i30);
                        }
                        float f4 = f2 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((xhd) viewA1.getLayoutParams()).b.left;
                        float f5 = f3 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((xhd) viewA1.getLayoutParams()).b.right);
                        int i31 = i22 + ((xhd) viewA1.getLayoutParams()).b.top;
                        if (this.t) {
                            i11 = i24;
                            i12 = i25;
                            rect2 = rect3;
                            i13 = i27;
                            this.w.p(viewA1, f26Var, Math.round(f5) - viewA1.getMeasuredWidth(), i31, Math.round(f5), viewA1.getMeasuredHeight() + i31);
                        } else {
                            i11 = i24;
                            i12 = i25;
                            rect2 = rect3;
                            i13 = i27;
                            this.w.p(viewA1, f26Var, Math.round(f4), i31, viewA1.getMeasuredWidth() + Math.round(f4), viewA1.getMeasuredHeight() + i31);
                        }
                        float measuredWidth2 = viewA1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((xhd) viewA1.getLayoutParams()).b.right + fMax + f4;
                        measuredWidth = f5 - (((viewA1.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((xhd) viewA1.getLayoutParams()).b.left) + fMax);
                        f2 = measuredWidth2;
                        i26 = i28;
                    }
                    i25 = i12 + 1;
                    zE1 = z2;
                    i23 = i13;
                    i24 = i11;
                    rect3 = rect2;
                }
                z = zE1;
                i26Var.c += this.z.h;
                i6 = f26Var.c;
                i5 = i17;
            } else {
                i2 = i16;
                z = zE1;
                Rect rect4 = rect3;
                int iM = M();
                int iJ = J();
                int i32 = this.o;
                int i33 = i26Var.e;
                if (i26Var.h == -1) {
                    int i34 = f26Var.c;
                    i4 = i33 + i34;
                    i3 = i33 - i34;
                } else {
                    i3 = i33;
                    i4 = i3;
                }
                int i35 = i26Var.d;
                float f6 = i32 - iJ;
                float f7 = g26Var.d;
                float f8 = iM - f7;
                float f9 = f6 - f7;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i36 = f26Var.d;
                float measuredHeight = f9;
                int i37 = i35;
                float measuredHeight2 = f8;
                int i38 = 0;
                while (i37 < i35 + i36) {
                    int i39 = i35;
                    View viewA12 = a1(i37);
                    if (viewA12 == null) {
                        i7 = i17;
                        i8 = i36;
                        i9 = i37;
                        i10 = i39;
                    } else {
                        float f10 = measuredHeight2;
                        i7 = i17;
                        long j2 = ((long[]) xa6Var.d)[i37];
                        int i40 = (int) j2;
                        int i41 = (int) (j2 >> 32);
                        if (h1(viewA12, i40, i41, (h26) viewA12.getLayoutParams())) {
                            viewA12.measure(i40, i41);
                        }
                        float f11 = f10 + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((xhd) viewA12.getLayoutParams()).b.top;
                        float f12 = measuredHeight - (((ViewGroup.MarginLayoutParams) r7).rightMargin + ((xhd) viewA12.getLayoutParams()).b.bottom);
                        if (i26Var.h == 1) {
                            rect = rect4;
                            e(rect, viewA12);
                            b(viewA12);
                        } else {
                            rect = rect4;
                            e(rect, viewA12);
                            c(i38, viewA12, false);
                            i38++;
                        }
                        int i42 = i3 + ((xhd) viewA12.getLayoutParams()).b.left;
                        int i43 = i4 - ((xhd) viewA12.getLayoutParams()).b.right;
                        rect4 = rect;
                        boolean z3 = this.t;
                        if (!z3) {
                            i8 = i36;
                            i9 = i37;
                            i10 = i39;
                            if (this.u) {
                                this.w.q(viewA12, f26Var, z3, i42, Math.round(f12) - viewA12.getMeasuredHeight(), viewA12.getMeasuredWidth() + i42, Math.round(f12));
                            } else {
                                this.w.q(viewA12, f26Var, z3, i42, Math.round(f11), viewA12.getMeasuredWidth() + i42, viewA12.getMeasuredHeight() + Math.round(f11));
                            }
                        } else if (this.u) {
                            int measuredWidth3 = i43 - viewA12.getMeasuredWidth();
                            int iRound = Math.round(f12) - viewA12.getMeasuredHeight();
                            i10 = i39;
                            int iRound2 = Math.round(f12);
                            i8 = i36;
                            i9 = i37;
                            this.w.q(viewA12, f26Var, z3, measuredWidth3, iRound, i43, iRound2);
                        } else {
                            i8 = i36;
                            i9 = i37;
                            i10 = i39;
                            this.w.q(viewA12, f26Var, z3, i43 - viewA12.getMeasuredWidth(), Math.round(f11), i43, viewA12.getMeasuredHeight() + Math.round(f11));
                        }
                        measuredHeight = f12 - (((viewA12.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).bottomMargin) + ((xhd) viewA12.getLayoutParams()).b.top) + fMax2);
                        measuredHeight2 = viewA12.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r7).topMargin + ((xhd) viewA12.getLayoutParams()).b.bottom + fMax2 + f11;
                    }
                    i37 = i9 + 1;
                    i17 = i7;
                    i35 = i10;
                    i36 = i8;
                }
                i5 = i17;
                i26Var.c += this.z.h;
                i6 = f26Var.c;
            }
            i18 += i6;
            if (z || !this.t) {
                i26Var.e += f26Var.c * i26Var.h;
            } else {
                i26Var.e -= f26Var.c * i26Var.h;
            }
            i17 = i5 - f26Var.c;
            i16 = i2;
            zE1 = z;
        }
        int i44 = i16;
        int i45 = i26Var.a - i18;
        i26Var.a = i45;
        int i46 = i26Var.f;
        if (i46 != Integer.MIN_VALUE) {
            int i47 = i46 + i18;
            i26Var.f = i47;
            if (i45 < 0) {
                i26Var.f = i47 + i45;
            }
            f1(didVar, i26Var);
        }
        return i44 - i26Var.a;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean R() {
        return true;
    }

    public final View R0(int i) {
        View viewW0 = W0(0, x(), i);
        if (viewW0 == null) {
            return null;
        }
        int i2 = ((int[]) this.w.c)[a.N(viewW0)];
        if (i2 == -1) {
            return null;
        }
        return S0(viewW0, (f26) this.v.get(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S0(android.view.View r6, defpackage.f26 r7) {
        /*
            r5 = this;
            boolean r0 = r5.e1()
            int r7 = r7.d
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.w(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.t
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            aw7 r3 = r5.B
            int r3 = r3.c(r6)
            aw7 r4 = r5.B
            int r4 = r4.c(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            aw7 r3 = r5.B
            int r3 = r3.f(r6)
            aw7 r4 = r5.B
            int r4 = r4.f(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.S0(android.view.View, f26):android.view.View");
    }

    public final View T0(int i) {
        View viewW0 = W0(x() - 1, -1, i);
        if (viewW0 == null) {
            return null;
        }
        return U0(viewW0, (f26) this.v.get(((int[]) this.w.c)[a.N(viewW0)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View U0(android.view.View r6, defpackage.f26 r7) {
        /*
            r5 = this;
            boolean r0 = r5.e1()
            int r1 = r5.x()
            int r1 = r1 + (-2)
            int r2 = r5.x()
            int r7 = r7.d
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.w(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.t
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            aw7 r3 = r5.B
            int r3 = r3.f(r6)
            aw7 r4 = r5.B
            int r4 = r4.f(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            aw7 r3 = r5.B
            int r3 = r3.c(r6)
            aw7 r4 = r5.B
            int r4 = r4.c(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.U0(android.view.View, f26):android.view.View");
    }

    public final View V0(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewW = w(i);
            int iK = K();
            int iM = M();
            int iL = this.n - L();
            int iJ = this.o - J();
            int iC = a.C(viewW) - ((ViewGroup.MarginLayoutParams) ((xhd) viewW.getLayoutParams())).leftMargin;
            int iG = a.G(viewW) - ((ViewGroup.MarginLayoutParams) ((xhd) viewW.getLayoutParams())).topMargin;
            int iF = a.F(viewW) + ((ViewGroup.MarginLayoutParams) ((xhd) viewW.getLayoutParams())).rightMargin;
            int iA = a.A(viewW) + ((ViewGroup.MarginLayoutParams) ((xhd) viewW.getLayoutParams())).bottomMargin;
            boolean z = iC >= iL || iF >= iK;
            boolean z2 = iG >= iJ || iA >= iM;
            if (z && z2) {
                return viewW;
            }
            i += i3;
        }
        return null;
    }

    public final View W0(int i, int i2, int i3) {
        int iN;
        P0();
        if (this.z == null) {
            i26 i26Var = new i26();
            i26Var.h = 1;
            this.z = i26Var;
        }
        int iM = this.B.m();
        int iH = this.B.h();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewW = w(i);
            if (viewW != null && (iN = a.N(viewW)) >= 0 && iN < i3) {
                if (((xhd) viewW.getLayoutParams()).a.q()) {
                    if (view2 == null) {
                        view2 = viewW;
                    }
                } else {
                    if (this.B.f(viewW) >= iM && this.B.c(viewW) <= iH) {
                        return viewW;
                    }
                    if (view == null) {
                        view = viewW;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.a
    public final void X() {
        s0();
    }

    public final int X0(int i, did didVar, iid iidVar, boolean z) {
        int iC1;
        int iH;
        if (e1() || !this.t) {
            int iH2 = this.B.h() - i;
            if (iH2 <= 0) {
                return 0;
            }
            iC1 = -c1(-iH2, didVar, iidVar);
        } else {
            int iM = i - this.B.m();
            if (iM <= 0) {
                return 0;
            }
            iC1 = c1(iM, didVar, iidVar);
        }
        int i2 = i + iC1;
        if (!z || (iH = this.B.h() - i2) <= 0) {
            return iC1;
        }
        this.B.r(iH);
        return iH + iC1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Y(RecyclerView recyclerView) {
        this.K = (View) recyclerView.getParent();
    }

    public final int Y0(int i, did didVar, iid iidVar, boolean z) {
        int iC1;
        int iM;
        if (e1() || !this.t) {
            int iM2 = i - this.B.m();
            if (iM2 <= 0) {
                return 0;
            }
            iC1 = -c1(iM2, didVar, iidVar);
        } else {
            int iH = this.B.h() - i;
            if (iH <= 0) {
                return 0;
            }
            iC1 = c1(-iH, didVar, iidVar);
        }
        int i2 = i + iC1;
        if (!z || (iM = i2 - this.B.m()) <= 0) {
            return iC1;
        }
        this.B.r(-iM);
        return iC1 - iM;
    }

    @Override // androidx.recyclerview.widget.a
    public final void Z(RecyclerView recyclerView) {
    }

    public final int Z0(View view) {
        int i;
        int i2;
        if (e1()) {
            i = ((xhd) view.getLayoutParams()).b.top;
            i2 = ((xhd) view.getLayoutParams()).b.bottom;
        } else {
            i = ((xhd) view.getLayoutParams()).b.left;
            i2 = ((xhd) view.getLayoutParams()).b.right;
        }
        return i + i2;
    }

    @Override // defpackage.hid
    public final PointF a(int i) {
        View viewW;
        if (x() == 0 || (viewW = w(0)) == null) {
            return null;
        }
        int i2 = i < a.N(viewW) ? -1 : 1;
        return e1() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    public final View a1(int i) {
        View view = (View) this.I.get(i);
        return view != null ? view : this.x.d(i);
    }

    public final int b1() {
        if (this.v.size() == 0) {
            return 0;
        }
        int size = this.v.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((f26) this.v.get(i)).a);
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c1(int r20, defpackage.did r21, defpackage.iid r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c1(int, did, iid):int");
    }

    public final int d1(int i) {
        if (x() == 0 || i == 0) {
            return 0;
        }
        P0();
        boolean zE1 = e1();
        View view = this.K;
        int width = zE1 ? view.getWidth() : view.getHeight();
        int i2 = zE1 ? this.n : this.o;
        int I = I();
        g26 g26Var = this.A;
        if (I == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + g26Var.d) - width, iAbs);
            }
            int i3 = g26Var.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - g26Var.d) - width, i);
            }
            int i4 = g26Var.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    public final boolean e1() {
        int i = this.p;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean f() {
        if (this.q == 0) {
            return e1();
        }
        if (!e1()) {
            return true;
        }
        int i = this.n;
        View view = this.K;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.a
    public final void f0(int i, int i2) {
        i1(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1(defpackage.did r10, defpackage.i26 r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.f1(did, i26):void");
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean g() {
        if (this.q == 0) {
            return !e1();
        }
        if (!e1()) {
            int i = this.o;
            View view = this.K;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final void g1(int i) {
        if (this.p != i) {
            s0();
            this.p = i;
            this.B = null;
            this.C = null;
            this.v.clear();
            g26 g26Var = this.A;
            g26.b(g26Var);
            g26Var.d = 0;
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean h(xhd xhdVar) {
        return xhdVar instanceof h26;
    }

    @Override // androidx.recyclerview.widget.a
    public final void h0(int i, int i2) {
        i1(Math.min(i, i2));
    }

    public final boolean h1(View view, int i, int i2, h26 h26Var) {
        return (!view.isLayoutRequested() && this.h && S(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) h26Var).width) && S(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) h26Var).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.a
    public final void i0(int i, int i2) {
        i1(i);
    }

    public final void i1(int i) {
        View viewV0 = V0(x() - 1, -1);
        if (i >= (viewV0 != null ? a.N(viewV0) : -1)) {
            return;
        }
        int iX = x();
        xa6 xa6Var = this.w;
        xa6Var.j(iX);
        xa6Var.k(iX);
        xa6Var.i(iX);
        if (i >= ((int[]) xa6Var.c).length) {
            return;
        }
        this.L = i;
        View viewW = w(0);
        if (viewW == null) {
            return;
        }
        this.E = a.N(viewW);
        if (e1() || !this.t) {
            this.F = this.B.f(viewW) - this.B.m();
        } else {
            this.F = this.B.i() + this.B.c(viewW);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final void j0(int i) {
        i1(i);
    }

    public final void j1(g26 g26Var, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = e1() ? this.m : this.l;
            this.z.b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.z.b = false;
        }
        if (e1() || !this.t) {
            this.z.a = this.B.h() - g26Var.c;
        } else {
            this.z.a = g26Var.c - L();
        }
        i26 i26Var = this.z;
        i26Var.d = g26Var.a;
        i26Var.h = 1;
        i26Var.e = g26Var.c;
        i26Var.f = Integer.MIN_VALUE;
        i26Var.c = g26Var.b;
        if (!z || this.v.size() <= 1 || (i = g26Var.b) < 0 || i >= this.v.size() - 1) {
            return;
        }
        f26 f26Var = (f26) this.v.get(g26Var.b);
        i26 i26Var2 = this.z;
        i26Var2.c++;
        i26Var2.d += f26Var.d;
    }

    @Override // androidx.recyclerview.widget.a
    public final void k0(RecyclerView recyclerView, int i, int i2) {
        i1(i);
        i1(i);
    }

    public final void k1(g26 g26Var, boolean z, boolean z2) {
        if (z2) {
            int i = e1() ? this.m : this.l;
            this.z.b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.z.b = false;
        }
        if (e1() || !this.t) {
            this.z.a = g26Var.c - this.B.m();
        } else {
            this.z.a = (this.K.getWidth() - g26Var.c) - this.B.m();
        }
        i26 i26Var = this.z;
        i26Var.d = g26Var.a;
        i26Var.h = -1;
        i26Var.e = g26Var.c;
        i26Var.f = Integer.MIN_VALUE;
        int i2 = g26Var.b;
        i26Var.c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.v.size();
        int i3 = g26Var.b;
        if (size > i3) {
            f26 f26Var = (f26) this.v.get(i3);
            i26 i26Var2 = this.z;
            i26Var2.c--;
            i26Var2.d -= f26Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int l(iid iidVar) {
        return M0(iidVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    @Override // androidx.recyclerview.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(defpackage.did r22, defpackage.iid r23) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.l0(did, iid):void");
    }

    public final void l1(View view, int i) {
        this.I.put(i, view);
    }

    @Override // androidx.recyclerview.widget.a
    public final int m(iid iidVar) {
        return N0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void m0(iid iidVar) {
        this.D = null;
        this.E = -1;
        this.F = Integer.MIN_VALUE;
        this.L = -1;
        g26.b(this.A);
        this.I.clear();
    }

    @Override // androidx.recyclerview.widget.a
    public final int n(iid iidVar) {
        return O0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final int o(iid iidVar) {
        return M0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final void o0(Parcelable parcelable) {
        if (parcelable instanceof j26) {
            this.D = (j26) parcelable;
            x0();
        }
    }

    @Override // androidx.recyclerview.widget.a
    public final int p(iid iidVar) {
        return N0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final Parcelable p0() {
        j26 j26Var = this.D;
        if (j26Var != null) {
            j26 j26Var2 = new j26();
            j26Var2.a = j26Var.a;
            j26Var2.b = j26Var.b;
            return j26Var2;
        }
        j26 j26Var3 = new j26();
        if (x() <= 0) {
            j26Var3.a = -1;
            return j26Var3;
        }
        View viewW = w(0);
        j26Var3.a = a.N(viewW);
        j26Var3.b = this.B.f(viewW) - this.B.m();
        return j26Var3;
    }

    @Override // androidx.recyclerview.widget.a
    public final int q(iid iidVar) {
        return O0(iidVar);
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd t() {
        h26 h26Var = new h26(-2, -2);
        h26Var.o = 0.0f;
        h26Var.X = 1.0f;
        h26Var.Y = -1;
        h26Var.Z = -1.0f;
        h26Var.u0 = 16777215;
        h26Var.v0 = 16777215;
        return h26Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final xhd u(Context context, AttributeSet attributeSet) {
        h26 h26Var = new h26(context, attributeSet);
        h26Var.o = 0.0f;
        h26Var.X = 1.0f;
        h26Var.Y = -1;
        h26Var.Z = -1.0f;
        h26Var.u0 = 16777215;
        h26Var.v0 = 16777215;
        return h26Var;
    }

    @Override // androidx.recyclerview.widget.a
    public final int y0(int i, did didVar, iid iidVar) {
        if (!e1() || this.q == 0) {
            int iC1 = c1(i, didVar, iidVar);
            this.I.clear();
            return iC1;
        }
        int iD1 = d1(i);
        this.A.d += iD1;
        this.C.r(-iD1);
        return iD1;
    }

    @Override // androidx.recyclerview.widget.a
    public final void z0(int i) {
        this.E = i;
        this.F = Integer.MIN_VALUE;
        j26 j26Var = this.D;
        if (j26Var != null) {
            j26Var.a = -1;
        }
        x0();
    }
}
