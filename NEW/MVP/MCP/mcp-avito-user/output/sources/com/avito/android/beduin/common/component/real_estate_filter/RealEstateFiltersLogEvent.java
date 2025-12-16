package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jx\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0010R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0015R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b0\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b3\u0010\u0018¨\u00064"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;", "Landroid/os/Parcelable;", "", "id", "version", "", "", "params", "", "hasSensitiveData", "paramsMap", "filterParamName", "locationParamName", "<init>", "(IILjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/util/Map;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/lang/String;", "component7", "copy", "(IILjava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "getVersion", "Ljava/util/Map;", "getParams", "Ljava/lang/Boolean;", "getHasSensitiveData", "getParamsMap", "Ljava/lang/String;", "getFilterParamName", "getLocationParamName", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateFiltersLogEvent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RealEstateFiltersLogEvent> CREATOR = new a();

    @Y61.l
    private final String filterParamName;

    @Y61.l
    private final Boolean hasSensitiveData;
    private final int id;

    @Y61.l
    private final String locationParamName;

    @Y61.l
    private final Map<String, String> params;

    @Y61.l
    private final Map<String, String> paramsMap;
    private final int version;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealEstateFiltersLogEvent> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateFiltersLogEvent createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int iA2 = 0;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                int iA3 = 0;
                while (iA3 != i14) {
                    iA3 = C0.a(parcel, linkedHashMap, parcel.readString(), iA3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                while (iA2 != i15) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
            }
            return new RealEstateFiltersLogEvent(i12, i13, linkedHashMap, boolValueOf, linkedHashMap2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateFiltersLogEvent[] newArray(int i12) {
            return new RealEstateFiltersLogEvent[i12];
        }
    }

    public RealEstateFiltersLogEvent(int i12, int i13, @Y61.l Map<String, String> map, @Y61.l Boolean bool, @Y61.l Map<String, String> map2, @Y61.l String str, @Y61.l String str2) {
        this.id = i12;
        this.version = i13;
        this.params = map;
        this.hasSensitiveData = bool;
        this.paramsMap = map2;
        this.filterParamName = str;
        this.locationParamName = str2;
    }

    public static /* synthetic */ RealEstateFiltersLogEvent copy$default(RealEstateFiltersLogEvent realEstateFiltersLogEvent, int i12, int i13, Map map, Boolean bool, Map map2, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = realEstateFiltersLogEvent.id;
        }
        if ((i14 & 2) != 0) {
            i13 = realEstateFiltersLogEvent.version;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            map = realEstateFiltersLogEvent.params;
        }
        Map map3 = map;
        if ((i14 & 8) != 0) {
            bool = realEstateFiltersLogEvent.hasSensitiveData;
        }
        Boolean bool2 = bool;
        if ((i14 & 16) != 0) {
            map2 = realEstateFiltersLogEvent.paramsMap;
        }
        Map map4 = map2;
        if ((i14 & 32) != 0) {
            str = realEstateFiltersLogEvent.filterParamName;
        }
        String str3 = str;
        if ((i14 & 64) != 0) {
            str2 = realEstateFiltersLogEvent.locationParamName;
        }
        return realEstateFiltersLogEvent.copy(i12, i15, map3, bool2, map4, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Y61.l
    public final Map<String, String> component3() {
        return this.params;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    @Y61.l
    public final Map<String, String> component5() {
        return this.paramsMap;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final String getFilterParamName() {
        return this.filterParamName;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final String getLocationParamName() {
        return this.locationParamName;
    }

    @Y61.k
    public final RealEstateFiltersLogEvent copy(int id2, int version, @Y61.l Map<String, String> params, @Y61.l Boolean hasSensitiveData, @Y61.l Map<String, String> paramsMap, @Y61.l String filterParamName, @Y61.l String locationParamName) {
        return new RealEstateFiltersLogEvent(id2, version, params, hasSensitiveData, paramsMap, filterParamName, locationParamName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealEstateFiltersLogEvent)) {
            return false;
        }
        RealEstateFiltersLogEvent realEstateFiltersLogEvent = (RealEstateFiltersLogEvent) other;
        return this.id == realEstateFiltersLogEvent.id && this.version == realEstateFiltersLogEvent.version && L.f(this.params, realEstateFiltersLogEvent.params) && L.f(this.hasSensitiveData, realEstateFiltersLogEvent.hasSensitiveData) && L.f(this.paramsMap, realEstateFiltersLogEvent.paramsMap) && L.f(this.filterParamName, realEstateFiltersLogEvent.filterParamName) && L.f(this.locationParamName, realEstateFiltersLogEvent.locationParamName);
    }

    @Y61.l
    public final String getFilterParamName() {
        return this.filterParamName;
    }

    @Y61.l
    public final Boolean getHasSensitiveData() {
        return this.hasSensitiveData;
    }

    public final int getId() {
        return this.id;
    }

    @Y61.l
    public final String getLocationParamName() {
        return this.locationParamName;
    }

    @Y61.l
    public final Map<String, String> getParams() {
        return this.params;
    }

    @Y61.l
    public final Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.version, Integer.hashCode(this.id) * 31, 31);
        Map<String, String> map = this.params;
        int iHashCode = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.hasSensitiveData;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map2 = this.paramsMap;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.filterParamName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locationParamName;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RealEstateFiltersLogEvent(id=");
        sb2.append(this.id);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", hasSensitiveData=");
        sb2.append(this.hasSensitiveData);
        sb2.append(", paramsMap=");
        sb2.append(this.paramsMap);
        sb2.append(", filterParamName=");
        sb2.append(this.filterParamName);
        sb2.append(", locationParamName=");
        return C22026a.c(sb2, this.locationParamName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.version);
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Boolean bool = this.hasSensitiveData;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Map<String, String> map2 = this.paramsMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
        parcel.writeString(this.filterParamName);
        parcel.writeString(this.locationParamName);
    }
}
