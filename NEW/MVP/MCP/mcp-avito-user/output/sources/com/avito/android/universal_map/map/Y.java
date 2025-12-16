package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.map_core.beduin.BeduinFocusOnRegionAction;
import kotlin.Metadata;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinFocusOnRegionAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/map_core/beduin/BeduinFocusOnRegionAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class Y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f304908b;

    public Y(g0 g0Var) {
        this.f304908b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinFocusOnRegionAction beduinFocusOnRegionAction = (BeduinFocusOnRegionAction) obj;
        g0 g0Var = this.f304908b;
        g0Var.f305212o0 = true;
        g0Var.f305209l0 = new AvitoMapBounds(com.avito.android.universal_map.map.util.b.b(beduinFocusOnRegionAction.getTopLeft()), com.avito.android.universal_map.map.util.b.b(beduinFocusOnRegionAction.getBottomRight()));
    }
}
