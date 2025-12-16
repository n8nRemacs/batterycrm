package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class sf8 extends l4 implements mpd {
    public static final Parcelable.Creator<sf8> CREATOR = new wci(8);
    public final Status a;
    public final tf8 b;

    public sf8(Status status, tf8 tf8Var) {
        this.a = status;
        this.b = tf8Var;
    }

    @Override // defpackage.mpd
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 1, this.a, i);
        a9j.f(parcel, 2, this.b, i);
        a9j.l(parcel, iK);
    }
}
