package ru.mts.biometry.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressBody.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lru/mts/biometry/api/entity/AddressBody;", "", "", "city", DistrictParameter.TYPE, "house", "postalCode", "flat", "region", "street", "building", "registrationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "getDistrict", "getHouse", "getPostalCode", "getFlat", "getRegion", "getStreet", "getBuilding", "getRegistrationDate", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AddressBody {

    @c("houseBuilding")
    @l
    private final String building;

    @c("city")
    @l
    private final String city;

    @c(DistrictParameter.TYPE)
    @l
    private final String district;

    @c("flat")
    @l
    private final String flat;

    @c("house")
    @l
    private final String house;

    @c("postalCode")
    @l
    private final String postalCode;

    @c("region")
    @l
    private final String region;

    @c("registrationDate")
    @l
    private final String registrationDate;

    @c("street")
    @l
    private final String street;

    public AddressBody(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9) {
        this.city = str;
        this.district = str2;
        this.house = str3;
        this.postalCode = str4;
        this.flat = str5;
        this.region = str6;
        this.street = str7;
        this.building = str8;
        this.registrationDate = str9;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressBody)) {
            return false;
        }
        AddressBody addressBody = (AddressBody) obj;
        return L.f(this.city, addressBody.city) && L.f(this.district, addressBody.district) && L.f(this.house, addressBody.house) && L.f(this.postalCode, addressBody.postalCode) && L.f(this.flat, addressBody.flat) && L.f(this.region, addressBody.region) && L.f(this.street, addressBody.street) && L.f(this.building, addressBody.building) && L.f(this.registrationDate, addressBody.registrationDate);
    }

    public final int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.district;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.house;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flat;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.region;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.street;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.building;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.registrationDate;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressBody(city=");
        sb2.append(this.city);
        sb2.append(", district=");
        sb2.append(this.district);
        sb2.append(", house=");
        sb2.append(this.house);
        sb2.append(", postalCode=");
        sb2.append(this.postalCode);
        sb2.append(", flat=");
        sb2.append(this.flat);
        sb2.append(", region=");
        sb2.append(this.region);
        sb2.append(", street=");
        sb2.append(this.street);
        sb2.append(", building=");
        sb2.append(this.building);
        sb2.append(", registrationDate=");
        return C22026a.c(sb2, this.registrationDate, ')');
    }

    public /* synthetic */ AddressBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9);
    }
}
