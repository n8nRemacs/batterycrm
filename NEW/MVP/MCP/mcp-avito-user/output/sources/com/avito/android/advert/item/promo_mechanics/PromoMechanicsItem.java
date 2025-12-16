package com.avito.android.advert.item.promo_mechanics;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.promo_mechanics.PromoMechanics;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoMechanicsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/promo_mechanics/PromoMechanicsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PromoMechanicsItem implements BlockItem {

    @k
    public static final Parcelable.Creator<PromoMechanicsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78253b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78254c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78255d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PromoMechanics f78256e;

    /* compiled from: PromoMechanicsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoMechanicsItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoMechanicsItem createFromParcel(Parcel parcel) {
            return new PromoMechanicsItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (PromoMechanics) parcel.readParcelable(PromoMechanicsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoMechanicsItem[] newArray(int i12) {
            return new PromoMechanicsItem[i12];
        }
    }

    public PromoMechanicsItem(long j12, @k String str, int i12, @l PromoMechanics promoMechanics) {
        this.f78253b = j12;
        this.f78254c = str;
        this.f78255d = i12;
        this.f78256e = promoMechanics;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PromoMechanicsItem(this.f78253b, this.f78254c, i12, this.f78256e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoMechanicsItem)) {
            return false;
        }
        PromoMechanicsItem promoMechanicsItem = (PromoMechanicsItem) obj;
        return this.f78253b == promoMechanicsItem.f78253b && L.f(this.f78254c, promoMechanicsItem.f78254c) && this.f78255d == promoMechanicsItem.f78255d && L.f(this.f78256e, promoMechanicsItem.f78256e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF82706b() {
        return this.f78253b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272678l() {
        return this.f78255d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96989b() {
        return this.f78254c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f78255d, H.d(Long.hashCode(this.f78253b) * 31, 31, this.f78254c), 31);
        PromoMechanics promoMechanics = this.f78256e;
        return iE2 + (promoMechanics == null ? 0 : promoMechanics.hashCode());
    }

    @k
    public final String toString() {
        return "PromoMechanicsItem(id=" + this.f78253b + ", stringId=" + this.f78254c + ", spanCount=" + this.f78255d + ", promoMechanics=" + this.f78256e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78253b);
        parcel.writeString(this.f78254c);
        parcel.writeInt(this.f78255d);
        parcel.writeParcelable(this.f78256e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PromoMechanicsItem(long j12, String str, int i12, PromoMechanics promoMechanics, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 187;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, promoMechanics);
    }
}
