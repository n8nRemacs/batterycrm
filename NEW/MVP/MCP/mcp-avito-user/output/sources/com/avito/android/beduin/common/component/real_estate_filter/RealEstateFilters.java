package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0082\u0001\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b1\u00102R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u0010\u0019R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b7\u0010\u0019R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b;\u0010\u001f¨\u0006<"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateLocation;", "locations", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateDevelopment;", "developments", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateCompletionDate;", "completionDates", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRoomType;", "roomsTypes", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFinishType;", "finishTypes", "", "maxPrice", "maxArea", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findDefaultDevelopmentValue", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateDevelopment;", "", "developmentId", "findDevelopment", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateDevelopment;", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getLocations", "getDevelopments", "getCompletionDates", "getRoomsTypes", "getFinishTypes", "Ljava/lang/Integer;", "getMaxPrice", "getMaxArea", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class RealEstateFilters implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateFilters> CREATOR = new a();

    @Y61.l
    private final List<RealEstateCompletionDate> completionDates;

    @Y61.l
    private final List<RealEstateDevelopment> developments;

    @Y61.l
    private final List<RealEstateFinishType> finishTypes;

    @Y61.l
    private final List<RealEstateLocation> locations;

    @Y61.l
    private final Integer maxArea;

    @Y61.l
    private final Integer maxPrice;

    @Y61.l
    private final List<RealEstateRoomType> roomsTypes;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateFilters> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateFilters createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(RealEstateLocation.CREATOR, parcel, arrayList6, iC3, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i13);
                int iC4 = 0;
                while (iC4 != i13) {
                    iC4 = com.avito.android.actions_sheet.a.c(RealEstateDevelopment.CREATOR, parcel, arrayList7, iC4, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i14);
                int iC5 = 0;
                while (iC5 != i14) {
                    iC5 = com.avito.android.actions_sheet.a.c(RealEstateCompletionDate.CREATOR, parcel, arrayList8, iC5, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i15);
                int iC6 = 0;
                while (iC6 != i15) {
                    iC6 = com.avito.android.actions_sheet.a.c(RealEstateRoomType.CREATOR, parcel, arrayList9, iC6, 1);
                }
                arrayList4 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i16);
                while (iC2 != i16) {
                    iC2 = com.avito.android.actions_sheet.a.c(RealEstateFinishType.CREATOR, parcel, arrayList10, iC2, 1);
                }
                arrayList5 = arrayList10;
            }
            return new RealEstateFilters(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateFilters[] newArray(int i12) {
            return new RealEstateFilters[i12];
        }
    }

    public RealEstateFilters(@Y61.l List<RealEstateLocation> list, @Y61.l List<RealEstateDevelopment> list2, @Y61.l List<RealEstateCompletionDate> list3, @Y61.l List<RealEstateRoomType> list4, @Y61.l List<RealEstateFinishType> list5, @Y61.l Integer num, @Y61.l Integer num2) {
        this.locations = list;
        this.developments = list2;
        this.completionDates = list3;
        this.roomsTypes = list4;
        this.finishTypes = list5;
        this.maxPrice = num;
        this.maxArea = num2;
    }

    public static /* synthetic */ RealEstateFilters copy$default(RealEstateFilters realEstateFilters, List list, List list2, List list3, List list4, List list5, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = realEstateFilters.locations;
        }
        if ((i12 & 2) != 0) {
            list2 = realEstateFilters.developments;
        }
        List list6 = list2;
        if ((i12 & 4) != 0) {
            list3 = realEstateFilters.completionDates;
        }
        List list7 = list3;
        if ((i12 & 8) != 0) {
            list4 = realEstateFilters.roomsTypes;
        }
        List list8 = list4;
        if ((i12 & 16) != 0) {
            list5 = realEstateFilters.finishTypes;
        }
        List list9 = list5;
        if ((i12 & 32) != 0) {
            num = realEstateFilters.maxPrice;
        }
        Integer num3 = num;
        if ((i12 & 64) != 0) {
            num2 = realEstateFilters.maxArea;
        }
        return realEstateFilters.copy(list, list6, list7, list8, list9, num3, num2);
    }

    @Y61.l
    public final List<RealEstateLocation> component1() {
        return this.locations;
    }

    @Y61.l
    public final List<RealEstateDevelopment> component2() {
        return this.developments;
    }

    @Y61.l
    public final List<RealEstateCompletionDate> component3() {
        return this.completionDates;
    }

    @Y61.l
    public final List<RealEstateRoomType> component4() {
        return this.roomsTypes;
    }

    @Y61.l
    public final List<RealEstateFinishType> component5() {
        return this.finishTypes;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final Integer getMaxPrice() {
        return this.maxPrice;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final Integer getMaxArea() {
        return this.maxArea;
    }

    @Y61.k
    public final RealEstateFilters copy(@Y61.l List<RealEstateLocation> locations, @Y61.l List<RealEstateDevelopment> developments, @Y61.l List<RealEstateCompletionDate> completionDates, @Y61.l List<RealEstateRoomType> roomsTypes, @Y61.l List<RealEstateFinishType> finishTypes, @Y61.l Integer maxPrice, @Y61.l Integer maxArea) {
        return new RealEstateFilters(locations, developments, completionDates, roomsTypes, finishTypes, maxPrice, maxArea);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateFilters)) {
            return false;
        }
        RealEstateFilters realEstateFilters = (RealEstateFilters) other;
        return L.f(this.locations, realEstateFilters.locations) && L.f(this.developments, realEstateFilters.developments) && L.f(this.completionDates, realEstateFilters.completionDates) && L.f(this.roomsTypes, realEstateFilters.roomsTypes) && L.f(this.finishTypes, realEstateFilters.finishTypes) && L.f(this.maxPrice, realEstateFilters.maxPrice) && L.f(this.maxArea, realEstateFilters.maxArea);
    }

    @Y61.l
    public final RealEstateDevelopment findDefaultDevelopmentValue() {
        List<RealEstateDevelopment> list = this.developments;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Boolean boolIsDefaultFilterValue = ((RealEstateDevelopment) next).isDefaultFilterValue();
            if (boolIsDefaultFilterValue != null ? boolIsDefaultFilterValue.booleanValue() : false) {
                obj = next;
                break;
            }
        }
        return (RealEstateDevelopment) obj;
    }

    @Y61.l
    public final RealEstateDevelopment findDevelopment(@Y61.k String developmentId) {
        List<RealEstateDevelopment> list = this.developments;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((RealEstateDevelopment) next).getId(), developmentId)) {
                obj = next;
                break;
            }
        }
        return (RealEstateDevelopment) obj;
    }

    @Y61.l
    public final List<RealEstateCompletionDate> getCompletionDates() {
        return this.completionDates;
    }

    @Y61.l
    public final List<RealEstateDevelopment> getDevelopments() {
        return this.developments;
    }

    @Y61.l
    public final List<RealEstateFinishType> getFinishTypes() {
        return this.finishTypes;
    }

    @Y61.l
    public final List<RealEstateLocation> getLocations() {
        return this.locations;
    }

    @Y61.l
    public final Integer getMaxArea() {
        return this.maxArea;
    }

    @Y61.l
    public final Integer getMaxPrice() {
        return this.maxPrice;
    }

    @Y61.l
    public final List<RealEstateRoomType> getRoomsTypes() {
        return this.roomsTypes;
    }

    public int hashCode() {
        List<RealEstateLocation> list = this.locations;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<RealEstateDevelopment> list2 = this.developments;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<RealEstateCompletionDate> list3 = this.completionDates;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<RealEstateRoomType> list4 = this.roomsTypes;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<RealEstateFinishType> list5 = this.finishTypes;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num = this.maxPrice;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxArea;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateFilters(locations=");
        sb2.append(this.locations);
        sb2.append(", developments=");
        sb2.append(this.developments);
        sb2.append(", completionDates=");
        sb2.append(this.completionDates);
        sb2.append(", roomsTypes=");
        sb2.append(this.roomsTypes);
        sb2.append(", finishTypes=");
        sb2.append(this.finishTypes);
        sb2.append(", maxPrice=");
        sb2.append(this.maxPrice);
        sb2.append(", maxArea=");
        return com.akita.compose.component.accordion.s.j(sb2, this.maxArea, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        List<RealEstateLocation> list = this.locations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RealEstateLocation) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<RealEstateDevelopment> list2 = this.developments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((RealEstateDevelopment) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<RealEstateCompletionDate> list3 = this.completionDates;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((RealEstateCompletionDate) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        List<RealEstateRoomType> list4 = this.roomsTypes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                ((RealEstateRoomType) itA4.next()).writeToParcel(parcel, flags);
            }
        }
        List<RealEstateFinishType> list5 = this.finishTypes;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
            while (itA5.hasNext()) {
                ((RealEstateFinishType) itA5.next()).writeToParcel(parcel, flags);
            }
        }
        Integer num = this.maxPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maxArea;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
