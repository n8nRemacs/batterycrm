package com.avito.android.advert.item.rent_agreement;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.RentAgreement;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RentAgreementItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/rent_agreement/RentAgreementItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RentAgreementItem implements BlockItem {

    @k
    public static final Parcelable.Creator<RentAgreementItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78563b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78564c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78565d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RentAgreement f78566e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f78567f;

    /* compiled from: RentAgreementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RentAgreementItem> {
        @Override // android.os.Parcelable.Creator
        public final RentAgreementItem createFromParcel(Parcel parcel) {
            return new RentAgreementItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (RentAgreement) parcel.readParcelable(RentAgreementItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RentAgreementItem[] newArray(int i12) {
            return new RentAgreementItem[i12];
        }
    }

    public RentAgreementItem(long j12, @k String str, int i12, @k RentAgreement rentAgreement, @k String str2) {
        this.f78563b = j12;
        this.f78564c = str;
        this.f78565d = i12;
        this.f78566e = rentAgreement;
        this.f78567f = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new RentAgreementItem(this.f78563b, this.f78564c, i12, this.f78566e, this.f78567f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RentAgreementItem)) {
            return false;
        }
        RentAgreementItem rentAgreementItem = (RentAgreementItem) obj;
        return this.f78563b == rentAgreementItem.f78563b && L.f(this.f78564c, rentAgreementItem.f78564c) && this.f78565d == rentAgreementItem.f78565d && L.f(this.f78566e, rentAgreementItem.f78566e) && L.f(this.f78567f, rentAgreementItem.f78567f);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final RentAgreement getF78566e() {
        return this.f78566e;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80596b() {
        return this.f78563b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f78565d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97044b() {
        return this.f78564c;
    }

    public final int hashCode() {
        return this.f78567f.hashCode() + ((this.f78566e.hashCode() + r.e(this.f78565d, H.d(Long.hashCode(this.f78563b) * 31, 31, this.f78564c), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RentAgreementItem(id=");
        sb2.append(this.f78563b);
        sb2.append(", stringId=");
        sb2.append(this.f78564c);
        sb2.append(", spanCount=");
        sb2.append(this.f78565d);
        sb2.append(", data=");
        sb2.append(this.f78566e);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f78567f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78563b);
        parcel.writeString(this.f78564c);
        parcel.writeInt(this.f78565d);
        parcel.writeParcelable(this.f78566e, i12);
        parcel.writeString(this.f78567f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RentAgreementItem(long j12, String str, int i12, RentAgreement rentAgreement, String str2, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 44;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, rentAgreement, str2);
    }
}
