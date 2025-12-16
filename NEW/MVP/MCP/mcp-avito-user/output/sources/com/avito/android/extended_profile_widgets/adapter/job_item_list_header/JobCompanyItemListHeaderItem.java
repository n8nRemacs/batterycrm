package com.avito.android.extended_profile_widgets.adapter.job_item_list_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCompanyItemListHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/JobCompanyItemListHeaderItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JobCompanyItemListHeaderItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<JobCompanyItemListHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154527b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154528c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154529d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f154530e;

    /* compiled from: JobCompanyItemListHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCompanyItemListHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCompanyItemListHeaderItem createFromParcel(Parcel parcel) {
            return new JobCompanyItemListHeaderItem(parcel.readString(), (GridElementType) parcel.readParcelable(JobCompanyItemListHeaderItem.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(JobCompanyItemListHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final JobCompanyItemListHeaderItem[] newArray(int i12) {
            return new JobCompanyItemListHeaderItem[i12];
        }
    }

    public JobCompanyItemListHeaderItem(@k String str, @k GridElementType gridElementType, @k String str2, @k DeepLink deepLink) {
        this.f154527b = str;
        this.f154528c = gridElementType;
        this.f154529d = str2;
        this.f154530e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCompanyItemListHeaderItem)) {
            return false;
        }
        JobCompanyItemListHeaderItem jobCompanyItemListHeaderItem = (JobCompanyItemListHeaderItem) obj;
        return L.f(this.f154527b, jobCompanyItemListHeaderItem.f154527b) && L.f(this.f154528c, jobCompanyItemListHeaderItem.f154528c) && L.f(this.f154529d, jobCompanyItemListHeaderItem.f154529d) && L.f(this.f154530e, jobCompanyItemListHeaderItem.f154530e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154763c() {
        return this.f154528c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138390b() {
        return this.f154527b;
    }

    public final int hashCode() {
        return this.f154530e.hashCode() + H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154528c, this.f154527b.hashCode() * 31, 31), 31, this.f154529d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCompanyItemListHeaderItem(stringId=");
        sb2.append(this.f154527b);
        sb2.append(", gridType=");
        sb2.append(this.f154528c);
        sb2.append(", title=");
        sb2.append(this.f154529d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f154530e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154527b);
        parcel.writeParcelable(this.f154528c, i12);
        parcel.writeString(this.f154529d);
        parcel.writeParcelable(this.f154530e, i12);
    }

    public /* synthetic */ JobCompanyItemListHeaderItem(String str, GridElementType gridElementType, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, deepLink);
    }
}
