package com.avito.android.advert.item.consultation.secondary;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.advert_details.realty.NonNdForm;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SecondaryConsultationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/secondary/SecondaryConsultationItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SecondaryConsultationItem implements BlockItem {

    @k
    public static final Parcelable.Creator<SecondaryConsultationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74796b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f74797c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74798d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final NonNdForm f74799e;

    /* compiled from: SecondaryConsultationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SecondaryConsultationItem> {
        @Override // android.os.Parcelable.Creator
        public final SecondaryConsultationItem createFromParcel(Parcel parcel) {
            return new SecondaryConsultationItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (NonNdForm) parcel.readParcelable(SecondaryConsultationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SecondaryConsultationItem[] newArray(int i12) {
            return new SecondaryConsultationItem[i12];
        }
    }

    public SecondaryConsultationItem(long j12, @k String str, int i12, @l NonNdForm nonNdForm) {
        this.f74796b = j12;
        this.f74797c = str;
        this.f74798d = i12;
        this.f74799e = nonNdForm;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new SecondaryConsultationItem(this.f74796b, this.f74797c, i12, this.f74799e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryConsultationItem)) {
            return false;
        }
        SecondaryConsultationItem secondaryConsultationItem = (SecondaryConsultationItem) obj;
        return this.f74796b == secondaryConsultationItem.f74796b && L.f(this.f74797c, secondaryConsultationItem.f74797c) && this.f74798d == secondaryConsultationItem.f74798d && L.f(this.f74799e, secondaryConsultationItem.f74799e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF271695b() {
        return this.f74796b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271702i() {
        return this.f74798d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324097b() {
        return this.f74797c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f74798d, H.d(Long.hashCode(this.f74796b) * 31, 31, this.f74797c), 31);
        NonNdForm nonNdForm = this.f74799e;
        return iE2 + (nonNdForm == null ? 0 : nonNdForm.hashCode());
    }

    @k
    public final String toString() {
        return "SecondaryConsultationItem(id=" + this.f74796b + ", stringId=" + this.f74797c + ", spanCount=" + this.f74798d + ", data=" + this.f74799e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f74796b);
        parcel.writeString(this.f74797c);
        parcel.writeInt(this.f74798d);
        parcel.writeParcelable(this.f74799e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecondaryConsultationItem(long j12, String str, int i12, NonNdForm nonNdForm, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 40;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, nonNdForm);
    }
}
