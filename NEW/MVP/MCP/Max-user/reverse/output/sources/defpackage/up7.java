package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class up7 implements Parcelable {
    public static final Parcelable.Creator<up7> CREATOR = new wf4(28);
    public final String a;
    public final String b;
    public final tp7 c;
    public final String d;
    public final zkg o;

    public up7(String str, String str2, tp7 tp7Var, String str3, zkg zkgVar) {
        this.a = str;
        this.b = str2;
        this.c = tp7Var;
        this.d = str3;
        this.o = zkgVar;
    }

    public static up7 a(up7 up7Var, String str, String str2, tp7 tp7Var, int i) {
        if ((i & 1) != 0) {
            str = up7Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = up7Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            tp7Var = up7Var.c;
        }
        String str5 = up7Var.d;
        zkg zkgVar = up7Var.o;
        up7Var.getClass();
        return new up7(str3, str4, tp7Var, str5, zkgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up7)) {
            return false;
        }
        up7 up7Var = (up7) obj;
        return fni.a(this.a, up7Var.a) && fni.a(this.b, up7Var.b) && fni.a(this.c, up7Var.c) && fni.a(this.d, up7Var.d) && fni.a(this.o, up7Var.o);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        tp7 tp7Var = this.c;
        int iHashCode3 = (iHashCode2 + (tp7Var == null ? 0 : tp7Var.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        zkg zkgVar = this.o;
        return iHashCode4 + (zkgVar != null ? zkgVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("InternalTwoFANavData(password=", this.a, ", hint=", this.b, ", emailData=");
        sbL.append(this.c);
        sbL.append(", phoneForLogin=");
        sbL.append(this.d);
        sbL.append(", twoFAConfig=");
        sbL.append(this.o);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        tp7 tp7Var = this.c;
        if (tp7Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tp7Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        zkg zkgVar = this.o;
        if (zkgVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zkgVar.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ up7(String str, String str2, tp7 tp7Var, String str3, zkg zkgVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : tp7Var, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : zkgVar);
    }
}
