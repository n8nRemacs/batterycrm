package com.avito.android.advert.item.brandingGallery.items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandingGalleryBlockElementItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/items/BrandingGalleryBlockElementItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BrandingGalleryBlockElementItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<BrandingGalleryBlockElementItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f74149b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f74150c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74151d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f74152e;

    /* compiled from: BrandingGalleryBlockElementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingGalleryBlockElementItem> {
        @Override // android.os.Parcelable.Creator
        public final BrandingGalleryBlockElementItem createFromParcel(Parcel parcel) {
            return new BrandingGalleryBlockElementItem((UniversalImage) parcel.readParcelable(BrandingGalleryBlockElementItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(BrandingGalleryBlockElementItem.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BrandingGalleryBlockElementItem[] newArray(int i12) {
            return new BrandingGalleryBlockElementItem[i12];
        }
    }

    public BrandingGalleryBlockElementItem(@k UniversalImage universalImage, @l DeepLink deepLink, long j12, @k String str) {
        this.f74149b = universalImage;
        this.f74150c = deepLink;
        this.f74151d = j12;
        this.f74152e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingGalleryBlockElementItem)) {
            return false;
        }
        BrandingGalleryBlockElementItem brandingGalleryBlockElementItem = (BrandingGalleryBlockElementItem) obj;
        return L.f(this.f74149b, brandingGalleryBlockElementItem.f74149b) && L.f(this.f74150c, brandingGalleryBlockElementItem.f74150c) && this.f74151d == brandingGalleryBlockElementItem.f74151d && L.f(this.f74152e, brandingGalleryBlockElementItem.f74152e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85003b() {
        return this.f74151d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF9890b() {
        return this.f74152e;
    }

    public final int hashCode() {
        int iHashCode = this.f74149b.hashCode() * 31;
        DeepLink deepLink = this.f74150c;
        return this.f74152e.hashCode() + r.g((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f74151d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingGalleryBlockElementItem(image=");
        sb2.append(this.f74149b);
        sb2.append(", deeplink=");
        sb2.append(this.f74150c);
        sb2.append(", id=");
        sb2.append(this.f74151d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f74152e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f74149b, i12);
        parcel.writeParcelable(this.f74150c, i12);
        parcel.writeLong(this.f74151d);
        parcel.writeString(this.f74152e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrandingGalleryBlockElementItem(UniversalImage universalImage, DeepLink deepLink, long j12, String str, int i12, C42822w c42822w) {
        DeepLink deepLink2 = (i12 & 2) != 0 ? null : deepLink;
        if ((i12 & 4) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 203;
        }
        long j13 = j12;
        this(universalImage, deepLink2, j13, (i12 & 8) != 0 ? String.valueOf(j13) : str);
    }
}
