package net.opacapp.multilinecollapsingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import j.F;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.f0;
import java.util.WeakHashMap;
import net.opacapp.multilinecollapsingtoolbar.g;
import net.opacapp.multilinecollapsingtoolbar.p;

/* loaded from: classes7.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f419008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419009c;

    /* renamed from: d, reason: collision with root package name */
    public Toolbar f419010d;

    /* renamed from: e, reason: collision with root package name */
    public View f419011e;

    /* renamed from: f, reason: collision with root package name */
    public View f419012f;

    /* renamed from: g, reason: collision with root package name */
    public int f419013g;

    /* renamed from: h, reason: collision with root package name */
    public int f419014h;

    /* renamed from: i, reason: collision with root package name */
    public int f419015i;

    /* renamed from: j, reason: collision with root package name */
    public int f419016j;

    /* renamed from: k, reason: collision with root package name */
    public int f419017k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f419018l;

    /* renamed from: m, reason: collision with root package name */
    public final c f419019m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f419020n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f419021o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f419022p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f419023q;

    /* renamed from: r, reason: collision with root package name */
    public int f419024r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f419025s;

    /* renamed from: t, reason: collision with root package name */
    public k f419026t;

    /* renamed from: u, reason: collision with root package name */
    public long f419027u;

    /* renamed from: v, reason: collision with root package name */
    public int f419028v;

    /* renamed from: w, reason: collision with root package name */
    public AppBarLayout.g f419029w;

    /* renamed from: x, reason: collision with root package name */
    public int f419030x;

    /* renamed from: y, reason: collision with root package name */
    public J0 f419031y;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f419032a;

        /* renamed from: b, reason: collision with root package name */
        public float f419033b;
    }

    public class b implements AppBarLayout.g {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void c(AppBarLayout appBarLayout, int i12) {
            int iRound;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f419030x = i12;
            J0 j02 = collapsingToolbarLayout.f419031y;
            int iK2 = j02 != null ? j02.k() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = collapsingToolbarLayout.getChildAt(i13);
                a aVar = (a) childAt.getLayoutParams();
                r rVarB = CollapsingToolbarLayout.b(childAt);
                int i14 = aVar.f419032a;
                if (i14 == 1) {
                    int i15 = -i12;
                    int height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f419104b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin;
                    if (i15 < 0) {
                        i15 = 0;
                    } else if (i15 > height) {
                        i15 = height;
                    }
                    if (rVarB.f419106d != i15) {
                        rVarB.f419106d = i15;
                        rVarB.a();
                    }
                } else if (i14 == 2 && rVarB.f419106d != (iRound = Math.round((-i12) * aVar.f419033b))) {
                    rVarB.f419106d = iRound;
                    rVarB.a();
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.f419023q != null && iK2 > 0) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height2 = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            float fAbs = Math.abs(i12) / ((height2 - collapsingToolbarLayout.getMinimumHeight()) - iK2);
            if (fAbs < 0.0f) {
                fAbs = 0.0f;
            } else if (fAbs > 1.0f) {
                fAbs = 1.0f;
            }
            c cVar = collapsingToolbarLayout.f419019m;
            if (fAbs != cVar.f419062c) {
                cVar.f419062c = fAbs;
                RectF rectF = cVar.f419065f;
                float f12 = cVar.f419063d.left;
                Rect rect = cVar.f419064e;
                rectF.left = c.d(f12, rect.left, fAbs, null);
                rectF.top = c.d(cVar.f419072m, cVar.f419073n, fAbs, null);
                rectF.right = c.d(r4.right, rect.right, fAbs, null);
                rectF.bottom = c.d(r4.bottom, rect.bottom, fAbs, null);
                cVar.f419076q = c.d(cVar.f419074o, cVar.f419075p, fAbs, null);
                cVar.f419077r = c.d(cVar.f419072m, cVar.f419073n, fAbs, null);
                cVar.j(c.d(cVar.f419068i, cVar.f419069j, fAbs, cVar.f419043E));
                androidx.interpolator.view.animation.b bVar = net.opacapp.multilinecollapsingtoolbar.a.f419035a;
                cVar.f419056R = 1.0f - c.d(0.0f, 1.0f, 1.0f - fAbs, bVar);
                CollapsingToolbarLayout collapsingToolbarLayout2 = cVar.f419060a;
                collapsingToolbarLayout2.postInvalidateOnAnimation();
                cVar.f419057S = c.d(1.0f, 0.0f, fAbs, bVar);
                collapsingToolbarLayout2.postInvalidateOnAnimation();
                ColorStateList colorStateList = cVar.f419071l;
                ColorStateList colorStateList2 = cVar.f419070k;
                TextPaint textPaint = cVar.f419042D;
                if (colorStateList != colorStateList2) {
                    int[] iArr = cVar.f419040B;
                    int colorForState = iArr != null ? colorStateList2.getColorForState(iArr, 0) : colorStateList2.getDefaultColor();
                    int[] iArr2 = cVar.f419040B;
                    textPaint.setColor(c.a(fAbs, colorForState, iArr2 != null ? cVar.f419071l.getColorForState(iArr2, 0) : cVar.f419071l.getDefaultColor()));
                } else {
                    int[] iArr3 = cVar.f419040B;
                    textPaint.setColor(iArr3 != null ? colorStateList.getColorForState(iArr3, 0) : colorStateList.getDefaultColor());
                }
                textPaint.setShadowLayer(c.d(cVar.f419048J, cVar.f419044F, fAbs, null), c.d(cVar.f419049K, cVar.f419045G, fAbs, null), c.d(cVar.f419050L, cVar.f419046H, fAbs, null), c.a(fAbs, cVar.f419051M, cVar.f419047I));
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f419008b = true;
        this.f419018l = new Rect();
        this.f419028v = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h.f419089a);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!zHasValue) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
        c cVar = new c(this);
        this.f419019m = cVar;
        cVar.f419043E = net.opacapp.multilinecollapsingtoolbar.a.f419038d;
        cVar.g();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout, 0, com.avito.android.R.style.Widget_Design_MultilineCollapsingToolbar);
        int i12 = typedArrayObtainStyledAttributes2.getInt(R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (cVar.f419066g != i12) {
            cVar.f419066g = i12;
            cVar.g();
        }
        int i13 = typedArrayObtainStyledAttributes2.getInt(R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627);
        if (cVar.f419067h != i13) {
            cVar.f419067h = i13;
            cVar.g();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f419017k = dimensionPixelSize;
        this.f419016j = dimensionPixelSize;
        this.f419015i = dimensionPixelSize;
        this.f419014h = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f419014h = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f419016j = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f419015i = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f419017k = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f419020n = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes2.getText(R.styleable.CollapsingToolbarLayout_title));
        cVar.i(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        cVar.h(com.avito.android.R.style.ActionBar_Title);
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            cVar.i(typedArrayObtainStyledAttributes2.getResourceId(R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            cVar.h(typedArrayObtainStyledAttributes2.getResourceId(R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f419028v = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f419027u = typedArrayObtainStyledAttributes2.getInt(R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayObtainStyledAttributes2.getDrawable(R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes2.getDrawable(R.styleable.CollapsingToolbarLayout_statusBarScrim));
        this.f419009c = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        typedArrayObtainStyledAttributes2.recycle();
        setWillNotDraw(false);
        C22823h0.K(this, new d(this));
        int integer = context.obtainStyledAttributes(attributeSet, g.l.f419088a, 0, 0).getInteger(0, 3);
        if (integer != cVar.f419059U) {
            cVar.f419059U = integer;
            cVar.c();
            cVar.g();
        }
    }

    public static r b(View view) {
        r rVar = (r) view.getTag(R.id.view_offset_helper);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(view);
        view.setTag(R.id.view_offset_helper, rVar2);
        return rVar2;
    }

    public final void a() {
        if (this.f419008b) {
            Toolbar toolbar = null;
            this.f419010d = null;
            this.f419011e = null;
            int i12 = this.f419009c;
            if (i12 != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i12);
                this.f419010d = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f419011e = view;
                }
            }
            if (this.f419010d == null) {
                int childCount = getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i13);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i13++;
                }
                this.f419010d = toolbar;
            }
            c();
            this.f419008b = false;
        }
    }

    public final void c() {
        View view;
        if (!this.f419020n && (view = this.f419012f) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f419012f);
            }
        }
        if (!this.f419020n || this.f419010d == null) {
            return;
        }
        if (this.f419012f == null) {
            this.f419012f = new View(getContext());
        }
        if (this.f419012f.getParent() == null) {
            this.f419010d.addView(this.f419012f, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        if (this.f419022p == null && this.f419023q == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f419030x < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f419010d == null && (drawable = this.f419022p) != null && this.f419024r > 0) {
            drawable.mutate().setAlpha(this.f419024r);
            this.f419022p.draw(canvas);
        }
        if (this.f419020n && this.f419021o) {
            c cVar = this.f419019m;
            cVar.getClass();
            int iSave = canvas.save();
            if (cVar.f419082w != null && cVar.f419061b) {
                float f12 = cVar.f419076q;
                float f13 = cVar.f419077r;
                TextPaint textPaint = cVar.f419042D;
                textPaint.setTextSize(cVar.f419039A);
                float fAscent = textPaint.ascent();
                float f14 = cVar.f419085z;
                float f15 = fAscent * f14;
                if (f14 != 1.0f) {
                    canvas.scale(f14, f14, f12, f13);
                }
                float lineLeft = (cVar.f419055Q.getLineLeft(0) + cVar.f419076q) - (cVar.f419058T * 2.0f);
                canvas.translate(lineLeft, f13);
                textPaint.setAlpha((int) (cVar.f419057S * 255.0f));
                cVar.f419055Q.draw(canvas);
                canvas.translate(f12 - lineLeft, 0.0f);
                textPaint.setAlpha((int) (cVar.f419056R * 255.0f));
                CharSequence charSequence = cVar.f419052N;
                float f16 = -f15;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f16 / cVar.f419085z, textPaint);
                textPaint.setAlpha(255);
                canvas.drawText(cVar.f419082w, cVar.f419055Q.getLineStart(0), cVar.f419055Q.getLineEnd(0), 0.0f, f16 / cVar.f419085z, textPaint);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f419023q == null || this.f419024r <= 0) {
            return;
        }
        J0 j02 = this.f419031y;
        int iK2 = j02 != null ? j02.k() : 0;
        if (iK2 > 0) {
            this.f419023q.setBounds(0, -this.f419030x, getWidth(), iK2 - this.f419030x);
            this.f419023q.mutate().setAlpha(this.f419024r);
            this.f419023q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j12) {
        int i12;
        boolean zDrawChild = super.drawChild(canvas, view, j12);
        if (this.f419022p == null || this.f419024r <= 0 || (i12 = this.f419013g) < 0 || i12 != indexOfChild(view) + 1) {
            return zDrawChild;
        }
        this.f419022p.mutate().setAlpha(this.f419024r);
        this.f419022p.draw(canvas);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f419023q;
        boolean z12 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f419022p;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        c cVar = this.f419019m;
        if (cVar != null) {
            cVar.f419040B = drawableState;
            ColorStateList colorStateList2 = cVar.f419071l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f419070k) != null && colorStateList.isStateful())) {
                cVar.g();
                z12 = true;
            }
            state |= z12;
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f419032a = 0;
        aVar.f419033b = 0.5f;
        return aVar;
    }

    public int getCollapsedTitleGravity() {
        return this.f419019m.f419067h;
    }

    @N
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f419019m.f419078s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @P
    public Drawable getContentScrim() {
        return this.f419022p;
    }

    public int getExpandedTitleGravity() {
        return this.f419019m.f419066g;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f419017k;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f419016j;
    }

    public int getExpandedTitleMarginStart() {
        return this.f419014h;
    }

    public int getExpandedTitleMarginTop() {
        return this.f419015i;
    }

    @N
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f419019m.f419079t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getMaxLines() {
        return this.f419019m.f419059U;
    }

    public long getScrimAnimationDuration() {
        return this.f419027u;
    }

    public int getScrimVisibleHeightTrigger() {
        int i12 = this.f419028v;
        if (i12 >= 0) {
            return i12;
        }
        J0 j02 = this.f419031y;
        int iK2 = j02 != null ? j02.k() : 0;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iK2, getHeight()) : getHeight() / 3;
    }

    @P
    public Drawable getStatusBarScrim() {
        return this.f419023q;
    }

    @P
    public CharSequence getTitle() {
        if (this.f419020n) {
            return this.f419019m.f419081v;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            if (this.f419029w == null) {
                this.f419029w = new b();
            }
            ((AppBarLayout) parent).a(this.f419029w);
            C22823h0.A(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.g gVar = this.f419029w;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).f(gVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int height;
        int height2;
        CharSequence title;
        View view;
        super.onLayout(z12, i12, i13, i14, i15);
        J0 j02 = this.f419031y;
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
        boolean z13 = this.f419020n;
        c cVar = this.f419019m;
        if (z13 && (view = this.f419012f) != null) {
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            boolean z14 = view.isAttachedToWindow() && this.f419012f.getVisibility() == 0;
            this.f419021o = z14;
            if (z14) {
                boolean z15 = getLayoutDirection() == 1;
                View view2 = this.f419011e;
                if (view2 == null) {
                    view2 = this.f419010d;
                }
                int height3 = ((getHeight() - b(view2).f419104b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f419012f;
                p.c cVar2 = p.f419100a;
                int width = view3.getWidth();
                int height4 = view3.getHeight();
                Rect rect = this.f419018l;
                rect.set(0, 0, width, height4);
                p.f419100a.getClass();
                ThreadLocal<Matrix> threadLocal = q.f419101a;
                Matrix matrix = threadLocal.get();
                if (matrix == null) {
                    matrix = new Matrix();
                    threadLocal.set(matrix);
                } else {
                    matrix.reset();
                }
                q.a(this, view3, matrix);
                ThreadLocal<RectF> threadLocal2 = q.f419102b;
                RectF rectF = threadLocal2.get();
                if (rectF == null) {
                    rectF = new RectF();
                    threadLocal2.set(rectF);
                }
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
                int titleMarginEnd = rect.left + (z15 ? this.f419010d.getTitleMarginEnd() : this.f419010d.getTitleMarginStart());
                int titleMarginTop = this.f419010d.getTitleMarginTop() + rect.top + height3;
                int titleMarginStart = rect.right + (z15 ? this.f419010d.getTitleMarginStart() : this.f419010d.getTitleMarginEnd());
                int titleMarginBottom = (rect.bottom + height3) - this.f419010d.getTitleMarginBottom();
                Rect rect2 = cVar.f419064e;
                if (rect2.left != titleMarginEnd || rect2.top != titleMarginTop || rect2.right != titleMarginStart || rect2.bottom != titleMarginBottom) {
                    rect2.set(titleMarginEnd, titleMarginTop, titleMarginStart, titleMarginBottom);
                    cVar.f419041C = true;
                    cVar.e();
                }
                int i17 = z15 ? this.f419016j : this.f419014h;
                int i18 = rect.top + this.f419015i;
                int i19 = (i14 - i12) - (z15 ? this.f419014h : this.f419016j);
                int i22 = (i15 - i13) - this.f419017k;
                Rect rect3 = cVar.f419063d;
                if (rect3.left != i17 || rect3.top != i18 || rect3.right != i19 || rect3.bottom != i22) {
                    rect3.set(i17, i18, i19, i22);
                    cVar.f419041C = true;
                    cVar.e();
                }
                cVar.g();
            }
        }
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            r rVarB = b(getChildAt(i23));
            View view4 = rVarB.f419103a;
            rVarB.f419104b = view4.getTop();
            rVarB.f419105c = view4.getLeft();
            rVarB.a();
        }
        if (this.f419010d != null) {
            if (this.f419020n && TextUtils.isEmpty(cVar.f419081v) && ((title = this.f419010d.getTitle()) == null || !title.equals(cVar.f419081v))) {
                cVar.f419081v = title;
                cVar.f419082w = null;
                cVar.c();
                cVar.g();
            }
            View view5 = this.f419011e;
            if (view5 == null || view5 == this) {
                Toolbar toolbar = this.f419010d;
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height = toolbar.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    height = toolbar.getHeight();
                }
                setMinimumHeight(height);
                this.f419013g = indexOfChild(this.f419010d);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 = view5.getHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    height2 = view5.getHeight();
                }
                setMinimumHeight(height2);
                this.f419013g = indexOfChild(this.f419011e);
            }
        } else {
            this.f419013g = -1;
        }
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        a();
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        Drawable drawable = this.f419022p;
        if (drawable != null) {
            drawable.setBounds(0, 0, i12, i13);
        }
    }

    public void setCollapsedTitleGravity(int i12) {
        c cVar = this.f419019m;
        if (cVar.f419067h != i12) {
            cVar.f419067h = i12;
            cVar.g();
        }
    }

    public void setCollapsedTitleTextAppearance(@f0 int i12) {
        this.f419019m.h(i12);
    }

    public void setCollapsedTitleTextColor(@N ColorStateList colorStateList) {
        c cVar = this.f419019m;
        if (cVar.f419071l != colorStateList) {
            cVar.f419071l = colorStateList;
            cVar.g();
        }
    }

    public void setCollapsedTitleTypeface(@P Typeface typeface) {
        c cVar = this.f419019m;
        if (cVar.f419078s != typeface) {
            cVar.f419078s = typeface;
            cVar.g();
        }
    }

    public void setContentScrim(@P Drawable drawable) {
        Drawable drawable2 = this.f419022p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f419022p = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.f419022p.setCallback(this);
                this.f419022p.setAlpha(this.f419024r);
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
        c cVar = this.f419019m;
        if (cVar.f419066g != i12) {
            cVar.f419066g = i12;
            cVar.g();
        }
    }

    public void setExpandedTitleMarginBottom(int i12) {
        this.f419017k = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i12) {
        this.f419016j = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i12) {
        this.f419014h = i12;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i12) {
        this.f419015i = i12;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@f0 int i12) {
        this.f419019m.i(i12);
    }

    public void setExpandedTitleTextColor(@N ColorStateList colorStateList) {
        c cVar = this.f419019m;
        if (cVar.f419070k != colorStateList) {
            cVar.f419070k = colorStateList;
            cVar.g();
        }
    }

    public void setExpandedTitleTypeface(@P Typeface typeface) {
        c cVar = this.f419019m;
        if (cVar.f419079t != typeface) {
            cVar.f419079t = typeface;
            cVar.g();
        }
    }

    public void setMaxLines(int i12) {
        c cVar = this.f419019m;
        if (i12 != cVar.f419059U) {
            cVar.f419059U = i12;
            cVar.c();
            cVar.g();
        }
    }

    public void setScrimAlpha(int i12) {
        Toolbar toolbar;
        if (i12 != this.f419024r) {
            if (this.f419022p != null && (toolbar = this.f419010d) != null) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                toolbar.postInvalidateOnAnimation();
            }
            this.f419024r = i12;
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@F long j12) {
        this.f419027u = j12;
    }

    public void setScrimVisibleHeightTrigger(@F int i12) {
        if (this.f419028v != i12) {
            this.f419028v = i12;
            d();
        }
    }

    public void setScrimsShown(boolean z12) {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean z13 = isLaidOut() && !isInEditMode();
        if (this.f419025s != z12) {
            if (z13) {
                int i12 = z12 ? 255 : 0;
                a();
                k kVar = this.f419026t;
                if (kVar == null) {
                    s.f419107a.getClass();
                    o oVar = new o();
                    this.f419026t = new k(oVar);
                    oVar.f419099a.setDuration(this.f419027u);
                    this.f419026t.f419092a.f419099a.setInterpolator(i12 > this.f419024r ? net.opacapp.multilinecollapsingtoolbar.a.f419036b : net.opacapp.multilinecollapsingtoolbar.a.f419037c);
                    k kVar2 = this.f419026t;
                    kVar2.f419092a.f419099a.addUpdateListener(new m(new i(kVar2, new e(this))));
                } else if (kVar.f419092a.f419099a.isRunning()) {
                    this.f419026t.f419092a.f419099a.cancel();
                }
                this.f419026t.f419092a.f419099a.setIntValues(this.f419024r, i12);
                this.f419026t.f419092a.f419099a.start();
            } else {
                setScrimAlpha(z12 ? 255 : 0);
            }
            this.f419025s = z12;
        }
    }

    public void setStatusBarScrim(@P Drawable drawable) {
        Drawable drawable2 = this.f419023q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f419023q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f419023q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f419023q;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f419023q.setVisible(getVisibility() == 0, false);
                this.f419023q.setCallback(this);
                this.f419023q.setAlpha(this.f419024r);
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
        c cVar = this.f419019m;
        if (charSequence == null || !charSequence.equals(cVar.f419081v)) {
            cVar.f419081v = charSequence;
            cVar.f419082w = null;
            cVar.c();
            cVar.g();
        }
    }

    public void setTitleEnabled(boolean z12) {
        if (z12 != this.f419020n) {
            this.f419020n = z12;
            c();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        boolean z12 = i12 == 0;
        Drawable drawable = this.f419023q;
        if (drawable != null && drawable.isVisible() != z12) {
            this.f419023q.setVisible(z12, false);
        }
        Drawable drawable2 = this.f419022p;
        if (drawable2 == null || drawable2.isVisible() == z12) {
            return;
        }
        this.f419022p.setVisible(z12, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f419022p || drawable == this.f419023q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f419032a = 0;
        aVar.f419033b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
        aVar.f419032a = typedArrayObtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
        aVar.f419033b = typedArrayObtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void setCollapsedTitleTextColor(@InterfaceC42156l int i12) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i12));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f419032a = 0;
        aVar.f419033b = 0.5f;
        return aVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        aVar.f419032a = 0;
        aVar.f419033b = 0.5f;
        return aVar;
    }
}
