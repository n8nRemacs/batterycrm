package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class re3 extends FrameLayout {
    public static final int S0 = m5d.Widget_Design_CollapsingToolbar;
    public boolean A0;
    public Drawable B0;
    public Drawable C0;
    public int D0;
    public boolean E0;
    public ValueAnimator F0;
    public long G0;
    public final TimeInterpolator H0;
    public final TimeInterpolator I0;
    public int J0;
    public pe3 K0;
    public int L0;
    public int M0;
    public g4i N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final Rect w0;
    public final ne3 x0;
    public final ca5 y0;
    public boolean z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public re3(Context context) {
        int i;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        int i2 = dvc.collapsingToolbarLayoutStyle;
        int i3 = S0;
        super(er8.a(context, null, i2, i3), null, i2);
        this.a = true;
        this.w0 = new Rect();
        this.J0 = -1;
        this.O0 = 0;
        this.Q0 = 0;
        Context context2 = getContext();
        ne3 ne3Var = new ne3(this);
        this.x0 = ne3Var;
        ne3Var.W = rg.e;
        ne3Var.i(false);
        ne3Var.J = false;
        this.y0 = new ca5(context2);
        int[] iArr = z5d.CollapsingToolbarLayout;
        d7g.a(context2, null, i2, i3);
        d7g.b(context2, null, iArr, i2, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, i2, i3);
        int i4 = typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (ne3Var.j != i4) {
            ne3Var.j = i4;
            ne3Var.i(false);
        }
        ne3Var.l(typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.v0 = dimensionPixelSize;
        this.u0 = dimensionPixelSize;
        this.t0 = dimensionPixelSize;
        this.s0 = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.z0 = typedArrayObtainStyledAttributes.getBoolean(z5d.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(z5d.CollapsingToolbarLayout_title));
        ne3Var.n(m5d.TextAppearance_Design_CollapsingToolbar_Expanded);
        ne3Var.k(s5d.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            ne3Var.n(typedArrayObtainStyledAttributes.getResourceId(z5d.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            ne3Var.k(typedArrayObtainStyledAttributes.getResourceId(z5d.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_titleTextEllipsize)) {
            int i5 = typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_titleTextEllipsize, -1);
            setTitleEllipsize(i5 != 0 ? i5 != 1 ? i5 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_expandedTitleTextColor) && ne3Var.n != (colorStateListC2 = gti.c(context2, typedArrayObtainStyledAttributes, z5d.CollapsingToolbarLayout_expandedTitleTextColor))) {
            ne3Var.n = colorStateListC2;
            ne3Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_collapsedTitleTextColor) && ne3Var.o != (colorStateListC = gti.c(context2, typedArrayObtainStyledAttributes, z5d.CollapsingToolbarLayout_collapsedTitleTextColor))) {
            ne3Var.o = colorStateListC;
            ne3Var.i(false);
        }
        this.J0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_maxLines) && (i = typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_maxLines, 1)) != ne3Var.n0) {
            ne3Var.n0 = i;
            Bitmap bitmap = ne3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                ne3Var.K = null;
            }
            ne3Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.CollapsingToolbarLayout_titlePositionInterpolator)) {
            ne3Var.V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(z5d.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            ne3Var.i(false);
        }
        this.G0 = typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.H0 = exi.d(context2, dvc.motionEasingStandardInterpolator, rg.c);
        this.I0 = exi.d(context2, dvc.motionEasingStandardInterpolator, rg.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(z5d.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(z5d.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(z5d.CollapsingToolbarLayout_toolbarId, -1);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(z5d.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(z5d.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        usd usdVar = new usd(11, this);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(this, usdVar);
    }

    public static mgh b(View view) {
        mgh mghVar = (mgh) view.getTag(uxc.view_offset_helper);
        if (mghVar != null) {
            return mghVar;
        }
        mgh mghVar2 = new mgh(view);
        view.setTag(uxc.view_offset_helper, mghVar2);
        return mghVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        Context context = getContext();
        TypedValue typedValueE = wsi.e(context, dvc.colorSurfaceContainer);
        ColorStateList colorStateListValueOf = null;
        if (typedValueE != null) {
            int i = typedValueE.resourceId;
            if (i != 0) {
                colorStateListValueOf = z7.c(context, i);
            } else {
                int i2 = typedValueE.data;
                if (i2 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(dwc.design_appbar_elevation);
        ca5 ca5Var = this.y0;
        return ca5Var.a(ca5Var.d, dimension);
    }

    public final void a() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.z0 && (view = this.o) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.o);
            }
        }
        if (!this.z0 || this.c == null) {
            return;
        }
        if (this.o == null) {
            this.o = new View(getContext());
        }
        if (this.o.getParent() == null) {
            this.c.addView(this.o, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oe3;
    }

    public final void d() {
        if (this.B0 == null && this.C0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.L0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.B0) != null && this.D0 > 0) {
            drawable.mutate().setAlpha(this.D0);
            this.B0.draw(canvas);
        }
        if (this.z0 && this.A0) {
            ViewGroup viewGroup = this.c;
            ne3 ne3Var = this.x0;
            if (viewGroup == null || this.B0 == null || this.D0 <= 0 || this.M0 != 1 || ne3Var.b >= ne3Var.e) {
                ne3Var.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.B0.getBounds(), Region.Op.DIFFERENCE);
                ne3Var.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.C0 == null || this.D0 <= 0) {
            return;
        }
        g4i g4iVar = this.N0;
        int iD = g4iVar != null ? g4iVar.d() : 0;
        if (iD > 0) {
            this.C0.setBounds(0, -this.L0, getWidth(), iD - this.L0);
            this.C0.mutate().setAlpha(this.D0);
            this.C0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.B0;
        if (drawable == null || this.D0 <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.M0 == 1 && view != null && this.z0) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.B0.mutate().setAlpha(this.D0);
            this.B0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C0;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.B0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        ne3 ne3Var = this.x0;
        if (ne3Var != null) {
            ne3Var.R = drawableState;
            ColorStateList colorStateList2 = ne3Var.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = ne3Var.n) != null && colorStateList.isStateful())) {
                ne3Var.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.z0 || (view = this.o) == null) {
            return;
        }
        WeakHashMap weakHashMap = hfh.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.o.getVisibility() == 0;
        this.A0 = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((oe3) view2.getLayoutParams())).bottomMargin;
            View view3 = this.o;
            ThreadLocal threadLocal = cu4.a;
            int width = view3.getWidth();
            int height2 = view3.getHeight();
            Rect rect = this.w0;
            rect.set(0, 0, width, height2);
            cu4.b(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            ne3 ne3Var = this.x0;
            Rect rect2 = ne3Var.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                ne3Var.S = true;
            }
            int i10 = z3 ? this.u0 : this.s0;
            int i11 = rect.top + this.t0;
            int i12 = (i3 - i) - (z3 ? this.s0 : this.u0);
            int i13 = (i4 - i2) - this.v0;
            Rect rect3 = ne3Var.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                ne3Var.S = true;
            }
            ne3Var.i(z);
        }
    }

    public final void f() {
        if (this.c != null && this.z0 && TextUtils.isEmpty(this.x0.G)) {
            ViewGroup viewGroup = this.c;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new oe3(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.x0.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.x0.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.x0.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.B0;
    }

    public int getExpandedTitleGravity() {
        return this.x0.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.v0;
    }

    public int getExpandedTitleMarginEnd() {
        return this.u0;
    }

    public int getExpandedTitleMarginStart() {
        return this.s0;
    }

    public int getExpandedTitleMarginTop() {
        return this.t0;
    }

    public float getExpandedTitleTextSize() {
        return this.x0.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.x0.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.x0.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.x0.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.x0.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.x0.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.x0.n0;
    }

    public int getScrimAlpha() {
        return this.D0;
    }

    public long getScrimAnimationDuration() {
        return this.G0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.J0;
        if (i >= 0) {
            return i + this.O0 + this.Q0;
        }
        g4i g4iVar = this.N0;
        int iD = g4iVar != null ? g4iVar.d() : 0;
        WeakHashMap weakHashMap = hfh.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.C0;
    }

    public CharSequence getTitle() {
        if (this.z0) {
            return this.x0.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.M0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.x0.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.x0.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof in) {
            in inVar = (in) parent;
            if (this.M0 == 1) {
                inVar.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = hfh.a;
            setFitsSystemWindows(inVar.getFitsSystemWindows());
            if (this.K0 == null) {
                this.K0 = new pe3(this);
            }
            inVar.a(this.K0);
            teh.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.x0.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        pe3 pe3Var = this.K0;
        if (pe3Var != null && (parent instanceof in) && (arrayList = ((in) parent).u0) != null) {
            arrayList.remove(pe3Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g4i g4iVar = this.N0;
        if (g4iVar != null) {
            int iD = g4iVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = hfh.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            mgh mghVarB = b(getChildAt(i6));
            View view = mghVarB.a;
            mghVarB.b = view.getTop();
            mghVarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r9.a()
            super.onMeasure(r10, r11)
            int r11 = android.view.View.MeasureSpec.getMode(r11)
            g4i r0 = r9.N0
            if (r0 == 0) goto L13
            int r0 = r0.d()
            goto L14
        L13:
            r0 = 0
        L14:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == 0) goto L1c
            boolean r11 = r9.P0
            if (r11 == 0) goto L2c
        L1c:
            if (r0 <= 0) goto L2c
            r9.O0 = r0
            int r11 = r9.getMeasuredHeight()
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
        L2c:
            boolean r11 = r9.R0
            if (r11 == 0) goto L7f
            ne3 r11 = r9.x0
            int r0 = r11.n0
            r2 = 1
            if (r0 <= r2) goto L7f
            r9.f()
            int r7 = r9.getMeasuredWidth()
            int r8 = r9.getMeasuredHeight()
            r4 = 1
            r5 = 0
            r6 = 0
            r3 = r9
            r3.e(r4, r5, r6, r7, r8)
            int r0 = r11.p
            if (r0 <= r2) goto L80
            android.text.TextPaint r4 = r11.U
            float r5 = r11.l
            r4.setTextSize(r5)
            android.graphics.Typeface r5 = r11.z
            r4.setTypeface(r5)
            float r11 = r11.g0
            r4.setLetterSpacing(r11)
            float r11 = r4.ascent()
            float r11 = -r11
            float r4 = r4.descent()
            float r4 = r4 + r11
            int r11 = java.lang.Math.round(r4)
            int r0 = r0 - r2
            int r0 = r0 * r11
            r3.Q0 = r0
            int r11 = r9.getMeasuredHeight()
            int r0 = r3.Q0
            int r11 = r11 + r0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r1)
            super.onMeasure(r10, r11)
            goto L80
        L7f:
            r3 = r9
        L80:
            android.view.ViewGroup r10 = r3.c
            if (r10 == 0) goto Lc4
            android.view.View r11 = r3.d
            if (r11 == 0) goto La8
            if (r11 != r3) goto L8b
            goto La8
        L8b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto La0
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r11 = r11.getMeasuredHeight()
            int r0 = r10.topMargin
            int r11 = r11 + r0
            int r10 = r10.bottomMargin
            int r11 = r11 + r10
            goto La4
        La0:
            int r11 = r11.getMeasuredHeight()
        La4:
            r9.setMinimumHeight(r11)
            return
        La8:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            boolean r0 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lbd
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r10 = r10.getMeasuredHeight()
            int r0 = r11.topMargin
            int r10 = r10 + r0
            int r11 = r11.bottomMargin
            int r10 = r10 + r11
            goto Lc1
        Lbd:
            int r10 = r10.getMeasuredHeight()
        Lc1:
            r9.setMinimumHeight(r10)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re3.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.B0;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.M0 == 1 && viewGroup != null && this.z0) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.x0.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.x0.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        ne3 ne3Var = this.x0;
        if (ne3Var.o != colorStateList) {
            ne3Var.o = colorStateList;
            ne3Var.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        ne3 ne3Var = this.x0;
        if (ne3Var.m != f) {
            ne3Var.m = f;
            ne3Var.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        ne3 ne3Var = this.x0;
        if (ne3Var.m(typeface)) {
            ne3Var.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.B0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B0 = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.M0 == 1 && viewGroup != null && this.z0) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.B0.setCallback(this);
                this.B0.setAlpha(this.D0);
            }
            WeakHashMap weakHashMap = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(r34.b(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        ne3 ne3Var = this.x0;
        if (ne3Var.j != i) {
            ne3Var.j = i;
            ne3Var.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.v0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.u0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.s0 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.t0 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.x0.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        ne3 ne3Var = this.x0;
        if (ne3Var.n != colorStateList) {
            ne3Var.n = colorStateList;
            ne3Var.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        ne3 ne3Var = this.x0;
        if (ne3Var.l != f) {
            ne3Var.l = f;
            ne3Var.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        ne3 ne3Var = this.x0;
        if (ne3Var.o(typeface)) {
            ne3Var.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.R0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.P0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.x0.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.x0.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.x0.p0 = f;
    }

    public void setMaxLines(int i) {
        ne3 ne3Var = this.x0;
        if (i != ne3Var.n0) {
            ne3Var.n0 = i;
            Bitmap bitmap = ne3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                ne3Var.K = null;
            }
            ne3Var.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.x0.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.D0) {
            if (this.B0 != null && (viewGroup = this.c) != null) {
                WeakHashMap weakHashMap = hfh.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.D0 = i;
            WeakHashMap weakHashMap2 = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.G0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = hfh.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.E0 != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.F0;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.F0 = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.D0 ? this.H0 : this.I0);
                    this.F0.addUpdateListener(new wk0(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.F0.cancel();
                }
                this.F0.setDuration(this.G0);
                this.F0.setIntValues(this.D0, i);
                this.F0.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.E0 = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(qe3 qe3Var) {
        ne3 ne3Var = this.x0;
        if (qe3Var != null) {
            ne3Var.i(true);
        } else {
            ne3Var.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.C0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.C0.setState(getDrawableState());
                }
                Drawable drawable3 = this.C0;
                WeakHashMap weakHashMap = hfh.a;
                u35.b(drawable3, getLayoutDirection());
                this.C0.setVisible(getVisibility() == 0, false);
                this.C0.setCallback(this);
                this.C0.setAlpha(this.D0);
            }
            WeakHashMap weakHashMap2 = hfh.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(r34.b(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        ne3 ne3Var = this.x0;
        if (charSequence == null || !TextUtils.equals(ne3Var.G, charSequence)) {
            ne3Var.G = charSequence;
            ne3Var.H = null;
            Bitmap bitmap = ne3Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                ne3Var.K = null;
            }
            ne3Var.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.M0 = i;
        boolean z = i == 1;
        this.x0.c = z;
        ViewParent parent = getParent();
        if (parent instanceof in) {
            in inVar = (in) parent;
            if (this.M0 == 1) {
                inVar.setLiftOnScroll(false);
            }
        }
        if (z && this.B0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        ne3 ne3Var = this.x0;
        ne3Var.F = truncateAt;
        ne3Var.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.z0) {
            this.z0 = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        ne3 ne3Var = this.x0;
        ne3Var.V = timeInterpolator;
        ne3Var.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.C0;
        if (drawable != null && drawable.isVisible() != z) {
            this.C0.setVisible(z, false);
        }
        Drawable drawable2 = this.B0;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.B0.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B0 || drawable == this.C0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new oe3(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        oe3 oe3Var = new oe3(context, attributeSet);
        oe3Var.a = 0;
        oe3Var.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5d.CollapsingToolbarLayout_Layout);
        oe3Var.a = typedArrayObtainStyledAttributes.getInt(z5d.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        oe3Var.b = typedArrayObtainStyledAttributes.getFloat(z5d.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return oe3Var;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        oe3 oe3Var = new oe3(layoutParams);
        oe3Var.a = 0;
        oe3Var.b = 0.5f;
        return oe3Var;
    }
}
