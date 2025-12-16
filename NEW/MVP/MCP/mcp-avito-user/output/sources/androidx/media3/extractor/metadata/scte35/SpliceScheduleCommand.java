package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@J
/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f50729b;

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
        public final int f50730a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50731b;

        public /* synthetic */ b(int i12, long j12, a aVar) {
            this(i12, j12);
        }

        public b(int i12, long j12) {
            this.f50730a = i12;
            this.f50731b = j12;
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f50729b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        List<c> list = this.f50729b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = list.get(i13);
            parcel.writeLong(cVar.f50732a);
            parcel.writeByte(cVar.f50733b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f50734c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f50735d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f50737f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                b bVar = list2.get(i14);
                parcel.writeInt(bVar.f50730a);
                parcel.writeLong(bVar.f50731b);
            }
            parcel.writeLong(cVar.f50736e);
            parcel.writeByte(cVar.f50738g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f50739h);
            parcel.writeInt(cVar.f50740i);
            parcel.writeInt(cVar.f50741j);
            parcel.writeInt(cVar.f50742k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel, a aVar) {
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new c(parcel));
        }
        this.f50729b = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f50732a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50733b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f50734c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f50735d;

        /* renamed from: e, reason: collision with root package name */
        public final long f50736e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f50737f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f50738g;

        /* renamed from: h, reason: collision with root package name */
        public final long f50739h;

        /* renamed from: i, reason: collision with root package name */
        public final int f50740i;

        /* renamed from: j, reason: collision with root package name */
        public final int f50741j;

        /* renamed from: k, reason: collision with root package name */
        public final int f50742k;

        public c(long j12, boolean z12, boolean z13, boolean z14, ArrayList arrayList, long j13, boolean z15, long j14, int i12, int i13, int i14) {
            this.f50732a = j12;
            this.f50733b = z12;
            this.f50734c = z13;
            this.f50735d = z14;
            this.f50737f = Collections.unmodifiableList(arrayList);
            this.f50736e = j13;
            this.f50738g = z15;
            this.f50739h = j14;
            this.f50740i = i12;
            this.f50741j = i13;
            this.f50742k = i14;
        }

        public c(Parcel parcel) {
            this.f50732a = parcel.readLong();
            this.f50733b = parcel.readByte() == 1;
            this.f50734c = parcel.readByte() == 1;
            this.f50735d = parcel.readByte() == 1;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f50737f = Collections.unmodifiableList(arrayList);
            this.f50736e = parcel.readLong();
            this.f50738g = parcel.readByte() == 1;
            this.f50739h = parcel.readLong();
            this.f50740i = parcel.readInt();
            this.f50741j = parcel.readInt();
            this.f50742k = parcel.readInt();
        }
    }
}
