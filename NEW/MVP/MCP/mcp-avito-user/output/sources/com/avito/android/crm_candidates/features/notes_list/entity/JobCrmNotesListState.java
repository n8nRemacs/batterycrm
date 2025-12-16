package com.avito.android.crm_candidates.features.notes_list.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.crm_candidates.view.list_items.notes_list.JobCrmNoteItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmNotesListState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JobCrmNotesListState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<JobCrmNotesListState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f129704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129705c;

    /* compiled from: JobCrmNotesListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmNotesListState> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmNotesListState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(JobCrmNoteItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new JobCrmNotesListState(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmNotesListState[] newArray(int i12) {
            return new JobCrmNotesListState[i12];
        }
    }

    public JobCrmNotesListState(@k List<JobCrmNoteItem> list, boolean z12) {
        this.f129704b = list;
        this.f129705c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCrmNotesListState)) {
            return false;
        }
        JobCrmNotesListState jobCrmNotesListState = (JobCrmNotesListState) obj;
        return L.f(this.f129704b, jobCrmNotesListState.f129704b) && this.f129705c == jobCrmNotesListState.f129705c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129705c) + (this.f129704b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCrmNotesListState(notes=");
        sb2.append(this.f129704b);
        sb2.append(", isAddButtonVisible=");
        return r.x(sb2, this.f129705c, ')');
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ?? r02 = this.f129704b;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            ((JobCrmNoteItem) it.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f129705c ? 1 : 0);
    }
}
