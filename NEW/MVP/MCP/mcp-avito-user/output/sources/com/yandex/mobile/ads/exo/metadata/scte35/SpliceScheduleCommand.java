package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f383051a;

    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i12) {
            return new SpliceScheduleCommand[i12];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f383052a;

        /* renamed from: b, reason: collision with root package name */
        public final long f383053b;

        public /* synthetic */ b(int i12, long j12, int i13) {
            this(i12, j12);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        private b(int i12, long j12) {
            this.f383052a = i12;
            this.f383053b = j12;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, int i12) {
        this(parcel);
    }

    public static SpliceScheduleCommand a(pr0 pr0Var) {
        int iT2 = pr0Var.t();
        ArrayList arrayList = new ArrayList(iT2);
        for (int i12 = 0; i12 < iT2; i12++) {
            arrayList.add(c.a(pr0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int size = this.f383051a.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = this.f383051a.get(i13);
            parcel.writeLong(cVar.f383054a);
            parcel.writeByte(cVar.f383055b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f383056c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f383057d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f383059f.size();
            parcel.writeInt(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                b bVar = cVar.f383059f.get(i14);
                parcel.writeInt(bVar.f383052a);
                parcel.writeLong(bVar.f383053b);
            }
            parcel.writeLong(cVar.f383058e);
            parcel.writeByte(cVar.f383060g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f383061h);
            parcel.writeInt(cVar.f383062i);
            parcel.writeInt(cVar.f383063j);
            parcel.writeInt(cVar.f383064k);
        }
    }

    private SpliceScheduleCommand(ArrayList arrayList) {
        this.f383051a = Collections.unmodifiableList(arrayList);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(c.a(parcel));
        }
        this.f383051a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f383054a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f383055b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f383056c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f383057d;

        /* renamed from: e, reason: collision with root package name */
        public final long f383058e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f383059f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f383060g;

        /* renamed from: h, reason: collision with root package name */
        public final long f383061h;

        /* renamed from: i, reason: collision with root package name */
        public final int f383062i;

        /* renamed from: j, reason: collision with root package name */
        public final int f383063j;

        /* renamed from: k, reason: collision with root package name */
        public final int f383064k;

        private c(long j12, boolean z12, boolean z13, boolean z14, ArrayList arrayList, long j13, boolean z15, long j14, int i12, int i13, int i14) {
            this.f383054a = j12;
            this.f383055b = z12;
            this.f383056c = z13;
            this.f383057d = z14;
            this.f383059f = Collections.unmodifiableList(arrayList);
            this.f383058e = j13;
            this.f383060g = z15;
            this.f383061h = j14;
            this.f383062i = i12;
            this.f383063j = i13;
            this.f383064k = i14;
        }

        public static c a(pr0 pr0Var) {
            ArrayList arrayList;
            boolean z12;
            boolean z13;
            int i12;
            int i13;
            int iT2;
            long j12;
            long j13;
            long jV2;
            long jV3 = pr0Var.v();
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = (pr0Var.t() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z16) {
                arrayList = arrayList2;
                z12 = false;
                z13 = false;
                i12 = 0;
                i13 = 0;
                iT2 = 0;
                j12 = -9223372036854775807L;
                j13 = -9223372036854775807L;
            } else {
                int iT3 = pr0Var.t();
                boolean z17 = (iT3 & 128) != 0;
                z13 = (iT3 & 64) != 0;
                boolean z18 = (iT3 & 32) != 0;
                long jV4 = z13 ? pr0Var.v() : -9223372036854775807L;
                if (!z13) {
                    int iT4 = pr0Var.t();
                    ArrayList arrayList3 = new ArrayList(iT4);
                    for (int i14 = 0; i14 < iT4; i14++) {
                        arrayList3.add(new b(pr0Var.t(), pr0Var.v(), z14 ? 1 : 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jT2 = pr0Var.t();
                    boolean z19 = (128 & jT2) != 0;
                    jV2 = ((((jT2 & 1) << 32) | pr0Var.v()) * 1000) / 90;
                    z15 = z19;
                } else {
                    jV2 = -9223372036854775807L;
                }
                int iZ2 = pr0Var.z();
                int iT5 = pr0Var.t();
                j13 = jV2;
                iT2 = pr0Var.t();
                arrayList = arrayList2;
                long j14 = jV4;
                i12 = iZ2;
                i13 = iT5;
                j12 = j14;
                boolean z22 = z17;
                z12 = z15;
                z14 = z22;
            }
            return new c(jV3, z16, z14, z13, arrayList, j12, z12, j13, i12, i13, iT2);
        }

        private c(Parcel parcel) {
            this.f383054a = parcel.readLong();
            this.f383055b = parcel.readByte() == 1;
            this.f383056c = parcel.readByte() == 1;
            this.f383057d = parcel.readByte() == 1;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(b.a(parcel));
            }
            this.f383059f = Collections.unmodifiableList(arrayList);
            this.f383058e = parcel.readLong();
            this.f383060g = parcel.readByte() == 1;
            this.f383061h = parcel.readLong();
            this.f383062i = parcel.readInt();
            this.f383063j = parcel.readInt();
            this.f383064k = parcel.readInt();
        }

        public static c a(Parcel parcel) {
            return new c(parcel);
        }
    }
}
