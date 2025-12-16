package com.avito.android.lib.design.animation;

import Y61.k;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/a;", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements AnimationView.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimationView f178303a;

    public a(AnimationView animationView) {
        this.f178303a = animationView;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.f
    public final void a(@k AnimationView.e eVar, @k AnimationView.e eVar2) {
        AnimationView animationView = this.f178303a;
        AnimationView.a(animationView, eVar2);
        AnimationView.f loadingStateListener = animationView.getLoadingStateListener();
        if (loadingStateListener != null) {
            loadingStateListener.a(eVar, eVar2);
        }
    }
}
