package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f383017a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f383018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f383019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f383020d;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i12) {
            return new MdtaMetadataEntry[i12];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, int i12) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f383017a.equals(mdtaMetadataEntry.f383017a) && Arrays.equals(this.f383018b, mdtaMetadataEntry.f383018b) && this.f383019c == mdtaMetadataEntry.f383019c && this.f383020d == mdtaMetadataEntry.f383020d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f383018b) + v2.a(this.f383017a, 527, 31)) * 31) + this.f383019c) * 31) + this.f383020d;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("mdta: key=");
        sbA.append(this.f383017a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383017a);
        parcel.writeByteArray(this.f383018b);
        parcel.writeInt(this.f383019c);
        parcel.writeInt(this.f383020d);
    }

    public MdtaMetadataEntry(int i12, int i13, String str, byte[] bArr) {
        this.f383017a = str;
        this.f383018b = bArr;
        this.f383019c = i12;
        this.f383020d = i13;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f383017a = (String) pc1.a(parcel.readString());
        this.f383018b = (byte[]) pc1.a(parcel.createByteArray());
        this.f383019c = parcel.readInt();
        this.f383020d = parcel.readInt();
    }
}
