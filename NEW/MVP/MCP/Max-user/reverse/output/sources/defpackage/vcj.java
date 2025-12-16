package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vcj extends l4 {
    public static final Parcelable.Creator<vcj> CREATOR = new k3j(20);
    public final String a;
    public final String b;

    public vcj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 1, this.a);
        a9j.g(parcel, 2, this.b);
        a9j.l(parcel, iK);
    }
}
