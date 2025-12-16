package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f345731b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f345732c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f345733d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f345734e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f345735f;

    /* renamed from: g, reason: collision with root package name */
    public final long f345736g;

    /* renamed from: h, reason: collision with root package name */
    public final long f345737h;

    /* renamed from: i, reason: collision with root package name */
    public final List<b> f345738i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f345739j;

    /* renamed from: k, reason: collision with root package name */
    public final long f345740k;

    /* renamed from: l, reason: collision with root package name */
    public final int f345741l;

    /* renamed from: m, reason: collision with root package name */
    public final int f345742m;

    /* renamed from: n, reason: collision with root package name */
    public final int f345743n;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i12) {
            return new SpliceInsertCommand[i12];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f345744a;

        /* renamed from: b, reason: collision with root package name */
        public final long f345745b;

        /* renamed from: c, reason: collision with root package name */
        public final long f345746c;

        public /* synthetic */ b(int i12, long j12, long j13, a aVar) {
            this(i12, j12, j13);
        }

        public b(int i12, long j12, long j13) {
            this.f345744a = i12;
            this.f345745b = j12;
            this.f345746c = j13;
        }
    }

    public SpliceInsertCommand(long j12, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, List<b> list, boolean z16, long j15, int i12, int i13, int i14) {
        this.f345731b = j12;
        this.f345732c = z12;
        this.f345733d = z13;
        this.f345734e = z14;
        this.f345735f = z15;
        this.f345736g = j13;
        this.f345737h = j14;
        this.f345738i = Collections.unmodifiableList(list);
        this.f345739j = z16;
        this.f345740k = j15;
        this.f345741l = i12;
        this.f345742m = i13;
        this.f345743n = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f345731b);
        parcel.writeByte(this.f345732c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f345733d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f345734e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f345735f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f345736g);
        parcel.writeLong(this.f345737h);
        List<b> list = this.f345738i;
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = list.get(i13);
            parcel.writeInt(bVar.f345744a);
            parcel.writeLong(bVar.f345745b);
            parcel.writeLong(bVar.f345746c);
        }
        parcel.writeByte(this.f345739j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f345740k);
        parcel.writeInt(this.f345741l);
        parcel.writeInt(this.f345742m);
        parcel.writeInt(this.f345743n);
    }

    public SpliceInsertCommand(Parcel parcel, a aVar) {
        this.f345731b = parcel.readLong();
        this.f345732c = parcel.readByte() == 1;
        this.f345733d = parcel.readByte() == 1;
        this.f345734e = parcel.readByte() == 1;
        this.f345735f = parcel.readByte() == 1;
        this.f345736g = parcel.readLong();
        this.f345737h = parcel.readLong();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f345738i = Collections.unmodifiableList(arrayList);
        this.f345739j = parcel.readByte() == 1;
        this.f345740k = parcel.readLong();
        this.f345741l = parcel.readInt();
        this.f345742m = parcel.readInt();
        this.f345743n = parcel.readInt();
    }
}
