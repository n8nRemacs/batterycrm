package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c92 extends l4 {
    public static final Parcelable.Creator<c92> CREATOR = new e8(14);
    public final pd8 a;
    public final String b;

    public c92(pd8 pd8Var, String str) {
        this.a = pd8Var;
        this.b = str;
    }

    @Override // defpackage.l4, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
