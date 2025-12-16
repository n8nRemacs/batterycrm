package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.B;
import java.util.Arrays;
import java.util.List;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Entry[] f47361b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47362c;

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i12) {
            return new Metadata[i12];
        }
    }

    public Metadata() {
        throw null;
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public final Metadata a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i12 = androidx.media3.common.util.M.f47887a;
        Entry[] entryArr2 = this.f47361b;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f47362c, (Entry[]) objArrCopyOf);
    }

    public final Entry b(int i12) {
        return this.f47361b[i12];
    }

    public final int c() {
        return this.f47361b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f47361b, metadata.f47361b) && this.f47362c == metadata.f47362c;
    }

    public final int hashCode() {
        return com.google.common.primitives.n.b(this.f47362c) + (Arrays.hashCode(this.f47361b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f47361b));
        long j12 = this.f47362c;
        if (j12 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j12;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        Entry[] entryArr = this.f47361b;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f47362c);
    }

    public Metadata(long j12, Entry... entryArr) {
        this.f47362c = j12;
        this.f47361b = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.f47361b = new Entry[parcel.readInt()];
        int i12 = 0;
        while (true) {
            Entry[] entryArr = this.f47361b;
            if (i12 < entryArr.length) {
                entryArr[i12] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i12++;
            } else {
                this.f47362c = parcel.readLong();
                return;
            }
        }
    }

    public interface Entry extends Parcelable {
        @j.P
        default byte[] Z() {
            return null;
        }

        @j.P
        default C23108t i0() {
            return null;
        }

        default void J5(B.b bVar) {
        }
    }
}
