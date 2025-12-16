package com.avito.android.safedeal.universal_delivery_type.beduin;

import Ui.InterfaceC15524c;
import Ui.d;
import Y61.k;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.map_core.beduin.BeduinResetMapAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UniversalDeliveryTypeActionsRegistry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/beduin/b;", "LUi/d;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements d {
    @Inject
    public b() {
    }

    @Override // Ui.d
    @k
    public final List<InterfaceC15524c> a() {
        return C42745f0.U(BeduinDeliveryMethodSelectTabAction.INSTANCE, BeduinResetMapAction.INSTANCE);
    }
}
