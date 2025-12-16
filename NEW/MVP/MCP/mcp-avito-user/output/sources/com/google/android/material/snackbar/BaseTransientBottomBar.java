package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.shape.q;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.o;
import j.F;
import j.N;
import j.P;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import lY0.C43707b;
import wY0.C49576a;

/* loaded from: classes6.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public final int f357277a;

    /* renamed from: b, reason: collision with root package name */
    public final int f357278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f357279c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f357280d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f357281e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f357282f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final ViewGroup f357283g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f357284h;

    /* renamed from: i, reason: collision with root package name */
    @N
    public final j f357285i;

    /* renamed from: j, reason: collision with root package name */
    @N
    public final SnackbarContentLayout f357286j;

    /* renamed from: k, reason: collision with root package name */
    public int f357287k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public d f357288l;

    /* renamed from: n, reason: collision with root package name */
    public int f357290n;

    /* renamed from: o, reason: collision with root package name */
    public int f357291o;

    /* renamed from: p, reason: collision with root package name */
    public int f357292p;

    /* renamed from: q, reason: collision with root package name */
    public int f357293q;

    /* renamed from: r, reason: collision with root package name */
    public int f357294r;

    /* renamed from: s, reason: collision with root package name */
    public int f357295s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f357296t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f357297u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public final AccessibilityManager f357298v;

    /* renamed from: x, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.b f357274x = C43707b.f413880b;

    /* renamed from: y, reason: collision with root package name */
    public static final LinearInterpolator f357275y = C43707b.f413879a;

    /* renamed from: z, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.c f357276z = C43707b.f413882d;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f357273B = {R.attr.snackbarStyle};

    /* renamed from: A, reason: collision with root package name */
    @N
    public static final Handler f357272A = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: m, reason: collision with root package name */
    @X
    public final Runnable f357289m = new b();

    /* renamed from: w, reason: collision with root package name */
    @N
    public final c f357299w = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j, reason: collision with root package name */
        @N
        public final g f357300j;

        public Behavior() {
            g gVar = new g();
            this.f355910g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.f355911h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f355908e = 0;
            this.f357300j = gVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(@N CoordinatorLayout coordinatorLayout, @N View view, @N MotionEvent motionEvent) {
            g gVar = this.f357300j;
            gVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    o.b().e(gVar.f357305a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                o.b().d(gVar.f357305a);
            }
            return super.i(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean v(View view) {
            this.f357300j.getClass();
            return view instanceof j;
        }
    }

    public class a implements Handler.Callback {
        /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean handleMessage(@j.N android.os.Message r9) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.a.handleMessage(android.os.Message):boolean");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f357285i != null) {
                WindowManager windowManager = (WindowManager) baseTransientBottomBar.f357284h.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                j jVar = baseTransientBottomBar.f357285i;
                jVar.getLocationOnScreen(iArr);
                int height = (iHeight - (jVar.getHeight() + iArr[1])) + ((int) jVar.getTranslationY());
                int i12 = baseTransientBottomBar.f357294r;
                if (height >= i12) {
                    baseTransientBottomBar.f357295s = i12;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    androidx.interpolator.view.animation.b bVar = BaseTransientBottomBar.f357274x;
                    return;
                }
                int i13 = baseTransientBottomBar.f357294r;
                baseTransientBottomBar.f357295s = i13;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i13 - height) + marginLayoutParams.bottomMargin;
                jVar.requestLayout();
            }
        }
    }

    public class c implements o.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.o.b
        public final void a(int i12) {
            Handler handler = BaseTransientBottomBar.f357272A;
            handler.sendMessage(handler.obtainMessage(1, i12, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.o.b
        public final void show() {
            Handler handler = BaseTransientBottomBar.f357272A;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public static class d implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final WeakReference<BaseTransientBottomBar> f357303b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final WeakReference<View> f357304c;

        public d(@N BaseTransientBottomBar baseTransientBottomBar, @N TabBarLayout tabBarLayout) {
            this.f357303b = new WeakReference<>(baseTransientBottomBar);
            this.f357304c = new WeakReference<>(tabBarLayout);
        }

        public final void b() {
            WeakReference<View> weakReference = this.f357304c;
            if (weakReference.get() != null) {
                weakReference.get().removeOnAttachStateChangeListener(this);
                View view = weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.f357303b.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference<BaseTransientBottomBar> weakReference = this.f357303b;
            if (weakReference.get() == null) {
                b();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = weakReference.get();
            androidx.interpolator.view.animation.b bVar = BaseTransientBottomBar.f357274x;
            baseTransientBottomBar.getClass();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.f357303b.get() == null) {
                b();
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.f357303b.get() == null) {
                b();
            } else if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    @RestrictTo
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public c f357305a;

        public g() {
            throw null;
        }
    }

    @Deprecated
    public interface h extends n {
    }

    @F
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface i {
    }

    @RestrictTo
    public static class j extends FrameLayout {

        /* renamed from: m, reason: collision with root package name */
        public static final View.OnTouchListener f357306m = new a();

        /* renamed from: b, reason: collision with root package name */
        @P
        public BaseTransientBottomBar<?> f357307b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public final q f357308c;

        /* renamed from: d, reason: collision with root package name */
        public int f357309d;

        /* renamed from: e, reason: collision with root package name */
        public final float f357310e;

        /* renamed from: f, reason: collision with root package name */
        public final float f357311f;

        /* renamed from: g, reason: collision with root package name */
        public final int f357312g;

        /* renamed from: h, reason: collision with root package name */
        public final int f357313h;

        /* renamed from: i, reason: collision with root package name */
        public ColorStateList f357314i;

        /* renamed from: j, reason: collision with root package name */
        public PorterDuff.Mode f357315j;

        /* renamed from: k, reason: collision with root package name */
        @P
        public Rect f357316k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f357317l;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(@N Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
            GradientDrawable gradientDrawable;
            super(BY0.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                C22823h0.H(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            this.f357309d = typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f357308c = q.c(context2, attributeSet, 0, 0).a();
            }
            this.f357310e = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(O.g(typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f357311f = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f357312g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f357313h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f357306m);
            setFocusable(true);
            if (getBackground() == null) {
                int iF2 = com.google.android.material.color.k.f(getBackgroundOverlayColorAlpha(), com.google.android.material.color.k.d(this, R.attr.colorSurface), com.google.android.material.color.k.d(this, R.attr.colorOnSurface));
                q qVar = this.f357308c;
                if (qVar != null) {
                    androidx.interpolator.view.animation.b bVar = BaseTransientBottomBar.f357274x;
                    com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVar);
                    kVar.n(ColorStateList.valueOf(iF2));
                    gradientDrawable = kVar;
                } else {
                    Resources resources = getResources();
                    androidx.interpolator.view.animation.b bVar2 = BaseTransientBottomBar.f357274x;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(iF2);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f357314i;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                setBackground(gradientDrawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f357307b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f357311f;
        }

        public int getAnimationMode() {
            return this.f357309d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f357310e;
        }

        public int getMaxInlineActionWidth() {
            return this.f357313h;
        }

        public int getMaxWidth() {
            return this.f357312g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f357307b;
            if (baseTransientBottomBar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.f357285i.getRootWindowInsets()) != null) {
                baseTransientBottomBar.f357294r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                baseTransientBottomBar.h();
            }
            C22823h0.A(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z12;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f357307b;
            if (baseTransientBottomBar != null) {
                o oVarB = o.b();
                c cVar = baseTransientBottomBar.f357299w;
                synchronized (oVarB.f357341a) {
                    z12 = true;
                    if (!oVarB.c(cVar)) {
                        o.c cVar2 = oVarB.f357344d;
                        if (!(cVar2 != null && cVar2.f357346a.get() == cVar)) {
                            z12 = false;
                        }
                    }
                }
                if (z12) {
                    BaseTransientBottomBar.f357272A.post(new com.google.android.material.snackbar.j(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
            super.onLayout(z12, i12, i13, i14, i15);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f357307b;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f357296t) {
                return;
            }
            baseTransientBottomBar.g();
            baseTransientBottomBar.f357296t = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            int i14 = this.f357312g;
            if (i14 <= 0 || getMeasuredWidth() <= i14) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), i13);
        }

        public void setAnimationMode(int i12) {
            this.f357309d = i12;
        }

        @Override // android.view.View
        public void setBackground(@P Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@P Drawable drawable) {
            if (drawable != null && this.f357314i != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f357314i);
                drawable.setTintMode(this.f357315j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@P ColorStateList colorStateList) {
            this.f357314i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintList(colorStateList);
                drawableMutate.setTintMode(this.f357315j);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
            this.f357315j = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                drawableMutate.setTintMode(mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f357317l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f357316k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f357307b;
            if (baseTransientBottomBar != null) {
                androidx.interpolator.view.animation.b bVar = BaseTransientBottomBar.f357274x;
                baseTransientBottomBar.h();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@P View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f357306m);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@N Context context, @N ViewGroup viewGroup, @N SnackbarContentLayout snackbarContentLayout, @N SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f357283g = viewGroup;
        this.f357286j = snackbarContentLayout2;
        this.f357284h = context;
        G.c(context, G.f356729a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f357273B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        j jVar = (j) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f357285i = jVar;
        jVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = jVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f357322c.setTextColor(com.google.android.material.color.k.f(actionTextColorAlpha, com.google.android.material.color.k.d(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f357322c.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(jVar.getMaxInlineActionWidth());
        jVar.addView(snackbarContentLayout);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        jVar.setAccessibilityLiveRegion(1);
        jVar.setImportantForAccessibility(1);
        jVar.setFitsSystemWindows(true);
        C22823h0.K(jVar, new com.google.android.material.snackbar.h(this));
        C22823h0.C(jVar, new com.google.android.material.snackbar.i(this));
        this.f357298v = (AccessibilityManager) context.getSystemService("accessibility");
        this.f357279c = C49576a.c(context, R.attr.motionDurationLong2, 250);
        this.f357277a = C49576a.c(context, R.attr.motionDurationLong2, 150);
        this.f357278b = C49576a.c(context, R.attr.motionDurationMedium1, 75);
        this.f357280d = C49576a.d(context, R.attr.motionEasingEmphasizedInterpolator, f357275y);
        this.f357282f = C49576a.d(context, R.attr.motionEasingEmphasizedInterpolator, f357276z);
        this.f357281e = C49576a.d(context, R.attr.motionEasingEmphasizedInterpolator, f357274x);
    }

    public void a() {
        b(3);
    }

    public final void b(int i12) {
        o oVarB = o.b();
        c cVar = this.f357299w;
        synchronized (oVarB.f357341a) {
            try {
                if (oVarB.c(cVar)) {
                    oVarB.a(oVarB.f357343c, i12);
                } else {
                    o.c cVar2 = oVarB.f357344d;
                    if (cVar2 != null && cVar2.f357346a.get() == cVar) {
                        oVarB.a(oVarB.f357344d, i12);
                    }
                }
            } finally {
            }
        }
    }

    @P
    public final View c() {
        d dVar = this.f357288l;
        if (dVar == null) {
            return null;
        }
        return dVar.f357304c.get();
    }

    public final void d(int i12) {
        o oVarB = o.b();
        c cVar = this.f357299w;
        synchronized (oVarB.f357341a) {
            try {
                if (oVarB.c(cVar)) {
                    oVarB.f357343c = null;
                    o.c cVar2 = oVarB.f357344d;
                    if (cVar2 != null && cVar2 != null) {
                        oVarB.f357343c = cVar2;
                        oVarB.f357344d = null;
                        o.b bVar = cVar2.f357346a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            oVarB.f357343c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f357297u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f) this.f357297u.get(size)).a(this, i12);
            }
        }
        ViewParent parent = this.f357285i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f357285i);
        }
    }

    public final void e() {
        o oVarB = o.b();
        c cVar = this.f357299w;
        synchronized (oVarB.f357341a) {
            try {
                if (oVarB.c(cVar)) {
                    oVarB.f(oVarB.f357343c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = this.f357297u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f) this.f357297u.get(size)).b(this);
            }
        }
    }

    @N
    public final void f(@P TabBarLayout tabBarLayout) {
        d dVar;
        d dVar2 = this.f357288l;
        if (dVar2 != null) {
            dVar2.b();
        }
        if (tabBarLayout == null) {
            dVar = null;
        } else {
            d dVar3 = new d(this, tabBarLayout);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (tabBarLayout.isAttachedToWindow()) {
                tabBarLayout.getViewTreeObserver().addOnGlobalLayoutListener(dVar3);
            }
            tabBarLayout.addOnAttachStateChangeListener(dVar3);
            dVar = dVar3;
        }
        this.f357288l = dVar;
    }

    public final void g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z12 = true;
        AccessibilityManager accessibilityManager = this.f357298v;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z12 = false;
        }
        j jVar = this.f357285i;
        if (z12) {
            jVar.post(new l(this));
            return;
        }
        if (jVar.getParent() != null) {
            jVar.setVisibility(0);
        }
        e();
    }

    public final void h() {
        j jVar = this.f357285i;
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || jVar.f357316k == null || jVar.getParent() == null) {
            return;
        }
        int i12 = c() != null ? this.f357293q : this.f357290n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = jVar.f357316k;
        int i13 = rect.bottom + i12;
        int i14 = rect.left + this.f357291o;
        int i15 = rect.right + this.f357292p;
        int i16 = rect.top;
        boolean z12 = (marginLayoutParams.bottomMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15 && marginLayoutParams.topMargin == i16) ? false : true;
        if (z12) {
            marginLayoutParams.bottomMargin = i13;
            marginLayoutParams.leftMargin = i14;
            marginLayoutParams.rightMargin = i15;
            marginLayoutParams.topMargin = i16;
            jVar.requestLayout();
        }
        if ((z12 || this.f357295s != this.f357294r) && Build.VERSION.SDK_INT >= 29 && this.f357294r > 0) {
            ViewGroup.LayoutParams layoutParams2 = jVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) layoutParams2).f44447a instanceof SwipeDismissBehavior)) {
                Runnable runnable = this.f357289m;
                jVar.removeCallbacks(runnable);
                jVar.post(runnable);
            }
        }
    }

    public static abstract class f<B> {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }

        public void b(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public void a(BaseTransientBottomBar baseTransientBottomBar, int i12) {
        }
    }
}
