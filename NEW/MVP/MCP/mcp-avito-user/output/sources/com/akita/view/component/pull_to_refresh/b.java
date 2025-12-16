package com.akita.view.component.pull_to_refresh;

import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ListView;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.F;
import androidx.core.view.H;
import androidx.core.view.J;
import androidx.core.view.L;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PullToRefreshLayout.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u001e\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003CDEB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0010H\u0004¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0010H\u0004¢\u0006\u0004\b#\u0010\u001fJ\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012J\u0017\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b.\u0010\u001fR\"\u00103\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u001fR\"\u00107\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u001fR\"\u0010=\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u001aR*\u0010B\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00178\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010\u001a¨\u0006F"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/b;", "Landroid/view/ViewGroup;", "Landroidx/core/view/J;", "Landroidx/core/view/F;", "Lcom/akita/view/component/pull_to_refresh/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/akita/view/component/pull_to_refresh/b$b;", "callback", "Lkotlin/G0;", "setOnChildScrollUpCallback", "(Lcom/akita/view/component/pull_to_refresh/b$b;)V", "", "getProgressViewStartOffset", "()I", "Lcom/akita/view/component/pull_to_refresh/b$c;", "listener", "setOnRefreshListener", "(Lcom/akita/view/component/pull_to_refresh/b$c;)V", "", "refreshing", "setIsRefreshing", "(Z)V", "disableScrollWhileRefreshing", "setDisableScrollWhileRefreshing", "color", "setSpinnerDrawableColor", "(I)V", "size", "setSize", "thickness", "setThickness", "enabled", "setEnabled", "getNestedScrollAxes", "setNestedScrollingEnabled", "", "scale", "setSpinnerViewScale", "(F)V", "offset", "setSpinnerViewOffsetTopAndBottom", "setTargetViewOffsetTopAndBottom", "E", "I", "getOriginalSpinnerOffsetTop", "setOriginalSpinnerOffsetTop", "originalSpinnerOffsetTop", "F", "getOriginalTargetOffsetTop", "setOriginalTargetOffsetTop", "originalTargetOffsetTop", "M", "Z", "getIgnoreInterceptTouchEvents", "()Z", "setIgnoreInterceptTouchEvents", "ignoreInterceptTouchEvents", "value", "N", "getIgnoreNestedScrollDetection", "setIgnoreNestedScrollDetection", "ignoreNestedScrollDetection", "a", "b", "c", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class b extends ViewGroup implements J, F, com.akita.view.component.pull_to_refresh.a {

    /* renamed from: S, reason: collision with root package name */
    public static final int f66939S;

    /* renamed from: A, reason: collision with root package name */
    public int f66940A;

    /* renamed from: B, reason: collision with root package name */
    public int f66941B;

    /* renamed from: C, reason: collision with root package name */
    public float f66942C;

    /* renamed from: D, reason: collision with root package name */
    public float f66943D;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public int originalSpinnerOffsetTop;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public int originalTargetOffsetTop;

    /* renamed from: G, reason: collision with root package name */
    public int f66946G;

    /* renamed from: H, reason: collision with root package name */
    public int f66947H;

    /* renamed from: I, reason: collision with root package name */
    public int f66948I;

    /* renamed from: J, reason: collision with root package name */
    public int f66949J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public h f66950K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f66951L;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreInterceptTouchEvents;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreNestedScrollDetection;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final g f66954O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final d f66955P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final e f66956Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final com.akita.view.component.pull_to_refresh.c f66957R;

    /* renamed from: b, reason: collision with root package name */
    @l
    public View f66958b;

    /* renamed from: c, reason: collision with root package name */
    public j f66959c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.swiperefreshlayout.widget.d f66960d;

    /* renamed from: e, reason: collision with root package name */
    public L f66961e;

    /* renamed from: f, reason: collision with root package name */
    public H f66962f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC2116b f66963g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public c f66964h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f66965i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f66966j;

    /* renamed from: k, reason: collision with root package name */
    public int f66967k;

    /* renamed from: l, reason: collision with root package name */
    public float f66968l;

    /* renamed from: m, reason: collision with root package name */
    public float f66969m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final int[] f66970n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final int[] f66971o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final int[] f66972p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f66973q;

    /* renamed from: r, reason: collision with root package name */
    public int f66974r;

    /* renamed from: s, reason: collision with root package name */
    public int f66975s;

    /* renamed from: t, reason: collision with root package name */
    public float f66976t;

    /* renamed from: u, reason: collision with root package name */
    public float f66977u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f66978v;

    /* renamed from: w, reason: collision with root package name */
    public int f66979w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final DecelerateInterpolator f66980x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final int[] f66981y;

    /* renamed from: z, reason: collision with root package name */
    public int f66982z;

    /* compiled from: PullToRefreshLayout.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/b$a;", "", "<init>", "()V", "", "ANIMATE_TO_START_DURATION", "J", "ANIMATE_TO_TRIGGER_DURATION", "", "DECELERATE_INTERPOLATION_FACTOR", "F", "DRAG_RATE", "", "INVALID_POINTER", "I", "ROTATION_ANGLE", "ROTATION_DURATION", "SCALE_DOWN_DURATION", "SPINNER_PADDING", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PullToRefreshLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/b$b;", "", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.view.component.pull_to_refresh.b$b, reason: collision with other inner class name */
    public interface InterfaceC2116b {
        boolean b();
    }

    /* compiled from: PullToRefreshLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/b$c;", "", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void j0();
    }

    static {
        new a(null);
        f66939S = com.akita.view.foundation.util.f.a(16);
    }

    public b(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.f66968l = -1.0f;
        this.f66970n = new int[2];
        this.f66971o = new int[2];
        this.f66972p = new int[2];
        this.f66979w = -1;
        this.f66980x = new DecelerateInterpolator(2.0f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f66981y = new int[]{R.attr.enabled};
        this.f66982z = -1;
        this.f66954O = new g(this);
        this.f66955P = new d(this);
        this.f66956Q = new e(this);
        com.akita.view.component.pull_to_refresh.c cVar = new com.akita.view.component.pull_to_refresh.c(this);
        cVar.setDuration(800L);
        cVar.setRepeatMode(1);
        cVar.setRepeatCount(-1);
        cVar.setInterpolator(linearInterpolator);
        this.f66957R = cVar;
        i(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpinnerViewOffsetTopAndBottom(int offset) {
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        com.akita.view.foundation.util.e.d(jVar);
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.bringToFront();
        j jVar3 = this.f66959c;
        if (jVar3 == null) {
            jVar3 = null;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        jVar3.offsetTopAndBottom(offset);
        j jVar4 = this.f66959c;
        this.f66974r = (jVar4 != null ? jVar4 : null).getTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpinnerViewScale(float scale) {
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        jVar.setScaleX(scale);
        j jVar2 = this.f66959c;
        (jVar2 != null ? jVar2 : null).setScaleY(scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetViewOffsetTopAndBottom(int offset) {
        View view = this.f66958b;
        if (view != null) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.offsetTopAndBottom(offset);
            this.f66975s = view.getTop();
        }
    }

    public final void d(g gVar) {
        if (this.f66974r == ((int) (this.f66946G - Math.abs(this.originalSpinnerOffsetTop)))) {
            return;
        }
        this.f66940A = this.f66974r;
        this.f66941B = this.f66975s;
        d dVar = this.f66955P;
        dVar.reset();
        dVar.setDuration(200L);
        dVar.setInterpolator(this.f66980x);
        dVar.setAnimationListener(gVar);
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        this.f66942C = jVar.getScaleX();
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        this.f66943D = jVar2.getAlpha();
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(dVar);
        animationSet.addAnimation(this.f66957R);
        j jVar3 = this.f66959c;
        if (jVar3 == null) {
            jVar3 = null;
        }
        jVar3.clearAnimation();
        j jVar4 = this.f66959c;
        (jVar4 != null ? jVar4 : null).startAnimation(animationSet);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, @l int[] iArr, @l int[] iArr2) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, @l int[] iArr) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.d(i12, i13, i14, i15, iArr, 0, null);
    }

    public final void e(Animation.AnimationListener animationListener) {
        int i12 = this.f66974r;
        if (i12 == this.originalSpinnerOffsetTop) {
            return;
        }
        this.f66940A = i12;
        this.f66941B = this.f66975s;
        e eVar = this.f66956Q;
        eVar.reset();
        eVar.setDuration(200L);
        eVar.setInterpolator(this.f66980x);
        if (animationListener != null) {
            j jVar = this.f66959c;
            if (jVar == null) {
                jVar = null;
            }
            jVar.f66990b = animationListener;
        }
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.clearAnimation();
        j jVar3 = this.f66959c;
        (jVar3 != null ? jVar3 : null).startAnimation(eVar);
    }

    public final boolean f() {
        InterfaceC2116b interfaceC2116b = this.f66963g;
        if (interfaceC2116b != null) {
            return interfaceC2116b.b();
        }
        View view = this.f66958b;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        if (view != null) {
            return view.canScrollVertically(-1);
        }
        return false;
    }

    public final void g() {
        if (this.f66958b == null) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                j jVar = this.f66959c;
                if (jVar == null) {
                    jVar = null;
                }
                if (!childAt.equals(jVar)) {
                    this.f66958b = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        int i14 = this.f66982z;
        return i14 < 0 ? i13 : i13 == i12 + (-1) ? i14 : i13 >= i14 ? i13 + 1 : i13;
    }

    public boolean getIgnoreInterceptTouchEvents() {
        return this.ignoreInterceptTouchEvents;
    }

    public boolean getIgnoreNestedScrollDetection() {
        return this.ignoreNestedScrollDetection;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        L l12 = this.f66961e;
        if (l12 == null) {
            l12 = null;
        }
        return l12.a();
    }

    public final int getOriginalSpinnerOffsetTop() {
        return this.originalSpinnerOffsetTop;
    }

    public final int getOriginalTargetOffsetTop() {
        return this.originalTargetOffsetTop;
    }

    public final int getProgressViewStartOffset() {
        return this.originalSpinnerOffsetTop;
    }

    public final void h(float f12) {
        if (f12 > this.f66968l) {
            if (!this.f66965i) {
                this.f66951L = true;
                g();
                this.f66965i = true;
                d(this.f66954O);
                return;
            }
            return;
        }
        this.f66965i = false;
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e(0.0f);
        e(new f(this));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.f(0);
    }

    public final void i(AttributeSet attributeSet) {
        this.f66967k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setWillNotDraw(false);
        this.f66959c = new j(getContext());
        androidx.swiperefreshlayout.widget.d dVar = new androidx.swiperefreshlayout.widget.d(getContext());
        this.f66960d = dVar;
        dVar.g(1);
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        androidx.swiperefreshlayout.widget.d dVar2 = this.f66960d;
        if (dVar2 == null) {
            dVar2 = null;
        }
        jVar.setImageDrawable(dVar2);
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        com.akita.view.foundation.util.e.c(jVar2);
        j jVar3 = this.f66959c;
        addView(jVar3 != null ? jVar3 : null);
        setChildrenDrawingOrderEnabled(true);
        this.f66961e = new L();
        this.f66962f = new H(this);
        setNestedScrollingEnabled(true);
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, this.f66981y);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.f44937d;
    }

    public final void j(float f12) {
        float fMin = (float) Math.min(1.0d, Math.abs(f12 / this.f66968l));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5) / 3;
        float fAbs = (float) (Math.abs(f12) - this.f66968l);
        int i12 = this.f66947H;
        int i13 = this.f66946G;
        float fMax2 = ((float) Math.max(0.0d, Math.min(fAbs, i12 * 2) / i12)) / 4.0f;
        float fPow = (fMax2 - ((float) Math.pow(fMax2, 2.0f))) * 2.0f;
        float f13 = i12;
        float f14 = 2;
        float f15 = i13;
        int i14 = this.originalTargetOffsetTop + ((int) ((f13 * fMin) + (f13 * fPow * f14)));
        int i15 = this.originalSpinnerOffsetTop + ((int) ((f15 * fMin) + (f15 * fPow * 1.5f)));
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e(0.75f);
        float f16 = ((fPow * f14) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        if (jVar.getVisibility() != 0) {
            j jVar2 = this.f66959c;
            if (jVar2 == null) {
                jVar2 = null;
            }
            com.akita.view.foundation.util.e.d(jVar2);
        }
        float fMin2 = Math.min(this.f66974r / (i13 / 2), 1.0f);
        j jVar3 = this.f66959c;
        if (jVar3 == null) {
            jVar3 = null;
        }
        jVar3.setScaleX(fMin2);
        j jVar4 = this.f66959c;
        if (jVar4 == null) {
            jVar4 = null;
        }
        jVar4.setScaleY(fMin2);
        j jVar5 = this.f66959c;
        if (jVar5 == null) {
            jVar5 = null;
        }
        jVar5.setAlpha(fMin2);
        androidx.swiperefreshlayout.widget.d dVar2 = this.f66960d;
        (dVar2 != null ? dVar2 : null).c(f16);
        setSpinnerViewOffsetTopAndBottom(i15 - this.f66974r);
        setTargetViewOffsetTopAndBottom(i14 - this.f66975s);
    }

    public final void k(float f12) {
        int i12 = this.f66940A + ((int) ((this.originalSpinnerOffsetTop - r0) * f12));
        int i13 = this.f66941B + ((int) ((this.originalTargetOffsetTop - r1) * f12));
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        int top = i12 - jVar.getTop();
        View view = this.f66958b;
        int top2 = i13 - (view != null ? view.getTop() : 0);
        float f13 = 1 - f12;
        j jVar2 = this.f66959c;
        (jVar2 != null ? jVar2 : null).setAlpha(f13);
        setSpinnerViewScale(f13);
        setSpinnerViewOffsetTopAndBottom(top);
        setTargetViewOffsetTopAndBottom(top2);
    }

    public final void l() {
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        jVar.clearAnimation();
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        jVar2.setRotation(0.0f);
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c(0.0f);
        androidx.swiperefreshlayout.widget.d dVar2 = this.f66960d;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.stop();
        j jVar3 = this.f66959c;
        if (jVar3 == null) {
            jVar3 = null;
        }
        com.akita.view.foundation.util.e.c(jVar3);
        setSpinnerViewOffsetTopAndBottom(this.originalSpinnerOffsetTop - this.f66974r);
        setTargetViewOffsetTopAndBottom(this.originalTargetOffsetTop - this.f66975s);
        j jVar4 = this.f66959c;
        this.f66974r = (jVar4 != null ? jVar4 : null).getTop();
        this.f66975s = this.originalTargetOffsetTop;
    }

    public final void m() {
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b((this.f66948I / 2) - this.f66949J);
        androidx.swiperefreshlayout.widget.d dVar2 = this.f66960d;
        (dVar2 != null ? dVar2 : null).f(this.f66949J);
        int i12 = this.f66948I;
        int i13 = f66939S;
        int i14 = i12 + i13;
        this.f66946G = i14;
        this.f66947H = i13 + i14;
        this.f66968l = i14;
        int i15 = -i12;
        this.f66974r = i15;
        this.originalSpinnerOffsetTop = i15;
        View view = this.f66958b;
        this.originalTargetOffsetTop = view != null ? view.getTop() : 0;
        requestLayout();
        k(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(@Y61.k android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.g()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.f66966j
            r2 = 1
            if (r1 == 0) goto L11
            boolean r1 = r5.f66965i
            if (r1 == 0) goto L11
            return r2
        L11:
            boolean r1 = r5.isEnabled()
            r3 = 0
            if (r1 == 0) goto La4
            boolean r1 = r5.f()
            if (r1 != 0) goto La4
            boolean r1 = r5.f66965i
            if (r1 != 0) goto La4
            boolean r1 = r5.f66973q
            if (r1 != 0) goto La4
            boolean r1 = r5.getIgnoreInterceptTouchEvents()
            if (r1 == 0) goto L2e
            goto La4
        L2e:
            if (r0 == 0) goto L7d
            r1 = -1
            if (r0 == r2) goto L78
            r4 = 2
            if (r0 == r4) goto L54
            r4 = 3
            if (r0 == r4) goto L78
            r1 = 6
            if (r0 == r1) goto L3d
            goto La1
        L3d:
            int r0 = r6.getActionIndex()
            int r1 = r6.getPointerId(r0)
            int r4 = r5.f66979w
            if (r1 != r4) goto La1
            if (r0 != 0) goto L4c
            goto L4d
        L4c:
            r2 = r3
        L4d:
            int r6 = r6.getPointerId(r2)
            r5.f66979w = r6
            goto La1
        L54:
            int r0 = r5.f66979w
            if (r0 != r1) goto L59
            return r3
        L59:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L60
            return r3
        L60:
            float r6 = r6.getY(r0)
            float r0 = r5.f66977u
            float r6 = r6 - r0
            int r1 = r5.f66967k
            float r1 = (float) r1
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 <= 0) goto La1
            boolean r6 = r5.f66978v
            if (r6 != 0) goto La1
            float r0 = r0 + r1
            r5.f66976t = r0
            r5.f66978v = r2
            goto La1
        L78:
            r5.f66978v = r3
            r5.f66979w = r1
            goto La1
        L7d:
            int r0 = r5.originalSpinnerOffsetTop
            com.akita.view.component.pull_to_refresh.j r1 = r5.f66959c
            if (r1 != 0) goto L84
            r1 = 0
        L84:
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r5.setSpinnerViewOffsetTopAndBottom(r0)
            int r0 = r6.getPointerId(r3)
            r5.f66979w = r0
            r5.f66978v = r3
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L9b
            return r3
        L9b:
            float r6 = r6.getY(r0)
            r5.f66977u = r6
        La1:
            boolean r6 = r5.f66978v
            return r6
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.view.component.pull_to_refresh.b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f66958b == null) {
            g();
        }
        if (this.f66958b == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop2 = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        View view = this.f66958b;
        if (view != null) {
            int i16 = this.f66975s;
            view.layout(paddingLeft, paddingTop + i16, paddingLeft2 + paddingLeft, paddingTop + paddingTop2 + i16);
        }
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        int measuredWidth2 = jVar.getMeasuredWidth();
        j jVar2 = this.f66959c;
        if (jVar2 == null) {
            jVar2 = null;
        }
        int measuredHeight2 = jVar2.getMeasuredHeight();
        j jVar3 = this.f66959c;
        j jVar4 = jVar3 != null ? jVar3 : null;
        int i17 = measuredWidth / 2;
        int i18 = measuredWidth2 / 2;
        int i19 = this.f66974r;
        jVar4.layout(i17 - i18, i19, i17 + i18, measuredHeight2 + i19);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (this.f66958b == null) {
            g();
        }
        View view = this.f66958b;
        if (view == null) {
            return;
        }
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        jVar.measure(View.MeasureSpec.makeMeasureSpec(this.f66948I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f66948I, 1073741824));
        this.f66982z = -1;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            j jVar2 = this.f66959c;
            if (jVar2 == null) {
                jVar2 = null;
            }
            if (childAt == jVar2) {
                this.f66982z = i14;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@k View view, float f12, float f13, boolean z12) {
        return dispatchNestedFling(f12, f13, z12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@k View view, float f12, float f13) {
        return dispatchNestedPreFling(f12, f13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@k View view, int i12, int i13, @k int[] iArr) {
        if (i13 > 0) {
            float f12 = this.f66969m;
            if (f12 > 0.0f) {
                float f13 = i13;
                if (f13 > f12) {
                    iArr[1] = i13 - ((int) f12);
                    this.f66969m = 0.0f;
                } else {
                    this.f66969m = f12 - f13;
                    iArr[1] = i13;
                }
                j(this.f66969m);
            }
        }
        int i14 = i12 - iArr[0];
        int i15 = i13 - iArr[1];
        int[] iArr2 = this.f66970n;
        if (dispatchNestedPreScroll(i14, i15, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // androidx.core.view.J
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15, int i16, @k int[] iArr) {
        if (i16 != 0) {
            return;
        }
        int i17 = iArr[1];
        if (i16 == 0) {
            H h12 = this.f66962f;
            (h12 == null ? null : h12).d(i12, i13, i14, i15, this.f66971o, i16, iArr);
        }
        int i18 = i15 - (iArr[1] - i17);
        int i19 = i18 == 0 ? i15 + this.f66971o[1] : i18;
        if ((i17 > 0 || i13 > 0) && this.f66965i) {
            this.f66951L = false;
            e(null);
        }
        if (i19 >= 0 || f()) {
            return;
        }
        if (this.f66965i && this.f66974r == ((int) (this.f66946G - Math.abs(this.originalSpinnerOffsetTop)))) {
            j jVar = this.f66959c;
            if (jVar == null) {
                jVar = null;
            }
            if (jVar.getScaleX() == 1.0f) {
                j jVar2 = this.f66959c;
                if ((jVar2 != null ? jVar2 : null).getAlpha() == 1.0f) {
                    iArr[1] = iArr[1] + i18;
                    return;
                }
            }
        }
        float fAbs = this.f66969m + Math.abs(i19);
        this.f66969m = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i18;
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(@k View view, @k View view2, int i12, int i13) {
        if (i13 == 0) {
            onNestedScrollAccepted(view, view2, i12);
        }
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(@k View view, @k View view2, int i12, int i13) {
        if (i13 == 0) {
            return onStartNestedScroll(view, view2, i12);
        }
        return false;
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(@k View view, int i12) {
        if (i12 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f66966j && this.f66965i) {
            return true;
        }
        if (!isEnabled() || f() || this.f66965i || this.f66973q) {
            return false;
        }
        if (actionMasked == 0) {
            this.f66979w = motionEvent.getPointerId(0);
            this.f66978v = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f66979w);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.f66978v) {
                    float y12 = (motionEvent.getY(iFindPointerIndex) - this.f66976t) * 0.5f;
                    this.f66978v = false;
                    h(y12);
                }
                this.f66979w = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f66979w);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y13 = motionEvent.getY(iFindPointerIndex2);
                float f12 = this.f66977u;
                float f13 = y13 - f12;
                float f14 = this.f66967k;
                if (f13 > f14 && !this.f66978v) {
                    this.f66976t = f12 + f14;
                    this.f66978v = true;
                }
                if (this.f66978v) {
                    float f15 = (y13 - this.f66976t) * 0.5f;
                    if (f15 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    j(f15);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f66979w = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f66979w) {
                        this.f66979w = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    public final void setDisableScrollWhileRefreshing(boolean disableScrollWhileRefreshing) {
        this.f66966j = disableScrollWhileRefreshing;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            return;
        }
        l();
    }

    public void setIgnoreInterceptTouchEvents(boolean z12) {
        this.ignoreInterceptTouchEvents = z12;
    }

    public void setIgnoreNestedScrollDetection(boolean z12) {
        this.ignoreNestedScrollDetection = z12;
        if (z12) {
            this.f66973q = false;
        }
    }

    public final void setIsRefreshing(boolean refreshing) {
        g gVar = this.f66954O;
        if (!refreshing || this.f66965i == refreshing) {
            if (this.f66965i != refreshing) {
                this.f66951L = false;
                g();
                this.f66965i = refreshing;
                if (refreshing) {
                    d(gVar);
                    return;
                } else {
                    e(gVar);
                    return;
                }
            }
            return;
        }
        this.f66965i = refreshing;
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e(0.75f);
        j jVar = this.f66959c;
        if (jVar == null) {
            jVar = null;
        }
        com.akita.view.foundation.util.e.d(jVar);
        setSpinnerViewOffsetTopAndBottom(this.originalSpinnerOffsetTop - this.f66974r);
        setTargetViewOffsetTopAndBottom(this.originalTargetOffsetTop);
        j jVar2 = this.f66959c;
        this.f66974r = (jVar2 != null ? jVar2 : null).getTop();
        this.f66975s = this.originalTargetOffsetTop;
        this.f66951L = false;
        d(gVar);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        h12.g(enabled);
    }

    public final void setOnChildScrollUpCallback(@l InterfaceC2116b callback) {
        this.f66963g = callback;
    }

    public final void setOnRefreshListener(@l c listener) {
        this.f66964h = listener;
    }

    public final void setOriginalSpinnerOffsetTop(int i12) {
        this.originalSpinnerOffsetTop = i12;
    }

    public final void setOriginalTargetOffsetTop(int i12) {
        this.originalTargetOffsetTop = i12;
    }

    public final void setSize(int size) {
        this.f66948I = size;
        m();
    }

    public final void setSpinnerDrawableColor(int color) {
        androidx.swiperefreshlayout.widget.d dVar = this.f66960d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setThickness(int thickness) {
        this.f66949J = thickness;
        m();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        return h12.h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        H h12 = this.f66962f;
        if (h12 == null) {
            h12 = null;
        }
        h12.i(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(@k View view, @k View view2, int i12) {
        L l12 = this.f66961e;
        if (l12 == null) {
            l12 = null;
        }
        l12.f44968a = i12;
        startNestedScroll(i12 & 2);
        this.f66969m = 0.0f;
        if (getIgnoreNestedScrollDetection()) {
            return;
        }
        this.f66973q = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@k View view, @k View view2, int i12) {
        return isEnabled() && (i12 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@k View view) {
        L l12 = this.f66961e;
        if (l12 == null) {
            l12 = null;
        }
        l12.f44968a = 0;
        this.f66973q = false;
        float f12 = this.f66969m;
        if (f12 > 0.0f) {
            if (this.f66965i) {
                d(this.f66954O);
            } else {
                h(f12);
                this.f66969m = 0.0f;
            }
        }
        stopNestedScroll();
    }

    @Override // androidx.core.view.I
    public final void onNestedPreScroll(@k View view, int i12, int i13, @k int[] iArr, int i14) {
        if (i14 == 0) {
            onNestedPreScroll(view, i12, i13, iArr);
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15, int i16) {
        onNestedScroll(view, i12, i13, i14, i15, i16, this.f66972p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i12, i13, i14, i15, 0, this.f66972p);
    }

    public b(@l Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f66968l = -1.0f;
        this.f66970n = new int[2];
        this.f66971o = new int[2];
        this.f66972p = new int[2];
        this.f66979w = -1;
        this.f66980x = new DecelerateInterpolator(2.0f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f66981y = new int[]{R.attr.enabled};
        this.f66982z = -1;
        this.f66954O = new g(this);
        this.f66955P = new d(this);
        this.f66956Q = new e(this);
        com.akita.view.component.pull_to_refresh.c cVar = new com.akita.view.component.pull_to_refresh.c(this);
        cVar.setDuration(800L);
        cVar.setRepeatMode(1);
        cVar.setRepeatCount(-1);
        cVar.setInterpolator(linearInterpolator);
        this.f66957R = cVar;
        i(attributeSet);
    }
}
