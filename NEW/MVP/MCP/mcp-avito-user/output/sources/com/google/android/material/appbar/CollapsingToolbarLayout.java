package com.google.android.material.appbar;

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
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C;
import com.google.android.material.internal.C37062c;
import com.google.android.material.internal.C37064e;
import com.google.android.material.internal.G;
import j.F;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.InterfaceC42167x;
import j.N;
import j.P;
import j.X;
import j.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;
import lY0.C43707b;
import sY0.C48134a;
import wY0.C49576a;

/* loaded from: classes6.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: G, reason: collision with root package name */
    public static final int f355759G = R.style.Widget_Design_CollapsingToolbar;

    /* renamed from: A, reason: collision with root package name */
    public int f355760A;

    /* renamed from: B, reason: collision with root package name */
    @P
    public J0 f355761B;

    /* renamed from: C, reason: collision with root package name */
    public int f355762C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f355763D;

    /* renamed from: E, reason: collision with root package name */
    public int f355764E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f355765F;

    /* renamed from: b, reason: collision with root package name */
    public boolean f355766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f355767c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public ViewGroup f355768d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public View f355769e;

    /* renamed from: f, reason: collision with root package name */
    public View f355770f;

    /* renamed from: g, reason: collision with root package name */
    public int f355771g;

    /* renamed from: h, reason: collision with root package name */
    public int f355772h;

    /* renamed from: i, reason: collision with root package name */
    public int f355773i;

    /* renamed from: j, reason: collision with root package name */
    public int f355774j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f355775k;

    /* renamed from: l, reason: collision with root package name */
    @N
    public final C37062c f355776l;

    /* renamed from: m, reason: collision with root package name */
    @N
    public final C48134a f355777m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f355778n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f355779o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public Drawable f355780p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public Drawable f355781q;

    /* renamed from: r, reason: collision with root package name */
    public int f355782r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f355783s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f355784t;

    /* renamed from: u, reason: collision with root package name */
    public long f355785u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f355786v;

    /* renamed from: w, reason: collision with root package name */
    public final TimeInterpolator f355787w;

    /* renamed from: x, reason: collision with root package name */
    public int f355788x;

    /* renamed from: y, reason: collision with root package name */
    public AppBarLayout.g f355789y;

    /* renamed from: z, reason: collision with root package name */
    public int f355790z;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f355791a;

        /* renamed from: b, reason: collision with root package name */
        public float f355792b;
    }

    public class b implements AppBarLayout.g {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void c(AppBarLayout appBarLayout, int i12) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f355790z = i12;
            J0 j02 = collapsingToolbarLayout.f355761B;
            int iK2 = j02 != null ? j02.k() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = collapsingToolbarLayout.getChildAt(i13);
                a aVar = (a) childAt.getLayoutParams();
                l lVarB = CollapsingToolbarLayout.b(childAt);
                int i14 = aVar.f355791a;
                if (i14 == 1) {
                    lVarB.b(M0.a.b(-i12, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f355839b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin));
                } else if (i14 == 2) {
                    lVarB.b(Math.round((-i12) * aVar.f355792b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.f355781q != null && iK2 > 0) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - iK2;
            float f12 = minimumHeight;
            float fMin = Math.min(1.0f, (height - collapsingToolbarLayout.getScrimVisibleHeightTrigger()) / f12);
            C37062c c37062c = collapsingToolbarLayout.f355776l;
            c37062c.f356787d = fMin;
            c37062c.f356789e = r.c(1.0f, fMin, 0.5f, fMin);
            c37062c.f356791f = collapsingToolbarLayout.f355790z + minimumHeight;
            c37062c.p(Math.abs(i12) / f12);
        }
    }

    @RestrictTo
    @X
    public interface c extends C {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface d {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@N Context context, @P AttributeSet attributeSet) throws Resources.NotFoundException {
        int i12;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        int i13 = R.attr.collapsingToolbarLayoutStyle;
        int i14 = f355759G;
        super(BY0.a.a(context, attributeSet, i13, i14), attributeSet, i13);
        this.f355766b = true;
        this.f355775k = new Rect();
        this.f355788x = -1;
        this.f355762C = 0;
        this.f355764E = 0;
        Context context2 = getContext();
        C37062c c37062c = new C37062c(this);
        this.f355776l = c37062c;
        c37062c.f356777W = C43707b.f413883e;
        c37062c.i(false);
        c37062c.f356764J = false;
        this.f355777m = new C48134a(context2);
        int[] iArr = R.styleable.CollapsingToolbarLayout;
        G.a(context2, attributeSet, i13, i14);
        G.b(context2, attributeSet, iArr, i13, i14, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (c37062c.f356799j != i15) {
            c37062c.f356799j = i15;
            c37062c.i(false);
        }
        c37062c.l(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f355774j = dimensionPixelSize;
        this.f355773i = dimensionPixelSize;
        this.f355772h = dimensionPixelSize;
        this.f355771g = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f355771g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f355773i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f355772h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f355774j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f355778n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(R.styleable.CollapsingToolbarLayout_title));
        c37062c.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c37062c.k(com.avito.android.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            c37062c.n(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            c37062c.k(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleTextEllipsize, -1);
            setTitleEllipsize(i16 != 0 ? i16 != 1 ? i16 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextColor) && c37062c.f356807n != (colorStateListB2 = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.CollapsingToolbarLayout_expandedTitleTextColor))) {
            c37062c.f356807n = colorStateListB2;
            c37062c.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor) && c37062c.f356809o != (colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor))) {
            c37062c.f356809o = colorStateListB;
            c37062c.i(false);
        }
        this.f355788x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_maxLines) && (i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_maxLines, 1)) != c37062c.f356808n0) {
            c37062c.f356808n0 = i12;
            Bitmap bitmap = c37062c.f356765K;
            if (bitmap != null) {
                bitmap.recycle();
                c37062c.f356765K = null;
            }
            c37062c.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            c37062c.f356776V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            c37062c.i(false);
        }
        this.f355785u = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.f355786v = C49576a.d(context2, R.attr.motionEasingStandardInterpolator, C43707b.f413881c);
        this.f355787w = C49576a.d(context2, R.attr.motionEasingStandardInterpolator, C43707b.f413882d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f355767c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.f355763D = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f355765F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C22823h0.K(this, new g(this));
    }

    @N
    public static l b(@N View view) {
        l lVar = (l) view.getTag(R.id.view_offset_helper);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(view);
        view.setTag(R.id.view_offset_helper, lVar2);
        return lVar2;
    }

    public final void a() {
        if (this.f355766b) {
            ViewGroup viewGroup = null;
            this.f355768d = null;
            this.f355769e = null;
            int i12 = this.f355767c;
            if (i12 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i12);
                this.f355768d = viewGroup2;
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
                    this.f355769e = view;
                }
            }
            if (this.f355768d == null) {
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f355768d = viewGroup;
            }
            c();
            this.f355766b = false;
        }
    }

    public final void c() {
        View view;
        if (!this.f355778n && (view = this.f355770f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f355770f);
            }
        }
        if (!this.f355778n || this.f355768d == null) {
            return;
        }
        if (this.f355770f == null) {
            this.f355770f = new View(getContext());
        }
        if (this.f355770f.getParent() == null) {
            this.f355768d.addView(this.f355770f, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        if (this.f355780p == null && this.f355781q == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f355790z < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(@N Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f355768d == null && (drawable = this.f355780p) != null && this.f355782r > 0) {
            drawable.mutate().setAlpha(this.f355782r);
            this.f355780p.draw(canvas);
        }
        if (this.f355778n && this.f355779o) {
            ViewGroup viewGroup = this.f355768d;
            C37062c c37062c = this.f355776l;
            if (viewGroup == null || this.f355780p == null || this.f355782r <= 0 || this.f355760A != 1 || c37062c.f356783b >= c37062c.f356789e) {
                c37062c.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f355780p.getBounds(), Region.Op.DIFFERENCE);
                c37062c.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f355781q == null || this.f355782r <= 0) {
            return;
        }
        J0 j02 = this.f355761B;
        int iK2 = j02 != null ? j02.k() : 0;
        if (iK2 > 0) {
            this.f355781q.setBounds(0, -this.f355790z, getWidth(), iK2 - this.f355790z);
            this.f355781q.mutate().setAlpha(this.f355782r);
            this.f355781q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j12) {
        boolean z12;
        View view2;
        Drawable drawable = this.f355780p;
        if (drawable == null || this.f355782r <= 0 || ((view2 = this.f355769e) == null || view2 == this ? view != this.f355768d : view != view2)) {
            z12 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f355760A == 1 && view != null && this.f355778n) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f355780p.mutate().setAlpha(this.f355782r);
            this.f355780p.draw(canvas);
            z12 = true;
        }
        return super.drawChild(canvas, view, j12) || z12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f355781q;
        boolean z12 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f355780p;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C37062c c37062c = this.f355776l;
        if (c37062c != null) {
            c37062c.f356772R = drawableState;
            ColorStateList colorStateList2 = c37062c.f356809o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c37062c.f356807n) != null && colorStateList.isStateful())) {
                c37062c.i(false);
                z12 = true;
            }
            state |= z12;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i12, int i13, int i14, int i15, boolean z12) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f355778n || (view = this.f355770f) == null) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int titleMarginStart = 0;
        boolean z13 = view.isAttachedToWindow() && this.f355770f.getVisibility() == 0;
        this.f355779o = z13;
        if (z13 || z12) {
            boolean z14 = getLayoutDirection() == 1;
            View view2 = this.f355769e;
            if (view2 == null) {
                view2 = this.f355768d;
            }
            int height = ((getHeight() - b(view2).f355839b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f355770f;
            Rect rect = this.f355775k;
            C37064e.a(this, view3, rect);
            ViewGroup viewGroup = this.f355768d;
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
            int i16 = rect.left + (z14 ? titleMarginEnd : titleMarginStart);
            int i17 = rect.top + height + titleMarginTop;
            int i18 = rect.right;
            if (!z14) {
                titleMarginStart = titleMarginEnd;
            }
            int i19 = i18 - titleMarginStart;
            int i22 = (rect.bottom + height) - titleMarginBottom;
            C37062c c37062c = this.f355776l;
            Rect rect2 = c37062c.f356795h;
            if (rect2.left != i16 || rect2.top != i17 || rect2.right != i19 || rect2.bottom != i22) {
                rect2.set(i16, i17, i19, i22);
                c37062c.f356773S = true;
            }
            int i23 = z14 ? this.f355773i : this.f355771g;
            int i24 = rect.top + this.f355772h;
            int i25 = (i14 - i12) - (z14 ? this.f355771g : this.f355773i);
            int i26 = (i15 - i13) - this.f355774j;
            Rect rect3 = c37062c.f356793g;
            if (rect3.left != i23 || rect3.top != i24 || rect3.right != i25 || rect3.bottom != i26) {
                rect3.set(i23, i24, i25, i26);
                c37062c.f356773S = true;
            }
            c37062c.i(z12);
        }
    }

    public final void f() {
        if (this.f355768d != null && this.f355778n && TextUtils.isEmpty(this.f355776l.f356761G)) {
            ViewGroup viewGroup = this.f355768d;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f355791a = 0;
        aVar.f355792b = 0.5f;
        return aVar;
    }

    public int getCollapsedTitleGravity() {
        return this.f355776l.f356801k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f355776l.f356805m;
    }

    @N
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f355776l.f356821w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @P
    public Drawable getContentScrim() {
        return this.f355780p;
    }

    public int getExpandedTitleGravity() {
        return this.f355776l.f356799j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f355774j;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f355773i;
    }

    public int getExpandedTitleMarginStart() {
        return this.f355771g;
    }

    public int getExpandedTitleMarginTop() {
        return this.f355772h;
    }

    public float getExpandedTitleTextSize() {
        return this.f355776l.f356803l;
    }

    @N
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f355776l.f356824z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RestrictTo
    @X
    public int getHyphenationFrequency() {
        return this.f355776l.f356814q0;
    }

    @RestrictTo
    public int getLineCount() {
        StaticLayout staticLayout = this.f355776l.f356798i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RestrictTo
    @X
    public float getLineSpacingAdd() {
        return this.f355776l.f356798i0.getSpacingAdd();
    }

    @RestrictTo
    @X
    public float getLineSpacingMultiplier() {
        return this.f355776l.f356798i0.getSpacingMultiplier();
    }

    @RestrictTo
    public int getMaxLines() {
        return this.f355776l.f356808n0;
    }

    public int getScrimAlpha() {
        return this.f355782r;
    }

    public long getScrimAnimationDuration() {
        return this.f355785u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i12 = this.f355788x;
        if (i12 >= 0) {
            return i12 + this.f355762C + this.f355764E;
        }
        J0 j02 = this.f355761B;
        int iK2 = j02 != null ? j02.k() : 0;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iK2, getHeight()) : getHeight() / 3;
    }

    @P
    public Drawable getStatusBarScrim() {
        return this.f355781q;
    }

    @P
    public CharSequence getTitle() {
        if (this.f355778n) {
            return this.f355776l.f356761G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f355760A;
    }

    @P
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f355776l.f356776V;
    }

    @N
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f355776l.f356760F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f355760A == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f355789y == null) {
                this.f355789y = new b();
            }
            appBarLayout.a(this.f355789y);
            C22823h0.A(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f355776l.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f355789y;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).f(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        J0 j02 = this.f355761B;
        if (j02 != null) {
            int iK2 = j02.k();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iK2) {
                    childAt.offsetTopAndBottom(iK2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            l lVarB = b(getChildAt(i17));
            View view = lVarB.f355838a;
            lVarB.f355839b = view.getTop();
            lVarB.f355840c = view.getLeft();
        }
        e(i12, i13, i14, i15, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i18 = 0; i18 < childCount3; i18++) {
            b(getChildAt(i18)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i12, i13);
        int mode = View.MeasureSpec.getMode(i13);
        J0 j02 = this.f355761B;
        int iK2 = j02 != null ? j02.k() : 0;
        if ((mode == 0 || this.f355763D) && iK2 > 0) {
            this.f355762C = iK2;
            super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iK2, 1073741824));
        }
        if (this.f355765F) {
            C37062c c37062c = this.f355776l;
            if (c37062c.f356808n0 > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i14 = c37062c.f356811p;
                if (i14 > 1) {
                    TextPaint textPaint = c37062c.f356775U;
                    textPaint.setTextSize(c37062c.f356803l);
                    textPaint.setTypeface(c37062c.f356824z);
                    textPaint.setLetterSpacing(c37062c.f356794g0);
                    this.f355764E = (i14 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f355764E, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f355768d;
        if (viewGroup != null) {
            View view = this.f355769e;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        Drawable drawable = this.f355780p;
        if (drawable != null) {
            ViewGroup viewGroup = this.f355768d;
            if (this.f355760A == 1 && viewGroup != null && this.f355778n) {
                i13 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i12, i13);
        }
    }

    public void setCollapsedTitleGravity(int i12) {
        this.f355776l.l(i12);
    }

    public void setCollapsedTitleTextAppearance(@f0 int i12) {
        this.f355776l.k(i12);
    }

    public void setCollapsedTitleTextColor(@N ColorStateList colorStateList) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356809o != colorStateList) {
            c37062c.f356809o = colorStateList;
            c37062c.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f12) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356805m != f12) {
            c37062c.f356805m = f12;
            c37062c.i(false);
        }
    }

    public void setCollapsedTitleTypeface(@P Typeface typeface) {
        C37062c c37062c = this.f355776l;
        if (c37062c.m(typeface)) {
            c37062c.i(false);
        }
    }

    public void setContentScrim(@P Drawable drawable) {
        Drawable drawable2 = this.f355780p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f355780p = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f355768d;
                if (this.f355760A == 1 && viewGroup != null && this.f355778n) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f355780p.setCallback(this);
                this.f355780p.setAlpha(this.f355782r);
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@InterfaceC42156l int i12) {
        setContentScrim(new ColorDrawable(i12));
    }

    public void setContentScrimResource(@InterfaceC42165v int i12) {
        setContentScrim(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public void setExpandedTitleColor(@InterfaceC42156l int i12) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i12));
    }

    public void setExpandedTitleGravity(int i12) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356799j != i12) {
            c37062c.f356799j = i12;
            c37062c.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i12) {
        this.f355774j = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i12) {
        this.f355773i = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i12) {
        this.f355771g = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i12) {
        this.f355772h = i12;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@f0 int i12) {
        this.f355776l.n(i12);
    }

    public void setExpandedTitleTextColor(@N ColorStateList colorStateList) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356807n != colorStateList) {
            c37062c.f356807n = colorStateList;
            c37062c.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f12) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356803l != f12) {
            c37062c.f356803l = f12;
            c37062c.i(false);
        }
    }

    public void setExpandedTitleTypeface(@P Typeface typeface) {
        C37062c c37062c = this.f355776l;
        if (c37062c.o(typeface)) {
            c37062c.i(false);
        }
    }

    @RestrictTo
    public void setExtraMultilineHeightEnabled(boolean z12) {
        this.f355765F = z12;
    }

    @RestrictTo
    public void setForceApplySystemWindowInsetTop(boolean z12) {
        this.f355763D = z12;
    }

    @RestrictTo
    @X
    public void setHyphenationFrequency(int i12) {
        this.f355776l.f356814q0 = i12;
    }

    @RestrictTo
    @X
    public void setLineSpacingAdd(float f12) {
        this.f355776l.f356810o0 = f12;
    }

    @RestrictTo
    @X
    public void setLineSpacingMultiplier(@InterfaceC42167x float f12) {
        this.f355776l.f356812p0 = f12;
    }

    @RestrictTo
    public void setMaxLines(int i12) {
        C37062c c37062c = this.f355776l;
        if (i12 != c37062c.f356808n0) {
            c37062c.f356808n0 = i12;
            Bitmap bitmap = c37062c.f356765K;
            if (bitmap != null) {
                bitmap.recycle();
                c37062c.f356765K = null;
            }
            c37062c.i(false);
        }
    }

    @RestrictTo
    public void setRtlTextDirectionHeuristicsEnabled(boolean z12) {
        this.f355776l.f356764J = z12;
    }

    public void setScrimAlpha(int i12) {
        ViewGroup viewGroup;
        if (i12 != this.f355782r) {
            if (this.f355780p != null && (viewGroup = this.f355768d) != null) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f355782r = i12;
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@F long j12) {
        this.f355785u = j12;
    }

    public void setScrimVisibleHeightTrigger(@F int i12) {
        if (this.f355788x != i12) {
            this.f355788x = i12;
            d();
        }
    }

    public void setScrimsShown(boolean z12) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z13 = isLaidOut() && !isInEditMode();
        if (this.f355783s != z12) {
            if (z13) {
                int i12 = z12 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f355784t;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f355784t = valueAnimator2;
                    valueAnimator2.setInterpolator(i12 > this.f355782r ? this.f355786v : this.f355787w);
                    this.f355784t.addUpdateListener(new h(this));
                } else if (valueAnimator.isRunning()) {
                    this.f355784t.cancel();
                }
                this.f355784t.setDuration(this.f355785u);
                this.f355784t.setIntValues(this.f355782r, i12);
                this.f355784t.start();
            } else {
                setScrimAlpha(z12 ? 255 : 0);
            }
            this.f355783s = z12;
        }
    }

    @RestrictTo
    @X
    public void setStaticLayoutBuilderConfigurer(@P c cVar) {
        C37062c c37062c = this.f355776l;
        if (c37062c.f356816r0 != cVar) {
            c37062c.f356816r0 = cVar;
            c37062c.i(true);
        }
    }

    public void setStatusBarScrim(@P Drawable drawable) {
        Drawable drawable2 = this.f355781q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f355781q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f355781q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f355781q;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f355781q.setVisible(getVisibility() == 0, false);
                this.f355781q.setCallback(this);
                this.f355781q.setAlpha(this.f355782r);
            }
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@InterfaceC42156l int i12) {
        setStatusBarScrim(new ColorDrawable(i12));
    }

    public void setStatusBarScrimResource(@InterfaceC42165v int i12) {
        setStatusBarScrim(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public void setTitle(@P CharSequence charSequence) {
        C37062c c37062c = this.f355776l;
        if (charSequence == null || !TextUtils.equals(c37062c.f356761G, charSequence)) {
            c37062c.f356761G = charSequence;
            c37062c.f356762H = null;
            Bitmap bitmap = c37062c.f356765K;
            if (bitmap != null) {
                bitmap.recycle();
                c37062c.f356765K = null;
            }
            c37062c.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i12) throws Resources.NotFoundException {
        this.f355760A = i12;
        boolean z12 = i12 == 1;
        this.f355776l.f356785c = z12;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f355760A == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z12 && this.f355780p == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            C48134a c48134a = this.f355777m;
            setContentScrimColor(c48134a.a(dimension, c48134a.f437720d));
        }
    }

    public void setTitleEllipsize(@N TextUtils.TruncateAt truncateAt) {
        C37062c c37062c = this.f355776l;
        c37062c.f356760F = truncateAt;
        c37062c.i(false);
    }

    public void setTitleEnabled(boolean z12) {
        if (z12 != this.f355778n) {
            this.f355778n = z12;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@P TimeInterpolator timeInterpolator) {
        C37062c c37062c = this.f355776l;
        c37062c.f356776V = timeInterpolator;
        c37062c.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        boolean z12 = i12 == 0;
        Drawable drawable = this.f355781q;
        if (drawable != null && drawable.isVisible() != z12) {
            this.f355781q.setVisible(z12, false);
        }
        Drawable drawable2 = this.f355780p;
        if (drawable2 == null || drawable2.isVisible() == z12) {
            return;
        }
        this.f355780p.setVisible(z12, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@N Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f355780p || drawable == this.f355781q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f355791a = 0;
        aVar.f355792b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
        aVar.f355791a = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        aVar.f355792b = typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void setCollapsedTitleTextColor(@InterfaceC42156l int i12) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i12));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f355791a = 0;
        aVar.f355792b = 0.5f;
        return aVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        aVar.f355791a = 0;
        aVar.f355792b = 0.5f;
        return aVar;
    }
}
