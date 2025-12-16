package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.c0;
import j.N;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequests> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f56198b;

    public class a implements Parcelable.Creator<ParcelableWorkRequests> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkRequests createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequests(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkRequests[] newArray(int i12) {
            return new ParcelableWorkRequests[i12];
        }
    }

    public ParcelableWorkRequests() {
        this.f56198b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        ArrayList arrayList = this.f56198b;
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[arrayList.size()];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            parcelableWorkRequestArr[i13] = new ParcelableWorkRequest((c0) arrayList.get(i13));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i12);
    }

    public ParcelableWorkRequests(@N Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.f56198b = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f56198b.add(((ParcelableWorkRequest) parcelable).f56197b);
        }
    }
}
