package com.avito.android.profile.pro.impl.screen.item.dashboard_list_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileOtherDashboardItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_list_item/ProfileOtherDashboardItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileOtherDashboardItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileOtherDashboardItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223115b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ItemSlug f223116c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ItemSeverity f223117d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f223118e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f223119f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f223120g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f223121h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f223122i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AttributedText f223123j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AttributedText f223124k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f223125l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f223126m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f223127n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final DeepLink f223128o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final UniversalImage f223129p;

    /* compiled from: ProfileOtherDashboardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileOtherDashboardItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileOtherDashboardItem createFromParcel(Parcel parcel) {
            return new ProfileOtherDashboardItem(parcel.readString(), ItemSlug.valueOf(parcel.readString()), ItemSeverity.valueOf(parcel.readString()), parcel.readString(), (AttributedText) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (DeepLink) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ProfileOtherDashboardItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileOtherDashboardItem[] newArray(int i12) {
            return new ProfileOtherDashboardItem[i12];
        }
    }

    public ProfileOtherDashboardItem(@k String str, @k ItemSlug itemSlug, @k ItemSeverity itemSeverity, @l String str2, @l AttributedText attributedText, @l String str3, @l AttributedText attributedText2, @l String str4, @l AttributedText attributedText3, @l AttributedText attributedText4, boolean z12, boolean z13, @l String str5, @l DeepLink deepLink, @l UniversalImage universalImage) {
        this.f223115b = str;
        this.f223116c = itemSlug;
        this.f223117d = itemSeverity;
        this.f223118e = str2;
        this.f223119f = attributedText;
        this.f223120g = str3;
        this.f223121h = attributedText2;
        this.f223122i = str4;
        this.f223123j = attributedText3;
        this.f223124k = attributedText4;
        this.f223125l = z12;
        this.f223126m = z13;
        this.f223127n = str5;
        this.f223128o = deepLink;
        this.f223129p = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileOtherDashboardItem)) {
            return false;
        }
        ProfileOtherDashboardItem profileOtherDashboardItem = (ProfileOtherDashboardItem) obj;
        return L.f(this.f223115b, profileOtherDashboardItem.f223115b) && this.f223116c == profileOtherDashboardItem.f223116c && this.f223117d == profileOtherDashboardItem.f223117d && L.f(this.f223118e, profileOtherDashboardItem.f223118e) && L.f(this.f223119f, profileOtherDashboardItem.f223119f) && L.f(this.f223120g, profileOtherDashboardItem.f223120g) && L.f(this.f223121h, profileOtherDashboardItem.f223121h) && L.f(this.f223122i, profileOtherDashboardItem.f223122i) && L.f(this.f223123j, profileOtherDashboardItem.f223123j) && L.f(this.f223124k, profileOtherDashboardItem.f223124k) && this.f223125l == profileOtherDashboardItem.f223125l && this.f223126m == profileOtherDashboardItem.f223126m && L.f(this.f223127n, profileOtherDashboardItem.f223127n) && L.f(this.f223128o, profileOtherDashboardItem.f223128o) && L.f(this.f223129p, profileOtherDashboardItem.f223129p);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215074b() {
        return this.f223115b;
    }

    public final int hashCode() {
        int iHashCode = (this.f223117d.hashCode() + ((this.f223116c.hashCode() + (this.f223115b.hashCode() * 31)) * 31)) * 31;
        String str = this.f223118e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f223119f;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f223120g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText2 = this.f223121h;
        int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str3 = this.f223122i;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText3 = this.f223123j;
        int iHashCode7 = (iHashCode6 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        AttributedText attributedText4 = this.f223124k;
        int i12 = r.i(r.i((iHashCode7 + (attributedText4 == null ? 0 : attributedText4.hashCode())) * 31, 31, this.f223125l), 31, this.f223126m);
        String str4 = this.f223127n;
        int iHashCode8 = (i12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.f223128o;
        int iHashCode9 = (iHashCode8 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f223129p;
        return iHashCode9 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileOtherDashboardItem(stringId=");
        sb2.append(this.f223115b);
        sb2.append(", slug=");
        sb2.append(this.f223116c);
        sb2.append(", severity=");
        sb2.append(this.f223117d);
        sb2.append(", title=");
        sb2.append(this.f223118e);
        sb2.append(", titleAttr=");
        sb2.append(this.f223119f);
        sb2.append(", description=");
        sb2.append(this.f223120g);
        sb2.append(", descriptionAttr=");
        sb2.append(this.f223121h);
        sb2.append(", formattedValue=");
        sb2.append(this.f223122i);
        sb2.append(", valueAttr=");
        sb2.append(this.f223123j);
        sb2.append(", subValue=");
        sb2.append(this.f223124k);
        sb2.append(", needHeadline=");
        sb2.append(this.f223125l);
        sb2.append(", needShowMore=");
        sb2.append(this.f223126m);
        sb2.append(", actionId=");
        sb2.append(this.f223127n);
        sb2.append(", deeplinkAction=");
        sb2.append(this.f223128o);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f223129p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223115b);
        parcel.writeString(this.f223116c.name());
        parcel.writeString(this.f223117d.name());
        parcel.writeString(this.f223118e);
        parcel.writeParcelable(this.f223119f, i12);
        parcel.writeString(this.f223120g);
        parcel.writeParcelable(this.f223121h, i12);
        parcel.writeString(this.f223122i);
        parcel.writeParcelable(this.f223123j, i12);
        parcel.writeParcelable(this.f223124k, i12);
        parcel.writeInt(this.f223125l ? 1 : 0);
        parcel.writeInt(this.f223126m ? 1 : 0);
        parcel.writeString(this.f223127n);
        parcel.writeParcelable(this.f223128o, i12);
        parcel.writeParcelable(this.f223129p, i12);
    }
}
