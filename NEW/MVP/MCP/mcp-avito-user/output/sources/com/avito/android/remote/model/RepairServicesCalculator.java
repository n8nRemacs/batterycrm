package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RepairServicesCalculator.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/RepairServicesCalculator;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/RepairPrices;", "prices", "", "flatArea", "", "isFlatNew", "Lcom/avito/android/deep_linking/links/DeepLink;", "priceBottomSheetDeeplink", "<init>", "(Lcom/avito/android/remote/model/RepairPrices;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/RepairPrices;", "component2", "()Ljava/lang/Float;", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/RepairPrices;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/RepairServicesCalculator;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/RepairPrices;", "getPrices", "Ljava/lang/Float;", "getFlatArea", "Ljava/lang/Boolean;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getPriceBottomSheetDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RepairServicesCalculator implements Parcelable {

    @k
    public static final Parcelable.Creator<RepairServicesCalculator> CREATOR = new Creator();

    @c("flatArea")
    @l
    private final Float flatArea;

    @c("isFlatNew")
    @l
    private final Boolean isFlatNew;

    @c("priceBottomSheetDeeplink")
    @l
    private final DeepLink priceBottomSheetDeeplink;

    @c("prices")
    @l
    private final RepairPrices prices;

    /* compiled from: RepairServicesCalculator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RepairServicesCalculator> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RepairServicesCalculator createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf = null;
            RepairPrices repairPricesCreateFromParcel = parcel.readInt() == 0 ? null : RepairPrices.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RepairServicesCalculator(repairPricesCreateFromParcel, fValueOf, boolValueOf, (DeepLink) parcel.readParcelable(RepairServicesCalculator.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RepairServicesCalculator[] newArray(int i12) {
            return new RepairServicesCalculator[i12];
        }
    }

    public RepairServicesCalculator() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RepairServicesCalculator copy$default(RepairServicesCalculator repairServicesCalculator, RepairPrices repairPrices, Float f12, Boolean bool, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            repairPrices = repairServicesCalculator.prices;
        }
        if ((i12 & 2) != 0) {
            f12 = repairServicesCalculator.flatArea;
        }
        if ((i12 & 4) != 0) {
            bool = repairServicesCalculator.isFlatNew;
        }
        if ((i12 & 8) != 0) {
            deepLink = repairServicesCalculator.priceBottomSheetDeeplink;
        }
        return repairServicesCalculator.copy(repairPrices, f12, bool, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final RepairPrices getPrices() {
        return this.prices;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Float getFlatArea() {
        return this.flatArea;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsFlatNew() {
        return this.isFlatNew;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getPriceBottomSheetDeeplink() {
        return this.priceBottomSheetDeeplink;
    }

    @k
    public final RepairServicesCalculator copy(@l RepairPrices prices, @l Float flatArea, @l Boolean isFlatNew, @l DeepLink priceBottomSheetDeeplink) {
        return new RepairServicesCalculator(prices, flatArea, isFlatNew, priceBottomSheetDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepairServicesCalculator)) {
            return false;
        }
        RepairServicesCalculator repairServicesCalculator = (RepairServicesCalculator) other;
        return L.f(this.prices, repairServicesCalculator.prices) && L.f(this.flatArea, repairServicesCalculator.flatArea) && L.f(this.isFlatNew, repairServicesCalculator.isFlatNew) && L.f(this.priceBottomSheetDeeplink, repairServicesCalculator.priceBottomSheetDeeplink);
    }

    @l
    public final Float getFlatArea() {
        return this.flatArea;
    }

    @l
    public final DeepLink getPriceBottomSheetDeeplink() {
        return this.priceBottomSheetDeeplink;
    }

    @l
    public final RepairPrices getPrices() {
        return this.prices;
    }

    public int hashCode() {
        RepairPrices repairPrices = this.prices;
        int iHashCode = (repairPrices == null ? 0 : repairPrices.hashCode()) * 31;
        Float f12 = this.flatArea;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool = this.isFlatNew;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.priceBottomSheetDeeplink;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @l
    public final Boolean isFlatNew() {
        return this.isFlatNew;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RepairServicesCalculator(prices=");
        sb2.append(this.prices);
        sb2.append(", flatArea=");
        sb2.append(this.flatArea);
        sb2.append(", isFlatNew=");
        sb2.append(this.isFlatNew);
        sb2.append(", priceBottomSheetDeeplink=");
        return a.v(sb2, this.priceBottomSheetDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        RepairPrices repairPrices = this.prices;
        if (repairPrices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            repairPrices.writeToParcel(parcel, flags);
        }
        Float f12 = this.flatArea;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Boolean bool = this.isFlatNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.priceBottomSheetDeeplink, flags);
    }

    public RepairServicesCalculator(@l RepairPrices repairPrices, @l Float f12, @l Boolean bool, @l DeepLink deepLink) {
        this.prices = repairPrices;
        this.flatArea = f12;
        this.isFlatNew = bool;
        this.priceBottomSheetDeeplink = deepLink;
    }

    public /* synthetic */ RepairServicesCalculator(RepairPrices repairPrices, Float f12, Boolean bool, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : repairPrices, (i12 & 2) != 0 ? null : f12, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : deepLink);
    }
}
