package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C19975x;
import androidx.appcompat.widget.r;
import androidx.collection.o1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.Y;
import androidx.core.widget.A;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.m;
import com.google.android.material.internal.C37064e;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.internal.S;
import com.google.android.material.shape.v;
import com.google.android.material.stateful.ExtendableSavedState;
import j.D;
import j.InterfaceC42146b;
import j.InterfaceC42156l;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.X;
import j.k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import tY0.C48619c;
import tY0.InterfaceC48617a;

/* loaded from: classes6.dex */
public class FloatingActionButton extends S implements Y, A, InterfaceC48617a, v, CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f356588r = R.style.Widget_Design_FloatingActionButton;

    /* renamed from: c, reason: collision with root package name */
    @P
    public ColorStateList f356589c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public PorterDuff.Mode f356590d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public ColorStateList f356591e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public PorterDuff.Mode f356592f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public ColorStateList f356593g;

    /* renamed from: h, reason: collision with root package name */
    public int f356594h;

    /* renamed from: i, reason: collision with root package name */
    public int f356595i;

    /* renamed from: j, reason: collision with root package name */
    public int f356596j;

    /* renamed from: k, reason: collision with root package name */
    public int f356597k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f356598l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f356599m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f356600n;

    /* renamed from: o, reason: collision with root package name */
    @N
    public final C19975x f356601o;

    /* renamed from: p, reason: collision with root package name */
    @N
    public final C48619c f356602p;

    /* renamed from: q, reason: collision with root package name */
    public p f356603q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b implements yY0.c {
        public b() {
        }

        public final void a(@P Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    public class d<T extends FloatingActionButton> implements m.f {
        @Override // com.google.android.material.floatingactionbutton.m.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.m.f
        public final void b() {
            throw null;
        }

        public final boolean equals(@P Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@N Context context, @P AttributeSet attributeSet) throws Resources.NotFoundException {
        int i12 = R.attr.floatingActionButtonStyle;
        int i13 = f356588r;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f356599m = new Rect();
        this.f356600n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.FloatingActionButton, i12, i13, new int[0]);
        this.f356589c = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.FloatingActionButton_backgroundTint);
        this.f356590d = O.g(typedArrayD.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f356593g = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.FloatingActionButton_rippleColor);
        this.f356594h = typedArrayD.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.f356595i = typedArrayD.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayD.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayD.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayD.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f356598l = typedArrayD.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0));
        lY0.i iVarA = lY0.i.a(typedArrayD, context2, R.styleable.FloatingActionButton_showMotionSpec);
        lY0.i iVarA2 = lY0.i.a(typedArrayD, context2, R.styleable.FloatingActionButton_hideMotionSpec);
        com.google.android.material.shape.o oVar = com.google.android.material.shape.q.f357080m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i12, i13);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        com.google.android.material.shape.q qVarA = com.google.android.material.shape.q.b(context2, resourceId, resourceId2, oVar).a();
        boolean z12 = typedArrayD.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayD.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayD.recycle();
        C19975x c19975x = new C19975x(this);
        this.f356601o = c19975x;
        c19975x.b(attributeSet, i12);
        this.f356602p = new C48619c(this);
        getImpl().o(qVarA);
        getImpl().h(this.f356589c, this.f356590d, this.f356593g, dimensionPixelSize);
        getImpl().f356657k = dimensionPixelSize2;
        m impl = getImpl();
        if (impl.f356654h != dimension) {
            impl.f356654h = dimension;
            impl.l(dimension, impl.f356655i, impl.f356656j);
        }
        m impl2 = getImpl();
        if (impl2.f356655i != dimension2) {
            impl2.f356655i = dimension2;
            impl2.l(impl2.f356654h, dimension2, impl2.f356656j);
        }
        m impl3 = getImpl();
        if (impl3.f356656j != dimension3) {
            impl3.f356656j = dimension3;
            impl3.l(impl3.f356654h, impl3.f356655i, dimension3);
        }
        getImpl().f356660n = iVarA;
        getImpl().f356661o = iVarA2;
        getImpl().f356652f = z12;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private m getImpl() {
        if (this.f356603q == null) {
            this.f356603q = new p(this, new b());
        }
        return this.f356603q;
    }

    public final void c() {
        m impl = getImpl();
        if (impl.f356667u == null) {
            impl.f356667u = new ArrayList<>();
        }
        impl.f356667u.add(null);
    }

    public final void d(@N Animator.AnimatorListener animatorListener) {
        m impl = getImpl();
        if (impl.f356666t == null) {
            impl.f356666t = new ArrayList<>();
        }
        impl.f356666t.add(animatorListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public final void e() {
        m impl = getImpl();
        d dVar = new d();
        if (impl.f356668v == null) {
            impl.f356668v = new ArrayList<>();
        }
        impl.f356668v.add(dVar);
    }

    public final int f(int i12) {
        int i13 = this.f356595i;
        if (i13 != 0) {
            return i13;
        }
        Resources resources = getResources();
        return i12 != -1 ? i12 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(@P a aVar, boolean z12) {
        m impl = getImpl();
        j jVar = aVar == null ? null : new j(this, aVar);
        if (impl.f356669w.getVisibility() == 0) {
            if (impl.f356665s == 1) {
                return;
            }
        } else if (impl.f356665s != 2) {
            return;
        }
        Animator animator = impl.f356659m;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        FloatingActionButton floatingActionButton = impl.f356669w;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.a(z12 ? 8 : 4, z12);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        lY0.i iVar = impl.f356661o;
        AnimatorSet animatorSetB = iVar != null ? impl.b(iVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, m.f356636G, m.f356637H);
        animatorSetB.addListener(new k(impl, z12, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f356667u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.view.View
    @P
    public ColorStateList getBackgroundTintList() {
        return this.f356589c;
    }

    @Override // android.view.View
    @P
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f356590d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f356655i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f356656j;
    }

    @P
    public Drawable getContentBackground() {
        return getImpl().f356651e;
    }

    @U
    public int getCustomSize() {
        return this.f356595i;
    }

    public int getExpandedComponentIdHint() {
        return this.f356602p.f439274c;
    }

    @P
    public lY0.i getHideMotionSpec() {
        return getImpl().f356661o;
    }

    @InterfaceC42156l
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f356593g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @P
    public ColorStateList getRippleColorStateList() {
        return this.f356593g;
    }

    @Override // com.google.android.material.shape.v
    @N
    public com.google.android.material.shape.q getShapeAppearanceModel() {
        com.google.android.material.shape.q qVar = getImpl().f356647a;
        qVar.getClass();
        return qVar;
    }

    @P
    public lY0.i getShowMotionSpec() {
        return getImpl().f356660n;
    }

    public int getSize() {
        return this.f356594h;
    }

    public int getSizeDimension() {
        return f(this.f356594h);
    }

    @P
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @P
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @P
    public ColorStateList getSupportImageTintList() {
        return this.f356591e;
    }

    @P
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f356592f;
    }

    public boolean getUseCompatPadding() {
        return this.f356598l;
    }

    public final boolean h() {
        m impl = getImpl();
        if (impl.f356669w.getVisibility() == 0) {
            if (impl.f356665s != 1) {
                return false;
            }
        } else if (impl.f356665s == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        m impl = getImpl();
        if (impl.f356669w.getVisibility() != 0) {
            if (impl.f356665s != 2) {
                return false;
            }
        } else if (impl.f356665s == 1) {
            return false;
        }
        return true;
    }

    public final void j(@N Rect rect) {
        int i12 = rect.left;
        Rect rect2 = this.f356599m;
        rect.left = i12 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f356591e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f356592f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(r.c(colorForState, mode));
    }

    public final void l(@P a aVar, boolean z12) {
        m impl = getImpl();
        j jVar = aVar == null ? null : new j(this, aVar);
        if (impl.f356669w.getVisibility() != 0) {
            if (impl.f356665s == 2) {
                return;
            }
        } else if (impl.f356665s != 1) {
            return;
        }
        Animator animator = impl.f356659m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z13 = impl.f356660n == null;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        FloatingActionButton floatingActionButton = impl.f356669w;
        boolean z14 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f356645B;
        if (!z14) {
            floatingActionButton.a(0, z12);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f356663q = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z13 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z13 ? 0.4f : 0.0f);
            float f12 = z13 ? 0.4f : 0.0f;
            impl.f356663q = f12;
            impl.a(f12, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        lY0.i iVar = impl.f356660n;
        AnimatorSet animatorSetB = iVar != null ? impl.b(iVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, m.f356634E, m.f356635F);
        animatorSetB.addListener(new l(impl, z12, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f356666t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // tY0.InterfaceC48618b
    public final boolean o0() {
        return this.f356602p.f439273b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m impl = getImpl();
        com.google.android.material.shape.k kVar = impl.f356648b;
        FloatingActionButton floatingActionButton = impl.f356669w;
        if (kVar != null) {
            com.google.android.material.shape.m.c(floatingActionButton, kVar);
        }
        if (impl instanceof p) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f356646C == null) {
            impl.f356646C = new o(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f356646C);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f356669w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f356646C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f356646C = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        int sizeDimension = getSizeDimension();
        this.f356596j = (sizeDimension - this.f356597k) / 2;
        getImpl().r();
        int iMin = Math.min(View.resolveSize(sizeDimension, i12), View.resolveSize(sizeDimension, i13));
        Rect rect = this.f356599m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.f45355b);
        Bundle bundle = extendableSavedState.f357349d.get("expandableWidgetHelper");
        bundle.getClass();
        C48619c c48619c = this.f356602p;
        c48619c.getClass();
        c48619c.f439273b = bundle.getBoolean(SearchParamsConverterKt.EXPANDED, false);
        c48619c.f439274c = bundle.getInt("expandedComponentIdHint", 0);
        if (c48619c.f439273b) {
            View view = c48619c.f439272a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        o1<String, Bundle> o1Var = extendableSavedState.f357349d;
        C48619c c48619c = this.f356602p;
        c48619c.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean(SearchParamsConverterKt.EXPANDED, c48619c.f439273b);
        bundle.putInt("expandedComponentIdHint", c48619c.f439274c);
        o1Var.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@N MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.f356600n;
                rect.set(0, 0, width, height);
                j(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
        if (this.f356589c != colorStateList) {
            this.f356589c = colorStateList;
            m impl = getImpl();
            com.google.android.material.shape.k kVar = impl.f356648b;
            if (kVar != null) {
                kVar.setTintList(colorStateList);
            }
            com.google.android.material.floatingactionbutton.d dVar = impl.f356650d;
            if (dVar != null) {
                if (colorStateList != null) {
                    dVar.f356619m = colorStateList.getColorForState(dVar.getState(), dVar.f356619m);
                }
                dVar.f356622p = colorStateList;
                dVar.f356620n = true;
                dVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
        if (this.f356590d != mode) {
            this.f356590d = mode;
            com.google.android.material.shape.k kVar = getImpl().f356648b;
            if (kVar != null) {
                kVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f12) {
        m impl = getImpl();
        if (impl.f356654h != f12) {
            impl.f356654h = f12;
            impl.l(f12, impl.f356655i, impl.f356656j);
        }
    }

    public void setCompatElevationResource(@InterfaceC42161q int i12) {
        setCompatElevation(getResources().getDimension(i12));
    }

    public void setCompatHoveredFocusedTranslationZ(float f12) {
        m impl = getImpl();
        if (impl.f356655i != f12) {
            impl.f356655i = f12;
            impl.l(impl.f356654h, f12, impl.f356656j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@InterfaceC42161q int i12) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i12));
    }

    public void setCompatPressedTranslationZ(float f12) {
        m impl = getImpl();
        if (impl.f356656j != f12) {
            impl.f356656j = f12;
            impl.l(impl.f356654h, impl.f356655i, f12);
        }
    }

    public void setCompatPressedTranslationZResource(@InterfaceC42161q int i12) {
        setCompatPressedTranslationZ(getResources().getDimension(i12));
    }

    public void setCustomSize(@U int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i12 != this.f356595i) {
            this.f356595i = i12;
            requestLayout();
        }
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.shape.k kVar = getImpl().f356648b;
        if (kVar != null) {
            kVar.m(f12);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z12) {
        if (z12 != getImpl().f356652f) {
            getImpl().f356652f = z12;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@D int i12) {
        this.f356602p.f439274c = i12;
    }

    public void setHideMotionSpec(@P lY0.i iVar) {
        getImpl().f356661o = iVar;
    }

    public void setHideMotionSpecResource(@InterfaceC42146b int i12) {
        setHideMotionSpec(lY0.i.b(i12, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@P Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            m impl = getImpl();
            float f12 = impl.f356663q;
            impl.f356663q = f12;
            Matrix matrix = impl.f356645B;
            impl.a(f12, matrix);
            impl.f356669w.setImageMatrix(matrix);
            if (this.f356591e != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC42165v int i12) {
        this.f356601o.c(i12);
        k();
    }

    public void setMaxImageSize(int i12) {
        this.f356597k = i12;
        m impl = getImpl();
        if (impl.f356664r != i12) {
            impl.f356664r = i12;
            float f12 = impl.f356663q;
            impl.f356663q = f12;
            Matrix matrix = impl.f356645B;
            impl.a(f12, matrix);
            impl.f356669w.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@InterfaceC42156l int i12) {
        setRippleColor(ColorStateList.valueOf(i12));
    }

    @Override // android.view.View
    public void setScaleX(float f12) {
        super.setScaleX(f12);
        ArrayList<m.f> arrayList = getImpl().f356668v;
        if (arrayList != null) {
            Iterator<m.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f12) {
        super.setScaleY(f12);
        ArrayList<m.f> arrayList = getImpl().f356668v;
        if (arrayList != null) {
            Iterator<m.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @k0
    @RestrictTo
    public void setShadowPaddingEnabled(boolean z12) {
        m impl = getImpl();
        impl.f356653g = z12;
        impl.r();
    }

    @Override // com.google.android.material.shape.v
    public void setShapeAppearanceModel(@N com.google.android.material.shape.q qVar) {
        getImpl().o(qVar);
    }

    public void setShowMotionSpec(@P lY0.i iVar) {
        getImpl().f356660n = iVar;
    }

    public void setShowMotionSpecResource(@InterfaceC42146b int i12) {
        setShowMotionSpec(lY0.i.b(i12, getContext()));
    }

    public void setSize(int i12) {
        this.f356595i = 0;
        if (i12 != this.f356594h) {
            this.f356594h = i12;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@P ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@P PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@P ColorStateList colorStateList) {
        if (this.f356591e != colorStateList) {
            this.f356591e = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(@P PorterDuff.Mode mode) {
        if (this.f356592f != mode) {
            this.f356592f = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f12) {
        super.setTranslationX(f12);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationY(float f12) {
        super.setTranslationY(f12);
        getImpl().m();
    }

    @Override // android.view.View
    public void setTranslationZ(float f12) {
        super.setTranslationZ(f12);
        getImpl().m();
    }

    public void setUseCompatPadding(boolean z12) {
        if (this.f356598l != z12) {
            this.f356598l = z12;
            getImpl().j();
        }
    }

    @Override // com.google.android.material.internal.S, android.widget.ImageView, android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f356604a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f356605b;

        public BaseBehavior() {
            this.f356605b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean c(@N View view, @N Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f356599m;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(@N CoordinatorLayout.g gVar) {
            if (gVar.f44454h == 0) {
                gVar.f44454h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(CoordinatorLayout coordinatorLayout, @N View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.g ? ((CoordinatorLayout.g) layoutParams).f44447a instanceof BottomSheetBehavior : false) {
                    w(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = dependencies.get(i14);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.g ? ((CoordinatorLayout.g) layoutParams).f44447a instanceof BottomSheetBehavior : false) && w(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (v(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i12);
            Rect rect = floatingActionButton.f356599m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
                int i15 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                    i13 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                    i13 = -rect.top;
                }
                if (i13 != 0) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    floatingActionButton.offsetTopAndBottom(i13);
                }
                if (i15 != 0) {
                    WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                    floatingActionButton.offsetLeftAndRight(i15);
                }
            }
            return true;
        }

        public final boolean v(CoordinatorLayout coordinatorLayout, @N AppBarLayout appBarLayout, @N FloatingActionButton floatingActionButton) {
            if (!(this.f356605b && ((CoordinatorLayout.g) floatingActionButton.getLayoutParams()).f44452f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f356604a == null) {
                this.f356604a = new Rect();
            }
            Rect rect = this.f356604a;
            C37064e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
            } else {
                floatingActionButton.l(null, false);
            }
            return true;
        }

        public final boolean w(@N View view, @N FloatingActionButton floatingActionButton) {
            if (!(this.f356605b && ((CoordinatorLayout.g) floatingActionButton.getLayoutParams()).f44452f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
            } else {
                floatingActionButton.l(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f356605b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        if (this.f356593g != colorStateList) {
            this.f356593g = colorStateList;
            getImpl().n(this.f356593g);
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i12) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i12) {
    }
}
