package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsInfoResult.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/SearchItem;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "price", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchItemValidate;", "validate", "", "isInSale", "isBanned", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfo;", "bonusInfo", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;Lcom/avito/android/campaigns_sale/network/remote/model/SearchItemValidate;ZZLcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfo;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchItemValidate;", "f", "()Lcom/avito/android/campaigns_sale/network/remote/model/SearchItemValidate;", "Z", "h", "()Z", "g", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfo;", "c", "()Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfo;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchItem> CREATOR = new a();

    @c("bonuses")
    @l
    private final SearchBonusInfo bonusInfo;

    @c("id")
    @k
    private final String id;

    @c("image")
    @k
    private final Image image;

    @c("isBanned")
    private final boolean isBanned;

    @c("isInSale")
    private final boolean isInSale;

    @c("price")
    @k
    private final AttributedText price;

    @c("title")
    @k
    private final AttributedText title;

    @c("validate")
    @k
    private final SearchItemValidate validate;

    /* compiled from: CampaignsSaleItemsInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchItem createFromParcel(Parcel parcel) {
            return new SearchItem(parcel.readString(), (AttributedText) parcel.readParcelable(SearchItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SearchItem.class.getClassLoader()), (Image) parcel.readParcelable(SearchItem.class.getClassLoader()), SearchItemValidate.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : SearchBonusInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchItem[] newArray(int i12) {
            return new SearchItem[i12];
        }
    }

    public SearchItem(@k String str, @k AttributedText attributedText, @k AttributedText attributedText2, @k Image image, @k SearchItemValidate searchItemValidate, boolean z12, boolean z13, @l SearchBonusInfo searchBonusInfo) {
        this.id = str;
        this.title = attributedText;
        this.price = attributedText2;
        this.image = image;
        this.validate = searchItemValidate;
        this.isInSale = z12;
        this.isBanned = z13;
        this.bonusInfo = searchBonusInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final SearchBonusInfo getBonusInfo() {
        return this.bonusInfo;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) obj;
        return L.f(this.id, searchItem.id) && L.f(this.title, searchItem.title) && L.f(this.price, searchItem.price) && L.f(this.image, searchItem.image) && L.f(this.validate, searchItem.validate) && this.isInSale == searchItem.isInSale && this.isBanned == searchItem.isBanned && L.f(this.bonusInfo, searchItem.bonusInfo);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final SearchItemValidate getValidate() {
        return this.validate;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsInSale() {
        return this.isInSale;
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.validate.hashCode() + com.avito.android.actions_sheet.a.g(this.image, com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.id.hashCode() * 31, 31, this.title), 31, this.price), 31)) * 31, 31, this.isInSale), 31, this.isBanned);
        SearchBonusInfo searchBonusInfo = this.bonusInfo;
        return i12 + (searchBonusInfo == null ? 0 : searchBonusInfo.hashCode());
    }

    @k
    public final String toString() {
        return "SearchItem(id=" + this.id + ", title=" + this.title + ", price=" + this.price + ", image=" + this.image + ", validate=" + this.validate + ", isInSale=" + this.isInSale + ", isBanned=" + this.isBanned + ", bonusInfo=" + this.bonusInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.price, i12);
        parcel.writeParcelable(this.image, i12);
        this.validate.writeToParcel(parcel, i12);
        parcel.writeInt(this.isInSale ? 1 : 0);
        parcel.writeInt(this.isBanned ? 1 : 0);
        SearchBonusInfo searchBonusInfo = this.bonusInfo;
        if (searchBonusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchBonusInfo.writeToParcel(parcel, i12);
        }
    }
}
