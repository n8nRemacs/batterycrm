package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersListResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;", "Landroid/os/Parcelable;", "", "picUrl", "title", AddressParameter.TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/StrSellerOrdersEstateInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPicUrl", "getTitle", "getAddress", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerOrdersEstateInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerOrdersEstateInfo> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("description")
    @l
    private final AttributedText description;

    @c("picUrl")
    @l
    private final String picUrl;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrSellerOrdersListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerOrdersEstateInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersEstateInfo createFromParcel(@k Parcel parcel) {
            return new StrSellerOrdersEstateInfo(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(StrSellerOrdersEstateInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerOrdersEstateInfo[] newArray(int i12) {
            return new StrSellerOrdersEstateInfo[i12];
        }
    }

    public StrSellerOrdersEstateInfo(@l String str, @l String str2, @l String str3, @l AttributedText attributedText) {
        this.picUrl = str;
        this.title = str2;
        this.address = str3;
        this.description = attributedText;
    }

    public static /* synthetic */ StrSellerOrdersEstateInfo copy$default(StrSellerOrdersEstateInfo strSellerOrdersEstateInfo, String str, String str2, String str3, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strSellerOrdersEstateInfo.picUrl;
        }
        if ((i12 & 2) != 0) {
            str2 = strSellerOrdersEstateInfo.title;
        }
        if ((i12 & 4) != 0) {
            str3 = strSellerOrdersEstateInfo.address;
        }
        if ((i12 & 8) != 0) {
            attributedText = strSellerOrdersEstateInfo.description;
        }
        return strSellerOrdersEstateInfo.copy(str, str2, str3, attributedText);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final StrSellerOrdersEstateInfo copy(@l String picUrl, @l String title, @l String address, @l AttributedText description) {
        return new StrSellerOrdersEstateInfo(picUrl, title, address, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerOrdersEstateInfo)) {
            return false;
        }
        StrSellerOrdersEstateInfo strSellerOrdersEstateInfo = (StrSellerOrdersEstateInfo) other;
        return L.f(this.picUrl, strSellerOrdersEstateInfo.picUrl) && L.f(this.title, strSellerOrdersEstateInfo.title) && L.f(this.address, strSellerOrdersEstateInfo.address) && L.f(this.description, strSellerOrdersEstateInfo.description);
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getPicUrl() {
        return this.picUrl;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.picUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.description;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersEstateInfo(picUrl=");
        sb2.append(this.picUrl);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", description=");
        return a.w(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.picUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        parcel.writeParcelable(this.description, flags);
    }
}
