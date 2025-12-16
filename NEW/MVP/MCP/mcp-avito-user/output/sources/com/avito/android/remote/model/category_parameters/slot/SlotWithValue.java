package com.avito.android.remote.model.category_parameters.slot;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotWithValue.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00052\u00020\u0006B/\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\u0012\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00018\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "W", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "T", "Lcom/avito/android/remote/model/category_parameters/slot/Slot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithState;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;)V", "Lkotlin/G0;", "initWidget$_avito_discouraged_avito_api_publish", "()V", "initWidget", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SlotWithValue<W extends SlotConfig, T extends SlotValue> extends Slot<W> implements SlotWithState {

    @c("value")
    @l
    private final T value;

    public SlotWithValue(@k String str, @k String str2, @k SlotWidget<W> slotWidget, @l T t12) {
        super(str, str2, slotWidget);
        this.value = t12;
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.Slot
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        SlotWithValue slotWithValue = (SlotWithValue) other;
        return L.f(getId(), slotWithValue.getId()) && L.f(getLabel(), slotWithValue.getLabel()) && L.f(getWidget(), slotWithValue.getWidget()) && L.f(this.value, slotWithValue.value);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithState
    @k
    public List<ParameterSlot> getState() {
        return SlotWithState.DefaultImpls.getState(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.Slot
    public int hashCode() {
        int iHashCode = (getWidget().hashCode() + ((getLabel().hashCode() + (getId().hashCode() * 31)) * 31)) * 31;
        T t12 = this.value;
        return iHashCode + (t12 != null ? t12.hashCode() : 0);
    }

    public abstract void initWidget(@k SlotWidget<W> widget, @l T value);

    public final void initWidget$_avito_discouraged_avito_api_publish() {
        initWidget(getWidget(), this.value);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.Slot, android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.value, flags);
    }
}
