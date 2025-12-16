package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r25 implements Parcelable {
    public static final Parcelable.Creator<r25> CREATOR = new wf4(2);
    public final String X;
    public final byte[] Y;
    public final p25 Z;
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] o;
    public final q25 s0;

    public r25(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, p25 p25Var, q25 q25Var) {
        int iL = zxg.L(uri, str2);
        if (iL == 0 || iL == 2 || iL == 1) {
            hsi.a("customCacheKey must be null for type: " + iL, str3 == null);
            this.Z = null;
            this.s0 = q25Var;
        } else {
            this.Z = p25Var;
            this.s0 = null;
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.o = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.X = str3;
        this.Y = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : zxg.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r25)) {
            return false;
        }
        r25 r25Var = (r25) obj;
        return this.a.equals(r25Var.a) && this.b.equals(r25Var.b) && Objects.equals(this.c, r25Var.c) && this.d.equals(r25Var.d) && Arrays.equals(this.o, r25Var.o) && Objects.equals(this.X, r25Var.X) && Arrays.equals(this.Y, r25Var.Y) && Objects.equals(this.Z, r25Var.Z) && Objects.equals(this.s0, r25Var.s0);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int iHashCode2 = (Arrays.hashCode(this.o) + ((this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.X;
        int iHashCode3 = (Arrays.hashCode(this.Y) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        p25 p25Var = this.Z;
        int iHashCode4 = (iHashCode3 + (p25Var != null ? p25Var.hashCode() : 0)) * 31;
        q25 q25Var = this.s0;
        return iHashCode4 + (q25Var != null ? q25Var.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.o);
        parcel.writeString(this.X);
        parcel.writeByteArray(this.Y);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeParcelable(this.s0, 0);
    }

    public r25(Parcel parcel) {
        String string = parcel.readString();
        String str = zxg.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((ilf) parcel.readParcelable(ilf.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.o = parcel.createByteArray();
        this.X = parcel.readString();
        this.Y = parcel.createByteArray();
        this.Z = (p25) parcel.readParcelable(p25.class.getClassLoader());
        this.s0 = (q25) parcel.readParcelable(q25.class.getClassLoader());
    }
}
