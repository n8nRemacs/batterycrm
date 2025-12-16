package com.avito.android.rating.user_contacts.adapter.contact;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/adapter/contact/ContactItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactItem implements RatingDetailsItem {

    @Y61.k
    public static final Parcelable.Creator<ContactItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f247679b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f247680c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f247681d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f247682e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f247683f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Image f247684g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f247685h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f247686i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f247687j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final DeepLink f247688k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final DeepLink f247689l;

    /* compiled from: ContactItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactItem createFromParcel(Parcel parcel) {
            return new ContactItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ContactItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(ContactItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ContactItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ContactItem[] newArray(int i12) {
            return new ContactItem[i12];
        }
    }

    public ContactItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, @Y61.l Image image, @Y61.l String str5, @Y61.l String str6, boolean z12, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2) {
        this.f247679b = j12;
        this.f247680c = str;
        this.f247681d = str2;
        this.f247682e = str3;
        this.f247683f = str4;
        this.f247684g = image;
        this.f247685h = str5;
        this.f247686i = str6;
        this.f247687j = z12;
        this.f247688k = deepLink;
        this.f247689l = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactItem)) {
            return false;
        }
        ContactItem contactItem = (ContactItem) obj;
        return this.f247679b == contactItem.f247679b && L.f(this.f247680c, contactItem.f247680c) && L.f(this.f247681d, contactItem.f247681d) && L.f(this.f247682e, contactItem.f247682e) && L.f(this.f247683f, contactItem.f247683f) && L.f(this.f247684g, contactItem.f247684g) && L.f(this.f247685h, contactItem.f247685h) && L.f(this.f247686i, contactItem.f247686i) && this.f247687j == contactItem.f247687j && L.f(this.f247688k, contactItem.f247688k) && L.f(this.f247689l, contactItem.f247689l);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78384b() {
        return this.f247679b;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243099b() {
        return this.f247680c;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f247679b) * 31, 31, this.f247680c), 31, this.f247681d);
        String str = this.f247682e;
        int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f247683f);
        Image image = this.f247684g;
        int iHashCode = (iD3 + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.f247685h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f247686i;
        int i12 = r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f247687j);
        DeepLink deepLink = this.f247688k;
        int iHashCode3 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f247689l;
        return iHashCode3 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactItem(id=");
        sb2.append(this.f247679b);
        sb2.append(", stringId=");
        sb2.append(this.f247680c);
        sb2.append(", userKey=");
        sb2.append(this.f247681d);
        sb2.append(", userName=");
        sb2.append(this.f247682e);
        sb2.append(", itemId=");
        sb2.append(this.f247683f);
        sb2.append(", itemImage=");
        sb2.append(this.f247684g);
        sb2.append(", itemTitle=");
        sb2.append(this.f247685h);
        sb2.append(", itemPrice=");
        sb2.append(this.f247686i);
        sb2.append(", isAutoItem=");
        sb2.append(this.f247687j);
        sb2.append(", actionDeepLink=");
        sb2.append(this.f247688k);
        sb2.append(", itemInfoAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f247689l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f247679b);
        parcel.writeString(this.f247680c);
        parcel.writeString(this.f247681d);
        parcel.writeString(this.f247682e);
        parcel.writeString(this.f247683f);
        parcel.writeParcelable(this.f247684g, i12);
        parcel.writeString(this.f247685h);
        parcel.writeString(this.f247686i);
        parcel.writeInt(this.f247687j ? 1 : 0);
        parcel.writeParcelable(this.f247688k, i12);
        parcel.writeParcelable(this.f247689l, i12);
    }

    public /* synthetic */ ContactItem(long j12, String str, String str2, String str3, String str4, Image image, String str5, String str6, boolean z12, DeepLink deepLink, DeepLink deepLink2, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? String.valueOf(j12) : str, str2, str3, str4, image, str5, str6, z12, deepLink, deepLink2);
    }
}
