package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class skd extends l4 {
    public static final Parcelable.Creator<skd> CREATOR = new wcb(24);
    public final Bundle a;
    public us b;

    public skd(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.b(parcel, 2, this.a);
        a9j.l(parcel, iK);
    }
}
