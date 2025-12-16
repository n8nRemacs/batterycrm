package com.avito.android.lib.design.animation.animation_overlay;

import Y61.k;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/animation_overlay/d;", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements AnimationView.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f178325a;

    public d(b bVar) {
        this.f178325a = bVar;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.f
    public final void a(@k AnimationView.e eVar, @k AnimationView.e eVar2) {
        if ((eVar2 instanceof AnimationView.e.d) || (eVar2 instanceof AnimationView.e.a)) {
            this.f178325a.c();
        }
    }
}
