package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0002*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u008e\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b*\u0010$J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u0014R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u0014R\u0013\u0010>\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u0014¨\u0006?"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "developmentId", "areaTo", "areaFrom", "priceTo", "priceFrom", "completionDateFrom", "completionDateTo", "", "roomsTypeIds", "finishTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateCompletionDate;", "toStringId", "(Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateCompletionDate;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLocationId", "getDevelopmentId", "getAreaTo", "getAreaFrom", "getPriceTo", "getPriceFrom", "getCompletionDateFrom", "getCompletionDateTo", "Ljava/util/List;", "getRoomsTypeIds", "getFinishTypeId", "getSelectedCompletionDateId", "selectedCompletionDateId", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateFilterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateFilterState> CREATOR = new a();

    @Y61.l
    private final String areaFrom;

    @Y61.l
    private final String areaTo;

    @Y61.l
    private final String completionDateFrom;

    @Y61.l
    private final String completionDateTo;

    @Y61.l
    private final String developmentId;

    @Y61.l
    private final String finishTypeId;

    @Y61.l
    private final String locationId;

    @Y61.l
    private final String priceFrom;

    @Y61.l
    private final String priceTo;

    @Y61.l
    private final List<String> roomsTypeIds;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateFilterState> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateFilterState createFromParcel(Parcel parcel) {
            return new RealEstateFilterState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateFilterState[] newArray(int i12) {
            return new RealEstateFilterState[i12];
        }
    }

    public RealEstateFilterState(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l List<String> list, @Y61.l String str9) {
        this.locationId = str;
        this.developmentId = str2;
        this.areaTo = str3;
        this.areaFrom = str4;
        this.priceTo = str5;
        this.priceFrom = str6;
        this.completionDateFrom = str7;
        this.completionDateTo = str8;
        this.roomsTypeIds = list;
        this.finishTypeId = str9;
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final String getFinishTypeId() {
        return this.finishTypeId;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getAreaTo() {
        return this.areaTo;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final String getAreaFrom() {
        return this.areaFrom;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final String getPriceTo() {
        return this.priceTo;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final String getPriceFrom() {
        return this.priceFrom;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final String getCompletionDateFrom() {
        return this.completionDateFrom;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final String getCompletionDateTo() {
        return this.completionDateTo;
    }

    @Y61.l
    public final List<String> component9() {
        return this.roomsTypeIds;
    }

    @Y61.k
    public final RealEstateFilterState copy(@Y61.l String locationId, @Y61.l String developmentId, @Y61.l String areaTo, @Y61.l String areaFrom, @Y61.l String priceTo, @Y61.l String priceFrom, @Y61.l String completionDateFrom, @Y61.l String completionDateTo, @Y61.l List<String> roomsTypeIds, @Y61.l String finishTypeId) {
        return new RealEstateFilterState(locationId, developmentId, areaTo, areaFrom, priceTo, priceFrom, completionDateFrom, completionDateTo, roomsTypeIds, finishTypeId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateFilterState)) {
            return false;
        }
        RealEstateFilterState realEstateFilterState = (RealEstateFilterState) other;
        return L.f(this.locationId, realEstateFilterState.locationId) && L.f(this.developmentId, realEstateFilterState.developmentId) && L.f(this.areaTo, realEstateFilterState.areaTo) && L.f(this.areaFrom, realEstateFilterState.areaFrom) && L.f(this.priceTo, realEstateFilterState.priceTo) && L.f(this.priceFrom, realEstateFilterState.priceFrom) && L.f(this.completionDateFrom, realEstateFilterState.completionDateFrom) && L.f(this.completionDateTo, realEstateFilterState.completionDateTo) && L.f(this.roomsTypeIds, realEstateFilterState.roomsTypeIds) && L.f(this.finishTypeId, realEstateFilterState.finishTypeId);
    }

    @Y61.l
    public final String getAreaFrom() {
        return this.areaFrom;
    }

    @Y61.l
    public final String getAreaTo() {
        return this.areaTo;
    }

    @Y61.l
    public final String getCompletionDateFrom() {
        return this.completionDateFrom;
    }

    @Y61.l
    public final String getCompletionDateTo() {
        return this.completionDateTo;
    }

    @Y61.l
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @Y61.l
    public final String getFinishTypeId() {
        return this.finishTypeId;
    }

    @Y61.l
    public final String getLocationId() {
        return this.locationId;
    }

    @Y61.l
    public final String getPriceFrom() {
        return this.priceFrom;
    }

    @Y61.l
    public final String getPriceTo() {
        return this.priceTo;
    }

    @Y61.l
    public final List<String> getRoomsTypeIds() {
        return this.roomsTypeIds;
    }

    @Y61.l
    public final String getSelectedCompletionDateId() {
        String str = this.completionDateFrom;
        if (str == null && this.completionDateTo == null) {
            return null;
        }
        return D.a(str, this.completionDateTo);
    }

    public int hashCode() {
        String str = this.locationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.developmentId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.areaTo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.areaFrom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceTo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.priceFrom;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.completionDateFrom;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.completionDateTo;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.roomsTypeIds;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.finishTypeId;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateFilterState(locationId=");
        sb2.append(this.locationId);
        sb2.append(", developmentId=");
        sb2.append(this.developmentId);
        sb2.append(", areaTo=");
        sb2.append(this.areaTo);
        sb2.append(", areaFrom=");
        sb2.append(this.areaFrom);
        sb2.append(", priceTo=");
        sb2.append(this.priceTo);
        sb2.append(", priceFrom=");
        sb2.append(this.priceFrom);
        sb2.append(", completionDateFrom=");
        sb2.append(this.completionDateFrom);
        sb2.append(", completionDateTo=");
        sb2.append(this.completionDateTo);
        sb2.append(", roomsTypeIds=");
        sb2.append(this.roomsTypeIds);
        sb2.append(", finishTypeId=");
        return C22026a.c(sb2, this.finishTypeId, ')');
    }

    @Y61.k
    public final String toStringId(@Y61.k RealEstateCompletionDate realEstateCompletionDate) {
        return D.a(realEstateCompletionDate.getFrom(), realEstateCompletionDate.getTo());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.locationId);
        parcel.writeString(this.developmentId);
        parcel.writeString(this.areaTo);
        parcel.writeString(this.areaFrom);
        parcel.writeString(this.priceTo);
        parcel.writeString(this.priceFrom);
        parcel.writeString(this.completionDateFrom);
        parcel.writeString(this.completionDateTo);
        parcel.writeStringList(this.roomsTypeIds);
        parcel.writeString(this.finishTypeId);
    }

    public /* synthetic */ RealEstateFilterState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : list, (i12 & 512) == 0 ? str9 : null);
    }
}
