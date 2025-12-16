package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class fjh implements qy9 {
    public static final Parcelable.Creator<fjh> CREATOR = new obh(3);
    public final String a;
    public final String b;

    public fjh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fjh fjhVar = (fjh) obj;
            if (this.a.equals(fjhVar.a) && this.b.equals(fjhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + u45.e(527, 31, this.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qy9
    public final void p(t19 t19Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                t19Var.c = str2;
                break;
            case 1:
                t19Var.a = str2;
                break;
            case 2:
                t19Var.g = str2;
                break;
            case 3:
                t19Var.d = str2;
                break;
            case 4:
                t19Var.b = str2;
                break;
        }
    }

    public final String toString() {
        String str = this.a;
        int iF = u45.f(5, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public fjh(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        this.a = string;
        this.b = parcel.readString();
    }
}
