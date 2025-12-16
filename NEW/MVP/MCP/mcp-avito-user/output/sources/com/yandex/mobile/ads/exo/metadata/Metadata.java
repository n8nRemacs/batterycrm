package com.yandex.mobile.ads.exo.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.vw;
import j.P;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Entry[] f382939a;

    public interface Entry extends Parcelable {
        @P
        default vw a() {
            return null;
        }

        @P
        default byte[] b() {
            return null;
        }

        default void a(ad0.a aVar) {
        }
    }

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
        this.f382939a = entryArr;
    }

    public final Entry a(int i12) {
        return this.f382939a[i12];
    }

    public final int c() {
        return this.f382939a.length;
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
        return Arrays.equals(this.f382939a, ((Metadata) obj).f382939a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f382939a);
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("entries=");
        sbA.append(Arrays.toString(this.f382939a));
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f382939a.length);
        for (Entry entry : this.f382939a) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public final Metadata a(@P Metadata metadata) {
        return metadata == null ? this : a(metadata.f382939a);
    }

    public Metadata(List<? extends Entry> list) {
        this.f382939a = (Entry[]) list.toArray(new Entry[0]);
    }

    public final Metadata a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) pc1.a((Object[]) this.f382939a, (Object[]) entryArr));
    }

    public Metadata(Parcel parcel) {
        this.f382939a = new Entry[parcel.readInt()];
        int i12 = 0;
        while (true) {
            Entry[] entryArr = this.f382939a;
            if (i12 >= entryArr.length) {
                return;
            }
            entryArr[i12] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i12++;
        }
    }
}
