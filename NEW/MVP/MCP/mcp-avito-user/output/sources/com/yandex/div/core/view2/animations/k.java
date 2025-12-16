package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.transition.V;
import androidx.transition.o0;
import j.k0;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: VerticalTranslation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/animations/k;", "Lcom/yandex/div/core/view2/animations/e;", "a", "b", "c", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k extends com.yandex.div.core.view2.animations.e {

    /* renamed from: D, reason: collision with root package name */
    public final float f367966D;

    /* renamed from: E, reason: collision with root package name */
    public final float f367967E;

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/k$a;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f367968a;

        public a(@Y61.k View view) {
            this.f367968a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            View view = this.f367968a;
            view.setTranslationY(0.0f);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setClipBounds(null);
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/view2/animations/k$b;", "", "<init>", "()V", "", "DEFAULT_STABLE_VALUE", "F", "DEFAULT_TRANSLATED_VALUE", "", "PROPNAME_SCREEN_POSITION", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @k0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/k$c;", "Landroid/util/Property;", "Landroid/view/View;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Property<View, Float> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Rect f367969a;

        /* renamed from: b, reason: collision with root package name */
        public float f367970b;

        public c(@Y61.k View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.f367969a = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        public final void a(@Y61.k View view, float f12) {
            this.f367970b = f12;
            Rect rect = this.f367969a;
            if (f12 < 0.0f) {
                rect.set(0, (int) ((-f12) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f12 > 0.0f) {
                float f13 = 1;
                rect.set(0, 0, view.getWidth(), (int) (((f13 - this.f367970b) * view.getHeight()) + f13));
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            view.setClipBounds(rect);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(this.f367970b);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ void set(View view, Float f12) {
            a(view, f12.floatValue());
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367971l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V v12) {
            super(1);
            this.f367971l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367971l.f54716a.put("yandex:verticalTranslation:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "([I)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends N implements Y41.l<int[], G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ V f367972l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(V v12) {
            super(1);
            this.f367972l = v12;
        }

        @Override // Y41.l
        public final G0 invoke(int[] iArr) {
            this.f367972l.f54716a.put("yandex:verticalTranslation:screenPosition", iArr);
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k() {
        float f12 = 0.0f;
        this(f12, f12, 3, null);
    }

    @Override // androidx.transition.o0
    @Y61.k
    public final Animator O(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.l V v12, @Y61.k V v13) {
        float height = view.getHeight();
        float f12 = this.f367966D;
        float f13 = f12 * height;
        float f14 = this.f367967E;
        float f15 = height * f14;
        Object obj = v13.f54716a.get("yandex:verticalTranslation:screenPosition");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
        }
        View viewA = q.a(view, viewGroup, this, (int[]) obj);
        viewA.setTranslationY(f13);
        c cVar = new c(viewA);
        cVar.a(viewA, f12);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewA, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f13, f15), PropertyValuesHolder.ofFloat(cVar, f12, f14));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.o0
    @Y61.k
    public final Animator Q(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k V v12, @Y61.l V v13) {
        float height = view.getHeight();
        float f12 = this.f367966D;
        View viewD = j.d(this, view, viewGroup, v12, "yandex:verticalTranslation:screenPosition");
        Property property = View.TRANSLATION_Y;
        float f13 = this.f367967E;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewD, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f13, height * f12), PropertyValuesHolder.ofFloat(new c(view), f13, f12));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void f(@Y61.k V v12) {
        o0.M(v12);
        j.c(v12, new d(v12));
    }

    @Override // androidx.transition.o0, androidx.transition.L
    public final void j(@Y61.k V v12) {
        o0.M(v12);
        j.c(v12, new e(v12));
    }

    public /* synthetic */ k(float f12, float f13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? -1.0f : f12, (i12 & 2) != 0 ? 0.0f : f13);
    }

    public k(float f12, float f13) {
        this.f367966D = f12;
        this.f367967E = f13;
    }
}
