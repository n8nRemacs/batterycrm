package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrPayload.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/StrPayload;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;", "childrenPayload", "Lcom/avito/android/remote/model/category_parameters/StrDiscountsPayload;", "discounts", "<init>", "(Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;Lcom/avito/android/remote/model/category_parameters/StrDiscountsPayload;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;", "component2", "()Lcom/avito/android/remote/model/category_parameters/StrDiscountsPayload;", "copy", "(Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;Lcom/avito/android/remote/model/category_parameters/StrDiscountsPayload;)Lcom/avito/android/remote/model/category_parameters/StrPayload;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/StrChildrenPayload;", "getChildrenPayload", "Lcom/avito/android/remote/model/category_parameters/StrDiscountsPayload;", "getDiscounts", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<StrPayload> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final StrChildrenPayload childrenPayload;

    @c("discounts")
    @l
    private final StrDiscountsPayload discounts;

    /* compiled from: StrPayload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrPayload createFromParcel(@k Parcel parcel) {
            return new StrPayload(parcel.readInt() == 0 ? null : StrChildrenPayload.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StrDiscountsPayload.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrPayload[] newArray(int i12) {
            return new StrPayload[i12];
        }
    }

    public StrPayload(@l StrChildrenPayload strChildrenPayload, @l StrDiscountsPayload strDiscountsPayload) {
        this.childrenPayload = strChildrenPayload;
        this.discounts = strDiscountsPayload;
    }

    public static /* synthetic */ StrPayload copy$default(StrPayload strPayload, StrChildrenPayload strChildrenPayload, StrDiscountsPayload strDiscountsPayload, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            strChildrenPayload = strPayload.childrenPayload;
        }
        if ((i12 & 2) != 0) {
            strDiscountsPayload = strPayload.discounts;
        }
        return strPayload.copy(strChildrenPayload, strDiscountsPayload);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final StrChildrenPayload getChildrenPayload() {
        return this.childrenPayload;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final StrDiscountsPayload getDiscounts() {
        return this.discounts;
    }

    @k
    public final StrPayload copy(@l StrChildrenPayload childrenPayload, @l StrDiscountsPayload discounts) {
        return new StrPayload(childrenPayload, discounts);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrPayload)) {
            return false;
        }
        StrPayload strPayload = (StrPayload) other;
        return L.f(this.childrenPayload, strPayload.childrenPayload) && L.f(this.discounts, strPayload.discounts);
    }

    @l
    public final StrChildrenPayload getChildrenPayload() {
        return this.childrenPayload;
    }

    @l
    public final StrDiscountsPayload getDiscounts() {
        return this.discounts;
    }

    public int hashCode() {
        StrChildrenPayload strChildrenPayload = this.childrenPayload;
        int iHashCode = (strChildrenPayload == null ? 0 : strChildrenPayload.hashCode()) * 31;
        StrDiscountsPayload strDiscountsPayload = this.discounts;
        return iHashCode + (strDiscountsPayload != null ? strDiscountsPayload.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrPayload(childrenPayload=" + this.childrenPayload + ", discounts=" + this.discounts + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        StrChildrenPayload strChildrenPayload = this.childrenPayload;
        if (strChildrenPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strChildrenPayload.writeToParcel(parcel, flags);
        }
        StrDiscountsPayload strDiscountsPayload = this.discounts;
        if (strDiscountsPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strDiscountsPayload.writeToParcel(parcel, flags);
        }
    }
}
