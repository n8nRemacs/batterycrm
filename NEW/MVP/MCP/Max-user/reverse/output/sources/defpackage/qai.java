package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class qai extends l4 implements mpd {
    public static final Parcelable.Creator<qai> CREATOR = new obh(9);
    public final int a;
    public final int b;
    public final Intent c;

    public qai(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.mpd
    public final Status a() {
        return this.b == 0 ? Status.o : Status.s0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        a9j.f(parcel, 3, this.c, i);
        a9j.l(parcel, iK);
    }
}
