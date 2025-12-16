package com.yandex.div.internal.widget.tabs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.util.y;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.y;
import j.InterfaceC42156l;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import q21.e;

/* loaded from: classes7.dex */
public class BaseIndicatorTabLayout extends HorizontalScrollView {

    /* renamed from: F, reason: collision with root package name */
    public static final androidx.interpolator.view.animation.b f370383F = new androidx.interpolator.view.animation.b();

    /* renamed from: G, reason: collision with root package name */
    public static final y.c f370384G = new y.c(16);

    /* renamed from: A, reason: collision with root package name */
    public ViewPager f370385A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.viewpager.widget.a f370386B;

    /* renamed from: C, reason: collision with root package name */
    public DataSetObserver f370387C;

    /* renamed from: D, reason: collision with root package name */
    public g f370388D;

    /* renamed from: E, reason: collision with root package name */
    @N
    public final y.b f370389E;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<f> f370390b;

    /* renamed from: c, reason: collision with root package name */
    public f f370391c;

    /* renamed from: d, reason: collision with root package name */
    public final d f370392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f370393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f370394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f370395g;

    /* renamed from: h, reason: collision with root package name */
    public final int f370396h;

    /* renamed from: i, reason: collision with root package name */
    public long f370397i;

    /* renamed from: j, reason: collision with root package name */
    public final int f370398j;

    /* renamed from: k, reason: collision with root package name */
    public com.yandex.div.core.font.a f370399k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f370400l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f370401m;

    /* renamed from: n, reason: collision with root package name */
    public int f370402n;

    /* renamed from: o, reason: collision with root package name */
    public final int f370403o;

    /* renamed from: p, reason: collision with root package name */
    public final int f370404p;

    /* renamed from: q, reason: collision with root package name */
    public final int f370405q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f370406r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f370407s;

    /* renamed from: t, reason: collision with root package name */
    public final int f370408t;

    /* renamed from: u, reason: collision with root package name */
    public final com.yandex.div.internal.util.l f370409u;

    /* renamed from: v, reason: collision with root package name */
    public final int f370410v;

    /* renamed from: w, reason: collision with root package name */
    public final int f370411w;

    /* renamed from: x, reason: collision with root package name */
    public int f370412x;

    /* renamed from: y, reason: collision with root package name */
    public c f370413y;

    /* renamed from: z, reason: collision with root package name */
    public ValueAnimator f370414z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationType {

        /* renamed from: b, reason: collision with root package name */
        public static final AnimationType f370415b;

        /* renamed from: c, reason: collision with root package name */
        public static final AnimationType f370416c;

        /* renamed from: d, reason: collision with root package name */
        public static final AnimationType f370417d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AnimationType[] f370418e;

        static {
            AnimationType animationType = new AnimationType("SLIDE", 0);
            f370415b = animationType;
            AnimationType animationType2 = new AnimationType("FADE", 1);
            f370416c = animationType2;
            AnimationType animationType3 = new AnimationType("NONE", 2);
            f370417d = animationType3;
            f370418e = new AnimationType[]{animationType, animationType2, animationType3};
        }

        public AnimationType() {
            throw null;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) f370418e.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f370419a;

        static {
            int[] iArr = new int[AnimationType.values().length];
            f370419a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f370419a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a(f fVar);

        void b(f fVar);
    }

    public static class d extends LinearLayout {

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ int f370420w = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f370421b;

        /* renamed from: c, reason: collision with root package name */
        public int f370422c;

        /* renamed from: d, reason: collision with root package name */
        public int f370423d;

        /* renamed from: e, reason: collision with root package name */
        public int f370424e;

        /* renamed from: f, reason: collision with root package name */
        public float f370425f;

        /* renamed from: g, reason: collision with root package name */
        public int f370426g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f370427h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f370428i;

        /* renamed from: j, reason: collision with root package name */
        public float[] f370429j;

        /* renamed from: k, reason: collision with root package name */
        public int f370430k;

        /* renamed from: l, reason: collision with root package name */
        public int f370431l;

        /* renamed from: m, reason: collision with root package name */
        public int f370432m;

        /* renamed from: n, reason: collision with root package name */
        public ValueAnimator f370433n;

        /* renamed from: o, reason: collision with root package name */
        public final Paint f370434o;

        /* renamed from: p, reason: collision with root package name */
        public final Path f370435p;

        /* renamed from: q, reason: collision with root package name */
        public final RectF f370436q;

        /* renamed from: r, reason: collision with root package name */
        public final int f370437r;

        /* renamed from: s, reason: collision with root package name */
        public final int f370438s;

        /* renamed from: t, reason: collision with root package name */
        public float f370439t;

        /* renamed from: u, reason: collision with root package name */
        public int f370440u;

        /* renamed from: v, reason: collision with root package name */
        public AnimationType f370441v;

        public d(Context context, int i12, int i13) {
            super(context);
            this.f370422c = -1;
            this.f370423d = -1;
            this.f370424e = -1;
            this.f370426g = 0;
            this.f370430k = -1;
            this.f370431l = -1;
            this.f370439t = 1.0f;
            this.f370440u = -1;
            this.f370441v = AnimationType.f370415b;
            setId(R.id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.f370432m = childCount;
            c(childCount);
            Paint paint = new Paint();
            this.f370434o = paint;
            paint.setAntiAlias(true);
            this.f370436q = new RectF();
            this.f370437r = i12;
            this.f370438s = i13;
            this.f370435p = new Path();
            this.f370429j = new float[8];
        }

        public final void a(int i12, long j12) {
            ValueAnimator valueAnimator = this.f370433n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f370433n.cancel();
                j12 = Math.round((1.0f - this.f370433n.getAnimatedFraction()) * this.f370433n.getDuration());
            }
            View childAt = getChildAt(i12);
            if (childAt == null) {
                e();
                return;
            }
            int iOrdinal = this.f370441v.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    d(0.0f, i12);
                    return;
                }
                if (i12 != this.f370424e) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(BaseIndicatorTabLayout.f370383F);
                    valueAnimatorOfFloat.setDuration(j12);
                    valueAnimatorOfFloat.addUpdateListener(new com.yandex.div.internal.widget.tabs.h(this, 0));
                    valueAnimatorOfFloat.addListener(new j(this));
                    this.f370440u = i12;
                    this.f370433n = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    return;
                }
                return;
            }
            final int i13 = this.f370430k;
            final int i14 = this.f370431l;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (i13 == left && i14 == right) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(BaseIndicatorTabLayout.f370383F);
            valueAnimatorOfFloat2.setDuration(j12);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i15 = BaseIndicatorTabLayout.d.f370420w;
                    BaseIndicatorTabLayout.d dVar = this.f370486a;
                    dVar.getClass();
                    float animatedFraction = valueAnimator2.getAnimatedFraction();
                    int i16 = left;
                    int iRound = Math.round((i16 - r2) * animatedFraction) + i13;
                    int i17 = right;
                    int iRound2 = Math.round(animatedFraction * (i17 - r3)) + i14;
                    if (iRound != dVar.f370430k || iRound2 != dVar.f370431l) {
                        dVar.f370430k = iRound;
                        dVar.f370431l = iRound2;
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        dVar.postInvalidateOnAnimation();
                    }
                    WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                    dVar.postInvalidateOnAnimation();
                }
            });
            valueAnimatorOfFloat2.addListener(new i(this));
            this.f370440u = i12;
            this.f370433n = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.start();
        }

        @Override // android.view.ViewGroup
        public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i12 < 0) {
                i12 = childCount;
            }
            if (i12 != 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = this.f370426g;
                super.addView(view, i12, marginLayoutParams);
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams2.leftMargin = this.f370426g;
                updateViewLayout(childAt, marginLayoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams3.leftMargin = 0;
            super.addView(view, i12, marginLayoutParams3);
        }

        public final void b(Canvas canvas, int i12, int i13, float f12, int i14, float f13) {
            if (i12 < 0 || i13 <= i12) {
                return;
            }
            RectF rectF = this.f370436q;
            rectF.set(i12, this.f370437r, i13, f12 - this.f370438s);
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float[] fArr = new float[8];
            for (int i15 = 0; i15 < 8; i15++) {
                float f14 = this.f370429j[i15];
                float fMin = 0.0f;
                if (fHeight > 0.0f && fWidth > 0.0f) {
                    fMin = Math.min(fHeight, fWidth) / 2.0f;
                    if (f14 != -1.0f) {
                        fMin = Math.min(f14, fMin);
                    }
                }
                fArr[i15] = fMin;
            }
            Path path = this.f370435p;
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            path.close();
            Paint paint = this.f370434o;
            paint.setColor(i14);
            paint.setAlpha(Math.round(paint.getAlpha() * f13));
            canvas.drawPath(path, paint);
        }

        public final void c(int i12) {
            this.f370432m = i12;
            this.f370427h = new int[i12];
            this.f370428i = new int[i12];
            for (int i13 = 0; i13 < this.f370432m; i13++) {
                this.f370427h[i13] = -1;
                this.f370428i[i13] = -1;
            }
        }

        public final void d(float f12, int i12) {
            ValueAnimator valueAnimator = this.f370433n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f370433n.cancel();
            }
            this.f370424e = i12;
            this.f370425f = f12;
            e();
            float f13 = 1.0f - this.f370425f;
            if (f13 != this.f370439t) {
                this.f370439t = f13;
                int i13 = this.f370424e + 1;
                if (i13 >= this.f370432m) {
                    i13 = -1;
                }
                this.f370440u = i13;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                postInvalidateOnAnimation();
            }
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            float height = getHeight();
            if (this.f370423d != -1) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    b(canvas, this.f370427h[i12], this.f370428i[i12], height, this.f370423d, 1.0f);
                }
            }
            if (this.f370422c != -1) {
                int iOrdinal = this.f370441v.ordinal();
                if (iOrdinal == 0) {
                    b(canvas, this.f370430k, this.f370431l, height, this.f370422c, 1.0f);
                } else if (iOrdinal != 1) {
                    int[] iArr = this.f370427h;
                    int i13 = this.f370424e;
                    b(canvas, iArr[i13], this.f370428i[i13], height, this.f370422c, 1.0f);
                } else {
                    int[] iArr2 = this.f370427h;
                    int i14 = this.f370424e;
                    b(canvas, iArr2[i14], this.f370428i[i14], height, this.f370422c, this.f370439t);
                    int i15 = this.f370440u;
                    if (i15 != -1) {
                        b(canvas, this.f370427h[i15], this.f370428i[i15], height, this.f370422c, 1.0f - this.f370439t);
                    }
                }
            }
            super.draw(canvas);
        }

        public final void e() {
            int i12;
            int right;
            int i13;
            int i14;
            int childCount = getChildCount();
            if (childCount != this.f370432m) {
                c(childCount);
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt == null || childAt.getWidth() <= 0) {
                    i12 = -1;
                    right = -1;
                    i13 = -1;
                    i14 = -1;
                } else {
                    int left = childAt.getLeft();
                    right = childAt.getRight();
                    if (this.f370441v != AnimationType.f370415b || i15 != this.f370424e || this.f370425f <= 0.0f || i15 >= childCount - 1) {
                        i13 = left;
                        i14 = i13;
                        i12 = right;
                    } else {
                        View childAt2 = getChildAt(i15 + 1);
                        float left2 = this.f370425f * childAt2.getLeft();
                        float f12 = this.f370425f;
                        i14 = (int) (((1.0f - f12) * left) + left2);
                        int right2 = (int) (((1.0f - this.f370425f) * right) + (f12 * childAt2.getRight()));
                        i13 = left;
                        i12 = right2;
                    }
                }
                int[] iArr = this.f370427h;
                int i16 = iArr[i15];
                int[] iArr2 = this.f370428i;
                int i17 = iArr2[i15];
                if (i13 != i16 || right != i17) {
                    iArr[i15] = i13;
                    iArr2[i15] = right;
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    postInvalidateOnAnimation();
                }
                if (i15 == this.f370424e && (i14 != this.f370430k || i12 != this.f370431l)) {
                    this.f370430k = i14;
                    this.f370431l = i12;
                    WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                    postInvalidateOnAnimation();
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
            super.onLayout(z12, i12, i13, i14, i15);
            e();
            ValueAnimator valueAnimator = this.f370433n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.f370433n.cancel();
            a(this.f370440u, Math.round((1.0f - this.f370433n.getAnimatedFraction()) * this.f370433n.getDuration()));
        }
    }

    public class e extends DataSetObserver {
        public e(a aVar) {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            androidx.interpolator.view.animation.b bVar = BaseIndicatorTabLayout.f370383F;
            BaseIndicatorTabLayout.this.n();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            androidx.interpolator.view.animation.b bVar = BaseIndicatorTabLayout.f370383F;
            BaseIndicatorTabLayout.this.n();
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        @P
        public CharSequence f370443a;

        /* renamed from: b, reason: collision with root package name */
        public int f370444b;

        /* renamed from: c, reason: collision with root package name */
        public BaseIndicatorTabLayout f370445c;

        /* renamed from: d, reason: collision with root package name */
        public y f370446d;

        public /* synthetic */ f(a aVar) {
            this();
        }

        public f() {
            this.f370444b = -1;
        }
    }

    public static class g implements ViewPager.i {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<BaseIndicatorTabLayout> f370447b;

        /* renamed from: c, reason: collision with root package name */
        public int f370448c;

        /* renamed from: d, reason: collision with root package name */
        public int f370449d;

        public g(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.f370447b = new WeakReference<>(baseIndicatorTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f370447b.get();
            if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i12) {
                return;
            }
            int i13 = this.f370449d;
            baseIndicatorTabLayout.p(baseIndicatorTabLayout.f370390b.get(i12), i13 == 0 || (i13 == 2 && this.f370448c == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
            this.f370448c = this.f370449d;
            this.f370449d = i12;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.f370447b.get();
            if (baseIndicatorTabLayout != null) {
                if (this.f370449d != 2 || this.f370448c == 1) {
                    androidx.interpolator.view.animation.b bVar = BaseIndicatorTabLayout.f370383F;
                    baseIndicatorTabLayout.r(f12, i12);
                }
            }
        }
    }

    @SuppressLint({"PrivateResource"})
    public BaseIndicatorTabLayout(Context context) throws Resources.NotFoundException {
        super(context, null, R.attr.divTabIndicatorLayoutStyle);
        this.f370390b = new ArrayList<>();
        this.f370397i = 300L;
        this.f370399k = com.yandex.div.core.font.a.f367537b;
        this.f370402n = Integer.MAX_VALUE;
        this.f370409u = new com.yandex.div.internal.util.l(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.f370389E = new y.b(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, e.m.f429000e, R.attr.divTabIndicatorLayoutStyle, R.style.Widget_Div_BaseIndicatorTabLayout);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, e.m.f428997b, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.f370401m = typedArrayObtainStyledAttributes2.getBoolean(6, false);
        this.f370411w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f370406r = typedArrayObtainStyledAttributes2.getBoolean(1, true);
        this.f370407s = typedArrayObtainStyledAttributes2.getBoolean(5, false);
        this.f370408t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        d dVar = new d(context, dimensionPixelSize, dimensionPixelSize2);
        this.f370392d = dVar;
        super.addView(dVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (dVar.f370421b != dimensionPixelSize3) {
            dVar.f370421b = dimensionPixelSize3;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(8, 0);
        if (dVar.f370422c != color) {
            if ((color >> 24) == 0) {
                dVar.f370422c = -1;
            } else {
                dVar.f370422c = color;
            }
            WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(0, 0);
        if (dVar.f370423d != color2) {
            if ((color2 >> 24) == 0) {
                dVar.f370423d = -1;
            } else {
                dVar.f370423d = color2;
            }
            WeakHashMap<View, A0> weakHashMap3 = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.f370396h = dimensionPixelSize4;
        this.f370395g = dimensionPixelSize4;
        this.f370394f = dimensionPixelSize4;
        this.f370393e = dimensionPixelSize4;
        this.f370393e = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize4);
        this.f370394f = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize4);
        this.f370395g = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize4);
        this.f370396h = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(24, R.style.TextAppearance_Div_Tab);
        this.f370398j = resourceId;
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, e.m.f429001f);
        try {
            this.f370400l = typedArrayObtainStyledAttributes3.getColorStateList(3);
            typedArrayObtainStyledAttributes3.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(25)) {
                this.f370400l = typedArrayObtainStyledAttributes.getColorStateList(25);
            }
            if (typedArrayObtainStyledAttributes.hasValue(23)) {
                this.f370400l = k(this.f370400l.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(23, 0));
            }
            this.f370403o = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.f370404p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f370410v = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f370412x = typedArrayObtainStyledAttributes.getInt(15, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.f370405q = getResources().getDimensionPixelSize(R.dimen.tab_scrollable_min_width);
            i();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes3.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.f370402n;
    }

    private int getTabMinWidth() {
        int i12 = this.f370403o;
        if (i12 != -1) {
            return i12;
        }
        if (this.f370412x == 0) {
            return this.f370405q;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f370392d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList k(int i12, int i13) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i13, i12});
    }

    private void setSelectedTabView(int i12) {
        d dVar = this.f370392d;
        int childCount = dVar.getChildCount();
        if (i12 >= childCount || dVar.getChildAt(i12).isSelected()) {
            return;
        }
        int i13 = 0;
        while (i13 < childCount) {
            dVar.getChildAt(i13).setSelected(i13 == i12);
            i13++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        g(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f370409u.a(motionEvent);
        return zDispatchTouchEvent;
    }

    public final void f(@N f fVar, boolean z12) {
        if (fVar.f370445c != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        y yVar = fVar.f370446d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
        this.f370392d.addView(yVar, layoutParams);
        if (z12) {
            yVar.setSelected(true);
        }
        ArrayList<f> arrayList = this.f370390b;
        int size = arrayList.size();
        fVar.f370444b = size;
        arrayList.add(size, fVar);
        int size2 = arrayList.size();
        for (int i12 = size + 1; i12 < size2; i12++) {
            arrayList.get(i12).f370444b = i12;
        }
        if (z12) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = fVar.f370445c;
            if (baseIndicatorTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            baseIndicatorTabLayout.p(fVar, true);
        }
    }

    public final void g(View view) {
        if (!(view instanceof p)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        f fVarM = m();
        ((p) view).getClass();
        f(fVarM, this.f370390b.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @N
    public g getPageChangeListener() {
        if (this.f370388D == null) {
            this.f370388D = new g(this);
        }
        return this.f370388D;
    }

    public int getSelectedTabPosition() {
        f fVar = this.f370391c;
        if (fVar != null) {
            return fVar.f370444b;
        }
        return -1;
    }

    @InterfaceC42156l
    public int getSelectedTabTextColor() {
        return this.f370400l.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public int getTabCount() {
        return this.f370390b.size();
    }

    public int getTabMode() {
        return this.f370412x;
    }

    @P
    public ColorStateList getTabTextColors() {
        return this.f370400l;
    }

    public final void h(int i12) {
        if (i12 == -1) {
            return;
        }
        if (getWindowToken() != null && com.yandex.div.core.util.q.b(this)) {
            d dVar = this.f370392d;
            int childCount = dVar.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (dVar.getChildAt(i13).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iJ2 = j(0.0f, i12);
            if (scrollX != iJ2) {
                if (this.f370414z == null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(new int[0]);
                    this.f370414z = valueAnimatorOfInt;
                    valueAnimatorOfInt.setInterpolator(f370383F);
                    this.f370414z.setDuration(this.f370397i);
                    this.f370414z.addUpdateListener(new com.yandex.div.internal.widget.tabs.h(this, 1));
                }
                this.f370414z.setIntValues(scrollX, iJ2);
                this.f370414z.start();
            }
            dVar.a(i12, this.f370397i);
            return;
        }
        r(0.0f, i12);
    }

    public final void i() {
        int iMax;
        int iMax2;
        if (this.f370412x == 0) {
            iMax = Math.max(0, this.f370410v - this.f370393e);
            iMax2 = Math.max(0, this.f370411w - this.f370395g);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        d dVar = this.f370392d;
        dVar.setPaddingRelative(iMax, 0, iMax2, 0);
        if (this.f370412x != 1) {
            dVar.setGravity(8388611);
        } else {
            dVar.setGravity(1);
        }
        for (int i12 = 0; i12 < dVar.getChildCount(); i12++) {
            View childAt = dVar.getChildAt(i12);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            childAt.requestLayout();
        }
    }

    public final int j(float f12, int i12) {
        d dVar;
        View childAt;
        int width;
        int width2;
        if (this.f370412x != 0 || (childAt = (dVar = this.f370392d).getChildAt(i12)) == null) {
            return 0;
        }
        int width3 = childAt.getWidth();
        if (this.f370407s) {
            width = childAt.getLeft();
            width2 = this.f370408t;
        } else {
            int i13 = i12 + 1;
            width = (childAt.getWidth() / 2) + childAt.getLeft() + ((int) ((width3 + ((i13 < dVar.getChildCount() ? dVar.getChildAt(i13) : null) != null ? r7.getWidth() : 0)) * f12 * 0.5f));
            width2 = getWidth() / 2;
        }
        return width - width2;
    }

    public y l(@N Context context) {
        return new y(context);
    }

    @N
    public final f m() {
        f fVar = (f) f370384G.b();
        if (fVar == null) {
            fVar = new f(null);
        }
        fVar.f370445c = this;
        y yVarL = (y) this.f370389E.b();
        if (yVarL == null) {
            yVarL = l(getContext());
            int i12 = this.f370395g;
            int i13 = this.f370396h;
            int i14 = this.f370393e;
            int i15 = this.f370394f;
            yVarL.getClass();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            yVarL.setPaddingRelative(i14, i15, i12, i13);
            yVarL.f370522b = this.f370399k;
            yVarL.f370523c = this.f370398j;
            if (!yVarL.isSelected()) {
                yVarL.setTextAppearance(yVarL.getContext(), yVarL.f370523c);
            }
            yVarL.setTextColorList(this.f370400l);
            yVarL.setBoldTextOnSelection(this.f370401m);
            yVarL.setEllipsizeEnabled(this.f370406r);
            yVarL.setMaxWidthProvider(new com.yandex.div.internal.widget.tabs.f(this));
            yVarL.setOnUpdateListener(new com.yandex.div.internal.widget.tabs.f(this));
        }
        yVarL.setTab(fVar);
        yVarL.setFocusable(true);
        yVarL.setMinimumWidth(getTabMinWidth());
        fVar.f370446d = yVarL;
        return fVar;
    }

    public final void n() {
        int currentItem;
        o();
        androidx.viewpager.widget.a aVar = this.f370386B;
        if (aVar == null) {
            o();
            return;
        }
        int iC2 = aVar.c();
        for (int i12 = 0; i12 < iC2; i12++) {
            f fVarM = m();
            fVarM.f370443a = this.f370386B.e(i12);
            y yVar = fVarM.f370446d;
            if (yVar != null) {
                f fVar = yVar.f370528h;
                yVar.setText(fVar == null ? null : fVar.f370443a);
                y.b bVar = yVar.f370527g;
                if (bVar != null) {
                    bVar.a();
                }
            }
            f(fVarM, false);
        }
        ViewPager viewPager = this.f370385A;
        if (viewPager == null || iC2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        p(this.f370390b.get(currentItem), true);
    }

    public final void o() {
        d dVar = this.f370392d;
        int childCount = dVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            y yVar = (y) dVar.getChildAt(childCount);
            dVar.removeViewAt(childCount);
            if (yVar != null) {
                yVar.setTab(null);
                yVar.setSelected(false);
                this.f370389E.a(yVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.f370390b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.f370445c = null;
            next.f370446d = null;
            next.f370443a = null;
            next.f370444b = -1;
            f370384G.a(next);
        }
        this.f370391c = null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    public final void onMeasure(int i12, int i13) {
        DisplayMetrics displayMetrics = com.yandex.div.internal.util.p.f370185a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + kotlin.math.b.b(44 * displayMetrics.density);
        int mode = View.MeasureSpec.getMode(i13);
        if (mode == Integer.MIN_VALUE) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i13)), 1073741824);
        } else if (mode == 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i12);
        if (View.MeasureSpec.getMode(i12) != 0) {
            int iB2 = this.f370404p;
            if (iB2 <= 0) {
                iB2 = size - kotlin.math.b.b(56 * displayMetrics.density);
            }
            this.f370402n = iB2;
        }
        super.onMeasure(i12, i13);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.f370412x != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i12, int i13, boolean z12, boolean z13) {
        super.onOverScrolled(i12, i13, z12, z13);
        com.yandex.div.internal.util.l lVar = this.f370409u;
        if (lVar.f370172b && z12) {
            C22823h0.d(lVar.f370171a);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i12, int i13, int i14, int i15) {
        super.onScrollChanged(i12, i13, i14, i15);
        this.f370409u.f370172b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        f fVar;
        int i16;
        super.onSizeChanged(i12, i13, i14, i15);
        if (i14 == 0 || i14 == i12 || (fVar = this.f370391c) == null || (i16 = fVar.f370444b) == -1) {
            return;
        }
        r(0.0f, i16);
    }

    public final void p(f fVar, boolean z12) {
        c cVar;
        f fVar2 = this.f370391c;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                c cVar2 = this.f370413y;
                if (cVar2 != null) {
                    cVar2.a(fVar2);
                }
                h(fVar.f370444b);
                return;
            }
            return;
        }
        if (z12) {
            int i12 = fVar != null ? fVar.f370444b : -1;
            if (i12 != -1) {
                setSelectedTabView(i12);
            }
            f fVar3 = this.f370391c;
            if ((fVar3 == null || fVar3.f370444b == -1) && i12 != -1) {
                r(0.0f, i12);
            } else {
                h(i12);
            }
        }
        this.f370391c = fVar;
        if (fVar == null || (cVar = this.f370413y) == null) {
            return;
        }
        cVar.b(fVar);
    }

    public final void q(@P androidx.viewpager.widget.a aVar) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.f370386B;
        if (aVar2 != null && (dataSetObserver = this.f370387C) != null) {
            aVar2.n(dataSetObserver);
        }
        this.f370386B = aVar;
        if (aVar != null) {
            if (this.f370387C == null) {
                this.f370387C = new e(null);
            }
            aVar.i(this.f370387C);
        }
        n();
    }

    public final void r(float f12, int i12) {
        int iRound = Math.round(i12 + f12);
        if (iRound >= 0) {
            d dVar = this.f370392d;
            if (iRound >= dVar.getChildCount()) {
                return;
            }
            dVar.d(f12, i12);
            ValueAnimator valueAnimator = this.f370414z;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f370414z.cancel();
            }
            scrollTo(j(f12, i12), 0);
            setSelectedTabView(iRound);
        }
    }

    public void setAnimationDuration(long j12) {
        this.f370397i = j12;
    }

    public void setAnimationType(AnimationType animationType) {
        d dVar = this.f370392d;
        if (dVar.f370441v != animationType) {
            dVar.f370441v = animationType;
            ValueAnimator valueAnimator = dVar.f370433n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            dVar.f370433n.cancel();
        }
    }

    public void setOnTabSelectedListener(c cVar) {
        this.f370413y = cVar;
    }

    public void setSelectedTabIndicatorColor(@InterfaceC42156l int i12) {
        d dVar = this.f370392d;
        if (dVar.f370422c != i12) {
            if ((i12 >> 24) == 0) {
                dVar.f370422c = -1;
            } else {
                dVar.f370422c = i12;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabBackgroundColor(@InterfaceC42156l int i12) {
        d dVar = this.f370392d;
        if (dVar.f370423d != i12) {
            if ((i12 >> 24) == 0) {
                dVar.f370423d = -1;
            } else {
                dVar.f370423d = i12;
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabIndicatorCornersRadii(@N float[] fArr) {
        d dVar = this.f370392d;
        if (Arrays.equals(dVar.f370429j, fArr)) {
            return;
        }
        dVar.f370429j = fArr;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        dVar.postInvalidateOnAnimation();
    }

    public void setTabIndicatorHeight(int i12) {
        d dVar = this.f370392d;
        if (dVar.f370421b != i12) {
            dVar.f370421b = i12;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            dVar.postInvalidateOnAnimation();
        }
    }

    public void setTabItemSpacing(int i12) {
        d dVar = this.f370392d;
        if (i12 != dVar.f370426g) {
            dVar.f370426g = i12;
            int childCount = dVar.getChildCount();
            for (int i13 = 1; i13 < childCount; i13++) {
                View childAt = dVar.getChildAt(i13);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                marginLayoutParams.leftMargin = dVar.f370426g;
                dVar.updateViewLayout(childAt, marginLayoutParams);
            }
        }
    }

    public void setTabMode(int i12) {
        if (i12 != this.f370412x) {
            this.f370412x = i12;
            i();
        }
    }

    public void setTabTextColors(@P ColorStateList colorStateList) {
        if (this.f370400l != colorStateList) {
            this.f370400l = colorStateList;
            ArrayList<f> arrayList = this.f370390b;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                y yVar = arrayList.get(i12).f370446d;
                if (yVar != null) {
                    yVar.setTextColorList(this.f370400l);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z12) {
        int i12 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f370390b;
            if (i12 >= arrayList.size()) {
                return;
            }
            arrayList.get(i12).f370446d.setEnabled(z12);
            i12++;
        }
    }

    public void setupWithViewPager(@P ViewPager viewPager) {
        g gVar;
        ViewPager viewPager2 = this.f370385A;
        if (viewPager2 != null && (gVar = this.f370388D) != null) {
            viewPager2.u(gVar);
        }
        if (viewPager == null) {
            this.f370385A = null;
            setOnTabSelectedListener(null);
            q(null);
            return;
        }
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f370385A = viewPager;
        if (this.f370388D == null) {
            this.f370388D = new g(this);
        }
        g gVar2 = this.f370388D;
        gVar2.f370449d = 0;
        gVar2.f370448c = 0;
        viewPager.c(gVar2);
        setOnTabSelectedListener(new h(viewPager));
        q(adapter);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i12) {
        g(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    public static class h implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f370450a;

        public h(ViewPager viewPager) {
            this.f370450a = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.c
        public final void b(f fVar) {
            this.f370450a.setCurrentItem(fVar.f370444b);
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.c
        public final void a(f fVar) {
        }
    }
}
