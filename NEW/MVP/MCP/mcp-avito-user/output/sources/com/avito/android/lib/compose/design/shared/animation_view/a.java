package com.avito.android.lib.compose.design.shared.animation_view;

import Y61.k;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/animation_view/a;", "Lcom/avito/android/lib/design/animation/AnimationView$c;", "_design-modules_compose_shared_animation-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements AnimationView.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177598a;

    public a(InterfaceC22204y1 interfaceC22204y1) {
        this.f177598a = interfaceC22204y1;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.c
    public final void a(@k AnimationView.AnimationState animationState, @k AnimationView.AnimationState animationState2) {
        Y41.a aVar;
        if (animationState == AnimationView.AnimationState.f178275c && animationState2 == AnimationView.AnimationState.f178274b && (aVar = (Y41.a) this.f177598a.getF42167b()) != null) {
            aVar.invoke();
        }
    }
}
