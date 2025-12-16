package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cn;
import defpackage.d74;
import defpackage.dn;
import defpackage.dui;
import defpackage.en;
import defpackage.f0;
import defpackage.gn;
import defpackage.hfh;
import defpackage.in;
import defpackage.lgh;
import defpackage.nt3;
import defpackage.qda;
import defpackage.rg;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T extends in> extends lgh {
    public nt3 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;
    public int j;
    public int k;
    public ValueAnimator l;
    public en m;
    public WeakReference n;

    public AppBarLayout$BaseBehavior() {
        this.f = -1;
        this.h = -1;
    }

    public static View A(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (((d74) childAt.getLayoutParams()).a instanceof AppBarLayout$ScrollingViewBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public static View C(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt instanceof qda) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(androidx.coordinatorlayout.widget.CoordinatorLayout r7, defpackage.in r8, int r9, int r10, boolean r11) {
        /*
            int r0 = java.lang.Math.abs(r9)
            int r1 = r8.getChildCount()
            r2 = 0
            r3 = r2
        La:
            r4 = 0
            if (r3 >= r1) goto L21
            android.view.View r5 = r8.getChildAt(r3)
            int r6 = r5.getTop()
            if (r0 < r6) goto L1e
            int r6 = r5.getBottom()
            if (r0 > r6) goto L1e
            goto L22
        L1e:
            int r3 = r3 + 1
            goto La
        L21:
            r5 = r4
        L22:
            if (r5 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            gn r0 = (defpackage.gn) r0
            int r0 = r0.a
            r1 = r0 & 1
            if (r1 == 0) goto L5d
            java.util.WeakHashMap r1 = defpackage.hfh.a
            int r1 = r5.getMinimumHeight()
            r3 = 1
            if (r10 <= 0) goto L4b
            r10 = r0 & 12
            if (r10 == 0) goto L4b
            int r9 = -r9
            int r10 = r5.getBottom()
            int r10 = r10 - r1
            int r0 = r8.getTopInset()
            int r10 = r10 - r0
            if (r9 < r10) goto L5d
            goto L5e
        L4b:
            r10 = r0 & 2
            if (r10 == 0) goto L5d
            int r9 = -r9
            int r10 = r5.getBottom()
            int r10 = r10 - r1
            int r0 = r8.getTopInset()
            int r10 = r10 - r0
            if (r9 < r10) goto L5d
            goto L5e
        L5d:
            r3 = r2
        L5e:
            boolean r9 = r8.y0
            if (r9 == 0) goto L6a
            android.view.View r9 = C(r7)
            boolean r3 = r8.h(r9)
        L6a:
            boolean r9 = r8.g(r3)
            if (r11 != 0) goto Lac
            if (r9 == 0) goto Ld3
            k5i r7 = r7.b
            java.lang.Object r7 = r7.c
            z0f r7 = (defpackage.z0f) r7
            java.lang.Object r7 = r7.get(r8)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 != 0) goto L81
            goto L86
        L81:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r7)
        L86:
            if (r4 != 0) goto L8a
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L8a:
            int r7 = r4.size()
        L8e:
            if (r2 >= r7) goto Ld3
            java.lang.Object r9 = r4.get(r2)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            d74 r9 = (defpackage.d74) r9
            a74 r9 = r9.a
            boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            if (r10 == 0) goto La9
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior) r9
            int r7 = r9.f
            if (r7 == 0) goto Ld3
            goto Lac
        La9:
            int r2 = r2 + 1
            goto L8e
        Lac:
            android.graphics.drawable.Drawable r7 = r8.getBackground()
            if (r7 == 0) goto Lb9
            android.graphics.drawable.Drawable r7 = r8.getBackground()
            r7.jumpToCurrentState()
        Lb9:
            android.graphics.drawable.Drawable r7 = r8.getForeground()
            if (r7 == 0) goto Lc6
            android.graphics.drawable.Drawable r7 = r8.getForeground()
            r7.jumpToCurrentState()
        Lc6:
            android.animation.StateListAnimator r7 = r8.getStateListAnimator()
            if (r7 == 0) goto Ld3
            android.animation.StateListAnimator r7 = r8.getStateListAnimator()
            r7.jumpToCurrentState()
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.M(androidx.coordinatorlayout.widget.CoordinatorLayout, in, int, int, boolean):void");
    }

    public final void B(CoordinatorLayout coordinatorLayout, in inVar, int i) {
        int iAbs = Math.abs(D() - i);
        float fAbs = Math.abs(0.0f);
        int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / inVar.getHeight()) + 1.0f) * 150.0f);
        int iD = D();
        if (iD == i) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.l.cancel();
            return;
        }
        ValueAnimator valueAnimator2 = this.l;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.l = valueAnimator3;
            valueAnimator3.setInterpolator(rg.e);
            this.l.addUpdateListener(new cn(this, coordinatorLayout, inVar, 0));
        } else {
            valueAnimator2.cancel();
        }
        this.l.setDuration(Math.min(iRound, 600));
        this.l.setIntValues(iD, i);
        this.l.start();
    }

    public final int D() {
        return x() + this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // defpackage.a74
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout r7, defpackage.in r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
        /*
            r6 = this;
            if (r11 == 0) goto L2b
            if (r11 >= 0) goto L11
            int r10 = r8.getTotalScrollRange()
            int r10 = -r10
            int r13 = r8.getDownNestedPreScrollRange()
            int r13 = r13 + r10
        Le:
            r4 = r10
            r5 = r13
            goto L18
        L11:
            int r10 = r8.getUpNestedPreScrollRange()
            int r10 = -r10
            r13 = 0
            goto Le
        L18:
            if (r4 == r5) goto L2b
            int r10 = r6.D()
            int r3 = r10 - r11
            r0 = r6
            r1 = r7
            r2 = r8
            int r7 = r0.J(r1, r2, r3, r4, r5)
            r8 = 1
            r12[r8] = r7
            goto L2c
        L2b:
            r2 = r8
        L2c:
            boolean r7 = r2.y0
            if (r7 == 0) goto L37
            boolean r7 = r2.h(r9)
            r2.g(r7)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.o(androidx.coordinatorlayout.widget.CoordinatorLayout, in, android.view.View, int, int, int[], int):void");
    }

    @Override // defpackage.a74
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(CoordinatorLayout coordinatorLayout, in inVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        CoordinatorLayout coordinatorLayout2;
        in inVar2;
        if (i4 < 0) {
            coordinatorLayout2 = coordinatorLayout;
            inVar2 = inVar;
            iArr[1] = J(coordinatorLayout2, inVar2, D() - i4, -inVar.getDownNestedScrollRange(), 0);
        } else {
            coordinatorLayout2 = coordinatorLayout;
            inVar2 = inVar;
        }
        if (i4 == 0 && hfh.d(coordinatorLayout2) == null) {
            hfh.n(coordinatorLayout2, new dn(this, inVar2, coordinatorLayout2));
        }
    }

    @Override // defpackage.a74
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean u(CoordinatorLayout coordinatorLayout, in inVar, View view, View view2, int i, int i2) {
        ValueAnimator valueAnimator;
        boolean z = (i & 2) != 0 && (inVar.y0 || (inVar.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= inVar.getHeight()));
        if (z && (valueAnimator = this.l) != null) {
            valueAnimator.cancel();
        }
        this.n = null;
        this.k = i2;
        return z;
    }

    @Override // defpackage.a74
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void v(CoordinatorLayout coordinatorLayout, in inVar, View view, int i) {
        if (this.k == 0 || i == 1) {
            L(coordinatorLayout, inVar);
            if (inVar.y0) {
                inVar.g(inVar.h(view));
            }
        }
        this.n = new WeakReference(view);
    }

    public final en I(Parcelable parcelable, in inVar) {
        int iX = x();
        int childCount = inVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = inVar.getChildAt(i);
            int bottom = childAt.getBottom() + iX;
            if (childAt.getTop() + iX <= 0 && bottom >= 0) {
                if (parcelable == null) {
                    parcelable = f0.b;
                }
                en enVar = new en(parcelable);
                boolean z = iX == 0;
                enVar.d = z;
                enVar.c = !z && (-iX) >= inVar.getTotalScrollRange();
                enVar.o = i;
                WeakHashMap weakHashMap = hfh.a;
                enVar.Y = bottom == inVar.getTopInset() + childAt.getMinimumHeight();
                enVar.X = bottom / childAt.getHeight();
                return enVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(androidx.coordinatorlayout.widget.CoordinatorLayout r17, android.view.View r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.J(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
    }

    public final void K(CoordinatorLayout coordinatorLayout, View view, int i) {
        J(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final void L(CoordinatorLayout coordinatorLayout, in inVar) {
        int paddingTop = inVar.getPaddingTop() + inVar.getTopInset();
        int iD = D() - paddingTop;
        int childCount = inVar.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            View childAt = inVar.getChildAt(i);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            gn gnVar = (gn) childAt.getLayoutParams();
            if ((gnVar.a & 32) == 32) {
                top -= ((LinearLayout.LayoutParams) gnVar).topMargin;
                bottom += ((LinearLayout.LayoutParams) gnVar).bottomMargin;
            }
            int i2 = -iD;
            if (top <= i2 && bottom >= i2) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            View childAt2 = inVar.getChildAt(i);
            gn gnVar2 = (gn) childAt2.getLayoutParams();
            int i3 = gnVar2.a;
            if ((i3 & 17) == 17) {
                int topInset = -childAt2.getTop();
                int minimumHeight = -childAt2.getBottom();
                if (i == 0) {
                    WeakHashMap weakHashMap = hfh.a;
                    if (inVar.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        topInset -= inVar.getTopInset();
                    }
                }
                if ((i3 & 2) == 2) {
                    WeakHashMap weakHashMap2 = hfh.a;
                    minimumHeight += childAt2.getMinimumHeight();
                } else if ((i3 & 5) == 5) {
                    WeakHashMap weakHashMap3 = hfh.a;
                    int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                    if (iD < minimumHeight2) {
                        topInset = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if ((i3 & 32) == 32) {
                    topInset += ((LinearLayout.LayoutParams) gnVar2).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) gnVar2).bottomMargin;
                }
                if (iD < (minimumHeight + topInset) / 2) {
                    topInset = minimumHeight;
                }
                B(coordinatorLayout, inVar, dui.e(topInset + paddingTop, -inVar.getTotalScrollRange(), 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    @Override // defpackage.a74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.h = r0
        L12:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L42
            boolean r0 = r7.e
            if (r0 == 0) goto L42
            int r0 = r7.f
            if (r0 != r3) goto L26
            goto La5
        L26:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            goto La5
        L2e:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.h
            if (r1 <= r5) goto L42
            r7.g = r0
            return r2
        L42:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L9e
            r7.f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r9
            in r5 = (defpackage.in) r5
            java.lang.ref.WeakReference r5 = r7.n
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L77
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L77
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L77
        L6f:
            boolean r8 = r8.o(r9, r0, r1)
            if (r8 == 0) goto L77
            r8 = r2
            goto L78
        L77:
            r8 = r4
        L78:
            r7.e = r8
            if (r8 == 0) goto L9e
            r7.g = r1
            int r8 = r10.getPointerId(r4)
            r7.f = r8
            android.view.VelocityTracker r8 = r7.i
            if (r8 != 0) goto L8e
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.i = r8
        L8e:
            android.widget.OverScroller r8 = r7.d
            if (r8 == 0) goto L9e
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L9e
            android.widget.OverScroller r8 = r7.d
            r8.abortAnimation()
            return r2
        L9e:
            android.view.VelocityTracker r8 = r7.i
            if (r8 == 0) goto La5
            r8.addMovement(r10)
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // defpackage.lgh, defpackage.a74
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int iRound;
        in inVar = (in) view;
        super.l(coordinatorLayout, inVar, i);
        int pendingAction = inVar.getPendingAction();
        en enVar = this.m;
        if (enVar == null || (pendingAction & 8) != 0) {
            if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i2 = -inVar.getUpNestedPreScrollRange();
                    if (z) {
                        B(coordinatorLayout, inVar, i2);
                    } else {
                        K(coordinatorLayout, inVar, i2);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        B(coordinatorLayout, inVar, 0);
                    } else {
                        K(coordinatorLayout, inVar, 0);
                    }
                }
            }
        } else if (enVar.c) {
            K(coordinatorLayout, inVar, -inVar.getTotalScrollRange());
        } else if (enVar.d) {
            K(coordinatorLayout, inVar, 0);
        } else {
            View childAt = inVar.getChildAt(enVar.o);
            int i3 = -childAt.getBottom();
            if (this.m.Y) {
                WeakHashMap weakHashMap = hfh.a;
                iRound = inVar.getTopInset() + childAt.getMinimumHeight() + i3;
            } else {
                iRound = Math.round(childAt.getHeight() * this.m.X) + i3;
            }
            K(coordinatorLayout, inVar, iRound);
        }
        inVar.s0 = 0;
        this.m = null;
        z(dui.e(x(), -inVar.getTotalScrollRange(), 0));
        M(coordinatorLayout, inVar, x(), 0, true);
        inVar.e(x());
        if (hfh.d(coordinatorLayout) != null) {
            return true;
        }
        hfh.n(coordinatorLayout, new dn(this, inVar, coordinatorLayout));
        return true;
    }

    @Override // defpackage.a74
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        in inVar = (in) view;
        if (((ViewGroup.MarginLayoutParams) ((d74) inVar.getLayoutParams())).height != -2) {
            return false;
        }
        coordinatorLayout.r(inVar, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
        return true;
    }

    @Override // defpackage.a74
    public final void r(View view, Parcelable parcelable) {
        if (parcelable instanceof en) {
            this.m = (en) parcelable;
        } else {
            this.m = null;
        }
    }

    @Override // defpackage.a74
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        en enVarI = I(absSavedState, (in) view);
        return enVarI == null ? absSavedState : enVarI;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104 A[ADDED_TO_REGION] */
    @Override // defpackage.a74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.w(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f = -1;
        this.h = -1;
    }
}
