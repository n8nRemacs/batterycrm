package com.avito.android.user_adverts_views_util.position;

import Y61.k;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import com.avito.android.util.D1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionAnimator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_views_util/position/d;", "Lcom/avito/android/user_adverts_views_util/position/a;", "<init>", "()V", "a", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class d implements com.avito.android.user_adverts_views_util.position.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f316759c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f316760a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f316761b;

    /* compiled from: SearchPositionAnimator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/user_adverts_views_util/position/d$a;", "", "<init>", "()V", "", "BLINK_DELAY_MS", "J", "BLINK_DURATION_MS", "", "MAX_FRACTION", "F", "MIN_FRACTION", "RESET_FRACTION", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SearchPositionAnimator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Animator> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Animator invoke() {
            int i12 = d.f316759c;
            final d dVar = d.this;
            final AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
            final float f12 = (5000 / 5200) * 1.0f;
            final float f13 = 1.0f - f12;
            final l0.e eVar = new l0.e();
            eVar.f406839b = -1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setRepeatMode(1);
            D1.a(valueAnimatorOfFloat, -1);
            valueAnimatorOfFloat.setDuration(5200L);
            valueAnimatorOfFloat.addListener(new e(eVar));
            valueAnimatorOfFloat.addListener(new f(eVar));
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.user_adverts_views_util.position.c
                /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.C] */
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float interpolation;
                    G0 g02;
                    int i13 = d.f316759c;
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float f14 = f12;
                    if (f14 > fFloatValue || fFloatValue > 1.0f) {
                        interpolation = fFloatValue < f14 ? 0.0f : 1.0f;
                    } else {
                        float f15 = f13;
                        interpolation = accelerateInterpolator.getInterpolation((f15 - (1.0f - fFloatValue)) / f15);
                    }
                    l0.e eVar2 = eVar;
                    if (eVar2.f406839b != interpolation && 0.0f <= interpolation && interpolation <= 1.0f) {
                        Iterator it = ((List) dVar.f316760a.getValue()).iterator();
                        while (it.hasNext()) {
                            SearchPositionView searchPositionView = (SearchPositionView) ((WeakReference) it.next()).get();
                            if (searchPositionView != null) {
                                searchPositionView.b(interpolation);
                                g02 = G0.f406611a;
                            } else {
                                g02 = null;
                            }
                            if (g02 == null) {
                                it.remove();
                            }
                        }
                    }
                    eVar2.f406839b = interpolation;
                }
            });
            return valueAnimatorOfFloat;
        }
    }

    /* compiled from: SearchPositionAnimator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Ljava/lang/ref/WeakReference;", "Lcom/avito/android/user_adverts_views_util/position/SearchPositionView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<List<WeakReference<SearchPositionView>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f316763l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final List<WeakReference<SearchPositionView>> invoke() {
            return new ArrayList();
        }
    }

    static {
        new a(null);
    }

    public d() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f316760a = C42727D.b(lazyThreadSafetyMode, c.f316763l);
        this.f316761b = C42727D.b(lazyThreadSafetyMode, new b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_util.position.a
    public final void a(@k SearchPositionView searchPositionView) {
        ?? r02 = this.f316760a;
        C42745f0.l0(new g(searchPositionView), (List) r02.getValue());
        ?? r42 = this.f316761b;
        if (((Animator) r42.getValue()).isStarted() && ((List) r02.getValue()).isEmpty()) {
            ((Animator) r42.getValue()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.user_adverts_views_util.position.a
    public final void b(@k SearchPositionView searchPositionView) {
        ?? r02 = this.f316760a;
        C42745f0.l0(new g(searchPositionView), (List) r02.getValue());
        ((List) r02.getValue()).add(new WeakReference(searchPositionView));
        ?? r42 = this.f316761b;
        if (((Animator) r42.getValue()).isStarted()) {
            return;
        }
        ((Animator) r42.getValue()).start();
    }
}
