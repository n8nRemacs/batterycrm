package com.avito.android.work_time_sheet.link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WorkTimeSheetDeepLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/work_time_sheet/link/WorkTimeSheetItem;", "Landroid/os/Parcelable;", "", SelectionType.TYPE_DAY, "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WorkTimeSheetItem implements Parcelable {

    @k
    public static final Parcelable.Creator<WorkTimeSheetItem> CREATOR = new a();

    @com.google.gson.annotations.c(SelectionType.TYPE_DAY)
    @k
    private final String day;

    @com.google.gson.annotations.c("status")
    @k
    private final String status;

    /* compiled from: WorkTimeSheetDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkTimeSheetItem> {
        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetItem createFromParcel(Parcel parcel) {
            return new WorkTimeSheetItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetItem[] newArray(int i12) {
            return new WorkTimeSheetItem[i12];
        }
    }

    public WorkTimeSheetItem(@k String str, @k String str2) {
        this.day = str;
        this.status = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkTimeSheetItem)) {
            return false;
        }
        WorkTimeSheetItem workTimeSheetItem = (WorkTimeSheetItem) obj;
        return L.f(this.day, workTimeSheetItem.day) && L.f(this.status, workTimeSheetItem.status);
    }

    public final int hashCode() {
        return this.status.hashCode() + (this.day.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkTimeSheetItem(day=");
        sb2.append(this.day);
        sb2.append(", status=");
        return C22026a.c(sb2, this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.day);
        parcel.writeString(this.status);
    }
}
