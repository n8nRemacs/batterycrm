package com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/JobCrmBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<JobCrmBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130049b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130051d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f130052e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f130053f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UniversalImage f130054g;

    /* compiled from: JobCrmBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmBannerItem createFromParcel(Parcel parcel) {
            return new JobCrmBannerItem((DeepLink) parcel.readParcelable(JobCrmBannerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(JobCrmBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmBannerItem[] newArray(int i12) {
            return new JobCrmBannerItem[i12];
        }
    }

    public JobCrmBannerItem(@k DeepLink deepLink, @k UniversalImage universalImage, @k String str, @k String str2, @k String str3, @k String str4) {
        this.f130049b = str;
        this.f130050c = str2;
        this.f130051d = str3;
        this.f130052e = str4;
        this.f130053f = deepLink;
        this.f130054g = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmBannerItem)) {
            return false;
        }
        JobCrmBannerItem jobCrmBannerItem = (JobCrmBannerItem) obj;
        return L.f(this.f130049b, jobCrmBannerItem.f130049b) && L.f(this.f130050c, jobCrmBannerItem.f130050c) && L.f(this.f130051d, jobCrmBannerItem.f130051d) && L.f(this.f130052e, jobCrmBannerItem.f130052e) && L.f(this.f130053f, jobCrmBannerItem.f130053f) && L.f(this.f130054g, jobCrmBannerItem.f130054g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84834c() {
        return this.f130049b;
    }

    public final int hashCode() {
        return this.f130054g.hashCode() + com.avito.android.actions_sheet.a.e(this.f130053f, H.d(H.d(H.d(this.f130049b.hashCode() * 31, 31, this.f130050c), 31, this.f130051d), 31, this.f130052e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmBannerItem(bannerId=");
        sb2.append(this.f130049b);
        sb2.append(", title=");
        sb2.append(this.f130050c);
        sb2.append(", subtitle=");
        sb2.append(this.f130051d);
        sb2.append(", actionTitle=");
        sb2.append(this.f130052e);
        sb2.append(", actionUrl=");
        sb2.append(this.f130053f);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f130054g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130049b);
        parcel.writeString(this.f130050c);
        parcel.writeString(this.f130051d);
        parcel.writeString(this.f130052e);
        parcel.writeParcelable(this.f130053f, i12);
        parcel.writeParcelable(this.f130054g, i12);
    }
}
