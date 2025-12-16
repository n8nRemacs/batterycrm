package com.avito.android.work_profile;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import kotlin.Metadata;

/* compiled from: WorkProfileOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/WorkProfileOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkProfileOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<WorkProfileOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WorkProfileTab f330598b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f330599c;

    /* compiled from: WorkProfileOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkProfileOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final WorkProfileOpenParams createFromParcel(Parcel parcel) {
            return new WorkProfileOpenParams(WorkProfileTab.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkProfileOpenParams[] newArray(int i12) {
            return new WorkProfileOpenParams[i12];
        }
    }

    public WorkProfileOpenParams(@k WorkProfileTab workProfileTab, @l String str) {
        this.f330598b = workProfileTab;
        this.f330599c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f330598b.name());
        parcel.writeString(this.f330599c);
    }
}
