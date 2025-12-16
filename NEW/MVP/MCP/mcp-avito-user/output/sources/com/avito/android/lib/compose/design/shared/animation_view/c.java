package com.avito.android.lib.compose.design.shared.animation_view;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/animation_view/c;", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_design-modules_compose_shared_animation-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements AnimationView.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177600a;

    public c(InterfaceC22204y1 interfaceC22204y1) {
        this.f177600a = interfaceC22204y1;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.f
    public final void a(@k AnimationView.e eVar, @k AnimationView.e eVar2) {
        l lVar;
        if (!(eVar2 instanceof AnimationView.e.a) || (lVar = (l) this.f177600a.getF42167b()) == null) {
            return;
        }
        lVar.invoke(((AnimationView.e.a) eVar2).f178298a);
    }
}
