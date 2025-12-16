package com.avito.android.remote.model.category_parameters.slot.contact_info;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ContactInfoSlot.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotValue;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotValue;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/contact_info/ContactInfoSlotValue;)V", "onParametersUpdated", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContactInfoSlot extends SlotWithValue<ContactInfoSlotConfig, ContactInfoSlotValue> {

    @f
    @k
    public static final Parcelable.Creator<ContactInfoSlot> CREATOR;

    @c("motivation")
    @l
    private final AttributedText motivation;

    static {
        ContactInfoSlot$Companion$CREATOR$1 contactInfoSlot$Companion$CREATOR$1 = ContactInfoSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(contactInfoSlot$Companion$CREATOR$1);
    }

    public ContactInfoSlot(@k String str, @k String str2, @k SlotWidget<ContactInfoSlotConfig> slotWidget, @l ContactInfoSlotValue contactInfoSlotValue, @l AttributedText attributedText) {
        super(str, str2, slotWidget, contactInfoSlotValue);
        this.motivation = attributedText;
    }

    @l
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return C42745f0.V(((ContactInfoSlotConfig) getWidget().getConfig()).getPhoneField());
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<ContactInfoSlotConfig>) slotWidget, (ContactInfoSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue, com.avito.android.remote.model.category_parameters.slot.Slot, android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.motivation, flags);
    }

    public void initWidget(@k SlotWidget<ContactInfoSlotConfig> widget, @l ContactInfoSlotValue value) {
        CharParameter nameField = ((ContactInfoSlotConfig) widget.getConfig()).getNameField();
        if (nameField != null) {
            nameField.set_value(value != null ? value.getName() : null);
        }
        ((ContactInfoSlotConfig) widget.getConfig()).getPhoneField().set_value(value != null ? value.getPhone() : null);
        ((ContactInfoSlotConfig) widget.getConfig()).getManagerField().set_value(value != null ? value.getManager() : null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
