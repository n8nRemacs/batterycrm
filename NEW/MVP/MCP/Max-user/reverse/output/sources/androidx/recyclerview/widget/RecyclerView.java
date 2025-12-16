package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a6c;
import defpackage.a9;
import defpackage.aid;
import defpackage.az1;
import defpackage.b6c;
import defpackage.beg;
import defpackage.bid;
import defpackage.br5;
import defpackage.c58;
import defpackage.cvc;
import defpackage.cwc;
import defpackage.did;
import defpackage.eid;
import defpackage.ek8;
import defpackage.fid;
import defpackage.ggg;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.ifh;
import defpackage.iid;
import defpackage.jid;
import defpackage.kd5;
import defpackage.kid;
import defpackage.kt;
import defpackage.lid;
import defpackage.mid;
import defpackage.ohd;
import defpackage.oid;
import defpackage.pda;
import defpackage.phd;
import defpackage.qfh;
import defpackage.rda;
import defpackage.s6b;
import defpackage.shd;
import defpackage.ssb;
import defpackage.t9f;
import defpackage.thd;
import defpackage.u5d;
import defpackage.uhd;
import defpackage.un4;
import defpackage.v32;
import defpackage.ve3;
import defpackage.veh;
import defpackage.vhd;
import defpackage.w3e;
import defpackage.w93;
import defpackage.wq6;
import defpackage.wy1;
import defpackage.x6i;
import defpackage.x9j;
import defpackage.xhd;
import defpackage.xrf;
import defpackage.y6i;
import defpackage.yeh;
import defpackage.yhd;
import defpackage.ys7;
import defpackage.z0f;
import defpackage.z8;
import defpackage.zhd;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements w3e, pda {
    public static boolean K1 = false;
    public static boolean L1 = false;
    public static final int[] M1 = {R.attr.nestedScrollingEnabled};
    public static final float N1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean O1 = true;
    public static final boolean P1 = true;
    public static final boolean Q1 = true;
    public static final Class[] R1;
    public static final ys7 S1;
    public static final jid T1;
    public a A0;
    public rda A1;
    public final ArrayList B0;
    public final int[] B1;
    public final ArrayList C0;
    public final int[] C1;
    public final ArrayList D0;
    public final int[] D1;
    public aid E0;
    public final ArrayList E1;
    public boolean F0;
    public final ohd F1;
    public boolean G0;
    public boolean G1;
    public boolean H0;
    public int H1;
    public int I0;
    public int I1;
    public boolean J0;
    public final t9f J1;
    public boolean K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public final AccessibilityManager O0;
    public ArrayList P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public thd U0;
    public EdgeEffect V0;
    public EdgeEffect W0;
    public EdgeEffect X0;
    public EdgeEffect Y0;
    public uhd Z0;
    public final float a;
    public int a1;
    public final kd5 b;
    public int b1;
    public final did c;
    public VelocityTracker c1;
    public fid d;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public zhd i1;
    public final int j1;
    public final int k1;
    public final float l1;
    public final float m1;
    public boolean n1;
    public final a9 o;
    public final lid o1;
    public wq6 p1;
    public final w93 q1;
    public final iid r1;
    public final ggg s0;
    public bid s1;
    public final ssb t0;
    public ArrayList t1;
    public boolean u0;
    public boolean u1;
    public final ohd v0;
    public boolean v1;
    public final Rect w0;
    public final s6b w1;
    public final Rect x0;
    public boolean x1;
    public final RectF y0;
    public oid y1;
    public phd z0;
    public final int[] z1;

    static {
        Class cls = Integer.TYPE;
        R1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        S1 = new ys7(2);
        T1 = new jid();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cvc.recyclerViewStyle);
    }

    public static RecyclerView L(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewL = L(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static int R(View view) {
        mid midVarU = U(view);
        if (midVarU != null) {
            return midVarU.f();
        }
        return -1;
    }

    public static int S(View view) {
        mid midVarU = U(view);
        if (midVarU != null) {
            return midVarU.h();
        }
        return -1;
    }

    public static mid U(View view) {
        if (view == null) {
            return null;
        }
        return ((xhd) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        xhd xhdVar = (xhd) view.getLayoutParams();
        Rect rect2 = xhdVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) xhdVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) xhdVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) xhdVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) xhdVar).bottomMargin);
    }

    private rda getScrollingChildHelper() {
        if (this.A1 == null) {
            this.A1 = new rda(this);
        }
        return this.A1;
    }

    public static void o(mid midVar) {
        WeakReference weakReference = midVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == midVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            midVar.b = null;
        }
    }

    public static int r(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && x9j.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(x9j.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || x9j.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(x9j.b(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        K1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        L1 = z;
    }

    public final void A(int i, int i2) {
        this.T0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        bid bidVar = this.s1;
        if (bidVar != null) {
            bidVar.b(this, i, i2);
        }
        ArrayList arrayList = this.t1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bid) this.t1.get(size)).b(this, i, i2);
            }
        }
        this.T0--;
    }

    public final void A0(int i, int i2, boolean z) {
        a aVar = this.A0;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K0) {
            return;
        }
        if (!aVar.f()) {
            i = 0;
        }
        if (!this.A0.g()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.o1.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void B() {
        if (this.Y0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U0.a(this, 3);
        this.Y0 = edgeEffectA;
        if (this.u0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void B0(int i) {
        if (this.K0) {
            return;
        }
        a aVar = this.A0;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.J0(this, i);
        }
    }

    public final void C() {
        if (this.V0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U0.a(this, 0);
        this.V0 = edgeEffectA;
        if (this.u0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C0() {
        int i = this.I0 + 1;
        this.I0 = i;
        if (i != 1 || this.K0) {
            return;
        }
        this.J0 = false;
    }

    public final void D() {
        if (this.X0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U0.a(this, 2);
        this.X0 = edgeEffectA;
        if (this.u0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void D0(boolean z) {
        if (this.I0 < 1) {
            if (K1) {
                throw new IllegalStateException(wy1.f(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.I0 = 1;
        }
        if (!z && !this.K0) {
            this.J0 = false;
        }
        if (this.I0 == 1) {
            if (z && this.J0 && !this.K0 && this.A0 != null && this.z0 != null) {
                v();
            }
            if (!this.K0) {
                this.J0 = false;
            }
        }
        this.I0--;
    }

    public final void E() {
        if (this.W0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.U0.a(this, 1);
        this.W0 = edgeEffectA;
        if (this.u0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void E0() {
        c58 c58Var;
        setScrollState(0);
        lid lidVar = this.o1;
        lidVar.Y.removeCallbacks(lidVar);
        lidVar.c.abortAnimation();
        a aVar = this.A0;
        if (aVar == null || (c58Var = aVar.e) == null) {
            return;
        }
        c58Var.m();
    }

    public final String F() {
        return " " + super.toString() + ", adapter:" + this.z0 + ", layout:" + this.A0 + ", context:" + getContext();
    }

    public final void G(iid iidVar) {
        if (getScrollState() != 2) {
            iidVar.getClass();
            return;
        }
        OverScroller overScroller = this.o1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        iidVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View H(float f, float f2) {
        for (int iK = this.s0.K() - 1; iK >= 0; iK--) {
            View viewJ = this.s0.J(iK);
            float translationX = viewJ.getTranslationX();
            float translationY = viewJ.getTranslationY();
            if (f >= viewJ.getLeft() + translationX && f <= viewJ.getRight() + translationX && f2 >= viewJ.getTop() + translationY && f2 <= viewJ.getBottom() + translationY) {
                return viewJ;
            }
        }
        return null;
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean J(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aid aidVar = (aid) arrayList.get(i);
            if (aidVar.c(this, motionEvent) && action != 3) {
                this.E0 = aidVar;
                return true;
            }
        }
        return false;
    }

    public final void K(int[] iArr) {
        int iK = this.s0.K();
        if (iK == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iK; i3++) {
            mid midVarU = U(this.s0.J(i3));
            if (!midVarU.x()) {
                int iH = midVarU.h();
                if (iH < i) {
                    i = iH;
                }
                if (iH > i2) {
                    i2 = iH;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final mid M(int i) {
        mid midVar = null;
        if (this.Q0) {
            return null;
        }
        int iO = this.s0.O();
        for (int i2 = 0; i2 < iO; i2++) {
            mid midVarU = U(this.s0.N(i2));
            if (midVarU != null && !midVarU.q() && P(midVarU) == i) {
                if (!((ArrayList) this.s0.X).contains(midVarU.a)) {
                    return midVarU;
                }
                midVar = midVarU;
            }
        }
        return midVar;
    }

    public final mid N(long j) {
        phd phdVar = this.z0;
        mid midVar = null;
        if (phdVar != null && phdVar.b) {
            int iO = this.s0.O();
            for (int i = 0; i < iO; i++) {
                mid midVarU = U(this.s0.N(i));
                if (midVarU != null && !midVarU.q() && midVarU.o == j) {
                    if (!((ArrayList) this.s0.X).contains(midVarU.a)) {
                        return midVarU;
                    }
                    midVar = midVarU;
                }
            }
        }
        return midVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0230 A[PHI: r19 r20 r23
  0x0230: PHI (r19v4 boolean) = 
  (r19v2 boolean)
  (r19v2 boolean)
  (r19v2 boolean)
  (r19v2 boolean)
  (r19v2 boolean)
  (r19v2 boolean)
  (r19v6 boolean)
  (r19v6 boolean)
  (r19v6 boolean)
  (r19v7 boolean)
 binds: [B:170:0x023c, B:173:0x0243, B:176:0x024a, B:179:0x0251, B:182:0x025d, B:199:0x029a, B:148:0x01f9, B:164:0x0228, B:165:0x022a, B:110:0x016c] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r20v4 int) = 
  (r20v2 int)
  (r20v2 int)
  (r20v2 int)
  (r20v2 int)
  (r20v2 int)
  (r20v2 int)
  (r20v5 int)
  (r20v5 int)
  (r20v5 int)
  (r20v9 int)
 binds: [B:170:0x023c, B:173:0x0243, B:176:0x024a, B:179:0x0251, B:182:0x025d, B:199:0x029a, B:148:0x01f9, B:164:0x0228, B:165:0x022a, B:110:0x016c] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r23v5 boolean) = 
  (r23v3 boolean)
  (r23v3 boolean)
  (r23v3 boolean)
  (r23v3 boolean)
  (r23v3 boolean)
  (r23v3 boolean)
  (r23v6 boolean)
  (r23v6 boolean)
  (r23v6 boolean)
  (r23v7 boolean)
 binds: [B:170:0x023c, B:173:0x0243, B:176:0x024a, B:179:0x0251, B:182:0x025d, B:199:0x029a, B:148:0x01f9, B:164:0x0228, B:165:0x022a, B:110:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.O(int, int):boolean");
    }

    public final int P(mid midVar) {
        if ((midVar.t0 & 524) == 0 && midVar.m()) {
            int i = midVar.c;
            ArrayList arrayList = (ArrayList) this.o.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                z8 z8Var = (z8) arrayList.get(i2);
                int i3 = z8Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = z8Var.b;
                        if (i4 <= i) {
                            int i5 = z8Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = z8Var.b;
                        if (i6 == i) {
                            i = z8Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (z8Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (z8Var.b <= i) {
                    i += z8Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long Q(mid midVar) {
        return this.z0.b ? midVar.o : midVar.c;
    }

    public final mid T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect W(View view) {
        xhd xhdVar = (xhd) view.getLayoutParams();
        boolean z = xhdVar.c;
        Rect rect = xhdVar.b;
        if (z) {
            iid iidVar = this.r1;
            if (!iidVar.h || (!xhdVar.a.t() && !xhdVar.a.o())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.C0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.w0;
                    rect2.set(0, 0, 0, 0);
                    ((vhd) arrayList.get(i)).f(rect2, view, this, iidVar);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                xhdVar.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean X() {
        return !this.H0 || this.Q0 || this.o.u();
    }

    public void Y() {
        if (this.C0.size() == 0) {
            return;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.d("Cannot invalidate item decorations during a scroll or layout");
        }
        b0();
        requestLayout();
    }

    public final boolean Z() {
        return this.S0 > 0;
    }

    @Override // defpackage.pda
    public final void a(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void a0(int i) {
        if (this.A0 == null) {
            return;
        }
        setScrollState(2);
        this.A0.z0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        a aVar = this.A0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        int iO = this.s0.O();
        for (int i = 0; i < iO; i++) {
            ((xhd) this.s0.N(i).getLayoutParams()).c = true;
        }
        did didVar = this.c;
        int size = didVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            xhd xhdVar = (xhd) ((mid) didVar.c.get(i2)).a.getLayoutParams();
            if (xhdVar != null) {
                xhdVar.c = true;
            }
        }
    }

    public final void c0(int i) {
        int iK = this.s0.K();
        for (int i2 = 0; i2 < iK; i2++) {
            this.s0.J(i2).offsetTopAndBottom(i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof xhd) && this.A0.h((xhd) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a aVar = this.A0;
        if (aVar != null && aVar.f()) {
            return this.A0.l(this.r1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a aVar = this.A0;
        if (aVar != null && aVar.f()) {
            return this.A0.m(this.r1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a aVar = this.A0;
        if (aVar != null && aVar.f()) {
            return this.A0.n(this.r1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a aVar = this.A0;
        if (aVar != null && aVar.g()) {
            return this.A0.o(this.r1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a aVar = this.A0;
        if (aVar != null && aVar.g()) {
            return this.A0.p(this.r1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a aVar = this.A0;
        if (aVar != null && aVar.g()) {
            return this.A0.q(this.r1);
        }
        return 0;
    }

    public final void d0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iO = this.s0.O();
        for (int i4 = 0; i4 < iO; i4++) {
            mid midVarU = U(this.s0.N(i4));
            if (midVarU != null && !midVarU.x()) {
                int i5 = midVarU.c;
                iid iidVar = this.r1;
                if (i5 >= i3) {
                    if (L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + midVarU + " now at position " + (midVarU.c - i2));
                    }
                    midVarU.u(-i2, z);
                    iidVar.g = true;
                } else if (i5 >= i) {
                    if (L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + midVarU + " now REMOVED");
                    }
                    midVarU.e(8);
                    midVarU.u(-i2, z);
                    midVarU.c = i - 1;
                    iidVar.g = true;
                }
            }
        }
        did didVar = this.c;
        for (int size = didVar.c.size() - 1; size >= 0; size--) {
            mid midVar = (mid) didVar.c.get(size);
            if (midVar != null) {
                int i6 = midVar.c;
                if (i6 >= i3) {
                    if (L1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + midVar + " now at position " + (midVar.c - i2));
                    }
                    midVar.u(-i2, z);
                } else if (i6 >= i) {
                    midVar.e(8);
                    didVar.g(size);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((vhd) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.V0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.u0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.V0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.W0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.u0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.W0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.X0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.u0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.X0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.Y0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.u0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.Y0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.Z0 == null || arrayList.size() <= 0 || !this.Z0.g()) ? z : true) {
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        this.S0++;
    }

    public final void f0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.S0 - 1;
        this.S0 = i2;
        if (i2 < 1) {
            if (K1 && i2 < 0) {
                throw new IllegalStateException(wy1.f(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.S0 = 0;
            if (z) {
                int i3 = this.M0;
                this.M0 = 0;
                if (i3 != 0 && (accessibilityManager = this.O0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.E1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mid midVar = (mid) arrayList.get(size);
                    if (midVar.a.getParent() == this && !midVar.x() && (i = midVar.A0) != -1) {
                        View view = midVar.a;
                        WeakHashMap weakHashMap = hfh.a;
                        view.setImportantForAccessibility(i);
                        midVar.A0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.b1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.b1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f1 = x;
            this.d1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.g1 = y;
            this.e1 = y;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.A0;
        if (aVar != null) {
            return aVar.t();
        }
        throw new IllegalStateException(wy1.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.A0;
        if (aVar != null) {
            return aVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(wy1.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public phd getAdapter() {
        return this.z0;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.A0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.u0;
    }

    public oid getCompatAccessibilityDelegate() {
        return this.y1;
    }

    public thd getEdgeEffectFactory() {
        return this.U0;
    }

    public uhd getItemAnimator() {
        return this.Z0;
    }

    public int getItemDecorationCount() {
        return this.C0.size();
    }

    public a getLayoutManager() {
        return this.A0;
    }

    public int getMaxFlingVelocity() {
        return this.k1;
    }

    public int getMinFlingVelocity() {
        return this.j1;
    }

    public long getNanoTime() {
        if (Q1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public zhd getOnFlingListener() {
        return this.i1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.n1;
    }

    public b getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.a1;
    }

    public void h0() {
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(mid midVar) {
        View view = midVar.a;
        boolean z = view.getParent() == this;
        this.c.l(T(view));
        if (midVar.s()) {
            this.s0.r(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.s0.p(-1, view, true);
            return;
        }
        ggg gggVar = this.s0;
        int iIndexOfChild = ((RecyclerView) ((x6i) gggVar.d).b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((v32) gggVar.o).f0(iIndexOfChild);
            gggVar.P(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void i0() {
        if (this.x1 || !this.F0) {
            return;
        }
        WeakHashMap weakHashMap = hfh.a;
        postOnAnimation(this.F1);
        this.x1 = true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.F0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.K0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(vhd vhdVar) {
        a aVar = this.A0;
        if (aVar != null) {
            aVar.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.C0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(vhdVar);
        b0();
        requestLayout();
    }

    public final void j0() {
        boolean z;
        boolean z2 = false;
        if (this.Q0) {
            a9 a9Var = this.o;
            a9Var.C((ArrayList) a9Var.c);
            a9Var.C((ArrayList) a9Var.d);
            a9Var.a = 0;
            if (this.R0) {
                this.A0.g0();
            }
        }
        if (this.Z0 == null || !this.A0.L0()) {
            this.o.m();
        } else {
            this.o.B();
        }
        boolean z3 = this.u1 || this.v1;
        boolean z4 = this.H0 && this.Z0 != null && ((z = this.Q0) || z3 || this.A0.f) && (!z || this.z0.b);
        iid iidVar = this.r1;
        iidVar.k = z4;
        if (z4 && z3 && !this.Q0 && this.Z0 != null && this.A0.L0()) {
            z2 = true;
        }
        iidVar.l = z2;
    }

    public final void k(yhd yhdVar) {
        if (this.P0 == null) {
            this.P0 = new ArrayList();
        }
        this.P0.add(yhdVar);
    }

    public final void k0(boolean z) {
        this.R0 = z | this.R0;
        this.Q0 = true;
        int iO = this.s0.O();
        for (int i = 0; i < iO; i++) {
            mid midVarU = U(this.s0.N(i));
            if (midVarU != null && !midVarU.x()) {
                midVarU.e(6);
            }
        }
        b0();
        did didVar = this.c;
        int size = didVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            mid midVar = (mid) didVar.c.get(i2);
            if (midVar != null) {
                midVar.e(6);
                midVar.e(1024);
            }
        }
        phd phdVar = didVar.h.z0;
        if (phdVar == null || !phdVar.b) {
            didVar.f();
        }
    }

    public final void l(aid aidVar) {
        this.D0.add(aidVar);
    }

    public final void l0(mid midVar, kt ktVar) {
        midVar.t0 &= -8193;
        boolean z = this.r1.i;
        ssb ssbVar = this.t0;
        if (z && midVar.t() && !midVar.q() && !midVar.x()) {
            ((ek8) ssbVar.c).e(Q(midVar), midVar);
        }
        z0f z0fVar = (z0f) ssbVar.b;
        qfh qfhVarA = (qfh) z0fVar.get(midVar);
        if (qfhVarA == null) {
            qfhVarA = qfh.a();
            z0fVar.put(midVar, qfhVarA);
        }
        qfhVarA.b = ktVar;
        qfhVarA.a |= 4;
    }

    public void m(bid bidVar) {
        if (this.t1 == null) {
            this.t1 = new ArrayList();
        }
        this.t1.add(bidVar);
    }

    public final int m0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.V0;
        float f2 = 0.0f;
        if (edgeEffect == null || x9j.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.X0;
            if (edgeEffect2 != null && x9j.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.X0.onRelease();
                } else {
                    float fB = x9j.b(this.X0, width, height);
                    if (x9j.a(this.X0) == 0.0f) {
                        this.X0.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.V0.onRelease();
            } else {
                float f3 = -x9j.b(this.V0, -width, 1.0f - height);
                if (x9j.a(this.V0) == 0.0f) {
                    this.V0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final void n(String str) {
        if (Z()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(wy1.f(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.T0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(wy1.f(this, new StringBuilder(""))));
        }
    }

    public final int n0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.W0;
        float f2 = 0.0f;
        if (edgeEffect == null || x9j.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Y0;
            if (edgeEffect2 != null && x9j.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.Y0.onRelease();
                } else {
                    float fB = x9j.b(this.Y0, height, 1.0f - width);
                    if (x9j.a(this.Y0) == 0.0f) {
                        this.Y0.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.W0.onRelease();
            } else {
                float f3 = -x9j.b(this.W0, -height, width);
                if (x9j.a(this.W0) == 0.0f) {
                    this.W0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void o0() {
        uhd uhdVar = this.Z0;
        if (uhdVar != null) {
            uhdVar.e();
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.t0(this.c);
            this.A0.u0(this.c);
        }
        did didVar = this.c;
        didVar.a.clear();
        didVar.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.S0 = r0
            r1 = 1
            r5.F0 = r1
            boolean r2 = r5.H0
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.H0 = r2
            did r2 = r5.c
            r2.e()
            androidx.recyclerview.widget.a r2 = r5.A0
            if (r2 == 0) goto L26
            r2.g = r1
            r2.Y(r5)
        L26:
            r5.x1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.Q1
            if (r0 == 0) goto L8e
            java.lang.ThreadLocal r0 = defpackage.wq6.o
            java.lang.Object r1 = r0.get()
            wq6 r1 = (defpackage.wq6) r1
            r5.p1 = r1
            if (r1 != 0) goto L74
            wq6 r1 = new wq6
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.d = r2
            r5.p1 = r1
            java.util.WeakHashMap r1 = defpackage.hfh.a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            wq6 r2 = r5.p1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L74:
            wq6 r0 = r5.p1
            java.util.ArrayList r0 = r0.a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.K1
            if (r1 == 0) goto L8b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L83
            goto L8b
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8b:
            r0.add(r5)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        wq6 wq6Var;
        super.onDetachedFromWindow();
        uhd uhdVar = this.Z0;
        if (uhdVar != null) {
            uhdVar.e();
        }
        E0();
        int i = 0;
        this.F0 = false;
        a aVar = this.A0;
        if (aVar != null) {
            aVar.g = false;
            aVar.Z(this);
        }
        this.E1.clear();
        removeCallbacks(this.F1);
        this.t0.getClass();
        while (qfh.d.a() != null) {
        }
        did didVar = this.c;
        for (int i2 = 0; i2 < didVar.c.size(); i2++) {
            a6c.a(((mid) didVar.c.get(i2)).a);
        }
        phd phdVar = didVar.h.z0;
        b bVar = didVar.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(phdVar, false);
        }
        int i3 = a6c.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i5 = a6c.a;
            b6c b6cVar = (b6c) childAt.getTag(i5);
            if (b6cVar == null) {
                b6cVar = new b6c();
                childAt.setTag(i5, b6cVar);
            }
            ArrayList arrayList = b6cVar.a;
            int i6 = ve3.i(arrayList);
            if (-1 < i6) {
                throw xrf.n(arrayList, i6);
            }
            i = i4;
        }
        if (!Q1 || (wq6Var = this.p1) == null) {
            return;
        }
        boolean zRemove = wq6Var.a.remove(this);
        if (K1 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.p1 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vhd) arrayList.get(i)).g(canvas, this, this.r1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.K0) {
            this.E0 = null;
            if (J(motionEvent)) {
                u0();
                setScrollState(0);
                return true;
            }
            a aVar = this.A0;
            if (aVar != null) {
                boolean zF = aVar.f();
                boolean zG = this.A0.g();
                if (this.c1 == null) {
                    this.c1 = VelocityTracker.obtain();
                }
                this.c1.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.L0) {
                        this.L0 = false;
                    }
                    this.b1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f1 = x;
                    this.d1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.g1 = y;
                    this.e1 = y;
                    EdgeEffect edgeEffect = this.V0;
                    if (edgeEffect == null || x9j.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        x9j.b(this.V0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.X0;
                    boolean z3 = z;
                    if (edgeEffect2 != null) {
                        z3 = z;
                        if (x9j.a(edgeEffect2) != 0.0f) {
                            z3 = z;
                            if (!canScrollHorizontally(1)) {
                                x9j.b(this.X0, 0.0f, motionEvent.getY() / getHeight());
                                z3 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect3 = this.W0;
                    boolean z4 = z3;
                    if (edgeEffect3 != null) {
                        z4 = z3;
                        if (x9j.a(edgeEffect3) != 0.0f) {
                            z4 = z3;
                            if (!canScrollVertically(-1)) {
                                x9j.b(this.W0, 0.0f, motionEvent.getX() / getWidth());
                                z4 = true;
                            }
                        }
                    }
                    EdgeEffect edgeEffect4 = this.Y0;
                    boolean z5 = z4;
                    if (edgeEffect4 != null) {
                        z5 = z4;
                        if (x9j.a(edgeEffect4) != 0.0f) {
                            z5 = z4;
                            if (!canScrollVertically(1)) {
                                x9j.b(this.Y0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                                z5 = true;
                            }
                        }
                    }
                    if (z5 || this.a1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        a(1);
                    }
                    int[] iArr = this.C1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zF;
                    if (zG) {
                        i = (zF ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.c1.clear();
                    a(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.b1);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.b1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.a1 != 1) {
                        int i2 = x2 - this.d1;
                        int i3 = y2 - this.e1;
                        if (zF == 0 || Math.abs(i2) <= this.h1) {
                            z2 = false;
                        } else {
                            this.f1 = x2;
                            z2 = true;
                        }
                        if (zG && Math.abs(i3) > this.h1) {
                            this.g1 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    u0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.b1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1 = x3;
                    this.d1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.g1 = y3;
                    this.e1 = y3;
                } else if (actionMasked == 6) {
                    g0(motionEvent);
                }
                if (this.a1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = beg.a;
        Trace.beginSection("RV OnLayout");
        v();
        Trace.endSection();
        this.H0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        a aVar = this.A0;
        if (aVar == null) {
            t(i, i2);
            return;
        }
        boolean zR = aVar.R();
        boolean z = false;
        iid iidVar = this.r1;
        if (zR) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A0.n0(iidVar, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.G1 = z;
            if (z || this.z0 == null) {
                return;
            }
            if (iidVar.e == 1) {
                w();
            }
            this.A0.C0(i, i2);
            iidVar.j = true;
            x();
            this.A0.E0(i, i2);
            if (this.A0.H0()) {
                this.A0.C0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                iidVar.j = true;
                x();
                this.A0.E0(i, i2);
            }
            this.H1 = getMeasuredWidth();
            this.I1 = getMeasuredHeight();
            return;
        }
        if (this.G0) {
            this.A0.n0(iidVar, i, i2);
            return;
        }
        if (this.N0) {
            C0();
            e0();
            j0();
            f0(true);
            if (iidVar.l) {
                iidVar.h = true;
            } else {
                this.o.m();
                iidVar.h = false;
            }
            this.N0 = false;
            D0(false);
        } else if (iidVar.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        phd phdVar = this.z0;
        if (phdVar != null) {
            iidVar.f = phdVar.j();
        } else {
            iidVar.f = 0;
        }
        C0();
        this.A0.n0(iidVar, i, i2);
        D0(false);
        iidVar.h = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Z()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fid)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fid fidVar = (fid) parcelable;
        this.d = fidVar;
        super.onRestoreInstanceState(fidVar.a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        fid fidVar = new fid(super.onSaveInstanceState());
        fid fidVar2 = this.d;
        if (fidVar2 != null) {
            fidVar.c = fidVar2.c;
            return fidVar;
        }
        a aVar = this.A0;
        if (aVar != null) {
            fidVar.c = aVar.p0();
            return fidVar;
        }
        fidVar.c = null;
        return fidVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.Y0 = null;
        this.W0 = null;
        this.X0 = null;
        this.V0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd A[PHI: r1
  0x00fd: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:50:0x00e6, B:54:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        int iO = this.s0.O();
        for (int i = 0; i < iO; i++) {
            mid midVarU = U(this.s0.N(i));
            if (!midVarU.x()) {
                midVarU.d = -1;
                midVarU.Y = -1;
            }
        }
        did didVar = this.c;
        int size = didVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            mid midVar = (mid) didVar.c.get(i2);
            midVar.d = -1;
            midVar.Y = -1;
        }
        int size2 = didVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            mid midVar2 = (mid) didVar.a.get(i3);
            midVar2.d = -1;
            midVar2.Y = -1;
        }
        ArrayList arrayList = didVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                mid midVar3 = (mid) didVar.b.get(i4);
                midVar3.d = -1;
                midVar3.Y = -1;
            }
        }
    }

    public final void p0(vhd vhdVar) {
        a aVar = this.A0;
        if (aVar != null) {
            aVar.d("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.C0;
        arrayList.remove(vhdVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        b0();
        requestLayout();
    }

    public final void q(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.V0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.V0.onRelease();
            zIsFinished = this.V0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.X0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.X0.onRelease();
            zIsFinished |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.W0.onRelease();
            zIsFinished |= this.W0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Y0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.Y0.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public final void q0(yhd yhdVar) {
        ArrayList arrayList = this.P0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(yhdVar);
    }

    public final void r0(aid aidVar) {
        this.D0.remove(aidVar);
        if (this.E0 == aidVar) {
            this.E0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        mid midVarU = U(view);
        if (midVarU != null) {
            if (midVarU.s()) {
                midVarU.t0 &= -257;
            } else if (!midVarU.x()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(midVarU);
                throw new IllegalArgumentException(wy1.f(this, sb));
            }
        } else if (K1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(wy1.f(this, sb2));
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        c58 c58Var = this.A0.e;
        if ((c58Var == null || !c58Var.e) && !Z() && view2 != null) {
            t0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0.w0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.D0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aid) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.I0 != 0 || this.K0) {
            this.J0 = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (!this.H0 || this.Q0) {
            int i = beg.a;
            Trace.beginSection("RV FullInvalidate");
            v();
            Trace.endSection();
            return;
        }
        a9 a9Var = this.o;
        if (a9Var.u()) {
            int i2 = a9Var.a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (a9Var.u()) {
                    int i3 = beg.a;
                    Trace.beginSection("RV FullInvalidate");
                    v();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = beg.a;
            Trace.beginSection("RV PartialInvalidate");
            C0();
            e0();
            a9Var.B();
            if (!this.J0) {
                ggg gggVar = this.s0;
                int iK = gggVar.K();
                int i5 = 0;
                while (true) {
                    if (i5 < iK) {
                        mid midVarU = U(gggVar.J(i5));
                        if (midVarU != null && !midVarU.x() && midVarU.t()) {
                            v();
                            break;
                        }
                        i5++;
                    } else {
                        a9Var.l();
                        break;
                    }
                }
            }
            D0(true);
            f0(true);
            Trace.endSection();
        }
    }

    public void s0(bid bidVar) {
        ArrayList arrayList = this.t1;
        if (arrayList != null) {
            arrayList.remove(bidVar);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        a aVar = this.A0;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.K0) {
            return;
        }
        boolean zF = aVar.f();
        boolean zG = this.A0.g();
        if (zF || zG) {
            if (!zF) {
                i = 0;
            }
            if (!zG) {
                i2 = 0;
            }
            v0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Z()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.M0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(oid oidVar) {
        this.y1 = oidVar;
        hfh.n(this, oidVar);
    }

    public void setAdapter(phd phdVar) {
        setLayoutFrozen(false);
        y0(phdVar, false, true);
        k0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(shd shdVar) {
        if (shdVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(shdVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.u0) {
            this.Y0 = null;
            this.W0 = null;
            this.X0 = null;
            this.V0 = null;
        }
        this.u0 = z;
        super.setClipToPadding(z);
        if (this.H0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(thd thdVar) {
        thdVar.getClass();
        this.U0 = thdVar;
        this.Y0 = null;
        this.W0 = null;
        this.X0 = null;
        this.V0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.G0 = z;
    }

    public void setItemAnimator(uhd uhdVar) {
        uhd uhdVar2 = this.Z0;
        if (uhdVar2 != null) {
            uhdVar2.e();
            this.Z0.a = null;
        }
        this.Z0 = uhdVar;
        if (uhdVar != null) {
            uhdVar.a = this.w1;
        }
    }

    public void setItemViewCacheSize(int i) {
        did didVar = this.c;
        didVar.e = i;
        didVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        if (aVar == this.A0) {
            return;
        }
        E0();
        if (this.A0 != null) {
            uhd uhdVar = this.Z0;
            if (uhdVar != null) {
                uhdVar.e();
            }
            this.A0.t0(this.c);
            this.A0.u0(this.c);
            did didVar = this.c;
            didVar.a.clear();
            didVar.f();
            if (this.F0) {
                a aVar2 = this.A0;
                aVar2.g = false;
                aVar2.Z(this);
            }
            this.A0.F0(null);
            this.A0 = null;
        } else {
            did didVar2 = this.c;
            didVar2.a.clear();
            didVar2.f();
        }
        ggg gggVar = this.s0;
        RecyclerView recyclerView = (RecyclerView) ((x6i) gggVar.d).b;
        ((v32) gggVar.o).e0();
        ArrayList arrayList = (ArrayList) gggVar.X;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mid midVarU = U((View) arrayList.get(size));
            if (midVarU != null) {
                int i = midVarU.z0;
                if (recyclerView.Z()) {
                    midVarU.A0 = i;
                    recyclerView.E1.add(midVarU);
                } else {
                    View view = midVarU.a;
                    WeakHashMap weakHashMap = hfh.a;
                    view.setImportantForAccessibility(i);
                }
                midVarU.z0 = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.A0 = aVar;
        if (aVar != null) {
            if (aVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(aVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(wy1.f(aVar.b, sb));
            }
            aVar.F0(this);
            if (this.F0) {
                a aVar3 = this.A0;
                aVar3.g = true;
                aVar3.Y(this);
            }
        }
        this.c.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        rda scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = hfh.a;
            veh.z(viewGroup);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(zhd zhdVar) {
        this.i1 = zhdVar;
    }

    @Deprecated
    public void setOnScrollListener(bid bidVar) {
        this.s1 = bidVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.n1 = z;
    }

    public void setRecycledViewPool(b bVar) {
        did didVar = this.c;
        RecyclerView recyclerView = didVar.h;
        phd phdVar = recyclerView.z0;
        b bVar2 = didVar.g;
        if (bVar2 != null) {
            bVar2.detachForPoolingContainer(phdVar, false);
        }
        b bVar3 = didVar.g;
        if (bVar3 != null) {
            bVar3.detach();
        }
        didVar.g = bVar;
        if (bVar != null && recyclerView.getAdapter() != null) {
            didVar.g.attach();
        }
        didVar.e();
    }

    @Deprecated
    public void setRecyclerListener(eid eidVar) {
    }

    public void setScrollState(int i) {
        c58 c58Var;
        if (i == this.a1) {
            return;
        }
        if (L1) {
            StringBuilder sbM = ho7.m(i, "setting scroll state to ", " from ");
            sbM.append(this.a1);
            Log.d("RecyclerView", sbM.toString(), new Exception());
        }
        this.a1 = i;
        if (i != 2) {
            lid lidVar = this.o1;
            lidVar.Y.removeCallbacks(lidVar);
            lidVar.c.abortAnimation();
            a aVar = this.A0;
            if (aVar != null && (c58Var = aVar.e) != null) {
                c58Var.m();
            }
        }
        a aVar2 = this.A0;
        if (aVar2 != null) {
            aVar2.q0(i);
        }
        h0();
        bid bidVar = this.s1;
        if (bidVar != null) {
            bidVar.a(this, i);
        }
        ArrayList arrayList = this.t1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((bid) this.t1.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.h1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.h1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(kid kidVar) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.K0) {
            n("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.K0 = true;
                this.L0 = true;
                E0();
                return;
            }
            this.K0 = false;
            if (this.J0 && this.A0 != null && this.z0 != null) {
                requestLayout();
            }
            this.J0 = false;
        }
    }

    public final void t(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = hfh.a;
        setMeasuredDimension(a.i(i, paddingRight, getMinimumWidth()), a.i(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void t0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.w0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof xhd) {
            xhd xhdVar = (xhd) layoutParams;
            if (!xhdVar.c) {
                Rect rect2 = xhdVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.A0.w0(this, view, this.w0, !this.H0, view2 == null);
    }

    public final void u(View view) {
        mid midVarU = U(view);
        phd phdVar = this.z0;
        if (phdVar != null && midVarU != null) {
            phdVar.x(midVarU);
        }
        ArrayList arrayList = this.P0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yhd) this.P0.get(size)).b(view);
            }
        }
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.c1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        a(0);
        EdgeEffect edgeEffect = this.V0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.V0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.W0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.X0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.X0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Y0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.Y0.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0374  */
    /* JADX WARN: Type inference failed for: r10v2, types: [mid] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, t9f] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, uhd, un4] */
    /* JADX WARN: Type inference failed for: r11v6, types: [uhd] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void w() {
        qfh qfhVar;
        View viewI;
        iid iidVar = this.r1;
        iidVar.a(1);
        G(iidVar);
        iidVar.j = false;
        C0();
        ssb ssbVar = this.t0;
        z0f z0fVar = (z0f) ssbVar.b;
        z0f z0fVar2 = (z0f) ssbVar.b;
        z0fVar.clear();
        ek8 ek8Var = (ek8) ssbVar.c;
        ek8Var.a();
        e0();
        j0();
        mid midVarT = null;
        View focusedChild = (this.n1 && hasFocus() && this.z0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewI = I(focusedChild)) != null) {
            midVarT = T(viewI);
        }
        if (midVarT == null) {
            iidVar.n = -1L;
            iidVar.m = -1;
            iidVar.o = -1;
        } else {
            iidVar.n = this.z0.b ? midVarT.o : -1L;
            iidVar.m = this.Q0 ? -1 : midVarT.q() ? midVarT.d : midVarT.f();
            View focusedChild2 = midVarT.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            iidVar.o = id;
        }
        iidVar.i = iidVar.k && this.v1;
        this.v1 = false;
        this.u1 = false;
        iidVar.h = iidVar.l;
        iidVar.f = this.z0.j();
        K(this.z1);
        if (iidVar.k) {
            int iK = this.s0.K();
            for (int i = 0; i < iK; i++) {
                mid midVarU = U(this.s0.J(i));
                if (!midVarU.x() && (!midVarU.o() || this.z0.b)) {
                    uhd uhdVar = this.Z0;
                    uhd.b(midVarU);
                    midVarU.i();
                    uhdVar.getClass();
                    kt ktVar = new kt(7);
                    ktVar.c(midVarU);
                    qfh qfhVarA = (qfh) z0fVar2.get(midVarU);
                    if (qfhVarA == null) {
                        qfhVarA = qfh.a();
                        z0fVar2.put(midVarU, qfhVarA);
                    }
                    qfhVarA.b = ktVar;
                    qfhVarA.a |= 4;
                    if (iidVar.i && midVarU.t() && !midVarU.q() && !midVarU.x() && !midVarU.o()) {
                        ek8Var.e(Q(midVarU), midVarU);
                    }
                }
            }
        }
        if (iidVar.l) {
            int iO = this.s0.O();
            for (int i2 = 0; i2 < iO; i2++) {
                mid midVarU2 = U(this.s0.N(i2));
                if (K1 && midVarU2.c == -1 && !midVarU2.q()) {
                    throw new IllegalStateException(wy1.f(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!midVarU2.x() && midVarU2.d == -1) {
                    midVarU2.d = midVarU2.c;
                }
            }
            boolean z = iidVar.g;
            iidVar.g = false;
            this.A0.l0(this.c, iidVar);
            iidVar.g = z;
            for (int i3 = 0; i3 < this.s0.K(); i3++) {
                mid midVarU3 = U(this.s0.J(i3));
                if (!midVarU3.x() && ((qfhVar = (qfh) z0fVar2.get(midVarU3)) == null || (qfhVar.a & 4) == 0)) {
                    uhd.b(midVarU3);
                    boolean z2 = (midVarU3.t0 & 8192) != 0;
                    uhd uhdVar2 = this.Z0;
                    midVarU3.i();
                    uhdVar2.getClass();
                    kt ktVar2 = new kt(7);
                    ktVar2.c(midVarU3);
                    if (z2) {
                        l0(midVarU3, ktVar2);
                    } else {
                        qfh qfhVarA2 = (qfh) z0fVar2.get(midVarU3);
                        if (qfhVarA2 == null) {
                            qfhVarA2 = qfh.a();
                            z0fVar2.put(midVarU3, qfhVarA2);
                        }
                        qfhVarA2.a |= 2;
                        qfhVarA2.b = ktVar2;
                    }
                }
            }
            p();
        } else {
            p();
        }
        f0(true);
        D0(false);
        iidVar.e = 2;
    }

    public final void w0(int i, int i2, int[] iArr) {
        mid midVar;
        C0();
        e0();
        int i3 = beg.a;
        Trace.beginSection("RV Scroll");
        iid iidVar = this.r1;
        G(iidVar);
        int iY0 = i != 0 ? this.A0.y0(i, this.c, iidVar) : 0;
        int iA0 = i2 != 0 ? this.A0.A0(i2, this.c, iidVar) : 0;
        Trace.endSection();
        ggg gggVar = this.s0;
        int iK = gggVar.K();
        for (int i4 = 0; i4 < iK; i4++) {
            View viewJ = gggVar.J(i4);
            mid midVarT = T(viewJ);
            if (midVarT != null && (midVar = midVarT.s0) != null) {
                View view = midVar.a;
                int left = viewJ.getLeft();
                int top = viewJ.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        f0(true);
        D0(false);
        if (iArr != null) {
            iArr[0] = iY0;
            iArr[1] = iA0;
        }
    }

    public final void x() {
        C0();
        e0();
        iid iidVar = this.r1;
        iidVar.a(6);
        this.o.m();
        iidVar.f = this.z0.j();
        iidVar.d = 0;
        if (this.d != null) {
            phd phdVar = this.z0;
            int iV = az1.v(phdVar.c);
            if (iV == 1 ? phdVar.j() > 0 : iV != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.A0.o0(parcelable);
                }
                this.d = null;
            }
        }
        iidVar.h = false;
        this.A0.l0(this.c, iidVar);
        iidVar.g = false;
        iidVar.k = iidVar.k && this.Z0 != null;
        iidVar.e = 4;
        f0(true);
        D0(false);
    }

    public final void x0(int i) {
        if (this.K0) {
            return;
        }
        E0();
        a aVar = this.A0;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.z0(i);
            awakenScrollBars();
        }
    }

    public final boolean y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void y0(phd phdVar, boolean z, boolean z2) {
        phd phdVar2 = this.z0;
        kd5 kd5Var = this.b;
        if (phdVar2 != null) {
            phdVar2.B(kd5Var);
            this.z0.u(this);
        }
        if (!z || z2) {
            o0();
        }
        a9 a9Var = this.o;
        a9Var.C((ArrayList) a9Var.c);
        a9Var.C((ArrayList) a9Var.d);
        a9Var.a = 0;
        phd phdVar3 = this.z0;
        this.z0 = phdVar;
        if (phdVar != null) {
            phdVar.z(kd5Var);
            phdVar.q(this);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.X();
        }
        did didVar = this.c;
        phd phdVar4 = this.z0;
        didVar.a.clear();
        didVar.f();
        b bVar = didVar.g;
        if (bVar != null) {
            bVar.detachForPoolingContainer(phdVar3, true);
        }
        didVar.c().onAdapterChanged(phdVar3, phdVar4, z);
        didVar.e();
        this.r1.g = true;
    }

    public final void z(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean z0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = x9j.a(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = N1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        boolean z;
        char c;
        TypedArray typedArray;
        Constructor constructor;
        super(context, attributeSet, i);
        this.b = new kd5(6, this);
        this.c = new did(this);
        this.t0 = new ssb(16);
        this.v0 = new ohd(this, 0);
        this.w0 = new Rect();
        this.x0 = new Rect();
        this.y0 = new RectF();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = 0;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = T1;
        this.Z0 = new un4();
        this.a1 = 0;
        this.b1 = -1;
        this.l1 = Float.MIN_VALUE;
        this.m1 = Float.MIN_VALUE;
        int i2 = 1;
        this.n1 = true;
        this.o1 = new lid(this);
        Object[] objArr = null;
        this.q1 = Q1 ? new w93() : null;
        iid iidVar = new iid();
        iidVar.a = -1;
        iidVar.c = 0;
        iidVar.d = 0;
        iidVar.e = 1;
        iidVar.f = 0;
        iidVar.g = false;
        iidVar.h = false;
        iidVar.i = false;
        iidVar.j = false;
        iidVar.k = false;
        iidVar.l = false;
        this.r1 = iidVar;
        this.u1 = false;
        this.v1 = false;
        s6b s6bVar = new s6b(this);
        this.w1 = s6bVar;
        this.x1 = false;
        this.z1 = new int[2];
        this.B1 = new int[2];
        this.C1 = new int[2];
        this.D1 = new int[2];
        this.E1 = new ArrayList();
        this.F1 = new ohd(this, i2);
        this.H1 = 0;
        this.I1 = 0;
        int i3 = 29;
        this.J1 = new t9f(i3, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.h1 = viewConfiguration.getScaledTouchSlop();
        this.l1 = ifh.a(viewConfiguration);
        this.m1 = ifh.b(viewConfiguration);
        this.j1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.k1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.Z0.a = s6bVar;
        this.o = new a9(new y6i(i3, this));
        this.s0 = new ggg(new x6i(27, this));
        WeakHashMap weakHashMap = hfh.a;
        if (yeh.c(this) == 0) {
            yeh.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.O0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new oid(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5d.RecyclerView, i, 0);
        hfh.m(this, context, u5d.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(u5d.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(u5d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.u0 = typedArrayObtainStyledAttributes.getBoolean(u5d.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(u5d.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u5d.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(u5d.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(u5d.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(u5d.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(wy1.f(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c = 2;
            z = 1;
            typedArray = typedArrayObtainStyledAttributes;
            new br5(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(cwc.fastscroll_default_thickness), resources.getDimensionPixelSize(cwc.fastscroll_minimum_range), resources.getDimensionPixelOffset(cwc.fastscroll_margin));
        } else {
            z = 1;
            c = 2;
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(a.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(R1);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[z] = attributeSet;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((a) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr = M1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        hfh.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(a6c.b, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.A0;
        if (aVar != null) {
            return aVar.v(layoutParams);
        }
        throw new IllegalStateException(wy1.f(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
