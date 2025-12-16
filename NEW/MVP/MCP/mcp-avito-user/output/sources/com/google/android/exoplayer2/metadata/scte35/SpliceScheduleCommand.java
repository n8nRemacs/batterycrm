package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f345747b;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i12) {
            return new SpliceScheduleCommand[i12];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f345748a;

        /* renamed from: b, reason: collision with root package name */
        public final long f345749b;

        public /* synthetic */ b(int i12, long j12, a aVar) {
            this(i12, j12);
        }

        public b(int i12, long j12) {
            this.f345748a = i12;
            this.f345749b = j12;
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f345747b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        List<c> list = this.f345747b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = list.get(i13);
            parcel.writeLong(cVar.f345750a);
            parcel.writeByte(cVar.f345751b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f345752c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f345753d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f345755f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                b bVar = list2.get(i14);
                parcel.writeInt(bVar.f345748a);
                parcel.writeLong(bVar.f345749b);
            }
            parcel.writeLong(cVar.f345754e);
            parcel.writeByte(cVar.f345756g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f345757h);
            parcel.writeInt(cVar.f345758i);
            parcel.writeInt(cVar.f345759j);
            parcel.writeInt(cVar.f345760k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel, a aVar) {
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new c(parcel));
        }
        this.f345747b = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f345750a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f345751b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f345752c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f345753d;

        /* renamed from: e, reason: collision with root package name */
        public final long f345754e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f345755f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f345756g;

        /* renamed from: h, reason: collision with root package name */
        public final long f345757h;

        /* renamed from: i, reason: collision with root package name */
        public final int f345758i;

        /* renamed from: j, reason: collision with root package name */
        public final int f345759j;

        /* renamed from: k, reason: collision with root package name */
        public final int f345760k;

        public c(long j12, boolean z12, boolean z13, boolean z14, ArrayList arrayList, long j13, boolean z15, long j14, int i12, int i13, int i14) {
            this.f345750a = j12;
            this.f345751b = z12;
            this.f345752c = z13;
            this.f345753d = z14;
            this.f345755f = Collections.unmodifiableList(arrayList);
            this.f345754e = j13;
            this.f345756g = z15;
            this.f345757h = j14;
            this.f345758i = i12;
            this.f345759j = i13;
            this.f345760k = i14;
        }

        public c(Parcel parcel) {
            this.f345750a = parcel.readLong();
            this.f345751b = parcel.readByte() == 1;
            this.f345752c = parcel.readByte() == 1;
            this.f345753d = parcel.readByte() == 1;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f345755f = Collections.unmodifiableList(arrayList);
            this.f345754e = parcel.readLong();
            this.f345756g = parcel.readByte() == 1;
            this.f345757h = parcel.readLong();
            this.f345758i = parcel.readInt();
            this.f345759j = parcel.readInt();
            this.f345760k = parcel.readInt();
        }
    }
}
