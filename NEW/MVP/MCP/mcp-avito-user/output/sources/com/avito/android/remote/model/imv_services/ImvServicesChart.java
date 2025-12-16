package com.avito.android.remote.model.imv_services;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServices.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/imv_services/ImvServicesChart;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;", "pricesGroup", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeBorder;", "border", "", "pointPosition", "", "price", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeTitle;", "title", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;", "type", "<init>", "(Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeBorder;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeTitle;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;)V", "component1", "()Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;", "component2", "()Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeBorder;", "component3", "()Ljava/lang/Float;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeTitle;", "component6", "()Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;", "copy", "(Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeBorder;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeTitle;Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;)Lcom/avito/android/remote/model/imv_services/ImvServicesChart;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/imv_services/ImvServicesPricesGroup;", "getPricesGroup", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeBorder;", "getBorder", "Ljava/lang/Float;", "getPointPosition", "Ljava/lang/String;", "getPrice", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeTitle;", "getTitle", "Lcom/avito/android/remote/model/imv_services/ImvServicesPriceRangeType;", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvServicesChart implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvServicesChart> CREATOR = new Creator();

    @c("border")
    @l
    private final ImvServicesPriceRangeBorder border;

    @c("pointPosition")
    @l
    private final Float pointPosition;

    @c("price")
    @l
    private final String price;

    @c("pricesGroup")
    @l
    private final ImvServicesPricesGroup pricesGroup;

    @c("title")
    @l
    private final ImvServicesPriceRangeTitle title;

    @c("type")
    @k
    private final ImvServicesPriceRangeType type;

    /* compiled from: ImvServices.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImvServicesChart> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesChart createFromParcel(@k Parcel parcel) {
            return new ImvServicesChart(parcel.readInt() == 0 ? null : ImvServicesPricesGroup.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImvServicesPriceRangeBorder.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() != 0 ? ImvServicesPriceRangeTitle.CREATOR.createFromParcel(parcel) : null, ImvServicesPriceRangeType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImvServicesChart[] newArray(int i12) {
            return new ImvServicesChart[i12];
        }
    }

    public ImvServicesChart(@l ImvServicesPricesGroup imvServicesPricesGroup, @l ImvServicesPriceRangeBorder imvServicesPriceRangeBorder, @l Float f12, @l String str, @l ImvServicesPriceRangeTitle imvServicesPriceRangeTitle, @k ImvServicesPriceRangeType imvServicesPriceRangeType) {
        this.pricesGroup = imvServicesPricesGroup;
        this.border = imvServicesPriceRangeBorder;
        this.pointPosition = f12;
        this.price = str;
        this.title = imvServicesPriceRangeTitle;
        this.type = imvServicesPriceRangeType;
    }

    public static /* synthetic */ ImvServicesChart copy$default(ImvServicesChart imvServicesChart, ImvServicesPricesGroup imvServicesPricesGroup, ImvServicesPriceRangeBorder imvServicesPriceRangeBorder, Float f12, String str, ImvServicesPriceRangeTitle imvServicesPriceRangeTitle, ImvServicesPriceRangeType imvServicesPriceRangeType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            imvServicesPricesGroup = imvServicesChart.pricesGroup;
        }
        if ((i12 & 2) != 0) {
            imvServicesPriceRangeBorder = imvServicesChart.border;
        }
        ImvServicesPriceRangeBorder imvServicesPriceRangeBorder2 = imvServicesPriceRangeBorder;
        if ((i12 & 4) != 0) {
            f12 = imvServicesChart.pointPosition;
        }
        Float f13 = f12;
        if ((i12 & 8) != 0) {
            str = imvServicesChart.price;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            imvServicesPriceRangeTitle = imvServicesChart.title;
        }
        ImvServicesPriceRangeTitle imvServicesPriceRangeTitle2 = imvServicesPriceRangeTitle;
        if ((i12 & 32) != 0) {
            imvServicesPriceRangeType = imvServicesChart.type;
        }
        return imvServicesChart.copy(imvServicesPricesGroup, imvServicesPriceRangeBorder2, f13, str2, imvServicesPriceRangeTitle2, imvServicesPriceRangeType);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ImvServicesPricesGroup getPricesGroup() {
        return this.pricesGroup;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ImvServicesPriceRangeBorder getBorder() {
        return this.border;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Float getPointPosition() {
        return this.pointPosition;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ImvServicesPriceRangeTitle getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final ImvServicesPriceRangeType getType() {
        return this.type;
    }

    @k
    public final ImvServicesChart copy(@l ImvServicesPricesGroup pricesGroup, @l ImvServicesPriceRangeBorder border, @l Float pointPosition, @l String price, @l ImvServicesPriceRangeTitle title, @k ImvServicesPriceRangeType type) {
        return new ImvServicesChart(pricesGroup, border, pointPosition, price, title, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImvServicesChart)) {
            return false;
        }
        ImvServicesChart imvServicesChart = (ImvServicesChart) other;
        return L.f(this.pricesGroup, imvServicesChart.pricesGroup) && L.f(this.border, imvServicesChart.border) && L.f(this.pointPosition, imvServicesChart.pointPosition) && L.f(this.price, imvServicesChart.price) && L.f(this.title, imvServicesChart.title) && this.type == imvServicesChart.type;
    }

    @l
    public final ImvServicesPriceRangeBorder getBorder() {
        return this.border;
    }

    @l
    public final Float getPointPosition() {
        return this.pointPosition;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final ImvServicesPricesGroup getPricesGroup() {
        return this.pricesGroup;
    }

    @l
    public final ImvServicesPriceRangeTitle getTitle() {
        return this.title;
    }

    @k
    public final ImvServicesPriceRangeType getType() {
        return this.type;
    }

    public int hashCode() {
        ImvServicesPricesGroup imvServicesPricesGroup = this.pricesGroup;
        int iHashCode = (imvServicesPricesGroup == null ? 0 : imvServicesPricesGroup.hashCode()) * 31;
        ImvServicesPriceRangeBorder imvServicesPriceRangeBorder = this.border;
        int iHashCode2 = (iHashCode + (imvServicesPriceRangeBorder == null ? 0 : imvServicesPriceRangeBorder.hashCode())) * 31;
        Float f12 = this.pointPosition;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str = this.price;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ImvServicesPriceRangeTitle imvServicesPriceRangeTitle = this.title;
        return this.type.hashCode() + ((iHashCode4 + (imvServicesPriceRangeTitle != null ? imvServicesPriceRangeTitle.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "ImvServicesChart(pricesGroup=" + this.pricesGroup + ", border=" + this.border + ", pointPosition=" + this.pointPosition + ", price=" + this.price + ", title=" + this.title + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        ImvServicesPricesGroup imvServicesPricesGroup = this.pricesGroup;
        if (imvServicesPricesGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesPricesGroup.writeToParcel(parcel, flags);
        }
        ImvServicesPriceRangeBorder imvServicesPriceRangeBorder = this.border;
        if (imvServicesPriceRangeBorder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesPriceRangeBorder.writeToParcel(parcel, flags);
        }
        Float f12 = this.pointPosition;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.price);
        ImvServicesPriceRangeTitle imvServicesPriceRangeTitle = this.title;
        if (imvServicesPriceRangeTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvServicesPriceRangeTitle.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.type.name());
    }
}
