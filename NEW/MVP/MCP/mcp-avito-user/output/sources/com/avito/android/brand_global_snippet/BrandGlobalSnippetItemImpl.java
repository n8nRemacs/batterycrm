package com.avito.android.brand_global_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: BrandGlobalSnippetItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetItemImpl;", "Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetItem;", "_avito_bx-content_snippet_brand-global-snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandGlobalSnippetItemImpl implements BrandGlobalSnippetItem {

    @k
    public static final Parcelable.Creator<BrandGlobalSnippetItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f107466b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107467c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f107468d;

    /* renamed from: e, reason: collision with root package name */
    public final long f107469e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f107470f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f107471g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f107472h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f107473i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Image f107474j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f107475k;

    /* renamed from: l, reason: collision with root package name */
    public final int f107476l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f107477m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f107478n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final AdvertisementVerticalAlias f107479o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final FavoritesToast f107480p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107481q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final SerpViewType f107482r;

    /* compiled from: BrandGlobalSnippetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandGlobalSnippetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final BrandGlobalSnippetItemImpl createFromParcel(Parcel parcel) {
            return new BrandGlobalSnippetItemImpl(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(BrandGlobalSnippetItemImpl.class.getClassLoader()), (Image) parcel.readParcelable(BrandGlobalSnippetItemImpl.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString()), (FavoritesToast) parcel.readParcelable(BrandGlobalSnippetItemImpl.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BrandGlobalSnippetItemImpl[] newArray(int i12) {
            return new BrandGlobalSnippetItemImpl[i12];
        }
    }

    public BrandGlobalSnippetItemImpl(long j12, @k String str, @k String str2, long j13, @k String str3, @k String str4, @k String str5, @k DeepLink deepLink, @k Image image, boolean z12, int i12, @k String str6, @l String str7, @l AdvertisementVerticalAlias advertisementVerticalAlias, @l FavoritesToast favoritesToast, boolean z13) {
        this.f107466b = j12;
        this.f107467c = str;
        this.f107468d = str2;
        this.f107469e = j13;
        this.f107470f = str3;
        this.f107471g = str4;
        this.f107472h = str5;
        this.f107473i = deepLink;
        this.f107474j = image;
        this.f107475k = z12;
        this.f107476l = i12;
        this.f107477m = str6;
        this.f107478n = str7;
        this.f107479o = advertisementVerticalAlias;
        this.f107480p = favoritesToast;
        this.f107481q = z13;
        this.f107482r = SerpViewType.f268583c;
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    public final BrandGlobalSnippetItemImpl V4() {
        return new BrandGlobalSnippetItemImpl(this.f107466b, this.f107467c, this.f107468d, this.f107469e, this.f107470f, this.f107471g, this.f107472h, this.f107473i, this.f107474j, this.f107475k, this.f107476l, this.f107477m, this.f107478n, this.f107479o, this.f107480p, true);
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: Z3, reason: from getter */
    public final String getF107470f() {
        return this.f107470f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandGlobalSnippetItemImpl)) {
            return false;
        }
        BrandGlobalSnippetItemImpl brandGlobalSnippetItemImpl = (BrandGlobalSnippetItemImpl) obj;
        return this.f107466b == brandGlobalSnippetItemImpl.f107466b && L.f(this.f107467c, brandGlobalSnippetItemImpl.f107467c) && L.f(this.f107468d, brandGlobalSnippetItemImpl.f107468d) && this.f107469e == brandGlobalSnippetItemImpl.f107469e && L.f(this.f107470f, brandGlobalSnippetItemImpl.f107470f) && L.f(this.f107471g, brandGlobalSnippetItemImpl.f107471g) && L.f(this.f107472h, brandGlobalSnippetItemImpl.f107472h) && L.f(this.f107473i, brandGlobalSnippetItemImpl.f107473i) && L.f(this.f107474j, brandGlobalSnippetItemImpl.f107474j) && this.f107475k == brandGlobalSnippetItemImpl.f107475k && this.f107476l == brandGlobalSnippetItemImpl.f107476l && L.f(this.f107477m, brandGlobalSnippetItemImpl.f107477m) && L.f(this.f107478n, brandGlobalSnippetItemImpl.f107478n) && this.f107479o == brandGlobalSnippetItemImpl.f107479o && L.f(this.f107480p, brandGlobalSnippetItemImpl.f107480p) && this.f107481q == brandGlobalSnippetItemImpl.f107481q;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF156395G() {
        return this.f107478n;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getFavoritesToast, reason: from getter */
    public final FavoritesToast getF156397I() {
        return this.f107480p;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF231631p() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75092b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: getImage, reason: from getter */
    public final Image getF107474j() {
        return this.f107474j;
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: getLocationName, reason: from getter */
    public final String getF107468d() {
        return this.f107468d;
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: getPrice, reason: from getter */
    public final String getF107472h() {
        return this.f107472h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f107476l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f107477m;
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF107471g() {
        return this.f107471g;
    }

    @Override // com.avito.android.serp.adapter.S
    @l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF156396H() {
        return this.f107479o;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f107482r;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f107476l, r.i(com.avito.android.actions_sheet.a.g(this.f107474j, com.avito.android.actions_sheet.a.e(this.f107473i, H.d(H.d(H.d(r.g(H.d(H.d(Long.hashCode(this.f107466b) * 31, 31, this.f107467c), 31, this.f107468d), 31, this.f107469e), 31, this.f107470f), 31, this.f107471g), 31, this.f107472h), 31), 31), 31, this.f107475k), 31), 31, this.f107477m);
        String str = this.f107478n;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f107479o;
        int iHashCode2 = (iHashCode + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        FavoritesToast favoritesToast = this.f107480p;
        return Boolean.hashCode(this.f107481q) + ((iHashCode2 + (favoritesToast != null ? favoritesToast.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite, reason: from getter */
    public final boolean getF156394F() {
        return this.f107475k;
    }

    @Override // com.avito.android.serp.adapter.m1
    /* renamed from: isViewed, reason: from getter */
    public final boolean getF156398J() {
        return this.f107481q;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
        this.f107475k = z12;
    }

    @Override // com.avito.android.serp.adapter.m1
    public final void setViewed(boolean z12) {
        this.f107481q = z12;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandGlobalSnippetItemImpl(categoryId=");
        sb2.append(this.f107466b);
        sb2.append(", categoryName=");
        sb2.append(this.f107467c);
        sb2.append(", locationName=");
        sb2.append(this.f107468d);
        sb2.append(", locationId=");
        sb2.append(this.f107469e);
        sb2.append(", creationDate=");
        sb2.append(this.f107470f);
        sb2.append(", title=");
        sb2.append(this.f107471g);
        sb2.append(", price=");
        sb2.append(this.f107472h);
        sb2.append(", itemDeepLink=");
        sb2.append(this.f107473i);
        sb2.append(", image=");
        sb2.append(this.f107474j);
        sb2.append(", isFavorite=");
        sb2.append(this.f107475k);
        sb2.append(", spanCount=");
        sb2.append(this.f107476l);
        sb2.append(", stringId=");
        sb2.append(this.f107477m);
        sb2.append(", analyticsContext=");
        sb2.append(this.f107478n);
        sb2.append(", verticalAlias=");
        sb2.append(this.f107479o);
        sb2.append(", favoritesToast=");
        sb2.append(this.f107480p);
        sb2.append(", isViewed=");
        return r.x(sb2, this.f107481q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f107466b);
        parcel.writeString(this.f107467c);
        parcel.writeString(this.f107468d);
        parcel.writeLong(this.f107469e);
        parcel.writeString(this.f107470f);
        parcel.writeString(this.f107471g);
        parcel.writeString(this.f107472h);
        parcel.writeParcelable(this.f107473i, i12);
        parcel.writeParcelable(this.f107474j, i12);
        parcel.writeInt(this.f107475k ? 1 : 0);
        parcel.writeInt(this.f107476l);
        parcel.writeString(this.f107477m);
        parcel.writeString(this.f107478n);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f107479o;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        parcel.writeParcelable(this.f107480p, i12);
        parcel.writeInt(this.f107481q ? 1 : 0);
    }

    @Override // com.avito.android.brand_global_snippet.BrandGlobalSnippetItem
    @k
    /* renamed from: y2, reason: from getter */
    public final DeepLink getF107473i() {
        return this.f107473i;
    }

    public /* synthetic */ BrandGlobalSnippetItemImpl(long j12, String str, String str2, long j13, String str3, String str4, String str5, DeepLink deepLink, Image image, boolean z12, int i12, String str6, String str7, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, boolean z13, int i13, C42822w c42822w) {
        this(j12, str, str2, j13, str3, str4, str5, deepLink, image, z12, i12, str6, (i13 & 4096) != 0 ? null : str7, (i13 & 8192) != 0 ? null : advertisementVerticalAlias, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : favoritesToast, (i13 & 32768) != 0 ? false : z13);
    }
}
