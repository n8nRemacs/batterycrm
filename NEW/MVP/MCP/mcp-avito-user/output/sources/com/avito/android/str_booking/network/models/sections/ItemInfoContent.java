package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemInfoSection.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/ItemInfoContent;", "Landroid/os/Parcelable;", "", "image", "title", AddressParameter.TYPE, "href", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getImage", "()Ljava/lang/String;", "getTitle", "c", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ItemInfoContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemInfoContent> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("href")
    @l
    private final String href;

    @c("image")
    @l
    private final String image;

    @c("title")
    @l
    private final String title;

    /* compiled from: ItemInfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemInfoContent> {
        @Override // android.os.Parcelable.Creator
        public final ItemInfoContent createFromParcel(Parcel parcel) {
            return new ItemInfoContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemInfoContent[] newArray(int i12) {
            return new ItemInfoContent[i12];
        }
    }

    public ItemInfoContent(@l String str, @l String str2, @l String str3, @l String str4) {
        this.image = str;
        this.title = str2;
        this.address = str3;
        this.href = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemInfoContent)) {
            return false;
        }
        ItemInfoContent itemInfoContent = (ItemInfoContent) obj;
        return L.f(this.image, itemInfoContent.image) && L.f(this.title, itemInfoContent.title) && L.f(this.address, itemInfoContent.address) && L.f(this.href, itemInfoContent.href);
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.href;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemInfoContent(image=");
        sb2.append(this.image);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", href=");
        return C22026a.c(sb2, this.href, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.image);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        parcel.writeString(this.href);
    }
}
