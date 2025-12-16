package com.avito.android.advert.item.cv_state;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.cv_state.CvState;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvStateItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/cv_state/AdvertCvStateItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCvStateItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertCvStateItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75055c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CvState f75056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75057e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75058f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f75059g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f75060h;

    /* compiled from: AdvertCvStateItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCvStateItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCvStateItem createFromParcel(Parcel parcel) {
            return new AdvertCvStateItem(parcel.readLong(), parcel.readString(), (CvState) parcel.readParcelable(AdvertCvStateItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCvStateItem[] newArray(int i12) {
            return new AdvertCvStateItem[i12];
        }
    }

    public AdvertCvStateItem(long j12, @k String str, @k CvState cvState, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f75054b = j12;
        this.f75055c = str;
        this.f75056d = cvState;
        this.f75057e = z12;
        this.f75058f = i12;
        this.f75059g = serpDisplayType;
        this.f75060h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f75059g;
        return new AdvertCvStateItem(this.f75054b, this.f75055c, this.f75056d, this.f75057e, i12, serpDisplayType, this.f75060h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75059g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCvStateItem)) {
            return false;
        }
        AdvertCvStateItem advertCvStateItem = (AdvertCvStateItem) obj;
        return this.f75054b == advertCvStateItem.f75054b && L.f(this.f75055c, advertCvStateItem.f75055c) && L.f(this.f75056d, advertCvStateItem.f75056d) && this.f75057e == advertCvStateItem.f75057e && this.f75058f == advertCvStateItem.f75058f && this.f75059g == advertCvStateItem.f75059g && this.f75060h == advertCvStateItem.f75060h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f75054b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f75058f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f75055c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f75060h;
    }

    public final int hashCode() {
        return this.f75060h.hashCode() + com.avito.android.actions_sheet.a.h(this.f75059g, r.e(this.f75058f, r.i((this.f75056d.hashCode() + H.d(Long.hashCode(this.f75054b) * 31, 31, this.f75055c)) * 31, 31, this.f75057e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCvStateItem(id=");
        sb2.append(this.f75054b);
        sb2.append(", stringId=");
        sb2.append(this.f75055c);
        sb2.append(", cvState=");
        sb2.append(this.f75056d);
        sb2.append(", useStub=");
        sb2.append(this.f75057e);
        sb2.append(", spanCount=");
        sb2.append(this.f75058f);
        sb2.append(", displayType=");
        sb2.append(this.f75059g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75060h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75054b);
        parcel.writeString(this.f75055c);
        parcel.writeParcelable(this.f75056d, i12);
        parcel.writeInt(this.f75057e ? 1 : 0);
        parcel.writeInt(this.f75058f);
        parcel.writeString(this.f75059g.name());
        parcel.writeString(this.f75060h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertCvStateItem(long j12, String str, CvState cvState, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 65;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, cvState, z12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
