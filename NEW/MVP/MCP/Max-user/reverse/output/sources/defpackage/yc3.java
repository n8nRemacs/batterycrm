package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class yc3 extends l4 {
    public static final Parcelable.Creator<yc3> CREATOR = new obh(21);
    public final Intent a;

    public yc3(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 1, this.a, i);
        a9j.l(parcel, iK);
    }
}
