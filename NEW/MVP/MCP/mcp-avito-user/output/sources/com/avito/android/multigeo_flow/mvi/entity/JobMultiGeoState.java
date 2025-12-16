package com.avito.android.multigeo_flow.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobMultiGeoState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;", "Landroid/os/Parcelable;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class JobMultiGeoState implements Parcelable {

    @k
    public static final Parcelable.Creator<JobMultiGeoState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final JobMultiGeoLink.FlowType f207000c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AddressItem> f207001d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f207002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f207003f;

    /* compiled from: JobMultiGeoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobMultiGeoState> {
        @Override // android.os.Parcelable.Creator
        public final JobMultiGeoState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            JobMultiGeoLink.FlowType flowTypeValueOf = JobMultiGeoLink.FlowType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AddressItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new JobMultiGeoState(string, flowTypeValueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JobMultiGeoState[] newArray(int i12) {
            return new JobMultiGeoState[i12];
        }
    }

    public JobMultiGeoState(@k String str, @k JobMultiGeoLink.FlowType flowType, @k List<AddressItem> list, @l Integer num, boolean z12) {
        this.f206999b = str;
        this.f207000c = flowType;
        this.f207001d = list;
        this.f207002e = num;
        this.f207003f = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JobMultiGeoState a(JobMultiGeoState jobMultiGeoState, String str, ArrayList arrayList, Integer num, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = jobMultiGeoState.f206999b;
        }
        String str2 = str;
        JobMultiGeoLink.FlowType flowType = jobMultiGeoState.f207000c;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = jobMultiGeoState.f207001d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            num = jobMultiGeoState.f207002e;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            z12 = jobMultiGeoState.f207003f;
        }
        jobMultiGeoState.getClass();
        return new JobMultiGeoState(str2, flowType, list2, num2, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobMultiGeoState)) {
            return false;
        }
        JobMultiGeoState jobMultiGeoState = (JobMultiGeoState) obj;
        return L.f(this.f206999b, jobMultiGeoState.f206999b) && this.f207000c == jobMultiGeoState.f207000c && L.f(this.f207001d, jobMultiGeoState.f207001d) && L.f(this.f207002e, jobMultiGeoState.f207002e) && this.f207003f == jobMultiGeoState.f207003f;
    }

    public final int hashCode() {
        int iE2 = H.e((this.f207000c.hashCode() + (this.f206999b.hashCode() * 31)) * 31, 31, this.f207001d);
        Integer num = this.f207002e;
        return Boolean.hashCode(this.f207003f) + ((iE2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobMultiGeoState(jwt=");
        sb2.append(this.f206999b);
        sb2.append(", flowType=");
        sb2.append(this.f207000c);
        sb2.append(", list=");
        sb2.append(this.f207001d);
        sb2.append(", editedItemIndex=");
        sb2.append(this.f207002e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f207003f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f206999b);
        parcel.writeString(this.f207000c.name());
        Iterator itJ = C0.j(this.f207001d, parcel);
        while (itJ.hasNext()) {
            ((AddressItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Integer num = this.f207002e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f207003f ? 1 : 0);
    }
}
