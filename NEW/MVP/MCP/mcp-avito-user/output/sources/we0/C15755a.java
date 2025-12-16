package We0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarInfoShortSlot;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarInfoShortSlotConfig;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CarInfoShortSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LWe0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/car_info_short/CarInfoShortSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: We0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15755a extends k<CarInfoShortSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CarInfoShortSlot f17998b;

    public C15755a(@Y61.k CarInfoShortSlot carInfoShortSlot) {
        this.f17998b = carInfoShortSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f17998b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        CarInfoShortSlot carInfoShortSlot = this.f17998b;
        return Collections.singletonList(new com.avito.android.publish.slots.car_info_short.item.a(carInfoShortSlot.getId(), ((CarInfoShortSlotConfig) carInfoShortSlot.getWidget().getConfig()).getTitle(), ((CarInfoShortSlotConfig) carInfoShortSlot.getWidget().getConfig()).getShortTitle(), ((CarInfoShortSlotConfig) carInfoShortSlot.getWidget().getConfig()).getImages(), ((CarInfoShortSlotConfig) carInfoShortSlot.getWidget().getConfig()).getProgressText(), ((CarInfoShortSlotConfig) carInfoShortSlot.getWidget().getConfig()).getProgressValue()));
    }
}
