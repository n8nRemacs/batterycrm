package ru.mts.biometry.api.entity.locationSuggestion;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/mts/biometry/api/entity/locationSuggestion/LocationData;", "", "", "postalCode", "region", "regionWithType", "areaWithType", "cityDistrict", "city", "street", "settlementWithType", "house", "block", "flat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "getAreaWithType", "c", "b", "j", "i", "e", "a", "d", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class LocationData {

    @c("area_with_type")
    @l
    private final String areaWithType;

    @c("block")
    @l
    private final String block;

    @c("city")
    @l
    private final String city;

    @c("city_district")
    @l
    private final String cityDistrict;

    @c("flat")
    @l
    private final String flat;

    @c("house")
    @l
    private final String house;

    @c("postal_code")
    @l
    private final String postalCode;

    @c("region")
    @l
    private final String region;

    @c("region_with_type")
    @l
    private final String regionWithType;

    @c("settlement_with_type")
    @l
    private final String settlementWithType;

    @c("street")
    @l
    private final String street;

    public LocationData(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11) {
        this.postalCode = str;
        this.region = str2;
        this.regionWithType = str3;
        this.areaWithType = str4;
        this.cityDistrict = str5;
        this.city = str6;
        this.street = str7;
        this.settlementWithType = str8;
        this.house = str9;
        this.block = str10;
        this.flat = str11;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getBlock() {
        return this.block;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getCityDistrict() {
        return this.cityDistrict;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getFlat() {
        return this.flat;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) obj;
        return L.f(this.postalCode, locationData.postalCode) && L.f(this.region, locationData.region) && L.f(this.regionWithType, locationData.regionWithType) && L.f(this.areaWithType, locationData.areaWithType) && L.f(this.cityDistrict, locationData.cityDistrict) && L.f(this.city, locationData.city) && L.f(this.street, locationData.street) && L.f(this.settlementWithType, locationData.settlementWithType) && L.f(this.house, locationData.house) && L.f(this.block, locationData.block) && L.f(this.flat, locationData.flat);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getRegionWithType() {
        return this.regionWithType;
    }

    public final int hashCode() {
        String str = this.postalCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.region;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionWithType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.areaWithType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cityDistrict;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.street;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.settlementWithType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.house;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.block;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.flat;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getSettlementWithType() {
        return this.settlementWithType;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationData(postalCode=");
        sb2.append(this.postalCode);
        sb2.append(", region=");
        sb2.append(this.region);
        sb2.append(", regionWithType=");
        sb2.append(this.regionWithType);
        sb2.append(", areaWithType=");
        sb2.append(this.areaWithType);
        sb2.append(", cityDistrict=");
        sb2.append(this.cityDistrict);
        sb2.append(", city=");
        sb2.append(this.city);
        sb2.append(", street=");
        sb2.append(this.street);
        sb2.append(", settlementWithType=");
        sb2.append(this.settlementWithType);
        sb2.append(", house=");
        sb2.append(this.house);
        sb2.append(", block=");
        sb2.append(this.block);
        sb2.append(", flat=");
        return C22026a.c(sb2, this.flat, ')');
    }
}
