package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/SellerItem;", "Landroid/os/Parcelable;", "", "id", "price", "title", AddressParameter.TYPE, "", "Lcom/avito/android/comfortable_deal/api/model/GeoReferenceDto;", "geoReferences", "Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "images", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "", "isAverageMarketPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getPrice", "getTitle", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "getImages", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Z", "f", "()Z", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerItem> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("geoReferences")
    @l
    private final List<GeoReferenceDto> geoReferences;

    @c("id")
    @l
    private final String id;

    @c("images")
    @l
    private final List<RealtyImage> images;

    @c("isAverageMarketPrice")
    private final boolean isAverageMarketPrice;

    @c("price")
    @k
    private final String price;

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @l
    private final DeepLink url;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(GeoReferenceDto.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(RealtyImage.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            return new SellerItem(string, string2, string3, string4, arrayList, arrayList2, (DeepLink) parcel.readParcelable(SellerItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerItem[] newArray(int i12) {
            return new SellerItem[i12];
        }
    }

    public SellerItem(@l String str, @k String str2, @k String str3, @k String str4, @l List<GeoReferenceDto> list, @l List<RealtyImage> list2, @l DeepLink deepLink, boolean z12) {
        this.id = str;
        this.price = str2;
        this.title = str3;
        this.address = str4;
        this.geoReferences = list;
        this.images = list2;
        this.url = deepLink;
        this.isAverageMarketPrice = z12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<GeoReferenceDto> d() {
        return this.geoReferences;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getUrl() {
        return this.url;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerItem)) {
            return false;
        }
        SellerItem sellerItem = (SellerItem) obj;
        return L.f(this.id, sellerItem.id) && L.f(this.price, sellerItem.price) && L.f(this.title, sellerItem.title) && L.f(this.address, sellerItem.address) && L.f(this.geoReferences, sellerItem.geoReferences) && L.f(this.images, sellerItem.images) && L.f(this.url, sellerItem.url) && this.isAverageMarketPrice == sellerItem.isAverageMarketPrice;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsAverageMarketPrice() {
        return this.isAverageMarketPrice;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final List<RealtyImage> getImages() {
        return this.images;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int iD2 = H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.price), 31, this.title), 31, this.address);
        List<GeoReferenceDto> list = this.geoReferences;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<RealtyImage> list2 = this.images;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeepLink deepLink = this.url;
        return Boolean.hashCode(this.isAverageMarketPrice) + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerItem(id=");
        sb2.append(this.id);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", geoReferences=");
        sb2.append(this.geoReferences);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", isAverageMarketPrice=");
        return r.x(sb2, this.isAverageMarketPrice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.price);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        List<GeoReferenceDto> list = this.geoReferences;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((GeoReferenceDto) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<RealtyImage> list2 = this.images;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((RealtyImage) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.url, i12);
        parcel.writeInt(this.isAverageMarketPrice ? 1 : 0);
    }
}
