package com.avito.android.work_time_sheet.link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WorkTimeSheetDeepLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/work_time_sheet/link/WorkTimeSheetBody;", "Landroid/os/Parcelable;", "", "title", "action", "", "Lcom/avito/android/work_time_sheet/link/WorkTimeSheetItem;", "schedule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WorkTimeSheetBody implements Parcelable {

    @k
    public static final Parcelable.Creator<WorkTimeSheetBody> CREATOR = new a();

    @com.google.gson.annotations.c("action")
    @k
    private final String action;

    @com.google.gson.annotations.c("schedule")
    @k
    private final List<WorkTimeSheetItem> schedule;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* compiled from: WorkTimeSheetDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkTimeSheetBody> {
        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetBody createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(WorkTimeSheetItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new WorkTimeSheetBody(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetBody[] newArray(int i12) {
            return new WorkTimeSheetBody[i12];
        }
    }

    public WorkTimeSheetBody(@k String str, @k String str2, @k List<WorkTimeSheetItem> list) {
        this.title = str;
        this.action = str2;
        this.schedule = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @k
    public final List<WorkTimeSheetItem> d() {
        return this.schedule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkTimeSheetBody)) {
            return false;
        }
        WorkTimeSheetBody workTimeSheetBody = (WorkTimeSheetBody) obj;
        return L.f(this.title, workTimeSheetBody.title) && L.f(this.action, workTimeSheetBody.action) && L.f(this.schedule, workTimeSheetBody.schedule);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.schedule.hashCode() + H.d(this.title.hashCode() * 31, 31, this.action);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkTimeSheetBody(title=");
        sb2.append(this.title);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", schedule=");
        return H.p(sb2, this.schedule, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.action);
        Iterator itJ = C0.j(this.schedule, parcel);
        while (itJ.hasNext()) {
            ((WorkTimeSheetItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
