package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonItem;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/comparison/remote/model/ComparisonItemStatus;", "status", "title", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/comparison/remote/model/Price;", "price", "Lcom/avito/android/deep_linking/links/DeepLink;", "itemLink", "Lcom/avito/android/comparison/remote/model/CallButton;", "callButton", "Lcom/avito/android/comparison/remote/model/MessageButton;", "messageButton", "", "Lcom/avito/android/comparison/remote/model/ComparisonValue;", "data", "<init>", "(Ljava/lang/String;Lcom/avito/android/comparison/remote/model/ComparisonItemStatus;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/comparison/remote/model/Price;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/comparison/remote/model/CallButton;Lcom/avito/android/comparison/remote/model/MessageButton;Ljava/util/Map;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/comparison/remote/model/ComparisonItemStatus;", "h", "()Lcom/avito/android/comparison/remote/model/ComparisonItemStatus;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/comparison/remote/model/Price;", "g", "()Lcom/avito/android/comparison/remote/model/Price;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/comparison/remote/model/CallButton;", "c", "()Lcom/avito/android/comparison/remote/model/CallButton;", "Lcom/avito/android/comparison/remote/model/MessageButton;", "f", "()Lcom/avito/android/comparison/remote/model/MessageButton;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComparisonItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ComparisonItem> CREATOR = new a();

    @c("call")
    @k
    private final CallButton callButton;

    @c("data")
    @k
    private final Map<String, ComparisonValue> data;

    @c("id")
    @k
    private final String id;

    @c("image")
    @k
    private final Image image;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink itemLink;

    @c(NotificationsSettings.Section.SECTION_MESSENGER)
    @k
    private final MessageButton messageButton;

    @c("price")
    @k
    private final Price price;

    @c("status")
    @l
    private final ComparisonItemStatus status;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonItem> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ComparisonItemStatus comparisonItemStatusCreateFromParcel = parcel.readInt() == 0 ? null : ComparisonItemStatus.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ComparisonItem.class.getClassLoader());
            Price priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ComparisonItem.class.getClassLoader());
            CallButton callButtonCreateFromParcel = CallButton.CREATOR.createFromParcel(parcel);
            MessageButton messageButtonCreateFromParcel = MessageButton.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), ComparisonValue.CREATOR.createFromParcel(parcel));
            }
            return new ComparisonItem(string, comparisonItemStatusCreateFromParcel, string2, image, priceCreateFromParcel, deepLink, callButtonCreateFromParcel, messageButtonCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonItem[] newArray(int i12) {
            return new ComparisonItem[i12];
        }
    }

    public ComparisonItem(@k String str, @l ComparisonItemStatus comparisonItemStatus, @k String str2, @k Image image, @k Price price, @l DeepLink deepLink, @k CallButton callButton, @k MessageButton messageButton, @k Map<String, ComparisonValue> map) {
        this.id = str;
        this.status = comparisonItemStatus;
        this.title = str2;
        this.image = image;
        this.price = price;
        this.itemLink = deepLink;
        this.callButton = callButton;
        this.messageButton = messageButton;
        this.data = map;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final CallButton getCallButton() {
        return this.callButton;
    }

    @k
    public final Map<String, ComparisonValue> d() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getItemLink() {
        return this.itemLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonItem)) {
            return false;
        }
        ComparisonItem comparisonItem = (ComparisonItem) obj;
        return L.f(this.id, comparisonItem.id) && this.status == comparisonItem.status && L.f(this.title, comparisonItem.title) && L.f(this.image, comparisonItem.image) && L.f(this.price, comparisonItem.price) && L.f(this.itemLink, comparisonItem.itemLink) && L.f(this.callButton, comparisonItem.callButton) && L.f(this.messageButton, comparisonItem.messageButton) && L.f(this.data, comparisonItem.data);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final MessageButton getMessageButton() {
        return this.messageButton;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final ComparisonItemStatus getStatus() {
        return this.status;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        ComparisonItemStatus comparisonItemStatus = this.status;
        int iHashCode2 = (this.price.hashCode() + com.avito.android.actions_sheet.a.g(this.image, H.d((iHashCode + (comparisonItemStatus == null ? 0 : comparisonItemStatus.hashCode())) * 31, 31, this.title), 31)) * 31;
        DeepLink deepLink = this.itemLink;
        return this.data.hashCode() + ((this.messageButton.hashCode() + ((this.callButton.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonItem(id=");
        sb2.append(this.id);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", itemLink=");
        sb2.append(this.itemLink);
        sb2.append(", callButton=");
        sb2.append(this.callButton);
        sb2.append(", messageButton=");
        sb2.append(this.messageButton);
        sb2.append(", data=");
        return r.w(sb2, this.data, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        ComparisonItemStatus comparisonItemStatus = this.status;
        if (comparisonItemStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            comparisonItemStatus.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, i12);
        this.price.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.itemLink, i12);
        this.callButton.writeToParcel(parcel, i12);
        this.messageButton.writeToParcel(parcel, i12);
        Iterator itI = C0.i(parcel, this.data);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            ((ComparisonValue) entry.getValue()).writeToParcel(parcel, i12);
        }
    }
}
