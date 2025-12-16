package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.stockManagement.StockManagementSlot;
import com.avito.android.remote.model.category_parameters.slot.stockManagement.StockManagementSlotConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StockManagementSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/B;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/stockManagement/StockManagementSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B extends com.avito.android.category_parameters.j<StockManagementSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final StockManagementSlot f242773b;

    public B(@Y61.k StockManagementSlot stockManagementSlot) {
        this.f242773b = stockManagementSlot;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (aVar instanceof com.avito.android.items.b) {
            String f108575b = aVar.getF108575b();
            StockManagementSlot stockManagementSlot = this.f242773b;
            if (L.f(f108575b, ((StockManagementSlotConfig) stockManagementSlot.getWidget().getConfig()).getStockMultipleField().getId())) {
                ((StockManagementSlotConfig) stockManagementSlot.getWidget().getConfig()).getStockMultipleField().set_value(Boolean.valueOf(((com.avito.android.items.b) aVar).f173929d));
                i();
                return new f.b(SlotType.STOCK_MANAGEMENT, null);
            }
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f242773b;
    }
}
