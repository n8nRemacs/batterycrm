package com.yandex.div.core.view2.animations;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.transition.V;
import com.yandex.div.json.expressions.b;
import com.yandex.div2.DivAnimation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.ranges.s;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final DivAnimation f367963a = new DivAnimation(com.google.firebase.components.g.i(100, com.yandex.div.json.expressions.b.f370552a), b.a.a(Double.valueOf(0.6d)), null, null, b.a.a(DivAnimation.Name.FADE), null, null, b.a.a(Double.valueOf(1.0d)), 108, null);

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            iArr[4] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[5] = 4;
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.p<View, MotionEvent, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Animation f367964l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Animation f367965m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animation animation, Animation animation2) {
            super(2);
            this.f367964l = animation;
            this.f367965m = animation2;
        }

        @Override // Y41.p
        public final G0 invoke(View view, MotionEvent motionEvent) {
            Animation animation;
            View view2 = view;
            MotionEvent motionEvent2 = motionEvent;
            if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                int action = motionEvent2.getAction();
                if (action == 0) {
                    Animation animation2 = this.f367964l;
                    if (animation2 != null) {
                        view2.startAnimation(animation2);
                    }
                } else if ((action == 1 || action == 3) && (animation = this.f367965m) != null) {
                    view2.startAnimation(animation);
                }
            }
            return G0.f406611a;
        }
    }

    public static final Float a(Double d12) {
        if (d12 == null) {
            return null;
        }
        return Float.valueOf(s.f((float) d12.doubleValue(), 0.0f, 1.0f));
    }

    @Y61.l
    public static final Y41.p<View, MotionEvent, G0> b(@Y61.k DivAnimation divAnimation, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k View view) {
        Animation animationF = f(divAnimation, eVar, false, view);
        Animation animationF2 = f(divAnimation, eVar, true, null);
        if (animationF == null && animationF2 == null) {
            return null;
        }
        return new b(animationF, animationF2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void c(@Y61.k V v12, @Y61.k Y41.l<? super int[], G0> lVar) {
        ?? r02 = new int[2];
        v12.f54717b.getLocationOnScreen(r02);
        lVar.invoke(r02);
    }

    @Y61.k
    public static final View d(@Y61.k e eVar, @Y61.k View view, @Y61.k ViewGroup viewGroup, @Y61.k V v12, @Y61.k String str) {
        if (!com.yandex.div.core.util.q.b(view)) {
            return view;
        }
        Object obj = v12.f54716a.get(str);
        if (obj != null) {
            return q.a(view, viewGroup, eVar, (int[]) obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
    }

    public static final Float e(Double d12) {
        if (d12 == null) {
            return null;
        }
        return Float.valueOf(s.a((float) d12.doubleValue(), 0.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.animation.Animation f(com.yandex.div2.DivAnimation r21, com.yandex.div.json.expressions.e r22, boolean r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.animations.j.f(com.yandex.div2.DivAnimation, com.yandex.div.json.expressions.e, boolean, android.view.View):android.view.animation.Animation");
    }
}
