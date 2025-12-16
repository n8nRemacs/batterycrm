package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.O;
import com.google.android.material.shape.m;
import j.InterfaceC42156l;
import j.N;
import j.P;
import j.U;
import j.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lY0.C43707b;
import lY0.l;
import wY0.C49576a;

/* loaded from: classes6.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final int f355921j0 = R.attr.motionDurationLong2;

    /* renamed from: k0, reason: collision with root package name */
    public static final int f355922k0 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: V, reason: collision with root package name */
    @P
    public Integer f355923V;

    /* renamed from: W, reason: collision with root package name */
    @P
    public AnimatorSet f355924W;

    /* renamed from: a0, reason: collision with root package name */
    @P
    public AnimatorSet f355925a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f355926b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f355927c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f355928d0;

    /* renamed from: e0, reason: collision with root package name */
    @U
    public int f355929e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f355930f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f355931g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f355932h0;

    /* renamed from: i0, reason: collision with root package name */
    public Behavior f355933i0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public int f355939d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f355940e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @P
            public final Object createFromParcel(@N Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f355939d = parcel.readInt();
            this.f355940e = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f355939d);
            parcel.writeInt(this.f355940e ? 1 : 0);
        }
    }

    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    public class b implements l<FloatingActionButton> {
    }

    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f355941b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f355942c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f355943d;

        public c(ActionMenuView actionMenuView, int i12, boolean z12) {
            this.f355941b = actionMenuView;
            this.f355942c = i12;
            this.f355943d = z12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuView actionMenuView = this.f355941b;
            BottomAppBar.this.C(actionMenuView, this.f355942c, this.f355943d);
            actionMenuView.setTranslationX(0);
        }
    }

    public interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface h {
    }

    @P
    private ActionMenuView getActionMenuView() {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        throw null;
    }

    private int getFabAlignmentAnimationDuration() {
        return C49576a.c(getContext(), f355921j0, 300);
    }

    private float getFabTranslationX() {
        return D(this.f355926b0);
    }

    private float getFabTranslationY() {
        if (this.f355928d0 == 1) {
            return -getTopEdgeTreatment().f355959e;
        }
        return B() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        throw null;
    }

    @N
    private com.google.android.material.bottomappbar.g getTopEdgeTreatment() {
        throw null;
    }

    @P
    public final View B() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int C(@N ActionMenuView actionMenuView, int i12, boolean z12) {
        if (this.f355930f0 != 1 && (i12 != 1 || !z12)) {
            return 0;
        }
        boolean zF2 = O.f(this);
        int measuredWidth = zF2 ? getMeasuredWidth() : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f21545a & 8388615) == 8388611) {
                measuredWidth = zF2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        if (zF2) {
            actionMenuView.getRight();
        } else {
            actionMenuView.getLeft();
        }
        throw null;
    }

    public final float D(int i12) {
        O.f(this);
        if (i12 != 1) {
            return 0.0f;
        }
        B();
        throw null;
    }

    public final boolean E() {
        View viewB = B();
        FloatingActionButton floatingActionButton = viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null;
        return floatingActionButton != null && floatingActionButton.i();
    }

    public final void F() {
        getTopEdgeTreatment().f355960f = getFabTranslationX();
        if (this.f355932h0 && E()) {
            int i12 = this.f355928d0;
        }
        throw null;
    }

    public final void G(@U int i12) {
        float f12 = i12;
        if (f12 == getTopEdgeTreatment().f355958d) {
            return;
        }
        getTopEdgeTreatment().f355958d = f12;
        throw null;
    }

    public final void H(@N ActionMenuView actionMenuView, int i12, boolean z12, boolean z13) {
        c cVar = new c(actionMenuView, i12, z12);
        if (z13) {
            actionMenuView.post(cVar);
        } else {
            cVar.run();
        }
    }

    @P
    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @r
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f355959e;
    }

    public int getFabAlignmentMode() {
        return this.f355926b0;
    }

    @U
    public int getFabAlignmentModeEndMargin() {
        return this.f355929e0;
    }

    public int getFabAnchorMode() {
        return this.f355928d0;
    }

    public int getFabAnimationMode() {
        return this.f355927c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f355957c;
    }

    @r
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f355956b;
    }

    public boolean getHideOnScroll() {
        return this.f355931g0;
    }

    public int getMenuAlignmentMode() {
        return this.f355930f0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.c(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        if (z12) {
            AnimatorSet animatorSet = this.f355925a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f355924W;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            F();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f355925a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (E()) {
            H(actionMenuView, this.f355926b0, this.f355932h0, false);
        } else {
            H(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        this.f355926b0 = savedState.f355939d;
        this.f355932h0 = savedState.f355940e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @N
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f355939d = this.f355926b0;
        savedState.f355940e = this.f355932h0;
        return savedState;
    }

    public void setBackgroundTint(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(@r float f12) {
        if (f12 == getCradleVerticalOffset()) {
            return;
        }
        com.google.android.material.bottomappbar.g topEdgeTreatment = getTopEdgeTreatment();
        if (f12 >= 0.0f) {
            topEdgeTreatment.f355959e = f12;
            throw null;
        }
        topEdgeTreatment.getClass();
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        throw null;
    }

    public void setFabAlignmentMode(int i12) {
        int i13;
        boolean z12 = this.f355932h0;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f355925a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (E()) {
                i13 = i12;
            } else {
                z12 = false;
                i13 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                float translationX = actionMenuView.getTranslationX();
                C(actionMenuView, i13, z12);
                if (Math.abs(translationX - 0) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new com.google.android.material.bottomappbar.e(this, actionMenuView, i13, z12));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f355925a0 = animatorSet3;
            animatorSet3.addListener(new com.google.android.material.bottomappbar.d(this));
            this.f355925a0.start();
        }
        if (this.f355926b0 != i12 && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f355924W;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f355927c0 == 1) {
                View viewB = B();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null, "translationX", D(i12));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewB2 = B();
                FloatingActionButton floatingActionButton = viewB2 instanceof FloatingActionButton ? (FloatingActionButton) viewB2 : null;
                if (floatingActionButton != null && !floatingActionButton.h()) {
                    floatingActionButton.g(new com.google.android.material.bottomappbar.c(this, i12), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(C49576a.d(getContext(), f355922k0, C43707b.f413879a));
            this.f355924W = animatorSet5;
            animatorSet5.addListener(new com.google.android.material.bottomappbar.b(this));
            this.f355924W.start();
        }
        this.f355926b0 = i12;
    }

    public void setFabAlignmentModeEndMargin(@U int i12) {
        if (this.f355929e0 == i12) {
            return;
        }
        this.f355929e0 = i12;
        F();
        throw null;
    }

    public void setFabAnchorMode(int i12) {
        this.f355928d0 = i12;
        F();
        throw null;
    }

    public void setFabAnimationMode(int i12) {
        this.f355927c0 = i12;
    }

    public void setFabCornerSize(@r float f12) {
        if (f12 == getTopEdgeTreatment().f355961g) {
            return;
        }
        getTopEdgeTreatment().f355961g = f12;
        throw null;
    }

    public void setFabCradleMargin(@r float f12) {
        if (f12 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f355957c = f12;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(@r float f12) {
        if (f12 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f355956b = f12;
        throw null;
    }

    public void setHideOnScroll(boolean z12) {
        this.f355931g0 = z12;
    }

    public void setMenuAlignmentMode(int i12) {
        if (this.f355930f0 != i12) {
            this.f355930f0 = i12;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                H(actionMenuView, this.f355926b0, E(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@P Drawable drawable) {
        if (drawable != null && this.f355923V != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f355923V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@InterfaceC42156l int i12) {
        this.f355923V = Integer.valueOf(i12);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    public Behavior getBehavior() {
        if (this.f355933i0 == null) {
            this.f355933i0 = new Behavior();
        }
        return this.f355933i0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: l, reason: collision with root package name */
        @N
        public final Rect f355934l;

        /* renamed from: m, reason: collision with root package name */
        public WeakReference<BottomAppBar> f355935m;

        /* renamed from: n, reason: collision with root package name */
        public int f355936n;

        /* renamed from: o, reason: collision with root package name */
        public final View.OnLayoutChangeListener f355937o;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f355935m.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    int measuredWidth = floatingActionButton.getMeasuredWidth();
                    int measuredHeight = floatingActionButton.getMeasuredHeight();
                    Rect rect = behavior.f355934l;
                    rect.set(0, 0, measuredWidth, measuredHeight);
                    floatingActionButton.j(rect);
                    int iHeight = rect.height();
                    bottomAppBar.G(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f357085e.a(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                if (behavior.f355936n == 0) {
                    if (bottomAppBar.f355928d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                    if (O.f(view)) {
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
                    }
                }
                int i22 = BottomAppBar.f355921j0;
                bottomAppBar.F();
                throw null;
            }
        }

        public Behavior() {
            this.f355937o = new a();
            this.f355934l = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(@N CoordinatorLayout coordinatorLayout, @N View view, int i12) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f355935m = new WeakReference<>(bottomAppBar);
            int i13 = BottomAppBar.f355921j0;
            View viewB = bottomAppBar.B();
            if (viewB != null) {
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                if (!viewB.isLaidOut()) {
                    CoordinatorLayout.g gVar = (CoordinatorLayout.g) viewB.getLayoutParams();
                    gVar.f44450d = 17;
                    int i14 = bottomAppBar.f355928d0;
                    if (i14 == 1) {
                        gVar.f44450d = 49;
                    }
                    if (i14 == 0) {
                        gVar.f44450d |= 80;
                    }
                    this.f355936n = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) viewB.getLayoutParams())).bottomMargin;
                    if (viewB instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.c();
                        floatingActionButton.d(new com.google.android.material.bottomappbar.f(bottomAppBar));
                        floatingActionButton.e();
                    }
                    viewB.addOnLayoutChangeListener(this.f355937o);
                    bottomAppBar.F();
                    throw null;
                }
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i12);
            super.j(coordinatorLayout, bottomAppBar, i12);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean s(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2, @N View view3, int i12, int i13) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.s(coordinatorLayout, bottomAppBar, view2, view3, i12, i13);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f355937o = new a();
            this.f355934l = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
