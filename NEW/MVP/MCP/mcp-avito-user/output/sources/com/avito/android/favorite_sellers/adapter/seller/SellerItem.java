package com.avito.android.favorite_sellers.adapter.seller;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SellerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/seller/SellerItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "Lcom/avito/android/favorite_sellers/SubscribableItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class SellerItem implements FavoriteSellersItem, SubscribableItem {

    @k
    public static final Parcelable.Creator<SellerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155720c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f155721d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f155722e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f155723f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AvatarShape f155724g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155725h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f155726i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f155727j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f155728k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    public boolean f155729l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Boolean f155730m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    public boolean f155731n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Boolean f155732o;

    /* compiled from: SellerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SellerItem.class.getClassLoader());
            AvatarShape avatarShapeValueOf = AvatarShape.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SellerItem.class.getClassLoader());
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SellerItem(string, string2, string3, string4, image, avatarShapeValueOf, z12, z13, deepLink, z14, z15, boolValueOf, z16, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerItem[] newArray(int i12) {
            return new SellerItem[i12];
        }
    }

    public SellerItem(@k String str, @k String str2, @l String str3, @l String str4, @l Image image, @k AvatarShape avatarShape, boolean z12, boolean z13, @l DeepLink deepLink, boolean z14, boolean z15, @l Boolean bool, boolean z16, @l Boolean bool2) {
        this.f155719b = str;
        this.f155720c = str2;
        this.f155721d = str3;
        this.f155722e = str4;
        this.f155723f = image;
        this.f155724g = avatarShape;
        this.f155725h = z12;
        this.f155726i = z13;
        this.f155727j = deepLink;
        this.f155728k = z14;
        this.f155729l = z15;
        this.f155730m = bool;
        this.f155731n = z16;
        this.f155732o = bool2;
    }

    @Override // com.avito.android.InterfaceC32897n0
    @k
    /* renamed from: L, reason: from getter */
    public final String getF155720c() {
        return this.f155720c;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void V0(boolean z12) {
        this.f155729l = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.InterfaceC32897n0
    /* renamed from: f, reason: from getter */
    public final boolean getF155728k() {
        return this.f155728k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223150b() {
        return this.f155719b;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem, com.avito.android.InterfaceC32897n0
    @l
    /* renamed from: isNotificationsActivated, reason: from getter */
    public final Boolean getF155730m() {
        return this.f155730m;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void setNotificationsActivated(@l Boolean bool) {
        this.f155730m = bool;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void setSubscribed(boolean z12) {
        this.f155728k = z12;
    }

    @Override // com.avito.android.favorite_sellers.SubscribableItem
    public final void u3(boolean z12) {
        this.f155731n = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155719b);
        parcel.writeString(this.f155720c);
        parcel.writeString(this.f155721d);
        parcel.writeString(this.f155722e);
        parcel.writeParcelable(this.f155723f, i12);
        parcel.writeString(this.f155724g.name());
        parcel.writeInt(this.f155725h ? 1 : 0);
        parcel.writeInt(this.f155726i ? 1 : 0);
        parcel.writeParcelable(this.f155727j, i12);
        parcel.writeInt(this.f155728k ? 1 : 0);
        parcel.writeInt(this.f155729l ? 1 : 0);
        Boolean bool = this.f155730m;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f155731n ? 1 : 0);
        Boolean bool2 = this.f155732o;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public /* synthetic */ SellerItem(String str, String str2, String str3, String str4, Image image, AvatarShape avatarShape, boolean z12, boolean z13, DeepLink deepLink, boolean z14, boolean z15, Boolean bool, boolean z16, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, image, avatarShape, z12, z13, deepLink, (i12 & 512) != 0 ? true : z14, (i12 & 1024) != 0 ? false : z15, (i12 & 2048) != 0 ? Boolean.TRUE : bool, (i12 & 4096) != 0 ? false : z16, bool2);
    }
}
