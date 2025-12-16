package com.avito.android.lib.design.point;

import Y41.l;
import Y61.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.avito.android.util.C35872q;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;

/* compiled from: PointAnimationFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/point/c;", "Lcom/avito/android/util/q$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.a f180075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<Float, G0> f180076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f180077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f180078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f180079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f180080f;

    public c(l0.a aVar, l lVar, ArrayList arrayList, AnimatorSet animatorSet, long j12, long j13) {
        this.f180075a = aVar;
        this.f180076b = lVar;
        this.f180077c = arrayList;
        this.f180078d = animatorSet;
        this.f180079e = j12;
        this.f180080f = j13;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@k Animator animator) {
        this.f180075a.f406838b = true;
        ((a) this.f180076b).invoke(Float.valueOf(0.0f));
        ((Animator) C42745f0.E(this.f180077c)).setDuration(0L);
        this.f180078d.setStartDelay(0L);
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        if (this.f180075a.f406838b) {
            return;
        }
        ((Animator) C42745f0.E(this.f180077c)).setDuration(this.f180079e / 2);
        AnimatorSet animatorSet = this.f180078d;
        animatorSet.setStartDelay(this.f180080f);
        animatorSet.start();
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@k Animator animator) {
        this.f180075a.f406838b = false;
    }
}
