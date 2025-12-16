package com.avito.android.crm_candidates.view.list_items.applications_list.application_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmApplicationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/Note;", "Landroid/os/Parcelable;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Note implements Parcelable {

    @k
    public static final Parcelable.Creator<Note> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f130022b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f130023c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130024d;

    /* renamed from: e, reason: collision with root package name */
    public final long f130025e;

    /* compiled from: JobCrmApplicationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Note> {
        @Override // android.os.Parcelable.Creator
        public final Note createFromParcel(Parcel parcel) {
            return new Note(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Note[] newArray(int i12) {
            return new Note[i12];
        }
    }

    public Note(long j12, @k String str, @k String str2, long j13) {
        this.f130022b = j12;
        this.f130023c = str;
        this.f130024d = str2;
        this.f130025e = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return this.f130022b == note.f130022b && L.f(this.f130023c, note.f130023c) && L.f(this.f130024d, note.f130024d) && this.f130025e == note.f130025e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f130025e) + H.d(H.d(Long.hashCode(this.f130022b) * 31, 31, this.f130023c), 31, this.f130024d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Note(managerId=");
        sb2.append(this.f130022b);
        sb2.append(", managerName=");
        sb2.append(this.f130023c);
        sb2.append(", text=");
        sb2.append(this.f130024d);
        sb2.append(", updatedAt=");
        return r.u(sb2, this.f130025e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f130022b);
        parcel.writeString(this.f130023c);
        parcel.writeString(this.f130024d);
        parcel.writeLong(this.f130025e);
    }
}
