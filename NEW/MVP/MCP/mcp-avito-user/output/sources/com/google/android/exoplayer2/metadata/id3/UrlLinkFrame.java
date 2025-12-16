package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.util.U;
import j.P;

/* loaded from: classes6.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f345706c;

    /* renamed from: d, reason: collision with root package name */
    public final String f345707d;

    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i12) {
            return new UrlLinkFrame[i12];
        }
    }

    public UrlLinkFrame(String str, @P String str2, String str3) {
        super(str);
        this.f345706c = str2;
        this.f345707d = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f345693b.equals(urlLinkFrame.f345693b) && U.a(this.f345706c, urlLinkFrame.f345706c) && U.a(this.f345707d, urlLinkFrame.f345707d);
    }

    public final int hashCode() {
        int iD2 = H.d(527, 31, this.f345693b);
        String str = this.f345706c;
        int iHashCode = (iD2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f345707d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f345693b + ": url=" + this.f345707d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345693b);
        parcel.writeString(this.f345706c);
        parcel.writeString(this.f345707d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        super(string);
        this.f345706c = parcel.readString();
        this.f345707d = parcel.readString();
    }
}
