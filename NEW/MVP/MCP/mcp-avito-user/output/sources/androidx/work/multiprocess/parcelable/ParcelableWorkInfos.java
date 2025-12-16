package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import j.N;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkInfos> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<WorkInfo> f56195b;

    public class a implements Parcelable.Creator<ParcelableWorkInfos> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkInfos createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfos(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkInfos[] newArray(int i12) {
            return new ParcelableWorkInfos[i12];
        }
    }

    public ParcelableWorkInfos(@N List<WorkInfo> list) {
        this.f56195b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        List<WorkInfo> list = this.f56195b;
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            parcelableWorkInfoArr[i13] = new ParcelableWorkInfo(list.get(i13));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i12);
    }

    public ParcelableWorkInfos(@N Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.f56195b = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f56195b.add(((ParcelableWorkInfo) parcelable).f56194b);
        }
    }
}
