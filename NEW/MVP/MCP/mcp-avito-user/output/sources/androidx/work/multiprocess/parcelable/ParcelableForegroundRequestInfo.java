package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.C23638w;
import j.N;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo
/* loaded from: classes10.dex */
public class ParcelableForegroundRequestInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableForegroundRequestInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f56177b;

    /* renamed from: c, reason: collision with root package name */
    public final C23638w f56178c;

    public class a implements Parcelable.Creator<ParcelableForegroundRequestInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableForegroundRequestInfo createFromParcel(Parcel parcel) {
            return new ParcelableForegroundRequestInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableForegroundRequestInfo[] newArray(int i12) {
            return new ParcelableForegroundRequestInfo[i12];
        }
    }

    public ParcelableForegroundRequestInfo(@N String str, @N C23638w c23638w) {
        this.f56177b = str;
        this.f56178c = c23638w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f56177b);
        C23638w c23638w = this.f56178c;
        parcel.writeInt(c23638w.f56213a);
        parcel.writeInt(c23638w.f56214b);
        parcel.writeParcelable(c23638w.f56215c, i12);
    }

    public ParcelableForegroundRequestInfo(@N Parcel parcel) {
        this.f56177b = parcel.readString();
        this.f56178c = new C23638w(parcel.readInt(), parcel.readInt(), (Notification) parcel.readParcelable(getClass().getClassLoader()));
    }
}
