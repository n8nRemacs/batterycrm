package com.avito.android.lib.design.animation.animation_overlay;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AnimationOverlay.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/lib/design/animation/animation_overlay/b;", "Landroid/widget/FrameLayout;", "LLV/b;", "LSU/a;", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "newState", "Lkotlin/G0;", "setState", "(LSU/a;)V", "Landroid/view/View;", "c", "Landroid/view/View;", "getAnchorView$_design_modules_components", "()Landroid/view/View;", "setAnchorView$_design_modules_components", "(Landroid/view/View;)V", "anchorView", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends FrameLayout implements LV.b<SU.a> {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f178305j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final LinkedList<WeakReference<b>> f178306k = new LinkedList<>();

    /* renamed from: b, reason: collision with root package name */
    @l
    public FrameLayout f178307b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public View anchorView;

    /* renamed from: d, reason: collision with root package name */
    @l
    public SU.a f178309d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public FrameLayout f178310e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public WeakReference<View> f178311f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public WeakReference<ViewGroup> f178312g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AnimationView f178313h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C5255b f178314i;

    /* compiled from: AnimationOverlay.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/animation/animation_overlay/b$a;", "", "<init>", "()V", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Lcom/avito/android/lib/design/animation/animation_overlay/b;", "queue", "Ljava/util/LinkedList;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static b a() {
            Object next;
            LinkedList<WeakReference<b>> linkedList = b.f178306k;
            if (linkedList.isEmpty()) {
                return null;
            }
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((WeakReference) next).get() != null) {
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) next;
            if (weakReference != null) {
                return (b) weakReference.get();
            }
            return null;
        }

        public static void b() {
            b bVarA = a();
            if (bVarA != null) {
                bVarA.d();
            }
        }

        public a() {
        }
    }

    /* compiled from: AnimationOverlay.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/animation/animation_overlay/b$c", "Lcom/avito/android/lib/design/animation/AnimationView$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements AnimationView.b {

        /* renamed from: a, reason: collision with root package name */
        public int f178316a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SU.a f178317b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f178318c;

        public c(SU.a aVar, b bVar) {
            this.f178317b = aVar;
            this.f178318c = bVar;
        }

        @Override // com.avito.android.lib.design.animation.AnimationView.b
        public final void a(float f12) {
            if (f12 == 1.0f) {
                if (this.f178316a == this.f178317b.f14994b) {
                    this.f178318c.c();
                }
                this.f178316a++;
            }
        }
    }

    /* compiled from: AnimationOverlay.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/animation/animation_overlay/b$d", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements AnimationView.f {
        public d() {
        }

        @Override // com.avito.android.lib.design.animation.AnimationView.f
        public final void a(@k AnimationView.e eVar, @k AnimationView.e eVar2) {
            if ((eVar2 instanceof AnimationView.e.d) || (eVar2 instanceof AnimationView.e.a)) {
                b.this.c();
            }
        }
    }

    /* compiled from: AnimationOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f178321m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FrameLayout frameLayout) {
            super(0);
            this.f178321m = frameLayout;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = b.this;
            if (bVar.getParent() != null) {
                ((ViewGroup) bVar.getParent()).removeView(bVar);
            }
            bVar.getActivity().getApplication().registerActivityLifecycleCallbacks(bVar.f178314i);
            this.f178321m.addView(bVar);
            return G0.f406611a;
        }
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        Context context = getContext();
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout b() {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.f178307b
            if (r0 == 0) goto L5
            return r0
        L5:
            android.view.View r0 = r4.anchorView
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 == 0) goto L31
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L14:
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L21
            r3 = r2
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4.f178310e = r3
        L21:
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2c
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L14
        L2c:
            android.widget.FrameLayout r0 = r4.f178310e
            if (r0 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L35
            return r0
        L35:
            android.app.Activity r0 = r4.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L4f
            r1 = r0
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.animation.animation_overlay.b.b():android.widget.FrameLayout");
    }

    public final void c() {
        WeakReference<ViewGroup> weakReference = this.f178312g;
        ViewGroup viewGroup = weakReference != null ? weakReference.get() : null;
        if ((viewGroup != null ? viewGroup.indexOfChild(this) : -1) != -1) {
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        } else {
            getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.f178314i);
            f178305j.getClass();
            if (C42745f0.l0(new com.avito.android.lib.design.animation.animation_overlay.a(this), f178306k)) {
                a.b();
            }
        }
    }

    public final void d() {
        FrameLayout frameLayoutB = b();
        if (frameLayoutB == null) {
            return;
        }
        this.f178312g = new WeakReference<>(frameLayoutB);
        View view = this.anchorView;
        WeakReference<View> weakReference = view != null ? new WeakReference<>(view) : this.f178311f;
        this.f178311f = weakReference;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 == null) {
            f178305j.getClass();
            C42745f0.l0(new com.avito.android.lib.design.animation.animation_overlay.a(this), f178306k);
            a.b();
        }
        if (view2 != null) {
            D6.l(true, view2, new e(frameLayoutB));
        }
    }

    @l
    /* renamed from: getAnchorView$_design_modules_components, reason: from getter */
    public final View getAnchorView() {
        return this.anchorView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getActivity().getApplication().unregisterActivityLifecycleCallbacks(this.f178314i);
        f178305j.getClass();
        if (C42745f0.l0(new com.avito.android.lib.design.animation.animation_overlay.a(this), f178306k)) {
            a.b();
        }
    }

    public final void setAnchorView$_design_modules_components(@l View view) {
        this.anchorView = view;
    }

    public b(@k Context context, @l AttributeSet attributeSet, @InterfaceC42150f int i12) {
        super(context, attributeSet, i12);
        FrameLayout frameLayoutB = b();
        this.f178311f = frameLayoutB != null ? new WeakReference<>(frameLayoutB) : null;
        this.f178314i = new C5255b();
        View.inflate(context, R.layout.fullscreen_animation_view, this);
        this.f178313h = (AnimationView) findViewById(R.id.animation_view);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k SU.a r12) {
        /*
            r11 = this;
            SU.a r0 = r11.f178309d
            com.avito.android.lib.util.c r1 = new com.avito.android.lib.util.c
            r1.<init>(r12, r0)
            boolean r1 = r1.f181333c
            if (r1 != 0) goto Lb9
            r11.f178309d = r12
            r1 = 0
            if (r0 == 0) goto L13
            android.widget.FrameLayout r2 = r0.f14996d
            goto L14
        L13:
            r2 = r1
        L14:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            android.widget.FrameLayout r4 = r12.f14996d
            r3.<init>(r4, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L21
            r11.f178307b = r4
        L21:
            int r2 = r12.f14994b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L30
            int r4 = r0.f14994b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L31
        L30:
            r4 = r1
        L31:
            boolean r3 = r3.equals(r4)
            com.avito.android.lib.design.animation.AnimationView r4 = r11.f178313h
            com.avito.android.lib.design.animation.AnimationView$RepeatMode r5 = r12.f14995c
            if (r3 == 0) goto L47
            if (r0 == 0) goto L40
            com.avito.android.lib.design.animation.AnimationView$RepeatMode r3 = r0.f14995c
            goto L41
        L40:
            r3 = r1
        L41:
            boolean r3 = kotlin.jvm.internal.L.f(r5, r3)
            if (r3 != 0) goto L5d
        L47:
            r4.setRepeatMode(r5)
            r4.setRepeatCount(r2)
            com.avito.android.lib.design.animation.animation_overlay.b$c r2 = new com.avito.android.lib.design.animation.animation_overlay.b$c
            r2.<init>(r12, r11)
            r4.setAnimationProgressListener(r2)
            com.avito.android.lib.design.animation.animation_overlay.b$d r2 = new com.avito.android.lib.design.animation.animation_overlay.b$d
            r2.<init>()
            r4.setLoadingStateListener(r2)
        L5d:
            if (r0 == 0) goto L61
            com.avito.android.remote.model.AnimationOverlayUrl r1 = r0.f14993a
        L61:
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            com.avito.android.remote.model.AnimationOverlayUrl r12 = r12.f14993a
            r0.<init>(r12, r1)
            boolean r0 = r0.f181333c
            if (r0 != 0) goto Lb9
            if (r12 == 0) goto Lb9
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto L81
            r0 = 1
            goto L82
        L81:
            r0 = 0
        L82:
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131034132(0x7f050014, float:1.7678773E38)
            boolean r1 = r1.getBoolean(r2)
            if (r0 == 0) goto L98
            java.lang.String r0 = r12.getLandscapeUrl()
            goto La3
        L98:
            if (r1 == 0) goto L9f
            java.lang.String r0 = r12.getTabletPortraitUrl()
            goto La3
        L9f:
            java.lang.String r0 = r12.getPortraitUrl()
        La3:
            if (r0 != 0) goto La9
            java.lang.String r0 = r12.getPortraitUrl()
        La9:
            r6 = r0
            if (r6 == 0) goto Lb9
            com.avito.android.lib.design.animation.AnimationView$a$e r12 = new com.avito.android.lib.design.animation.AnimationView$a$e
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.setAnimationData(r12)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.animation.animation_overlay.b.setState(SU.a):void");
    }

    /* compiled from: AnimationOverlay.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/animation/animation_overlay/b$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.animation.animation_overlay.b$b, reason: collision with other inner class name */
    public static final class C5255b implements Application.ActivityLifecycleCallbacks {
        public C5255b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@k Activity activity) {
            if (activity.equals(b.this.getActivity())) {
                b.f178305j.getClass();
                b bVarA = a.a();
                b.f178306k.clear();
                if (bVarA != null) {
                    bVarA.c();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@k Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@k Activity activity, @k Bundle bundle) {
        }
    }
}
