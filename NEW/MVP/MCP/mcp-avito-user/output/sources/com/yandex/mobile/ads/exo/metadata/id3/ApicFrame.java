package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f382979b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f382980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382981d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f382982e;

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
        this.f382979b = str;
        this.f382980c = str2;
        this.f382981d = i12;
        this.f382982e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    public final void a(ad0.a aVar) {
        aVar.a(this.f382981d, this.f382982e);
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f382981d == apicFrame.f382981d && pc1.a(this.f382979b, apicFrame.f382979b) && pc1.a(this.f382980c, apicFrame.f382980c) && Arrays.equals(this.f382982e, apicFrame.f382982e);
    }

    public final int hashCode() {
        int i12 = (this.f382981d + 527) * 31;
        String str = this.f382979b;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f382980c;
        return Arrays.hashCode(this.f382982e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": mimeType=" + this.f382979b + ", description=" + this.f382980c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382979b);
        parcel.writeString(this.f382980c);
        parcel.writeInt(this.f382981d);
        parcel.writeByteArray(this.f382982e);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f382979b = (String) pc1.a(parcel.readString());
        this.f382980c = parcel.readString();
        this.f382981d = parcel.readInt();
        this.f382982e = (byte[]) pc1.a(parcel.createByteArray());
    }
}
