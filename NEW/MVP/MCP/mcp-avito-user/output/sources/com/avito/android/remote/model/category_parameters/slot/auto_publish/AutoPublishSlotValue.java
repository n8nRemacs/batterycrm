package com.avito.android.remote.model.category_parameters.slot.auto_publish;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoPublishSlotValue.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "autoPublish", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/auto_publish/AutoPublishSlotValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getAutoPublish", "setAutoPublish", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoPublishSlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<AutoPublishSlotValue> CREATOR = new Creator();

    @c("autoPublish")
    @l
    private Boolean autoPublish;

    /* compiled from: AutoPublishSlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoPublishSlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoPublishSlotValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoPublishSlotValue(boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoPublishSlotValue[] newArray(int i12) {
            return new AutoPublishSlotValue[i12];
        }
    }

    public AutoPublishSlotValue(@l Boolean bool) {
        this.autoPublish = bool;
    }

    public static /* synthetic */ AutoPublishSlotValue copy$default(AutoPublishSlotValue autoPublishSlotValue, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = autoPublishSlotValue.autoPublish;
        }
        return autoPublishSlotValue.copy(bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getAutoPublish() {
        return this.autoPublish;
    }

    @k
    public final AutoPublishSlotValue copy(@l Boolean autoPublish) {
        return new AutoPublishSlotValue(autoPublish);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoPublishSlotValue) && L.f(this.autoPublish, ((AutoPublishSlotValue) other).autoPublish);
    }

    @l
    public final Boolean getAutoPublish() {
        return this.autoPublish;
    }

    public int hashCode() {
        Boolean bool = this.autoPublish;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final void setAutoPublish(@l Boolean bool) {
        this.autoPublish = bool;
    }

    @k
    public String toString() {
        return C0.g(new StringBuilder("AutoPublishSlotValue(autoPublish="), this.autoPublish, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.autoPublish;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
