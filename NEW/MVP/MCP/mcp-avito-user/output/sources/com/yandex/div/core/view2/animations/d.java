package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.transition.V;
import androidx.transition.o0;
import j.InterfaceC42167x;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: Fade.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/d;", "Lcom/yandex/div/core/view2/animations/e;", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: D, reason: collision with root package name */
    public final float f367925D;

    /* compiled from: Fade.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view2/animations/d$a;", "", "<init>", "()V", "", "PROPNAME_ALPHA", "Ljava/lang/String;", "PROPNAME_SCREEN_POSITION", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Fade.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/d$b;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f367926a;

        /* renamed from: b, reason: collision with root package name */
        public final float f367927b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f367928c;

        public b(@Y61.k View view, float f12) {
            this.f367926a = view;
            this.f367927b = f12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            View view = this.f367926a;
            view.setAlpha(this.f367927b);
            if (this.f367928c) {
                view.setLayerType(0, null);
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Y61.k Animator animator) {
            View view = this.f367926a;
            view.setVisibility(0);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f367928c = true;
                view.setLayerType(2, null);
            }
        }
    }

    /* compiled from: Fade.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367929l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V v12) {
            super(1);
            this.f367929l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367929l.f54716a.put("yandex:fade:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    /* compiled from: Fade.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.animations.d$d, reason: collision with other inner class name */
    public static final class C10869d extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10869d(V v12) {
            super(1);
            this.f367930l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367930l.f54716a.put("yandex:fade:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public d() {
        this(0.0f, 1, null);
    }

    public static ObjectAnimator T(View view, float f12, float f13) {
        if (f12 == f13) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f12, f13);
        objectAnimatorOfFloat.addListener(new b(view, view.getAlpha()));
        return objectAnimatorOfFloat;
    }

    public static float U(V v12, float f12) {
        HashMap map;
        Object obj = (v12 == null || (map = v12.f54716a) == null) ? null : map.get("yandex:fade:alpha");
        Float f13 = obj instanceof Float ? (Float) obj : null;
        return f13 == null ? f12 : f13.floatValue();
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator O(@Y61.k ViewGroup viewGroup, @Y61.l View view, @Y61.l V v12, @Y61.k V v13) {
        if (view == null) {
            return null;
        }
        float fU2 = U(v12, this.f367925D);
        float fU3 = U(v13, 1.0f);
        Object obj = v13.f54716a.get("yandex:fade:screenPosition");
        if (obj != null) {
            return T(q.a(view, viewGroup, this, (int[]) obj), fU2, fU3);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator Q(@Y61.k ViewGroup viewGroup, @Y61.l View view, @Y61.k V v12, @Y61.l V v13) {
        return T(j.d(this, view, viewGroup, v12, "yandex:fade:screenPosition"), U(v12, 1.0f), U(v13, this.f367925D));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@Y61.k V v12) {
        o0.M(v12);
        int i12 = this.f54815B;
        HashMap map = v12.f54716a;
        if (i12 == 1) {
            map.put("yandex:fade:alpha", Float.valueOf(v12.f54717b.getAlpha()));
        } else if (i12 == 2) {
            map.put("yandex:fade:alpha", Float.valueOf(this.f367925D));
        }
        j.c(v12, new c(v12));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@Y61.k V v12) {
        o0.M(v12);
        int i12 = this.f54815B;
        HashMap map = v12.f54716a;
        if (i12 == 1) {
            map.put("yandex:fade:alpha", Float.valueOf(this.f367925D));
        } else if (i12 == 2) {
            map.put("yandex:fade:alpha", Float.valueOf(v12.f54717b.getAlpha()));
        }
        j.c(v12, new C10869d(v12));
    }

    public /* synthetic */ d(float f12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12);
    }

    public d(@InterfaceC42167x float f12) {
        this.f367925D = f12;
    }
}
