package com.avito.android.advert.item.leadauto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.advert_details.consultation_auto.AutoNewCarsLeadForm;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoNewCarsLeadFormItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leadauto/AutoNewCarsLeadFormItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoNewCarsLeadFormItem implements BlockItem, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<AutoNewCarsLeadFormItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77255b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f77256c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77257d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AutoNewCarsLeadForm f77258e;

    /* renamed from: f, reason: collision with root package name */
    public final long f77259f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f77260g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Long f77261h;

    /* renamed from: i, reason: collision with root package name */
    public final long f77262i;

    /* compiled from: AutoNewCarsLeadFormItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoNewCarsLeadFormItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoNewCarsLeadFormItem createFromParcel(Parcel parcel) {
            return new AutoNewCarsLeadFormItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (AutoNewCarsLeadForm) parcel.readParcelable(AutoNewCarsLeadFormItem.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoNewCarsLeadFormItem[] newArray(int i12) {
            return new AutoNewCarsLeadFormItem[i12];
        }
    }

    public AutoNewCarsLeadFormItem(long j12, @Y61.k String str, int i12, @Y61.k AutoNewCarsLeadForm autoNewCarsLeadForm, long j13, @Y61.l Long l12, @Y61.l Long l13) {
        this.f77255b = j12;
        this.f77256c = str;
        this.f77257d = i12;
        this.f77258e = autoNewCarsLeadForm;
        this.f77259f = j13;
        this.f77260g = l12;
        this.f77261h = l13;
        this.f77262i = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AutoNewCarsLeadFormItem(this.f77255b, this.f77256c, i12, this.f77258e, this.f77259f, this.f77260g, this.f77261h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoNewCarsLeadFormItem)) {
            return false;
        }
        AutoNewCarsLeadFormItem autoNewCarsLeadFormItem = (AutoNewCarsLeadFormItem) obj;
        return this.f77255b == autoNewCarsLeadFormItem.f77255b && L.f(this.f77256c, autoNewCarsLeadFormItem.f77256c) && this.f77257d == autoNewCarsLeadFormItem.f77257d && L.f(this.f77258e, autoNewCarsLeadFormItem.f77258e) && this.f77259f == autoNewCarsLeadFormItem.f77259f && L.f(this.f77260g, autoNewCarsLeadFormItem.f77260g) && L.f(this.f77261h, autoNewCarsLeadFormItem.f77261h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF76078b() {
        return this.f77255b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF76082f() {
        return this.f77257d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324780b() {
        return this.f77256c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF270103g() {
        return this.f77262i;
    }

    public final int hashCode() {
        int iG2 = r.g((this.f77258e.hashCode() + r.e(this.f77257d, H.d(Long.hashCode(this.f77255b) * 31, 31, this.f77256c), 31)) * 31, 31, this.f77259f);
        Long l12 = this.f77260g;
        int iHashCode = (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f77261h;
        return iHashCode + (l13 != null ? l13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoNewCarsLeadFormItem(id=");
        sb2.append(this.f77255b);
        sb2.append(", stringId=");
        sb2.append(this.f77256c);
        sb2.append(", spanCount=");
        sb2.append(this.f77257d);
        sb2.append(", data=");
        sb2.append(this.f77258e);
        sb2.append(", itemId=");
        sb2.append(this.f77259f);
        sb2.append(", uid=");
        sb2.append(this.f77260g);
        sb2.append(", cid=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f77261h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f77255b);
        parcel.writeString(this.f77256c);
        parcel.writeInt(this.f77257d);
        parcel.writeParcelable(this.f77258e, i12);
        parcel.writeLong(this.f77259f);
        Long l12 = this.f77260g;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f77261h;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoNewCarsLeadFormItem(long j12, String str, int i12, AutoNewCarsLeadForm autoNewCarsLeadForm, long j13, Long l12, Long l13, int i13, C42822w c42822w) {
        long j14;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j14 = 42;
        } else {
            j14 = j12;
        }
        this(j14, (i13 & 2) != 0 ? String.valueOf(j14) : str, (i13 & 4) != 0 ? 2 : i12, autoNewCarsLeadForm, j13, l12, l13);
    }
}
