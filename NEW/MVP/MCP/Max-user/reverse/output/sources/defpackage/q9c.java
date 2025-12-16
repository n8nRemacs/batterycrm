package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q9c extends mc7 {
    public static final Parcelable.Creator<q9c> CREATOR = new wcb(14);
    public final String b;
    public final byte[] c;

    public q9c(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q9c.class == obj.getClass()) {
            q9c q9cVar = (q9c) obj;
            if (xxg.a(this.b, q9cVar.b) && Arrays.equals(this.c, q9cVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.mc7
    public final String toString() {
        String str = this.a;
        int iF = u45.f(8, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public q9c(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = xxg.a;
        this.b = string;
        this.c = parcel.createByteArray();
    }
}
