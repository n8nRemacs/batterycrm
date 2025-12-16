package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;

@J
/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f50692c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50693d;

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
        this.f50692c = str2;
        this.f50693d = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f50679b.equals(urlLinkFrame.f50679b) && M.a(this.f50692c, urlLinkFrame.f50692c) && M.a(this.f50693d, urlLinkFrame.f50693d);
    }

    public final int hashCode() {
        int iD2 = H.d(527, 31, this.f50679b);
        String str = this.f50692c;
        int iHashCode = (iD2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50693d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": url=" + this.f50693d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50679b);
        parcel.writeString(this.f50692c);
        parcel.writeString(this.f50693d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        super(string);
        this.f50692c = parcel.readString();
        this.f50693d = parcel.readString();
    }
}
