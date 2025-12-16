package com.avito.android.remote.model.category_parameters.slot.cv_upload;

import X41.f;
import Y41.l;
import Y61.k;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CvUploadSlot.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u000bB#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/CvUploadSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/cv_upload/CvUploadSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "Landroid/os/Parcelable;", "id", "", "label", "widget", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;)V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvUploadSlot extends Slot<CvUploadSlotConfig> implements SlotWithoutState, Parcelable {

    @f
    @k
    public static final Parcelable.Creator<CvUploadSlot> CREATOR;

    static {
        CvUploadSlot$Companion$CREATOR$1 cvUploadSlot$Companion$CREATOR$1 = CvUploadSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(cvUploadSlot$Companion$CREATOR$1);
    }

    public CvUploadSlot(@k String str, @k String str2, @k SlotWidget<CvUploadSlotConfig> slotWidget) {
        super(str, str2, slotWidget);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return SlotWithoutState.DefaultImpls.initParameters(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        SlotWithoutState.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }
}
