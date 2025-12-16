package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w45 implements Parcelable {
    public static final Parcelable.Creator<w45> CREATOR = new wf4(9);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] o;

    public w45(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = xz9.n(str2);
        this.o = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = cy0.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w45)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        w45 w45Var = (w45) obj;
        return Objects.equals(this.c, w45Var.c) && Objects.equals(this.d, w45Var.d) && Objects.equals(this.b, w45Var.b) && Arrays.equals(this.o, w45Var.o);
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

    public w45(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        String str = zxg.a;
        this.d = string;
        this.o = parcel.createByteArray();
    }
}
