package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class pd8 extends d3 implements Parcelable {
    public static final Parcelable.Creator<pd8> CREATOR = new f18(26);
    public final long X;
    public final String Y;
    public final long Z;
    public final long b;
    public final String c;
    public final String d;
    public final int o;
    public Uri s0;

    public pd8(int i, long j, String str, String str2, int i2, long j2, String str3, long j3, Uri uri) {
        super(i);
        this.b = j;
        this.c = str;
        this.d = str2;
        this.o = i2;
        this.X = j2;
        this.Y = str3;
        this.Z = j3;
        this.s0 = uri;
    }

    @Override // defpackage.d3
    public String a() {
        Uri uri = this.s0;
        return uri != null ? uri.toString() : this.c;
    }

    public Uri c() {
        Uri uri = this.s0;
        if (uri != null) {
            return uri;
        }
        try {
            Uri uri2 = Uri.parse(this.c);
            this.s0 = uri2;
            return uri2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean d() {
        if (this.a == 1) {
            String str = this.Y;
            if (str != null ? dnf.r(str, "image/gif", true) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        String str = this.c;
        byte b = str != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b);
        if (b != 0) {
            parcel.writeString(str);
        }
        String str2 = this.d;
        byte b2 = str2 != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        parcel.writeString(this.Y);
        parcel.writeLong(this.Z);
        Uri uri = this.s0;
        byte b3 = uri != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b3);
        if (b3 != 0) {
            parcel.writeParcelable(uri, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pd8(Parcel parcel) {
        int i = parcel.readInt();
        long j = parcel.readLong();
        String string = parcel.readByte() == 1 ? parcel.readString() : null;
        String string2 = parcel.readByte() == 1 ? parcel.readString() : null;
        this(i, j, string, string2, parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), (Uri) (parcel.readByte() == 1 ? parcel.readParcelable(Uri.class.getClassLoader()) : null));
    }
}
