package com.avito.android.remote.model.category_parameters.slot.delivery_return_policy_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryReturnPolicyBlockSlotConfig.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotField;", "Landroid/os/Parcelable;", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy_block/DeliveryReturnPolicyBlockSlotField;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryReturnPolicyBlockSlotField implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryReturnPolicyBlockSlotField> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    /* compiled from: DeliveryReturnPolicyBlockSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryReturnPolicyBlockSlotField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicyBlockSlotField createFromParcel(@k Parcel parcel) {
            return new DeliveryReturnPolicyBlockSlotField(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryReturnPolicyBlockSlotField[] newArray(int i12) {
            return new DeliveryReturnPolicyBlockSlotField[i12];
        }
    }

    public DeliveryReturnPolicyBlockSlotField(@k String str) {
        this.id = str;
    }

    public static /* synthetic */ DeliveryReturnPolicyBlockSlotField copy$default(DeliveryReturnPolicyBlockSlotField deliveryReturnPolicyBlockSlotField, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryReturnPolicyBlockSlotField.id;
        }
        return deliveryReturnPolicyBlockSlotField.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final DeliveryReturnPolicyBlockSlotField copy(@k String id2) {
        return new DeliveryReturnPolicyBlockSlotField(id2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryReturnPolicyBlockSlotField) && L.f(this.id, ((DeliveryReturnPolicyBlockSlotField) other).id);
    }

    @k
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("DeliveryReturnPolicyBlockSlotField(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
    }
}
