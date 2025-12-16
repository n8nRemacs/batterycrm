package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class f68 implements w68, u68 {
    public static final Parcelable.Creator<f68> CREATOR = new f18(8);
    public final Uri a;
    public final String b;

    public f68(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.w68, defpackage.u68
    public final String n() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new oi4(this.a), i);
        parcel.writeString(this.b);
    }
}
