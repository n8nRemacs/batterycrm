package com.avito.android.activeOrders;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrdersNeedActionResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/avito/android/activeOrders/ItemContent;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", "isMultipleItems", "Lcom/avito/android/remote/model/Image;", "image", "attentionBadgeText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getAttentionBadgeText", "_avito_active-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ItemContent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ItemContent> CREATOR = new a();

    @com.google.gson.annotations.c("attentionBadgeText")
    @Y61.l
    private final String attentionBadgeText;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("isMultipleItems")
    @Y61.l
    private final Boolean isMultipleItems;

    @com.google.gson.annotations.c("onTapDeepLink")
    @Y61.l
    private final DeepLink onTapDeepLink;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: OrdersNeedActionResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemContent> {
        @Override // android.os.Parcelable.Creator
        public final ItemContent createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemContent.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ItemContent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ItemContent(string, attributedText, deepLink, boolValueOf, (Image) parcel.readParcelable(ItemContent.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemContent[] newArray(int i12) {
            return new ItemContent[i12];
        }
    }

    public ItemContent(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l DeepLink deepLink, @Y61.l Boolean bool, @Y61.l Image image, @Y61.l String str2) {
        this.title = str;
        this.subtitle = attributedText;
        this.onTapDeepLink = deepLink;
        this.isMultipleItems = bool;
        this.image = image;
        this.attentionBadgeText = str2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsMultipleItems() {
        return this.isMultipleItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemContent)) {
            return false;
        }
        ItemContent itemContent = (ItemContent) obj;
        return L.f(this.title, itemContent.title) && L.f(this.subtitle, itemContent.subtitle) && L.f(this.onTapDeepLink, itemContent.onTapDeepLink) && L.f(this.isMultipleItems, itemContent.isMultipleItems) && L.f(this.image, itemContent.image) && L.f(this.attentionBadgeText, itemContent.attentionBadgeText);
    }

    @Y61.l
    public final String getAttentionBadgeText() {
        return this.attentionBadgeText;
    }

    @Y61.l
    public final Image getImage() {
        return this.image;
    }

    @Y61.l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.onTapDeepLink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.isMultipleItems;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Image image = this.image;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.attentionBadgeText;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemContent(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.onTapDeepLink);
        sb2.append(", isMultipleItems=");
        sb2.append(this.isMultipleItems);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", attentionBadgeText=");
        return C22026a.c(sb2, this.attentionBadgeText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, i12);
        parcel.writeParcelable(this.onTapDeepLink, i12);
        Boolean bool = this.isMultipleItems;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.attentionBadgeText);
    }
}
