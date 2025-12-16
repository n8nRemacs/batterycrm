package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f382998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f382999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f383000d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f383001e;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i12) {
            return new GeobFrame[i12];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f382998b = str;
        this.f382999c = str2;
        this.f383000d = str3;
        this.f383001e = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return pc1.a(this.f382998b, geobFrame.f382998b) && pc1.a(this.f382999c, geobFrame.f382999c) && pc1.a(this.f383000d, geobFrame.f383000d) && Arrays.equals(this.f383001e, geobFrame.f383001e);
    }

    public final int hashCode() {
        String str = this.f382998b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f382999c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f383000d;
        return Arrays.hashCode(this.f383001e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": mimeType=" + this.f382998b + ", filename=" + this.f382999c + ", description=" + this.f383000d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382998b);
        parcel.writeString(this.f382999c);
        parcel.writeString(this.f383000d);
        parcel.writeByteArray(this.f383001e);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f382998b = (String) pc1.a(parcel.readString());
        this.f382999c = (String) pc1.a(parcel.readString());
        this.f383000d = (String) pc1.a(parcel.readString());
        this.f383001e = (byte[]) pc1.a(parcel.createByteArray());
    }
}
