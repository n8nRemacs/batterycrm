package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.L;
import androidx.transition.V;
import androidx.transition.o0;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: Slide.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/animations/g;", "Lcom/yandex/div/core/view2/animations/e;", "e", "f", "g", "h", "i", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g extends com.yandex.div.core.view2.animations.e {

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public static final e f367945F = new e(null);

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public static final b f367946G = new b();

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public static final d f367947H = new d();

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public static final c f367948I = new c();

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final a f367949J = new a();

    /* renamed from: D, reason: collision with root package name */
    public final int f367950D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC10870g f367951E;

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/animations/g$a", "Lcom/yandex/div/core/view2/animations/g$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends i {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float b(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            float translationY = view.getTranslationY();
            e eVar = g.f367945F;
            int height = viewGroup.getHeight() - view.getTop();
            eVar.getClass();
            if (i12 == -1) {
                i12 = height;
            }
            return translationY + i12;
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/animations/g$b", "Lcom/yandex/div/core/view2/animations/g$f;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends f {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float a(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            float translationX = view.getTranslationX();
            e eVar = g.f367945F;
            int right = view.getRight();
            eVar.getClass();
            if (i12 == -1) {
                i12 = right;
            }
            return translationX - i12;
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/animations/g$c", "Lcom/yandex/div/core/view2/animations/g$f;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends f {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float a(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            float translationX = view.getTranslationX();
            e eVar = g.f367945F;
            int width = viewGroup.getWidth() - view.getLeft();
            eVar.getClass();
            if (i12 == -1) {
                i12 = width;
            }
            return translationX + i12;
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/animations/g$d", "Lcom/yandex/div/core/view2/animations/g$i;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends i {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float b(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            float translationY = view.getTranslationY();
            e eVar = g.f367945F;
            int bottom = view.getBottom();
            eVar.getClass();
            if (i12 == -1) {
                i12 = bottom;
            }
            return translationY - i12;
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0004\n\r\u0010\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/animations/g$e;", "", "<init>", "()V", "", "DISTANCE_TO_EDGE", "I", "", "PROPNAME_SCREEN_POSITION", "Ljava/lang/String;", "com/yandex/div/core/view2/animations/g$a", "calculatorBottom", "Lcom/yandex/div/core/view2/animations/g$a;", "com/yandex/div/core/view2/animations/g$b", "calculatorLeft", "Lcom/yandex/div/core/view2/animations/g$b;", "com/yandex/div/core/view2/animations/g$c", "calculatorRight", "Lcom/yandex/div/core/view2/animations/g$c;", "com/yandex/div/core/view2/animations/g$d", "calculatorTop", "Lcom/yandex/div/core/view2/animations/g$d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/g$f;", "Lcom/yandex/div/core/view2/animations/g$g;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class f implements InterfaceC10870g {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float b(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/animations/g$g;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.animations.g$g, reason: collision with other inner class name */
    public interface InterfaceC10870g {
        float a(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup);

        float b(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup);
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/g$i;", "Lcom/yandex/div/core/view2/animations/g$g;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class i implements InterfaceC10870g {
        @Override // com.yandex.div.core.view2.animations.g.InterfaceC10870g
        public final float a(int i12, @Y61.k View view, @Y61.k ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(V v12) {
            super(1);
            this.f367961l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367961l.f54716a.put("yandex:slide:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367962l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(V v12) {
            super(1);
            this.f367962l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367962l.f54716a.put("yandex:slide:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        int i12 = 0;
        this(i12, i12, 3, null);
    }

    public static ObjectAnimator T(View view, g gVar, V v12, int i12, int i13, float f12, float f13, float f14, float f15, TimeInterpolator timeInterpolator) {
        float f16;
        float f17;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = v12.f54717b.getTag(R.id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f16 = (r7[0] - i12) + translationX;
            f17 = (r7[1] - i13) + translationY;
        } else {
            f16 = f12;
            f17 = f13;
        }
        int iB2 = kotlin.math.b.b(f16 - translationX) + i12;
        int iB3 = kotlin.math.b.b(f17 - translationY) + i13;
        view.setTranslationX(f16);
        view.setTranslationY(f17);
        if (f16 == f14 && f17 == f15) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f16, f14), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f17, f15));
        h hVar = new h(v12.f54717b, view, iB2, iB3, translationX, translationY);
        gVar.a(hVar);
        objectAnimatorOfPropertyValuesHolder.addListener(hVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(hVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator O(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.l V v12, @Y61.l V v13) {
        if (v13 == null) {
            return null;
        }
        Object obj = v13.f54716a.get("yandex:slide:screenPosition");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
        }
        int[] iArr = (int[]) obj;
        InterfaceC10870g interfaceC10870g = this.f367951E;
        int i12 = this.f367950D;
        return T(q.a(view, viewGroup, this, iArr), this, v13, iArr[0], iArr[1], interfaceC10870g.a(i12, view, viewGroup), interfaceC10870g.b(i12, view, viewGroup), view.getTranslationX(), view.getTranslationY(), this.f54668e);
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator Q(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.l V v12, @Y61.l V v13) {
        if (v12 == null) {
            return null;
        }
        Object obj = v12.f54716a.get("yandex:slide:screenPosition");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
        }
        int[] iArr = (int[]) obj;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        InterfaceC10870g interfaceC10870g = this.f367951E;
        int i12 = this.f367950D;
        return T(com.yandex.div.core.view2.animations.j.d(this, view, viewGroup, v12, "yandex:slide:screenPosition"), this, v12, iArr[0], iArr[1], translationX, translationY, interfaceC10870g.a(i12, view, viewGroup), interfaceC10870g.b(i12, view, viewGroup), this.f54668e);
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@Y61.k V v12) {
        o0.M(v12);
        com.yandex.div.core.view2.animations.j.c(v12, new j(v12));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@Y61.k V v12) {
        o0.M(v12);
        com.yandex.div.core.view2.animations.j.c(v12, new k(v12));
    }

    public /* synthetic */ g(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? -1 : i12, (i14 & 2) != 0 ? 80 : i13);
    }

    public g(int i12, int i13) {
        InterfaceC10870g interfaceC10870g;
        this.f367950D = i12;
        if (i13 == 3) {
            interfaceC10870g = f367946G;
        } else if (i13 == 5) {
            interfaceC10870g = f367948I;
        } else if (i13 != 48) {
            interfaceC10870g = f367949J;
        } else {
            interfaceC10870g = f367947H;
        }
        this.f367951E = interfaceC10870g;
    }

    /* compiled from: Slide.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/animations/g$h;", "Landroid/animation/AnimatorListenerAdapter;", "Landroidx/transition/L$f;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h extends AnimatorListenerAdapter implements L.f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f367952a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f367953b;

        /* renamed from: c, reason: collision with root package name */
        public final float f367954c;

        /* renamed from: d, reason: collision with root package name */
        public final float f367955d;

        /* renamed from: e, reason: collision with root package name */
        public final int f367956e;

        /* renamed from: f, reason: collision with root package name */
        public final int f367957f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public int[] f367958g;

        /* renamed from: h, reason: collision with root package name */
        public float f367959h;

        /* renamed from: i, reason: collision with root package name */
        public float f367960i;

        public h(@Y61.k View view, @Y61.k View view2, int i12, int i13, float f12, float f13) {
            this.f367952a = view;
            this.f367953b = view2;
            this.f367954c = f12;
            this.f367955d = f13;
            this.f367956e = i12 - kotlin.math.b.b(view2.getTranslationX());
            this.f367957f = i13 - kotlin.math.b.b(view2.getTranslationY());
            Object tag = view.getTag(R.id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.f367958g = iArr;
            if (iArr != null) {
                view.setTag(R.id.div_transition_position, null);
            }
        }

        @Override // androidx.transition.L.f
        public final void e(@Y61.k L l12) {
            View view = this.f367953b;
            view.setTranslationX(this.f367954c);
            view.setTranslationY(this.f367955d);
            l12.A(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Y61.k Animator animator) {
            if (this.f367958g == null) {
                View view = this.f367953b;
                this.f367958g = new int[]{kotlin.math.b.b(view.getTranslationX()) + this.f367956e, kotlin.math.b.b(view.getTranslationY()) + this.f367957f};
            }
            this.f367952a.setTag(R.id.div_transition_position, this.f367958g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(@Y61.k Animator animator) {
            View view = this.f367953b;
            this.f367959h = view.getTranslationX();
            this.f367960i = view.getTranslationY();
            view.setTranslationX(this.f367954c);
            view.setTranslationY(this.f367955d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(@Y61.k Animator animator) {
            float f12 = this.f367959h;
            View view = this.f367953b;
            view.setTranslationX(f12);
            view.setTranslationY(this.f367960i);
        }

        @Override // androidx.transition.L.f
        public final void a() {
        }

        @Override // androidx.transition.L.f
        public final void b() {
        }

        @Override // androidx.transition.L.f
        public final void c() {
        }

        @Override // androidx.transition.L.f
        public final void d(@Y61.k L l12) {
        }
    }
}
