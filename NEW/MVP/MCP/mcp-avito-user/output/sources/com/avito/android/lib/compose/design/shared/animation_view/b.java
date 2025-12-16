package com.avito.android.lib.compose.design.shared.animation_view;

import Y41.l;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;

/* compiled from: AnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/animation_view/b;", "Lcom/avito/android/lib/design/animation/AnimationView$b;", "_design-modules_compose_shared_animation-view_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements AnimationView.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177599a;

    public b(InterfaceC22204y1 interfaceC22204y1) {
        this.f177599a = interfaceC22204y1;
    }

    @Override // com.avito.android.lib.design.animation.AnimationView.b
    public final void a(float f12) {
        l lVar = (l) this.f177599a.getF42167b();
        if (lVar != null) {
            lVar.invoke(Float.valueOf(f12));
        }
    }
}
