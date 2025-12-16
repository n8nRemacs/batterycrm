package com.avito.android.advert.item.consultation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.advert_details.realty.ContactBarButtonData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConsultationButtonItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/ConsultationButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ConsultationButtonItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<ConsultationButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74650c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74651d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f74652e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ConsultationFormData f74653f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ContactBarButtonData f74654g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f74655h;

    /* compiled from: ConsultationButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConsultationButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ConsultationButtonItem createFromParcel(Parcel parcel) {
            return new ConsultationButtonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), (ConsultationFormData) parcel.readParcelable(ConsultationButtonItem.class.getClassLoader()), (ContactBarButtonData) parcel.readParcelable(ConsultationButtonItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConsultationButtonItem[] newArray(int i12) {
            return new ConsultationButtonItem[i12];
        }
    }

    public ConsultationButtonItem(long j12, @Y61.k String str, int i12, @Y61.l String str2, @Y61.l ConsultationFormData consultationFormData, @Y61.l ContactBarButtonData contactBarButtonData, @Y61.l String str3) {
        this.f74649b = j12;
        this.f74650c = str;
        this.f74651d = i12;
        this.f74652e = str2;
        this.f74653f = consultationFormData;
        this.f74654g = contactBarButtonData;
        this.f74655h = str3;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new ConsultationButtonItem(this.f74649b, this.f74650c, i12, this.f74652e, this.f74653f, this.f74654g, this.f74655h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsultationButtonItem)) {
            return false;
        }
        ConsultationButtonItem consultationButtonItem = (ConsultationButtonItem) obj;
        return this.f74649b == consultationButtonItem.f74649b && kotlin.jvm.internal.L.f(this.f74650c, consultationButtonItem.f74650c) && this.f74651d == consultationButtonItem.f74651d && kotlin.jvm.internal.L.f(this.f74652e, consultationButtonItem.f74652e) && kotlin.jvm.internal.L.f(this.f74653f, consultationButtonItem.f74653f) && kotlin.jvm.internal.L.f(this.f74654g, consultationButtonItem.f74654g) && kotlin.jvm.internal.L.f(this.f74655h, consultationButtonItem.f74655h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74151d() {
        return this.f74649b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268787h() {
        return this.f74651d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74152e() {
        return this.f74650c;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f74651d, androidx.compose.foundation.H.d(Long.hashCode(this.f74649b) * 31, 31, this.f74650c), 31);
        String str = this.f74652e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        ConsultationFormData consultationFormData = this.f74653f;
        int iHashCode2 = (iHashCode + (consultationFormData == null ? 0 : consultationFormData.hashCode())) * 31;
        ContactBarButtonData contactBarButtonData = this.f74654g;
        int iHashCode3 = (iHashCode2 + (contactBarButtonData == null ? 0 : contactBarButtonData.hashCode())) * 31;
        String str2 = this.f74655h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationButtonItem(id=");
        sb2.append(this.f74649b);
        sb2.append(", stringId=");
        sb2.append(this.f74650c);
        sb2.append(", spanCount=");
        sb2.append(this.f74651d);
        sb2.append(", text=");
        sb2.append(this.f74652e);
        sb2.append(", formData=");
        sb2.append(this.f74653f);
        sb2.append(", buttonData=");
        sb2.append(this.f74654g);
        sb2.append(", requestType=");
        return C22026a.c(sb2, this.f74655h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74649b);
        parcel.writeString(this.f74650c);
        parcel.writeInt(this.f74651d);
        parcel.writeString(this.f74652e);
        parcel.writeParcelable(this.f74653f, i12);
        parcel.writeParcelable(this.f74654g, i12);
        parcel.writeString(this.f74655h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsultationButtonItem(long j12, String str, int i12, String str2, ConsultationFormData consultationFormData, ContactBarButtonData contactBarButtonData, String str3, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 38;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, str2, (i13 & 16) != 0 ? null : consultationFormData, (i13 & 32) != 0 ? null : contactBarButtonData, (i13 & 64) != 0 ? null : str3);
    }
}
