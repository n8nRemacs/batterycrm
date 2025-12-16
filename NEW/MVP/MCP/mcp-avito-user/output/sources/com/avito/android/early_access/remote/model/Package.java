package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/early_access/remote/model/Package;", "Landroid/os/Parcelable;", "", "id", "", "title", "price", "description", "buttonLabel", "contactsCount", "pricePerContact", "oldPrice", "discountAmount", "Lcom/avito/android/early_access/remote/model/AnalyticsInfo;", "analyticsInfo", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/early_access/remote/model/AnalyticsInfo;)V", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrice", "getDescription", "getButtonLabel", "I", "getContactsCount", "()I", "getPricePerContact", "getOldPrice", "getDiscountAmount", "Lcom/avito/android/early_access/remote/model/AnalyticsInfo;", "getAnalyticsInfo", "()Lcom/avito/android/early_access/remote/model/AnalyticsInfo;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Package implements Parcelable {

    @k
    public static final Parcelable.Creator<Package> CREATOR = new a();

    @c("analyticsInfo")
    @l
    private final AnalyticsInfo analyticsInfo;

    @c("buttonLabel")
    @l
    private final String buttonLabel;

    @c("contactsCount")
    private final int contactsCount;

    @c("description")
    @l
    private final String description;

    @c("discountAmount")
    @l
    private final String discountAmount;

    @c("id")
    @l
    private final Integer id;

    @c("oldPrice")
    @l
    private final String oldPrice;

    @c("price")
    @k
    private final String price;

    @c("pricePerContact")
    @l
    private final String pricePerContact;

    @c("title")
    @k
    private final String title;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Package> {
        @Override // android.os.Parcelable.Creator
        public final Package createFromParcel(Parcel parcel) {
            return new Package(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AnalyticsInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Package[] newArray(int i12) {
            return new Package[i12];
        }
    }

    public Package(@l Integer num, @k String str, @k String str2, @l String str3, @l String str4, int i12, @l String str5, @l String str6, @l String str7, @l AnalyticsInfo analyticsInfo) {
        this.id = num;
        this.title = str;
        this.price = str2;
        this.description = str3;
        this.buttonLabel = str4;
        this.contactsCount = i12;
        this.pricePerContact = str5;
        this.oldPrice = str6;
        this.discountAmount = str7;
        this.analyticsInfo = analyticsInfo;
    }

    @k
    public final ReEarlyAccessData.Package c() {
        String string;
        String str = this.title;
        String str2 = this.price;
        String str3 = this.pricePerContact;
        String str4 = this.oldPrice;
        String str5 = this.discountAmount;
        int i12 = this.contactsCount;
        String str6 = this.description;
        String str7 = this.buttonLabel;
        Integer num = this.id;
        if (num == null || (string = num.toString()) == null) {
            string = this.title;
        }
        String str8 = string;
        AnalyticsInfo analyticsInfo = this.analyticsInfo;
        return new ReEarlyAccessData.Package(str, str2, i12, str3, str4, str5, str8, str6, str7, analyticsInfo != null ? analyticsInfo.c() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r52 = (Package) obj;
        return L.f(this.id, r52.id) && L.f(this.title, r52.title) && L.f(this.price, r52.price) && L.f(this.description, r52.description) && L.f(this.buttonLabel, r52.buttonLabel) && this.contactsCount == r52.contactsCount && L.f(this.pricePerContact, r52.pricePerContact) && L.f(this.oldPrice, r52.oldPrice) && L.f(this.discountAmount, r52.discountAmount) && L.f(this.analyticsInfo, r52.analyticsInfo);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iD2 = H.d(H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.title), 31, this.price);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonLabel;
        int iE2 = r.e(this.contactsCount, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.pricePerContact;
        int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.oldPrice;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountAmount;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AnalyticsInfo analyticsInfo = this.analyticsInfo;
        return iHashCode4 + (analyticsInfo != null ? analyticsInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "Package(id=" + this.id + ", title=" + this.title + ", price=" + this.price + ", description=" + this.description + ", buttonLabel=" + this.buttonLabel + ", contactsCount=" + this.contactsCount + ", pricePerContact=" + this.pricePerContact + ", oldPrice=" + this.oldPrice + ", discountAmount=" + this.discountAmount + ", analyticsInfo=" + this.analyticsInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonLabel);
        parcel.writeInt(this.contactsCount);
        parcel.writeString(this.pricePerContact);
        parcel.writeString(this.oldPrice);
        parcel.writeString(this.discountAmount);
        AnalyticsInfo analyticsInfo = this.analyticsInfo;
        if (analyticsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsInfo.writeToParcel(parcel, i12);
        }
    }
}
