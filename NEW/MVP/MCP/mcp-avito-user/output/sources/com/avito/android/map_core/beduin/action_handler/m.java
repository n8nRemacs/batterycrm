package com.avito.android.map_core.beduin.action_handler;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.di.B;
import com.avito.android.map_core.beduin.BeduinUniversalMapShowSavedLocationAction;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinUniversalMapShowSavedLocationActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/beduin/action_handler/m;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements com.avito.android.beduin_shared.model.action.custom.c<BeduinUniversalMapShowSavedLocationAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<UniversalPreselectMapPoint> f185659a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f185660b;

    @Inject
    public m() {
        com.jakewharton.rxrelay3.c<UniversalPreselectMapPoint> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f185659a = cVar;
        this.f185660b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        BeduinUniversalMapShowSavedLocationAction beduinUniversalMapShowSavedLocationAction = (BeduinUniversalMapShowSavedLocationAction) beduinAction;
        Map<String, Object> selectedPinParameters = beduinUniversalMapShowSavedLocationAction.getSelectedPinParameters();
        Coordinates coordinates = beduinUniversalMapShowSavedLocationAction.getCoordinates();
        BeduinUniversalMapShowSavedLocationAction.Viewport viewport = beduinUniversalMapShowSavedLocationAction.getViewport();
        this.f185659a.accept(new UniversalPreselectMapPoint(new UniversalMapPointRect(selectedPinParameters, coordinates, viewport != null ? new UniversalMapPointRect.Viewport(viewport.getTopLeft(), viewport.getBottomRight()) : null, null, null, null, beduinUniversalMapShowSavedLocationAction.getIconType(), null), beduinUniversalMapShowSavedLocationAction.getZoomLevel(), null));
    }
}
