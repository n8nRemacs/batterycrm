package com.avito.android.advert_details_items.search_suggests;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsSearchSuggestItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/search_suggests/AdvertDetailsSearchSuggestItem;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSearchSuggestItem implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsSearchSuggestItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Uri f85503b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f85504c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f85505d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f85506e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f85507f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f85508g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f85509h;

    /* compiled from: AdvertDetailsSearchSuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSearchSuggestItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSearchSuggestItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSearchSuggestItem((Uri) parcel.readParcelable(AdvertDetailsSearchSuggestItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertDetailsSearchSuggestItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSearchSuggestItem[] newArray(int i12) {
            return new AdvertDetailsSearchSuggestItem[i12];
        }
    }

    public AdvertDetailsSearchSuggestItem(@l Uri uri, @l String str, @l String str2, @l DeepLink deepLink, @l String str3, @l String str4, @l String str5) {
        this.f85503b = uri;
        this.f85504c = str;
        this.f85505d = str2;
        this.f85506e = deepLink;
        this.f85507f = str3;
        this.f85508g = str4;
        this.f85509h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSearchSuggestItem)) {
            return false;
        }
        AdvertDetailsSearchSuggestItem advertDetailsSearchSuggestItem = (AdvertDetailsSearchSuggestItem) obj;
        return L.f(this.f85503b, advertDetailsSearchSuggestItem.f85503b) && L.f(this.f85504c, advertDetailsSearchSuggestItem.f85504c) && L.f(this.f85505d, advertDetailsSearchSuggestItem.f85505d) && L.f(this.f85506e, advertDetailsSearchSuggestItem.f85506e) && L.f(this.f85507f, advertDetailsSearchSuggestItem.f85507f) && L.f(this.f85508g, advertDetailsSearchSuggestItem.f85508g) && L.f(this.f85509h, advertDetailsSearchSuggestItem.f85509h);
    }

    public final int hashCode() {
        Uri uri = this.f85503b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f85504c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85505d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f85506e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str3 = this.f85507f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85508g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f85509h;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSearchSuggestItem(icon=");
        sb2.append(this.f85503b);
        sb2.append(", title=");
        sb2.append(this.f85504c);
        sb2.append(", description=");
        sb2.append(this.f85505d);
        sb2.append(", deepLink=");
        sb2.append(this.f85506e);
        sb2.append(", cid=");
        sb2.append(this.f85507f);
        sb2.append(", iid=");
        sb2.append(this.f85508g);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f85509h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f85503b, i12);
        parcel.writeString(this.f85504c);
        parcel.writeString(this.f85505d);
        parcel.writeParcelable(this.f85506e, i12);
        parcel.writeString(this.f85507f);
        parcel.writeString(this.f85508g);
        parcel.writeString(this.f85509h);
    }
}
