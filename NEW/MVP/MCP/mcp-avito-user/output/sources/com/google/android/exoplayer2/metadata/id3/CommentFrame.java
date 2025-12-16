package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;

/* loaded from: classes6.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345686c;

    /* renamed from: d, reason: collision with root package name */
    public final String f345687d;

    /* renamed from: e, reason: collision with root package name */
    public final String f345688e;

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
        this.f345686c = str;
        this.f345687d = str2;
        this.f345688e = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return U.a(this.f345687d, commentFrame.f345687d) && U.a(this.f345686c, commentFrame.f345686c) && U.a(this.f345688e, commentFrame.f345688e);
    }

    public final int hashCode() {
        String str = this.f345686c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f345687d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f345688e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f345693b + ": language=" + this.f345686c + ", description=" + this.f345687d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345693b);
        parcel.writeString(this.f345686c);
        parcel.writeString(this.f345688e);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345686c = string;
        this.f345687d = parcel.readString();
        this.f345688e = parcel.readString();
    }
}
