package androidx.view.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @N
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f21242b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Intent f21243c;

    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityResult createFromParcel(@N Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityResult[] newArray(int i12) {
            return new ActivityResult[i12];
        }
    }

    public ActivityResult(int i12, @P Intent intent) {
        this.f21242b = i12;
        this.f21243c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i12 = this.f21242b;
        sb2.append(i12 != -1 ? i12 != 0 ? String.valueOf(i12) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f21243c);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeInt(this.f21242b);
        Intent intent = this.f21243c;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i12);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f21242b = parcel.readInt();
        this.f21243c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
