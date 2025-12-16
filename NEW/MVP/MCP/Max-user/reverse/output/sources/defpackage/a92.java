package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a92 extends l4 {
    public static final Parcelable.Creator<a92> CREATOR = new e8(12);
    public final pd8 a;
    public final Uri b;

    public a92(pd8 pd8Var, Uri uri) {
        this.a = pd8Var;
        this.b = uri;
    }

    @Override // defpackage.l4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
