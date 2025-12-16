package com.avito.android.remote.model.category_parameters.slot.cpa_reassignment;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.FileUploadParameterValue;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CpaReassignmentSlot.kt */
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotValue;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotValue;)V", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/cpa_reassignment/CpaReassignmentSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "onParametersUpdated", "()V", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CpaReassignmentSlot extends SlotWithValue<CpaReassignmentSlotConfig, CpaReassignmentSlotValue> {

    @f
    @k
    public static final Parcelable.Creator<CpaReassignmentSlot> CREATOR;

    static {
        CpaReassignmentSlot$Companion$CREATOR$1 cpaReassignmentSlot$Companion$CREATOR$1 = CpaReassignmentSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(cpaReassignmentSlot$Companion$CREATOR$1);
    }

    public CpaReassignmentSlot(@k String str, @k String str2, @k SlotWidget<CpaReassignmentSlotConfig> slotWidget, @l CpaReassignmentSlotValue cpaReassignmentSlotValue) {
        super(str, str2, slotWidget, cpaReassignmentSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        CpaReassignmentSlotConfig cpaReassignmentSlotConfig = (CpaReassignmentSlotConfig) getWidget().getConfig();
        ArrayList arrayListE0 = C42745f0.e0(cpaReassignmentSlotConfig.getOwner());
        if (L.f(cpaReassignmentSlotConfig.getOwner().getValue(), cpaReassignmentSlotConfig.getOwnerPersonId())) {
            arrayListE0.add(cpaReassignmentSlotConfig.getLastName());
            arrayListE0.add(cpaReassignmentSlotConfig.getFirstName());
            arrayListE0.add(cpaReassignmentSlotConfig.getPatronymic());
        } else {
            arrayListE0.add(cpaReassignmentSlotConfig.getInn());
        }
        FileUploaderParameter dduFile = cpaReassignmentSlotConfig.getDduFile();
        if (dduFile != null) {
            arrayListE0.add(dduFile);
        }
        CharParameter reassignmentId = cpaReassignmentSlotConfig.getReassignmentId();
        if (reassignmentId != null) {
            arrayListE0.add(reassignmentId);
        }
        return arrayListE0;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<CpaReassignmentSlotConfig>) slotWidget, (CpaReassignmentSlotValue) slotValue);
    }

    public void initWidget(@k SlotWidget<CpaReassignmentSlotConfig> widget, @l CpaReassignmentSlotValue value) {
        String reassignmentId;
        CharParameter reassignmentId2;
        List<FileUploadParameterValue> dduFile;
        FileUploaderParameter dduFile2;
        String inn;
        String patronymic;
        String firstName;
        String lastName;
        String owner;
        if (value != null && (owner = value.getOwner()) != null) {
            ((CpaReassignmentSlotConfig) widget.getConfig()).getOwner().set_value(owner);
        }
        if (value != null && (lastName = value.getLastName()) != null) {
            ((CpaReassignmentSlotConfig) widget.getConfig()).getLastName().set_value(lastName);
        }
        if (value != null && (firstName = value.getFirstName()) != null) {
            ((CpaReassignmentSlotConfig) widget.getConfig()).getFirstName().set_value(firstName);
        }
        if (value != null && (patronymic = value.getPatronymic()) != null) {
            ((CpaReassignmentSlotConfig) widget.getConfig()).getPatronymic().set_value(patronymic);
        }
        if (value != null && (inn = value.getInn()) != null) {
            ((CpaReassignmentSlotConfig) widget.getConfig()).getInn().set_value(inn);
        }
        if (value != null && (dduFile = value.getDduFile()) != null && (dduFile2 = ((CpaReassignmentSlotConfig) widget.getConfig()).getDduFile()) != null) {
            dduFile2.set_value2(dduFile);
        }
        if (value == null || (reassignmentId = value.getReassignmentId()) == null || (reassignmentId2 = ((CpaReassignmentSlotConfig) widget.getConfig()).getReassignmentId()) == null) {
            return;
        }
        reassignmentId2.set_value(reassignmentId);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
