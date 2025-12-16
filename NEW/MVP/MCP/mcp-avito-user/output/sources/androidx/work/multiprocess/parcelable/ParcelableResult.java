package androidx.work.multiprocess.parcelable;

import AK.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.F;
import j.N;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator<ParcelableResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final F.a f56183b;

    public class a implements Parcelable.Creator<ParcelableResult> {
        @Override // android.os.Parcelable.Creator
        @N
        public final ParcelableResult createFromParcel(Parcel parcel) {
            return new ParcelableResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableResult[] newArray(int i12) {
            return new ParcelableResult[i12];
        }
    }

    public ParcelableResult(@N F.a aVar) {
        this.f56183b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int i13;
        F.a aVar = this.f56183b;
        if (aVar instanceof F.a.b) {
            i13 = 1;
        } else if (aVar instanceof F.a.c) {
            i13 = 2;
        } else {
            if (!(aVar instanceof F.a.C1949a)) {
                throw new IllegalStateException("Unknown Result " + aVar);
            }
            i13 = 3;
        }
        parcel.writeInt(i13);
        new ParcelableData(aVar.a()).writeToParcel(parcel, i12);
    }

    public ParcelableResult(@N Parcel parcel) {
        F.a c1949a;
        int i12 = parcel.readInt();
        ParcelableData parcelableData = new ParcelableData(parcel);
        if (i12 == 1) {
            c1949a = new F.a.b();
        } else {
            C23544h c23544h = parcelableData.f56176b;
            if (i12 == 2) {
                c1949a = new F.a.c(c23544h);
            } else if (i12 == 3) {
                c1949a = new F.a.C1949a(c23544h);
            } else {
                throw new IllegalStateException(c.g(i12, "Unknown result type "));
            }
        }
        this.f56183b = c1949a;
    }
}
