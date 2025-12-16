package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import j.N;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableRemoteWorkRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableRemoteWorkRequest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f56181b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableWorkerParameters f56182c;

    public class a implements Parcelable.Creator<ParcelableRemoteWorkRequest> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableRemoteWorkRequest createFromParcel(Parcel parcel) {
            return new ParcelableRemoteWorkRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableRemoteWorkRequest[] newArray(int i12) {
            return new ParcelableRemoteWorkRequest[i12];
        }
    }

    public ParcelableRemoteWorkRequest(@N String str, @N WorkerParameters workerParameters) {
        this.f56181b = str;
        this.f56182c = new ParcelableWorkerParameters(workerParameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f56181b);
        this.f56182c.writeToParcel(parcel, i12);
    }

    public ParcelableRemoteWorkRequest(@N Parcel parcel) {
        this.f56181b = parcel.readString();
        this.f56182c = new ParcelableWorkerParameters(parcel);
    }
}
