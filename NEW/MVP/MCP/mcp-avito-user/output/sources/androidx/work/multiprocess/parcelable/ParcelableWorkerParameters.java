package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.WorkerParameters;
import j.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkerParameters implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkerParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @N
    public final UUID f56199b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final C23544h f56200c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final HashSet f56201d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final WorkerParameters.a f56202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56203f;

    /* renamed from: g, reason: collision with root package name */
    public final int f56204g;

    public class a implements Parcelable.Creator<ParcelableWorkerParameters> {
        @Override // android.os.Parcelable.Creator
        @N
        public final ParcelableWorkerParameters createFromParcel(Parcel parcel) {
            return new ParcelableWorkerParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkerParameters[] newArray(int i12) {
            return new ParcelableWorkerParameters[i12];
        }
    }

    public ParcelableWorkerParameters(@N WorkerParameters workerParameters) {
        this.f56199b = workerParameters.f55432a;
        this.f56200c = workerParameters.f55433b;
        this.f56201d = workerParameters.f55434c;
        this.f56202e = workerParameters.f55435d;
        this.f56203f = workerParameters.f55436e;
        this.f56204g = workerParameters.f55443l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f56199b.toString());
        new ParcelableData(this.f56200c).writeToParcel(parcel, i12);
        parcel.writeStringList(new ArrayList(this.f56201d));
        ParcelableRuntimeExtras parcelableRuntimeExtras = new ParcelableRuntimeExtras();
        parcelableRuntimeExtras.f56184b = this.f56202e;
        parcelableRuntimeExtras.writeToParcel(parcel, i12);
        parcel.writeInt(this.f56203f);
        parcel.writeInt(this.f56204g);
    }

    public ParcelableWorkerParameters(@N Parcel parcel) {
        this.f56199b = UUID.fromString(parcel.readString());
        this.f56200c = new ParcelableData(parcel).f56176b;
        this.f56201d = new HashSet(parcel.createStringArrayList());
        this.f56202e = new ParcelableRuntimeExtras(parcel).f56184b;
        this.f56203f = parcel.readInt();
        this.f56204g = parcel.readInt();
    }
}
