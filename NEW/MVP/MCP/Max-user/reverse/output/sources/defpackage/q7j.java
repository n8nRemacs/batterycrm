package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q7j extends l4 {
    public static final Parcelable.Creator<q7j> CREATOR = new wci(2);
    public String a;
    public String b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 2, this.a);
        a9j.g(parcel, 3, this.b);
        a9j.l(parcel, iK);
    }
}
