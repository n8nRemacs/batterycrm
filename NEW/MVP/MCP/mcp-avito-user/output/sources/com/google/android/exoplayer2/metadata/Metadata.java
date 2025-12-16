package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.P;
import j.P;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Entry[] f345623b;

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

    public Metadata(Entry... entryArr) {
        this.f345623b = entryArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f345623b, ((Metadata) obj).f345623b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f345623b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f345623b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        Entry[] entryArr = this.f345623b;
        parcel.writeInt(entryArr.length);
        for (Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f345623b = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f345623b = new Entry[parcel.readInt()];
        int i12 = 0;
        while (true) {
            Entry[] entryArr = this.f345623b;
            if (i12 >= entryArr.length) {
                return;
            }
            entryArr[i12] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i12++;
        }
    }

    public interface Entry extends Parcelable {
        @P
        default byte[] Z() {
            return null;
        }

        @P
        default I i0() {
            return null;
        }

        default void f4(P.b bVar) {
        }
    }
}
