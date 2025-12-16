package com.avito.android.advert.item.job_seeker_apply_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SeekerResponsesInfoItemV2.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/job_seeker_apply_info/SeekerResponsesInfoItemV2;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SeekerResponsesInfoItemV2 implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<SeekerResponsesInfoItemV2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f77227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77228c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f77229d;

    /* compiled from: SeekerResponsesInfoItemV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SeekerResponsesInfoItemV2> {
        @Override // android.os.Parcelable.Creator
        public final SeekerResponsesInfoItemV2 createFromParcel(Parcel parcel) {
            return new SeekerResponsesInfoItemV2(parcel.readInt(), (AttributedText) parcel.readParcelable(SeekerResponsesInfoItemV2.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeekerResponsesInfoItemV2[] newArray(int i12) {
            return new SeekerResponsesInfoItemV2[i12];
        }
    }

    public SeekerResponsesInfoItemV2(int i12, @k AttributedText attributedText, @k String str) {
        this.f77227b = str;
        this.f77228c = i12;
        this.f77229d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeekerResponsesInfoItemV2)) {
            return false;
        }
        SeekerResponsesInfoItemV2 seekerResponsesInfoItemV2 = (SeekerResponsesInfoItemV2) obj;
        return L.f(this.f77227b, seekerResponsesInfoItemV2.f77227b) && this.f77228c == seekerResponsesInfoItemV2.f77228c && L.f(this.f77229d, seekerResponsesInfoItemV2.f77229d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85702c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85704e() {
        return this.f77228c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85703d() {
        return this.f77227b;
    }

    public final int hashCode() {
        return this.f77229d.hashCode() + r.e(this.f77228c, this.f77227b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SeekerResponsesInfoItemV2(stringId=");
        sb2.append(this.f77227b);
        sb2.append(", spanCount=");
        sb2.append(this.f77228c);
        sb2.append(", content=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f77229d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f77227b);
        parcel.writeInt(this.f77228c);
        parcel.writeParcelable(this.f77229d, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SeekerResponsesInfoItemV2(String str, int i12, AttributedText attributedText, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            str = "ITEM_SEEKER_RESPONSES_INFO_V2";
        }
        this(i12, attributedText, str);
    }
}
