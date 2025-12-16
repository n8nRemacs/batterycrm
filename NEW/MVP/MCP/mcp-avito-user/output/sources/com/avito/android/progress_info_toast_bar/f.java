package com.avito.android.progress_info_toast_bar;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.util.C35835l0;
import dd0.InterfaceC39708a;
import gd0.C40664a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: ProgressInfoToastBarView.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/f;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;", "data", "Lkotlin/G0;", "setData", "(Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;)V", "Landroid/widget/FrameLayout$LayoutParams;", "getNewLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "", "getTopMargin", "()I", "getStatusBarHeight", "", "getStartYByToastBarType", "()F", "getDisplayHeight", "getNavigationBarHeight", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/view/View;", "b", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "Ldd0/a;", "c", "Ldd0/a;", "getAnalytics", "()Ldd0/a;", "setAnalytics", "(Ldd0/a;)V", "analytics", "a", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f231507o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @l
    public static WeakReference<f> f231508p;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public View anchorView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public InterfaceC39708a analytics;

    /* renamed from: d, reason: collision with root package name */
    public final int f231511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f231512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f231513f;

    /* renamed from: g, reason: collision with root package name */
    public final int f231514g;

    /* renamed from: h, reason: collision with root package name */
    public float f231515h;

    /* renamed from: i, reason: collision with root package name */
    public float f231516i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final WeakReference<View> f231517j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public WeakReference<ViewGroup> f231518k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public FrameLayout f231519l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final e f231520m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final g f231521n;

    /* compiled from: ProgressInfoToastBarView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/f$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "Ljava/lang/ref/WeakReference;", "Lcom/avito/android/progress_info_toast_bar/f;", "visibleToastBarReference", "Ljava/lang/ref/WeakReference;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context);
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ProgressInfo_ToastBar_Default : i13;
        FrameLayout frameLayoutD = d();
        this.f231517j = frameLayoutD != null ? new WeakReference<>(frameLayoutD) : null;
        this.f231521n = new g(this);
        TypedValue typedValue = new TypedValue();
        ContextWrapper contextWrapper = new ContextWrapper(context);
        contextWrapper.setTheme(context.getTheme().resolveAttribute(i12, typedValue, true) ? typedValue.resourceId : i13);
        LayoutInflater.from(contextWrapper).inflate(R.layout.progress_info_toast_bar, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C40664a.g.f396644a, i12, i13);
        this.f231513f = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f231513f);
        this.f231514g = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, this.f231514g);
        this.f231511d = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, this.f231511d);
        this.f231512e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f231512e);
        typedArrayObtainStyledAttributes.recycle();
        this.f231520m = new e(getContext(), new h(new l0.e(), this, getStartYByToastBarType() == 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    private final int getDisplayHeight() {
        return C35835l0.i(getContext()).heightPixels;
    }

    private final int getNavigationBarHeight() {
        WeakReference<View> weakReference = this.f231517j;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            return 0;
        }
        Resources resources = view.getContext().getResources();
        int identifier = resources.getIdentifier(resources.getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final FrameLayout.LayoutParams getNewLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.f231513f;
        layoutParams.rightMargin = this.f231514g;
        return layoutParams;
    }

    private final float getStartYByToastBarType() {
        float displayHeight = getDisplayHeight();
        if (this.f231516i > displayHeight / 2) {
            return displayHeight;
        }
        return 0.0f;
    }

    private final int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final int getTopMargin() {
        WeakReference<View> weakReference = this.f231517j;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), 0);
        return Math.min((((getDisplayHeight() + getStatusBarHeight()) - getNavigationBarHeight()) - this.f231512e) - getMeasuredHeight(), ((view.getHeight() + iArr[1]) - getMeasuredHeight()) - this.f231511d);
    }

    private final void setData(ProgressInfoToastBarData data) {
        ((TextView) findViewById(R.id.title)).setText(data.f231493b);
        TextView textView = (TextView) findViewById(R.id.progressText);
        Context context = getContext();
        int i12 = data.f231494c;
        String strValueOf = String.valueOf(i12);
        int i13 = data.f231495d;
        textView.setText(context.getString(R.string.progress_info_toast_bar_text_format, strValueOf, String.valueOf(i13)));
        ((ProgressBar) findViewById(R.id.progressBar)).setProgress(i12 / i13);
        ((TextView) findViewById(R.id.description)).setText(data.f231496e);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            animate().alpha(0.0f).translationY(this.f231515h).setDuration(300L).setListener(new b());
        } else {
            c();
        }
    }

    public final void c() {
        WeakReference<ViewGroup> weakReference = this.f231518k;
        ViewGroup viewGroup = weakReference != null ? weakReference.get() : null;
        if ((viewGroup != null ? viewGroup.indexOfChild(this) : -1) != -1) {
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        } else {
            getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.f231521n);
            f231507o.getClass();
            WeakReference<f> weakReference2 = f231508p;
            if ((weakReference2 != null ? weakReference2.get() : null) == this) {
                f231508p = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout d() {
        /*
            r4 = this;
            android.view.View r0 = r4.anchorView
            r1 = 0
            if (r0 == 0) goto La
            android.view.ViewParent r0 = r0.getParent()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L2c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        Lf:
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L1c
            r3 = r2
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4.f231519l = r3
        L1c:
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L27
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Lf
        L27:
            android.widget.FrameLayout r0 = r4.f231519l
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto L30
            return r0
        L30:
            android.app.Activity r0 = r4.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L4a
            r1 = r0
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.progress_info_toast_bar.f.d():android.widget.FrameLayout");
    }

    public final void e(@k ProgressInfoToastBarData progressInfoToastBarData) {
        f231507o.getClass();
        WeakReference<f> weakReference = f231508p;
        f fVar = weakReference != null ? weakReference.get() : null;
        if (fVar != null) {
            fVar.c();
        }
        setData(progressInfoToastBarData);
        f231508p = new WeakReference<>(this);
        FrameLayout frameLayoutD = d();
        if (frameLayoutD == null) {
            return;
        }
        this.f231518k = new WeakReference<>(frameLayoutD);
        setAlpha(0.0f);
        this.f231516i = getTopMargin();
        float startYByToastBarType = getStartYByToastBarType();
        this.f231515h = startYByToastBarType;
        setY(startYByToastBarType);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        getActivity().getApplication().registerActivityLifecycleCallbacks(this.f231521n);
        frameLayoutD.addView(this, getNewLayoutParams());
        animate().alpha(1.0f).translationY(this.f231516i).setDuration(300L).setListener(null);
        InterfaceC39708a interfaceC39708a = this.analytics;
        if (interfaceC39708a != null) {
            interfaceC39708a.b(progressInfoToastBarData.f231494c);
        }
        postDelayed(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 25), 5000L);
    }

    @l
    public final InterfaceC39708a getAnalytics() {
        return this.analytics;
    }

    @l
    public final View getAnchorView() {
        return this.anchorView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.f231521n);
        f231507o.getClass();
        WeakReference<f> weakReference = f231508p;
        if ((weakReference != null ? weakReference.get() : null) == this) {
            f231508p = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        e eVar = this.f231520m;
        eVar.f231505c.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        h hVar = eVar.f231503a;
        l0.e eVar2 = hVar.f231524a;
        f fVar = hVar.f231525b;
        if (action == 0) {
            motionEvent.getY();
            eVar2.f406839b = fVar.getY();
        } else if (action == 1) {
            InterfaceC39708a analytics = fVar.getAnalytics();
            if (analytics != null) {
                analytics.a();
            }
            fVar.b();
        } else if (action == 2) {
            float y12 = motionEvent.getY() - eVar.f231504b;
            if (hVar.f231526c) {
                if (y12 < 0.0f) {
                    fVar.setY(fVar.getY() + y12);
                    fVar.setAlpha(fVar.getY() / eVar2.f406839b);
                }
            } else if (y12 > 0.0f) {
                fVar.setY(fVar.getY() + y12);
                float y13 = fVar.getY();
                float f12 = eVar2.f406839b;
                fVar.setAlpha(1 - ((y13 - f12) / f12));
            }
        }
        eVar.f231504b = motionEvent.getY();
        return true;
    }

    public final void setAnalytics(@l InterfaceC39708a interfaceC39708a) {
        this.analytics = interfaceC39708a;
    }

    public final void setAnchorView(@l View view) {
        this.anchorView = view;
    }

    /* compiled from: ProgressInfoToastBarView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/progress_info_toast_bar/f$b", "Landroid/animation/Animator$AnimatorListener;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@k Animator animator) {
            f fVar = f.this;
            fVar.c();
            fVar.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@k Animator animator) {
            a aVar = f.f231507o;
            f.this.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@k Animator animator) {
        }
    }
}
