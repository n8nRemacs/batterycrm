package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class j3g extends l4 {
    public static final Parcelable.Creator<j3g> CREATOR = new obh(7);
    public final int a;
    public List b;

    public j3g(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.j(parcel, this.b, 2);
        a9j.l(parcel, iK);
    }
}
