package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.V;
import androidx.transition.o0;
import j.InterfaceC42167x;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: Scale.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/f;", "Lcom/yandex/div/core/view2/animations/e;", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f extends e {

    /* renamed from: D, reason: collision with root package name */
    public final float f367935D;

    /* renamed from: E, reason: collision with root package name */
    public final float f367936E;

    /* renamed from: F, reason: collision with root package name */
    public final float f367937F;

    /* compiled from: Scale.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/animations/f$a;", "", "<init>", "()V", "", "NO_SCALE", "F", "PIVOT_CENTER", "", "PROPNAME_SCALE_X", "Ljava/lang/String;", "PROPNAME_SCALE_Y", "PROPNAME_SCREEN_POSITION", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Scale.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/f$b;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f367938a;

        /* renamed from: b, reason: collision with root package name */
        public final float f367939b;

        /* renamed from: c, reason: collision with root package name */
        public final float f367940c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f367941d;

        public b(@Y61.k View view, float f12, float f13) {
            this.f367938a = view;
            this.f367939b = f12;
            this.f367940c = f13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            View view = this.f367938a;
            view.setScaleX(this.f367939b);
            view.setScaleY(this.f367940c);
            if (this.f367941d) {
                if (Build.VERSION.SDK_INT >= 28) {
                    view.resetPivot();
                } else {
                    view.setPivotX(view.getWidth() * 0.5f);
                    view.setPivotY(view.getHeight() * 0.5f);
                }
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Y61.k Animator animator) {
            View view = this.f367938a;
            view.setVisibility(0);
            f fVar = f.this;
            if (fVar.f367936E == 0.5f && fVar.f367937F == 0.5f) {
                return;
            }
            this.f367941d = true;
            view.setPivotX(view.getWidth() * fVar.f367936E);
            view.setPivotY(view.getHeight() * fVar.f367937F);
        }
    }

    /* compiled from: Scale.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367943l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V v12) {
            super(1);
            this.f367943l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367943l.f54716a.put("yandex:scale:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    /* compiled from: Scale.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367944l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V v12) {
            super(1);
            this.f367944l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367944l.f54716a.put("yandex:scale:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ f(float f12, float f13, float f14, int i12, C42822w c42822w) {
        this(f12, (i12 & 2) != 0 ? 0.5f : f13, (i12 & 4) != 0 ? 0.5f : f14);
    }

    public static float U(V v12, float f12) {
        HashMap map;
        Object obj = (v12 == null || (map = v12.f54716a) == null) ? null : map.get("yandex:scale:scaleX");
        Float f13 = obj instanceof Float ? (Float) obj : null;
        return f13 == null ? f12 : f13.floatValue();
    }

    public static float V(V v12, float f12) {
        HashMap map;
        Object obj = (v12 == null || (map = v12.f54716a) == null) ? null : map.get("yandex:scale:scaleY");
        Float f13 = obj instanceof Float ? (Float) obj : null;
        return f13 == null ? f12 : f13.floatValue();
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator O(@Y61.k ViewGroup viewGroup, @Y61.l View view, @Y61.l V v12, @Y61.k V v13) {
        if (view == null) {
            return null;
        }
        float f12 = this.f367935D;
        float fU2 = U(v12, f12);
        float fV2 = V(v12, f12);
        float fU3 = U(v13, 1.0f);
        float fV3 = V(v13, 1.0f);
        Object obj = v13.f54716a.get("yandex:scale:screenPosition");
        if (obj != null) {
            return T(q.a(view, viewGroup, this, (int[]) obj), fU2, fV2, fU3, fV3);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator Q(@Y61.k ViewGroup viewGroup, @Y61.l View view, @Y61.k V v12, @Y61.l V v13) {
        float fU2 = U(v12, 1.0f);
        float fV2 = V(v12, 1.0f);
        float f12 = this.f367935D;
        return T(j.d(this, view, viewGroup, v12, "yandex:scale:screenPosition"), fU2, fV2, U(v13, f12), V(v13, f12));
    }

    public final ObjectAnimator T(View view, float f12, float f13, float f14, float f15) {
        if (f12 == f14 && f13 == f15) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f12, f14), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f13, f15));
        objectAnimatorOfPropertyValuesHolder.addListener(new b(view, view.getScaleX(), view.getScaleY()));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@Y61.k V v12) {
        float scaleX = v12.f54717b.getScaleX();
        float scaleY = v12.f54717b.getScaleY();
        View view = v12.f54717b;
        Float fValueOf = Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        v12.f54717b.setScaleY(1.0f);
        o0.M(v12);
        v12.f54717b.setScaleX(scaleX);
        v12.f54717b.setScaleY(scaleY);
        int i12 = this.f54815B;
        HashMap map = v12.f54716a;
        if (i12 == 1) {
            map.put("yandex:scale:scaleX", fValueOf);
            map.put("yandex:scale:scaleY", fValueOf);
        } else if (i12 == 2) {
            float f12 = this.f367935D;
            map.put("yandex:scale:scaleX", Float.valueOf(f12));
            map.put("yandex:scale:scaleY", Float.valueOf(f12));
        }
        j.c(v12, new c(v12));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@Y61.k V v12) {
        float scaleX = v12.f54717b.getScaleX();
        float scaleY = v12.f54717b.getScaleY();
        v12.f54717b.setScaleX(1.0f);
        v12.f54717b.setScaleY(1.0f);
        o0.M(v12);
        v12.f54717b.setScaleX(scaleX);
        v12.f54717b.setScaleY(scaleY);
        View view = v12.f54717b;
        int i12 = this.f54815B;
        HashMap map = v12.f54716a;
        if (i12 == 1) {
            float f12 = this.f367935D;
            map.put("yandex:scale:scaleX", Float.valueOf(f12));
            map.put("yandex:scale:scaleY", Float.valueOf(f12));
        } else if (i12 == 2) {
            map.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            map.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
        j.c(v12, new d(v12));
    }

    public f(@InterfaceC42167x float f12, @InterfaceC42167x float f13, @InterfaceC42167x float f14) {
        this.f367935D = f12;
        this.f367936E = f13;
        this.f367937F = f14;
    }
}
