package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.metadata.Metadata;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f345664b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f345665c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f345666d;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i12) {
            return new IcyInfo[i12];
        }
    }

    public IcyInfo(byte[] bArr, @P String str, @P String str2) {
        this.f345664b = bArr;
        this.f345665c = str;
        this.f345666d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f345664b, ((IcyInfo) obj).f345664b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void f4(P.b bVar) {
        String str = this.f345665c;
        if (str != null) {
            bVar.f343640a = str;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f345664b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f345665c + "\", url=\"" + this.f345666d + "\", rawMetadata.length=\"" + this.f345664b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByteArray(this.f345664b);
        parcel.writeString(this.f345665c);
        parcel.writeString(this.f345666d);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f345664b = bArrCreateByteArray;
        this.f345665c = parcel.readString();
        this.f345666d = parcel.readString();
    }
}
