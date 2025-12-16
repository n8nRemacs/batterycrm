package com.avito.android.mortgage.api.model.suggestions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AddressSuggestion.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/avito/android/mortgage/api/model/suggestions/AddressSuggestion;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "", "block", "city", "country", "flat", "house", "region", "regionId", "settlement", "street", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "f", "g", "h", "i", "j", "k", "l", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public final /* data */ class AddressSuggestion implements Suggestion {

    @k
    public static final Parcelable.Creator<AddressSuggestion> CREATOR = new a();

    @c("block")
    @l
    private final String block;

    @c("city")
    @l
    private final String city;

    @c("country")
    @l
    private final String country;

    @c("flat")
    @l
    private final String flat;

    @c("house")
    @l
    private final String house;

    @c("region")
    @l
    private final String region;

    @c("regionId")
    @l
    private final String regionId;

    @c("settlement")
    @l
    private final String settlement;

    @c("street")
    @l
    private final String street;

    @c("zip")
    @l
    private final String zip;

    /* compiled from: AddressSuggestion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressSuggestion> {
        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion createFromParcel(Parcel parcel) {
            return new AddressSuggestion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion[] newArray(int i12) {
            return new AddressSuggestion[i12];
        }
    }

    public AddressSuggestion(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10) {
        this.block = str;
        this.city = str2;
        this.country = str3;
        this.flat = str4;
        this.house = str5;
        this.region = str6;
        this.regionId = str7;
        this.settlement = str8;
        this.street = str9;
        this.zip = str10;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getBlock() {
        return this.block;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    @Override // com.avito.android.mortgage.api.model.suggestions.Suggestion
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0() {
        /*
            r4 = this;
            java.lang.String r0 = r4.city
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r0 == 0) goto L25
            java.lang.String r0 = r4.settlement
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 != 0) goto L23
            goto L25
        L23:
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            java.lang.String r3 = r4.region
            if (r3 == 0) goto L33
            int r3 = r3.length()
            if (r3 != 0) goto L31
            goto L33
        L31:
            r3 = r2
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 != 0) goto L49
            if (r0 == 0) goto L49
            java.lang.String r0 = r4.house
            if (r0 == 0) goto L45
            int r0 = r0.length()
            if (r0 != 0) goto L43
            goto L45
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.api.model.suggestions.AddressSuggestion.c0():boolean");
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSuggestion)) {
            return false;
        }
        AddressSuggestion addressSuggestion = (AddressSuggestion) obj;
        return L.f(this.block, addressSuggestion.block) && L.f(this.city, addressSuggestion.city) && L.f(this.country, addressSuggestion.country) && L.f(this.flat, addressSuggestion.flat) && L.f(this.house, addressSuggestion.house) && L.f(this.region, addressSuggestion.region) && L.f(this.regionId, addressSuggestion.regionId) && L.f(this.settlement, addressSuggestion.settlement) && L.f(this.street, addressSuggestion.street) && L.f(this.zip, addressSuggestion.zip);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getFlat() {
        return this.flat;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getHouse() {
        return this.house;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final int hashCode() {
        String str = this.block;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flat;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.house;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.region;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.regionId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.settlement;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.street;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.zip;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getRegionId() {
        return this.regionId;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final String getSettlement() {
        return this.settlement;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressSuggestion(block=");
        sb2.append(this.block);
        sb2.append(", city=");
        sb2.append(this.city);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", flat=");
        sb2.append(this.flat);
        sb2.append(", house=");
        sb2.append(this.house);
        sb2.append(", region=");
        sb2.append(this.region);
        sb2.append(", regionId=");
        sb2.append(this.regionId);
        sb2.append(", settlement=");
        sb2.append(this.settlement);
        sb2.append(", street=");
        sb2.append(this.street);
        sb2.append(", zip=");
        return C22026a.c(sb2, this.zip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.block);
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.flat);
        parcel.writeString(this.house);
        parcel.writeString(this.region);
        parcel.writeString(this.regionId);
        parcel.writeString(this.settlement);
        parcel.writeString(this.street);
        parcel.writeString(this.zip);
    }
}
