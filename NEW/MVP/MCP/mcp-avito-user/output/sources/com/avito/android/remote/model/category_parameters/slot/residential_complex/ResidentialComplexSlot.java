package com.avito.android.remote.model.category_parameters.slot.residential_complex;

import X41.f;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ResidentialComplexSlot.kt */
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "onParametersUpdated", "()V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResidentialComplexSlot extends Slot<ResidentialComplexSlotConfig> implements SlotWithState {

    @f
    @k
    public static final Parcelable.Creator<ResidentialComplexSlot> CREATOR;

    static {
        ResidentialComplexSlot$Companion$CREATOR$1 residentialComplexSlot$Companion$CREATOR$1 = ResidentialComplexSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(residentialComplexSlot$Companion$CREATOR$1);
    }

    public ResidentialComplexSlot(@k String str, @k String str2, @k SlotWidget<ResidentialComplexSlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithState
    @k
    public List<ParameterSlot> getState() {
        return SlotWithState.DefaultImpls.getState(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        SelectParameter.Value selectedValue;
        ArrayList arrayListE0 = C42745f0.e0(((ResidentialComplexSlotConfig) getWidget().getConfig()).getDevelopment());
        ResidentialComplexSlotConfig residentialComplexSlotConfig = (ResidentialComplexSlotConfig) getWidget().getConfig();
        SelectParameter.Flat building = residentialComplexSlotConfig.getBuilding();
        if (building != null) {
            arrayListE0.add(building);
        }
        SelectParameter.Flat building2 = residentialComplexSlotConfig.getBuilding();
        if (L.f((building2 == null || (selectedValue = building2.getSelectedValue()) == null) ? null : selectedValue.getId(), "0")) {
            CharParameter buildingQueue = residentialComplexSlotConfig.getBuildingQueue();
            if (buildingQueue != null) {
                arrayListE0.add(buildingQueue);
            }
            CharParameter spec = residentialComplexSlotConfig.getSpec();
            if (spec != null) {
                arrayListE0.add(spec);
            }
        } else {
            CharParameter spec2 = residentialComplexSlotConfig.getSpec();
            if (spec2 != null) {
                arrayListE0.add(spec2);
            }
            CharParameter buildingQueue2 = residentialComplexSlotConfig.getBuildingQueue();
            if (buildingQueue2 != null) {
                arrayListE0.add(buildingQueue2);
            }
        }
        return arrayListE0;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
