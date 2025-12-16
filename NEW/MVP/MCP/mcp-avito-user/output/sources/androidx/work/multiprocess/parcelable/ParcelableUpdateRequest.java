package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import j.N;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator<ParcelableUpdateRequest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f56185b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableData f56186c;

    public class a implements Parcelable.Creator<ParcelableUpdateRequest> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableUpdateRequest createFromParcel(@N Parcel parcel) {
            return new ParcelableUpdateRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableUpdateRequest[] newArray(int i12) {
            return new ParcelableUpdateRequest[i12];
        }
    }

    public ParcelableUpdateRequest(@N UUID uuid, @N C23544h c23544h) {
        this.f56185b = uuid.toString();
        this.f56186c = new ParcelableData(c23544h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f56185b);
        this.f56186c.writeToParcel(parcel, i12);
    }

    public ParcelableUpdateRequest(@N Parcel parcel) {
        this.f56185b = parcel.readString();
        this.f56186c = new ParcelableData(parcel);
    }
}
