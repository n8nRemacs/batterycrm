package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23542f;
import androidx.work.NetworkType;
import androidx.work.impl.model.u0;
import androidx.work.impl.utils.C23605o;
import androidx.work.impl.utils.C23606p;
import androidx.work.impl.utils.C23608s;
import androidx.work.impl.utils.r;
import j.N;
import java.util.concurrent.TimeUnit;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableConstraints implements Parcelable {
    public static final Parcelable.Creator<ParcelableConstraints> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final C23542f f56175b;

    public class a implements Parcelable.Creator<ParcelableConstraints> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableConstraints createFromParcel(Parcel parcel) {
            return new ParcelableConstraints(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableConstraints[] newArray(int i12) {
            return new ParcelableConstraints[i12];
        }
    }

    public ParcelableConstraints(@N C23542f c23542f) {
        this.f56175b = c23542f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        C23542f c23542f = this.f56175b;
        parcel.writeInt(u0.h(c23542f.f55487a));
        parcel.writeInt(c23542f.f55491e ? 1 : 0);
        parcel.writeInt(c23542f.f55489c ? 1 : 0);
        parcel.writeInt(c23542f.f55492f ? 1 : 0);
        int i13 = Build.VERSION.SDK_INT;
        parcel.writeInt(c23542f.f55490d ? 1 : 0);
        boolean zB2 = c23542f.b();
        parcel.writeInt(zB2 ? 1 : 0);
        if (zB2) {
            parcel.writeByteArray(u0.j(c23542f.f55495i));
        }
        parcel.writeLong(c23542f.f55494h);
        parcel.writeLong(c23542f.f55493g);
        if (i13 >= 28) {
            NetworkRequest networkRequestA = c23542f.a();
            int i14 = networkRequestA != null ? 1 : 0;
            parcel.writeInt(i14);
            if (i14 != 0) {
                parcel.writeIntArray(C23608s.a(networkRequestA));
                parcel.writeIntArray(C23608s.b(networkRequestA));
            }
        }
    }

    public ParcelableConstraints(@N Parcel parcel) {
        C23542f.a aVar = new C23542f.a();
        aVar.b(u0.e(parcel.readInt()));
        aVar.f55500e = parcel.readInt() == 1;
        aVar.f55496a = parcel.readInt() == 1;
        aVar.f55501f = parcel.readInt() == 1;
        aVar.f55497b = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            for (C23542f.c cVar : u0.b(parcel.createByteArray())) {
                aVar.f55504i.add(new C23542f.c(cVar.f55506b, cVar.f55505a));
            }
        }
        long j12 = parcel.readLong();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f55503h = timeUnit.toMillis(j12);
        aVar.f55502g = timeUnit.toMillis(parcel.readLong());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28 && parcel.readInt() == 1) {
            NetworkRequest networkRequestA = C23605o.a(parcel.createIntArray(), parcel.createIntArray());
            NetworkType networkType = NetworkType.f55395b;
            if (i12 >= 28) {
                if (i12 >= 31) {
                    C23606p.f56024a.getClass();
                    if (networkRequestA.getNetworkSpecifier() != null) {
                        throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
                    }
                }
                aVar.f55498c = new r(networkRequestA);
                aVar.f55499d = networkType;
            } else {
                aVar.f55499d = networkType;
            }
        }
        this.f56175b = aVar.a();
    }
}
