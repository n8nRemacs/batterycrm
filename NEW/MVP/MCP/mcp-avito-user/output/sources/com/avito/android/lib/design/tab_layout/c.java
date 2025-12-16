package com.avito.android.lib.design.tab_layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
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
import com.avito.android.lib.design.d;
import com.google.android.material.R;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import j.InterfaceC42152h;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42165v;
import j.N;
import j.P;
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

/* compiled from: TabLayout.java */
@ViewPager.d
@SuppressLint({"RestrictedApi", "CustomViewStyleable", "CustomColorsKotlin"})
/* loaded from: classes14.dex */
public class c extends HorizontalScrollView {

    /* renamed from: P, reason: collision with root package name */
    public static final int f180830P = R.style.Widget_Design_TabLayout;

    /* renamed from: Q, reason: collision with root package name */
    public static final y.c f180831Q = new y.c(16);

    /* renamed from: A, reason: collision with root package name */
    public int f180832A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f180833B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f180834C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f180835D;

    /* renamed from: E, reason: collision with root package name */
    @P
    public InterfaceC5322c f180836E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList<InterfaceC5322c> f180837F;

    /* renamed from: G, reason: collision with root package name */
    @P
    public n f180838G;

    /* renamed from: H, reason: collision with root package name */
    public ValueAnimator f180839H;

    /* renamed from: I, reason: collision with root package name */
    @P
    public ViewPager f180840I;

    /* renamed from: J, reason: collision with root package name */
    @P
    public androidx.viewpager.widget.a f180841J;

    /* renamed from: K, reason: collision with root package name */
    public DataSetObserver f180842K;

    /* renamed from: L, reason: collision with root package name */
    public l f180843L;

    /* renamed from: M, reason: collision with root package name */
    public b f180844M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f180845N;

    /* renamed from: O, reason: collision with root package name */
    public final y.b f180846O;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<i> f180847b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public i f180848c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f180849d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final h f180850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180851f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180852g;

    /* renamed from: h, reason: collision with root package name */
    public final int f180853h;

    /* renamed from: i, reason: collision with root package name */
    public final int f180854i;

    /* renamed from: j, reason: collision with root package name */
    public final int f180855j;

    /* renamed from: k, reason: collision with root package name */
    public final int f180856k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f180857l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f180858m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f180859n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public Drawable f180860o;

    /* renamed from: p, reason: collision with root package name */
    public final float f180861p;

    /* renamed from: q, reason: collision with root package name */
    public final float f180862q;

    /* renamed from: r, reason: collision with root package name */
    public final int f180863r;

    /* renamed from: s, reason: collision with root package name */
    public int f180864s;

    /* renamed from: t, reason: collision with root package name */
    public final int f180865t;

    /* renamed from: u, reason: collision with root package name */
    public final int f180866u;

    /* renamed from: v, reason: collision with root package name */
    public final int f180867v;

    /* renamed from: w, reason: collision with root package name */
    public final int f180868w;

    /* renamed from: x, reason: collision with root package name */
    public int f180869x;

    /* renamed from: y, reason: collision with root package name */
    public final int f180870y;

    /* renamed from: z, reason: collision with root package name */
    public int f180871z;

    /* compiled from: TabLayout.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            c.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* compiled from: TabLayout.java */
    public class b implements ViewPager.h {

        /* renamed from: b, reason: collision with root package name */
        public boolean f180873b;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(@N ViewPager viewPager, @P androidx.viewpager.widget.a aVar) {
            c cVar = c.this;
            if (cVar.f180840I == viewPager) {
                cVar.r(aVar, this.f180873b);
            }
        }
    }

    /* compiled from: TabLayout.java */
    @Deprecated
    /* renamed from: com.avito.android.lib.design.tab_layout.c$c, reason: collision with other inner class name */
    public interface InterfaceC5322c<T extends i> {
        void a(T t12);

        void b();

        void c(T t12);
    }

    /* compiled from: TabLayout.java */
    public @interface d {
    }

    /* compiled from: TabLayout.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    /* compiled from: TabLayout.java */
    public interface f extends InterfaceC5322c<i> {
    }

    /* compiled from: TabLayout.java */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            c.this.l();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            c.this.l();
        }
    }

    /* compiled from: TabLayout.java */
    public class h extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        public int f180876b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public final Paint f180877c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public final GradientDrawable f180878d;

        /* renamed from: e, reason: collision with root package name */
        public int f180879e;

        /* renamed from: f, reason: collision with root package name */
        public float f180880f;

        /* renamed from: g, reason: collision with root package name */
        public int f180881g;

        /* renamed from: h, reason: collision with root package name */
        public int f180882h;

        /* renamed from: i, reason: collision with root package name */
        public ValueAnimator f180883i;

        /* renamed from: j, reason: collision with root package name */
        public int f180884j;

        /* renamed from: k, reason: collision with root package name */
        public int f180885k;

        /* compiled from: TabLayout.java */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f180887a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f180888b;

            public a(int i12, int i13) {
                this.f180887a = i12;
                this.f180888b = i13;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@N ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h hVar = h.this;
                int iC2 = C43707b.c(animatedFraction, hVar.f180884j, this.f180887a);
                int iC3 = C43707b.c(animatedFraction, hVar.f180885k, this.f180888b);
                if (iC2 == hVar.f180881g && iC3 == hVar.f180882h) {
                    return;
                }
                hVar.f180881g = iC2;
                hVar.f180882h = iC3;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                hVar.postInvalidateOnAnimation();
            }
        }

        /* compiled from: TabLayout.java */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f180890a;

            public b(int i12) {
                this.f180890a = i12;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i12 = this.f180890a;
                h hVar = h.this;
                hVar.f180879e = i12;
                hVar.f180880f = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                h.this.f180879e = this.f180890a;
            }
        }

        public h(Context context) {
            super(context);
            this.f180879e = -1;
            this.f180881g = -1;
            this.f180882h = -1;
            this.f180884j = -1;
            this.f180885k = -1;
            setWillNotDraw(false);
            this.f180877c = new Paint();
            this.f180878d = new GradientDrawable();
        }

        public void a(@N m mVar, @N RectF rectF) {
            int contentWidth = mVar.getContentWidth();
            int iB2 = (int) O.b(24, getContext());
            if (contentWidth < iB2) {
                contentWidth = iB2;
            }
            int right = (mVar.getRight() + mVar.getLeft()) / 2;
            int i12 = contentWidth / 2;
            rectF.set(right - i12, 0.0f, right + i12, 0.0f);
        }

        public final void b() {
            int left;
            int right;
            View childAt = getChildAt(this.f180879e);
            if (childAt == null || childAt.getWidth() <= 0) {
                left = -1;
                right = -1;
            } else {
                left = childAt.getLeft();
                right = childAt.getRight();
                c cVar = c.this;
                boolean z12 = cVar.f180834C;
                RectF rectF = cVar.f180849d;
                if (!z12 && (childAt instanceof m)) {
                    a((m) childAt, rectF);
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.f180880f > 0.0f && this.f180879e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f180879e + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    if (!cVar.f180834C && (childAt2 instanceof m)) {
                        a((m) childAt2, rectF);
                        left2 = (int) rectF.left;
                        right2 = (int) rectF.right;
                    }
                    float f12 = this.f180880f;
                    float f13 = left2 * f12;
                    float f14 = 1.0f - f12;
                    left = (int) ((left * f14) + f13);
                    right = (int) ((f14 * right) + (f12 * right2));
                }
            }
            if (left == this.f180881g && right == this.f180882h) {
                return;
            }
            this.f180881g = left;
            this.f180882h = right;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            postInvalidateOnAnimation();
        }

        public final void c(int i12, int i13, boolean z12) {
            View childAt = getChildAt(i12);
            if (childAt == null) {
                b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            c cVar = c.this;
            if (!cVar.f180834C && (childAt instanceof m)) {
                RectF rectF = cVar.f180849d;
                a((m) childAt, rectF);
                int i14 = (int) rectF.left;
                right = (int) rectF.right;
                left = i14;
            }
            int i15 = this.f180881g;
            int i16 = this.f180882h;
            if (i15 == left && i16 == right) {
                return;
            }
            if (z12) {
                this.f180884j = i15;
                this.f180885k = i16;
            }
            a aVar = new a(left, right);
            if (!z12) {
                this.f180883i.removeAllUpdateListeners();
                this.f180883i.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f180883i = valueAnimator;
            valueAnimator.setInterpolator(C43707b.f413880b);
            valueAnimator.setDuration(i13);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i12));
            valueAnimator.start();
        }

        @Override // android.view.View
        public void draw(@N Canvas canvas) {
            c cVar = c.this;
            Drawable drawable = cVar.f180860o;
            int height = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i12 = this.f180876b;
            if (i12 >= 0) {
                intrinsicHeight = i12;
            }
            int i13 = cVar.f180871z;
            if (i13 == 0) {
                height = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i13 == 1) {
                height = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i13 != 2) {
                intrinsicHeight = i13 != 3 ? 0 : getHeight();
            }
            int i14 = this.f180881g;
            if (i14 >= 0 && this.f180882h > i14) {
                Drawable drawable2 = cVar.f180860o;
                if (drawable2 == null) {
                    drawable2 = this.f180878d;
                }
                Drawable drawableMutate = drawable2.mutate();
                drawableMutate.setBounds(this.f180881g, height, this.f180882h, intrinsicHeight);
                Paint paint = this.f180877c;
                if (paint != null) {
                    drawableMutate.setTint(paint.getColor());
                }
                drawableMutate.draw(canvas);
            }
            super.draw(canvas);
        }

        public float getIndicatorPosition() {
            return this.f180879e + this.f180880f;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
            super.onLayout(z12, i12, i13, i14, i15);
            ValueAnimator valueAnimator = this.f180883i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                b();
            } else {
                c(this.f180879e, -1, false);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            super.onMeasure(i12, i13);
            if (View.MeasureSpec.getMode(i12) != 1073741824) {
                return;
            }
            c cVar = c.this;
            boolean z12 = true;
            if (cVar.f180869x == 1 || cVar.f180832A == 2) {
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
                    cVar.f180869x = 0;
                    cVar.u(false);
                }
                if (z12) {
                    super.onMeasure(i12, i13);
                }
            }
        }

        public void setSelectedIndicatorColor(int i12) {
            Paint paint = this.f180877c;
            if (paint.getColor() != i12) {
                paint.setColor(i12);
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }

        public void setSelectedIndicatorHeight(int i12) {
            if (this.f180876b != i12) {
                this.f180876b = i12;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }
    }

    /* compiled from: TabLayout.java */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        @P
        public com.avito.android.lib.deprecated_design.tab.adapter.i f180892a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public CharSequence f180893b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public CharSequence f180894c;

        /* renamed from: d, reason: collision with root package name */
        public int f180895d = -1;

        /* renamed from: e, reason: collision with root package name */
        @P
        public View f180896e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public c f180897f;

        /* renamed from: g, reason: collision with root package name */
        @N
        public m f180898g;

        public void a() {
            this.f180897f = null;
            this.f180898g = null;
            this.f180892a = null;
            this.f180893b = null;
            this.f180894c = null;
            this.f180895d = -1;
            this.f180896e = null;
        }

        public final void b() {
            c cVar = this.f180897f;
            if (cVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            cVar.q(this, true);
        }

        @N
        public final void c(@P CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f180894c) && !TextUtils.isEmpty(charSequence)) {
                this.f180898g.setContentDescription(charSequence);
            }
            this.f180893b = charSequence;
            m mVar = this.f180898g;
            if (mVar != null) {
                mVar.e();
            }
        }
    }

    /* compiled from: TabLayout.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface j {
    }

    /* compiled from: TabLayout.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface k {
    }

    /* compiled from: TabLayout.java */
    public static class l implements ViewPager.i {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final WeakReference<c> f180899b;

        /* renamed from: c, reason: collision with root package name */
        public int f180900c;

        /* renamed from: d, reason: collision with root package name */
        public int f180901d;

        public l(c cVar) {
            this.f180899b = new WeakReference<>(cVar);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            c cVar = this.f180899b.get();
            if (cVar == null || cVar.getSelectedTabPosition() == i12 || i12 >= cVar.getTabCount()) {
                return;
            }
            int i13 = this.f180901d;
            cVar.q(cVar.j(i12), i13 == 0 || (i13 == 2 && this.f180900c == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            this.f180900c = this.f180901d;
            this.f180901d = i12;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            c cVar = this.f180899b.get();
            if (cVar != null) {
                int i14 = this.f180901d;
                cVar.s(i12, f12, i14 != 2 || this.f180900c == 1, (i14 == 2 && this.f180900c == 0) ? false : true);
            }
        }
    }

    /* compiled from: TabLayout.java */
    public class m extends LinearLayout {

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ int f180902m = 0;

        /* renamed from: b, reason: collision with root package name */
        public i f180903b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f180904c;

        /* renamed from: d, reason: collision with root package name */
        public ImageView f180905d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public View f180906e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public com.google.android.material.badge.b f180907f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public View f180908g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public TextView f180909h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public ImageView f180910i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public Drawable f180911j;

        /* renamed from: k, reason: collision with root package name */
        public int f180912k;

        public m(@N Context context) {
            super(context);
            this.f180912k = 2;
            f(context);
            int i12 = c.this.f180852g;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setPaddingRelative(i12, c.this.f180853h, c.this.f180854i, c.this.f180855j);
            setGravity(17);
            setOrientation(!c.this.f180833B ? 1 : 0);
            setClickable(true);
            C22823h0.L(this, new Q(PointerIcon.getSystemIcon(getContext(), 1002)));
        }

        @P
        private com.google.android.material.badge.b getBadge() {
            return this.f180907f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f180904c, this.f180905d, this.f180908g};
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

        @N
        private com.google.android.material.badge.b getOrCreateBadge() {
            if (this.f180907f == null) {
                this.f180907f = new com.google.android.material.badge.b(getContext(), null);
            }
            c();
            com.google.android.material.badge.b bVar = this.f180907f;
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @SuppressLint({"UnsafeExperimentalUsageError", "UnsafeOptInUsageError"})
        public final void b() {
            if (this.f180907f != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f180906e;
                if (view != null) {
                    com.google.android.material.badge.g.b(this.f180907f, view);
                    this.f180906e = null;
                }
            }
        }

        public final void c() {
            if (this.f180907f != null) {
                if (this.f180908g != null) {
                    b();
                    return;
                }
                TextView textView = this.f180904c;
                if (textView == null || this.f180903b == null) {
                    b();
                    return;
                }
                if (this.f180906e == textView) {
                    d(textView);
                    return;
                }
                b();
                TextView textView2 = this.f180904c;
                if (this.f180907f == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                com.google.android.material.badge.g.a(this.f180907f, textView2);
                this.f180906e = textView2;
            }
        }

        @SuppressLint({"UnsafeExperimentalUsageError", "UnsafeOptInUsageError"})
        public final void d(@N View view) {
            com.google.android.material.badge.b bVar = this.f180907f;
            if (bVar == null || view != this.f180906e) {
                return;
            }
            com.google.android.material.badge.g.c(bVar, view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f180911j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f180911j.setState(drawableState)) {
                invalidate();
                invalidate();
            }
        }

        public void e() {
            i iVar = this.f180903b;
            View view = iVar != null ? iVar.f180896e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f180908g = view;
                TextView textView = this.f180904c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f180905d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f180905d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.f180909h = textView2;
                if (textView2 != null) {
                    this.f180912k = textView2.getMaxLines();
                }
                this.f180910i = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f180908g;
                if (view2 != null) {
                    removeView(view2);
                    this.f180908g = null;
                }
                this.f180909h = null;
                this.f180910i = null;
            }
            boolean z12 = false;
            if (this.f180908g == null) {
                if (this.f180905d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f180905d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f180904c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.avito.android.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f180904c = textView3;
                    addView(textView3);
                    this.f180912k = this.f180904c.getMaxLines();
                }
                TextView textView4 = this.f180904c;
                c cVar = c.this;
                textView4.setTextAppearance(cVar.f180856k);
                ColorStateList colorStateList = cVar.f180857l;
                if (colorStateList != null) {
                    this.f180904c.setTextColor(colorStateList);
                }
                g(this.f180904c, this.f180905d);
                c();
                ImageView imageView3 = this.f180905d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.avito.android.lib.design.tab_layout.d(this, imageView3));
                }
                TextView textView5 = this.f180904c;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.avito.android.lib.design.tab_layout.d(this, textView5));
                }
            } else {
                TextView textView6 = this.f180909h;
                if (textView6 != null || this.f180910i != null) {
                    g(textView6, this.f180910i);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f180894c)) {
                setContentDescription(iVar.f180894c);
            }
            if (iVar != null) {
                c cVar2 = iVar.f180897f;
                if (cVar2 == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                if (cVar2.getSelectedTabPosition() == iVar.f180895d) {
                    z12 = true;
                }
            }
            setSelected(z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.avito.android.lib.design.tab_layout.c$m] */
        public final void f(Context context) {
            c cVar = c.this;
            int i12 = cVar.f180863r;
            if (i12 != 0) {
                Drawable drawableA = C43852a.a(context, i12);
                this.f180911j = drawableA;
                if (drawableA != null && drawableA.isStateful()) {
                    this.f180911j.setState(getDrawableState());
                }
            } else {
                this.f180911j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (cVar.f180859n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = com.google.android.material.ripple.b.a(cVar.f180859n);
                boolean z12 = cVar.f180835D;
                if (z12) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z12 ? null : gradientDrawable2);
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            setBackground(gradientDrawable);
            invalidate();
        }

        @SuppressLint({"ResourceType"})
        public final void g(@P TextView textView, @P ImageView imageView) {
            i iVar = this.f180903b;
            CharSequence charSequence = iVar != null ? iVar.f180893b : null;
            if (imageView != null) {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                } else {
                    textView.setText(charSequence);
                    this.f180903b.getClass();
                    textView.setVisibility(0);
                    setVisibility(0);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB2 = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) O.b(8, getContext());
                if (c.this.f180833B) {
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
            i iVar2 = this.f180903b;
            K0.a(this, zIsEmpty ? iVar2 != null ? iVar2.f180894c : null : null);
        }

        @P
        public i getTab() {
            return this.f180903b;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.b bVar = this.f180907f;
            if (bVar != null && bVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f180907f.c()));
            }
            androidx.core.view.accessibility.f fVar = new androidx.core.view.accessibility.f(accessibilityNodeInfo);
            fVar.n(f.g.a(0, 1, this.f180903b.f180895d, 1, isSelected()));
            if (isSelected()) {
                fVar.l(false);
                fVar.h(f.a.f45004g);
            }
            fVar.r("Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            int size = View.MeasureSpec.getSize(i12);
            int mode = View.MeasureSpec.getMode(i12);
            c cVar = c.this;
            int tabMaxWidth = cVar.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i12 = View.MeasureSpec.makeMeasureSpec(cVar.f180864s, BeduinInputModel.MIN_TEXT_VERSION);
            }
            super.onMeasure(i12, i13);
            if (this.f180904c != null) {
                float f12 = cVar.f180861p;
                int i14 = this.f180912k;
                ImageView imageView = this.f180905d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f180904c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f12 = cVar.f180862q;
                    }
                } else {
                    i14 = 1;
                }
                float textSize = this.f180904c.getTextSize();
                int lineCount = this.f180904c.getLineCount();
                int maxLines = this.f180904c.getMaxLines();
                if (f12 != textSize || (maxLines >= 0 && i14 != maxLines)) {
                    if (cVar.f180832A == 1 && f12 > textSize && lineCount == 1) {
                        Layout layout = this.f180904c.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f12 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f180904c.setTextSize(0, f12);
                    this.f180904c.setMaxLines(i14);
                    super.onMeasure(i12, i13);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f180903b == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f180903b.b();
            return true;
        }

        @Override // android.view.View
        @SuppressLint({"ObsoleteSdkInt"})
        public void setSelected(boolean z12) {
            isSelected();
            super.setSelected(z12);
            TextView textView = this.f180904c;
            if (textView != null) {
                textView.setSelected(z12);
            }
            ImageView imageView = this.f180905d;
            if (imageView != null) {
                imageView.setSelected(z12);
            }
            View view = this.f180908g;
            if (view != null) {
                view.setSelected(z12);
            }
        }

        public void setTab(@P i iVar) {
            if (iVar != this.f180903b) {
                this.f180903b = iVar;
                e();
            }
        }
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @r
    private int getDefaultHeight() {
        ArrayList<i> arrayList = this.f180847b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12);
        }
        return this.f180851f;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f180850e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i12) {
        h hVar = this.f180850e;
        int childCount = hVar.getChildCount();
        if (i12 < childCount) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = hVar.getChildAt(i13);
                boolean z12 = true;
                childAt.setSelected(i13 == i12);
                if (i13 != i12) {
                    z12 = false;
                }
                childAt.setActivated(z12);
                i13++;
            }
        }
    }

    @Deprecated
    public final void a(@P InterfaceC5322c interfaceC5322c) {
        ArrayList<InterfaceC5322c> arrayList = this.f180837F;
        if (arrayList.contains(interfaceC5322c)) {
            return;
        }
        arrayList.add(interfaceC5322c);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(@N i iVar, int i12, boolean z12) {
        if (iVar.f180897f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        iVar.f180895d = i12;
        ArrayList<i> arrayList = this.f180847b;
        arrayList.add(i12, iVar);
        int size = arrayList.size();
        for (int i13 = i12 + 1; i13 < size; i13++) {
            arrayList.get(i13).f180895d = i13;
        }
        m mVar = iVar.f180898g;
        mVar.setSelected(false);
        mVar.setActivated(false);
        int i14 = iVar.f180895d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f180832A == 1 && this.f180869x == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f180850e.addView(mVar, i14, layoutParams);
        if (z12) {
            iVar.b();
        }
    }

    public final void c(View view) {
        if (!(view instanceof com.google.android.material.tabs.d)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        com.google.android.material.tabs.d dVar = (com.google.android.material.tabs.d) view;
        i iVarK = k();
        dVar.getClass();
        if (!TextUtils.isEmpty(dVar.getContentDescription())) {
            iVarK.f180894c = dVar.getContentDescription();
            m mVar = iVarK.f180898g;
            if (mVar != null) {
                mVar.e();
            }
        }
        ArrayList<i> arrayList = this.f180847b;
        b(iVarK, arrayList.size(), arrayList.isEmpty());
    }

    public final void d(int i12) {
        if (i12 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (isLaidOut()) {
                h hVar = this.f180850e;
                int childCount = hVar.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (hVar.getChildAt(i13).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iF2 = f(0.0f, i12);
                if (scrollX != iF2) {
                    i();
                    this.f180839H.setIntValues(scrollX, iF2);
                    this.f180839H.start();
                }
                ValueAnimator valueAnimator = hVar.f180883i;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hVar.f180883i.cancel();
                }
                hVar.c(i12, this.f180870y, true);
                return;
            }
        }
        s(i12, 0.0f, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r4 = this;
            int r0 = r4.f180832A
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r4.f180868w
            int r3 = r4.f180852g
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r3 = androidx.core.view.C22823h0.f45055a
            com.avito.android.lib.design.tab_layout.c$h r3 = r4.f180850e
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r4.f180832A
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L25
            if (r0 == r1) goto L25
            goto L3c
        L25:
            r3.setGravity(r2)
            goto L3c
        L29:
            int r0 = r4.f180869x
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
            r4.u(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_layout.c.e():void");
    }

    public final int f(float f12, int i12) {
        int i13 = this.f180832A;
        if (i13 != 0 && i13 != 2) {
            return 0;
        }
        h hVar = this.f180850e;
        View childAt = hVar.getChildAt(i12);
        int i14 = i12 + 1;
        View childAt2 = i14 < hVar.getChildCount() ? hVar.getChildAt(i14) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i15 = (int) ((width + width2) * 0.5f * f12);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        return getLayoutDirection() == 0 ? left + i15 : left - i15;
    }

    public h g() {
        return new h(getContext());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        i iVar = this.f180848c;
        if (iVar != null) {
            return iVar.f180895d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f180847b.size();
    }

    public int getTabGravity() {
        return this.f180869x;
    }

    @P
    public ColorStateList getTabIconTint() {
        return this.f180858m;
    }

    public int getTabIndicatorGravity() {
        return this.f180871z;
    }

    public int getTabMaxWidth() {
        return this.f180864s;
    }

    public int getTabMinWidth() {
        int i12 = this.f180865t;
        if (i12 != -1) {
            return i12;
        }
        int i13 = this.f180832A;
        if (i13 == 0 || i13 == 2) {
            return this.f180867v;
        }
        return 0;
    }

    @SuppressLint({"ResourceType"})
    public float getTabMinWidthMargin() {
        return O.b(56, getContext());
    }

    public int getTabMode() {
        return this.f180832A;
    }

    @P
    public ColorStateList getTabRippleColor() {
        return this.f180859n;
    }

    @P
    public Drawable getTabSelectedIndicator() {
        return this.f180860o;
    }

    @P
    public ColorStateList getTabTextColors() {
        return this.f180857l;
    }

    public i h() {
        i iVar = (i) f180831Q.b();
        return iVar == null ? new i() : iVar;
    }

    public final void i() {
        if (this.f180839H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f180839H = valueAnimator;
            valueAnimator.setInterpolator(C43707b.f413880b);
            this.f180839H.setDuration(this.f180870y);
            this.f180839H.addUpdateListener(new a());
        }
    }

    @P
    public final i j(int i12) {
        if (i12 < 0 || i12 >= getTabCount()) {
            return null;
        }
        return this.f180847b.get(i12);
    }

    @N
    public i k() {
        i iVarH = h();
        iVarH.f180897f = this;
        y.b bVar = this.f180846O;
        m mVar = bVar != null ? (m) bVar.b() : null;
        if (mVar == null) {
            mVar = new m(getContext());
        }
        mVar.setTab(iVarH);
        mVar.setFocusable(true);
        mVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVarH.f180894c)) {
            mVar.setContentDescription(iVarH.f180893b);
        } else {
            mVar.setContentDescription(iVarH.f180894c);
        }
        iVarH.f180898g = mVar;
        return iVarH;
    }

    public final void l() {
        int currentItem;
        m();
        androidx.viewpager.widget.a aVar = this.f180841J;
        if (aVar != null) {
            int iC2 = aVar.c();
            for (int i12 = 0; i12 < iC2; i12++) {
                i iVarK = k();
                iVarK.c(this.f180841J.e(i12));
                b(iVarK, this.f180847b.size(), false);
            }
            ViewPager viewPager = this.f180840I;
            if (viewPager == null || iC2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            q(j(currentItem), true);
        }
    }

    public final void m() {
        for (int childCount = this.f180850e.getChildCount() - 1; childCount >= 0; childCount--) {
            p(childCount);
        }
        Iterator<i> it = this.f180847b.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.a();
            f180831Q.a(next);
        }
        this.f180848c = null;
    }

    @Deprecated
    public final void n(@P InterfaceC5322c interfaceC5322c) {
        this.f180837F.remove(interfaceC5322c);
    }

    public final void o(int i12) {
        i iVar = this.f180848c;
        int i13 = iVar != null ? iVar.f180895d : 0;
        p(i12);
        ArrayList<i> arrayList = this.f180847b;
        i iVarRemove = arrayList.remove(i12);
        if (iVarRemove != null) {
            iVarRemove.a();
            f180831Q.a(iVarRemove);
        }
        int size = arrayList.size();
        for (int i14 = i12; i14 < size; i14++) {
            arrayList.get(i14).f180895d = i14;
        }
        if (i13 == i12) {
            q(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, i12 - 1)), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
        if (this.f180840I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                t((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f180845N) {
            setupWithViewPager(null);
            this.f180845N = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(@N Canvas canvas) {
        m mVar;
        Drawable drawable;
        int i12 = 0;
        while (true) {
            h hVar = this.f180850e;
            if (i12 >= hVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if ((childAt instanceof m) && (drawable = (mVar = (m) childAt).f180911j) != null) {
                drawable.setBounds(mVar.getLeft(), mVar.getTop(), mVar.getRight(), mVar.getBottom());
                mVar.f180911j.draw(canvas);
            }
            i12++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(1, getTabCount(), 1));
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
            if (r1 == 0) goto L59
            int r1 = r6.f180866u
            if (r1 <= 0) goto L50
            goto L57
        L50:
            float r0 = (float) r0
            float r1 = r6.getTabMinWidthMargin()
            float r0 = r0 - r1
            int r1 = (int) r0
        L57:
            r6.f180864s = r1
        L59:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La3
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f180832A
            if (r0 == 0) goto L7b
            if (r0 == r5) goto L70
            r1 = 2
            if (r0 == r1) goto L7b
            goto La3
        L70:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La3
            goto L85
        L7b:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La3
        L85:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_layout.c.onMeasure(int, int):void");
    }

    public final void p(int i12) {
        h hVar = this.f180850e;
        m mVar = (m) hVar.getChildAt(i12);
        hVar.removeViewAt(i12);
        if (mVar != null) {
            mVar.setTab(null);
            mVar.setSelected(false);
            this.f180846O.a(mVar);
        }
        requestLayout();
    }

    public final void q(@P i iVar, boolean z12) {
        i iVar2 = this.f180848c;
        ArrayList<InterfaceC5322c> arrayList = this.f180837F;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).b();
                }
                d(iVar.f180895d);
                return;
            }
            return;
        }
        int i12 = iVar != null ? iVar.f180895d : -1;
        if (z12) {
            if ((iVar2 == null || iVar2.f180895d == -1) && i12 != -1) {
                s(i12, 0.0f, true, true);
            } else {
                d(i12);
            }
            if (i12 != -1) {
                setSelectedTabView(i12);
            }
        }
        this.f180848c = iVar;
        if (iVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).a(iVar2);
            }
        }
        if (iVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).c(iVar);
            }
        }
    }

    public final void r(@P androidx.viewpager.widget.a aVar, boolean z12) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f180841J;
        if (aVar2 != null && (dataSetObserver = this.f180842K) != null) {
            aVar2.n(dataSetObserver);
        }
        this.f180841J = aVar;
        if (z12 && aVar != null) {
            if (this.f180842K == null) {
                this.f180842K = new g();
            }
            aVar.i(this.f180842K);
        }
        l();
    }

    public final void s(int i12, float f12, boolean z12, boolean z13) {
        int iRound = Math.round(i12 + f12);
        if (iRound >= 0) {
            h hVar = this.f180850e;
            if (iRound >= hVar.getChildCount()) {
                return;
            }
            if (z13) {
                ValueAnimator valueAnimator = hVar.f180883i;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hVar.f180883i.cancel();
                }
                hVar.f180879e = i12;
                hVar.f180880f = f12;
                hVar.b();
            }
            ValueAnimator valueAnimator2 = this.f180839H;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f180839H.cancel();
            }
            scrollTo(f(f12, i12), 0);
            if (z12) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        com.google.android.material.shape.m.b(this, f12);
    }

    public void setInlineLabel(boolean z12) {
        if (this.f180833B == z12) {
            return;
        }
        this.f180833B = z12;
        int i12 = 0;
        while (true) {
            h hVar = this.f180850e;
            if (i12 >= hVar.getChildCount()) {
                e();
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof m) {
                m mVar = (m) childAt;
                mVar.setOrientation(!c.this.f180833B ? 1 : 0);
                TextView textView = mVar.f180909h;
                if (textView == null && mVar.f180910i == null) {
                    mVar.g(mVar.f180904c, mVar.f180905d);
                } else {
                    mVar.g(textView, mVar.f180910i);
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
        setOnTabSelectedListener((InterfaceC5322c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        i();
        this.f180839H.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@P Drawable drawable) {
        if (this.f180860o != drawable) {
            this.f180860o = drawable;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f180850e.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(@InterfaceC42156l int i12) {
        this.f180850e.setSelectedIndicatorColor(i12);
    }

    public void setSelectedTabIndicatorGravity(int i12) {
        if (this.f180871z != i12) {
            this.f180871z = i12;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f180850e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i12) {
        this.f180850e.setSelectedIndicatorHeight(i12);
    }

    public void setTabGravity(int i12) {
        if (this.f180869x != i12) {
            this.f180869x = i12;
            e();
        }
    }

    public void setTabIconTint(@P ColorStateList colorStateList) {
        if (this.f180858m != colorStateList) {
            this.f180858m = colorStateList;
            ArrayList<i> arrayList = this.f180847b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                m mVar = arrayList.get(i12).f180898g;
                if (mVar != null) {
                    mVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(@InterfaceC42158n int i12) {
        setTabIconTint(androidx.core.content.d.getColorStateList(getContext(), i12));
    }

    public void setTabIndicatorFullWidth(boolean z12) {
        this.f180834C = z12;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        this.f180850e.postInvalidateOnAnimation();
    }

    public void setTabMode(int i12) {
        if (i12 != this.f180832A) {
            this.f180832A = i12;
            e();
        }
    }

    public void setTabRippleColor(@P ColorStateList colorStateList) {
        if (this.f180859n == colorStateList) {
            return;
        }
        this.f180859n = colorStateList;
        int i12 = 0;
        while (true) {
            h hVar = this.f180850e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof m) {
                Context context = getContext();
                int i13 = m.f180902m;
                ((m) childAt).f(context);
            }
            i12++;
        }
    }

    public void setTabRippleColorResource(@InterfaceC42158n int i12) {
        setTabRippleColor(androidx.core.content.d.getColorStateList(getContext(), i12));
    }

    public void setTabTextColors(@P ColorStateList colorStateList) {
        if (this.f180857l != colorStateList) {
            this.f180857l = colorStateList;
            ArrayList<i> arrayList = this.f180847b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                m mVar = arrayList.get(i12).f180898g;
                if (mVar != null) {
                    mVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@P androidx.viewpager.widget.a aVar) {
        r(aVar, false);
    }

    public void setUnboundedRipple(boolean z12) {
        if (this.f180835D == z12) {
            return;
        }
        this.f180835D = z12;
        int i12 = 0;
        while (true) {
            h hVar = this.f180850e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            if (childAt instanceof m) {
                Context context = getContext();
                int i13 = m.f180902m;
                ((m) childAt).f(context);
            }
            i12++;
        }
    }

    public void setUnboundedRippleResource(@InterfaceC42152h int i12) {
        setUnboundedRipple(getResources().getBoolean(i12));
    }

    public void setupWithViewPager(@P ViewPager viewPager) {
        t(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(@P ViewPager viewPager, boolean z12) {
        ArrayList arrayList;
        ViewPager viewPager2 = this.f180840I;
        if (viewPager2 != null) {
            l lVar = this.f180843L;
            if (lVar != null) {
                viewPager2.u(lVar);
            }
            b bVar = this.f180844M;
            if (bVar != null && (arrayList = this.f180840I.f55002U) != null) {
                arrayList.remove(bVar);
            }
        }
        InterfaceC5322c interfaceC5322c = this.f180838G;
        if (interfaceC5322c != null) {
            n(interfaceC5322c);
            this.f180838G = null;
        }
        if (viewPager != null) {
            this.f180840I = viewPager;
            if (this.f180843L == null) {
                this.f180843L = new l(this);
            }
            l lVar2 = this.f180843L;
            lVar2.f180901d = 0;
            lVar2.f180900c = 0;
            viewPager.c(lVar2);
            n nVar = new n(viewPager);
            this.f180838G = nVar;
            a(nVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                r(adapter, true);
            }
            if (this.f180844M == null) {
                this.f180844M = new b();
            }
            b bVar2 = this.f180844M;
            bVar2.f180873b = true;
            viewPager.b(bVar2);
            s(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f180840I = null;
            r(null, false);
        }
        this.f180845N = z12;
    }

    public final void u(boolean z12) {
        int i12 = 0;
        while (true) {
            h hVar = this.f180850e;
            if (i12 >= hVar.getChildCount()) {
                return;
            }
            View childAt = hVar.getChildAt(i12);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f180832A == 1 && this.f180869x == 0) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@N Context context, @P AttributeSet attributeSet, int i12) throws Resources.NotFoundException {
        int i13 = f180830P;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f180847b = new ArrayList<>();
        this.f180849d = new RectF();
        this.f180864s = Integer.MAX_VALUE;
        this.f180837F = new ArrayList<>();
        this.f180846O = new y.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVarG = g();
        this.f180850e = hVarG;
        super.addView(hVarG, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = G.d(context2, attributeSet, R.styleable.TabLayout, i12, i13, R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
            kVar.n(ColorStateList.valueOf(colorDrawable.getColor()));
            kVar.j(context2);
            kVar.m(C22823h0.l(this));
            setBackground(kVar);
        }
        hVarG.setSelectedIndicatorHeight(typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
        hVarG.setSelectedIndicatorColor(typedArrayD.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(com.google.android.material.resources.c.d(typedArrayD, context2, R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.f180855j = dimensionPixelSize;
        this.f180854i = dimensionPixelSize;
        this.f180853h = dimensionPixelSize;
        this.f180852g = dimensionPixelSize;
        this.f180852g = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f180853h = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.f180854i = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.f180855j = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, dimensionPixelSize);
        int resourceId = typedArrayD.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        this.f180856k = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C43521a.m.f413375x);
        try {
            this.f180861p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f180857l = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context2, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(R.styleable.TabLayout_tabTextColor)) {
                this.f180857l = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f180857l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayD.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0), this.f180857l.getDefaultColor()});
            }
            this.f180858m = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabIconTint);
            O.g(typedArrayD.getInt(R.styleable.TabLayout_tabIconTintMode, -1), null);
            this.f180859n = com.google.android.material.resources.c.b(typedArrayD, context2, R.styleable.TabLayout_tabRippleColor);
            this.f180870y = typedArrayD.getInt(R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f180865t = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
            this.f180866u = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
            this.f180863r = typedArrayD.getResourceId(R.styleable.TabLayout_tabBackground, 0);
            this.f180868w = typedArrayD.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
            this.f180832A = typedArrayD.getInt(R.styleable.TabLayout_tabMode, 1);
            this.f180869x = typedArrayD.getInt(R.styleable.TabLayout_tabGravity, 0);
            this.f180833B = typedArrayD.getBoolean(R.styleable.TabLayout_tabInlineLabel, false);
            this.f180835D = typedArrayD.getBoolean(R.styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.f180862q = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f180867v = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
            TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, d.n.f178963d0, i12, 0);
            try {
                this.f180851f = typedArrayObtainStyledAttributes2.getInt(0, 48);
            } finally {
                typedArrayObtainStyledAttributes2.recycle();
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
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
    public void setOnTabSelectedListener(@P InterfaceC5322c interfaceC5322c) {
        InterfaceC5322c interfaceC5322c2 = this.f180836E;
        if (interfaceC5322c2 != null) {
            n(interfaceC5322c2);
        }
        this.f180836E = interfaceC5322c;
        if (interfaceC5322c != null) {
            a(interfaceC5322c);
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

    /* compiled from: TabLayout.java */
    public static class n implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f180914a;

        public n(ViewPager viewPager) {
            this.f180914a = viewPager;
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@N i iVar) {
            this.f180914a.setCurrentItem(iVar.f180895d);
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(i iVar) {
        }
    }
}
