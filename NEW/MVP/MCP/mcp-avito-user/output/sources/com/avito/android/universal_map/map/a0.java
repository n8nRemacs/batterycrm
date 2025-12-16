package com.avito.android.universal_map.map;

import com.avito.android.map_core.beduin.BeduinSetDefaultLocationAction;
import kotlin.Metadata;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetDefaultLocationAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/map_core/beduin/BeduinSetDefaultLocationAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public static final a0<T> f304913b = new a0<>();

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinSetDefaultLocationAction beduinSetDefaultLocationAction = (BeduinSetDefaultLocationAction) obj;
        j0.f305231a = beduinSetDefaultLocationAction.getCoordinates().getLatitude();
        j0.f305232b = beduinSetDefaultLocationAction.getCoordinates().getLongitude();
    }
}
