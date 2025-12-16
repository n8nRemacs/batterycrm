package com.avito.android.advert_core.information_about;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InformationAboutItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/information_about/InformationAboutItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InformationAboutItem implements BlockItem {

    @k
    public static final Parcelable.Creator<InformationAboutItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83681b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83683d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f83684e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f83685f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f83686g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f83687h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f83688i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f83689j;

    /* compiled from: InformationAboutItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InformationAboutItem> {
        @Override // android.os.Parcelable.Creator
        public final InformationAboutItem createFromParcel(Parcel parcel) {
            return new InformationAboutItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InformationAboutItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InformationAboutItem[] newArray(int i12) {
            return new InformationAboutItem[i12];
        }
    }

    public InformationAboutItem(long j12, @k String str, int i12, @k String str2, @l String str3, @l String str4, @k String str5, @k DeepLink deepLink, @l String str6) {
        this.f83681b = j12;
        this.f83682c = str;
        this.f83683d = i12;
        this.f83684e = str2;
        this.f83685f = str3;
        this.f83686g = str4;
        this.f83687h = str5;
        this.f83688i = deepLink;
        this.f83689j = str6;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new InformationAboutItem(this.f83681b, this.f83682c, i12, this.f83684e, this.f83685f, this.f83686g, this.f83687h, this.f83688i, this.f83689j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InformationAboutItem)) {
            return false;
        }
        InformationAboutItem informationAboutItem = (InformationAboutItem) obj;
        return this.f83681b == informationAboutItem.f83681b && L.f(this.f83682c, informationAboutItem.f83682c) && this.f83683d == informationAboutItem.f83683d && L.f(this.f83684e, informationAboutItem.f83684e) && L.f(this.f83685f, informationAboutItem.f83685f) && L.f(this.f83686g, informationAboutItem.f83686g) && L.f(this.f83687h, informationAboutItem.f83687h) && L.f(this.f83688i, informationAboutItem.f83688i) && L.f(this.f83689j, informationAboutItem.f83689j);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF268422b() {
        return this.f83681b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268372C() {
        return this.f83683d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298989b() {
        return this.f83682c;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f83683d, H.d(Long.hashCode(this.f83681b) * 31, 31, this.f83682c), 31), 31, this.f83684e);
        String str = this.f83685f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83686g;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f83688i, H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f83687h), 31);
        String str3 = this.f83689j;
        return iE2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InformationAboutItem(id=");
        sb2.append(this.f83681b);
        sb2.append(", stringId=");
        sb2.append(this.f83682c);
        sb2.append(", spanCount=");
        sb2.append(this.f83683d);
        sb2.append(", title=");
        sb2.append(this.f83684e);
        sb2.append(", iconName=");
        sb2.append(this.f83685f);
        sb2.append(", iconColor=");
        sb2.append(this.f83686g);
        sb2.append(", textAbout=");
        sb2.append(this.f83687h);
        sb2.append(", deeplink=");
        sb2.append(this.f83688i);
        sb2.append(", bottomSheetText=");
        return C22026a.c(sb2, this.f83689j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f83681b);
        parcel.writeString(this.f83682c);
        parcel.writeInt(this.f83683d);
        parcel.writeString(this.f83684e);
        parcel.writeString(this.f83685f);
        parcel.writeString(this.f83686g);
        parcel.writeString(this.f83687h);
        parcel.writeParcelable(this.f83688i, i12);
        parcel.writeString(this.f83689j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InformationAboutItem(long j12, String str, int i12, String str2, String str3, String str4, String str5, DeepLink deepLink, String str6, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 136;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, str2, str3, str4, str5, deepLink, str6);
    }
}
