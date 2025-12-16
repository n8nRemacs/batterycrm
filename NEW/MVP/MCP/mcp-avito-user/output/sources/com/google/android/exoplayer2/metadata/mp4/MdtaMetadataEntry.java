package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f345713b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f345714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345716e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i12) {
            return new MdtaMetadataEntry[i12];
        }
    }

    public MdtaMetadataEntry(int i12, int i13, String str, byte[] bArr) {
        this.f345713b = str;
        this.f345714c = bArr;
        this.f345715d = i12;
        this.f345716e = i13;
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
        return this.f345713b.equals(mdtaMetadataEntry.f345713b) && Arrays.equals(this.f345714c, mdtaMetadataEntry.f345714c) && this.f345715d == mdtaMetadataEntry.f345715d && this.f345716e == mdtaMetadataEntry.f345716e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f345714c) + H.d(527, 31, this.f345713b)) * 31) + this.f345715d) * 31) + this.f345716e;
    }

    public final String toString() {
        return "mdta: key=" + this.f345713b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345713b);
        parcel.writeByteArray(this.f345714c);
        parcel.writeInt(this.f345715d);
        parcel.writeInt(this.f345716e);
    }

    public MdtaMetadataEntry(Parcel parcel, a aVar) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345713b = string;
        this.f345714c = parcel.createByteArray();
        this.f345715d = parcel.readInt();
        this.f345716e = parcel.readInt();
    }
}
