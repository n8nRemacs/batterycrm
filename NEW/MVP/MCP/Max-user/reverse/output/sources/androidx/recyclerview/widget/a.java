package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.c58;
import defpackage.did;
import defpackage.ggg;
import defpackage.hfh;
import defpackage.iid;
import defpackage.k5;
import defpackage.lid;
import defpackage.m5;
import defpackage.mc5;
import defpackage.mid;
import defpackage.phd;
import defpackage.qfh;
import defpackage.u5d;
import defpackage.uhd;
import defpackage.v32;
import defpackage.w7c;
import defpackage.w93;
import defpackage.whd;
import defpackage.wy1;
import defpackage.x6i;
import defpackage.xhd;
import defpackage.xpb;
import defpackage.z0f;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a {
    public ggg a;
    public RecyclerView b;
    public final xpb c;
    public final xpb d;
    public c58 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public a() {
        w7c w7cVar = new w7c(this);
        mc5 mc5Var = new mc5(28, this);
        this.c = new xpb(w7cVar);
        this.d = new xpb(mc5Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        return view.getBottom() + ((xhd) view.getLayoutParams()).b.bottom;
    }

    public static int C(View view) {
        return view.getLeft() - ((xhd) view.getLayoutParams()).b.left;
    }

    public static int D(View view) {
        Rect rect = ((xhd) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int E(View view) {
        Rect rect = ((xhd) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int F(View view) {
        return view.getRight() + ((xhd) view.getLayoutParams()).b.right;
    }

    public static int G(View view) {
        return view.getTop() - ((xhd) view.getLayoutParams()).b.top;
    }

    public static int N(View view) {
        return ((xhd) view.getLayoutParams()).a.h();
    }

    public static whd O(Context context, AttributeSet attributeSet, int i, int i2) {
        whd whdVar = new whd();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5d.RecyclerView, i, i2);
        whdVar.a = typedArrayObtainStyledAttributes.getInt(u5d.RecyclerView_android_orientation, 1);
        whdVar.b = typedArrayObtainStyledAttributes.getInt(u5d.RecyclerView_spanCount, 1);
        whdVar.c = typedArrayObtainStyledAttributes.getBoolean(u5d.RecyclerView_reverseLayout, false);
        whdVar.d = typedArrayObtainStyledAttributes.getBoolean(u5d.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return whdVar;
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

    public static int i(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.y(boolean, int, int, int, int):int");
    }

    public int A0(int i, did didVar, iid iidVar) {
        return 0;
    }

    public void B(Rect rect, View view) {
        RecyclerView.V(rect, view);
    }

    public final void B0(RecyclerView recyclerView) {
        C0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void C0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.O1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.O1) {
            return;
        }
        this.o = 0;
    }

    public void D0(Rect rect, int i, int i2) {
        int iL = L() + K() + rect.width();
        int iJ = J() + M() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = hfh.a;
        this.b.setMeasuredDimension(i(i, iL, recyclerView.getMinimumWidth()), i(i2, iJ, this.b.getMinimumHeight()));
    }

    public final void E0(int i, int i2) {
        int iX = x();
        if (iX == 0) {
            this.b.t(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iX; i7++) {
            View viewW = w(i7);
            Rect rect = this.b.w0;
            B(rect, viewW);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.w0.set(i6, i4, i3, i5);
        D0(this.b.w0, i, i2);
    }

    public final void F0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.s0;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    final boolean G0(View view, int i, int i2, xhd xhdVar) {
        return (!view.isLayoutRequested() && this.h && S(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) xhdVar).width) && S(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) xhdVar).height)) ? false : true;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        phd adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.j();
        }
        return 0;
    }

    public boolean H0() {
        return false;
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = hfh.a;
        return recyclerView.getLayoutDirection();
    }

    public final boolean I0(View view, int i, int i2, xhd xhdVar) {
        return (this.h && S(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) xhdVar).width) && S(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) xhdVar).height)) ? false : true;
    }

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public void J0(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int K() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void K0(c58 c58Var) {
        c58 c58Var2 = this.e;
        if (c58Var2 != null && c58Var != c58Var2 && c58Var2.e) {
            c58Var2.m();
        }
        this.e = c58Var;
        RecyclerView recyclerView = this.b;
        lid lidVar = recyclerView.o1;
        lidVar.Y.removeCallbacks(lidVar);
        lidVar.c.abortAnimation();
        if (c58Var.h) {
            Log.w("RecyclerView", "An instance of " + c58Var.getClass().getSimpleName() + " was started more than once. Each instance of" + c58Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c58Var.b = recyclerView;
        c58Var.c = this;
        int i = c58Var.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.r1.a = i;
        c58Var.e = true;
        c58Var.d = true;
        c58Var.f = recyclerView.A0.s(i);
        c58Var.b.o1.b();
        c58Var.h = true;
    }

    public final int L() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean L0() {
        return false;
    }

    public final int M() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int P(did didVar, iid iidVar) {
        return -1;
    }

    public final void Q(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((xhd) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.y0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean R();

    public void T(View view, int i, int i2, int i3, int i4) {
        xhd xhdVar = (xhd) view.getLayoutParams();
        Rect rect = xhdVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) xhdVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin);
    }

    public void U(View view) {
        xhd xhdVar = (xhd) view.getLayoutParams();
        Rect rectW = this.b.W(view);
        int i = rectW.left + rectW.right;
        int i2 = rectW.top + rectW.bottom;
        int iY = y(f(), this.n, this.l, L() + K() + ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin + ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin + i, ((ViewGroup.MarginLayoutParams) xhdVar).width);
        int iY2 = y(g(), this.o, this.m, J() + M() + ((ViewGroup.MarginLayoutParams) xhdVar).topMargin + ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) xhdVar).height);
        if (G0(view, iY, iY2, xhdVar)) {
            view.measure(iY, iY2);
        }
    }

    public void V(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iK = recyclerView.s0.K();
            for (int i2 = 0; i2 < iK; i2++) {
                recyclerView.s0.J(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void W(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.c0(i);
        }
    }

    public void X() {
    }

    public void Y(RecyclerView recyclerView) {
    }

    public void Z(RecyclerView recyclerView) {
    }

    public View a0(View view, int i, did didVar, iid iidVar) {
        return null;
    }

    public final void b(View view) {
        c(-1, view, false);
    }

    public void b0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        did didVar = recyclerView.c;
        iid iidVar = recyclerView.r1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        phd phdVar = this.b.z0;
        if (phdVar != null) {
            accessibilityEvent.setItemCount(phdVar.j());
        }
    }

    public final void c(int i, View view, boolean z) {
        mid midVarU = RecyclerView.U(view);
        if (z || midVarU.q()) {
            z0f z0fVar = (z0f) this.b.t0.b;
            qfh qfhVarA = (qfh) z0fVar.get(midVarU);
            if (qfhVarA == null) {
                qfhVarA = qfh.a();
                z0fVar.put(midVarU, qfhVarA);
            }
            qfhVarA.a |= 1;
        } else {
            this.b.t0.x(midVarU);
        }
        xhd xhdVar = (xhd) view.getLayoutParams();
        if (midVarU.y() || midVarU.r()) {
            if (midVarU.r()) {
                midVarU.x0.l(midVarU);
            } else {
                midVarU.t0 &= -33;
            }
            this.a.r(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            ggg gggVar = this.a;
            v32 v32Var = (v32) gggVar.o;
            int iIndexOfChild = ((RecyclerView) ((x6i) gggVar.d).b).indexOfChild(view);
            int iU = (iIndexOfChild == -1 || v32Var.W(iIndexOfChild)) ? -1 : iIndexOfChild - v32Var.U(iIndexOfChild);
            if (i == -1) {
                i = this.a.K();
            }
            if (iU == -1) {
                StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb.append(this.b.indexOfChild(view));
                throw new IllegalStateException(wy1.f(this.b, sb));
            }
            if (iU != i) {
                a aVar = this.b.A0;
                View viewW = aVar.w(iU);
                if (viewW == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iU + aVar.b.toString());
                }
                aVar.w(iU);
                aVar.a.E(iU);
                xhd xhdVar2 = (xhd) viewW.getLayoutParams();
                mid midVarU2 = RecyclerView.U(viewW);
                if (midVarU2.q()) {
                    z0f z0fVar2 = (z0f) aVar.b.t0.b;
                    qfh qfhVarA2 = (qfh) z0fVar2.get(midVarU2);
                    if (qfhVarA2 == null) {
                        qfhVarA2 = qfh.a();
                        z0fVar2.put(midVarU2, qfhVarA2);
                    }
                    qfhVarA2.a = 1 | qfhVarA2.a;
                } else {
                    aVar.b.t0.x(midVarU2);
                }
                aVar.a.r(viewW, i, xhdVar2, midVarU2.q());
            }
        } else {
            this.a.p(i, view, false);
            xhdVar.c = true;
            c58 c58Var = this.e;
            if (c58Var != null && c58Var.e) {
                c58Var.b.getClass();
                if (RecyclerView.S(view) == c58Var.a) {
                    c58Var.f = view;
                    if (RecyclerView.L1) {
                        Log.d("RecyclerView", "smooth scroll target view has been attached");
                    }
                }
            }
        }
        if (xhdVar.d) {
            if (RecyclerView.L1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + xhdVar.a);
            }
            midVarU.a.invalidate();
            xhdVar.d = false;
        }
    }

    public void c0(did didVar, iid iidVar, m5 m5Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            m5Var.a(8192);
            m5Var.j(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            m5Var.a(4096);
            m5Var.j(true);
        }
        m5Var.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k5.a(P(didVar, iidVar), z(didVar, iidVar), 0).a);
    }

    public void d(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.n(str);
        }
    }

    public void d0(did didVar, iid iidVar, View view, m5 m5Var) {
    }

    public final void e(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.W(view));
        }
    }

    public final void e0(View view, m5 m5Var) {
        mid midVarU = RecyclerView.U(view);
        if (midVarU == null || midVarU.q()) {
            return;
        }
        ggg gggVar = this.a;
        if (((ArrayList) gggVar.X).contains(midVarU.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        d0(recyclerView.c, recyclerView.r1, view, m5Var);
    }

    public abstract boolean f();

    public void f0(int i, int i2) {
    }

    public boolean g() {
        return false;
    }

    public void g0() {
    }

    public boolean h(xhd xhdVar) {
        return xhdVar != null;
    }

    public void h0(int i, int i2) {
    }

    public void i0(int i, int i2) {
    }

    public void j(int i, int i2, iid iidVar, w93 w93Var) {
    }

    public void j0(int i) {
    }

    public void k(int i, w93 w93Var) {
    }

    public void k0(RecyclerView recyclerView, int i, int i2) {
        j0(i);
    }

    public int l(iid iidVar) {
        return 0;
    }

    public abstract void l0(did didVar, iid iidVar);

    public int m(iid iidVar) {
        return 0;
    }

    public void m0(iid iidVar) {
    }

    public int n(iid iidVar) {
        return 0;
    }

    public void n0(iid iidVar, int i, int i2) {
        this.b.t(i, i2);
    }

    public int o(iid iidVar) {
        return 0;
    }

    public void o0(Parcelable parcelable) {
    }

    public int p(iid iidVar) {
        return 0;
    }

    public Parcelable p0() {
        return null;
    }

    public int q(iid iidVar) {
        return 0;
    }

    public void q0(int i) {
    }

    public final void r(did didVar) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            View viewW = w(iX);
            mid midVarU = RecyclerView.U(viewW);
            if (midVarU.x()) {
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "ignoring view " + midVarU);
                }
            } else if (!midVarU.o() || midVarU.q() || this.b.z0.b) {
                w(iX);
                this.a.E(iX);
                didVar.j(viewW);
                this.b.t0.x(midVarU);
            } else {
                if (w(iX) != null) {
                    this.a.b0(iX);
                }
                didVar.i(midVarU);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[PHI: r3
  0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r0(defpackage.did r3, defpackage.iid r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r2.b
            r4 = 0
            if (r3 != 0) goto L7
            goto L8f
        L7:
            int r3 = r2.o
            int r6 = r2.n
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView r1 = r2.b
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L2c
            int r3 = r0.height()
            int r6 = r0.width()
        L2c:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L64
            r0 = 8192(0x2000, float:1.148E-41)
            if (r5 == r0) goto L38
            r3 = r4
            r5 = r3
            goto L8b
        L38:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L4d
            int r5 = r2.M()
            int r3 = r3 - r5
            int r5 = r2.J()
            int r3 = r3 - r5
            int r3 = -r3
            goto L4e
        L4d:
            r3 = r4
        L4e:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L62
            int r5 = r2.K()
            int r6 = r6 - r5
            int r5 = r2.L()
            int r6 = r6 - r5
            int r5 = -r6
            goto L8b
        L62:
            r5 = r4
            goto L8b
        L64:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L77
            int r5 = r2.M()
            int r3 = r3 - r5
            int r5 = r2.J()
            int r3 = r3 - r5
            goto L78
        L77:
            r3 = r4
        L78:
            androidx.recyclerview.widget.RecyclerView r5 = r2.b
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L62
            int r5 = r2.K()
            int r6 = r6 - r5
            int r5 = r2.L()
            int r5 = r6 - r5
        L8b:
            if (r3 != 0) goto L90
            if (r5 != 0) goto L90
        L8f:
            return r4
        L90:
            androidx.recyclerview.widget.RecyclerView r4 = r2.b
            r4.A0(r5, r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.r0(did, iid, int, android.os.Bundle):boolean");
    }

    public View s(int i) {
        int iX = x();
        for (int i2 = 0; i2 < iX; i2++) {
            View viewW = w(i2);
            mid midVarU = RecyclerView.U(viewW);
            if (midVarU != null && midVarU.h() == i && !midVarU.x() && (this.b.r1.h || !midVarU.q())) {
                return viewW;
            }
        }
        return null;
    }

    public final void s0() {
        for (int iX = x() - 1; iX >= 0; iX--) {
            this.a.b0(iX);
        }
    }

    public abstract xhd t();

    public final void t0(did didVar) {
        for (int iX = x() - 1; iX >= 0; iX--) {
            if (!RecyclerView.U(w(iX)).x()) {
                View viewW = w(iX);
                if (w(iX) != null) {
                    this.a.b0(iX);
                }
                didVar.h(viewW);
            }
        }
    }

    public xhd u(Context context, AttributeSet attributeSet) {
        return new xhd(context, attributeSet);
    }

    public final void u0(did didVar) {
        int size = didVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((mid) didVar.a.get(i)).a;
            mid midVarU = RecyclerView.U(view);
            if (!midVarU.x()) {
                midVarU.w(false);
                if (midVarU.s()) {
                    this.b.removeDetachedView(view, false);
                }
                uhd uhdVar = this.b.Z0;
                if (uhdVar != null) {
                    uhdVar.d(midVarU);
                }
                midVarU.w(true);
                mid midVarU2 = RecyclerView.U(view);
                midVarU2.x0 = null;
                midVarU2.y0 = false;
                midVarU2.t0 &= -33;
                didVar.i(midVarU2);
            }
        }
        didVar.a.clear();
        ArrayList arrayList = didVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public xhd v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xhd ? new xhd((xhd) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new xhd((ViewGroup.MarginLayoutParams) layoutParams) : new xhd(layoutParams);
    }

    public final void v0(View view, did didVar) {
        ggg gggVar = this.a;
        x6i x6iVar = (x6i) gggVar.d;
        int i = gggVar.b;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            gggVar.b = 1;
            gggVar.c = view;
            int iIndexOfChild = ((RecyclerView) x6iVar.b).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((v32) gggVar.o).d0(iIndexOfChild)) {
                    gggVar.g0(view);
                }
                x6iVar.w(iIndexOfChild);
            }
            gggVar.b = 0;
            gggVar.c = null;
            didVar.h(view);
        } catch (Throwable th) {
            gggVar.b = 0;
            gggVar.c = null;
            throw th;
        }
    }

    public final View w(int i) {
        ggg gggVar = this.a;
        if (gggVar != null) {
            return gggVar.J(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.K()
            int r1 = r8.M()
            int r2 = r8.n
            int r3 = r8.L()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.J()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.I()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.K()
            int r2 = r8.M()
            int r3 = r8.n
            int r4 = r8.L()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.J()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.w0
            r8.B(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.A0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.w0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final int x() {
        ggg gggVar = this.a;
        if (gggVar != null) {
            return gggVar.K();
        }
        return 0;
    }

    public final void x0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int y0(int i, did didVar, iid iidVar);

    public int z(did didVar, iid iidVar) {
        return -1;
    }

    public void z0(int i) {
        if (RecyclerView.L1) {
            Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
        }
    }
}
