package com.avito.android.multigeo_flow.full_list.view;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobMultiGeoParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoParams;", "Lcom/avito/android/util/OpenParams;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class JobMultiGeoParams implements OpenParams {

    @k
    public static final Parcelable.Creator<JobMultiGeoParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206941b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AddressItem> f206942c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f206943d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f206944e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f206945f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final JobMultiGeoLink.FlowType f206946g;

    /* compiled from: JobMultiGeoParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobMultiGeoParams> {
        @Override // android.os.Parcelable.Creator
        public final JobMultiGeoParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AddressItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new JobMultiGeoParams(string, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), JobMultiGeoLink.FlowType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final JobMultiGeoParams[] newArray(int i12) {
            return new JobMultiGeoParams[i12];
        }
    }

    public JobMultiGeoParams(@k String str, @k List<AddressItem> list, @k String str2, @k String str3, @l Integer num, @k JobMultiGeoLink.FlowType flowType) {
        this.f206941b = str;
        this.f206942c = list;
        this.f206943d = str2;
        this.f206944e = str3;
        this.f206945f = num;
        this.f206946g = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobMultiGeoParams)) {
            return false;
        }
        JobMultiGeoParams jobMultiGeoParams = (JobMultiGeoParams) obj;
        return L.f(this.f206941b, jobMultiGeoParams.f206941b) && L.f(this.f206942c, jobMultiGeoParams.f206942c) && L.f(this.f206943d, jobMultiGeoParams.f206943d) && L.f(this.f206944e, jobMultiGeoParams.f206944e) && L.f(this.f206945f, jobMultiGeoParams.f206945f) && this.f206946g == jobMultiGeoParams.f206946g;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.e(this.f206941b.hashCode() * 31, 31, this.f206942c), 31, this.f206943d), 31, this.f206944e);
        Integer num = this.f206945f;
        return this.f206946g.hashCode() + ((iD2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "JobMultiGeoParams(jwt=" + this.f206941b + ", list=" + this.f206942c + ", title=" + this.f206943d + ", buttonTitle=" + this.f206944e + ", maxListLimit=" + this.f206945f + ", flowType=" + this.f206946g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f206941b);
        Iterator itJ = C0.j(this.f206942c, parcel);
        while (itJ.hasNext()) {
            ((AddressItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f206943d);
        parcel.writeString(this.f206944e);
        Integer num = this.f206945f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f206946g.name());
    }

    public /* synthetic */ JobMultiGeoParams(String str, List list, String str2, String str3, Integer num, JobMultiGeoLink.FlowType flowType, int i12, C42822w c42822w) {
        this(str, list, str2, str3, (i12 & 16) != 0 ? null : num, flowType);
    }
}
