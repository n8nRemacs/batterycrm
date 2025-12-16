package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rf8 extends l4 {
    public static final Parcelable.Creator<rf8> CREATOR = new wci(6);
    public final List a;
    public final boolean b;
    public final boolean c;

    public rf8(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.j(parcel, Collections.unmodifiableList(this.a), 1);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        a9j.l(parcel, iK);
    }
}
