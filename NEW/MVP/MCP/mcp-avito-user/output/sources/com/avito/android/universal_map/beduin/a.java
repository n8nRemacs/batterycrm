package com.avito.android.universal_map.beduin;

import Ui.InterfaceC15524c;
import Ui.d;
import Y61.k;
import com.avito.android.map_core.beduin.BeduinFocusOnRegionAction;
import com.avito.android.map_core.beduin.BeduinSetDefaultLocationAction;
import com.avito.android.map_core.beduin.BeduinSetMapFiltersAction;
import com.avito.android.map_core.beduin.BeduinShowMapTooltipAction;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.map_core.beduin.BeduinUniversalMapShowSavedLocationAction;
import com.avito.android.map_core.beduin.BeduinUpdateSelectedPinAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UniversalMapActionsRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/beduin/a;", "LUi/d;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements d {
    @Inject
    public a() {
    }

    @Override // Ui.d
    @k
    public final List<InterfaceC15524c> a() {
        return C42745f0.U(BeduinSetMapFiltersAction.INSTANCE, BeduinUniversalMapShowSavedLocationAction.INSTANCE, BeduinSetDefaultLocationAction.INSTANCE, BeduinShowSpecificLocationAction.INSTANCE, BeduinUpdateSelectedPinAction.INSTANCE, BeduinShowMapTooltipAction.INSTANCE, BeduinFocusOnRegionAction.INSTANCE);
    }
}
