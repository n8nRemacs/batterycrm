package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.model.u0;
import j.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkInfo implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final WorkInfo f56194b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f56193c = new String[0];
    public static final Parcelable.Creator<ParcelableWorkInfo> CREATOR = new a();

    public class a implements Parcelable.Creator<ParcelableWorkInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkInfo createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkInfo[] newArray(int i12) {
            return new ParcelableWorkInfo[i12];
        }
    }

    public ParcelableWorkInfo(@N WorkInfo workInfo) {
        this.f56194b = workInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        WorkInfo workInfo = this.f56194b;
        parcel.writeString(workInfo.f55407a.toString());
        parcel.writeInt(u0.k(workInfo.f55408b));
        new ParcelableData(workInfo.f55410d).writeToParcel(parcel, i12);
        parcel.writeStringArray((String[]) new ArrayList(workInfo.f55409c).toArray(f56193c));
        new ParcelableData(workInfo.f55411e).writeToParcel(parcel, i12);
        parcel.writeInt(workInfo.f55412f);
        parcel.writeInt(workInfo.f55413g);
    }

    public ParcelableWorkInfo(@N Parcel parcel) {
        UUID uuidFromString = UUID.fromString(parcel.readString());
        WorkInfo.State stateG = u0.g(parcel.readInt());
        ParcelableData parcelableData = new ParcelableData(parcel);
        HashSet hashSet = new HashSet(Arrays.asList(parcel.createStringArray()));
        ParcelableData parcelableData2 = new ParcelableData(parcel);
        this.f56194b = new WorkInfo(uuidFromString, stateG, hashSet, parcelableData.f56176b, parcelableData2.f56176b, parcel.readInt(), parcel.readInt(), null, 0L, null, 0L, 0, 3968, null);
    }
}
