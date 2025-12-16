package com.avito.android.remote.model.category_parameters.slot.delivery_subsidies;

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

/* compiled from: DeliverySubsidySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;)Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_subsidies/DeliverySubsidyBadgeStyle;", "getStyle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliverySubsidyBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliverySubsidyBadge> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final DeliverySubsidyBadgeStyle style;

    @c("title")
    @l
    private final String title;

    /* compiled from: DeliverySubsidySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliverySubsidyBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidyBadge createFromParcel(@k Parcel parcel) {
            return new DeliverySubsidyBadge(parcel.readString(), parcel.readInt() == 0 ? null : DeliverySubsidyBadgeStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliverySubsidyBadge[] newArray(int i12) {
            return new DeliverySubsidyBadge[i12];
        }
    }

    public DeliverySubsidyBadge(@l String str, @l DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle) {
        this.title = str;
        this.style = deliverySubsidyBadgeStyle;
    }

    public static /* synthetic */ DeliverySubsidyBadge copy$default(DeliverySubsidyBadge deliverySubsidyBadge, String str, DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliverySubsidyBadge.title;
        }
        if ((i12 & 2) != 0) {
            deliverySubsidyBadgeStyle = deliverySubsidyBadge.style;
        }
        return deliverySubsidyBadge.copy(str, deliverySubsidyBadgeStyle);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeliverySubsidyBadgeStyle getStyle() {
        return this.style;
    }

    @k
    public final DeliverySubsidyBadge copy(@l String title, @l DeliverySubsidyBadgeStyle style) {
        return new DeliverySubsidyBadge(title, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliverySubsidyBadge)) {
            return false;
        }
        DeliverySubsidyBadge deliverySubsidyBadge = (DeliverySubsidyBadge) other;
        return L.f(this.title, deliverySubsidyBadge.title) && L.f(this.style, deliverySubsidyBadge.style);
    }

    @l
    public final DeliverySubsidyBadgeStyle getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle = this.style;
        return iHashCode + (deliverySubsidyBadgeStyle != null ? deliverySubsidyBadgeStyle.hashCode() : 0);
    }

    @k
    public String toString() {
        return "DeliverySubsidyBadge(title=" + this.title + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        DeliverySubsidyBadgeStyle deliverySubsidyBadgeStyle = this.style;
        if (deliverySubsidyBadgeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliverySubsidyBadgeStyle.writeToParcel(parcel, flags);
        }
    }
}
