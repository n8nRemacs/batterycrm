package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;

/* loaded from: classes8.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f382995b;

    /* renamed from: c, reason: collision with root package name */
    public final String f382996c;

    /* renamed from: d, reason: collision with root package name */
    public final String f382997d;

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
        this.f382995b = str;
        this.f382996c = str2;
        this.f382997d = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return pc1.a(this.f382996c, commentFrame.f382996c) && pc1.a(this.f382995b, commentFrame.f382995b) && pc1.a(this.f382997d, commentFrame.f382997d);
    }

    public final int hashCode() {
        String str = this.f382995b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f382996c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f382997d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": language=" + this.f382995b + ", description=" + this.f382996c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383002a);
        parcel.writeString(this.f382995b);
        parcel.writeString(this.f382997d);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f382995b = (String) pc1.a(parcel.readString());
        this.f382996c = (String) pc1.a(parcel.readString());
        this.f382997d = (String) pc1.a(parcel.readString());
    }
}
