package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e8f extends z7f {
    public static final Parcelable.Creator<e8f> CREATOR = new z6e(14);
    public final long X;
    public final long Y;
    public final List Z;
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean o;
    public final boolean s0;
    public final long t0;
    public final int u0;
    public final int v0;
    public final int w0;

    public e8f(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.o = z4;
        this.X = j2;
        this.Y = j3;
        this.Z = Collections.unmodifiableList(list);
        this.s0 = z5;
        this.t0 = j4;
        this.u0 = i;
        this.v0 = i2;
        this.w0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        List list = this.Z;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            d8f d8fVar = (d8f) list.get(i2);
            parcel.writeInt(d8fVar.a);
            parcel.writeLong(d8fVar.b);
            parcel.writeLong(d8fVar.c);
        }
        parcel.writeByte(this.s0 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.t0);
        parcel.writeInt(this.u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.w0);
    }

    public e8f(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.o = parcel.readByte() == 1;
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new d8f(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.Z = Collections.unmodifiableList(arrayList);
        this.s0 = parcel.readByte() == 1;
        this.t0 = parcel.readLong();
        this.u0 = parcel.readInt();
        this.v0 = parcel.readInt();
        this.w0 = parcel.readInt();
    }
}
