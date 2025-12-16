package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public final class qt5 extends l4 {
    public static final Parcelable.Creator<qt5> CREATOR = new wci(20);
    public final String a;
    public final int b;
    public final long c;

    public qt5(long j, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qt5) {
            qt5 qt5Var = (qt5) obj;
            String str = this.a;
            if (((str != null && str.equals(qt5Var.a)) || (str == null && qt5Var.a == null)) && b() == qt5Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.a, SdkMetricStatEvent.NAME_KEY);
        h79Var.t(Long.valueOf(b()), "version");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 1, this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jB = b();
        a9j.m(parcel, 3, 8);
        parcel.writeLong(jB);
        a9j.l(parcel, iK);
    }

    public qt5(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
