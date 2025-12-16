package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;

/* loaded from: classes8.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f383015b;

    /* renamed from: c, reason: collision with root package name */
    public final String f383016c;

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
        this.f383015b = str2;
        this.f383016c = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f383002a.equals(urlLinkFrame.f383002a) && pc1.a(this.f383015b, urlLinkFrame.f383015b) && pc1.a(this.f383016c, urlLinkFrame.f383016c);
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f383002a, 527, 31);
        String str = this.f383015b;
        int iHashCode = (iA2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f383016c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": url=" + this.f383016c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383002a);
        parcel.writeString(this.f383015b);
        parcel.writeString(this.f383016c);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) pc1.a(parcel.readString()));
        this.f383015b = parcel.readString();
        this.f383016c = (String) pc1.a(parcel.readString());
    }
}
