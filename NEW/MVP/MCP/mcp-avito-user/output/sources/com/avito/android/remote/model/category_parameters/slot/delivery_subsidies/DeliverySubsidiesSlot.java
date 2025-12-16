package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.DynamicSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySubsidiesSlot.kt */
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidiesSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/DynamicSlot;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotValue;)V", "Ljava/util/ArrayList;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lkotlin/collections/ArrayList;", "initParameters", "()Ljava/util/ArrayList;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidySlotValue;)V", "Lcom/avito/android/remote/model/category_parameters/CharParameter;", "charParameter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliverySubsidiesSlot extends SlotWithValue<DeliverySubsidySlotConfig, DeliverySubsidySlotValue> implements DynamicSlot {

    @f
    @k
    public static final Parcelable.Creator<DeliverySubsidiesSlot> CREATOR;

    static {
        DeliverySubsidiesSlot$Companion$CREATOR$1 deliverySubsidiesSlot$Companion$CREATOR$1 = DeliverySubsidiesSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(deliverySubsidiesSlot$Companion$CREATOR$1);
    }

    public DeliverySubsidiesSlot(@k String str, @k String str2, @k SlotWidget<DeliverySubsidySlotConfig> slotWidget, @l DeliverySubsidySlotValue deliverySubsidySlotValue) {
        super(str, str2, slotWidget, deliverySubsidySlotValue);
    }

    public static /* synthetic */ CharParameter charParameter$default(DeliverySubsidiesSlot deliverySubsidiesSlot, String str, String str2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        return deliverySubsidiesSlot.charParameter(str, str2);
    }

    @k
    public final CharParameter charParameter(@k String id2, @l String value) {
        return new CharParameter(id2, "", true, false, null, null, null, value, null, null, null, null, null, null, null, null, null, null, 262000, null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<DeliverySubsidySlotConfig>) slotWidget, (DeliverySubsidySlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        DynamicSlot.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        DynamicSlot.DefaultImpls.setValueChangesListener(this, lVar);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public ArrayList<ParameterSlot> initParameters() {
        return C42745f0.j(charParameter$default(this, DeliverySubsidiesSlotKt.SUBSIDY_ID, null, 2, null), charParameter$default(this, DeliverySubsidiesSlotKt.AMOUNT, null, 2, null), charParameter$default(this, DeliverySubsidiesSlotKt.ORIGINAL_AMOUNT, null, 2, null), charParameter$default(this, DeliverySubsidiesSlotKt.VALIDATION_TOKEN, null, 2, null), charParameter$default(this, DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID, null, 2, null));
    }

    public void initWidget(@k SlotWidget<DeliverySubsidySlotConfig> widget, @l DeliverySubsidySlotValue value) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Iterator<T> it = getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), DeliverySubsidiesSlotKt.SUBSIDY_ID)) {
                    break;
                }
            }
        }
        CharParameter charParameter = next instanceof CharParameter ? (CharParameter) next : null;
        if (charParameter != null) {
            charParameter.set_value(value != null ? value.getSubsidyId() : null);
        }
        Iterator<T> it2 = getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), DeliverySubsidiesSlotKt.AMOUNT)) {
                    break;
                }
            }
        }
        CharParameter charParameter2 = next2 instanceof CharParameter ? (CharParameter) next2 : null;
        if (charParameter2 != null) {
            charParameter2.set_value(value != null ? value.getAmount() : null);
        }
        Iterator<T> it3 = getParameters().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (L.f(((ParameterSlot) next3).getId(), DeliverySubsidiesSlotKt.ORIGINAL_AMOUNT)) {
                    break;
                }
            }
        }
        CharParameter charParameter3 = next3 instanceof CharParameter ? (CharParameter) next3 : null;
        if (charParameter3 != null) {
            charParameter3.set_value(value != null ? value.getOriginalAmount() : null);
        }
        Iterator<T> it4 = getParameters().iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it4.next();
                if (L.f(((ParameterSlot) next4).getId(), DeliverySubsidiesSlotKt.VALIDATION_TOKEN)) {
                    break;
                }
            }
        }
        CharParameter charParameter4 = next4 instanceof CharParameter ? (CharParameter) next4 : null;
        if (charParameter4 != null) {
            charParameter4.set_value(value != null ? value.getValidationToken() : null);
        }
        Iterator<T> it5 = getParameters().iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            } else {
                next5 = it5.next();
                if (L.f(((ParameterSlot) next5).getId(), DeliverySubsidiesSlotKt.PROMO_CAMPAIGN_ID)) {
                    break;
                }
            }
        }
        CharParameter charParameter5 = next5 instanceof CharParameter ? (CharParameter) next5 : null;
        if (charParameter5 == null) {
            return;
        }
        charParameter5.set_value(value != null ? value.getPromoCampaignId() : null);
    }
}
