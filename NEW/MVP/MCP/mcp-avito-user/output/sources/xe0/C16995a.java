package Xe0;

import androidx.compose.runtime.internal.P;
import com.avito.android.body_condition.CarBodyConditionItem;
import com.avito.android.category_parameters.k;
import com.avito.android.deep_linking.links.CarBodyCondition;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.search.Theme;
import i31.InterfaceC41220a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CarBodyConditionSlotWrapperFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LXe0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodyConditionSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xe0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C16995a extends k<CarBodyConditionSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CarBodyConditionSlot f18994b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f18995c;

    @i31.c
    public C16995a(@InterfaceC41220a @Y61.k CarBodyConditionSlot carBodyConditionSlot, @Y61.k C0 c02) {
        this.f18994b = carBodyConditionSlot;
        this.f18995c = c02;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f18994b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        CarBodyConditionSlot carBodyConditionSlot = this.f18994b;
        return Collections.singletonList(new CarBodyConditionItem(carBodyConditionSlot.getId(), (CarBodyCondition) carBodyConditionSlot.getWidget().getConfig(), Theme.INSTANCE.isAvitoRe23(this.f18995c.ve())));
    }
}
