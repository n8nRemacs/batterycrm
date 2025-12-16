package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v9f extends l4 {
    public static final Parcelable.Creator<v9f> CREATOR = new k3j(6);
    public final xo0 a;

    public v9f(IBinder iBinder) {
        this.a = new xo0(tqa.W(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.e(parcel, 2, this.a.a.asBinder());
        a9j.l(parcel, iK);
    }
}
