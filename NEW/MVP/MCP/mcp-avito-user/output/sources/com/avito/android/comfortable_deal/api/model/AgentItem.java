package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/AgentItem;", "Landroid/os/Parcelable;", "", "id", "price", "title", AddressParameter.TYPE, "Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "", "Lcom/avito/android/comfortable_deal/api/model/StatDto;", "stats", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/comfortable_deal/api/model/RealtyImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getPrice", "getTitle", "c", "Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "d", "()Lcom/avito/android/comfortable_deal/api/model/RealtyImage;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "e", "()Ljava/util/List;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AgentItem implements Parcelable {

    @k
    public static final Parcelable.Creator<AgentItem> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("id")
    @k
    private final String id;

    @c("image")
    @l
    private final RealtyImage image;

    @c("price")
    @k
    private final String price;

    @c("stats")
    @l
    private final List<StatDto> stats;

    @c("title")
    @k
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @k
    private final DeepLink url;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AgentItem> {
        @Override // android.os.Parcelable.Creator
        public final AgentItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            RealtyImage realtyImageCreateFromParcel = parcel.readInt() == 0 ? null : RealtyImage.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AgentItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(StatDto.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AgentItem(string, string2, string3, string4, realtyImageCreateFromParcel, deepLink, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AgentItem[] newArray(int i12) {
            return new AgentItem[i12];
        }
    }

    public AgentItem(@k String str, @k String str2, @k String str3, @k String str4, @l RealtyImage realtyImage, @k DeepLink deepLink, @l List<StatDto> list) {
        this.id = str;
        this.price = str2;
        this.title = str3;
        this.address = str4;
        this.image = realtyImage;
        this.url = deepLink;
        this.stats = list;
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

    @l
    public final List<StatDto> e() {
        return this.stats;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentItem)) {
            return false;
        }
        AgentItem agentItem = (AgentItem) obj;
        return L.f(this.id, agentItem.id) && L.f(this.price, agentItem.price) && L.f(this.title, agentItem.title) && L.f(this.address, agentItem.address) && L.f(this.image, agentItem.image) && L.f(this.url, agentItem.url) && L.f(this.stats, agentItem.stats);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getUrl() {
        return this.url;
    }

    @k
    public final String getId() {
        return this.id;
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
        int iD2 = H.d(H.d(H.d(this.id.hashCode() * 31, 31, this.price), 31, this.title), 31, this.address);
        RealtyImage realtyImage = this.image;
        int iE2 = com.avito.android.actions_sheet.a.e(this.url, (iD2 + (realtyImage == null ? 0 : realtyImage.hashCode())) * 31, 31);
        List<StatDto> list = this.stats;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentItem(id=");
        sb2.append(this.id);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", stats=");
        return H.p(sb2, this.stats, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.price);
        parcel.writeString(this.title);
        parcel.writeString(this.address);
        RealtyImage realtyImage = this.image;
        if (realtyImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyImage.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.url, i12);
        List<StatDto> list = this.stats;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((StatDto) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
