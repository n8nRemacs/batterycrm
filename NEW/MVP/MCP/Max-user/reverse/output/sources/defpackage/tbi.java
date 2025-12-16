package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class tbi extends l4 implements mpd {
    public static final Parcelable.Creator<tbi> CREATOR = new obh(14);
    public final List a;
    public final String b;

    public tbi(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.mpd
    public final Status a() {
        return this.b != null ? Status.o : Status.s0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        List<String> list = this.a;
        if (list != null) {
            int iK2 = a9j.k(parcel, 1);
            parcel.writeStringList(list);
            a9j.l(parcel, iK2);
        }
        a9j.g(parcel, 2, this.b);
        a9j.l(parcel, iK);
    }
}
