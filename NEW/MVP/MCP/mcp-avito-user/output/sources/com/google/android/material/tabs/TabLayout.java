package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.K0;
import androidx.core.util.y;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.Q;
import androidx.core.view.accessibility.f;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import j.InterfaceC42152h;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.X;
import j.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.C43521a;
import lY0.C43707b;
import m.C43852a;
import wY0.C49576a;

@ViewPager.d
/* loaded from: classes6.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: W, reason: collision with root package name */
    public static final int f357350W = R.style.Widget_Design_TabLayout;

    /* renamed from: a0, reason: collision with root package name */
    public static final y.c f357351a0 = new y.c(16);

    /* renamed from: A, reason: collision with root package name */
    public final int f357352A;

    /* renamed from: B, reason: collision with root package name */
    public int f357353B;

    /* renamed from: C, reason: collision with root package name */
    public int f357354C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f357355D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f357356E;

    /* renamed from: F, reason: collision with root package name */
    public int f357357F;

    /* renamed from: G, reason: collision with root package name */
    public int f357358G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f357359H;

    /* renamed from: I, reason: collision with root package name */
    public com.google.android.material.tabs.c f357360I;

    /* renamed from: J, reason: collision with root package name */
    public final TimeInterpolator f357361J;

    /* renamed from: K, reason: collision with root package name */
    @P
    public c f357362K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList<c> f357363L;

    /* renamed from: M, reason: collision with root package name */
    @P
    public o f357364M;

    /* renamed from: N, reason: collision with root package name */
    public ValueAnimator f357365N;

    /* renamed from: O, reason: collision with root package name */
    @P
    public ViewPager f357366O;

    /* renamed from: P, reason: collision with root package name */
    @P
    public androidx.viewpager.widget.a f357367P;

    /* renamed from: Q, reason: collision with root package name */
    public DataSetObserver f357368Q;

    /* renamed from: R, reason: collision with root package name */
    public m f357369R;

    /* renamed from: S, reason: collision with root package name */
    public b f357370S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f357371T;

    /* renamed from: U, reason: collision with root package name */
    public int f357372U;

    /* renamed from: V, reason: collision with root package name */
    public final y.b f357373V;

    /* renamed from: b, reason: collision with root package name */
    public int f357374b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<i> f357375c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public i f357376d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final h f357377e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357378f;

    /* renamed from: g, reason: collision with root package name */
    public final int f357379g;

    /* renamed from: h, reason: collision with root package name */
    public final int f357380h;

    /* renamed from: i, reason: collision with root package name */
    public final int f357381i;

    /* renamed from: j, reason: collision with root package name */
    public final int f357382j;

    /* renamed from: k, reason: collision with root package name */
    public final int f357383k;

    /* renamed from: l, reason: collision with root package name */
    public final int f357384l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f357385m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f357386n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f357387o;

    /* renamed from: p, reason: collision with root package name */
    @N
    public Drawable f357388p;

    /* renamed from: q, reason: collision with root package name */
    public int f357389q;

    /* renamed from: r, reason: collision with root package name */
    public final float f357390r;

    /* renamed from: s, reason: collision with root package name */
    public final float f357391s;

    /* renamed from: t, reason: collision with root package name */
    public final int f357392t;

    /* renamed from: u, reason: collision with root package name */
    public int f357393u;

    /* renamed from: v, reason: collision with root package name */
    public final int f357394v;

    /* renamed from: w, reason: collision with root package name */
    public final int f357395w;

    /* renamed from: x, reason: collision with root package name */
    public final int f357396x;

    /* renamed from: y, reason: collision with root package name */
    public final int f357397y;

    /* renamed from: z, reason: collision with root package name */
    public int f357398z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: b, reason: collision with root package name */
        public boolean f357400b;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(@N ViewPager viewPager, @P androidx.viewpager.widget.a aVar) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f357366O == viewPager) {
                tabLayout.o(aVar, this.f357400b);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t12);

        void b(T t12);
    }

    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    public interface f extends c<i> {
    }

    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class h extends LinearLayout {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f357403d = 0;

        /* renamed from: b, reason: collision with root package name */
        public ValueAnimator f357404b;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f357406a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f357407b;

            public a(View view, View view2) {
                this.f357406a = view;
                this.f357407b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int i12 = h.f357403d;
                h.this.c(this.f357406a, this.f357407b, animatedFraction);
            }
        }

        public h(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i12) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f357372U == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i12);
                com.google.android.material.tabs.c cVar = tabLayout.f357360I;
                Drawable drawable = tabLayout.f357388p;
                cVar.getClass();
                RectF rectFA = com.google.android.material.tabs.c.a(tabLayout, childAt);
                drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
                tabLayout.f357374b = i12;
            }
        }

        public final void b(int i12) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f357388p.getBounds();
            tabLayout.f357388p.setBounds(bounds.left, 0, bounds.right, i12);
            requestLayout();
        }

        public final void c(View view, View view2, float f12) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.f357388p;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f357388p.getBounds().bottom);
            } else {
                tabLayout.f357360I.b(tabLayout, view, view2, f12, tabLayout.f357388p);
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }

        public final void d(int i12, int i13, boolean z12) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f357374b == i12) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i12);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f357374b = i12;
            a aVar = new a(childAt, childAt2);
            if (!z12) {
                this.f357404b.removeAllUpdateListeners();
                this.f357404b.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f357404b = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f357361J);
            valueAnimator.setDuration(i13);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(@N Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int iHeight = tabLayout.f357388p.getBounds().height();
            if (iHeight < 0) {
                iHeight = tabLayout.f357388p.getIntrinsicHeight();
            }
            int i12 = tabLayout.f357353B;
            if (i12 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i12 != 1) {
                height = 0;
                if (i12 != 2) {
                    iHeight = i12 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (tabLayout.f357388p.getBounds().width() > 0) {
                Rect bounds = tabLayout.f357388p.getBounds();
                tabLayout.f357388p.setBounds(bounds.left, height, bounds.right, iHeight);
                tabLayout.f357388p.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
            super.onLayout(z12, i12, i13, i14, i15);
            ValueAnimator valueAnimator = this.f357404b;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f357374b == -1) {
                tabLayout.f357374b = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f357374b);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            if (View.MeasureSpec.getMode(i12) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z12 = true;
            if (tabLayout.f357398z == 1 || tabLayout.f357354C == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) O.b(16, getContext())) * 2)) {
                    boolean z13 = false;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z13 = true;
                        }
                    }
                    z12 = z13;
                } else {
                    tabLayout.f357398z = 0;
                    tabLayout.r(false);
                }
                if (z12) {
                    super.onMeasure(i12, i13);
                }
            }
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        @P
        public com.avito.android.lib.deprecated_design.tab.adapter.i f357409a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public CharSequence f357410b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public CharSequence f357411c;

        /* renamed from: d, reason: collision with root package name */
        public int f357412d = -1;

        /* renamed from: e, reason: collision with root package name */
        @P
        public View f357413e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public TabLayout f357414f;

        /* renamed from: g, reason: collision with root package name */
        @N
        public n f357415g;

        public final void a() {
            TabLayout tabLayout = this.f357414f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.n(this, true);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface j {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface l {
    }

    public static class m implements ViewPager.i {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final WeakReference<TabLayout> f357416b;

        /* renamed from: c, reason: collision with root package name */
        public int f357417c;

        /* renamed from: d, reason: collision with root package name */
        public int f357418d;

        public m(TabLayout tabLayout) {
            this.f357416b = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            TabLayout tabLayout = this.f357416b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i12 || i12 >= tabLayout.getTabCount()) {
                return;
            }
            int i13 = this.f357418d;
            tabLayout.n(tabLayout.h(i12), i13 == 0 || (i13 == 2 && this.f357417c == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            this.f357417c = this.f357418d;
            this.f357418d = i12;
            TabLayout tabLayout = this.f357416b.get();
            if (tabLayout != null) {
                tabLayout.f357372U = this.f357418d;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            TabLayout tabLayout = this.f357416b.get();
            if (tabLayout != null) {
                int i14 = this.f357418d;
                tabLayout.p(i12, f12, i14 != 2 || this.f357417c == 1, (i14 == 2 && this.f357417c == 0) ? false : true, false);
            }
        }
    }

    public final class n extends LinearLayout {

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int f357419m = 0;

        /* renamed from: b, reason: collision with root package name */
        public i f357420b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f357421c;

        /* renamed from: d, reason: collision with root package name */
        public ImageView f357422d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public View f357423e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public com.google.android.material.badge.b f357424f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public View f357425g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public TextView f357426h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public ImageView f357427i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public Drawable f357428j;

        /* renamed from: k, reason: collision with root package name */
        public int f357429k;

        public n(@N Context context) {
            super(context);
            this.f357429k = 2;
            e(context);
            int i12 = TabLayout.this.f357378f;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setPaddingRelative(i12, TabLayout.this.f357379g, TabLayout.this.f357380h, TabLayout.this.f357381i);
            setGravity(17);
            setOrientation(!TabLayout.this.f357355D ? 1 : 0);
            setClickable(true);
            C22823h0.L(this, new Q(PointerIcon.getSystemIcon(getContext(), 1002)));
        }

        @P
        private com.google.android.material.badge.b getBadge() {
            return this.f357424f;
        }

        @N
        private com.google.android.material.badge.b getOrCreateBadge() {
            if (this.f357424f == null) {
                this.f357424f = new com.google.android.material.badge.b(getContext(), null);
            }
            b();
            com.google.android.material.badge.b bVar = this.f357424f;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.f357424f != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f357423e;
                if (view != null) {
                    com.google.android.material.badge.g.b(this.f357424f, view);
                    this.f357423e = null;
                }
            }
        }

        public final void b() {
            if (this.f357424f != null) {
                if (this.f357425g != null) {
                    a();
                    return;
                }
                TextView textView = this.f357421c;
                if (textView == null || this.f357420b == null) {
                    a();
                    return;
                }
                if (this.f357423e == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f357421c;
                if (this.f357424f == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                com.google.android.material.badge.g.a(this.f357424f, textView2);
                this.f357423e = textView2;
            }
        }

        public final void c(@N View view) {
            com.google.android.material.badge.b bVar = this.f357424f;
            if (bVar == null || view != this.f357423e) {
                return;
            }
            com.google.android.material.badge.g.c(bVar, view);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d() {
            /*
                r3 = this;
                r3.f()
                com.google.android.material.tabs.TabLayout$i r0 = r3.f357420b
                if (r0 == 0) goto L20
                com.google.android.material.tabs.TabLayout r1 = r0.f357414f
                if (r1 == 0) goto L18
                int r1 = r1.getSelectedTabPosition()
                r2 = -1
                if (r1 == r2) goto L20
                int r0 = r0.f357412d
                if (r1 != r0) goto L20
                r0 = 1
                goto L21
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L20:
                r0 = 0
            L21:
                r3.setSelected(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.n.d():void");
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f357428j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f357428j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$n] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i12 = tabLayout.f357392t;
            if (i12 != 0) {
                Drawable drawableA = C43852a.a(context, i12);
                this.f357428j = drawableA;
                if (drawableA != null && drawableA.isStateful()) {
                    this.f357428j.setState(getDrawableState());
                }
            } else {
                this.f357428j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.f357387o != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = com.google.android.material.ripple.b.a(tabLayout.f357387o);
                boolean z12 = tabLayout.f357359H;
                if (z12) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z12 ? null : gradientDrawable2);
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i12;
            ViewParent parent;
            i iVar = this.f357420b;
            View view = iVar != null ? iVar.f357413e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f357425g;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f357425g);
                    }
                    addView(view);
                }
                this.f357425g = view;
                TextView textView = this.f357421c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f357422d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f357422d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.f357426h = textView2;
                if (textView2 != null) {
                    this.f357429k = textView2.getMaxLines();
                }
                this.f357427i = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view3 = this.f357425g;
                if (view3 != null) {
                    removeView(view3);
                    this.f357425g = null;
                }
                this.f357426h = null;
                this.f357427i = null;
            }
            if (this.f357425g == null) {
                if (this.f357422d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f357422d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f357421c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f357421c = textView3;
                    addView(textView3);
                    this.f357429k = this.f357421c.getMaxLines();
                }
                TextView textView4 = this.f357421c;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.f357382j);
                if (!isSelected() || (i12 = tabLayout.f357384l) == -1) {
                    this.f357421c.setTextAppearance(tabLayout.f357383k);
                } else {
                    this.f357421c.setTextAppearance(i12);
                }
                ColorStateList colorStateList = tabLayout.f357385m;
                if (colorStateList != null) {
                    this.f357421c.setTextColor(colorStateList);
                }
                g(this.f357421c, this.f357422d, true);
                b();
                ImageView imageView3 = this.f357422d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, imageView3));
                }
                TextView textView5 = this.f357421c;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.e(this, textView5));
                }
            } else {
                TextView textView6 = this.f357426h;
                if (textView6 != null || this.f357427i != null) {
                    g(textView6, this.f357427i, false);
                }
            }
            if (iVar == null || TextUtils.isEmpty(iVar.f357411c)) {
                return;
            }
            setContentDescription(iVar.f357411c);
        }

        public final void g(@P TextView textView, @P ImageView imageView, boolean z12) {
            boolean z13;
            i iVar = this.f357420b;
            CharSequence charSequence = iVar != null ? iVar.f357410b : null;
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z13 = false;
                } else {
                    this.f357420b.getClass();
                    z13 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z13 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z13 = false;
            }
            if (z12 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB2 = (z13 && imageView.getVisibility() == 0) ? (int) O.b(8, getContext()) : 0;
                if (TabLayout.this.f357355D) {
                    if (iB2 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iB2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB2;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar2 = this.f357420b;
            CharSequence charSequence2 = iVar2 != null ? iVar2.f357411c : null;
            if (zIsEmpty) {
                charSequence = charSequence2;
            }
            K0.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f357421c, this.f357422d, this.f357425g};
            int iMax = 0;
            int iMin = 0;
            boolean z12 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z12 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z12 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z12 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f357421c, this.f357422d, this.f357425g};
            int iMax = 0;
            int iMin = 0;
            boolean z12 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z12 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z12 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z12 = true;
                }
            }
            return iMax - iMin;
        }

        @P
        public i getTab() {
            return this.f357420b;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.b bVar = this.f357424f;
            if (bVar != null && bVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f357424f.c()));
            }
            androidx.core.view.accessibility.f fVar = new androidx.core.view.accessibility.f(accessibilityNodeInfo);
            fVar.n(f.g.a(0, 1, this.f357420b.f357412d, 1, isSelected()));
            if (isSelected()) {
                fVar.l(false);
                fVar.h(f.a.f45004g);
            }
            fVar.r(getResources().getString(R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            int size = View.MeasureSpec.getSize(i12);
            int mode = View.MeasureSpec.getMode(i12);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i12 = View.MeasureSpec.makeMeasureSpec(tabLayout.f357393u, BeduinInputModel.MIN_TEXT_VERSION);
            }
            super.onMeasure(i12, i13);
            if (this.f357421c != null) {
                float f12 = tabLayout.f357390r;
                int i14 = this.f357429k;
                ImageView imageView = this.f357422d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f357421c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f12 = tabLayout.f357391s;
                    }
                } else {
                    i14 = 1;
                }
                float textSize = this.f357421c.getTextSize();
                int lineCount = this.f357421c.getLineCount();
                int maxLines = this.f357421c.getMaxLines();
                if (f12 != textSize || (maxLines >= 0 && i14 != maxLines)) {
                    if (tabLayout.f357354C == 1 && f12 > textSize && lineCount == 1) {
                        Layout layout = this.f357421c.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f12 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f357421c.setTextSize(0, f12);
                    this.f357421c.setMaxLines(i14);
                    super.onMeasure(i12, i13);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f357420b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f357420b.a();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z12) {
            isSelected();
            super.setSelected(z12);
            TextView textView = this.f357421c;
            if (textView != null) {
                textView.setSelected(z12);
            }
            ImageView imageView = this.f357422d;
            if (imageView != null) {
                imageView.setSelected(z12);
            }
            View view = this.f357425g;
            if (view != null) {
                view.setSelected(z12);
            }
        }

        public void setTab(@P i iVar) {
            if (iVar != this.f357420b) {
                this.f357420b = iVar;
                d();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@N Context context, @P AttributeSet attributeSet) throws Resources.NotFoundException {
        int i12 = R.attr.tabStyle;
        int i13 = f357350W;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f357374b = -1;
        this.f357375c = new ArrayList<>();
        this.f357384l = -1;
        this.f357389q = 0;
        this.f357393u = Integer.MAX_VALUE;
        this.f357357F = -1;
        this.f357363L = new ArrayList<>();
        this.f357373V = new y.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context2);
        this.f357377e = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.TabLayout, i12, i13, R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            kVar.n(ColorStateList.valueOf(colorDrawable.getColor()));
            kVar.j(context2);
            kVar.m(C22823h0.l(this));
            setBackground(kVar);
        }
        setSelectedTabIndicator(com.google.android.material.resources.c.d(typedArrayD, context2, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayD.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        hVar.b(typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(R.styleable.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f357381i = dimensionPixelSize;
        this.f357380h = dimensionPixelSize;
        this.f357379g = dimensionPixelSize;
        this.f357378f = dimensionPixelSize;
        this.f357378f = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f357379g = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.f357380h = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.f357381i = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (com.google.android.material.resources.b.b(context2, R.attr.isMaterial3Theme, false)) {
            this.f357382j = R.attr.textAppearanceTitleSmall;
        } else {
            this.f357382j = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.f357383k = resourceId;
        int[] iArr = C43521a.m.f413375x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f357390r = dimensionPixelSize2;
            this.f357385m = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(R.styleable.TabLayout_tabSelectedTextAppearance)) {
                this.f357384l = typedArrayD.getResourceId(R.styleable.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i14 = this.f357384l;
            if (i14 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i14, iArr);
                try {
                    typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, 3);
                    if (colorStateListB != null) {
                        this.f357385m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor()), this.f357385m.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(R.styleable.TabLayout_tabTextColor)) {
                this.f357385m = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f357385m = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayD.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0), this.f357385m.getDefaultColor()});
            }
            this.f357386n = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabIconTint);
            O.g(typedArrayD.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.f357387o = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabRippleColor);
            this.f357352A = typedArrayD.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f357361J = C49576a.d(context2, R.attr.motionEasingEmphasizedInterpolator, C43707b.f413880b);
            this.f357394v = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f357395w = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f357392t = typedArrayD.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.f357397y = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.f357354C = typedArrayD.getInt(R.styleable.TabLayout_tabMode, 1);
            this.f357398z = typedArrayD.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.f357355D = typedArrayD.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.f357359H = typedArrayD.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.f357391s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f357396x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    @r
    private int getDefaultHeight() {
        ArrayList<i> arrayList = this.f357375c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i12 = this.f357394v;
        if (i12 != -1) {
            return i12;
        }
        int i13 = this.f357354C;
        if (i13 == 0 || i13 == 2) {
            return this.f357396x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f357377e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i12) {
        h hVar = this.f357377e;
        int childCount = hVar.getChildCount();
        if (i12 < childCount) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = hVar.getChildAt(i13);
                if ((i13 != i12 || childAt.isSelected()) && (i13 == i12 || !childAt.isSelected())) {
                    childAt.setSelected(i13 == i12);
                    childAt.setActivated(i13 == i12);
                } else {
                    childAt.setSelected(i13 == i12);
                    childAt.setActivated(i13 == i12);
                    if (childAt instanceof n) {
                        ((n) childAt).f();
                    }
                }
                i13++;
            }
        }
    }

    @Deprecated
    public final void a(@P c cVar) {
        ArrayList<c> arrayList = this.f357363L;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(@N i iVar, int i12, boolean z12) {
        if (iVar.f357414f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        iVar.f357412d = i12;
        ArrayList<i> arrayList = this.f357375c;
        arrayList.add(i12, iVar);
        int size = arrayList.size();
        int i13 = -1;
        for (int i14 = i12 + 1; i14 < size; i14++) {
            if (arrayList.get(i14).f357412d == this.f357374b) {
                i13 = i14;
            }
            arrayList.get(i14).f357412d = i14;
        }
        this.f357374b = i13;
        n nVar = iVar.f357415g;
        nVar.setSelected(false);
        nVar.setActivated(false);
        int i15 = iVar.f357412d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f357354C == 1 && this.f357398z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f357377e.addView(nVar, i15, layoutParams);
        if (z12) {
            iVar.a();
        }
    }

    public final void c(View view) {
        if (!(view instanceof com.google.android.material.tabs.d)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        com.google.android.material.tabs.d dVar = (com.google.android.material.tabs.d) view;
        i iVarI = i();
        dVar.getClass();
        if (!TextUtils.isEmpty(dVar.getContentDescription())) {
            iVarI.f357411c = dVar.getContentDescription();
            n nVar = iVarI.f357415g;
            if (nVar != null) {
                nVar.d();
            }
        }
        ArrayList<i> arrayList = this.f357375c;
        b(iVarI, arrayList.size(), arrayList.isEmpty());
    }

    public final void d(int i12) {
        if (i12 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (isLaidOut()) {
                h hVar = this.f357377e;
                int childCount = hVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (hVar.getChildAt(i13).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iF2 = f(0.0f, i12);
                if (scrollX != iF2) {
                    g();
                    this.f357365N.setIntValues(scrollX, iF2);
                    this.f357365N.start();
                }
                ValueAnimator valueAnimator = hVar.f357404b;
                if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f357374b != i12) {
                    hVar.f357404b.cancel();
                }
                hVar.d(i12, this.f357352A, true);
                return;
            }
        }
        p(i12, 0.0f, true, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r4 = this;
            int r0 = r4.f357354C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.f357397y
            int r3 = r4.f357378f
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r3 = androidx.core.view.C22823h0.f45055a
            com.google.android.material.tabs.TabLayout$h r3 = r4.f357377e
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.f357354C
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L25
            if (r0 == r1) goto L25
            goto L3c
        L25:
            r3.setGravity(r2)
            goto L3c
        L29:
            int r0 = r4.f357398z
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 == r1) goto L36
            goto L3c
        L32:
            r3.setGravity(r2)
            goto L3c
        L36:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L3c:
            r4.r(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(float f12, int i12) {
        h hVar;
        View childAt;
        int i13 = this.f357354C;
        if ((i13 != 0 && i13 != 2) || (childAt = (hVar = this.f357377e).getChildAt(i12)) == null) {
            return 0;
        }
        int i14 = i12 + 1;
        View childAt2 = i14 < hVar.getChildCount() ? hVar.getChildAt(i14) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i15 = (int) ((width + width2) * 0.5f * f12);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 0 ? left + i15 : left - i15;
    }

    public final void g() {
        if (this.f357365N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f357365N = valueAnimator;
            valueAnimator.setInterpolator(this.f357361J);
            this.f357365N.setDuration(this.f357352A);
            this.f357365N.addUpdateListener(new a());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        i iVar = this.f357376d;
        if (iVar != null) {
            return iVar.f357412d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f357375c.size();
    }

    public int getTabGravity() {
        return this.f357398z;
    }

    @P
    public ColorStateList getTabIconTint() {
        return this.f357386n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f357358G;
    }

    public int getTabIndicatorGravity() {
        return this.f357353B;
    }

    public int getTabMaxWidth() {
        return this.f357393u;
    }

    public int getTabMode() {
        return this.f357354C;
    }

    @P
    public ColorStateList getTabRippleColor() {
        return this.f357387o;
    }

    @N
    public Drawable getTabSelectedIndicator() {
        return this.f357388p;
    }

    @P
    public ColorStateList getTabTextColors() {
        return this.f357385m;
    }

    @P
    public final i h(int i12) {
        if (i12 < 0 || i12 >= getTabCount()) {
            return null;
        }
        return this.f357375c.get(i12);
    }

    @N
    public final i i() {
        i iVar = (i) f357351a0.b();
        if (iVar == null) {
            iVar = new i();
        }
        iVar.f357414f = this;
        y.b bVar = this.f357373V;
        n nVar = bVar != null ? (n) bVar.b() : null;
        if (nVar == null) {
            nVar = new n(getContext());
        }
        nVar.setTab(iVar);
        nVar.setFocusable(true);
        nVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.f357411c)) {
            nVar.setContentDescription(iVar.f357410b);
        } else {
            nVar.setContentDescription(iVar.f357411c);
        }
        iVar.f357415g = nVar;
        return iVar;
    }

    public final void j() {
        int currentItem;
        k();
        androidx.viewpager.widget.a aVar = this.f357367P;
        if (aVar != null) {
            int iC2 = aVar.c();
            for (int i12 = 0; i12 < iC2; i12++) {
                i iVarI = i();
                CharSequence charSequenceE = this.f357367P.e(i12);
                if (TextUtils.isEmpty(iVarI.f357411c) && !TextUtils.isEmpty(charSequenceE)) {
                    iVarI.f357415g.setContentDescription(charSequenceE);
                }
                iVarI.f357410b = charSequenceE;
                n nVar = iVarI.f357415g;
                if (nVar != null) {
                    nVar.d();
                }
                b(iVarI, this.f357375c.size(), false);
            }
            ViewPager viewPager = this.f357366O;
            if (viewPager == null || iC2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            n(h(currentItem), true);
        }
    }

    public final void k() {
        for (int childCount = this.f357377e.getChildCount() - 1; childCount >= 0; childCount--) {
            m(childCount);
        }
        Iterator<i> it = this.f357375c.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.f357414f = null;
            next.f357415g = null;
            next.f357409a = null;
            next.f357410b = null;
            next.f357411c = null;
            next.f357412d = -1;
            next.f357413e = null;
            f357351a0.a(next);
        }
        this.f357376d = null;
    }

    public final void l(int i12) {
        i iVar = this.f357376d;
        int i13 = iVar != null ? iVar.f357412d : 0;
        m(i12);
        ArrayList<i> arrayList = this.f357375c;
        i iVarRemove = arrayList.remove(i12);
        int i14 = -1;
        if (iVarRemove != null) {
            iVarRemove.f357414f = null;
            iVarRemove.f357415g = null;
            iVarRemove.f357409a = null;
            iVarRemove.f357410b = null;
            iVarRemove.f357411c = null;
            iVarRemove.f357412d = -1;
            iVarRemove.f357413e = null;
            f357351a0.a(iVarRemove);
        }
        int size = arrayList.size();
        for (int i15 = i12; i15 < size; i15++) {
            if (arrayList.get(i15).f357412d == this.f357374b) {
                i14 = i15;
            }
            arrayList.get(i15).f357412d = i15;
        }
        this.f357374b = i14;
        if (i13 == i12) {
            n(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i12 - 1)), true);
        }
    }

    public final void m(int i12) {
        h hVar = this.f357377e;
        n nVar = (n) hVar.getChildAt(i12);
        hVar.removeViewAt(i12);
        if (nVar != null) {
            nVar.setTab(null);
            nVar.setSelected(false);
            this.f357373V.a(nVar);
        }
        requestLayout();
    }

    public final void n(@P i iVar, boolean z12) {
        i iVar2 = this.f357376d;
        ArrayList<c> arrayList = this.f357363L;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).getClass();
                }
                d(iVar.f357412d);
                return;
            }
            return;
        }
        int i12 = iVar != null ? iVar.f357412d : -1;
        if (z12) {
            if ((iVar2 == null || iVar2.f357412d == -1) && i12 != -1) {
                p(i12, 0.0f, true, true, true);
            } else {
                d(i12);
            }
            if (i12 != -1) {
                setSelectedTabView(i12);
            }
        }
        this.f357376d = iVar;
        if (iVar2 != null && iVar2.f357414f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).a(iVar2);
            }
        }
        if (iVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).b(iVar);
            }
        }
    }

    public final void o(@P androidx.viewpager.widget.a aVar, boolean z12) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f357367P;
        if (aVar2 != null && (dataSetObserver = this.f357368Q) != null) {
            aVar2.n(dataSetObserver);
        }
        this.f357367P = aVar;
        if (z12 && aVar != null) {
            if (this.f357368Q == null) {
                this.f357368Q = new g();
            }
            aVar.i(this.f357368Q);
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
        if (this.f357366O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                q((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f357371T) {
            setupWithViewPager(null);
            this.f357371T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@N Canvas canvas) {
        n nVar;
        Drawable drawable;
        int i12 = 0;
        while (true) {
            h hVar = this.f357377e;
            if (i12 >= hVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if ((childAt instanceof n) && (drawable = (nVar = (n) childAt).f357428j) != null) {
                drawable.setBounds(nVar.getLeft(), nVar.getTop(), nVar.getRight(), nVar.getBottom());
                nVar.f357428j.draw(canvas);
            }
            i12++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(1, getTabCount(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.O.b(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f357395w
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.O.b(r2, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f357393u = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f357354C
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(int i12, float f12, boolean z12, boolean z13, boolean z14) {
        float f13 = i12 + f12;
        int iRound = Math.round(f13);
        if (iRound >= 0) {
            h hVar = this.f357377e;
            if (iRound >= hVar.getChildCount()) {
                return;
            }
            if (z13) {
                TabLayout.this.f357374b = Math.round(f13);
                ValueAnimator valueAnimator = hVar.f357404b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hVar.f357404b.cancel();
                }
                hVar.c(hVar.getChildAt(i12), hVar.getChildAt(i12 + 1), f12);
            }
            ValueAnimator valueAnimator2 = this.f357365N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f357365N.cancel();
            }
            int iF2 = f(f12, i12);
            int scrollX = getScrollX();
            boolean z15 = (i12 < getSelectedTabPosition() && iF2 >= scrollX) || (i12 > getSelectedTabPosition() && iF2 <= scrollX) || i12 == getSelectedTabPosition();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (getLayoutDirection() == 1) {
                z15 = (i12 < getSelectedTabPosition() && iF2 <= scrollX) || (i12 > getSelectedTabPosition() && iF2 >= scrollX) || i12 == getSelectedTabPosition();
            }
            if (z15 || this.f357372U == 1 || z14) {
                if (i12 < 0) {
                    iF2 = 0;
                }
                scrollTo(iF2, 0);
            }
            if (z12) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void q(@P ViewPager viewPager, boolean z12) {
        ArrayList arrayList;
        ViewPager viewPager2 = this.f357366O;
        if (viewPager2 != null) {
            m mVar = this.f357369R;
            if (mVar != null) {
                viewPager2.u(mVar);
            }
            b bVar = this.f357370S;
            if (bVar != null && (arrayList = this.f357366O.f55002U) != null) {
                arrayList.remove(bVar);
            }
        }
        o oVar = this.f357364M;
        if (oVar != null) {
            this.f357363L.remove(oVar);
            this.f357364M = null;
        }
        if (viewPager != null) {
            this.f357366O = viewPager;
            if (this.f357369R == null) {
                this.f357369R = new m(this);
            }
            m mVar2 = this.f357369R;
            mVar2.f357418d = 0;
            mVar2.f357417c = 0;
            viewPager.c(mVar2);
            o oVar2 = new o(viewPager);
            this.f357364M = oVar2;
            a(oVar2);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                o(adapter, true);
            }
            if (this.f357370S == null) {
                this.f357370S = new b();
            }
            b bVar2 = this.f357370S;
            bVar2.f357400b = true;
            viewPager.b(bVar2);
            p(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f357366O = null;
            o(null, false);
        }
        this.f357371T = z12;
    }

    public final void r(boolean z12) {
        int i12 = 0;
        while (true) {
            h hVar = this.f357377e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f357354C == 1 && this.f357398z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z12) {
                childAt.requestLayout();
            }
            i12++;
        }
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.shape.m.b(this, f12);
    }

    public void setInlineLabel(boolean z12) {
        if (this.f357355D == z12) {
            return;
        }
        this.f357355D = z12;
        int i12 = 0;
        while (true) {
            h hVar = this.f357377e;
            if (i12 >= hVar.getChildCount()) {
                e();
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof n) {
                n nVar = (n) childAt;
                nVar.setOrientation(!TabLayout.this.f357355D ? 1 : 0);
                TextView textView = nVar.f357426h;
                if (textView == null && nVar.f357427i == null) {
                    nVar.g(nVar.f357421c, nVar.f357422d, true);
                } else {
                    nVar.g(textView, nVar.f357427i, false);
                }
            }
            i12++;
        }
    }

    public void setInlineLabelResource(@InterfaceC42152h int i12) {
        setInlineLabel(getResources().getBoolean(i12));
    }

    @Deprecated
    public void setOnTabSelectedListener(@P f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f357365N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@P Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f357388p = drawableMutate;
        int i12 = this.f357389q;
        if (i12 != 0) {
            drawableMutate.setTint(i12);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.f357357F;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f357388p.getIntrinsicHeight();
        }
        this.f357377e.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(@InterfaceC42156l int i12) {
        this.f357389q = i12;
        Drawable drawable = this.f357388p;
        if (i12 != 0) {
            drawable.setTint(i12);
        } else {
            drawable.setTintList(null);
        }
        r(false);
    }

    public void setSelectedTabIndicatorGravity(int i12) {
        if (this.f357353B != i12) {
            this.f357353B = i12;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f357377e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i12) {
        this.f357357F = i12;
        this.f357377e.b(i12);
    }

    public void setTabGravity(int i12) {
        if (this.f357398z != i12) {
            this.f357398z = i12;
            e();
        }
    }

    public void setTabIconTint(@P ColorStateList colorStateList) {
        if (this.f357386n != colorStateList) {
            this.f357386n = colorStateList;
            ArrayList<i> arrayList = this.f357375c;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = arrayList.get(i12).f357415g;
                if (nVar != null) {
                    nVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(@InterfaceC42158n int i12) {
        setTabIconTint(androidx.core.content.d.getColorStateList(getContext(), i12));
    }

    public void setTabIndicatorAnimationMode(int i12) {
        this.f357358G = i12;
        if (i12 == 0) {
            this.f357360I = new com.google.android.material.tabs.c();
            return;
        }
        if (i12 == 1) {
            this.f357360I = new com.google.android.material.tabs.a();
        } else {
            if (i12 == 2) {
                this.f357360I = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i12 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z12) {
        this.f357356E = z12;
        int i12 = h.f357403d;
        h hVar = this.f357377e;
        hVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        hVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i12) {
        if (i12 != this.f357354C) {
            this.f357354C = i12;
            e();
        }
    }

    public void setTabRippleColor(@P ColorStateList colorStateList) {
        if (this.f357387o == colorStateList) {
            return;
        }
        this.f357387o = colorStateList;
        int i12 = 0;
        while (true) {
            h hVar = this.f357377e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof n) {
                Context context = getContext();
                int i13 = n.f357419m;
                ((n) childAt).e(context);
            }
            i12++;
        }
    }

    public void setTabRippleColorResource(@InterfaceC42158n int i12) {
        setTabRippleColor(androidx.core.content.d.getColorStateList(getContext(), i12));
    }

    public void setTabTextColors(@P ColorStateList colorStateList) {
        if (this.f357385m != colorStateList) {
            this.f357385m = colorStateList;
            ArrayList<i> arrayList = this.f357375c;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = arrayList.get(i12).f357415g;
                if (nVar != null) {
                    nVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@P androidx.viewpager.widget.a aVar) {
        o(aVar, false);
    }

    public void setUnboundedRipple(boolean z12) {
        if (this.f357359H == z12) {
            return;
        }
        this.f357359H = z12;
        int i12 = 0;
        while (true) {
            h hVar = this.f357377e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof n) {
                Context context = getContext();
                int i13 = n.f357419m;
                ((n) childAt).e(context);
            }
            i12++;
        }
    }

    public void setUnboundedRippleResource(@InterfaceC42152h int i12) {
        setUnboundedRipple(getResources().getBoolean(i12));
    }

    public void setupWithViewPager(@P ViewPager viewPager) {
        q(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i12) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@P c cVar) {
        c cVar2 = this.f357362K;
        if (cVar2 != null) {
            this.f357363L.remove(cVar2);
        }
        this.f357362K = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(@InterfaceC42165v int i12) {
        if (i12 != 0) {
            setSelectedTabIndicator(C43852a.a(getContext(), i12));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public static class o implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f357431a;

        public o(ViewPager viewPager) {
            this.f357431a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(@N i iVar) {
            this.f357431a.setCurrentItem(iVar.f357412d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(i iVar) {
        }
    }
}
