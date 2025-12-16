package com.avito.android.universal_map.map;

import com.avito.android.map_core.beduin.BeduinShowMapTooltipAction;
import kotlin.Metadata;
import qG0.C47293d;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinShowMapTooltipAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/map_core/beduin/BeduinShowMapTooltipAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f305173b;

    public f0(g0 g0Var) {
        this.f305173b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinShowMapTooltipAction beduinShowMapTooltipAction = (BeduinShowMapTooltipAction) obj;
        this.f305173b.f305206i0 = new C47293d(beduinShowMapTooltipAction.getTitle(), beduinShowMapTooltipAction.getText(), 0L, 4, null);
    }
}
