package com.avito.android.safedeal.universal_delivery_type.beduin;

import Y61.k;
import Zi.InterfaceC19564a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: BeduinDeliveryMethodSelectTabActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/beduin/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/map_core/beduin/BeduinDeliveryMethodSelectTabAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.beduin_shared.model.action.custom.c<BeduinDeliveryMethodSelectTabAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC19564a f256438a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<BeduinDeliveryMethodSelectTabAction> f256439b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f256440c;

    public a(@k InterfaceC19564a interfaceC19564a) {
        this.f256438a = interfaceC19564a;
        com.jakewharton.rxrelay3.c<BeduinDeliveryMethodSelectTabAction> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f256439b = cVar;
        this.f256440c = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction = (BeduinDeliveryMethodSelectTabAction) beduinAction;
        this.f256438a.a(beduinDeliveryMethodSelectTabAction.getTabId(), beduinDeliveryMethodSelectTabAction.getOnTabSelectionActions());
        this.f256439b.accept(beduinDeliveryMethodSelectTabAction.copy(beduinDeliveryMethodSelectTabAction.getTabId(), C42784z0.f406748b));
    }
}
