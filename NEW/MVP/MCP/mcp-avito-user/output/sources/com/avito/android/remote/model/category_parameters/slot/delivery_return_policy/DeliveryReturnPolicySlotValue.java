package com.avito.android.remote.model.category_parameters.slot.delivery_return_policy;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryReturnPolicySlotValue.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotValue;", "", "returnPolicyToggle", "", "returnPolicy", "", "availablePolicies", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlotValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getReturnPolicyToggle", "Ljava/lang/String;", "getReturnPolicy", "Ljava/util/List;", "getAvailablePolicies", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryReturnPolicySlotValue implements SlotValue {

    @k
    public static final Parcelable.Creator<DeliveryReturnPolicySlotValue> CREATOR = new Creator();

    @c("availablePolicies")
    @l
    private final List<String> availablePolicies;

    @c("returnPolicy")
    @l
    private final String returnPolicy;

    @c("returnPolicyToggle")
    @l
    private final Boolean returnPolicyToggle;

    /* compiled from: DeliveryReturnPolicySlotValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryReturnPolicySlotValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicySlotValue createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeliveryReturnPolicySlotValue(boolValueOf, parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicySlotValue[] newArray(int i12) {
            return new DeliveryReturnPolicySlotValue[i12];
        }
    }

    public DeliveryReturnPolicySlotValue(@l Boolean bool, @l String str, @l List<String> list) {
        this.returnPolicyToggle = bool;
        this.returnPolicy = str;
        this.availablePolicies = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryReturnPolicySlotValue copy$default(DeliveryReturnPolicySlotValue deliveryReturnPolicySlotValue, Boolean bool, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = deliveryReturnPolicySlotValue.returnPolicyToggle;
        }
        if ((i12 & 2) != 0) {
            str = deliveryReturnPolicySlotValue.returnPolicy;
        }
        if ((i12 & 4) != 0) {
            list = deliveryReturnPolicySlotValue.availablePolicies;
        }
        return deliveryReturnPolicySlotValue.copy(bool, str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getReturnPolicyToggle() {
        return this.returnPolicyToggle;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getReturnPolicy() {
        return this.returnPolicy;
    }

    @l
    public final List<String> component3() {
        return this.availablePolicies;
    }

    @k
    public final DeliveryReturnPolicySlotValue copy(@l Boolean returnPolicyToggle, @l String returnPolicy, @l List<String> availablePolicies) {
        return new DeliveryReturnPolicySlotValue(returnPolicyToggle, returnPolicy, availablePolicies);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReturnPolicySlotValue)) {
            return false;
        }
        DeliveryReturnPolicySlotValue deliveryReturnPolicySlotValue = (DeliveryReturnPolicySlotValue) other;
        return L.f(this.returnPolicyToggle, deliveryReturnPolicySlotValue.returnPolicyToggle) && L.f(this.returnPolicy, deliveryReturnPolicySlotValue.returnPolicy) && L.f(this.availablePolicies, deliveryReturnPolicySlotValue.availablePolicies);
    }

    @l
    public final List<String> getAvailablePolicies() {
        return this.availablePolicies;
    }

    @l
    public final String getReturnPolicy() {
        return this.returnPolicy;
    }

    @l
    public final Boolean getReturnPolicyToggle() {
        return this.returnPolicyToggle;
    }

    public int hashCode() {
        Boolean bool = this.returnPolicyToggle;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.returnPolicy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.availablePolicies;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryReturnPolicySlotValue(returnPolicyToggle=");
        sb2.append(this.returnPolicyToggle);
        sb2.append(", returnPolicy=");
        sb2.append(this.returnPolicy);
        sb2.append(", availablePolicies=");
        return H.p(sb2, this.availablePolicies, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.returnPolicyToggle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.returnPolicy);
        parcel.writeStringList(this.availablePolicies);
    }
}
