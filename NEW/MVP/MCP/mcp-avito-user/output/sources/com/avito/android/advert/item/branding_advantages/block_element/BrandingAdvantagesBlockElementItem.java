package com.avito.android.advert.item.branding_advantages.block_element;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandingAdvantagesBlockElementItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block_element/BrandingAdvantagesBlockElementItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BrandingAdvantagesBlockElementItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<BrandingAdvantagesBlockElementItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f74199c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalColor f74200d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74201e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f74202f;

    /* compiled from: BrandingAdvantagesBlockElementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingAdvantagesBlockElementItem> {
        @Override // android.os.Parcelable.Creator
        public final BrandingAdvantagesBlockElementItem createFromParcel(Parcel parcel) {
            return new BrandingAdvantagesBlockElementItem(parcel.readString(), (UniversalImage) parcel.readParcelable(BrandingAdvantagesBlockElementItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BrandingAdvantagesBlockElementItem.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BrandingAdvantagesBlockElementItem[] newArray(int i12) {
            return new BrandingAdvantagesBlockElementItem[i12];
        }
    }

    public BrandingAdvantagesBlockElementItem(@k String str, @k UniversalImage universalImage, @k UniversalColor universalColor, long j12, @k String str2) {
        this.f74198b = str;
        this.f74199c = universalImage;
        this.f74200d = universalColor;
        this.f74201e = j12;
        this.f74202f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingAdvantagesBlockElementItem)) {
            return false;
        }
        BrandingAdvantagesBlockElementItem brandingAdvantagesBlockElementItem = (BrandingAdvantagesBlockElementItem) obj;
        return L.f(this.f74198b, brandingAdvantagesBlockElementItem.f74198b) && L.f(this.f74199c, brandingAdvantagesBlockElementItem.f74199c) && L.f(this.f74200d, brandingAdvantagesBlockElementItem.f74200d) && this.f74201e == brandingAdvantagesBlockElementItem.f74201e && L.f(this.f74202f, brandingAdvantagesBlockElementItem.f74202f);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF117182c() {
        return this.f74201e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281466b() {
        return this.f74202f;
    }

    public final int hashCode() {
        return this.f74202f.hashCode() + r.g(com.avito.android.actions_sheet.a.i(this.f74200d, com.avito.android.actions_sheet.a.a(this.f74198b.hashCode() * 31, 31, this.f74199c), 31), 31, this.f74201e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingAdvantagesBlockElementItem(title=");
        sb2.append(this.f74198b);
        sb2.append(", icon=");
        sb2.append(this.f74199c);
        sb2.append(", backgroundColor=");
        sb2.append(this.f74200d);
        sb2.append(", id=");
        sb2.append(this.f74201e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f74202f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f74198b);
        parcel.writeParcelable(this.f74199c, i12);
        parcel.writeParcelable(this.f74200d, i12);
        parcel.writeLong(this.f74201e);
        parcel.writeString(this.f74202f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrandingAdvantagesBlockElementItem(String str, UniversalImage universalImage, UniversalColor universalColor, long j12, String str2, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 205;
        }
        long j13 = j12;
        this(str, universalImage, universalColor, j13, (i12 & 16) != 0 ? String.valueOf(j13) : str2);
    }
}
