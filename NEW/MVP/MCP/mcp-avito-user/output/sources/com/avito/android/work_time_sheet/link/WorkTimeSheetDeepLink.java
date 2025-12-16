package com.avito.android.work_time_sheet.link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: WorkTimeSheetDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_time_sheet/link/WorkTimeSheetDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_work-time-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class WorkTimeSheetDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<WorkTimeSheetDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WorkTimeSheetBody f331323b;

    /* compiled from: WorkTimeSheetDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WorkTimeSheetDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetDeepLink createFromParcel(Parcel parcel) {
            return new WorkTimeSheetDeepLink(WorkTimeSheetBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WorkTimeSheetDeepLink[] newArray(int i12) {
            return new WorkTimeSheetDeepLink[i12];
        }
    }

    public WorkTimeSheetDeepLink(@k WorkTimeSheetBody workTimeSheetBody) {
        this.f331323b = workTimeSheetBody;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WorkTimeSheetDeepLink) && L.f(this.f331323b, ((WorkTimeSheetDeepLink) obj).f331323b);
    }

    public final int hashCode() {
        return this.f331323b.hashCode();
    }

    @k
    public final String toString() {
        return "WorkTimeSheetDeepLink(body=" + this.f331323b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f331323b.writeToParcel(parcel, i12);
    }
}
