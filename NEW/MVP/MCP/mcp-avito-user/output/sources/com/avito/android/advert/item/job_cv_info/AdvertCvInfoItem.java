package com.avito.android.advert.item.job_cv_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.cv.JobCvInfo;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCvInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/job_cv_info/AdvertCvInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCvInfoItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertCvInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f77199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77200c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final JobCvInfo f77201d;

    /* compiled from: AdvertCvInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCvInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCvInfoItem createFromParcel(Parcel parcel) {
            return new AdvertCvInfoItem(parcel.readInt(), parcel.readString(), (JobCvInfo) parcel.readParcelable(AdvertCvInfoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCvInfoItem[] newArray(int i12) {
            return new AdvertCvInfoItem[i12];
        }
    }

    public AdvertCvInfoItem(int i12, @k String str, @k JobCvInfo jobCvInfo) {
        this.f77199b = i12;
        this.f77200c = str;
        this.f77201d = jobCvInfo;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertCvInfoItem(i12, this.f77200c, this.f77201d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCvInfoItem)) {
            return false;
        }
        AdvertCvInfoItem advertCvInfoItem = (AdvertCvInfoItem) obj;
        return this.f77199b == advertCvInfoItem.f77199b && L.f(this.f77200c, advertCvInfoItem.f77200c) && L.f(this.f77201d, advertCvInfoItem.f77201d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77354b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75748b() {
        return this.f77199b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75749c() {
        return this.f77200c;
    }

    public final int hashCode() {
        return this.f77201d.hashCode() + H.d(Integer.hashCode(this.f77199b) * 31, 31, this.f77200c);
    }

    @k
    public final String toString() {
        return "AdvertCvInfoItem(spanCount=" + this.f77199b + ", stringId=" + this.f77200c + ", cvInfo=" + this.f77201d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f77199b);
        parcel.writeString(this.f77200c);
        parcel.writeParcelable(this.f77201d, i12);
    }

    public /* synthetic */ AdvertCvInfoItem(int i12, String str, JobCvInfo jobCvInfo, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? "AdvertCvInfoItem" : str, jobCvInfo);
    }
}
