package androidx.media3.extractor.metadata.scte35;

import AK.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@J
/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f50713b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50714c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50716e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f50717f;

    /* renamed from: g, reason: collision with root package name */
    public final long f50718g;

    /* renamed from: h, reason: collision with root package name */
    public final long f50719h;

    /* renamed from: i, reason: collision with root package name */
    public final List<b> f50720i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f50721j;

    /* renamed from: k, reason: collision with root package name */
    public final long f50722k;

    /* renamed from: l, reason: collision with root package name */
    public final int f50723l;

    /* renamed from: m, reason: collision with root package name */
    public final int f50724m;

    /* renamed from: n, reason: collision with root package name */
    public final int f50725n;

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
        public final int f50726a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50727b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50728c;

        public /* synthetic */ b(int i12, long j12, long j13, a aVar) {
            this(i12, j12, j13);
        }

        public b(int i12, long j12, long j13) {
            this.f50726a = i12;
            this.f50727b = j12;
            this.f50728c = j13;
        }
    }

    public SpliceInsertCommand(long j12, boolean z12, boolean z13, boolean z14, boolean z15, long j13, long j14, List<b> list, boolean z16, long j15, int i12, int i13, int i14) {
        this.f50713b = j12;
        this.f50714c = z12;
        this.f50715d = z13;
        this.f50716e = z14;
        this.f50717f = z15;
        this.f50718g = j13;
        this.f50719h = j14;
        this.f50720i = Collections.unmodifiableList(list);
        this.f50721j = z16;
        this.f50722k = j15;
        this.f50723l = i12;
        this.f50724m = i13;
        this.f50725n = i14;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f50718g);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return c.j(this.f50719h, " }", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f50713b);
        parcel.writeByte(this.f50714c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f50715d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f50716e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f50717f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f50718g);
        parcel.writeLong(this.f50719h);
        List<b> list = this.f50720i;
        int size = list.size();
        parcel.writeInt(size);
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = list.get(i13);
            parcel.writeInt(bVar.f50726a);
            parcel.writeLong(bVar.f50727b);
            parcel.writeLong(bVar.f50728c);
        }
        parcel.writeByte(this.f50721j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f50722k);
        parcel.writeInt(this.f50723l);
        parcel.writeInt(this.f50724m);
        parcel.writeInt(this.f50725n);
    }

    public SpliceInsertCommand(Parcel parcel, a aVar) {
        this.f50713b = parcel.readLong();
        this.f50714c = parcel.readByte() == 1;
        this.f50715d = parcel.readByte() == 1;
        this.f50716e = parcel.readByte() == 1;
        this.f50717f = parcel.readByte() == 1;
        this.f50718g = parcel.readLong();
        this.f50719h = parcel.readLong();
        int i12 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f50720i = Collections.unmodifiableList(arrayList);
        this.f50721j = parcel.readByte() == 1;
        this.f50722k = parcel.readLong();
        this.f50723l = parcel.readInt();
        this.f50724m = parcel.readInt();
        this.f50725n = parcel.readInt();
    }
}
