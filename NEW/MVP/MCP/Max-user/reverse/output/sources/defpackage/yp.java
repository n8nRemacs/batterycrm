package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yp implements qy9 {
    public static final Parcelable.Creator<yp> CREATOR = new e8(4);
    public final int a;
    public final String b;

    public yp(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.b;
        StringBuilder sb = new StringBuilder(u45.f(33, str));
        sb.append("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }
}
