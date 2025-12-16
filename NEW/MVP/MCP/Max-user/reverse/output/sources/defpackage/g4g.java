package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g4g extends mc7 {
    public static final Parcelable.Creator<g4g> CREATOR = new z6e(23);
    public final String b;
    public final String c;

    public g4g(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g4g.class == obj.getClass()) {
            g4g g4gVar = (g4g) obj;
            if (xxg.a(this.a, g4gVar.a) && xxg.a(this.b, g4gVar.b) && xxg.a(this.c, g4gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = u45.e(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // defpackage.qy9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.t19 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4g.p(t19):void");
    }

    @Override // defpackage.mc7
    public final String toString() {
        String str = this.a;
        int iF = u45.f(22, str);
        String str2 = this.b;
        int iF2 = u45.f(iF, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF2, str3));
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g4g(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
