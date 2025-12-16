package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/RealtyItem;", "Landroid/os/Parcelable;", "", "title", "", "price", AddressParameter.TYPE, "link", "Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "image", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/RealtyImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "J", "e", "()J", "c", "getLink", "Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "d", "()Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RealtyItem implements Parcelable {

    @k
    public static final Parcelable.Creator<RealtyItem> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("image")
    @l
    private final RealtyImage image;

    @c("link")
    @l
    private final String link;

    @c("price")
    private final long price;

    @c("title")
    @k
    private final String title;

    /* compiled from: RealtyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyItem> {
        @Override // android.os.Parcelable.Creator
        public final RealtyItem createFromParcel(Parcel parcel) {
            return new RealtyItem(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RealtyImage.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyItem[] newArray(int i12) {
            return new RealtyItem[i12];
        }
    }

    public RealtyItem(@k String str, long j12, @k String str2, @l String str3, @l RealtyImage realtyImage) {
        this.title = str;
        this.price = j12;
        this.address = str2;
        this.link = str3;
        this.image = realtyImage;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final RealtyImage getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyItem)) {
            return false;
        }
        RealtyItem realtyItem = (RealtyItem) obj;
        return L.f(this.title, realtyItem.title) && this.price == realtyItem.price && L.f(this.address, realtyItem.address) && L.f(this.link, realtyItem.link) && L.f(this.image, realtyItem.image);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(r.g(this.title.hashCode() * 31, 31, this.price), 31, this.address);
        String str = this.link;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        RealtyImage realtyImage = this.image;
        return iHashCode + (realtyImage != null ? realtyImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RealtyItem(title=" + this.title + ", price=" + this.price + ", address=" + this.address + ", link=" + this.link + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeLong(this.price);
        parcel.writeString(this.address);
        parcel.writeString(this.link);
        RealtyImage realtyImage = this.image;
        if (realtyImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyImage.writeToParcel(parcel, i12);
        }
    }
}
