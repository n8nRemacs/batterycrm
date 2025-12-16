package com.avito.android.lib.design.progress_bar;

import Y41.l;
import android.animation.ValueAnimator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgressAnimator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/animation/ValueAnimator;", "it", "Lkotlin/G0;", "invoke", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<ValueAnimator, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f180098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar) {
        super(1);
        this.f180098l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = valueAnimator;
        ProgressBar progressBar = this.f180098l.f180102b;
        if (progressBar != null) {
            progressBar.setEmptyColor(((Integer) valueAnimator2.getAnimatedValue()).intValue());
        }
        return G0.f406611a;
    }
}
