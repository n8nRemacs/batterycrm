package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final h f54951b;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i12) {
            return new ParcelImpl[i12];
        }
    }

    public ParcelImpl(h hVar) {
        this.f54951b = hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new f(parcel).y(this.f54951b);
    }

    public ParcelImpl(Parcel parcel) {
        this.f54951b = new f(parcel).o();
    }
}
