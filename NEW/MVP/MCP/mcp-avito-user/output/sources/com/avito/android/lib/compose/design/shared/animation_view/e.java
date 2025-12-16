package com.avito.android.lib.compose.design.shared.animation_view;

import Y41.l;
import android.widget.ImageView;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/AnimationView;", "view", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/animation/AnimationView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements l<AnimationView, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AnimationView.a.d f177605l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ImageView.ScaleType f177606m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AnimationView.a.d dVar, ImageView.ScaleType scaleType) {
        super(1);
        this.f177605l = dVar;
        this.f177606m = scaleType;
    }

    @Override // Y41.l
    public final G0 invoke(AnimationView animationView) {
        AnimationView animationView2 = animationView;
        animationView2.setAnimationData(this.f177605l);
        animationView2.setRepeatCount(-1);
        animationView2.setSpeed(1.0f);
        animationView2.setScaleType(this.f177606m);
        animationView2.setAutoPlay(true);
        animationView2.e();
        return G0.f406611a;
    }
}
