package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;

@J
/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50672c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50673d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50674e;

    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i12) {
            return new CommentFrame[i12];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f50672c = str;
        this.f50673d = str2;
        this.f50674e = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return M.a(this.f50673d, commentFrame.f50673d) && M.a(this.f50672c, commentFrame.f50672c) && M.a(this.f50674e, commentFrame.f50674e);
    }

    public final int hashCode() {
        String str = this.f50672c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50673d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50674e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": language=" + this.f50672c + ", description=" + this.f50673d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50679b);
        parcel.writeString(this.f50672c);
        parcel.writeString(this.f50674e);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50672c = string;
        this.f50673d = parcel.readString();
        this.f50674e = parcel.readString();
    }
}
