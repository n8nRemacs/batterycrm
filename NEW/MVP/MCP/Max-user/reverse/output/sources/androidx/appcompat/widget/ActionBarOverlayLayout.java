package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.co7;
import defpackage.e4i;
import defpackage.eri;
import defpackage.fcg;
import defpackage.fvc;
import defpackage.g4i;
import defpackage.h7;
import defpackage.hfh;
import defpackage.iz8;
import defpackage.kt;
import defpackage.l3i;
import defpackage.lg9;
import defpackage.s6;
import defpackage.sda;
import defpackage.t6;
import defpackage.tda;
import defpackage.teh;
import defpackage.u3i;
import defpackage.u6;
import defpackage.v3i;
import defpackage.v6;
import defpackage.veh;
import defpackage.vf9;
import defpackage.w6;
import defpackage.wh4;
import defpackage.x3i;
import defpackage.xbg;
import defpackage.xh4;
import defpackage.y3i;
import defpackage.zxc;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements wh4, sda, tda {
    public static final int[] P0 = {fvc.actionBarSize, R.attr.windowContentOverlay};
    public static final g4i Q0;
    public static final Rect R0;
    public final Rect A0;
    public final Rect B0;
    public final Rect C0;
    public g4i D0;
    public g4i E0;
    public g4i F0;
    public g4i G0;
    public u6 H0;
    public OverScroller I0;
    public ViewPropertyAnimator J0;
    public final s6 K0;
    public final t6 L0;
    public final t6 M0;
    public final kt N0;
    public final w6 O0;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public xh4 o;
    public Drawable s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public int y0;
    public final Rect z0;

    static {
        int i = Build.VERSION.SDK_INT;
        y3i x3iVar = i >= 30 ? new x3i() : i >= 29 ? new v3i() : new u3i();
        x3iVar.g(co7.b(0, 1, 0, 1));
        Q0 = x3iVar.b();
        R0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Rect();
        this.C0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        g4i g4iVar = g4i.b;
        this.D0 = g4iVar;
        this.E0 = g4iVar;
        this.F0 = g4iVar;
        this.G0 = g4iVar;
        this.K0 = new s6(0, this);
        this.L0 = new t6(this, 0);
        this.M0 = new t6(this, 1);
        c(context);
        this.N0 = new kt(6);
        w6 w6Var = new w6(context, 0);
        w6Var.setWillNotDraw(true);
        this.O0 = w6Var;
        addView(w6Var);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        v6 v6Var = (v6) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) v6Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) v6Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) v6Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) v6Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) v6Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) v6Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) v6Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) v6Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void b() {
        removeCallbacks(this.L0);
        removeCallbacks(this.M0);
        ViewPropertyAnimator viewPropertyAnimator = this.J0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(P0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.s0 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.I0 = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v6;
    }

    public final void d(int i) {
        e();
        if (i == 2) {
            ((fcg) this.o).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((fcg) this.o).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.s0 != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.s0.setBounds(0, translationY, getWidth(), this.s0.getIntrinsicHeight() + translationY);
            this.s0.draw(canvas);
        }
    }

    public final void e() {
        xh4 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(zxc.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(zxc.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(zxc.action_bar);
            if (callbackFindViewById instanceof xh4) {
                wrapper = (xh4) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.o = wrapper;
        }
    }

    public final void f(Menu menu, lg9 lg9Var) {
        e();
        fcg fcgVar = (fcg) this.o;
        Toolbar toolbar = fcgVar.a;
        if (fcgVar.m == null) {
            fcgVar.m = new h7(toolbar.getContext());
        }
        h7 h7Var = fcgVar.m;
        h7Var.o = lg9Var;
        vf9 vf9Var = (vf9) menu;
        if (vf9Var == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        vf9 vf9Var2 = toolbar.a.a;
        if (vf9Var2 == vf9Var) {
            return;
        }
        if (vf9Var2 != null) {
            vf9Var2.r(toolbar.Y0);
            vf9Var2.r(toolbar.Z0);
        }
        if (toolbar.Z0 == null) {
            toolbar.Z0 = new xbg(toolbar);
        }
        h7Var.A0 = true;
        if (vf9Var != null) {
            vf9Var.b(h7Var, toolbar.w0);
            vf9Var.b(toolbar.Z0, toolbar.w0);
        } else {
            h7Var.k(toolbar.w0, null);
            toolbar.Z0.k(toolbar.w0, null);
            h7Var.i();
            toolbar.Z0.i();
        }
        toolbar.a.setPopupTheme(toolbar.x0);
        toolbar.a.setPresenter(h7Var);
        toolbar.Y0 = h7Var;
        toolbar.x();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new v6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new v6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        kt ktVar = this.N0;
        return ktVar.c | ktVar.b;
    }

    public CharSequence getTitle() {
        e();
        return ((fcg) this.o).a.getTitle();
    }

    @Override // defpackage.tda
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        i(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.sda
    public final void i(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.sda
    public final boolean j(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.sda
    public final void l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.sda
    public final void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.sda
    public final void n(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e();
        g4i g4iVarH = g4i.h(this, windowInsets);
        boolean zA = a(this.d, new Rect(g4iVarH.b(), g4iVarH.d(), g4iVarH.c(), g4iVarH.a()), false);
        WeakHashMap weakHashMap = hfh.a;
        Rect rect = this.z0;
        veh.b(this, g4iVarH, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        e4i e4iVar = g4iVarH.a;
        g4i g4iVarL = e4iVar.l(i, i2, i3, i4);
        this.D0 = g4iVarL;
        boolean z = true;
        if (!this.E0.equals(g4iVarL)) {
            this.E0 = this.D0;
            zA = true;
        }
        Rect rect2 = this.A0;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return e4iVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = hfh.a;
        teh.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                v6 v6Var = (v6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) v6Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) v6Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.v0 || !z) {
            return false;
        }
        this.I0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.I0.getFinalY() > this.d.getHeight()) {
            b();
            this.M0.run();
        } else {
            b();
            this.L0.run();
        }
        this.w0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.x0 + i2;
        this.x0 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        l3i l3iVar;
        iz8 iz8Var;
        this.N0.b = i;
        this.x0 = getActionBarHideOffset();
        b();
        u6 u6Var = this.H0;
        if (u6Var == null || (iz8Var = (l3iVar = (l3i) u6Var).s) == null) {
            return;
        }
        iz8Var.a();
        l3iVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.v0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.v0 || this.w0) {
            return;
        }
        if (this.x0 <= this.d.getHeight()) {
            b();
            postDelayed(this.L0, 600L);
        } else {
            b();
            postDelayed(this.M0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        e();
        int i2 = this.y0 ^ i;
        this.y0 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        u6 u6Var = this.H0;
        if (u6Var != null) {
            l3i l3iVar = (l3i) u6Var;
            l3iVar.o = !z2;
            if (z || !z2) {
                if (l3iVar.p) {
                    l3iVar.p = false;
                    l3iVar.v(true);
                }
            } else if (!l3iVar.p) {
                l3iVar.p = true;
                l3iVar.v(true);
            }
        }
        if ((i2 & 256) == 0 || this.H0 == null) {
            return;
        }
        WeakHashMap weakHashMap = hfh.a;
        teh.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        u6 u6Var = this.H0;
        if (u6Var != null) {
            ((l3i) u6Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(u6 u6Var) {
        this.H0 = u6Var;
        if (getWindowToken() != null) {
            ((l3i) this.H0).n = this.b;
            int i = this.y0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = hfh.a;
                teh.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.u0 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.v0) {
            this.v0 = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        e();
        fcg fcgVar = (fcg) this.o;
        fcgVar.d = i != 0 ? eri.a(fcgVar.a.getContext(), i) : null;
        fcgVar.c();
    }

    public void setLogo(int i) {
        e();
        fcg fcgVar = (fcg) this.o;
        fcgVar.e = i != 0 ? eri.a(fcgVar.a.getContext(), i) : null;
        fcgVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.t0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.wh4
    public void setWindowCallback(Window.Callback callback) {
        e();
        ((fcg) this.o).k = callback;
    }

    @Override // defpackage.wh4
    public void setWindowTitle(CharSequence charSequence) {
        e();
        fcg fcgVar = (fcg) this.o;
        if (fcgVar.g) {
            return;
        }
        Toolbar toolbar = fcgVar.a;
        fcgVar.h = charSequence;
        if ((fcgVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (fcgVar.g) {
                hfh.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new v6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        e();
        fcg fcgVar = (fcg) this.o;
        fcgVar.d = drawable;
        fcgVar.c();
    }
}
