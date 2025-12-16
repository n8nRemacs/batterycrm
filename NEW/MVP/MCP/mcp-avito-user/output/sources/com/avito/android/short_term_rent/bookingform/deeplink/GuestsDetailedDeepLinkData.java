package com.avito.android.short_term_rent.bookingform.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormDeepLinkParser.kt */
@K51.d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/deeplink/GuestsDetailedDeepLinkData;", "Landroid/os/Parcelable;", "", "version", "totalCount", "adultsCount", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "withPets", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "e", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GuestsDetailedDeepLinkData implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsDetailedDeepLinkData> CREATOR = new a();

    @com.google.gson.annotations.c("adultsCount")
    @l
    private final Integer adultsCount;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<String> children;

    @com.google.gson.annotations.c("totalCount")
    @l
    private final Integer totalCount;

    @com.google.gson.annotations.c("version")
    @l
    private final Integer version;

    @com.google.gson.annotations.c("withPets")
    @l
    private final Boolean withPets;

    /* compiled from: BookingFormDeepLinkParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsDetailedDeepLinkData> {
        @Override // android.os.Parcelable.Creator
        public final GuestsDetailedDeepLinkData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GuestsDetailedDeepLinkData(numValueOf, numValueOf2, numValueOf3, arrayListCreateStringArrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsDetailedDeepLinkData[] newArray(int i12) {
            return new GuestsDetailedDeepLinkData[i12];
        }
    }

    public GuestsDetailedDeepLinkData(@l Integer num, @l Integer num2, @l Integer num3, @l List<String> list, @l Boolean bool) {
        this.version = num;
        this.totalCount = num2;
        this.adultsCount = num3;
        this.children = list;
        this.withPets = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getAdultsCount() {
        return this.adultsCount;
    }

    @l
    public final List<String> d() {
        return this.children;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsDetailedDeepLinkData)) {
            return false;
        }
        GuestsDetailedDeepLinkData guestsDetailedDeepLinkData = (GuestsDetailedDeepLinkData) obj;
        return L.f(this.version, guestsDetailedDeepLinkData.version) && L.f(this.totalCount, guestsDetailedDeepLinkData.totalCount) && L.f(this.adultsCount, guestsDetailedDeepLinkData.adultsCount) && L.f(this.children, guestsDetailedDeepLinkData.children) && L.f(this.withPets, guestsDetailedDeepLinkData.withPets);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getWithPets() {
        return this.withPets;
    }

    public final int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.adultsCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.children;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.withPets;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsDetailedDeepLinkData(version=");
        sb2.append(this.version);
        sb2.append(", totalCount=");
        sb2.append(this.totalCount);
        sb2.append(", adultsCount=");
        sb2.append(this.adultsCount);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", withPets=");
        return C0.g(sb2, this.withPets, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.adultsCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        parcel.writeStringList(this.children);
        Boolean bool = this.withPets;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
