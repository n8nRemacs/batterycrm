package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCompanyCarouselItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/JobCompanyCarouselItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JobCompanyCarouselItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<JobCompanyCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154486c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f154487d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AdvertItem> f154488e;

    /* renamed from: f, reason: collision with root package name */
    public final int f154489f;

    /* compiled from: JobCompanyCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCompanyCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final JobCompanyCarouselItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(JobCompanyCarouselItem.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(JobCompanyCarouselItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new JobCompanyCarouselItem(string, gridElementType, string2, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCompanyCarouselItem[] newArray(int i12) {
            return new JobCompanyCarouselItem[i12];
        }
    }

    public JobCompanyCarouselItem(@k String str, @k GridElementType gridElementType, @l String str2, @l List<AdvertItem> list, int i12) {
        this.f154485b = str;
        this.f154486c = gridElementType;
        this.f154487d = str2;
        this.f154488e = list;
        this.f154489f = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCompanyCarouselItem)) {
            return false;
        }
        JobCompanyCarouselItem jobCompanyCarouselItem = (JobCompanyCarouselItem) obj;
        return L.f(this.f154485b, jobCompanyCarouselItem.f154485b) && L.f(this.f154486c, jobCompanyCarouselItem.f154486c) && L.f(this.f154487d, jobCompanyCarouselItem.f154487d) && L.f(this.f154488e, jobCompanyCarouselItem.f154488e) && this.f154489f == jobCompanyCarouselItem.f154489f;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154486c() {
        return this.f154486c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154485b() {
        return this.f154485b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154486c, this.f154485b.hashCode() * 31, 31);
        String str = this.f154487d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        List<AdvertItem> list = this.f154488e;
        return Integer.hashCode(this.f154489f) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCompanyCarouselItem(stringId=");
        sb2.append(this.f154485b);
        sb2.append(", gridType=");
        sb2.append(this.f154486c);
        sb2.append(", title=");
        sb2.append(this.f154487d);
        sb2.append(", items=");
        sb2.append(this.f154488e);
        sb2.append(", scrollPosition=");
        return r.t(sb2, this.f154489f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154485b);
        parcel.writeParcelable(this.f154486c, i12);
        parcel.writeString(this.f154487d);
        List<AdvertItem> list = this.f154488e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f154489f);
    }

    public /* synthetic */ JobCompanyCarouselItem(String str, GridElementType gridElementType, String str2, List list, int i12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, list, (i13 & 16) != 0 ? 0 : i12);
    }
}
