package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;

/* loaded from: classes6.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f345695d;

    /* renamed from: e, reason: collision with root package name */
    public final String f345696e;

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
        this.f345694c = str;
        this.f345695d = str2;
        this.f345696e = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return U.a(this.f345695d, internalFrame.f345695d) && U.a(this.f345694c, internalFrame.f345694c) && U.a(this.f345696e, internalFrame.f345696e);
    }

    public final int hashCode() {
        String str = this.f345694c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f345695d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f345696e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f345693b + ": domain=" + this.f345694c + ", description=" + this.f345695d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345693b);
        parcel.writeString(this.f345694c);
        parcel.writeString(this.f345696e);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345694c = string;
        this.f345695d = parcel.readString();
        this.f345696e = parcel.readString();
    }
}
