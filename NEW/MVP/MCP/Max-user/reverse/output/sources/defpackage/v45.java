package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v45 implements Parcelable {
    public static final Parcelable.Creator<v45> CREATOR = new wf4(8);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] o;

    public v45(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = str2;
        this.o = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v45)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        v45 v45Var = (v45) obj;
        return xxg.a(this.c, v45Var.c) && xxg.a(this.d, v45Var.d) && xxg.a(this.b, v45Var.b) && Arrays.equals(this.o, v45Var.o);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.o) + u45.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.o);
    }

    public v45(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        int i = xxg.a;
        this.d = string;
        this.o = parcel.createByteArray();
    }
}
