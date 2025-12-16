package com.avito.android.lib.design.progress_bar;

import Y61.k;
import Y61.l;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.avito.android.lib.deprecated_design.tab.n;
import j.InterfaceC42156l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lY0.C43709d;

/* compiled from: ProgressAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/progress_bar/e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f180101a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public ProgressBar f180102b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ValueAnimator f180103c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ValueAnimator f180104d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ValueAnimator f180105e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AnimatorSet f180106f;

    public e() {
        this(0L, 0L, 0L, 7, null);
    }

    public static ValueAnimator a(long j12, long j13, Y41.l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(j12);
        valueAnimator.setStartDelay(j13);
        valueAnimator.addUpdateListener(new n(1, lVar));
        return valueAnimator;
    }

    public final void b(@k ProgressBar progressBar, float f12, float f13, @InterfaceC42156l int i12, @InterfaceC42156l int i13, @InterfaceC42156l int i14, @InterfaceC42156l int i15) {
        this.f180102b = progressBar;
        progressBar.setFairProgress(true);
        ValueAnimator valueAnimator = this.f180103c;
        valueAnimator.setIntValues(Arrays.copyOf(new int[]{i12, i13}, 2));
        C43709d c43709d = C43709d.f413884a;
        valueAnimator.setEvaluator(c43709d);
        ValueAnimator valueAnimator2 = this.f180104d;
        valueAnimator2.setIntValues(Arrays.copyOf(new int[]{i14, i15}, 2));
        valueAnimator2.setEvaluator(c43709d);
        this.f180105e.setFloatValues(f12, f13);
        AnimatorSet animatorSet = this.f180106f;
        if (animatorSet.isRunning()) {
            return;
        }
        animatorSet.start();
    }

    public e(long j12, long j13, long j14, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? 250L : j12;
        j13 = (i12 & 2) != 0 ? 120L : j13;
        j14 = (i12 & 4) != 0 ? 0L : j14;
        long jMax = Math.max(j12 - j13, 0L) + j14;
        this.f180101a = jMax;
        ValueAnimator valueAnimatorA = a(j13, jMax, new c(this));
        this.f180103c = valueAnimatorA;
        ValueAnimator valueAnimatorA2 = a(j13, this.f180101a, new b(this));
        this.f180104d = valueAnimatorA2;
        ValueAnimator valueAnimatorA3 = a(j12, j14, new d(this));
        this.f180105e = valueAnimatorA3;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorA3, valueAnimatorA, valueAnimatorA2);
        animatorSet.addListener(new a(this));
        this.f180106f = animatorSet;
    }
}
