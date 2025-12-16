package com.avito.android.remote.model.filters_parameter.slot;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import com.avito.android.remote.model.filters_parameter.slot.SlotConfig;
import com.avito.android.remote.model.filters_parameter.slot.SlotValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SlotWithValue.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00018\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/slot/SlotWithValue;", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;", "W", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotValue;", "T", "Lcom/avito/android/remote/model/filters_parameter/slot/Slot;", "", "id", "label", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/filters_parameter/slot/SlotWidget;Lcom/avito/android/remote/model/filters_parameter/slot/SlotValue;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "initWidget", "(Lcom/avito/android/remote/model/filters_parameter/slot/SlotWidget;Lcom/avito/android/remote/model/filters_parameter/slot/SlotValue;)V", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotValue;", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SlotWithValue<W extends SlotConfig, T extends SlotValue> extends Slot<W> {

    @c("value")
    @l
    private final T value;

    public SlotWithValue(@k String str, @k String str2, @k SlotWidget<W> slotWidget, @l T t12) {
        super(str, str2, slotWidget);
        this.value = t12;
    }

    public abstract void initWidget(@k SlotWidget<W> widget, @l T value);

    @Override // com.avito.android.remote.model.filters_parameter.slot.Slot, android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(this.value, flags);
    }
}
