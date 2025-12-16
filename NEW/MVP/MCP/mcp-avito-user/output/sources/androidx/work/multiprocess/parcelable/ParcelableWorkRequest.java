package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.c0;
import androidx.work.impl.e0;
import androidx.work.impl.model.H;
import androidx.work.impl.model.u0;
import j.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableWorkRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final c0 f56197b;

    public class a implements Parcelable.Creator<ParcelableWorkRequest> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkRequest createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableWorkRequest[] newArray(int i12) {
            return new ParcelableWorkRequest[i12];
        }
    }

    public ParcelableWorkRequest(@N c0 c0Var) {
        this.f56197b = c0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        c0 c0Var = this.f56197b;
        parcel.writeString(c0Var.f55478a.toString());
        parcel.writeStringList(new ArrayList(c0Var.f55480c));
        H h12 = c0Var.f55479b;
        parcel.writeString(h12.f55797c);
        parcel.writeString(h12.f55798d);
        parcel.writeInt(u0.k(h12.f55796b));
        new ParcelableData(h12.f55799e).writeToParcel(parcel, i12);
        new ParcelableData(h12.f55800f).writeToParcel(parcel, i12);
        parcel.writeLong(h12.f55801g);
        parcel.writeLong(h12.f55802h);
        parcel.writeLong(h12.f55803i);
        parcel.writeInt(h12.f55805k);
        parcel.writeParcelable(new ParcelableConstraints(h12.f55804j), i12);
        parcel.writeInt(u0.a(h12.f55806l));
        parcel.writeLong(h12.f55807m);
        parcel.writeLong(h12.f55809o);
        parcel.writeLong(h12.f55810p);
        parcel.writeInt(h12.f55811q ? 1 : 0);
        parcel.writeInt(u0.i(h12.f55812r));
        parcel.writeString(h12.f55818x);
    }

    public ParcelableWorkRequest(@N Parcel parcel) {
        String string = parcel.readString();
        HashSet hashSet = new HashSet(parcel.createStringArrayList());
        H h12 = new H(string, parcel.readString());
        h12.f55798d = parcel.readString();
        h12.f55796b = u0.g(parcel.readInt());
        h12.f55799e = new ParcelableData(parcel).f56176b;
        h12.f55800f = new ParcelableData(parcel).f56176b;
        h12.f55801g = parcel.readLong();
        h12.f55802h = parcel.readLong();
        h12.f55803i = parcel.readLong();
        h12.f55805k = parcel.readInt();
        h12.f55804j = ((ParcelableConstraints) parcel.readParcelable(getClass().getClassLoader())).f56175b;
        h12.f55806l = u0.d(parcel.readInt());
        h12.f55807m = parcel.readLong();
        h12.f55809o = parcel.readLong();
        h12.f55810p = parcel.readLong();
        h12.f55811q = parcel.readInt() == 1;
        h12.f55812r = u0.f(parcel.readInt());
        h12.f55818x = parcel.readString();
        this.f56197b = new e0(UUID.fromString(string), h12, hashSet);
    }
}
