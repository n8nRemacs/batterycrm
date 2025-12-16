package com.avito.android.remote.model.filters_parameter.slot;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.filters_parameter.adapter.SlotTypeAdapter;
import com.avito.android.remote.model.filters_parameter.slot.SlotConfig;
import com.google.gson.annotations.b;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotWidget.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/filters_parameter/slot/SlotWidget;", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;", "T", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "type", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;)V", "component1", "()Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "component2", "()Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;", "copy", "(Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;)Lcom/avito/android/remote/model/filters_parameter/slot/SlotWidget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotType;", "getType", "Lcom/avito/android/remote/model/filters_parameter/slot/SlotConfig;", "getConfig", "_avito-discouraged_avito-api_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SlotWidget<T extends SlotConfig> implements Parcelable {

    @k
    public static final Parcelable.Creator<SlotWidget<?>> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @k
    private final T config;

    @c("type")
    @b(SlotTypeAdapter.class)
    @k
    private final SlotType type;

    /* compiled from: SlotWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SlotWidget<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SlotWidget<?> createFromParcel(@k Parcel parcel) {
            return new SlotWidget<>(SlotType.valueOf(parcel.readString()), (SlotConfig) parcel.readParcelable(SlotWidget.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SlotWidget<?>[] newArray(int i12) {
            return new SlotWidget[i12];
        }
    }

    public SlotWidget(@k SlotType slotType, @k T t12) {
        this.type = slotType;
        this.config = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotWidget copy$default(SlotWidget slotWidget, SlotType slotType, SlotConfig slotConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            slotType = slotWidget.type;
        }
        if ((i12 & 2) != 0) {
            slotConfig = slotWidget.config;
        }
        return slotWidget.copy(slotType, slotConfig);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final SlotType getType() {
        return this.type;
    }

    @k
    public final T component2() {
        return this.config;
    }

    @k
    public final SlotWidget<T> copy(@k SlotType type, @k T config) {
        return new SlotWidget<>(type, config);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotWidget)) {
            return false;
        }
        SlotWidget slotWidget = (SlotWidget) other;
        return this.type == slotWidget.type && L.f(this.config, slotWidget.config);
    }

    @k
    public final T getConfig() {
        return this.config;
    }

    @k
    public final SlotType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "SlotWidget(type=" + this.type + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        parcel.writeParcelable(this.config, flags);
    }
}
