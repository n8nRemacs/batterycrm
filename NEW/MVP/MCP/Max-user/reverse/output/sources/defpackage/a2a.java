package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a2a extends l4 {
    public static final Parcelable.Creator<a2a> CREATOR = new obh(8);
    public final PendingIntent a;

    public a2a(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 1, this.a, i);
        a9j.l(parcel, iK);
    }
}
