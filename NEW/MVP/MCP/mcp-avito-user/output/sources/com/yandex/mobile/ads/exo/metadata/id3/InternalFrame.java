package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;

/* loaded from: classes8.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f383003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f383004c;

    /* renamed from: d, reason: collision with root package name */
    public final String f383005d;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i12) {
            return new InternalFrame[i12];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f383003b = str;
        this.f383004c = str2;
        this.f383005d = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return pc1.a(this.f383004c, internalFrame.f383004c) && pc1.a(this.f383003b, internalFrame.f383003b) && pc1.a(this.f383005d, internalFrame.f383005d);
    }

    public final int hashCode() {
        String str = this.f383003b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f383004c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f383005d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": domain=" + this.f383003b + ", description=" + this.f383004c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383002a);
        parcel.writeString(this.f383003b);
        parcel.writeString(this.f383005d);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f383003b = (String) pc1.a(parcel.readString());
        this.f383004c = (String) pc1.a(parcel.readString());
        this.f383005d = (String) pc1.a(parcel.readString());
    }
}
