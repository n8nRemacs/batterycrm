package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.o91;
import com.yandex.mobile.ads.impl.pr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f383035a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f383036b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f383037c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f383038d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f383039e;

    /* renamed from: f, reason: collision with root package name */
    public final long f383040f;

    /* renamed from: g, reason: collision with root package name */
    public final long f383041g;

    /* renamed from: h, reason: collision with root package name */
    public final List<b> f383042h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f383043i;

    /* renamed from: j, reason: collision with root package name */
    public final long f383044j;

    /* renamed from: k, reason: collision with root package name */
    public final int f383045k;

    /* renamed from: l, reason: collision with root package name */
    public final int f383046l;

    /* renamed from: m, reason: collision with root package name */
    public final int f383047m;

    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i12) {
            return new SpliceInsertCommand[i12];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f383048a;

        /* renamed from: b, reason: collision with root package name */
        public final long f383049b;

        /* renamed from: c, reason: collision with root package name */
        public final long f383050c;

        public /* synthetic */ b(int i12, long j12, long j13, int i13) {
            this(i12, j12, j13);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i12, long j12, long j13) {
            this.f383048a = i12;
            this.f383049b = j12;
            this.f383050c = j13;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, int i12) {
        this(parcel);
    }

    public static SpliceInsertCommand a(pr0 pr0Var, long j12, o91 o91Var) {
        List list;
        int iZ2;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        long j14;
        boolean z15;
        int iT2;
        int iT3;
        boolean z16;
        long jV2;
        pr0 pr0Var2 = pr0Var;
        long jV3 = pr0Var.v();
        boolean z17 = (pr0Var.t() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z17) {
            list = listEmptyList;
            iZ2 = 0;
            z12 = false;
            z13 = false;
            j13 = -9223372036854775807L;
            z14 = false;
            j14 = -9223372036854775807L;
            z15 = false;
            iT2 = 0;
            iT3 = 0;
        } else {
            int iT4 = pr0Var.t();
            boolean z18 = (iT4 & 128) != 0;
            boolean z19 = (iT4 & 64) != 0;
            boolean z22 = (iT4 & 32) != 0;
            boolean z23 = (iT4 & 16) != 0;
            long jA2 = (!z19 || z23) ? -9223372036854775807L : TimeSignalCommand.a(j12, pr0Var2);
            if (!z19) {
                int iT5 = pr0Var.t();
                ArrayList arrayList = new ArrayList(iT5);
                int i12 = 0;
                while (i12 < iT5) {
                    int iT6 = pr0Var.t();
                    long jA3 = !z23 ? TimeSignalCommand.a(j12, pr0Var2) : -9223372036854775807L;
                    arrayList.add(new b(iT6, jA3, o91Var.b(jA3), 0));
                    i12++;
                    pr0Var2 = pr0Var;
                }
                listEmptyList = arrayList;
            }
            if (z22) {
                long jT2 = pr0Var.t();
                boolean z24 = (128 & jT2) != 0;
                jV2 = ((((jT2 & 1) << 32) | pr0Var.v()) * 1000) / 90;
                z16 = z24;
            } else {
                z16 = false;
                jV2 = -9223372036854775807L;
            }
            iZ2 = pr0Var.z();
            iT2 = pr0Var.t();
            iT3 = pr0Var.t();
            list = listEmptyList;
            z15 = z19;
            long j15 = jA2;
            z14 = z16;
            j14 = jV2;
            z13 = z23;
            z12 = z18;
            j13 = j15;
        }
        return new SpliceInsertCommand(jV3, z17, z12, z15, z13, j13, o91Var.b(j13), list, z14, j14, iZ2, iT2, iT3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f383035a);
        parcel.writeByte(this.f383036b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f383037c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f383038d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f383039e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f383040f);
        parcel.writeLong(this.f383041g);
        int size = this.f383042h.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = this.f383042h.get(i13);
            parcel.writeInt(bVar.f383048a);
            parcel.writeLong(bVar.f383049b);
            parcel.writeLong(bVar.f383050c);
        }
        parcel.writeByte(this.f383043i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f383044j);
        parcel.writeInt(this.f383045k);
        parcel.writeInt(this.f383046l);
        parcel.writeInt(this.f383047m);
    }

    private SpliceInsertCommand(long j12, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, List<b> list, boolean z16, long j15, int i12, int i13, int i14) {
        this.f383035a = j12;
        this.f383036b = z12;
        this.f383037c = z13;
        this.f383038d = z14;
        this.f383039e = z15;
        this.f383040f = j13;
        this.f383041g = j14;
        this.f383042h = Collections.unmodifiableList(list);
        this.f383043i = z16;
        this.f383044j = j15;
        this.f383045k = i12;
        this.f383046l = i13;
        this.f383047m = i14;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f383035a = parcel.readLong();
        this.f383036b = parcel.readByte() == 1;
        this.f383037c = parcel.readByte() == 1;
        this.f383038d = parcel.readByte() == 1;
        this.f383039e = parcel.readByte() == 1;
        this.f383040f = parcel.readLong();
        this.f383041g = parcel.readLong();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(b.a(parcel));
        }
        this.f383042h = Collections.unmodifiableList(arrayList);
        this.f383043i = parcel.readByte() == 1;
        this.f383044j = parcel.readLong();
        this.f383045k = parcel.readInt();
        this.f383046l = parcel.readInt();
        this.f383047m = parcel.readInt();
    }
}
