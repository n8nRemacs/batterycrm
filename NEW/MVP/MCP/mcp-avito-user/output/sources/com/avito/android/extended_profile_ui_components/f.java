package com.avito.android.extended_profile_ui_components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.avito.android.util.C1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnimationInOutTouchListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/f;", "Landroid/view/View$OnTouchListener;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Animator> f153335b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Animator> f153336c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N f153337d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public AnimatorSet f153338e;

    /* compiled from: AnimationInOutTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile_ui_components/f$a", "Landroid/animation/AnimatorListenerAdapter;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Y61.k Animator animator) {
            f.this.f153338e = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            f.this.f153338e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k List list, @Y61.k List list2, @Y61.k Y41.a aVar) {
        this.f153335b = list;
        this.f153336c = list2;
        this.f153337d = (N) aVar;
    }

    public final void a() {
        C1.f318564a.getClass();
        if (C1.a()) {
            AnimatorSet animatorSet = this.f153338e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setInterpolator(new DecelerateInterpolator());
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new a());
            animatorSet2.playTogether(this.f153336c);
            animatorSet2.start();
            this.f153338e = animatorSet2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@Y61.k View view, @Y61.k MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            C1.f318564a.getClass();
            if (C1.a()) {
                AnimatorSet animatorSet = this.f153338e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.setDuration(200L);
                animatorSet2.addListener(new e(this));
                animatorSet2.playTogether(this.f153335b);
                animatorSet2.start();
                this.f153338e = animatorSet2;
            }
        } else if (action == 1) {
            a();
            this.f153337d.invoke();
        } else if (action == 3) {
            a();
        }
        return true;
    }
}
