package com.avito.android.crm_candidates.features.applications_list.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationsListState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "ListState", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmApplicationsListState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<JobCrmApplicationsListState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListState f129497b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129499d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f129500e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f129501f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JobCrmApplicationsListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState$ListState;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListState {

        /* renamed from: b, reason: collision with root package name */
        public static final ListState f129502b;

        /* renamed from: c, reason: collision with root package name */
        public static final ListState f129503c;

        /* renamed from: d, reason: collision with root package name */
        public static final ListState f129504d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ListState[] f129505e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f129506f;

        static {
            ListState listState = new ListState("SHOWN", 0);
            f129502b = listState;
            ListState listState2 = new ListState("EMPTY", 1);
            f129503c = listState2;
            ListState listState3 = new ListState("HIDDEN", 2);
            f129504d = listState3;
            ListState[] listStateArr = {listState, listState2, listState3};
            f129505e = listStateArr;
            f129506f = c.a(listStateArr);
        }

        public ListState() {
            throw null;
        }

        public static ListState valueOf(String str) {
            return (ListState) Enum.valueOf(ListState.class, str);
        }

        public static ListState[] values() {
            return (ListState[]) f129505e.clone();
        }
    }

    /* compiled from: JobCrmApplicationsListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmApplicationsListState> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmApplicationsListState createFromParcel(Parcel parcel) {
            ListState listStateValueOf = ListState.valueOf(parcel.readString());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(JobCrmApplicationsListState.class, parcel, arrayList, iL2, 1);
            }
            return new JobCrmApplicationsListState(listStateValueOf, z12, z13, z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmApplicationsListState[] newArray(int i12) {
            return new JobCrmApplicationsListState[i12];
        }
    }

    public JobCrmApplicationsListState() {
        this(null, false, false, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JobCrmApplicationsListState a(JobCrmApplicationsListState jobCrmApplicationsListState, boolean z12, ArrayList arrayList, int i12) {
        ListState listState = jobCrmApplicationsListState.f129497b;
        boolean z13 = jobCrmApplicationsListState.f129498c;
        if ((i12 & 4) != 0) {
            z12 = jobCrmApplicationsListState.f129499d;
        }
        boolean z14 = z12;
        boolean z15 = jobCrmApplicationsListState.f129500e;
        List list = arrayList;
        if ((i12 & 16) != 0) {
            list = jobCrmApplicationsListState.f129501f;
        }
        jobCrmApplicationsListState.getClass();
        return new JobCrmApplicationsListState(listState, z13, z14, z15, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmApplicationsListState)) {
            return false;
        }
        JobCrmApplicationsListState jobCrmApplicationsListState = (JobCrmApplicationsListState) obj;
        return this.f129497b == jobCrmApplicationsListState.f129497b && this.f129498c == jobCrmApplicationsListState.f129498c && this.f129499d == jobCrmApplicationsListState.f129499d && this.f129500e == jobCrmApplicationsListState.f129500e && L.f(this.f129501f, jobCrmApplicationsListState.f129501f);
    }

    public final int hashCode() {
        return this.f129501f.hashCode() + r.i(r.i(r.i(this.f129497b.hashCode() * 31, 31, this.f129498c), 31, this.f129499d), 31, this.f129500e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmApplicationsListState(listState=");
        sb2.append(this.f129497b);
        sb2.append(", isReload=");
        sb2.append(this.f129498c);
        sb2.append(", isRefresh=");
        sb2.append(this.f129499d);
        sb2.append(", isError=");
        sb2.append(this.f129500e);
        sb2.append(", candidates=");
        return H.p(sb2, this.f129501f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129497b.name());
        parcel.writeInt(this.f129498c ? 1 : 0);
        parcel.writeInt(this.f129499d ? 1 : 0);
        parcel.writeInt(this.f129500e ? 1 : 0);
        Iterator itJ = C0.j(this.f129501f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public JobCrmApplicationsListState(ListState listState, boolean z12, boolean z13, boolean z14, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ListState.f129504d : listState, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) == 0 ? z14 : false, (i12 & 16) != 0 ? C42784z0.f406748b : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JobCrmApplicationsListState(@k ListState listState, boolean z12, boolean z13, boolean z14, @k List<? extends ParcelableItem> list) {
        this.f129497b = listState;
        this.f129498c = z12;
        this.f129499d = z13;
        this.f129500e = z14;
        this.f129501f = list;
    }
}
