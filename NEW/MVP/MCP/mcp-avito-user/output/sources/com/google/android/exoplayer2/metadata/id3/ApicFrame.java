package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345670c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f345671d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345672e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f345673f;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i12) {
            return new ApicFrame[i12];
        }
    }

    public ApicFrame(String str, @P String str2, int i12, byte[] bArr) {
        super("APIC");
        this.f345670c = str;
        this.f345671d = str2;
        this.f345672e = i12;
        this.f345673f = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f345672e == apicFrame.f345672e && U.a(this.f345670c, apicFrame.f345670c) && U.a(this.f345671d, apicFrame.f345671d) && Arrays.equals(this.f345673f, apicFrame.f345673f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void f4(P.b bVar) {
        bVar.a(this.f345672e, this.f345673f);
    }

    public final int hashCode() {
        int i12 = (527 + this.f345672e) * 31;
        String str = this.f345670c;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f345671d;
        return Arrays.hashCode(this.f345673f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f345693b + ": mimeType=" + this.f345670c + ", description=" + this.f345671d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345670c);
        parcel.writeString(this.f345671d);
        parcel.writeInt(this.f345672e);
        parcel.writeByteArray(this.f345673f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345670c = string;
        this.f345671d = parcel.readString();
        this.f345672e = parcel.readInt();
        this.f345673f = parcel.createByteArray();
    }
}
